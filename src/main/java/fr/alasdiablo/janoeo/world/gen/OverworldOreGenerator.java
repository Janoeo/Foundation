package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.janoeo.config.FrequencyConfig;
import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.config.OverworldConfig;
import fr.alasdiablo.janoeo.block.OverworldDenseOresBlocks;
import fr.alasdiablo.janoeo.block.OverworldOresBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.ReplaceBlockConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OverworldOreGenerator implements IWorldGenerator {

    @Override
    public void startWorldGeneration() {
        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        OverworldConfig.Config overworldConfig = OverworldConfig.CONFIG;
        FrequencyConfig.Config frequencyConfig = FrequencyConfig.CONFIG;

        if (globalConfig.DENSE_ORE_GEN.get() && overworldConfig.DENSE_EMERALD_ORE.get()) {
            Biomes.MOUNTAINS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.EMERALD_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.DENSE_EMERALD_ORE_COUNT.get(), frequencyConfig.DENSE_EMERALD_ORE_BOTTOM.get(), 0, frequencyConfig.DENSE_EMERALD_ORE_TOP.get()))));
            Biomes.WOODED_MOUNTAINS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.EMERALD_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.DENSE_EMERALD_ORE_COUNT.get(), frequencyConfig.DENSE_EMERALD_ORE_BOTTOM.get(), 0, frequencyConfig.DENSE_EMERALD_ORE_TOP.get()))));
            Biomes.GRAVELLY_MOUNTAINS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.EMERALD_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.DENSE_EMERALD_ORE_COUNT.get(), frequencyConfig.DENSE_EMERALD_ORE_BOTTOM.get(), 0, frequencyConfig.DENSE_EMERALD_ORE_TOP.get()))));
            Biomes.MODIFIED_GRAVELLY_MOUNTAINS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.EMERALD_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.DENSE_EMERALD_ORE_COUNT.get(), frequencyConfig.DENSE_EMERALD_ORE_BOTTOM.get(), 0, frequencyConfig.DENSE_EMERALD_ORE_TOP.get()))));
            Biomes.MOUNTAIN_EDGE.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.EMERALD_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.DENSE_EMERALD_ORE_COUNT.get(), frequencyConfig.DENSE_EMERALD_ORE_BOTTOM.get(), 0, frequencyConfig.DENSE_EMERALD_ORE_TOP.get()))));
        }
        ForgeRegistries.BIOMES.forEach(biome -> {
            if (globalConfig.EXTRA_ORE_GEN.get()) {
                if (overworldConfig.COPPER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.COPPER_ORE.getDefaultState(), 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.COPPER_ORE_COUNT.get(), frequencyConfig.COPPER_ORE_BOTTOM.get(), 0, frequencyConfig.COPPER_ORE_TOP.get()))));
                if (overworldConfig.TIN_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.TIN_ORE.getDefaultState(), 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.TIN_ORE_COUNT.get(), frequencyConfig.TIN_ORE_BOTTOM.get(), 0, frequencyConfig.TIN_ORE_TOP.get()))));
                if (overworldConfig.ALUMINIUM_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.ALUMINIUM_ORE.getDefaultState(), 12)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.ALUMINIUM_ORE_COUNT.get(), frequencyConfig.ALUMINIUM_ORE_BOTTOM.get(), 0, frequencyConfig.ALUMINIUM_ORE_TOP.get()))));
                if (overworldConfig.URANIUM_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.URANIUM_ORE.getDefaultState(), 4)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.URANIUM_ORE_COUNT.get(), frequencyConfig.URANIUM_ORE_BOTTOM.get(), 0, frequencyConfig.URANIUM_ORE_TOP.get()))));
                if (overworldConfig.LEAD_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.LEAD_ORE.getDefaultState(), 12)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.LEAD_ORE_COUNT.get(), frequencyConfig.LEAD_ORE_BOTTOM.get(), 0, frequencyConfig.LEAD_ORE_TOP.get()))));
                if (overworldConfig.SILVER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.SILVER_ORE.getDefaultState(), 4)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.SILVER_ORE_COUNT.get(), frequencyConfig.SILVER_ORE_BOTTOM.get(), 0, frequencyConfig.SILVER_ORE_TOP.get()))));
                if (overworldConfig.RUBY_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.RUBY_ORE.getDefaultState(), 2)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.RUBY_ORE_COUNT.get(), frequencyConfig.RUBY_ORE_BOTTOM.get(), 0, frequencyConfig.RUBY_ORE_TOP.get()))));
                if (overworldConfig.SAPPHIRE_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.SAPPHIRE_ORE.getDefaultState(), 2)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.SAPPHIRE_ORE_COUNT.get(), frequencyConfig.SAPPHIRE_ORE_BOTTOM.get(), 0, frequencyConfig.SAPPHIRE_ORE_TOP.get()))));
                if (overworldConfig.AMETHYST_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.AMETHYST_ORE.getDefaultState(), 2)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.AMETHYST_ORE_COUNT.get(), frequencyConfig.AMETHYST_ORE_BOTTOM.get(), 0, frequencyConfig.AMETHYST_ORE_TOP.get()))));
                if (overworldConfig.ZINC_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.ZINC_ORE.getDefaultState(), 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.ZINC_ORE_COUNT.get(), frequencyConfig.ZINC_ORE_BOTTOM.get(), 0, frequencyConfig.ZINC_ORE_TOP.get()))));
                if (globalConfig.DENSE_ORE_GEN.get()) {
                    if (overworldConfig.COPPER_ORE.get() && overworldConfig.DENSE_COPPER_ORE.get())
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(OverworldOresBlocks.COPPER_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_COPPER_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.DENSE_COPPER_ORE_COUNT.get(), frequencyConfig.COPPER_ORE_BOTTOM.get(), 0, frequencyConfig.DENSE_COPPER_ORE_TOP.get()))));
                    if (overworldConfig.TIN_ORE.get() && overworldConfig.DENSE_TIN_ORE.get())
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(OverworldOresBlocks.TIN_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_TIN_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.DENSE_TIN_ORE_COUNT.get(), frequencyConfig.DENSE_TIN_ORE_BOTTOM.get(), 0, frequencyConfig.DENSE_TIN_ORE_TOP.get()))));
                }
            }
            if (globalConfig.DENSE_ORE_GEN.get()) {
                if (overworldConfig.DENSE_COAL_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.COAL_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_COAL_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.DENSE_COAL_ORE_COUNT.get(), frequencyConfig.DENSE_COAL_ORE_BOTTOM.get(), 0, frequencyConfig.DENSE_COAL_ORE_TOP.get()))));
                if (overworldConfig.DENSE_GOLD_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.GOLD_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_GOLD_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.DENSE_GOLD_ORE_COUNT.get(), frequencyConfig.DENSE_GOLD_ORE_BOTTOM.get(), 0, frequencyConfig.DENSE_GOLD_ORE_TOP.get()))));
                if (overworldConfig.DENSE_IRON_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.IRON_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_IRON_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.DENSE_IRON_ORE_COUNT.get(), frequencyConfig.DENSE_IRON_ORE_BOTTOM.get(), 0, frequencyConfig.DENSE_IRON_ORE_TOP.get()))));
                if (overworldConfig.DENSE_LAPIS_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.LAPIS_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_LAPIS_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.DENSE_LAPIS_ORE_COUNT.get(), frequencyConfig.DENSE_LAPIS_ORE_BOTTOM.get(), 0, frequencyConfig.DENSE_LAPIS_ORE_TOP.get()))));
                if (overworldConfig.DENSE_REDSTONE_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.REDSTONE_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_REDSTONE_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.DENSE_REDSTONE_ORE_COUNT.get(), frequencyConfig.DENSE_REDSTONE_ORE_BOTTOM.get(), 0, frequencyConfig.DENSE_REDSTONE_ORE_TOP.get()))));
                if (overworldConfig.DENSE_DIAMOND_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.DIAMOND_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_DIAMOND_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(frequencyConfig.DENSE_DIAMOND_ORE_COUNT.get(), frequencyConfig.DENSE_DIAMOND_ORE_BOTTOM.get(), 0, frequencyConfig.DENSE_DIAMOND_ORE_TOP.get()))));
            }
        });
    }
}
