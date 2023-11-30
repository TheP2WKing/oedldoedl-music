package net.thep2wking.oedldoedlmusic.util.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;
import net.thep2wking.oedldoedlmusic.util.network.PacketHandler;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		PacketHandler.registerMessages(OedldoedlMusic.MODID);
	}

	public void init(FMLInitializationEvent event) {
	}

	public void postInit(FMLPostInitializationEvent event) {
	}

	public void render() {
	}
}