package fr.alasdiablo.janoeo.foundation.world;

import fr.alasdiablo.diolib.world.WorldGenerationHelper;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
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
        if (FoundationConfig.TINY_COAL_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_COAL, GenerationStage.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_COPPER_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_COPPER, GenerationStage.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_DIAMOND_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_DIAMOND, GenerationStage.Decoration.UNDERGROUND_ORES
        );
        // add emerald
        if (FoundationConfig.TINY_GOLD_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_GOLD, GenerationStage.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_GOLD_ORE_EXTRA_CONFIG.isEnable()
                && biome.getBiomeCategory() == Biome.Category.MESA) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_GOLD_EXTRA, GenerationStage.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_IRON_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_IRON, GenerationStage.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_LAPIS_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_LAPIS, GenerationStage.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_REDSTONE_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_REDSTONE, GenerationStage.Decoration.UNDERGROUND_ORES
        );
    }
}
