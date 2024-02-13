package net.thep2wking.oedldoedlmusic.registry;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRecipeHelper;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;
import net.thep2wking.oedldoedlmusic.config.MusicConfig;
import net.thep2wking.oedldoedlmusic.init.ModBlocks;
import net.thep2wking.oedldoedlmusic.init.ModItems;

public class ModRecipes {
	public static void registerOreDict() {
		if (MusicConfig.RECIPES.DEFAULT_OREDICT) {
			ModLogger.registeredOreDictLogger(OedldoedlMusic.MODID);

			ModRecipeHelper.addOreDict("recordBlank", ModItems.BLANK_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.BLANK_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.ACTUALLY_I_AM_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.ANGEL_BEATS_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.ATTACK_ON_TITAN_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.ATTACK_ON_TITAN_2_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.ATTACK_ON_TITAN_3_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.ATTACK_ON_TITAN_4_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.ATTACK_ON_TITAN_5_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.ATTACK_ON_TITAN_6_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.ATTACK_ON_TITAN_7_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.ATTACK_ON_TITAN_8_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.BLACK_CLOVER_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.BLACK_CLOVER_2_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.BLACK_CLOVER_3_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.BLACK_CLOVER_4_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.BLACK_CLOVER_5_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.BLACK_CLOVER_6_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.BLACK_CLOVER_7_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.BLEND_S_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.CHIVALRY_OF_A_FAILED_KNIGHT_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.CHIVALRY_OF_A_FAILED_KNIGHT_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.CITRUS_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.CODE_GEASS_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.COMBATANTS_WILL_BE_DISPATCHED_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.DARLING_IN_THE_FRANXX_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.DATE_A_LIVE_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.DATE_A_LIVE_2_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.DATE_A_LIVE_3_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.DATE_A_LIVE_4_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.DATE_A_LIVE_5_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.DEATH_PARADE_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.DEATH_PARADE_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.DEMON_KING_DAIMAO_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.DEMON_KING_DAIMAO_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.DEMON_SLAYER_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.DEMON_SLAYER_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.DOMESTIC_GIRLFRIEND_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.DOMESTIC_GIRLFRIEND_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.DONT_TOY_WITH_ME_MISS_NAGATORO_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.DRAGON_CRISIS_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.EIGHTY_SIX_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.EROMANGA_SENSEI_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.FOOD_WARS_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.FOOD_WARS_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.FULL_DIVE_RPG_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.FULL_DIVE_RPG_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.GATE_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.GATE_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.GLEIPNIR_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.GIRLFRIEND_GIRLFRIEND_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.GRAND_BLUE_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.HIGHSCHOOL_DXD_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.HIGHSCHOOL_DXD_2_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.HIGHSCHOOL_DXD_3_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.HIGHSCHOOL_DXD_4_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.HIGHSCHOOL_DXD_5_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.HIGHSCHOOL_DXD_6_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.HIGHSCHOOL_DXD_7_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.HIGHSCHOOL_DXD_8_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.HIGHSCHOOL_DXD_9_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.HIGHSCHOOL_DXD_10_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.HIGURASHI_WHEN_THEY_CRY_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.HIGURASHI_WHEN_THEY_CRY_2_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.HIGURASHI_WHEN_THEY_CRY_3_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.HIGURASHI_WHEN_THEY_CRY_4_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.HORIMIYA_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.HOW_HEAVY_ARE_THE_DUMBBELLS_YOU_LIFT_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.HOW_HEAVY_ARE_THE_DUMBBELLS_YOU_LIFT_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.INFINIT_STRATOS_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.INFINIT_STRATOS_2_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.INFINIT_STRATOS_3_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.INTERSPECIES_REVIEWERS_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.JUJUTSU_KAISEN_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.JUJUTSU_KAISEN_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.KAGUYASAMA_LOVE_IS_WAR_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.KAGUYASAMA_LOVE_IS_WAR_2_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.KAGUYASAMA_LOVE_IS_WAR_3_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.KAKEGURUI_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.KOMI_CANT_COMMUNICATE_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.LOVE_AFTER_WORLD_DOMINATION_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.MIERUKOCHAN_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.MIERUKOCHAN_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.MIRAI_NIKKI_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.MISS_KOBAYASHIS_DRAGON_MAID_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.MISS_KOBAYASHIS_DRAGON_MAID_2_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.MISS_KOBAYASHIS_DRAGON_MAID_3_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.MISS_KOBAYASHIS_DRAGON_MAID_4_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.MOB_PSYCHO_100_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.MONOGATARI_SERIES_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.MOTHER_OF_THE_GODDESS_DORMITORY_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.MOTHER_OF_THE_GODDESS_DORMITORY_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.MUSHOKO_TENSEI_JOBLESS_REINCARNATION_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.MY_DRESS_UP_DARLING_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.NARUTO_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.NARUTO_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.NO_GAME_NO_LIFE_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.NORAGAMI_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.NORAGAMI_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.ORESHURA_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.OVERLORD_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.OVERLORD_2_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.OVERLORD_3_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.RASCAL_DOES_NOT_DREAM_OF_BUNNY_GIRL_SENPAI_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.RASCAL_DOES_NOT_DREAM_OF_BUNNY_GIRL_SENPAI_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.RENT_A_GIRLFRIEND_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.RENT_A_GIRLFRIEND_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.ROSARIO_AND_VAMPIRE_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.RUST_EATER_BISCO_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.SAGA_OF_TANYA_THE_EVIL_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.SAGA_OF_TANYA_THE_EVIL_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.SHIMONETA_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.SPY_X_FAMILY_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.SUPER_HXEROS_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.SWORD_ART_ONLINE_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.THE_ASTERIK_WAR_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.THE_ASTERIK_WAR_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.THE_HIDDEN_DUNGEON_I_CAN_ONLY_ENTER_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.THE_IDATEN_DEITIES_KNOW_ONLY_PEACE_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.THE_MISFIT_OF_DEMON_KING_ACADEMY_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.THE_PET_GIRL_OF_SAKURASOU_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.THE_PET_GIRL_OF_SAKURASOU_2_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.THE_PET_GIRL_OF_SAKURASOU_3_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.THE_PET_GIRL_OF_SAKURASOU_4_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.THE_QUINTESSENTIAL_QUINTUPLETS_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.THE_QUINTESSENTIAL_QUINTUPLETS_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.THE_RISING_OF_THE_SHIELD_HERO_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.THE_SEVEN_DEADLY_SINS_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.THE_SEVEN_DEADLY_SINS_2_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.THE_SEVEN_DEADLY_SINS_3_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.THE_SEVEN_DEADLY_SINS_4_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.THE_SEVEN_DEADLY_SINS_5_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.THE_TESTAMENT_OF_SISTER_NEW_DEVIL_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.THE_TESTAMENT_OF_SISTER_NEW_DEVIL_2_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.THE_TESTAMENT_OF_SISTER_NEW_DEVIL_3_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.THE_TESTAMENT_OF_SISTER_NEW_DEVIL_4_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.THE_WORLDS_FINEST_ASSASSIN_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.TOKYO_REVENGERS_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.TOKYO_REVENGERS_2_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.TOKYO_REVENGERS_3_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.TONIKAWA_OVER_THE_MOON_FOR_YOU_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.TONIKAWA_OVER_THE_MOON_FOR_YOU_2_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.TORADORA_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.UZAKICHAN_WANTS_TO_HANG_OUT_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.WHY_THE_HELL_ARE_YOU_HERE_TEACHER_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.YA_BOY_KONGMING_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.YOUR_LIE_IN_APRIL_1_MUSIC_DISC, 0);

			ModRecipeHelper.addOreDict("record", ModItems.ZOMBIELAND_SAGA_1_MUSIC_DISC, 0);
			ModRecipeHelper.addOreDict("record", ModItems.ZOMBIELAND_SAGA_2_MUSIC_DISC, 0);
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
			ModRecipeHelper.addShapedRecipe(OedldoedlMusic.MODID, "music_player_clear",
					new ItemStack(ModBlocks.MUSIC_PLAYER, 1, 0), "A", 'A', new ItemStack(ModBlocks.MUSIC_PLAYER, 1, 0));

			ModRecipeHelper.addShapedRecipe(OedldoedlMusic.MODID, "blank_music_disk",
					new ItemStack(ModItems.BLANK_MUSIC_DISC, 2, 0), "AAA", "ABA", "AAA", 'A', "gemCoal", 'B',
					"nuggetIron");
		}
	}
}