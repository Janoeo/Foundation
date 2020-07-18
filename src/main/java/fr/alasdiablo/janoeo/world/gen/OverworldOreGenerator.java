package fr.alasdiablo.janoeo.world.gen;

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
        if (globalConfig.DENSE_ORE_GEN.get() && overworldConfig.DENSE_EMERALD_ORE.get()) {
            Biomes.MOUNTAINS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.EMERALD_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(640, 4, 0, 32))));
            Biomes.WOODED_MOUNTAINS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.EMERALD_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(640, 4, 0, 32))));
            Biomes.GRAVELLY_MOUNTAINS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.EMERALD_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(640, 4, 0, 32))));
            Biomes.MODIFIED_GRAVELLY_MOUNTAINS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.EMERALD_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(640, 4, 0, 32))));
            Biomes.MOUNTAIN_EDGE.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.EMERALD_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(640, 4, 0, 32))));
        }
        ForgeRegistries.BIOMES.forEach(biome -> {
            if (globalConfig.EXTRA_ORE_GEN.get()) {
                if (overworldConfig.COPPER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.COPPER_ORE.getDefaultState(), 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(12, 1, 0, 63))));
                if (overworldConfig.TIN_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.TIN_ORE.getDefaultState(), 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(12, 1, 0, 63))));
                if (overworldConfig.ALUMINIUM_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.ALUMINIUM_ORE.getDefaultState(), 12)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(12, 1, 0, 63))));
                if (overworldConfig.URANIUM_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.URANIUM_ORE.getDefaultState(), 4)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(12, 1, 0, 32))));
                if (overworldConfig.LEAD_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.LEAD_ORE.getDefaultState(), 12)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(12, 1, 0, 63))));
                if (overworldConfig.SILVER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.SILVER_ORE.getDefaultState(), 4)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(12, 1, 0, 26))));
                if (overworldConfig.RUBY_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.RUBY_ORE.getDefaultState(), 2)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(12, 1, 0, 26))));
                if (overworldConfig.SAPPHIRE_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.SAPPHIRE_ORE.getDefaultState(), 2)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(12, 1, 0, 26))));
                if (overworldConfig.AMETHYST_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.AMETHYST_ORE.getDefaultState(), 2)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(12, 1, 0, 26))));
                if (overworldConfig.ZINC_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, OverworldOresBlocks.ZINC_ORE.getDefaultState(), 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(12, 1, 0, 63))));
                if (globalConfig.DENSE_ORE_GEN.get()) {
                    if (overworldConfig.COPPER_ORE.get() && overworldConfig.DENSE_COPPER_ORE.get())
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(OverworldOresBlocks.COPPER_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_COPPER_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(1260, 1, 0, 63))));
                    if (overworldConfig.TIN_ORE.get() && overworldConfig.DENSE_TIN_ORE.get())
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(OverworldOresBlocks.TIN_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_TIN_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(1260, 1, 0, 63))));
                }
            }
            if (globalConfig.DENSE_ORE_GEN.get()) {
                if (overworldConfig.DENSE_COAL_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.COAL_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_COAL_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(2600, 1, 0, 130))));
                if (overworldConfig.DENSE_GOLD_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.GOLD_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_GOLD_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(640, 1, 0, 32))));
                if (overworldConfig.DENSE_IRON_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.IRON_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_IRON_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(1260, 1, 0, 63))));
                if (overworldConfig.DENSE_LAPIS_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.LAPIS_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_LAPIS_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(640, 1, 0, 32))));
                if (overworldConfig.DENSE_REDSTONE_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.REDSTONE_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_REDSTONE_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(320, 1, 0, 16))));
                if (overworldConfig.DENSE_DIAMOND_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.DIAMOND_ORE.getDefaultState(), OverworldDenseOresBlocks.DENSE_DIAMOND_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(320, 1, 0, 16))));
            }
        });
    }
}
