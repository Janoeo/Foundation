package fr.alasdiablo.janoeo.util;

import net.minecraft.block.Block;
import net.minecraftforge.registries.IForgeRegistry;

public class Utils {
    public static void registerBlock(IForgeRegistry<Block> registry, Block... blocks) {
        for (Block block : blocks) {
            registry.register(block);
        }
    }
}
