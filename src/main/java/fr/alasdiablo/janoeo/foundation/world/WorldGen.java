package fr.alasdiablo.janoeo.foundation.world;

import fr.alasdiablo.diolib.world.WorldGenerationHelper;
import fr.alasdiablo.janoeo.foundation.world.gen.FoundationFeatures;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.registries.ForgeRegistries;

public class WorldGen {
    public static void init() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            oreGen(biome);
        }
    }

    private static void oreGen(Biome biome) {
        WorldGenerationHelper.addFeature(biome, FoundationFeatures.ORE_TINY_GOLD, GenerationStage.Decoration.UNDERGROUND_ORES);
        WorldGenerationHelper.addFeature(biome, FoundationFeatures.ORE_TINY_GOLD_EXTRA, GenerationStage.Decoration.UNDERGROUND_ORES);
        WorldGenerationHelper.addFeature(biome, FoundationFeatures.ORE_TINY_IRON, GenerationStage.Decoration.UNDERGROUND_ORES);
        WorldGenerationHelper.addFeature(biome, FoundationFeatures.ORE_TINY_LAPIS, GenerationStage.Decoration.UNDERGROUND_ORES);
    }
}
