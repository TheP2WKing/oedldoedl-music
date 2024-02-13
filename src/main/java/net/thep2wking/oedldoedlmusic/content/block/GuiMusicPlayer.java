package net.thep2wking.oedldoedlmusic.content.block;

import java.io.IOException;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;
import net.thep2wking.oedldoedlmusic.util.network.ModPacketHandler;
import net.thep2wking.oedldoedlmusic.util.network.PacketSendNext;
import net.thep2wking.oedldoedlmusic.util.network.PacketSendPause;
import net.thep2wking.oedldoedlmusic.util.network.PacketSendPrevious;

public class GuiMusicPlayer extends GuiContainer {
	private final IInventory playerInv;
	private final TileMusicPlayer te;

	GuiButton pause;
	GuiButton play;
	GuiButton next;
	GuiButton previous;

	public GuiMusicPlayer(IInventory playerInv, TileMusicPlayer te) {
		super(new ContainerMusicPlayer(playerInv, te));
		this.playerInv = playerInv;
		this.te = te;
		xSize = 176;
		ySize = 166;
	}

	@Override
	public void initGui() {
		super.initGui();
		buttonList.clear();
		pause = this.addButton(new GuiButton(0, guiLeft + 145, guiTop + 15, 20, 20,
				I18n.format("gui." + OedldoedlMusic.MODID + ".music_player.pause")));
		play = this.addButton(new GuiButton(3, guiLeft + 120, guiTop + 15, 20, 20,
				I18n.format("gui." + OedldoedlMusic.MODID + ".music_player.play")));
		next = this.addButton(new GuiButton(1, guiLeft + 145, guiTop + 40, 20, 20,
				I18n.format("gui." + OedldoedlMusic.MODID + ".music_player.next")));
		previous = this.addButton(new GuiButton(2, guiLeft + 120, guiTop + 40, 20, 20,
				I18n.format("gui." + OedldoedlMusic.MODID + ".music_player.previous")));
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
		renderHoveredToolTip(mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		mc.getTextureManager().bindTexture(new ResourceLocation(OedldoedlMusic.MODID, "textures/gui/music_player.png"));
		this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = te.getDisplayName().getUnformattedText();
		fontRenderer.drawString(s, 88 - fontRenderer.getStringWidth(s) / 2, 6, 4210752);
		if (te.currentlyPlaying != -1) {
			fontRenderer.drawString(
					((ItemRecord) te.getStackInSlot(te.currentlyPlaying).getItem()).getRecordNameLocal(), 8, 62,
					4210752);
		} else
			fontRenderer.drawString(I18n.format("gui." + OedldoedlMusic.MODID + ".music_player.paused"), 8, 62, 4210752);
		fontRenderer.drawString(playerInv.getDisplayName().getUnformattedText(), 8, 72, 4210752);
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		mc.getTextureManager().bindTexture(new ResourceLocation(OedldoedlMusic.MODID, "textures/gui/music_player.png"));
		int index = te.selectedTrack;
		int x, y;
		x = index % 6;
		y = index / 6;
		this.drawTexturedModalRect(6 + x * 18, 22 + y * 18, 236, 0, 20, 20);
	}

	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
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