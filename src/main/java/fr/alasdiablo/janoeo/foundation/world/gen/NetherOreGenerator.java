package fr.alasdiablo.janoeo.foundation.world.gen;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.diolib.world.IWorldGenerator;
import fr.alasdiablo.diolib.world.WorldGenerationHelper;
import fr.alasdiablo.janoeo.foundation.config.FrequencyConfig;
import fr.alasdiablo.janoeo.foundation.config.GlobalConfig;
import fr.alasdiablo.janoeo.foundation.config.NetherConfig;
import fr.alasdiablo.janoeo.foundation.init.NetherDenseOresBlocks;
import fr.alasdiablo.janoeo.foundation.init.NetherOresBlocks;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;

/**
 * Nether Ore Generator
 */
public class NetherOreGenerator implements IWorldGenerator {
    /**
     * @param biome Biome which receives the ConfiguredFeature
     * @see fr.alasdiablo.diolib.world.IWorldGenerator
     */
    @Override
    public void startWorldGeneration(Biome biome) {
        final GlobalConfig.Config GLOBAL_CONFIG = GlobalConfig.CONFIG;
        final NetherConfig.Config NETHER_CONFIG = NetherConfig.CONFIG;
        final FrequencyConfig.Config FREQUENCY_CONFIG = FrequencyConfig.CONFIG;

        if (GLOBAL_CONFIG.NETHER_ORE_GEN.get()) {
            if (NETHER_CONFIG.COAL_NETHER_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.COAL_NETHER_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (NETHER_CONFIG.IRON_NETHER_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.IRON_NETHER_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (NETHER_CONFIG.GOLD_NETHER_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.GOLD_NETHER_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (NETHER_CONFIG.REDSTONE_NETHER_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.REDSTONE_NETHER_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (NETHER_CONFIG.LAPIS_NETHER_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.LAPIS_NETHER_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (NETHER_CONFIG.DIAMOND_NETHER_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.DIAMOND_NETHER_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (NETHER_CONFIG.EMERALD_NETHER_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.EMERALD_NETHER_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (GLOBAL_CONFIG.NETHER_DENSE_ORE_GEN.get()) {
                if (NETHER_CONFIG.DENSE_COAL_NETHER_ORE.get()) {
                    if (NETHER_CONFIG.DENSE_COAL_NETHER_ORE.get()) {
                        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_COAL_NETHER_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                                biome,
                                WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                        RegistryHelper.setPrefixOnRegistryName(NetherDenseOresBlocks.DENSE_COAL_NETHER_ORE.getRegistryName(), String.valueOf(i))
                                ),
                                GenerationStage.Decoration.UNDERGROUND_ORES
                        );
                    }
                    if (NETHER_CONFIG.DENSE_DIAMOND_NETHER_ORE.get()) {
                        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_DIAMOND_NETHER_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                                biome,
                                WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                        RegistryHelper.setPrefixOnRegistryName(NetherDenseOresBlocks.DENSE_DIAMOND_NETHER_ORE.getRegistryName(), String.valueOf(i))
                                ),
                                GenerationStage.Decoration.UNDERGROUND_ORES
                        );
                    }
                    if (NETHER_CONFIG.EMERALD_NETHER_ORE.get()) {
                        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_EMERALD_NETHER_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                                biome,
                                WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                        RegistryHelper.setPrefixOnRegistryName(NetherDenseOresBlocks.DENSE_EMERALD_NETHER_ORE.getRegistryName(), String.valueOf(i))
                                ),
                                GenerationStage.Decoration.UNDERGROUND_ORES
                        );
                    }
                    if (NETHER_CONFIG.DENSE_GOLD_NETHER_ORE.get()) {
                        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_GOLD_NETHER_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                                biome,
                                WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                        RegistryHelper.setPrefixOnRegistryName(NetherDenseOresBlocks.DENSE_GOLD_NETHER_ORE.getRegistryName(), String.valueOf(i))
                                ),
                                GenerationStage.Decoration.UNDERGROUND_ORES
                        );
                    }
                     if (NETHER_CONFIG.DENSE_IRON_NETHER_ORE.get()) {
                        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_IRON_NETHER_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                                biome,
                                WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                        RegistryHelper.setPrefixOnRegistryName(NetherDenseOresBlocks.DENSE_IRON_NETHER_ORE.getRegistryName(), String.valueOf(i))
                                ),
                                GenerationStage.Decoration.UNDERGROUND_ORES
                        );
                    }
                     if (NETHER_CONFIG.DENSE_LAPIS_NETHER_ORE.get()) {
                        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_LAPIS_NETHER_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                                biome,
                                WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                        RegistryHelper.setPrefixOnRegistryName(NetherDenseOresBlocks.DENSE_LAPIS_NETHER_ORE.getRegistryName(), String.valueOf(i))
                                ),
                                GenerationStage.Decoration.UNDERGROUND_ORES
                        );
                    }
                    if (NETHER_CONFIG.DENSE_REDSTONE_NETHER_ORE.get()) {
                        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_REDSTONE_NETHER_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                                biome,
                                WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                        RegistryHelper.setPrefixOnRegistryName(NetherDenseOresBlocks.DENSE_REDSTONE_NETHER_ORE.getRegistryName(), String.valueOf(i))
                                ),
                                GenerationStage.Decoration.UNDERGROUND_ORES
                        );
                    }
                    if (NETHER_CONFIG.DENSE_QUARTZ_NETHER_ORE.get()) {
                        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_QUARTZ_NETHER_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                                biome,
                                WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                        RegistryHelper.setPrefixOnRegistryName(NetherDenseOresBlocks.DENSE_QUARTZ_NETHER_ORE.getRegistryName(), String.valueOf(i))
                                ),
                                GenerationStage.Decoration.UNDERGROUND_ORES
                        );
                    }
                }
            }


            if (GLOBAL_CONFIG.EXTRA_NETHER_ORE_GEN.get()) {
                if (NETHER_CONFIG.COPPER_NETHER_ORE.get()) {
                    WorldGenerationHelper.addFeature(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.COPPER_NETHER_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (NETHER_CONFIG.ALUMINIUM_NETHER_ORE.get()) {
                    WorldGenerationHelper.addFeature(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.ALUMINIUM_NETHER_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (NETHER_CONFIG.RUBY_NETHER_ORE.get()) {
                    WorldGenerationHelper.addFeature(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.RUBY_NETHER_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (NETHER_CONFIG.SAPPHIRE_NETHER_ORE.get()) {
                    WorldGenerationHelper.addFeature(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.SAPPHIRE_NETHER_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (NETHER_CONFIG.SILVER_NETHER_ORE.get()) {
                    WorldGenerationHelper.addFeature(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.SILVER_NETHER_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (NETHER_CONFIG.TIN_NETHER_ORE.get()) {
                    WorldGenerationHelper.addFeature(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.TIN_NETHER_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (NETHER_CONFIG.URANIUM_NETHER_ORE.get()) {
                    WorldGenerationHelper.addFeature(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.URANIUM_NETHER_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (NETHER_CONFIG.OSMIUM_NETHER_ORE.get()) {
                    WorldGenerationHelper.addFeature(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.OSMIUM_NETHER_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
            }
        }
    }
}
