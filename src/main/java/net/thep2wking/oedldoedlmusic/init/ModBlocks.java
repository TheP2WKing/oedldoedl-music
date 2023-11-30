package net.thep2wking.oedldoedlmusic.init;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.thep2wking.oedldoedlcore.util.ModToolTypes;
import net.thep2wking.oedldoedlmusic.OedldoedlMusic;
import net.thep2wking.oedldoedlmusic.content.block.BlockMusicPlayer;
import net.thep2wking.oedldoedlmusic.content.block.BlockRecordPackage;

public class ModBlocks {
	public static final Block RECORD_PACKAGE = new BlockRecordPackage(OedldoedlMusic.MODID, "record_package", OedldoedlMusic.TAB, Material.WOOD, SoundType.WOOD, MapColor.BROWN_STAINED_HARDENED_CLAY, 1, ModToolTypes.AXE, 1.0f, 1.0f, 0);
	
	public static final Block MUSIC_PLAYER = new BlockMusicPlayer(OedldoedlMusic.MODID, "music_player", OedldoedlMusic.TAB, Material.IRON, SoundType.METAL, MapColor.BLACK, 1, ModToolTypes.PICKAXE, 20.0f, 20.0f, 0);
}