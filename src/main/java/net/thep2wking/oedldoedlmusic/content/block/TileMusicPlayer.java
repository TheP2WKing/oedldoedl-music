package net.thep2wking.oedldoedlmusic.content.block;

import javax.annotation.Nullable;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;

public class TileMusicPlayer extends TileEntity implements IInventory, ITickable {
	private NonNullList<ItemStack> contents = NonNullList.<ItemStack>withSize(getSizeInventory(), ItemStack.EMPTY);
	private String customName;
	public int selectedTrack = 0;
	public int currentlyPlaying = -1;

	@Override
	public void clear() {
	}

	@Override
	public void closeInventory(EntityPlayer player) {
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
		ItemStack itemstack = ItemStackHelper.getAndSplit(contents, index, count);
		if (!itemstack.isEmpty()) {
			markDirty();
		}
		return itemstack;
	}

	@Override
	public ITextComponent getDisplayName() {
		return hasCustomName() ? new TextComponentString(getName()) : new TextComponentTranslation(getName());
	}

	@Override
	public int getField(int id) {
		switch (id) {
			case 0:
				return selectedTrack;

			case 1:
				return currentlyPlaying;

			default:
				return 0;
		}
	}

	@Override
	public int getFieldCount() {
		return 2;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public String getName() {
		return hasCustomName() ? customName : "container." + OedldoedlMusic.MODID + ".music_player.name";
	}

	@Override
	public int getSizeInventory() {
		return 6 * 3;
	}

	@Override
	public ItemStack getStackInSlot(int index) {
		if (index >= 0 && index < contents.size()) {
			return contents.get(index);
		}
		return ItemStack.EMPTY;
	}

	@Override
	public boolean hasCustomName() {
		return customName != null && !customName.isEmpty();
	}

	@Override
	public boolean isEmpty() {
		for (ItemStack itemstack : contents) {
			if (!itemstack.isEmpty()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		if (stack.getItem() instanceof ItemRecord) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isUsableByPlayer(EntityPlayer player) {
		if (world.getTileEntity(pos) != this) {
			return false;
		} else {
			return player.getDistanceSq(pos.getX() + 0.5D, pos.getY() + 0.5D, pos.getZ() + 0.5D) <= 64.0D;
		}
	}

	public void nextSong() {
		if (isEmpty()) {
			return;
		}
		selectedTrack++;
		if (selectedTrack >= getSizeInventory()) {
			selectedTrack = 0;
		}
		while (contents.get(selectedTrack).isEmpty() || contents.get(selectedTrack) == null) {
			selectedTrack++;
			if (selectedTrack >= getSizeInventory()) {
				selectedTrack = 0;
			}
		}
	}

	@Override
	public void openInventory(EntityPlayer player) {
	}

	public void previousSong() {
		if (isEmpty()) {
			return;
		}
		selectedTrack--;
		if (selectedTrack <= -1) {
			selectedTrack = (getSizeInventory() - 1);
		}
		while (contents.get(selectedTrack).isEmpty() || contents.get(selectedTrack) == null) {
			selectedTrack--;
			if (selectedTrack <= -1) {
				selectedTrack = (getSizeInventory() - 1);
			}
		}
	}

	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		contents = NonNullList.<ItemStack>withSize(getSizeInventory(), ItemStack.EMPTY);
		ItemStackHelper.loadAllItems(compound, contents);
		if (compound.hasKey("CustomName", 8)) {
			customName = compound.getString("CustomName");
		}
		selectedTrack = compound.getInteger("Track");
	}

	public void readRestorableFromNBT(NBTTagCompound compound) {
		contents = NonNullList.<ItemStack>withSize(getSizeInventory(), ItemStack.EMPTY);
		ItemStackHelper.loadAllItems(compound, contents);
		customName = compound.getString("CustomName");
		selectedTrack = compound.getInteger("Track");
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		ItemStackHelper.saveAllItems(compound, contents);
		if (hasCustomName()) {
			compound.setString("CustomName", customName);
		}
		compound.setInteger("Track", selectedTrack);
		return compound;
	}

	public void writeRestorableToNBT(NBTTagCompound compound) {
		ItemStackHelper.saveAllItems(compound, contents);
		compound.setString("CustomName", customName);
		compound.setInteger("Track", selectedTrack);
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		return ItemStackHelper.getAndRemove(contents, index);
	}

	public void setCustomName(String name) {
		customName = name;
	}

	@Override
	public void setField(int id, int value) {
		switch (id) {
			case 0:
				selectedTrack = value;
				break;

			case 1:
				currentlyPlaying = value;
				break;
		}
	}

	@Override
	public void setInventorySlotContents(int index, @Nullable ItemStack stack) {
		contents.set(index, stack);
		if (stack != null && stack.getCount() > getInventoryStackLimit()) {
			stack.setCount(getInventoryStackLimit());
		}
		if (index == currentlyPlaying && (stack == null || stack.isEmpty())) {
			togglePause(true);
		}
		markDirty();
	}

	public void togglePause(boolean shouldStopSong) {
		world.playEvent(1010, pos, 0);
		world.playRecord(pos, null);
		currentlyPlaying = -1;
		if (!shouldStopSong && selectedTrack >= 0 && selectedTrack < contents.size()) {
			ItemStack selectedStack = contents.get(selectedTrack);
			if (selectedStack != null && !selectedStack.isEmpty()) {
				world.playEvent(null, 1010, pos, Item.getIdFromItem(selectedStack.getItem()));
				currentlyPlaying = selectedTrack;
			}
		}
	}
	
    @Override
    public void update() {
        if (currentlyPlaying != -1) {
            if (currentlyPlaying >= contents.size() || contents.get(currentlyPlaying).isEmpty()) {
				togglePause(true);
            }
        }
    }

	public boolean isCurrentlyPlaying() {
		return currentlyPlaying != -1;
	}

	@SideOnly(Side.CLIENT)
	public String getCurrentPlayingSing() {
		if (currentlyPlaying != -1) {
			String defaultName = ((ItemRecord) contents.get(currentlyPlaying).getItem()).getRecordNameLocal();
			String[] parts = defaultName.split(" - ", 2);
			String artist = parts.length > 0 ? parts[0] : "";
			String song = parts.length > 1 ? parts[1] : "";
			return artist + " - " + song;
		} else {
			return new TextComponentTranslation("gui." + OedldoedlMusic.MODID + ".music_player.paused").getFormattedText();
		}
	}

	public String getCurrentPlayingArtist() {
		if (currentlyPlaying != -1) {
			String defaultName = ((ItemRecord) contents.get(currentlyPlaying).getItem()).getRecordNameLocal();
			String[] parts = defaultName.split(" - ", 2);
			String artist = parts.length > 0 ? parts[0] : "";
			return artist;
		} else {
			return "";
		}
	}

	public String getCurrentPlayingSong() {
		if (currentlyPlaying != -1) {
			String defaultName = ((ItemRecord) contents.get(currentlyPlaying).getItem()).getRecordNameLocal();
			String[] parts = defaultName.split(" - ", 2);
			String song = parts.length > 1 ? parts[1] : "";
			return song;
		} else {
			return "";
		}
	}
}