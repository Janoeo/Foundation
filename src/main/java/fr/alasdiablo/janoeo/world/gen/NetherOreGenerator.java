package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.janoeo.block.NetherOre;
import fr.alasdiablo.janoeo.init.NetherOresBlocks;
import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.config.NetherConfig;
import fr.alasdiablo.janoeo.world.OreGenUtils;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;

public class NetherOreGenerator implements IWorldGenerator {
    @Override
    public void startWorldGeneration(Biome biome) {
        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        NetherConfig.Config netherConfig = NetherConfig.CONFIG;

        if (globalConfig.NETHER_ORE_GEN.get()) {
            if (netherConfig.COAL_NETHER_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.field_243653_e.getOrDefault(NetherOresBlocks.COAL_NETHER_ORE.getRegistryName())
                );
            }
            if (netherConfig.IRON_NETHER_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.field_243653_e.getOrDefault(NetherOresBlocks.IRON_NETHER_ORE.getRegistryName())
                );
            }
            if (netherConfig.GOLD_NETHER_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.field_243653_e.getOrDefault(NetherOresBlocks.GOLD_NETHER_ORE.getRegistryName())
                );
            }
            if (netherConfig.REDSTONE_NETHER_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.field_243653_e.getOrDefault(NetherOresBlocks.REDSTONE_NETHER_ORE.getRegistryName())
                );
            }
            if (netherConfig.LAPIS_NETHER_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.field_243653_e.getOrDefault(NetherOresBlocks.LAPIS_NETHER_ORE.getRegistryName())
                );
            }
            if (globalConfig.EXTRA_NETHER_ORE_GEN.get()) {
                if (netherConfig.COPPER_NETHER_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.field_243653_e.getOrDefault(NetherOresBlocks.COPPER_NETHER_ORE.getRegistryName())
                    );
                }
                if (netherConfig.ALUMINIUM_NETHER_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.field_243653_e.getOrDefault(NetherOresBlocks.ALUMINIUM_NETHER_ORE.getRegistryName())
                    );
                }
                if (netherConfig.RUBY_NETHER_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.field_243653_e.getOrDefault(NetherOresBlocks.RUBY_NETHER_ORE.getRegistryName())
                    );
                }
                if (netherConfig.SAPPHIRE_NETHER_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.field_243653_e.getOrDefault(NetherOresBlocks.SAPPHIRE_NETHER_ORE.getRegistryName())
                    );
                }
                if (netherConfig.SILVER_NETHER_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.field_243653_e.getOrDefault(NetherOresBlocks.SILVER_NETHER_ORE.getRegistryName())
                    );
                }
                if (netherConfig.TIN_NETHER_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.field_243653_e.getOrDefault(NetherOresBlocks.TIN_NETHER_ORE.getRegistryName())
                    );
                }
                if (netherConfig.URANIUM_NETHER_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.field_243653_e.getOrDefault(NetherOresBlocks.URANIUM_NETHER_ORE.getRegistryName())
                    );
                }
            }
        }
    }
}
