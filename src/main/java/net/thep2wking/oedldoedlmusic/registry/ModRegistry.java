package net.thep2wking.oedldoedlmusic.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;

@Mod.EventBusSubscriber
public class ModRegistry {
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		ModLogger.registeredBlocksLogger(OedldoedlMusic.MODID);
		
		// ModRegistryHelper.registerBlock(event, ModBlocks.RAINBOW);
	}

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		ModLogger.registeredItemsLogger(OedldoedlMusic.MODID);
		// ModRegistryHelper.registerItemBlock(event, ModItems.RAINBOW);

		// ModRegistryHelper.registerItem(event, ModItems.DYNAMITE);
	}

	@SubscribeEvent
	public static void onSoundEventRegister(RegistryEvent.Register<SoundEvent> event) {
		ModLogger.registeredSoundEventsLogger(OedldoedlMusic.MODID);

		// ModRegistryHelper.registerSoundEvent(event, ModSounds.NUKE_ALARM);
	}
}