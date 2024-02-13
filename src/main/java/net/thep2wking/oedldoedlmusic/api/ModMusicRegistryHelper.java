package net.thep2wking.oedldoedlmusic.api;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;

public class ModMusicRegistryHelper {
    // all anime music discs use the same model
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event, String modId) {
        ModLogger.registeredModelsLogger(modId);
        for (Item item : ForgeRegistries.ITEMS.getValuesCollection()) {
            if (item.getRegistryName().getResourceDomain().equals(modId) && item instanceof ModItemAnimeRecordBase) {
                ModelLoader.setCustomModelResourceLocation(item, 0,
                        new ModelResourceLocation(OedldoedlMusic.MODID + ":anime_music_disc", "normal"));
            } else if (item.getRegistryName().getResourceDomain().equals(modId)
                    && !(item instanceof ModItemAnimeRecordBase)) {
                ModelLoader.setCustomModelResourceLocation(item, 0,
                        new ModelResourceLocation(item.getRegistryName(), "normal"));
            }
        }
    }
}