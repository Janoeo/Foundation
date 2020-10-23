package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.janoeo.init.NetherOresBlocks;
import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.config.NetherConfig;
import fr.alasdiablo.janoeo.world.OreGenUtils;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;

public class NetherOreGenerator implements IWorldGenerator {
    @Override
    public void startWorldGeneration(Biome biome) {
        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        NetherConfig.Config netherConfig = NetherConfig.CONFIG;

        if (globalConfig.NETHER_ORE_GEN.get()) {
            if (netherConfig.COAL_NETHER_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.COAL_NETHER_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (netherConfig.IRON_NETHER_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.IRON_NETHER_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (netherConfig.GOLD_NETHER_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.GOLD_NETHER_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (netherConfig.REDSTONE_NETHER_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.REDSTONE_NETHER_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (netherConfig.LAPIS_NETHER_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.LAPIS_NETHER_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (globalConfig.EXTRA_NETHER_ORE_GEN.get()) {
                if (netherConfig.COPPER_NETHER_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.COPPER_NETHER_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (netherConfig.ALUMINIUM_NETHER_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.ALUMINIUM_NETHER_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (netherConfig.RUBY_NETHER_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.RUBY_NETHER_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (netherConfig.SAPPHIRE_NETHER_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.SAPPHIRE_NETHER_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (netherConfig.SILVER_NETHER_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.SILVER_NETHER_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (netherConfig.TIN_NETHER_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.TIN_NETHER_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (netherConfig.URANIUM_NETHER_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(NetherOresBlocks.URANIUM_NETHER_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
            }
        }
    }
}
