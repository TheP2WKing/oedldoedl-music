package net.thep2wking.oedldoedlmusic.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRegistryHelper;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;
import net.thep2wking.oedldoedlmusic.api.ModMusicRegistryHelper;
import net.thep2wking.oedldoedlmusic.init.ModBlocks;
import net.thep2wking.oedldoedlmusic.init.ModItems;
import net.thep2wking.oedldoedlmusic.init.ModSounds;

@Mod.EventBusSubscriber
public class ModRegistry {
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		ModMusicRegistryHelper.registerModels(event, OedldoedlMusic.MODID);
	}

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

		ModRegistryHelper.registerItem(event, ModItems.BLANK_MUSIC_DISC);

		ModRegistryHelper.registerItem(event, ModItems.HIMITSUO_CHODAI_MUSIC_DISC);

		ModRegistryHelper.registerItem(event, ModItems.MY_SOUL_YOUR_BEATS_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.GUREN_NO_YUMIYA_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.JIYUU_NO_TSUBASA_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.MY_WAR_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.RED_SWAN_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.SHINZOU_WO_SASAGEYO_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.SHOUKEI_TO_SHIKABANE_NO_MICHI_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.THE_RUMBLING_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.UTSUKUSHIKI_ZANKOKU_NA_SEKAI_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.KAIBUTSU_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.ANSWER_BC_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.BEAUTIFUL_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.BLACK_CATCHER_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.BLACK_ROVER_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.GRANDEUR_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.GUESS_WHO_IS_BACK_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.STORIES_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.BON_APPETIT_S_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.READY_TO_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.DATEN_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.YOFUKASHI_NO_UTA_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.KICK_BACK_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.TABLET_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.HARAMITSU_RENGE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.IDENTITY_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.AZALEE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.COLORS_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.NO_SIX_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.MEMORIES_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.TORIKAGO_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.DATE_A_LIVE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.DAY_TO_STORY_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.I_SWEAR_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.LAST_PROMISE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.OVER_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.SAVE_MY_HEART_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.SAVE_THE_WORLD_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.TRUST_IN_YOU_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.FLYERS_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.LAST_THEATER_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.EVERYDAY_SUNSHINE_LINE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.REALOVE_REALIFE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.GURENGE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.ZANKYOU_SANKA_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.CRYING_FOR_RAIN_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.WAGAMAMA_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.EASY_LOVE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.IMMORALIST_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.RYUSENSEN_MAYDAY_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.THREE_MIN_TWENTY_NINE_SEC_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.ADRENALINE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.KIBOU_NO_UTA_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.LAST_CHAPTER_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.YUUSHA_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.ANSWER_FD_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.KISUIDA_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.SEKAI_WO_KOETE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.SORE_WA_AKATSUKI_NO_YOU_NI_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.ALTERNATE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.PINKY_HOOK_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.GRAND_BLUE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.MY_DREAM_GIRLS_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.INNOCENT_ARROGANCE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.WORK_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.BLESS_YOUR_NAME_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.GEKIJOURON_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.GIVE_ME_SECRET_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.HOUTEISHIKI_WA_KOTAENAI_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.LOVELY_DEVIL_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.MOTENAI_KUSE_NI_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.STUDY_X_STUDY_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.SWITCH_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.SYMPATHY_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.TRIP_INNOCENT_OF_D_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.ANALOGY_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.GODS_SYNDROME_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.I_BELIEVE_WHAT_YOU_SAID_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.IRREGULAR_ENTROPY_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.NAMARA_MENKOI_GAL_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.IRO_KOUSUI_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.MACHO_A_NAME_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.ONEGAI_MUSCLE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.ANOTHER_WORLD_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.BEAUTIFUL_SKY_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.STRAIGHT_JET_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.TRUE_BLUE_TRAVELER_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.IKOUZE_PARADISE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.KAIKAI_KITAN_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.LOST_IN_PARADISE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.DADDY_DADDY_DO_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.GIRI_GIRI_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.LOVE_DRAMATIC_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.DEAL_WITH_THE_DEVIL_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.DREAM_X_SCRAMBLE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.CINDERELLA_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.KOI_WA_EXPLOSION_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.OTOMEDOMO_YO_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.YUME_CINDERELLA_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.MIENAIKARA_NE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.MITA_NA_MITAYO_NE_MITERUYO_NE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.KUUSOU_MESOROGIWI_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.AI_NO_SUPREME_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.AOZORA_NO_RHAPSODY_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.ISHUKAN_COMMUNICATION_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.MAID_WITH_DRAGONS_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.ONE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.NINETY_NINE_POINT_NINE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.NINETY_NINE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.RENAI_CIRCULATION_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.SAIKOUSOKU_FALL_IN_LOVE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.STUCK_ON_YOU_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.NAUGHTY_LOVE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.ZETTAI_KIMI_SENGEN_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.TABIBITO_NO_UTA_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.SAN_SAN_DAYS_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.BLUE_BIRD_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.SILHOUETTE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.THIS_GAME_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.GOYA_NO_MACHIAWASE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.KYORAN_HEY_KIDS_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.IDEN_TEITEI_MELTDOWN_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.GIRLISH_LOVER_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.CLATTANOIA_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.HOLLOW_HUNGER_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.L_L_L_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.VORACITY_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.FUKASHIGI_NO_CARTE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.KIMINOSEI_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.CENTIMETER_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.KOKUHAKU_BUNGEE_JUMP_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.DANCING_IN_THE_VELVET_MOON_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.HOUKOU_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.JINGO_JUNGLE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.LOS_LOS_LOS_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.INNER_URGE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.PLATINUM_SEVENTEEN_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.REASON_WHY_XXX_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.RESONANCE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.MIXED_NUTS_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.LOST_EMOTION_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.WAKE_UP_HXERO_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.CROSSING_FIELD_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.DAIDAIDAIDAIDAISUKI_NA_KIMI_E_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.BRAND_NEW_WORLD_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.WAITING_FOR_THE_RAIN_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.KIMI_TO_LU_SHINWA_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.PSI_DESU_I_LIKE_YOU_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.PYRAMID_DAI_GYAKUTEN_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.SEIJA_NO_KOUSHIN_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.SEIKAI_FUSEIKAI_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.DAYS_OF_DASH_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.KIMI_GA_YUME_WO_TSURETEKITA_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.PRIME_NUMBER_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.YUME_NO_TSUZUKI_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.GOTOUBUN_NO_KATACHIBY_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.GOTOUBUN_NO_KIMOCHI_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.FAITH_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.DELETE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.HIKARI_ARE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.NETSUJO_NO_SPECTRUM_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.ROB_THE_FRONTIER_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.SEVEN_DEADLY_SINS_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.BLADE_OF_HOPE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.OVER_THE_TESTAMENT_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.STILL_SIS_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.TEMPERATURE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.DARK_SEEKS_LIGHT_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.CRY_BABY_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.KOKO_DE_IKI_WO_SHITE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.TOKYO_WONDER_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.KOI_NO_UTA_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.TSUKITO_HOSHIZORA_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.PRE_PARADE_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.SEVEN_DOORS_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.AIUE_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.NOT_ENOUGH_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.THUNDER_BLOSSOM_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.WANNA_MUCHUUBY_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.NEGOTIATION_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.NEVER_GIVE_IT_UP_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.SEISHUN_SEMINAR_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.BON_KYU_BON_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.CHIKI_CHIKI_BANG_BANG_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.HIKARUNARA_MUSIC_DISC);
		
		ModRegistryHelper.registerItem(event, ModItems.ADABANA_NECROMANCY_MUSIC_DISC);
		ModRegistryHelper.registerItem(event, ModItems.TAIGA_YO_TOMO_NI_NAITE_KURE_MUSIC_DISC);
	}

	@SubscribeEvent
	public static void onSoundEventRegister(RegistryEvent.Register<SoundEvent> event) {
		ModLogger.registeredSoundEventsLogger(OedldoedlMusic.MODID);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIMITSUO_CHODAI);

		ModRegistryHelper.registerSoundEvent(event, ModSounds.MY_SOUL_YOUR_BEATS);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.GUREN_NO_YUMIYA);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.JIYUU_NO_TSUBASA);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.MY_WAR);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.RED_SWAN);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SHINZOU_WO_SASAGEYO);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SHOUKEI_TO_SHIKABANE_NO_MICHI);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.THE_RUMBLING);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.UTSUKUSHIKI_ZANKOKU_NA_SEKAI);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.KAIBUTSU);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ANSWER_BC);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.BEAUTIFUL);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.BLACK_CATCHER);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.BLACK_ROVER);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.GRANDEUR);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.GUESS_WHO_IS_BACK);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.STORIES);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.BON_APPETIT_S);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.READY_TO);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DATEN);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.YOFUKASHI_NO_UTA);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.KICK_BACK);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.TABLET);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HARAMITSU_RENGE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.IDENTITY);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.AZALEE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.COLORS);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.NO_SIX);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.MEMORIES);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.TORIKAGO);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DATE_A_LIVE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DAY_TO_STORY);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.I_SWEAR);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.LAST_PROMISE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.OVER);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SAVE_MY_HEART);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SAVE_THE_WORLD);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.TRUST_IN_YOU);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.FLYERS);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.LAST_THEATER);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.EVERYDAY_SUNSHINE_LINE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.REALOVE_REALIFE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.GURENGE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ZANKYOU_SANKA);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.CRYING_FOR_RAIN);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.WAGAMAMA);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.EASY_LOVE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.IMMORALIST);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.RYUSENSEN_MAYDAY);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.THREE_MIN_TWENTY_NINE_SEC);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ADRENALINE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.KIBOU_NO_UTA);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.LAST_CHAPTER);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.YUUSHA);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ANSWER_FD);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.KISUIDA);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SEKAI_WO_KOETE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SORE_WA_AKATSUKI_NO_YOU_NI);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ALTERNATE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.PINKY_HOOK);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.GRAND_BLUE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.MY_DREAM_GIRLS);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.INNOCENT_ARROGANCE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.WORK);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.BLESS_YOUR_NAME);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.GEKIJOURON);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.GIVE_ME_SECRET);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HOUTEISHIKI_WA_KOTAENAI);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.LOVELY_DEVIL);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.MOTENAI_KUSE_NI);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.STUDY_X_STUDY);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SWITCH);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SYMPATHY);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.TRIP_INNOCENT_OF_D);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ANALOGY);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.GODS_SYNDROME);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.I_BELIEVE_WHAT_YOU_SAID);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.IRREGULAR_ENTROPY);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.NAMARA_MENKOI_GAL);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.IRO_KOUSUI);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.MACHO_A_NAME);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ONEGAI_MUSCLE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ANOTHER_WORLD);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.BEAUTIFUL_SKY);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.STRAIGHT_JET);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.TRUE_BLUE_TRAVELER);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.IKOUZE_PARADISE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.KAIKAI_KITAN);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.LOST_IN_PARADISE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DADDY_DADDY_DO);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.GIRI_GIRI);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.LOVE_DRAMATIC);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DEAL_WITH_THE_DEVIL);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DREAM_X_SCRAMBLE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.CINDERELLA);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.KOI_WA_EXPLOSION);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.OTOMEDOMO_YO);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.YUME_CINDERELLA);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.MIENAIKARA_NE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.MITA_NA_MITAYO_NE_MITERUYO_NE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.KUUSOU_MESOROGIWI);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.AI_NO_SUPREME);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.AOZORA_NO_RHAPSODY);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ISHUKAN_COMMUNICATION);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.MAID_WITH_DRAGONS);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ONE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.NINETY_NINE_POINT_NINE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.NINETY_NINE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.RENAI_CIRCULATION);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SAIKOUSOKU_FALL_IN_LOVE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.STUCK_ON_YOU);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.NAUGHTY_LOVE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ZETTAI_KIMI_SENGEN);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.TABIBITO_NO_UTA);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SAN_SAN_DAYS);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.BLUE_BIRD);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SILHOUETTE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.THIS_GAME);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.GOYA_NO_MACHIAWASE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.KYORAN_HEY_KIDS);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.IDEN_TEITEI_MELTDOWN);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.GIRLISH_LOVER);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.CLATTANOIA);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HOLLOW_HUNGER);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.L_L_L);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.VORACITY);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.FUKASHIGI_NO_CARTE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.KIMINOSEI);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.CENTIMETER);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.KOKUHAKU_BUNGEE_JUMP);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DANCING_IN_THE_VELVET_MOON);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HOUKOU);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.JINGO_JUNGLE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.LOS_LOS_LOS);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.INNER_URGE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.PLATINUM_SEVENTEEN);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.REASON_WHY_XXX);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.RESONANCE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.MIXED_NUTS);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.LOST_EMOTION);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.WAKE_UP_HXERO);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.CROSSING_FIELD);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DAIDAIDAIDAIDAISUKI_NA_KIMI_E);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.BRAND_NEW_WORLD);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.WAITING_FOR_THE_RAIN);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.KIMI_TO_LU_SHINWA);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.PSI_DESU_I_LIKE_YOU);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.PYRAMID_DAI_GYAKUTEN);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SEIJA_NO_KOUSHIN);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SEIKAI_FUSEIKAI);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DAYS_OF_DASH);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.KIMI_GA_YUME_WO_TSURETEKITA);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.PRIME_NUMBER);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.YUME_NO_TSUZUKI);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.GOTOUBUN_NO_KATACHIBY);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.GOTOUBUN_NO_KIMOCHI);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.FAITH);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DELETE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIKARI_ARE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.NETSUJO_NO_SPECTRUM);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ROB_THE_FRONTIER);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SEVEN_DEADLY_SINS);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.BLADE_OF_HOPE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.OVER_THE_TESTAMENT);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.STILL_SIS);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.TEMPERATURE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.DARK_SEEKS_LIGHT);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.CRY_BABY);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.KOKO_DE_IKI_WO_SHITE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.TOKYO_WONDER);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.KOI_NO_UTA);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.TSUKITO_HOSHIZORA);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.PRE_PARADE);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SEVEN_DOORS);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.AIUE);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.NOT_ENOUGH);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.THUNDER_BLOSSOM);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.WANNA_MUCHUUBY);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.NEGOTIATION);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.NEVER_GIVE_IT_UP);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.SEISHUN_SEMINAR);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.BON_KYU_BON);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.CHIKI_CHIKI_BANG_BANG);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.HIKARUNARA);
		
		ModRegistryHelper.registerSoundEvent(event, ModSounds.ADABANA_NECROMANCY);
		ModRegistryHelper.registerSoundEvent(event, ModSounds.TAIGA_YO_TOMO_NI_NAITE_KURE);
	}
}