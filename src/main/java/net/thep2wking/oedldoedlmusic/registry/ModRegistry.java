package net.thep2wking.oedldoedlmusic.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRegistryHelper;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;
import net.thep2wking.oedldoedlmusic.init.ModBlocks;
import net.thep2wking.oedldoedlmusic.init.ModItems;
import net.thep2wking.oedldoedlmusic.init.ModSounds;
import net.thep2wking.oedldoedlmusic.util.ModMusicDiscRegistryHelper;

@Mod.EventBusSubscriber
public class ModRegistry {
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		ModLogger.registeredBlocksLogger(OedldoedlMusic.MODID);
		
		ModRegistryHelper.registerBlock(event, ModBlocks.RECORD_PACKAGE);

		ModRegistryHelper.registerBlock(event, ModBlocks.MUSIC_PLAYER);
	}

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		ModLogger.registeredItemsLogger(OedldoedlMusic.MODID);

		ModRegistryHelper.registerItemBlock(event, ModItems.RECORD_PACKAGE);

		ModRegistryHelper.registerItemBlock(event, ModItems.MUSIC_PLAYER);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.ACTUALLY_I_AM_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.ANGEL_BEATS_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.ATTACK_ON_TITAN_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.ATTACK_ON_TITAN_2_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.ATTACK_ON_TITAN_3_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.ATTACK_ON_TITAN_4_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.ATTACK_ON_TITAN_5_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.ATTACK_ON_TITAN_6_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.ATTACK_ON_TITAN_7_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.ATTACK_ON_TITAN_8_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.BLACK_CLOVER_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.BLACK_CLOVER_2_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.BLACK_CLOVER_3_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.BLACK_CLOVER_4_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.BLACK_CLOVER_5_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.BLACK_CLOVER_6_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.BLACK_CLOVER_7_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.BLEND_S_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.CHIVALRY_OF_A_FAILED_KNIGHT_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.CHIVALRY_OF_A_FAILED_KNIGHT_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.CITRUS_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.CODE_GEASS_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.COMBATANTS_WILL_BE_DISPATCHED_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.DARLING_IN_THE_FRANXX_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.DATE_A_LIVE_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.DATE_A_LIVE_2_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.DATE_A_LIVE_3_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.DATE_A_LIVE_4_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.DATE_A_LIVE_5_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.DEATH_PARADE_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.DEATH_PARADE_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.DEMON_KING_DAIMAO_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.DEMON_KING_DAIMAO_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.DEMON_SLAYER_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.DEMON_SLAYER_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.DOMESTIC_GIRLFRIEND_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.DOMESTIC_GIRLFRIEND_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.DONT_TOY_WITH_ME_MISS_NAGATORO_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.DRAGON_CRISIS_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.EIGHTY_SIX_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.EROMANGA_SENSEI_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.FOOD_WARS_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.FOOD_WARS_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.FULL_DIVE_RPG_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.FULL_DIVE_RPG_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.GATE_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.GATE_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.GLEIPNIR_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.GIRLFRIEND_GIRLFRIEND_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.GRAND_BLUE_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HIGHSCHOOL_DXD_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HIGHSCHOOL_DXD_2_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HIGHSCHOOL_DXD_3_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HIGHSCHOOL_DXD_4_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HIGHSCHOOL_DXD_5_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HIGHSCHOOL_DXD_6_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HIGHSCHOOL_DXD_7_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HIGHSCHOOL_DXD_8_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HIGHSCHOOL_DXD_9_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HIGHSCHOOL_DXD_10_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HIGURASHI_WHEN_THEY_CRY_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HIGURASHI_WHEN_THEY_CRY_2_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HIGURASHI_WHEN_THEY_CRY_3_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HIGURASHI_WHEN_THEY_CRY_4_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HORIMIYA_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HOW_HEAVY_ARE_THE_DUMBBELLS_YOU_LIFT_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.HOW_HEAVY_ARE_THE_DUMBBELLS_YOU_LIFT_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.INFINIT_STRATOS_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.INFINIT_STRATOS_2_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.INFINIT_STRATOS_3_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.INTERSPECIES_REVIEWERS_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.JUJUTSU_KAISEN_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.JUJUTSU_KAISEN_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.KAGUYASAMA_LOVE_IS_WAR_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.KAGUYASAMA_LOVE_IS_WAR_2_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.KAGUYASAMA_LOVE_IS_WAR_3_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.KAKEGURUI_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.KOMI_CANT_COMMUNICATE_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.LOVE_AFTER_WORLD_DOMINATION_1_MUSIC_DISC);
	
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.MIERUKOCHAN_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.MIERUKOCHAN_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.MIRAI_NIKKI_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.MISS_KOBAYASHIS_DRAGON_MAID_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.MISS_KOBAYASHIS_DRAGON_MAID_2_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.MISS_KOBAYASHIS_DRAGON_MAID_3_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.MISS_KOBAYASHIS_DRAGON_MAID_4_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.MOB_PSYCHO_100_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.MONOGATARI_SERIES_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.MOTHER_OF_THE_GODDESS_DORMITORY_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.MOTHER_OF_THE_GODDESS_DORMITORY_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.MUSHOKO_TENSEI_JOBLESS_REINCARNATION_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.MY_DRESS_UP_DARLING_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.NARUTO_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.NARUTO_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.NO_GAME_NO_LIFE_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.NORAGAMI_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.NORAGAMI_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.ORESHURA_1_MUSIC_DISC);
	
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.OVERLORD_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.OVERLORD_2_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.OVERLORD_3_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.RASCAL_DOES_NOT_DREAM_OF_BUNNY_GIRL_SENPAI_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.RASCAL_DOES_NOT_DREAM_OF_BUNNY_GIRL_SENPAI_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.RENT_A_GIRLFRIEND_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.RENT_A_GIRLFRIEND_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.ROSARIO_AND_VAMPIRE_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.RUST_EATER_BISCO_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.SAGA_OF_TANYA_THE_EVIL_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.SAGA_OF_TANYA_THE_EVIL_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.SHIMONETA_1_MUSIC_DISC);
	
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.SPY_X_FAMILY_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.SUPER_HXEROS_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.SWORD_ART_ONLINE_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_ASTERIK_WAR_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_ASTERIK_WAR_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_HIDDEN_DUNGEON_I_CAN_ONLY_ENTER_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_IDATEN_DEITIES_KNOW_ONLY_PEACE_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_MISFIT_OF_DEMON_KING_ACADEMY_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_PET_GIRL_OF_SAKURASOU_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_PET_GIRL_OF_SAKURASOU_2_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_PET_GIRL_OF_SAKURASOU_3_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_PET_GIRL_OF_SAKURASOU_4_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_QUINTESSENTIAL_QUINTUPLETS_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_QUINTESSENTIAL_QUINTUPLETS_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_RISING_OF_THE_SHIELD_HERO_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_SEVEN_DEADLY_SINS_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_SEVEN_DEADLY_SINS_2_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_SEVEN_DEADLY_SINS_3_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_SEVEN_DEADLY_SINS_4_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_SEVEN_DEADLY_SINS_5_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_TESTAMENT_OF_SISTER_NEW_DEVIL_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_TESTAMENT_OF_SISTER_NEW_DEVIL_2_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_TESTAMENT_OF_SISTER_NEW_DEVIL_3_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_TESTAMENT_OF_SISTER_NEW_DEVIL_4_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.THE_WORLDS_FINEST_ASSASSIN_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.TOKYO_REVENGERS_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.TOKYO_REVENGERS_2_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.TOKYO_REVENGERS_3_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.TONIKAWA_OVER_THE_MOON_FOR_YOU_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.TONIKAWA_OVER_THE_MOON_FOR_YOU_2_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.TORADORA_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.UZAKICHAN_WANTS_TO_HANG_OUT_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.WHY_THE_HELL_ARE_YOU_HERE_TEACHER_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.YA_BOY_KONGMING_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.YOUR_LIE_IN_APRIL_1_MUSIC_DISC);

		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.ZOMBIELAND_SAGA_1_MUSIC_DISC);
		ModMusicDiscRegistryHelper.registerAnimeRecordItem(event, ModItems.ZOMBIELAND_SAGA_2_MUSIC_DISC);

		ModRegistryHelper.registerItem(event, ModItems.BLANK_MUSIC_DISC);
	}

	@SubscribeEvent
	public static void onSoundEventRegister(RegistryEvent.Register<SoundEvent> event) {
		ModLogger.registeredSoundEventsLogger(OedldoedlMusic.MODID);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.ACTUALLY_I_AM_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.ANGEL_BEATS_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.ATTACK_ON_TITAN_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ATTACK_ON_TITAN_2);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ATTACK_ON_TITAN_3);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ATTACK_ON_TITAN_4);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ATTACK_ON_TITAN_5);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ATTACK_ON_TITAN_6);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ATTACK_ON_TITAN_7);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ATTACK_ON_TITAN_8);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.BLACK_CLOVER_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.BLACK_CLOVER_2);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.BLACK_CLOVER_3);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.BLACK_CLOVER_4);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.BLACK_CLOVER_5);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.BLACK_CLOVER_6);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.BLACK_CLOVER_7);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.BLEND_S_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.CHIVALRY_OF_A_FAILED_KNIGHT_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.CHIVALRY_OF_A_FAILED_KNIGHT_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.CITRUS_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.CODE_GEASS_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.COMBATANTS_WILL_BE_DISPATCHED_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.DARLING_IN_THE_FRANXX_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.DATE_A_LIVE_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DATE_A_LIVE_2);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DATE_A_LIVE_3);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DATE_A_LIVE_4);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DATE_A_LIVE_5);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.DEATH_PARADE_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DEATH_PARADE_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.DEMON_KING_DAIMAO_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DEMON_KING_DAIMAO_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.DEMON_SLAYER_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DEMON_SLAYER_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.DOMESTIC_GIRLFRIEND_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DOMESTIC_GIRLFRIEND_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.DONT_TOY_WITH_ME_MISS_NAGATORO_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.DRAGON_CRISIS_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.EIGHTY_SIX_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.EROMANGA_SENSEI_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.FOOD_WARS_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.FOOD_WARS_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.FULL_DIVE_RPG_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.FULL_DIVE_RPG_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.GATE_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.GATE_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.GLEIPNIR_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.GIRLFRIEND_GIRLFRIEND_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.GRAND_BLUE_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIGHSCHOOL_DXD_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIGHSCHOOL_DXD_2);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIGHSCHOOL_DXD_3);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIGHSCHOOL_DXD_4);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIGHSCHOOL_DXD_5);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIGHSCHOOL_DXD_6);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIGHSCHOOL_DXD_7);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIGHSCHOOL_DXD_8);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIGHSCHOOL_DXD_9);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIGHSCHOOL_DXD_10);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIGURASHI_WHEN_THEY_CRY_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIGURASHI_WHEN_THEY_CRY_2);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIGURASHI_WHEN_THEY_CRY_3);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIGURASHI_WHEN_THEY_CRY_4);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.HORIMIYA_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.HOW_HEAVY_ARE_THE_DUMBBELLS_YOU_LIFT_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HOW_HEAVY_ARE_THE_DUMBBELLS_YOU_LIFT_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.INFINIT_STRATOS_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.INFINIT_STRATOS_2);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.INFINIT_STRATOS_3);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.INTERSPECIES_REVIEWERS_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.JUJUTSU_KAISEN_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.JUJUTSU_KAISEN_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.KAGUYASAMA_LOVE_IS_WAR_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.KAGUYASAMA_LOVE_IS_WAR_2);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.KAGUYASAMA_LOVE_IS_WAR_3);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.KAKEGURUI_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.KOMI_CANT_COMMUNICATE_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.LOVE_AFTER_WORLD_DOMINATION_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.MIERUKOCHAN_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.MIERUKOCHAN_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.MIRAI_NIKKI_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.MISS_KOBAYASHIS_DRAGON_MAID_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.MISS_KOBAYASHIS_DRAGON_MAID_2);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.MISS_KOBAYASHIS_DRAGON_MAID_3);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.MISS_KOBAYASHIS_DRAGON_MAID_4);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.MOB_PSYCHO_100_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.MONOGATARI_SERIES_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.MOTHER_OF_THE_GODDESS_DORMITORY_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.MOTHER_OF_THE_GODDESS_DORMITORY_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.MUSHOKO_TENSEI_JOBLESS_REINCARNATION_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.MY_DRESS_UP_DARLING_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.NARUTO_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.NARUTO_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.NO_GAME_NO_LIFE_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.NORAGAMI_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.NORAGAMI_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.ORESHURA_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.OVERLORD_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.OVERLORD_2);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.OVERLORD_3);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.RASCAL_DOES_NOT_DREAM_OF_BUNNY_GIRL_SENPAI_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.RASCAL_DOES_NOT_DREAM_OF_BUNNY_GIRL_SENPAI_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.RENT_A_GIRLFRIEND_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.RENT_A_GIRLFRIEND_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.ROSARIO_AND_VAMPIRE_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.RUST_EATER_BISCO_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.SAGA_OF_TANYA_THE_EVIL_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SAGA_OF_TANYA_THE_EVIL_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.SHIMONETA_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.SPY_X_FAMILY_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.SUPER_HXEROS_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.SWORD_ART_ONLINE_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_ASTERIK_WAR_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_ASTERIK_WAR_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_HIDDEN_DUNGEON_I_CAN_ONLY_ENTER_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_IDATEN_DEITIES_KNOW_ONLY_PEACE_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_MISFIT_OF_DEMON_KING_ACADEMY_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_PET_GIRL_OF_SAKURASOU_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_PET_GIRL_OF_SAKURASOU_2);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_PET_GIRL_OF_SAKURASOU_3);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_PET_GIRL_OF_SAKURASOU_4);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_QUINTESSENTIAL_QUINTUPLETS_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_QUINTESSENTIAL_QUINTUPLETS_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_RISING_OF_THE_SHIELD_HERO_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_SEVEN_DEADLY_SINS_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_SEVEN_DEADLY_SINS_2);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_SEVEN_DEADLY_SINS_3);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_SEVEN_DEADLY_SINS_4);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_SEVEN_DEADLY_SINS_5);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_TESTAMENT_OF_SISTER_NEW_DEVIL_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_TESTAMENT_OF_SISTER_NEW_DEVIL_2);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_TESTAMENT_OF_SISTER_NEW_DEVIL_3);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_TESTAMENT_OF_SISTER_NEW_DEVIL_4);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_WORLDS_FINEST_ASSASSIN_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.TOKYO_REVENGERS_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.TOKYO_REVENGERS_2);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.TOKYO_REVENGERS_3);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.TONIKAWA_OVER_THE_MOON_FOR_YOU_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.TONIKAWA_OVER_THE_MOON_FOR_YOU_2);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.TORADORA_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.UZAKICHAN_WANTS_TO_HANG_OUT_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.WHY_THE_HELL_ARE_YOU_HERE_TEACHER_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.YA_BOY_KONGMING_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.YOUR_LIE_IN_APRIL_1);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.ZOMBIELAND_SAGA_1);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ZOMBIELAND_SAGA_2);
	}
}