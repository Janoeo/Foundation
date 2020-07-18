package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.config.NetherConfig;
import fr.alasdiablo.janoeo.block.NetherDenseOresBlocks;
import fr.alasdiablo.janoeo.block.NetherOresBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.ReplaceBlockConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class NetherOreGenerator implements IWorldGenerator {
    @Override
    public void startWorldGeneration() {
        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        NetherConfig.Config netherConfig = NetherConfig.CONFIG;

        if (globalConfig.NETHER_ORE_GEN.get()) ForgeRegistries.BIOMES.forEach(biome -> {

            if (netherConfig.COAL_NETHER_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NetherOresBlocks.COAL_NETHER_ORE.getDefaultState(), 12)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(34, 12, 0, 128))));
            if (netherConfig.DIAMOND_NETHER_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NetherOresBlocks.DIAMOND_NETHER_ORE.getDefaultState(), 4)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 12, 0, 128))));
            if (netherConfig.EMERALD_NETHER_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NetherOresBlocks.EMERALD_NETHER_ORE.getDefaultState(), 2)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(4, 12, 0, 128))));
            if (netherConfig.GOLD_NETHER_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NetherOresBlocks.GOLD_NETHER_ORE.getDefaultState(), 4)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(16, 12, 0, 128))));
            if (netherConfig.IRON_NETHER_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NetherOresBlocks.IRON_NETHER_ORE.getDefaultState(), 6)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 12, 0, 128))));
            if (netherConfig.LAPIS_NETHER_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NetherOresBlocks.LAPIS_NETHER_ORE.getDefaultState(), 6)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 12, 0, 128))));
            if (netherConfig.REDSTONE_NETHER_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NetherOresBlocks.REDSTONE_NETHER_ORE.getDefaultState(), 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(16, 12, 0, 128))));

            if (globalConfig.EXTRA_NETHER_ORE_GEN.get()) {
                if (netherConfig.ALUMINIUM_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NetherOresBlocks.ALUMINIUM_NETHER_ORE.getDefaultState(), 6)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 12, 0, 128))));
                if (netherConfig.LEAD_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NetherOresBlocks.LEAD_NETHER_ORE.getDefaultState(), 6)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 12, 0, 128))));
                if (netherConfig.TIN_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NetherOresBlocks.TIN_NETHER_ORE.getDefaultState(), 6)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 12, 0, 128))));
                if (netherConfig.COPPER_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NetherOresBlocks.COPPER_NETHER_ORE.getDefaultState(), 6)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 12, 0, 128))));
                if (netherConfig.RUBY_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NetherOresBlocks.RUBY_NETHER_ORE.getDefaultState(), 4)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 12, 0, 128))));
                if (netherConfig.SAPPHIRE_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NetherOresBlocks.SAPPHIRE_NETHER_ORE.getDefaultState(), 4)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 12, 0, 128))));
                if (netherConfig.SILVER_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NetherOresBlocks.SILVER_NETHER_ORE.getDefaultState(), 4)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(16, 12, 0, 128))));
                if (netherConfig.URANIUM_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, NetherOresBlocks.URANIUM_NETHER_ORE.getDefaultState(), 4)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(16, 12, 0, 128))));
            }

            if (globalConfig.DENSE_ORE_GEN.get()) {
                if (netherConfig.DENSE_COAL_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(NetherOresBlocks.COAL_NETHER_ORE.getDefaultState(), NetherDenseOresBlocks.DENSE_COAL_NETHER_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(2560, 1, 0, 128))));
                if (netherConfig.DENSE_DIAMOND_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(NetherOresBlocks.DIAMOND_NETHER_ORE.getDefaultState(), NetherDenseOresBlocks.DENSE_DIAMOND_NETHER_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(2560, 1, 0, 128))));
                if (netherConfig.DENSE_EMERALD_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(NetherOresBlocks.EMERALD_NETHER_ORE.getDefaultState(), NetherDenseOresBlocks.DENSE_EMERALD_NETHER_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(2560, 1, 0, 128))));
                if (netherConfig.DENSE_GOLD_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(NetherOresBlocks.GOLD_NETHER_ORE.getDefaultState(), NetherDenseOresBlocks.DENSE_GOLD_NETHER_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(2560, 1, 0, 128))));
                if (netherConfig.DENSE_IRON_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(NetherOresBlocks.IRON_NETHER_ORE.getDefaultState(), NetherDenseOresBlocks.DENSE_IRON_NETHER_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(2560, 1, 0, 128))));
                if (netherConfig.DENSE_LAPIS_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(NetherOresBlocks.LAPIS_NETHER_ORE.getDefaultState(), NetherDenseOresBlocks.DENSE_LAPIS_NETHER_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(2560, 1, 0, 128))));
                if (netherConfig.DENSE_REDSTONE_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(NetherOresBlocks.REDSTONE_NETHER_ORE.getDefaultState(), NetherDenseOresBlocks.DENSE_REDSTONE_NETHER_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(2560, 1, 0, 128))));
                if (netherConfig.DENSE_QUARTZ_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), NetherDenseOresBlocks.DENSE_QUARTZ_NETHER_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(2560, 1, 0, 128))));
            }
        });
    }
}
