package fr.alasdiablo.janoeo.foundation.init;

import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.worldgen.placement.FoundationPlacements;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FoundationGeneration {

    public static void onBiomeLoading(BiomeLoadingEvent biomeLoadingEvent) {
        var generation = biomeLoadingEvent.getGeneration();

        if (FoundationConfig.TINY_COAL_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_TINY_COAL
        );
        if (FoundationConfig.TINY_COPPER_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_TINY_COPPER
        );
        if (FoundationConfig.TINY_DIAMOND_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_TINY_DIAMOND
        );
        if (FoundationConfig.TINY_EMERALD_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_TINY_EMERALD
        );
        if (FoundationConfig.TINY_GOLD_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_TINY_GOLD
        );
        if (FoundationConfig.TINY_GOLD_ORE_EXTRA_CONFIG.isEnable()
                && biomeLoadingEvent.getCategory() == Biome.BiomeCategory.MESA) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_TINY_GOLD_EXTRA
        );
        if (FoundationConfig.TINY_IRON_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_TINY_IRON
        );
        if (FoundationConfig.TINY_LAPIS_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_TINY_LAPIS
        );
        if (FoundationConfig.TINY_REDSTONE_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_TINY_REDSTONE
        );

        if (FoundationConfig.BAUXITE_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_BAUXITE
        );
        if (FoundationConfig.LEAD_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_LEAD
        );
        if (FoundationConfig.NICKEL_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_NICKEL
        );
        if (FoundationConfig.SILVER_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_SILVER
        );
        if (FoundationConfig.TIN_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_TIN
        );
        if (FoundationConfig.URANIUM_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_URANIUM
        );

        if (FoundationConfig.TINY_BAUXITE_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.TINY_ORE_BAUXITE
        );
        if (FoundationConfig.TINY_LEAD_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.TINY_ORE_LEAD
        );
        if (FoundationConfig.TINY_NICKEL_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.TINY_ORE_NICKEL
        );
        if (FoundationConfig.TINY_SILVER_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.TINY_ORE_SILVER
        );
        if (FoundationConfig.TINY_TIN_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.TINY_ORE_TIN
        );
        if (FoundationConfig.TINY_URANIUM_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.TINY_ORE_URANIUM
        );
    }
}
