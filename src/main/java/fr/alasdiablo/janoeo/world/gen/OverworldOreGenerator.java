package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.janoeo.init.OverworldOresBlocks;
import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.config.OverworldConfig;
import fr.alasdiablo.janoeo.world.OreGenUtils;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;

public class OverworldOreGenerator implements IWorldGenerator {

    @Override
    public void startWorldGeneration(Biome biome) {
        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        OverworldConfig.Config overworldConfig = OverworldConfig.CONFIG;

        if (globalConfig.EXTRA_ORE_GEN.get()) {

            if (overworldConfig.COPPER_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.COPPER_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (overworldConfig.TIN_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.TIN_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (overworldConfig.ALUMINIUM_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.ALUMINIUM_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (overworldConfig.URANIUM_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.URANIUM_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (overworldConfig.LEAD_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.LEAD_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (overworldConfig.SILVER_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.SILVER_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (overworldConfig.RUBY_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.RUBY_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (overworldConfig.SAPPHIRE_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.SAPPHIRE_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (overworldConfig.AMETHYST_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.AMETHYST_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }

            if (overworldConfig.ZINC_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.ZINC_ORE.getRegistryName()),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
        }
    }
}
