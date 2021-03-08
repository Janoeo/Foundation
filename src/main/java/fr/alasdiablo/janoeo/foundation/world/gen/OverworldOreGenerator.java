package fr.alasdiablo.janoeo.foundation.world.gen;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.diolib.world.IWorldGenerator;
import fr.alasdiablo.diolib.world.WorldGenerationHelper;
import fr.alasdiablo.janoeo.foundation.config.FrequencyConfig;
import fr.alasdiablo.janoeo.foundation.config.GlobalConfig;
import fr.alasdiablo.janoeo.foundation.config.OverworldConfig;
import fr.alasdiablo.janoeo.foundation.init.OverworldDenseOresBlocks;
import fr.alasdiablo.janoeo.foundation.init.OverworldOresBlocks;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;

/**
 * Overworld Ore Generator
 */
public class OverworldOreGenerator implements IWorldGenerator{

    /**
     * @param biome Biome which receives the ConfiguredFeature
     * @see fr.alasdiablo.diolib.world.IWorldGenerator
     */
    @Override
    public void startWorldGeneration(Biome biome) {
        final GlobalConfig.Config GLOBAL_CONFIG = GlobalConfig.CONFIG;
        final OverworldConfig.Config OVERWORLD_CONFIG = OverworldConfig.CONFIG;
        final FrequencyConfig.Config FREQUENCY_CONFIG = FrequencyConfig.CONFIG;

        if (GLOBAL_CONFIG.EXTRA_ORE_GEN.get()) {

            if (OVERWORLD_CONFIG.COPPER_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.COPPER_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (OVERWORLD_CONFIG.TIN_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.TIN_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (OVERWORLD_CONFIG.ALUMINIUM_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.ALUMINIUM_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (OVERWORLD_CONFIG.URANIUM_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.URANIUM_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (OVERWORLD_CONFIG.OSMIUM_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.OSMIUM_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (OVERWORLD_CONFIG.LEAD_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.LEAD_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (OVERWORLD_CONFIG.SILVER_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.SILVER_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (OVERWORLD_CONFIG.RUBY_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.RUBY_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (OVERWORLD_CONFIG.SAPPHIRE_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.SAPPHIRE_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (OVERWORLD_CONFIG.AMETHYST_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.AMETHYST_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (OVERWORLD_CONFIG.ZINC_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.ZINC_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
        }

        if (GLOBAL_CONFIG.DENSE_ORE_GEN.get()) {
            if (OVERWORLD_CONFIG.DENSE_COAL_ORE.get()) {
                for (int i = 0; i < FREQUENCY_CONFIG.DENSE_COAL_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_COAL_ORE.getRegistryName(), String.valueOf(i))
                        ),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (OVERWORLD_CONFIG.DENSE_DIAMOND_ORE.get()) {
                for (int i = 0; i < FREQUENCY_CONFIG.DENSE_DIAMOND_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_DIAMOND_ORE.getRegistryName(), String.valueOf(i))
                        ),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (OVERWORLD_CONFIG.DENSE_EMERALD_ORE.get()) {
                for (int i = 0; i < FREQUENCY_CONFIG.DENSE_EMERALD_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getRegistryName(), String.valueOf(i))
                        ),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (OVERWORLD_CONFIG.DENSE_GOLD_ORE.get()) {
                for (int i = 0; i < FREQUENCY_CONFIG.DENSE_GOLD_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_GOLD_ORE.getRegistryName(), String.valueOf(i))
                        ),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (OVERWORLD_CONFIG.DENSE_IRON_ORE.get()) {
                for (int i = 0; i < FREQUENCY_CONFIG.DENSE_IRON_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_IRON_ORE.getRegistryName(), String.valueOf(i))
                        ),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (OVERWORLD_CONFIG.DENSE_LAPIS_ORE.get()) {
                for (int i = 0; i < FREQUENCY_CONFIG.DENSE_LAPIS_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_LAPIS_ORE.getRegistryName(), String.valueOf(i))
                        ),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (OVERWORLD_CONFIG.DENSE_REDSTONE_ORE.get()) {
                for (int i = 0; i < FREQUENCY_CONFIG.DENSE_REDSTONE_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_REDSTONE_ORE.getRegistryName(), String.valueOf(i))
                        ),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (GLOBAL_CONFIG.EXTRA_ORE_GEN.get()) {
                if (OVERWORLD_CONFIG.DENSE_COPPER_ORE.get()) {
                    for (int i = 0; i < FREQUENCY_CONFIG.DENSE_COPPER_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                    RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_COPPER_ORE.getRegistryName(), String.valueOf(i))
                            ),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (OVERWORLD_CONFIG.DENSE_TIN_ORE.get()) {
                    for (int i = 0; i < FREQUENCY_CONFIG.DENSE_TIN_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                    RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_TIN_ORE.getRegistryName(), String.valueOf(i))
                            ),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
            }
        }
    }
}
