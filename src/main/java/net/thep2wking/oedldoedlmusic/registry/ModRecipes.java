package net.thep2wking.oedldoedlmusic.registry;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.ForgeRegistry;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRecipeHelper;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;
import net.thep2wking.oedldoedlmusic.api.ModItemAnimeRecordBase;
import net.thep2wking.oedldoedlmusic.config.MusicConfig;
import net.thep2wking.oedldoedlmusic.init.ModBlocks;
import net.thep2wking.oedldoedlmusic.init.ModItems;

public class ModRecipes {
	public static void registerOreDict() {
		if (MusicConfig.RECIPES.DEFAULT_OREDICT) {
			ModLogger.registeredOreDictLogger(OedldoedlMusic.MODID);

			ModRecipeHelper.addOreDict("recordBlank", ModItems.BLANK_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.BLANK_MUSIC_DISC, 0);

			registerOreDictForModMusicDics();

			if (MusicConfig.CONTENT.RECORD_PACKAGE_REGISTER_ALL_MUSIC_DICS_AS_DROPS) {
				registerOreDictForAllMusicDics();
			}
		}
	}

	public static void registerOreDictForAllMusicDics() {
		ForgeRegistry<Item> itemRegistry = (ForgeRegistry<Item>) ForgeRegistries.ITEMS;
		for (Item item : itemRegistry) {
			if (item instanceof ItemRecord) {
				OreDictionary.registerOre("record", new ItemStack(item));
			}
		}
	}

	public static void registerOreDictForModMusicDics() {
		ForgeRegistry<Item> itemRegistry = (ForgeRegistry<Item>) ForgeRegistries.ITEMS;
		for (Item item : itemRegistry) {
			if (item instanceof ModItemAnimeRecordBase) {
				OreDictionary.registerOre("record", new ItemStack(item));
			}
		}
	}

	public static void registerRecipes() {
		if (MusicConfig.RECIPES.DEFAULT_RECIPES) {
			ModLogger.registeredRecipesLogger(OedldoedlMusic.MODID);

			ModRecipeHelper.addShapedRecipe(OedldoedlMusic.MODID, "record_package",
					new ItemStack(ModBlocks.RECORD_PACKAGE, 1, 0), "AAA", "BCB", "AAA", 'A', "slabWood", 'B', "paper",
					'C', "recordBlank");

			ModRecipeHelper.addShapedRecipe(OedldoedlMusic.MODID, "music_player",
					new ItemStack(ModBlocks.MUSIC_PLAYER, 1, 0), "ABA", "CDC", "CCC", 'A', "ingotIron", 'B', "record",
					'C', new ItemStack(Blocks.CONCRETE, 1, 15), 'D', new ItemStack(Blocks.JUKEBOX, 1, 0));
			ModRecipeHelper.addShapelessRecipe(OedldoedlMusic.MODID, "music_player_clear",
					new ItemStack(ModBlocks.MUSIC_PLAYER, 1, 0), new ItemStack(ModBlocks.MUSIC_PLAYER, 1, 0));

			ModRecipeHelper.addShapedRecipe(OedldoedlMusic.MODID, "blank_music_disk",
					new ItemStack(ModItems.BLANK_MUSIC_DISC, 2, 0), "AAA", "ABA", "AAA", 'A', "gemCoal", 'B',
					"nuggetIron");
		}
	}
}