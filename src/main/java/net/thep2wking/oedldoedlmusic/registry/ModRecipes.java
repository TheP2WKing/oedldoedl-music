package net.thep2wking.oedldoedlmusic.registry;

import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;

public class ModRecipes {
	public static void registerOreDict() {
		ModLogger.registeredOreDictLogger(OedldoedlMusic.MODID);
	}

	public static void registerRecipes() {
		ModLogger.registeredRecipesLogger(OedldoedlMusic.MODID);
	}
}