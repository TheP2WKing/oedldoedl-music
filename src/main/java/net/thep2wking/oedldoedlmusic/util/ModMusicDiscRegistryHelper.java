package net.thep2wking.oedldoedlmusic.util;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;

public class ModMusicDiscRegistryHelper {
	public static void registerAnimeRecordItem(RegistryEvent.Register<Item> event, Item item) {
        event.getRegistry().register(item);
        registerAnimeRecordRender(item);
    }

	public static void registerAnimeRecordRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation("oedldoedlmusic:anime_music_disc", "inventory"));
    }
}
