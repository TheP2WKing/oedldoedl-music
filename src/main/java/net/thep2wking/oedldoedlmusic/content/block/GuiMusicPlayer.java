package net.thep2wking.oedldoedlmusic.content.block;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;
import net.thep2wking.oedldoedlmusic.util.network.ModPacketHandler;
import net.thep2wking.oedldoedlmusic.util.network.PacketSendNext;
import net.thep2wking.oedldoedlmusic.util.network.PacketSendPause;
import net.thep2wking.oedldoedlmusic.util.network.PacketSendPrevious;

public class GuiMusicPlayer extends GuiContainer {
	private final TileMusicPlayer te;

	private GuiButton pause;
	private GuiButton play;
	private GuiButton next;
	private GuiButton previous;

	public GuiMusicPlayer(IInventory playerInv, TileMusicPlayer te) {
		super(new ContainerMusicPlayer(playerInv, te));
		this.te = te;
		xSize = 176;
		ySize = 184;
	}

	@Override
	public void initGui() {
		super.initGui();
		buttonList.clear();
		pause = this.addButton(new GuiButton(0, guiLeft + 147, guiTop + 21, 20, 20,
				I18n.format("gui." + OedldoedlMusic.MODID + ".music_player.pause")));
		next = this.addButton(new GuiButton(1, guiLeft + 147, guiTop + 47, 20, 20,
				I18n.format("gui." + OedldoedlMusic.MODID + ".music_player.next")));
		previous = this.addButton(new GuiButton(2, guiLeft + 121, guiTop + 47, 20, 20,
				I18n.format("gui." + OedldoedlMusic.MODID + ".music_player.previous")));
		play = this.addButton(new GuiButton(3, guiLeft + 121, guiTop + 21, 20, 20,
				I18n.format("gui." + OedldoedlMusic.MODID + ".music_player.play")));
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
		renderHoveredToolTip(mouseX, mouseY);

		if (play.isMouseOver()) {
			List<String> tooltip = new ArrayList<>();
			tooltip.add(I18n.format("tooltip.oedldoedlmusic.music_player.play"));
			drawHoveringText(tooltip, mouseX, mouseY);
		}

		if (pause.isMouseOver()) {
			List<String> tooltip = new ArrayList<>();
			tooltip.add(I18n.format("tooltip.oedldoedlmusic.music_player.pause"));
			drawHoveringText(tooltip, mouseX, mouseY);
		}

		if (next.isMouseOver()) {
			List<String> tooltip = new ArrayList<>();
			tooltip.add(I18n.format("tooltip.oedldoedlmusic.music_player.next"));
			drawHoveringText(tooltip, mouseX, mouseY);
		}

		if (previous.isMouseOver()) {
			List<String> tooltip = new ArrayList<>();
			tooltip.add(I18n.format("tooltip.oedldoedlmusic.music_player.previous"));
			drawHoveringText(tooltip, mouseX, mouseY);
		}
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		mc.getTextureManager().bindTexture(new ResourceLocation(OedldoedlMusic.MODID, "textures/gui/music_player.png"));
		this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}

	@Override
	public void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = te.getDisplayName().getUnformattedText();
		ItemStack recordStack = te.getStackInSlot(te.currentlyPlaying);
		int indent = 10;
		fontRenderer.drawString(s, 88 - fontRenderer.getStringWidth(s) / 2, 6, 4210752);
		int maxWidth = 120;
		if (te.currentlyPlaying != -1 && recordStack.getItem() instanceof ItemRecord) {
			String defaultName = ((ItemRecord) te.getStackInSlot(te.currentlyPlaying).getItem())
					.getRecordNameLocal();
			String[] parts = defaultName.split(" - ", 2);
			String artist = parts.length > 0 ? truncateString(parts[0], maxWidth) : "";
			String song = parts.length > 1 ? truncateString(parts[1], maxWidth) : "";

			fontRenderer.drawString(
					I18n.format("gui." + OedldoedlMusic.MODID + ".music_player.artist") + " " + artist,
					indent, 77, 0xffffff);
			fontRenderer.drawString(I18n.format("gui." + OedldoedlMusic.MODID + ".music_player.song") + " " + song,
					indent, 88, 0xffffff);
		} else {
			fontRenderer.drawString(I18n.format("gui." + OedldoedlMusic.MODID + ".music_player.paused"), indent, 77,
					0xFFFF55);
		}
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		mc.getTextureManager().bindTexture(new ResourceLocation(OedldoedlMusic.MODID, "textures/gui/music_player.png"));
		int index = te.selectedTrack;
		int x, y;
		x = index % 6;
		y = index / 6;
		this.drawTexturedModalRect(6 + x * 18, 16 + y * 18, 236, 0, 20, 20);
	}

	private String truncateString(String str, int maxWidth) {
		int stringWidth = fontRenderer.getStringWidth(str);
		if (stringWidth <= maxWidth) {
			return str;
		}
		String truncated = "";
		for (int i = 0; i < str.length(); i++) {
			truncated += str.charAt(i);
			if (fontRenderer.getStringWidth(truncated + "...") > maxWidth) {
				return truncated.substring(0, truncated.length() - 1) + "...";
			}
		}
		return truncated;
	}

	@Override
	public void actionPerformed(GuiButton button) throws IOException {
		if (button.enabled) {
			switch (button.id) {
				case 0:
					ModPacketHandler.INSTANCE.sendToServer(new PacketSendPause(te.getPos(), true));
					break;

				case 1:
					ModPacketHandler.INSTANCE.sendToServer(new PacketSendNext(te.getPos()));
					break;

				case 2:
					ModPacketHandler.INSTANCE.sendToServer(new PacketSendPrevious(te.getPos()));
					break;

				case 3:
					ModPacketHandler.INSTANCE.sendToServer(new PacketSendPause(te.getPos(), false));
					break;
			}
		}
	}
}