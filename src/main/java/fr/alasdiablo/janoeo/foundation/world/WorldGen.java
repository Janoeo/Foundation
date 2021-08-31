package fr.alasdiablo.janoeo.foundation.world;

import fr.alasdiablo.diolib.world.WorldGenerationHelper;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.world.gen.FoundationFeatures;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.registries.ForgeRegistries;

public class WorldGen {
    public static void init() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            oreGen(biome);
        }
    }

    private static void oreGen(Biome biome) {
        if (FoundationConfig.TINY_COAL_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_COAL, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_COPPER_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_COPPER, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_DIAMOND_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_DIAMOND, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_EMERALD_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_EMERALD, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_GOLD_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_GOLD, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_GOLD_ORE_EXTRA_CONFIG.isEnable()
                && biome.getBiomeCategory() == Biome.BiomeCategory.MESA) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_GOLD_EXTRA, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_IRON_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_IRON, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_LAPIS_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_LAPIS, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_REDSTONE_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TINY_REDSTONE, GenerationStep.Decoration.UNDERGROUND_ORES
        );

        if (FoundationConfig.BAUXITE_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_BAUXITE, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.LEAD_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_LEAD, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.NICKEL_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_NICKEL, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.SILVER_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_SILVER, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TIN_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_TIN, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.URANIUM_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.ORE_URANIUM, GenerationStep.Decoration.UNDERGROUND_ORES
        );

        if (FoundationConfig.TINY_BAUXITE_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.TINY_ORE_BAUXITE, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_LEAD_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.TINY_ORE_LEAD, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_NICKEL_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.TINY_ORE_NICKEL, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_SILVER_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.TINY_ORE_SILVER, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_TIN_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.TINY_ORE_TIN, GenerationStep.Decoration.UNDERGROUND_ORES
        );
        if (FoundationConfig.TINY_URANIUM_ORE_CONFIG.isEnable()) WorldGenerationHelper.addFeature(
                biome, FoundationFeatures.TINY_ORE_URANIUM, GenerationStep.Decoration.UNDERGROUND_ORES
        );
    }
}
