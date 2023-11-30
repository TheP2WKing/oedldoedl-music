package net.thep2wking.oedldoedlmusic.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.thep2wking.oedldoedlmusic.content.block.ContainerMusicPlayer;
import net.thep2wking.oedldoedlmusic.content.block.GuiMusicPlayer;
import net.thep2wking.oedldoedlmusic.content.block.TileMusicPlayer;

public class ModGuiHandler implements IGuiHandler {
	public static final int GUI_MUSIC_PLAYER_ID = 0;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == GUI_MUSIC_PLAYER_ID) {
			return new ContainerMusicPlayer(player.inventory,
					(TileMusicPlayer) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == GUI_MUSIC_PLAYER_ID) {
			return new GuiMusicPlayer(player.inventory, (TileMusicPlayer) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}
}