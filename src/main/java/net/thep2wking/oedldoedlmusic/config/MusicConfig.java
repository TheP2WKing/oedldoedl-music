package net.thep2wking.oedldoedlmusic.config;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.oedldoedlcore.util.ModReferences;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;
import net.thep2wking.oedldoedlmusic.config.categories.Content;
import net.thep2wking.oedldoedlmusic.config.categories.Properties;
import net.thep2wking.oedldoedlmusic.config.categories.Recipes;

@Config(modid = OedldoedlMusic.MODID, name = ModReferences.BASE_MODID + "/"
        + OedldoedlMusic.MODID, category = OedldoedlMusic.MODID)
public class MusicConfig {
    @Config.Name("content")
    public static final Content CONTENT = new Content();

    @Config.Name("properties")
    public static final Properties PROPERTIES = new Properties();

    @Config.Name("recipes")
    public static final Recipes RECIPES = new Recipes();
    
    @Mod.EventBusSubscriber
    public static class ConfigHolder {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(OedldoedlMusic.MODID)) {
                ConfigManager.sync(OedldoedlMusic.MODID, Config.Type.INSTANCE);
            }
        }
    }
}