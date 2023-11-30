package net.thep2wking.oedldoedlmusic.api;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
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

public class ModItemAnimeRecordBase extends ModItemRecordBase {
	public String origin;
	public static final String RECORD_GENERIC = "item." + OedldoedlMusic.MODID + ".music_disc_generic";

	public ModItemAnimeRecordBase(String name, SoundEvent sound, String origin) {
		super(OedldoedlMusic.MODID, "music_disc_" + name, OedldoedlMusic.TAB, sound, ModRarities.AQUA, false, 2, 1);
		this.origin = origin;
	}

	@Override
	public String getRecordNameLocal() {
		return I18n.format("item." + modid + "." + name + ".tip1");
	}

	@Override
	public String getItemStackDisplayName(ItemStack stack) {
		return I18n.format(RECORD_GENERIC + ".name") + " - " + origin;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if (ModTooltips.showAnnotationTip()) {
			for (int i = 1; i <= annotationLines; ++i) {
				tooltip.add(CoreConfig.TOOLTIPS.COLORS.INFORMATION_ANNOTATION_FORMATTING.getColor() + I18n.format(RECORD_GENERIC + ".annotation1") + " " + TextFormatting.YELLOW + I18n.format("item." + modid + "." + name + ".tip" + i));
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