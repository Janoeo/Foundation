package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.diabolo.world.IWorldGenerator;
import fr.alasdiablo.diabolo.world.WorldGenerationHelper;
import fr.alasdiablo.janoeo.config.EndConfig;
import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.init.EndOresBlocks;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;

/**
 * The End Ore Generator
 */
public class EndOreGenerator implements IWorldGenerator {
    /**
     * @param biome Biome which receives the ConfiguredFeature
     * @see fr.alasdiablo.diabolo.world.IWorldGenerator
     */
    @Override
    public void startWorldGeneration(Biome biome) {
        final GlobalConfig.Config GLOBAL_CONFIG = GlobalConfig.CONFIG;
        final EndConfig.Config END_CONFIG = EndConfig.CONFIG;

        if (GLOBAL_CONFIG.END_ORE_GEN.get()) {
            if (END_CONFIG.COAL_END_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(EndOresBlocks.COAL_END_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (END_CONFIG.DIAMOND_END_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(EndOresBlocks.DIAMOND_END_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (END_CONFIG.EMERALD_END_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(EndOresBlocks.EMERALD_END_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (END_CONFIG.GOLD_END_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(EndOresBlocks.GOLD_END_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (END_CONFIG.IRON_END_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(EndOresBlocks.IRON_END_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (END_CONFIG.LAPIS_END_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(EndOresBlocks.LAPIS_END_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (END_CONFIG.REDSTONE_END_ORE.get()) {
                WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(EndOresBlocks.REDSTONE_END_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
        }
    }
}
