package net.thep2wking.oedldoedlmusic.integration;

import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.item.ItemStack;
import net.thep2wking.oedldoedlcore.api.integration.ModJEIPluginBase;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;
import net.thep2wking.oedldoedlmusic.config.MusicConfig;
import net.thep2wking.oedldoedlmusic.init.ModBlocks;

@JEIPlugin
public class OedldoedlMusicJEIPlugin extends ModJEIPluginBase {
	@Override
	public String getModId() {
		return OedldoedlMusic.MODID;
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) {
		if (MusicConfig.INTEGRATION.JEI.RECORD_PACKAGE_RECIPE_CATEGORY
				&& MusicConfig.CONTENT.RECORD_PACKAGE_RANDOM_DROPS) {
			addRecipeCategory(registry, new RecordPackageDropsRecipeCategory(getGuiHelper(registry)));
		}
	}

	@Override
	public void register(IModRegistry registry) {
		super.register(registry);

		if (MusicConfig.INTEGRATION.JEI.RECORD_PACKAGE_RECIPE_CATEGORY
				&& MusicConfig.CONTENT.RECORD_PACKAGE_RANDOM_DROPS) {
			addRecipeCatalyst(registry, new ItemStack(ModBlocks.RECORD_PACKAGE, 1, 0),
					RecordPackageDropsRecipeCategory.UID);
			addRecipes(registry, RecordPackageDropsRecipeWrapper.getDrops(), RecordPackageDropsRecipeCategory.UID);
		}
	}
}