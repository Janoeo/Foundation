package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.config.GravelConfig;
import fr.alasdiablo.janoeo.init.GravelsOresBlocks;
import fr.alasdiablo.janoeo.util.Utils;
import fr.alasdiablo.janoeo.world.OreGenUtils;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;

public class GravelOreGenerator {

    private static final GlobalConfig.Config GLOBAL_CONFIG = GlobalConfig.CONFIG;
    private static final GravelConfig.Config GRAVEL_CONFIG = GravelConfig.CONFIG;

    public static class Overworld implements IWorldGenerator {

        @Override
        public void startWorldGeneration(Biome biome) {
            if (GLOBAL_CONFIG.GRAVEL_ORE_GEN.get()) {
                if (GRAVEL_CONFIG.IRON_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.field_243653_e.getOrDefault(GravelsOresBlocks.IRON_GRAVEL_ORE.getRegistryName())
                    );
                }
                if (GRAVEL_CONFIG.GOLD_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.field_243653_e.getOrDefault(GravelsOresBlocks.GOLD_GRAVEL_ORE.getRegistryName())
                    );
                }
                if (GRAVEL_CONFIG.DIAMOND_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.field_243653_e.getOrDefault(GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getRegistryName())
                    );
                }
            }
        }
    }

    public static class Nether implements IWorldGenerator {

        @Override
        public void startWorldGeneration(Biome biome) {
            if (GLOBAL_CONFIG.GRAVEL_ORE_GEN.get()) {
                if (GRAVEL_CONFIG.IRON_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.field_243653_e.getOrDefault(
                                    Utils.setPrefixOnRegistryName(GravelsOresBlocks.IRON_GRAVEL_ORE.getRegistryName(), "nether")
                            )
                    );
                }
                if (GRAVEL_CONFIG.GOLD_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.field_243653_e.getOrDefault(
                                    Utils.setPrefixOnRegistryName(GravelsOresBlocks.GOLD_GRAVEL_ORE.getRegistryName(), "nether")
                            )
                    );
                }
                if (GRAVEL_CONFIG.DIAMOND_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.field_243653_e.getOrDefault(
                                    Utils.setPrefixOnRegistryName(GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getRegistryName(), "nether")
                            )
                    );
                }
            }
        }
    }

    public static class Ocean implements IWorldGenerator {

        @Override
        public void startWorldGeneration(Biome biome) {
            if (GLOBAL_CONFIG.GRAVEL_ORE_GEN.get()) {
                if (GRAVEL_CONFIG.IRON_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.field_243653_e.getOrDefault(
                                    Utils.setPrefixOnRegistryName(GravelsOresBlocks.IRON_GRAVEL_ORE.getRegistryName(), "ocean")
                            )
                    );
                }
                if (GRAVEL_CONFIG.GOLD_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.field_243653_e.getOrDefault(
                                    Utils.setPrefixOnRegistryName(GravelsOresBlocks.GOLD_GRAVEL_ORE.getRegistryName(), "ocean")
                            )
                    );
                }
                if (GRAVEL_CONFIG.DIAMOND_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.field_243653_e.getOrDefault(
                                    Utils.setPrefixOnRegistryName(GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getRegistryName(), "ocean")
                            )
                    );
                }
            }
        }
    }
}
