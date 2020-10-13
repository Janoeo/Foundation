package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.janoeo.init.OverworldOresBlocks;
import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.config.OverworldConfig;
import fr.alasdiablo.janoeo.world.OreGenUtils;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;

public class OverworldOreGenerator implements IWorldGenerator {

    @Override
    public void startWorldGeneration(Biome biome) {
        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        OverworldConfig.Config overworldConfig = OverworldConfig.CONFIG;

        if (globalConfig.EXTRA_ORE_GEN.get()) {

            if (overworldConfig.COPPER_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.field_243653_e.getOrDefault(OverworldOresBlocks.COPPER_ORE.getRegistryName())
                );
            }

            if (overworldConfig.TIN_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.field_243653_e.getOrDefault(OverworldOresBlocks.TIN_ORE.getRegistryName())
                );
            }

            if (overworldConfig.ALUMINIUM_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.field_243653_e.getOrDefault(OverworldOresBlocks.ALUMINIUM_ORE.getRegistryName())
                );
            }

            if (overworldConfig.URANIUM_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.field_243653_e.getOrDefault(OverworldOresBlocks.URANIUM_ORE.getRegistryName())
                );
            }

            if (overworldConfig.LEAD_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.field_243653_e.getOrDefault(OverworldOresBlocks.LEAD_ORE.getRegistryName())
                );
            }

            if (overworldConfig.SILVER_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.field_243653_e.getOrDefault(OverworldOresBlocks.SILVER_ORE.getRegistryName())
                );
            }

            if (overworldConfig.RUBY_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.field_243653_e.getOrDefault(OverworldOresBlocks.RUBY_ORE.getRegistryName())
                );
            }

            if (overworldConfig.SAPPHIRE_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.field_243653_e.getOrDefault(OverworldOresBlocks.SAPPHIRE_ORE.getRegistryName())
                );
            }

            if (overworldConfig.AMETHYST_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.field_243653_e.getOrDefault(OverworldOresBlocks.AMETHYST_ORE.getRegistryName())
                );
            }

            if (overworldConfig.ZINC_ORE.get()) {
                OreGenUtils.addFeatureToBiome(
                        biome,
                        WorldGenRegistries.field_243653_e.getOrDefault(OverworldOresBlocks.ZINC_ORE.getRegistryName())
                );
            }
        }
    }
}
