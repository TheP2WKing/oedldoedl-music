package net.thep2wking.oedldoedlmusic.content.block;

import javax.annotation.Nullable;

import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.thep2wking.oedldoedlcore.api.block.ModBlockHorizontalBase;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlcore.integration.top.ITOPInfoProvider;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;
import net.thep2wking.oedldoedlmusic.config.MusicConfig;
import net.thep2wking.oedldoedlmusic.util.ModGuiHandler;

public class BlockMusicPlayer extends ModBlockHorizontalBase implements ITileEntityProvider, ITOPInfoProvider {
	public BlockMusicPlayer(String modid, String name, CreativeTabs tab, Material material, SoundType sound,
			MapColor mapColor, int harvestLevel, ModToolTypes toolType, float hardness, float resistance,
			int lightLevel) {
		super(modid, name, tab, material, sound, mapColor, harvestLevel, toolType, hardness, resistance, lightLevel);
		this.setDefaultState(getDefaultState().withProperty(FACING, EnumFacing.NORTH));
		GameRegistry.registerTileEntity(TileMusicPlayer.class, this.getRegistryName());
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState blockstate) {
		world.playEvent(1010, pos, 0);
		world.playRecord(pos, (SoundEvent) null);
		super.breakBlock(world, pos, blockstate);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			playerIn.openGui(OedldoedlMusic.INSTANCE, ModGuiHandler.GUI_MUSIC_PLAYER_ID, worldIn, pos.getX(),
					pos.getY(), pos.getZ());
		}
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileMusicPlayer();
	}

	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}

	@Override
	public void getDrops(NonNullList<ItemStack> result, IBlockAccess world, BlockPos pos, IBlockState metadata,
			int fortune) {
		TileEntity tileEntity = world.getTileEntity(pos);
		if (tileEntity instanceof TileMusicPlayer) {
			ItemStack stack = new ItemStack(Item.getItemFromBlock(this));
			NBTTagCompound tagCompound = new NBTTagCompound();
			((TileMusicPlayer) tileEntity).writeToNBT(tagCompound);
			stack.setTagCompound(tagCompound);
			result.add(stack);
		} else {
			super.getDrops(result, world, pos, metadata, fortune);
		}
	}

	@Override
	public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player,
			boolean willHarvest) {
		if (willHarvest) {
			return true;
		}
		return super.removedByPlayer(state, world, pos, player, willHarvest);
	}

	@Override
	public void harvestBlock(World world, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te,
			ItemStack stack) {
		super.harvestBlock(world, player, pos, state, te, stack);
		world.setBlockToAir(pos);
	}

	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer,
			ItemStack stack) {
		super.onBlockPlacedBy(world, pos, state, placer, stack);
		TileEntity tileEntity = world.getTileEntity(pos);
		if (tileEntity instanceof TileMusicPlayer) {
			NBTTagCompound tagCompound = stack.getTagCompound();
			if (tagCompound != null) {
				((TileMusicPlayer) tileEntity).readRestorableFromNBT(tagCompound);
			}
		}
	}

	@Override
	public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world,
			IBlockState blockState, IProbeHitData data) {
		TileMusicPlayer tile = (TileMusicPlayer) world.getTileEntity(data.getPos());
		if (tile == null)
			return;

		if (MusicConfig.INTEGRATION.TOP.MUSIC_PLAYER_CURRENT_STATUS) {
			if (tile.isCurrentlyPlaying()) {
				probeInfo.text(CoreConfig.TOOLTIPS.COLORS.INFORMATION_ANNOTATION_FORMATTING.getColor() + "{*gui."
						+ OedldoedlMusic.MODID + ".music_player.artist*}" + TextFormatting.YELLOW + " "
						+ tile.getCurrentPlayingArtist());
				probeInfo.text(CoreConfig.TOOLTIPS.COLORS.INFORMATION_ANNOTATION_FORMATTING.getColor() + "{*gui."
						+ OedldoedlMusic.MODID + ".music_player.song*}" + TextFormatting.YELLOW + " "
						+ tile.getCurrentPlayingSong());
			} else {
				probeInfo.text(TextFormatting.YELLOW + "{*gui." + OedldoedlMusic.MODID + ".music_player.paused*}");
			}
		}
	}
}