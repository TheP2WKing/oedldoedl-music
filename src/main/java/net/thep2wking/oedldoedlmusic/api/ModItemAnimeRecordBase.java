package net.thep2wking.oedldoedlmusic.api;

import java.io.IOException;
import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.api.sound.ModItemRecordBase;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlcore.util.ModRarities;
import net.thep2wking.oedldoedlcore.util.ModTooltips;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;
import net.thep2wking.oedldoedlmusic.config.MusicConfig;

public class ModItemAnimeRecordBase extends ModItemRecordBase {
	public final String origin;
	public static final String RECORD_GENERIC = "item." + OedldoedlMusic.MODID + ".music_disc_generic";

	public ModItemAnimeRecordBase(String name, SoundEvent sound, String origin) {
		super(OedldoedlMusic.MODID, "music_disc_" + name, OedldoedlMusic.TAB, sound, ModRarities.AQUA, false, 2, 1);
		this.origin = origin;
		this.setMaxStackSize(MusicConfig.PROPERTIES.STACKABLE_MUSIC_DISCS ? 64 : 1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getRecordNameLocal() {
		return I18n.format("item." + modid + "." + name + ".tip1");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getItemStackDisplayName(ItemStack stack) {
		return I18n.format(RECORD_GENERIC + ".name") + " - " + origin;
	}

	@SideOnly(Side.CLIENT)
	public boolean hasAudioFile() {
		ResourceLocation resourceLocation = new ResourceLocation(OedldoedlMusic.MODID,
				"sounds/music/" + this.getRegistryName().getResourcePath().replace("music_disc_", "") + ".ogg");
		IResourceManager resourceManager = Minecraft.getMinecraft().getResourceManager();
		try {
			IResource resource = resourceManager.getResource(resourceLocation);
			return resource != null;
		} catch (IOException e) {
			return false;
		}
	}

	// @Override
	// @SideOnly(Side.CLIENT)
	// public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
	// if (this.isInCreativeTab(tab) && this.hasAudioFile()) {
	// items.add(new ItemStack(this));
	// }
	// }

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (ModTooltips.showAnnotationTip()) {
			for (int i = 1; i <= annotationLines; ++i) {
				tooltip.add(CoreConfig.TOOLTIPS.COLORS.INFORMATION_ANNOTATION_FORMATTING.getColor()
						+ I18n.format(RECORD_GENERIC + ".annotation1") + " "
						+ (hasAudioFile() ? TextFormatting.YELLOW : TextFormatting.RED)
						+ I18n.format("item." + modid + "." + name + ".tip" + i)
						+ (!hasAudioFile() ? (TextFormatting.ITALIC + " " + I18n.format(RECORD_GENERIC + ".annotation2")) : ""));
			}
		}
		if (ModTooltips.showInfoTip()) {
			for (int i = 1; i <= tooltipLines; ++i) {
				ModTooltips.addInformation(tooltip, RECORD_GENERIC, i);
			}
		} else if (ModTooltips.showInfoTipKey() && !(tooltipLines == 0)) {
			ModTooltips.addKey(tooltip, ModTooltips.KEY_INFO);
		}
	}
}