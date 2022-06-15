package fr.alasdiablo.janoeo.foundation.init;

import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.worldgen.placement.FoundationPlacements;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import org.jetbrains.annotations.NotNull;

public class FoundationGeneration {

    public static void onBiomeLoading(@NotNull BiomeLoadingEvent biomeLoadingEvent) {
        var generation    = biomeLoadingEvent.getGeneration();
        var biomeCategory = biomeLoadingEvent.getCategory();


        addOre(generation);
        addTinyOre(generation, biomeCategory);
        addNetherOre(generation);
        addGravelOre(generation);

//        if (biomeCategory != Biome.BiomeCategory.NETHER && biomeCategory != Biome.BiomeCategory.THEEND) {
//            addOre(generation);
//            addTinyOre(generation, biomeCategory);
//        }
//
//        if (biomeCategory == Biome.BiomeCategory.NETHER) {
//            addNetherOre(generation);
//        }
    }

    private static void addOre(BiomeGenerationSettingsBuilder generation) {
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
    }

    private static void addTinyOre(BiomeGenerationSettingsBuilder generation, Biome.BiomeCategory biomeCategory) {
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
        if (FoundationConfig.TINY_GOLD_ORE_EXTRA_CONFIG.isEnable() && biomeCategory == Biome.BiomeCategory.MESA)
            generation.addFeature(
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

        if (FoundationConfig.TINY_BAUXITE_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_TINY_BAUXITE
        );
        if (FoundationConfig.TINY_LEAD_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_TINY_LEAD
        );
        if (FoundationConfig.TINY_NICKEL_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_TINY_NICKEL
        );
        if (FoundationConfig.TINY_SILVER_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_TINY_SILVER
        );
        if (FoundationConfig.TINY_TIN_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_TINY_TIN
        );
        if (FoundationConfig.TINY_URANIUM_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_TINY_URANIUM
        );
    }

    private static void addNetherOre(BiomeGenerationSettingsBuilder generation) {
        if (FoundationConfig.NETHER_COAL_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_NETHER_COAL
        );
        if (FoundationConfig.NETHER_COPPER_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_NETHER_COPPER
        );
        if (FoundationConfig.NETHER_DIAMOND_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_NETHER_DIAMOND
        );
        if (FoundationConfig.NETHER_EMERALD_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_NETHER_EMERALD
        );
        if (FoundationConfig.NETHER_IRON_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_NETHER_IRON
        );
        if (FoundationConfig.NETHER_LAPIS_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_NETHER_LAPIS
        );
        if (FoundationConfig.NETHER_REDSTONE_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_NETHER_REDSTONE
        );

        if (FoundationConfig.NETHER_BAUXITE_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_NETHER_BAUXITE
        );
        if (FoundationConfig.NETHER_LEAD_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_NETHER_LEAD
        );
        if (FoundationConfig.NETHER_NICKEL_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_NETHER_NICKEL
        );
        if (FoundationConfig.NETHER_SILVER_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_NETHER_SILVER
        );
        if (FoundationConfig.NETHER_TIN_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_NETHER_TIN
        );
        if (FoundationConfig.NETHER_URANIUM_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_NETHER_URANIUM
        );
    }

    private static void addGravelOre(BiomeGenerationSettingsBuilder generation) {
        if (FoundationConfig.GRAVEL_COAL_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_GRAVEL_COAL
        );
        if (FoundationConfig.GRAVEL_COPPER_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_GRAVEL_COPPER
        );
        if (FoundationConfig.GRAVEL_DIAMOND_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_GRAVEL_DIAMOND
        );
        if (FoundationConfig.GRAVEL_EMERALD_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_GRAVEL_EMERALD
        );
        if (FoundationConfig.GRAVEL_IRON_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_GRAVEL_IRON
        );
        if (FoundationConfig.GRAVEL_LAPIS_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_GRAVEL_LAPIS
        );
        if (FoundationConfig.GRAVEL_REDSTONE_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_GRAVEL_REDSTONE
        );

        if (FoundationConfig.GRAVEL_BAUXITE_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_GRAVEL_BAUXITE
        );
        if (FoundationConfig.GRAVEL_LEAD_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_GRAVEL_LEAD
        );
        if (FoundationConfig.GRAVEL_NICKEL_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_GRAVEL_NICKEL
        );
        if (FoundationConfig.GRAVEL_SILVER_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_GRAVEL_SILVER
        );
        if (FoundationConfig.GRAVEL_TIN_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_GRAVEL_TIN
        );
        if (FoundationConfig.GRAVEL_URANIUM_ORE_CONFIG.isEnable()) generation.addFeature(
                GenerationStep.Decoration.UNDERGROUND_ORES, FoundationPlacements.ORE_GRAVEL_URANIUM
        );
    }
}
