package net.thep2wking.oedldoedlmusic.init;

import net.minecraft.item.Item;
import net.thep2wking.oedldoedlcore.api.item.ModItemBase;
import net.thep2wking.oedldoedlcore.api.item.ModItemBlockBase;
import net.thep2wking.oedldoedlcore.util.ModRarities;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;
import net.thep2wking.oedldoedlmusic.api.ModItemAnimeRecordBase;

public class ModItems {
	public static final Item RECORD_PACKAGE = new ModItemBlockBase(ModBlocks.RECORD_PACKAGE, ModRarities.YELLOW, false, 2, 1);
	
	public static final Item MUSIC_PLAYER = new ModItemBlockBase(ModBlocks.MUSIC_PLAYER, ModRarities.LIGHT_PURPLE, false, 2, 0);

	public static final Item BLANK_MUSIC_DISC = new ModItemBase(OedldoedlMusic.MODID, "blank_music_disc", OedldoedlMusic.TAB, ModRarities.YELLOW, false, 1, 0);

	public static final Item HIMITSUO_CHODAI_MUSIC_DISC = new ModItemAnimeRecordBase("himitsuo_chodai", ModSounds.HIMITSUO_CHODAI, "Actually I Am");

	public static final Item MY_SOUL_YOUR_BEATS_MUSIC_DISC = new ModItemAnimeRecordBase("my_soul_your_beats", ModSounds.MY_SOUL_YOUR_BEATS, "Angel Beats");
	
	public static final Item GUREN_NO_YUMIYA_MUSIC_DISC = new ModItemAnimeRecordBase("guren_no_yumiya", ModSounds.GUREN_NO_YUMIYA, "Attack On Titan");
	public static final Item JIYUU_NO_TSUBASA_MUSIC_DISC = new ModItemAnimeRecordBase("jiyuu_no_tsubasa", ModSounds.JIYUU_NO_TSUBASA, "Attack On Titan");
	public static final Item MY_WAR_MUSIC_DISC = new ModItemAnimeRecordBase("my_war", ModSounds.MY_WAR, "Attack On Titan");
	public static final Item RED_SWAN_MUSIC_DISC = new ModItemAnimeRecordBase("red_swan", ModSounds.RED_SWAN, "Attack On Titan");
	public static final Item SHINZOU_WO_SASAGEYO_MUSIC_DISC = new ModItemAnimeRecordBase("shinzou_wo_sasageyo", ModSounds.SHINZOU_WO_SASAGEYO, "Attack On Titan");
	public static final Item SHOUKEI_TO_SHIKABANE_NO_MICHI_MUSIC_DISC = new ModItemAnimeRecordBase("shoukei_to_shikabane_no_michi", ModSounds.SHOUKEI_TO_SHIKABANE_NO_MICHI, "Attack On Titan");
	public static final Item THE_RUMBLING_MUSIC_DISC = new ModItemAnimeRecordBase("the_rumbling", ModSounds.THE_RUMBLING, "Attack On Titan");
	public static final Item UTSUKUSHIKI_ZANKOKU_NA_SEKAI_MUSIC_DISC = new ModItemAnimeRecordBase("utsukushiki_zankoku_na_sekai", ModSounds.UTSUKUSHIKI_ZANKOKU_NA_SEKAI, "Attack On Titan");
	
	public static final Item KAIBUTSU_MUSIC_DISC = new ModItemAnimeRecordBase("kaibutsu", ModSounds.KAIBUTSU, "Beastars");
	
	public static final Item ANSWER_BC_MUSIC_DISC = new ModItemAnimeRecordBase("answer_bc", ModSounds.ANSWER_BC, "Black Clover");
	public static final Item BEAUTIFUL_MUSIC_DISC = new ModItemAnimeRecordBase("beautiful", ModSounds.BEAUTIFUL, "Black Clover");
	public static final Item BLACK_CATCHER_MUSIC_DISC = new ModItemAnimeRecordBase("black_catcher", ModSounds.BLACK_CATCHER, "Black Clover");
	public static final Item BLACK_ROVER_MUSIC_DISC = new ModItemAnimeRecordBase("black_rover", ModSounds.BLACK_ROVER, "Black Clover");
	public static final Item GRANDEUR_MUSIC_DISC = new ModItemAnimeRecordBase("grandeur", ModSounds.GRANDEUR, "Black Clover");
	public static final Item GUESS_WHO_IS_BACK_MUSIC_DISC = new ModItemAnimeRecordBase("guess_who_is_back", ModSounds.GUESS_WHO_IS_BACK, "Black Clover");
	public static final Item STORIES_MUSIC_DISC = new ModItemAnimeRecordBase("stories", ModSounds.STORIES, "Black Clover");
	
	public static final Item BON_APPETIT_S_MUSIC_DISC = new ModItemAnimeRecordBase("bon_appetit_s", ModSounds.BON_APPETIT_S, "Blend S");
	
	public static final Item READY_TO_MUSIC_DISC = new ModItemAnimeRecordBase("ready_to", ModSounds.READY_TO, "Brand New Animal");
	
	public static final Item DATEN_MUSIC_DISC = new ModItemAnimeRecordBase("daten", ModSounds.DATEN, "Call Of The Night");
	public static final Item YOFUKASHI_NO_UTA_MUSIC_DISC = new ModItemAnimeRecordBase("yofukashi_no_uta", ModSounds.YOFUKASHI_NO_UTA, "Call Of The Night");
	
	public static final Item KICK_BACK_MUSIC_DISC = new ModItemAnimeRecordBase("kick_back", ModSounds.KICK_BACK, "Chainsaw Man");
	public static final Item TABLET_MUSIC_DISC = new ModItemAnimeRecordBase("tablet", ModSounds.TABLET, "Chainsaw Man");
	
	public static final Item HARAMITSU_RENGE_MUSIC_DISC = new ModItemAnimeRecordBase("haramitsu_renge", ModSounds.HARAMITSU_RENGE, "Chivalry Of A Failed Knight");
	public static final Item IDENTITY_MUSIC_DISC = new ModItemAnimeRecordBase("identity", ModSounds.IDENTITY, "Chivalry Of A Failed Knight");
	
	public static final Item AZALEE_MUSIC_DISC = new ModItemAnimeRecordBase("azalee", ModSounds.AZALEE, "Citrus");
	
	public static final Item COLORS_MUSIC_DISC = new ModItemAnimeRecordBase("colors", ModSounds.COLORS, "Code Geass");
	
	public static final Item NO_SIX_MUSIC_DISC = new ModItemAnimeRecordBase("no_six", ModSounds.NO_SIX, "Combatants Will Be Dispatched");
	
	public static final Item MEMORIES_MUSIC_DISC = new ModItemAnimeRecordBase("memories", ModSounds.MEMORIES, "Comic Girls");
	
	public static final Item TORIKAGO_MUSIC_DISC = new ModItemAnimeRecordBase("torikago", ModSounds.TORIKAGO, "Darling In The Franxx");
	
	public static final Item DATE_A_LIVE_MUSIC_DISC = new ModItemAnimeRecordBase("date_a_live", ModSounds.DATE_A_LIVE, "Date A Live");
	public static final Item DAY_TO_STORY_MUSIC_DISC = new ModItemAnimeRecordBase("day_to_story", ModSounds.DAY_TO_STORY, "Date A Live");
	public static final Item I_SWEAR_MUSIC_DISC = new ModItemAnimeRecordBase("i_swear", ModSounds.I_SWEAR, "Date A Live");
	public static final Item LAST_PROMISE_MUSIC_DISC = new ModItemAnimeRecordBase("last_promise", ModSounds.LAST_PROMISE, "Date A Live");
	public static final Item OVER_MUSIC_DISC = new ModItemAnimeRecordBase("over", ModSounds.OVER, "Date A Live");
	public static final Item SAVE_MY_HEART_MUSIC_DISC = new ModItemAnimeRecordBase("save_my_heart", ModSounds.SAVE_MY_HEART, "Date A Live");
	public static final Item SAVE_THE_WORLD_MUSIC_DISC = new ModItemAnimeRecordBase("save_the_world", ModSounds.SAVE_THE_WORLD, "Date A Live");
	public static final Item TRUST_IN_YOU_MUSIC_DISC = new ModItemAnimeRecordBase("trust_in_you", ModSounds.TRUST_IN_YOU, "Date A Live");
	
	public static final Item FLYERS_MUSIC_DISC = new ModItemAnimeRecordBase("flyers", ModSounds.FLYERS, "Death Parade");
	public static final Item LAST_THEATER_MUSIC_DISC = new ModItemAnimeRecordBase("last_theater", ModSounds.LAST_THEATER, "Death Parade");
	
	public static final Item EVERYDAY_SUNSHINE_LINE_MUSIC_DISC = new ModItemAnimeRecordBase("everyday_sunshine_line", ModSounds.EVERYDAY_SUNSHINE_LINE, "Demon King Daimao");
	public static final Item REALOVE_REALIFE_MUSIC_DISC = new ModItemAnimeRecordBase("realove_realife", ModSounds.REALOVE_REALIFE, "Demon King Daimao");
	
	public static final Item GURENGE_MUSIC_DISC = new ModItemAnimeRecordBase("gurenge", ModSounds.GURENGE, "Demon Slayer");
	public static final Item ZANKYOU_SANKA_MUSIC_DISC = new ModItemAnimeRecordBase("zankyou_sanka", ModSounds.ZANKYOU_SANKA, "Demon Slayer");
	
	public static final Item CRYING_FOR_RAIN_MUSIC_DISC = new ModItemAnimeRecordBase("crying_for_rain", ModSounds.CRYING_FOR_RAIN, "Domestic Girlfriend");
	public static final Item WAGAMAMA_MUSIC_DISC = new ModItemAnimeRecordBase("wagamama", ModSounds.WAGAMAMA, "Domestic Girlfriend");
	
	public static final Item EASY_LOVE_MUSIC_DISC = new ModItemAnimeRecordBase("easy_love", ModSounds.EASY_LOVE, "Dont Toy With Me Miss Nagatoro");
	
	public static final Item IMMORALIST_MUSIC_DISC = new ModItemAnimeRecordBase("immoralist", ModSounds.IMMORALIST, "Dragon Crisis");
	
	public static final Item RYUSENSEN_MAYDAY_MUSIC_DISC = new ModItemAnimeRecordBase("ryusensen_mayday", ModSounds.RYUSENSEN_MAYDAY, "Dropkick On My Devil");
	
	public static final Item THREE_MIN_TWENTY_NINE_SEC_MUSIC_DISC = new ModItemAnimeRecordBase("three_min_twenty_nine_sec", ModSounds.THREE_MIN_TWENTY_NINE_SEC, "Eighty Six");
	
	public static final Item ADRENALINE_MUSIC_DISC = new ModItemAnimeRecordBase("adrenaline", ModSounds.ADRENALINE, "Eromanga Sensei");
	
	public static final Item KIBOU_NO_UTA_MUSIC_DISC = new ModItemAnimeRecordBase("kibou_no_uta", ModSounds.KIBOU_NO_UTA, "Food Wars");
	public static final Item LAST_CHAPTER_MUSIC_DISC = new ModItemAnimeRecordBase("last_chapter", ModSounds.LAST_CHAPTER, "Food Wars");
	
	public static final Item YUUSHA_MUSIC_DISC = new ModItemAnimeRecordBase("yuusha", ModSounds.YUUSHA, "Frieren");
	
	public static final Item ANSWER_FD_MUSIC_DISC = new ModItemAnimeRecordBase("answer_fd", ModSounds.ANSWER_FD, "Full Dive RPG");
	public static final Item KISUIDA_MUSIC_DISC = new ModItemAnimeRecordBase("kisuida", ModSounds.KISUIDA, "Full Dive RPG");
	
	public static final Item SEKAI_WO_KOETE_MUSIC_DISC = new ModItemAnimeRecordBase("sekai_wo_koete", ModSounds.SEKAI_WO_KOETE, "Gate");
	public static final Item SORE_WA_AKATSUKI_NO_YOU_NI_MUSIC_DISC = new ModItemAnimeRecordBase("sore_wa_akatsuki_no_you_ni", ModSounds.SORE_WA_AKATSUKI_NO_YOU_NI, "Gate");
	
	public static final Item ALTERNATE_MUSIC_DISC = new ModItemAnimeRecordBase("alternate", ModSounds.ALTERNATE, "Gleipnir");
	
	public static final Item PINKY_HOOK_MUSIC_DISC = new ModItemAnimeRecordBase("pinky_hook", ModSounds.PINKY_HOOK, "Girlfriend Girlfriend");
	
	public static final Item GRAND_BLUE_MUSIC_DISC = new ModItemAnimeRecordBase("grand_blue", ModSounds.GRAND_BLUE, "Grand Blue");
	
	public static final Item MY_DREAM_GIRLS_MUSIC_DISC = new ModItemAnimeRecordBase("my_dream_girls", ModSounds.MY_DREAM_GIRLS, "Gushing Over Magical Girls");
	
	public static final Item INNOCENT_ARROGANCE_MUSIC_DISC = new ModItemAnimeRecordBase("innocent_arrogance", ModSounds.INNOCENT_ARROGANCE, "Heavenly Delusion");
	
	public static final Item WORK_MUSIC_DISC = new ModItemAnimeRecordBase("work", ModSounds.WORK, "Hells Paradise");
	
	public static final Item BLESS_YOUR_NAME_MUSIC_DISC = new ModItemAnimeRecordBase("bless_your_name", ModSounds.BLESS_YOUR_NAME, "Highschool DxD");
	public static final Item GEKIJOURON_MUSIC_DISC = new ModItemAnimeRecordBase("gekijouron", ModSounds.GEKIJOURON, "Highschool DxD");
	public static final Item GIVE_ME_SECRET_MUSIC_DISC = new ModItemAnimeRecordBase("give_me_secret", ModSounds.GIVE_ME_SECRET, "Highschool DxD");
	public static final Item HOUTEISHIKI_WA_KOTAENAI_MUSIC_DISC = new ModItemAnimeRecordBase("houteishiki_wa_kotaenai", ModSounds.HOUTEISHIKI_WA_KOTAENAI, "Highschool DxD");
	public static final Item LOVELY_DEVIL_MUSIC_DISC = new ModItemAnimeRecordBase("lovely_devil", ModSounds.LOVELY_DEVIL, "Highschool DxD");
	public static final Item MOTENAI_KUSE_NI_MUSIC_DISC = new ModItemAnimeRecordBase("motenai_kuse_ni", ModSounds.MOTENAI_KUSE_NI, "Highschool DxD");
	public static final Item STUDY_X_STUDY_MUSIC_DISC = new ModItemAnimeRecordBase("study_x_study", ModSounds.STUDY_X_STUDY, "Highschool DxD");
	public static final Item SWITCH_MUSIC_DISC = new ModItemAnimeRecordBase("switch", ModSounds.SWITCH, "Highschool DxD");
	public static final Item SYMPATHY_MUSIC_DISC = new ModItemAnimeRecordBase("sympathy", ModSounds.SYMPATHY, "Highschool DxD");
	public static final Item TRIP_INNOCENT_OF_D_MUSIC_DISC = new ModItemAnimeRecordBase("trip_innocent_of_d", ModSounds.TRIP_INNOCENT_OF_D, "Highschool DxD");
	
	public static final Item ANALOGY_MUSIC_DISC = new ModItemAnimeRecordBase("analogy", ModSounds.ANALOGY, "Higurashi When They Cry");
	public static final Item GODS_SYNDROME_MUSIC_DISC = new ModItemAnimeRecordBase("gods_syndrome", ModSounds.GODS_SYNDROME, "Higurashi When They Cry");
	public static final Item I_BELIEVE_WHAT_YOU_SAID_MUSIC_DISC = new ModItemAnimeRecordBase("i_believe_what_you_said", ModSounds.I_BELIEVE_WHAT_YOU_SAID, "Higurashi When They Cry");
	public static final Item IRREGULAR_ENTROPY_MUSIC_DISC = new ModItemAnimeRecordBase("irregular_entropy", ModSounds.IRREGULAR_ENTROPY, "Higurashi When They Cry");
	
	public static final Item NAMARA_MENKOI_GAL_MUSIC_DISC = new ModItemAnimeRecordBase("namara_menkoi_gal", ModSounds.NAMARA_MENKOI_GAL, "Hokkaido Gals Are Super Adorable");
	
	public static final Item IRO_KOUSUI_MUSIC_DISC = new ModItemAnimeRecordBase("iro_kousui", ModSounds.IRO_KOUSUI, "Horimiya");
	
	public static final Item MACHO_A_NAME_MUSIC_DISC = new ModItemAnimeRecordBase("macho_a_name", ModSounds.MACHO_A_NAME, "How Heavy Are The Dumbbells You Lift");
	public static final Item ONEGAI_MUSCLE_MUSIC_DISC = new ModItemAnimeRecordBase("onegai_muscle", ModSounds.ONEGAI_MUSCLE, "How Heavy Are The Dumbbells You Lift");
	
	public static final Item ANOTHER_WORLD_MUSIC_DISC = new ModItemAnimeRecordBase("another_world", ModSounds.ANOTHER_WORLD, "In Another World With My Smartphone");
	
	public static final Item BEAUTIFUL_SKY_MUSIC_DISC = new ModItemAnimeRecordBase("beautiful_sky", ModSounds.BEAUTIFUL_SKY, "Infinite Stratos");
	public static final Item STRAIGHT_JET_MUSIC_DISC = new ModItemAnimeRecordBase("straight_jet", ModSounds.STRAIGHT_JET, "Infinite Stratos");
	public static final Item TRUE_BLUE_TRAVELER_MUSIC_DISC = new ModItemAnimeRecordBase("true_blue_traveler", ModSounds.TRUE_BLUE_TRAVELER, "Infinite Stratos");
	
	public static final Item IKOUZE_PARADISE_MUSIC_DISC = new ModItemAnimeRecordBase("ikouze_paradise", ModSounds.IKOUZE_PARADISE, "Interspecies Reviewers");

	public static final Item SAIKYOU_GIRL_MUSIC_DISC = new ModItemAnimeRecordBase("saikyou_girl", ModSounds.SAIKYOU_GIRL, "Jellyfish Cant Swim In The Night");
	
	public static final Item KAIKAI_KITAN_MUSIC_DISC = new ModItemAnimeRecordBase("kaikai_kitan", ModSounds.KAIKAI_KITAN, "Jujutsu Kaisen");
	public static final Item LOST_IN_PARADISE_MUSIC_DISC = new ModItemAnimeRecordBase("lost_in_paradise", ModSounds.LOST_IN_PARADISE, "Jujutsu Kaisen");
	
	public static final Item DADDY_DADDY_DO_MUSIC_DISC = new ModItemAnimeRecordBase("daddy_daddy_do", ModSounds.DADDY_DADDY_DO, "Kaguyasama Love Is War");
	public static final Item GIRI_GIRI_MUSIC_DISC = new ModItemAnimeRecordBase("giri_giri", ModSounds.GIRI_GIRI, "Kaguyasama Love Is War");
	public static final Item LOVE_DRAMATIC_MUSIC_DISC = new ModItemAnimeRecordBase("love_dramatic", ModSounds.LOVE_DRAMATIC, "Kaguyasama Love Is War");
	
	public static final Item DEAL_WITH_THE_DEVIL_MUSIC_DISC = new ModItemAnimeRecordBase("deal_with_the_devil", ModSounds.DEAL_WITH_THE_DEVIL, "Kakegurui");
	
	public static final Item DREAM_X_SCRAMBLE_MUSIC_DISC = new ModItemAnimeRecordBase("dream_x_scramble", ModSounds.DREAM_X_SCRAMBLE, "Keijo");
	
	public static final Item CINDERELLA_MUSIC_DISC = new ModItemAnimeRecordBase("cinderella", ModSounds.CINDERELLA, "Komi Cant Communicate");
	
	public static final Item KOI_WA_EXPLOSION_MUSIC_DISC = new ModItemAnimeRecordBase("koi_wa_explosion", ModSounds.KOI_WA_EXPLOSION, "Love After World Domination");
	
	public static final Item OTOMEDOMO_YO_MUSIC_DISC = new ModItemAnimeRecordBase("otomedomo_yo", ModSounds.OTOMEDOMO_YO, "Maidens Of The Savage Season");
	public static final Item YUME_CINDERELLA_MUSIC_DISC = new ModItemAnimeRecordBase("yume_cinderella", ModSounds.YUME_CINDERELLA, "Maidens Of The Savage Season");
	
	public static final Item MIENAIKARA_NE_MUSIC_DISC = new ModItemAnimeRecordBase("mienaikara_ne", ModSounds.MIENAIKARA_NE, "Mierukochan");
	public static final Item MITA_NA_MITAYO_NE_MITERUYO_NE_MUSIC_DISC = new ModItemAnimeRecordBase("mita_na_mitayo_ne_miteruyo_ne", ModSounds.MITA_NA_MITAYO_NE_MITERUYO_NE, "Mierukochan");
	
	public static final Item KUUSOU_MESOROGIWI_MUSIC_DISC = new ModItemAnimeRecordBase("kuusou_mesorogiwi", ModSounds.KUUSOU_MESOROGIWI, "Mirai Nikki");
	
	public static final Item AI_NO_SUPREME_MUSIC_DISC = new ModItemAnimeRecordBase("ai_no_supreme", ModSounds.AI_NO_SUPREME, "Miss Kobayashis Dragon Maid");
	public static final Item AOZORA_NO_RHAPSODY_MUSIC_DISC = new ModItemAnimeRecordBase("aozora_no_rhapsody", ModSounds.AOZORA_NO_RHAPSODY, "Miss Kobayashis Dragon Maid");
	public static final Item ISHUKAN_COMMUNICATION_MUSIC_DISC = new ModItemAnimeRecordBase("ishukan_communication", ModSounds.ISHUKAN_COMMUNICATION, "Miss Kobayashis Dragon Maid");
	public static final Item MAID_WITH_DRAGONS_MUSIC_DISC = new ModItemAnimeRecordBase("maid_with_dragons", ModSounds.MAID_WITH_DRAGONS, "Miss Kobayashis Dragon Maid");
	
	public static final Item ONE_MUSIC_DISC = new ModItemAnimeRecordBase("one", ModSounds.ONE, "Mob Psycho 100");
	public static final Item NINETY_NINE_POINT_NINE_MUSIC_DISC = new ModItemAnimeRecordBase("ninety_nine_point_nine", ModSounds.NINETY_NINE_POINT_NINE, "Mob Psycho 100");
	public static final Item NINETY_NINE_MUSIC_DISC = new ModItemAnimeRecordBase("ninety_nine", ModSounds.NINETY_NINE, "Mob Psycho 100");
	
	public static final Item RENAI_CIRCULATION_MUSIC_DISC = new ModItemAnimeRecordBase("renai_circulation", ModSounds.RENAI_CIRCULATION, "Monogatari Series");
	
	public static final Item SAIKOUSOKU_FALL_IN_LOVE_MUSIC_DISC = new ModItemAnimeRecordBase("saikousoku_fall_in_love", ModSounds.SAIKOUSOKU_FALL_IN_LOVE, "Monster Musume");
	
	public static final Item STUCK_ON_YOU_MUSIC_DISC = new ModItemAnimeRecordBase("stuck_on_you", ModSounds.STUCK_ON_YOU, "More Than A Married Couple But Not Lovers");
	
	public static final Item NAUGHTY_LOVE_MUSIC_DISC = new ModItemAnimeRecordBase("naughty_love", ModSounds.NAUGHTY_LOVE, "Mother Of The Goddess Dormitory");
	public static final Item ZETTAI_KIMI_SENGEN_MUSIC_DISC = new ModItemAnimeRecordBase("zettai_kimi_sengen", ModSounds.ZETTAI_KIMI_SENGEN, "Mother Of The Goddess Dormitory");
	
	public static final Item TABIBITO_NO_UTA_MUSIC_DISC = new ModItemAnimeRecordBase("tabibito_no_uta", ModSounds.TABIBITO_NO_UTA, "Mushoko Tensei Jobless Reincarnation");
	
	public static final Item SHIKAIRO_DAYS_MUSIC_DISC = new ModItemAnimeRecordBase("shikairo_days", ModSounds.SHIKAIRO_DAYS, "My Deer Friend Nokotan");

	public static final Item SAN_SAN_DAYS_MUSIC_DISC = new ModItemAnimeRecordBase("san_san_days", ModSounds.SAN_SAN_DAYS, "My Dress Up Darling");
	
	public static final Item BLUE_BIRD_MUSIC_DISC = new ModItemAnimeRecordBase("blue_bird", ModSounds.BLUE_BIRD, "Naruto Shippuuden");
	public static final Item SILHOUETTE_MUSIC_DISC = new ModItemAnimeRecordBase("silhouette", ModSounds.SILHOUETTE, "Naruto Shippuuden");
	
	public static final Item THIS_GAME_MUSIC_DISC = new ModItemAnimeRecordBase("this_game", ModSounds.THIS_GAME, "No Game No Live");
	
	public static final Item GOYA_NO_MACHIAWASE_MUSIC_DISC = new ModItemAnimeRecordBase("goya_no_machiawase", ModSounds.GOYA_NO_MACHIAWASE, "Noragami");
	public static final Item KYORAN_HEY_KIDS_MUSIC_DISC = new ModItemAnimeRecordBase("kyoran_hey_kids", ModSounds.KYORAN_HEY_KIDS, "Noragami");
	
	public static final Item IDEN_TEITEI_MELTDOWN_MUSIC_DISC = new ModItemAnimeRecordBase("iden_teitei_meltdown", ModSounds.IDEN_TEITEI_MELTDOWN, "Onimai");
	
	public static final Item GIRLISH_LOVER_MUSIC_DISC = new ModItemAnimeRecordBase("girlish_lover", ModSounds.GIRLISH_LOVER, "Oreshura");

	public static final Item FATAL_MUSIC_DISC = new ModItemAnimeRecordBase("fatal", ModSounds.FATAL, "Oshi No Ko");
	public static final Item IDOL_MUSIC_DISC = new ModItemAnimeRecordBase("idol", ModSounds.IDOL, "Oshi No Ko");
	
	public static final Item CLATTANOIA_MUSIC_DISC = new ModItemAnimeRecordBase("clattanoia", ModSounds.CLATTANOIA, "Overlord");
	public static final Item HOLLOW_HUNGER_MUSIC_DISC = new ModItemAnimeRecordBase("hollow_hunger", ModSounds.HOLLOW_HUNGER, "Overlord");
	public static final Item L_L_L_MUSIC_DISC = new ModItemAnimeRecordBase("l_l_l", ModSounds.L_L_L, "Overlord");
	public static final Item VORACITY_MUSIC_DISC = new ModItemAnimeRecordBase("voracity", ModSounds.VORACITY, "Overlord");
	
	public static final Item FUKASHIGI_NO_CARTE_MUSIC_DISC = new ModItemAnimeRecordBase("fukashigi_no_carte", ModSounds.FUKASHIGI_NO_CARTE, "Rascal Does Not Dream Of Bunny Girl Senpai");
	public static final Item KIMINOSEI_MUSIC_DISC = new ModItemAnimeRecordBase("kiminosei", ModSounds.KIMINOSEI, "Rascal Does Not Dream Of Bunny Girl Senpai");
	
	public static final Item CENTIMETER_MUSIC_DISC = new ModItemAnimeRecordBase("centimeter", ModSounds.CENTIMETER, "Rent A Girlfriend");
	public static final Item KOKUHAKU_BUNGEE_JUMP_MUSIC_DISC = new ModItemAnimeRecordBase("kokuhaku_bungee_jump", ModSounds.KOKUHAKU_BUNGEE_JUMP, "Rent A Girlfriend");
	
	public static final Item DANCING_IN_THE_VELVET_MOON_MUSIC_DISC = new ModItemAnimeRecordBase("dancing_in_the_velvet_moon", ModSounds.DANCING_IN_THE_VELVET_MOON, "Rosario And Vampire");
	
	public static final Item HOUKOU_MUSIC_DISC = new ModItemAnimeRecordBase("houkou", ModSounds.HOUKOU, "Rust Eater Bisco");
	
	public static final Item JINGO_JUNGLE_MUSIC_DISC = new ModItemAnimeRecordBase("jingo_jungle", ModSounds.JINGO_JUNGLE, "Saga Of Tanya The Evil");
	public static final Item LOS_LOS_LOS_MUSIC_DISC = new ModItemAnimeRecordBase("los_los_los", ModSounds.LOS_LOS_LOS, "Saga Of Tanya The Evil");
	
	public static final Item INNER_URGE_MUSIC_DISC = new ModItemAnimeRecordBase("inner_urge", ModSounds.INNER_URGE, "Shimoneta");
	
	public static final Item PLATINUM_SEVENTEEN_MUSIC_DISC = new ModItemAnimeRecordBase("platinum_seventeen", ModSounds.PLATINUM_SEVENTEEN, "So I Cant Play H");
	public static final Item REASON_WHY_XXX_MUSIC_DISC = new ModItemAnimeRecordBase("reason_why_xxx", ModSounds.REASON_WHY_XXX, "So I Cant Play H");
	
	public static final Item RESONANCE_MUSIC_DISC = new ModItemAnimeRecordBase("resonance", ModSounds.RESONANCE, "Soul Eater");
	
	public static final Item MIXED_NUTS_MUSIC_DISC = new ModItemAnimeRecordBase("mixed_nuts", ModSounds.MIXED_NUTS, "Spy X Family");
	
	public static final Item LOST_EMOTION_MUSIC_DISC = new ModItemAnimeRecordBase("lost_emotion", ModSounds.LOST_EMOTION, "Super HxEros");
	public static final Item WAKE_UP_HXERO_MUSIC_DISC = new ModItemAnimeRecordBase("wake_up_hxero", ModSounds.WAKE_UP_HXERO, "Super HxEros");
	
	public static final Item CROSSING_FIELD_MUSIC_DISC = new ModItemAnimeRecordBase("crossing_field", ModSounds.CROSSING_FIELD, "Sword Art Online");
	
	public static final Item DAIDAIDAIDAIDAISUKI_NA_KIMI_E_MUSIC_DISC = new ModItemAnimeRecordBase("daidaidaidaidaisuki_na_kimi_e", ModSounds.DAIDAIDAIDAIDAISUKI_NA_KIMI_E, "The 100 Girlfriends Who Really Love You");
	
	public static final Item BRAND_NEW_WORLD_MUSIC_DISC = new ModItemAnimeRecordBase("brand_new_world", ModSounds.BRAND_NEW_WORLD, "The Asterisk War");
	public static final Item WAITING_FOR_THE_RAIN_MUSIC_DISC = new ModItemAnimeRecordBase("waiting_for_the_rain", ModSounds.WAITING_FOR_THE_RAIN, "The Asterisk War");
	
	public static final Item KIMI_TO_LU_SHINWA_MUSIC_DISC = new ModItemAnimeRecordBase("kimi_to_lu_shinwa", ModSounds.KIMI_TO_LU_SHINWA, "The Day I Become God");
	
	public static final Item PSI_DESU_I_LIKE_YOU_MUSIC_DISC = new ModItemAnimeRecordBase("psi_desu_i_like_you", ModSounds.PSI_DESU_I_LIKE_YOU, "The Disastrous Life Of Saiki K");
	
	public static final Item PYRAMID_DAI_GYAKUTEN_MUSIC_DISC = new ModItemAnimeRecordBase("pyramid_dai_gyakuten", ModSounds.PYRAMID_DAI_GYAKUTEN, "The Hidden Dungeon I Can Only Enter");
	
	public static final Item SEIJA_NO_KOUSHIN_MUSIC_DISC = new ModItemAnimeRecordBase("seija_no_koushin", ModSounds.SEIJA_NO_KOUSHIN, "The Idaten Deities Know Only Peace");
	
	public static final Item SEIKAI_FUSEIKAI_MUSIC_DISC = new ModItemAnimeRecordBase("seikai_fuseikai", ModSounds.SEIKAI_FUSEIKAI, "The Misfit Of Demon King Academy");
	
	public static final Item DAYS_OF_DASH_MUSIC_DISC = new ModItemAnimeRecordBase("days_of_dash", ModSounds.DAYS_OF_DASH, "The Pet Girl Of Sakurasou");
	public static final Item KIMI_GA_YUME_WO_TSURETEKITA_MUSIC_DISC = new ModItemAnimeRecordBase("kimi_ga_yume_wo_tsuretekita", ModSounds.KIMI_GA_YUME_WO_TSURETEKITA, "The Pet Girl Of Sakurasou");
	public static final Item PRIME_NUMBER_MUSIC_DISC = new ModItemAnimeRecordBase("prime_number", ModSounds.PRIME_NUMBER, "The Pet Girl Of Sakurasou");
	public static final Item YUME_NO_TSUZUKI_MUSIC_DISC = new ModItemAnimeRecordBase("yume_no_tsuzuki", ModSounds.YUME_NO_TSUZUKI, "The Pet Girl Of Sakurasou");
	
	public static final Item GOTOUBUN_NO_KATACHIBY_MUSIC_DISC = new ModItemAnimeRecordBase("gotoubun_no_katachiby", ModSounds.GOTOUBUN_NO_KATACHIBY, "The Quintessential Quintuplets");
	public static final Item GOTOUBUN_NO_KIMOCHI_MUSIC_DISC = new ModItemAnimeRecordBase("gotoubun_no_kimochi", ModSounds.GOTOUBUN_NO_KIMOCHI, "The Quintessential Quintuplets");
	
	public static final Item FAITH_MUSIC_DISC = new ModItemAnimeRecordBase("faith", ModSounds.FAITH, "The Rising Of The Shield Hero");
	
	public static final Item DELETE_MUSIC_DISC = new ModItemAnimeRecordBase("delete", ModSounds.DELETE, "The Seven Deadly Sins");
	public static final Item HIKARI_ARE_MUSIC_DISC = new ModItemAnimeRecordBase("hikari_are", ModSounds.HIKARI_ARE, "The Seven Deadly Sins");
	public static final Item NETSUJO_NO_SPECTRUM_MUSIC_DISC = new ModItemAnimeRecordBase("netsujo_no_spectrum", ModSounds.NETSUJO_NO_SPECTRUM, "The Seven Deadly Sins");
	public static final Item ROB_THE_FRONTIER_MUSIC_DISC = new ModItemAnimeRecordBase("rob_the_frontier", ModSounds.ROB_THE_FRONTIER, "The Seven Deadly Sins");
	public static final Item SEVEN_DEADLY_SINS_MUSIC_DISC = new ModItemAnimeRecordBase("seven_deadly_sins", ModSounds.SEVEN_DEADLY_SINS, "The Seven Deadly Sins");
	
	public static final Item BLADE_OF_HOPE_MUSIC_DISC = new ModItemAnimeRecordBase("blade_of_hope", ModSounds.BLADE_OF_HOPE, "The Testament Of Sister New Devil");
	public static final Item OVER_THE_TESTAMENT_MUSIC_DISC = new ModItemAnimeRecordBase("over_the_testament", ModSounds.OVER_THE_TESTAMENT, "The Testament Of Sister New Devil");
	public static final Item STILL_SIS_MUSIC_DISC = new ModItemAnimeRecordBase("still_sis", ModSounds.STILL_SIS, "The Testament Of Sister New Devil");
	public static final Item TEMPERATURE_MUSIC_DISC = new ModItemAnimeRecordBase("temperature", ModSounds.TEMPERATURE, "The Testament Of Sister New Devil");
	
	public static final Item DARK_SEEKS_LIGHT_MUSIC_DISC = new ModItemAnimeRecordBase("dark_seeks_light", ModSounds.DARK_SEEKS_LIGHT, "The Worlds Finest Assassin ");
	
	public static final Item CRY_BABY_MUSIC_DISC = new ModItemAnimeRecordBase("cry_baby", ModSounds.CRY_BABY, "Tokyo Revengers");
	public static final Item KOKO_DE_IKI_WO_SHITE_MUSIC_DISC = new ModItemAnimeRecordBase("koko_de_iki_wo_shite", ModSounds.KOKO_DE_IKI_WO_SHITE, "Tokyo Revengers");
	public static final Item TOKYO_WONDER_MUSIC_DISC = new ModItemAnimeRecordBase("tokyo_wonder", ModSounds.TOKYO_WONDER, "Tokyo Revengers");
	
	public static final Item KOI_NO_UTA_MUSIC_DISC = new ModItemAnimeRecordBase("koi_no_uta", ModSounds.KOI_NO_UTA, "Tonikawa Over The Moon For You");
	public static final Item TSUKITO_HOSHIZORA_MUSIC_DISC = new ModItemAnimeRecordBase("tsukito_hoshizora", ModSounds.TSUKITO_HOSHIZORA, "Tonikawa Over The Moon For You");
	
	public static final Item PRE_PARADE_MUSIC_DISC = new ModItemAnimeRecordBase("pre_parade", ModSounds.PRE_PARADE, "Toradora");
	
	public static final Item SEVEN_DOORS_MUSIC_DISC = new ModItemAnimeRecordBase("seven_doors", ModSounds.SEVEN_DOORS, "Trinity Seven");
	
	public static final Item AIUE_MUSIC_DISC = new ModItemAnimeRecordBase("aiue", ModSounds.AIUE, "Urusei Yatsura");
	public static final Item NOT_ENOUGH_MUSIC_DISC = new ModItemAnimeRecordBase("not_enough", ModSounds.NOT_ENOUGH, "Urusei Yatsura");
	public static final Item THUNDER_BLOSSOM_MUSIC_DISC = new ModItemAnimeRecordBase("thunder_blossom", ModSounds.THUNDER_BLOSSOM, "Urusei Yatsura");
	public static final Item WANNA_MUCHUUBY_MUSIC_DISC = new ModItemAnimeRecordBase("wanna_muchuuby", ModSounds.WANNA_MUCHUUBY, "Urusei Yatsura");
	
	public static final Item NEGOTIATION_MUSIC_DISC = new ModItemAnimeRecordBase("negotiation", ModSounds.NEGOTIATION, "Uzakichan Wants To Hang Out");
	
	public static final Item NEVER_GIVE_IT_UP_MUSIC_DISC = new ModItemAnimeRecordBase("never_give_it_up", ModSounds.NEVER_GIVE_IT_UP, "We Never Learn Bokuben");
	public static final Item SEISHUN_SEMINAR_MUSIC_DISC = new ModItemAnimeRecordBase("seishun_seminar", ModSounds.SEISHUN_SEMINAR, "We Never Learn Bokuben");
	
	public static final Item BON_KYU_BON_MUSIC_DISC = new ModItemAnimeRecordBase("bon_kyu_bon", ModSounds.BON_KYU_BON, "Why The Hell Are You Here Teacher");
	
	public static final Item CHIKI_CHIKI_BANG_BANG_MUSIC_DISC = new ModItemAnimeRecordBase("chiki_chiki_bang_bang", ModSounds.CHIKI_CHIKI_BANG_BANG, "Ya Boy Kongming ");
	
	public static final Item HIKARUNARA_MUSIC_DISC = new ModItemAnimeRecordBase("hikarunara", ModSounds.HIKARUNARA, "Your Lie In April");
	
	public static final Item ADABANA_NECROMANCY_MUSIC_DISC = new ModItemAnimeRecordBase("adabana_necromancy", ModSounds.ADABANA_NECROMANCY, "Zombieland Saga");
	public static final Item TAIGA_YO_TOMO_NI_NAITE_KURE_MUSIC_DISC = new ModItemAnimeRecordBase("taiga_yo_tomo_ni_naite_kure", ModSounds.TAIGA_YO_TOMO_NI_NAITE_KURE, "Zombieland Saga");
}