package net.thep2wking.oedldoedlmusic.config.categories;

import net.minecraftforge.common.config.Config;

public class Integration {
	@Config.Name("jei")
	public final JEI JEI = new JEI();

	public static class JEI {
		@Config.Name("Record Package Recipe Category")
		public boolean RECORD_PACKAGE_RECIPE_CATEGORY = true;
	}
}