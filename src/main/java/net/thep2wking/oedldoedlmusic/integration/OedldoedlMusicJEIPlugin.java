package net.thep2wking.oedldoedlmusic.integration;

import java.io.IOException;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import net.thep2wking.oedldoedlcore.api.integration.ModJEIPluginBase;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;
import net.thep2wking.oedldoedlmusic.api.ModItemAnimeRecordBase;
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

		if (MusicConfig.INTEGRATION.JEI.HIDE_MUSIC_DISCS_WITHOUT_AUDIO_FILES) {
			ForgeRegistry<Item> itemRegistry = (ForgeRegistry<Item>) ForgeRegistries.ITEMS;
			for (Item item : itemRegistry) {
				if (item instanceof ModItemAnimeRecordBase) {
					if (!hasAudioFile(item)) {
						hideItem(registry, new ItemStack(item));
					}
				}
			}
		}

		if (MusicConfig.INTEGRATION.JEI.RECORD_PACKAGE_RECIPE_CATEGORY
				&& MusicConfig.CONTENT.RECORD_PACKAGE_RANDOM_DROPS) {
			addRecipeCatalyst(registry, new ItemStack(ModBlocks.RECORD_PACKAGE, 1, 0),
					RecordPackageDropsRecipeCategory.UID);
			addRecipes(registry, RecordPackageDropsRecipeWrapper.getDrops(), RecordPackageDropsRecipeCategory.UID);
		}
	}

	public boolean hasAudioFile(Item item) {
		ResourceLocation resourceLocation = new ResourceLocation(OedldoedlMusic.MODID,
				"sounds/music/" + item.getRegistryName().getResourcePath().replace("music_disc_", "") + ".ogg");
		IResourceManager resourceManager = Minecraft.getMinecraft().getResourceManager();
		try {
			IResource resource = resourceManager.getResource(resourceLocation);
			return resource != null;
		} catch (IOException e) {
			return false;
		}
	}
}