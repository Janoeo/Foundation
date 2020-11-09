package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.config.GravelConfig;
import fr.alasdiablo.janoeo.init.GravelsOresBlocks;
import fr.alasdiablo.janoeo.util.Utils;
import fr.alasdiablo.janoeo.world.OreGenUtils;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;

/**
 * Gravel Ore Generator Handler
 */
public class GravelOreGenerator {

    /**
     * Instance of the Global config
     */
    private static final GlobalConfig.Config GLOBAL_CONFIG = GlobalConfig.CONFIG;
    /**
     * Instance of the Gravel config
     */
    private static final GravelConfig.Config GRAVEL_CONFIG = GravelConfig.CONFIG;

    /**
     * Overworld Gravel Ore Generator
     */
    public static class Overworld implements IWorldGenerator {

        /**
         * @param biome Biome which receives the ConfiguredFeature
         * @see fr.alasdiablo.janoeo.world.gen.IWorldGenerator
         */
        @Override
        public void startWorldGeneration(Biome biome) {
            if (GLOBAL_CONFIG.GRAVEL_ORE_GEN.get()) {
                if (GRAVEL_CONFIG.IRON_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(GravelsOresBlocks.IRON_GRAVEL_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (GRAVEL_CONFIG.GOLD_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(GravelsOresBlocks.GOLD_GRAVEL_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (GRAVEL_CONFIG.DIAMOND_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
            }
        }
    }

    /**
     * Nether Gravel Ore Generator
     */
    public static class Nether implements IWorldGenerator {

        /**
         * @param biome Biome which receives the ConfiguredFeature
         * @see fr.alasdiablo.janoeo.world.gen.IWorldGenerator
         */
        @Override
        public void startWorldGeneration(Biome biome) {
            if (GLOBAL_CONFIG.GRAVEL_ORE_GEN.get()) {
                if (GRAVEL_CONFIG.IRON_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                    Utils.setPrefixOnRegistryName(GravelsOresBlocks.IRON_GRAVEL_ORE.getRegistryName(), "nether")
                            ),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (GRAVEL_CONFIG.GOLD_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                    Utils.setPrefixOnRegistryName(GravelsOresBlocks.GOLD_GRAVEL_ORE.getRegistryName(), "nether")
                            ),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (GRAVEL_CONFIG.DIAMOND_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                    Utils.setPrefixOnRegistryName(GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getRegistryName(), "nether")
                            ),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
            }
        }
    }

    /**
     * Ocean Gravel Ore Generator
     */
    public static class Ocean implements IWorldGenerator {

        /**
         * @param biome Biome which receives the ConfiguredFeature
         * @see fr.alasdiablo.janoeo.world.gen.IWorldGenerator
         */
        @Override
        public void startWorldGeneration(Biome biome) {
            if (GLOBAL_CONFIG.GRAVEL_ORE_GEN.get()) {
                if (GRAVEL_CONFIG.IRON_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                    Utils.setPrefixOnRegistryName(GravelsOresBlocks.IRON_GRAVEL_ORE.getRegistryName(), "ocean")
                            ),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (GRAVEL_CONFIG.GOLD_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                    Utils.setPrefixOnRegistryName(GravelsOresBlocks.GOLD_GRAVEL_ORE.getRegistryName(), "ocean")
                            ),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (GRAVEL_CONFIG.DIAMOND_GRAVEL_ORE.get()) {
                    OreGenUtils.addFeatureToBiome(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                    Utils.setPrefixOnRegistryName(GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getRegistryName(), "ocean")
                            ),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
            }
        }
    }
}
