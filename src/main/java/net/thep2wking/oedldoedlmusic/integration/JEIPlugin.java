package net.thep2wking.oedldoedlmusic.integration;

import java.util.ArrayList;
import java.util.List;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;
import net.thep2wking.oedldoedlmusic.config.MusicConfig;
import net.thep2wking.oedldoedlmusic.init.ModBlocks;

@mezz.jei.api.JEIPlugin
public class JEIPlugin implements IModPlugin {
	@Override
	public void register(IModRegistry registry) {
		if (Loader.isModLoaded("jei")) {
			ModLogger.registeredIntegration("JEI", OedldoedlMusic.MODID);
		}

		if (MusicConfig.INTEGRATION.JEI.RECORD_PACKAGE_RECIPE_CATEGORY
				&& MusicConfig.CONTENT.RECORD_PACKAGE_RANDOM_DROPS) {
			List<RecordPackageDropsRecipeWrapper> bauble = new ArrayList<>();
			for (ItemStack output : OreDictionary.getOres("record")) {
				bauble.add(new RecordPackageDropsRecipeWrapper(output));
				registry.addRecipes(bauble, RecordPackageDropsRecipeCategory.UID);
				bauble.clear();
			}

			registry.addRecipeCatalyst(new ItemStack(ModBlocks.RECORD_PACKAGE, 1, 0),
					RecordPackageDropsRecipeCategory.UID);
		}
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) {
		if (MusicConfig.INTEGRATION.JEI.RECORD_PACKAGE_RECIPE_CATEGORY
				&& MusicConfig.CONTENT.RECORD_PACKAGE_RANDOM_DROPS) {
			registry.addRecipeCategories(new RecordPackageDropsRecipeCategory(registry.getJeiHelpers().getGuiHelper()));
		}
	}
}