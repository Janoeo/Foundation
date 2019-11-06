package fr.alasdiablo.janoeo.world;

import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.config.NetherConfig;
import fr.alasdiablo.janoeo.holder.BlocksHolder;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
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
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlocksHolder.COAL_NETHER_ORE.getDefaultState(), 12), Placement.COUNT_RANGE, new CountRangeConfig(34, 12, 0, 128)));
            if (netherConfig.DIAMOND_NETHER_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlocksHolder.DIAMOND_NETHER_ORE.getDefaultState(), 4), Placement.COUNT_RANGE, new CountRangeConfig(10, 12, 0, 128)));
            if (netherConfig.EMERALD_NETHER_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlocksHolder.EMERALD_NETHER_ORE.getDefaultState(), 2), Placement.COUNT_RANGE, new CountRangeConfig(4, 12, 0, 128)));
            if (netherConfig.GOLD_NETHER_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlocksHolder.GOLD_NETHER_ORE.getDefaultState(), 4), Placement.COUNT_RANGE, new CountRangeConfig(16, 12, 0, 128)));
            if (netherConfig.IRON_NETHER_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlocksHolder.IRON_NETHER_ORE.getDefaultState(), 6), Placement.COUNT_RANGE, new CountRangeConfig(20, 12, 0, 128)));
            if (netherConfig.LAPIS_NETHER_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlocksHolder.LAPIS_NETHER_ORE.getDefaultState(), 6), Placement.COUNT_RANGE, new CountRangeConfig(10, 12, 0, 128)));
            if (netherConfig.REDSTONE_NETHER_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlocksHolder.REDSTONE_NETHER_ORE.getDefaultState(), 8), Placement.COUNT_RANGE, new CountRangeConfig(16, 12, 0, 128)));
            if (globalConfig.DENSE_ORE_GEN.get()) {
                if (netherConfig.DENSE_COAL_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(BlocksHolder.COAL_NETHER_ORE.getDefaultState(), BlocksHolder.DENSE_COAL_NETHER_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2560, 1, 0, 128)));
                if (netherConfig.DENSE_DIAMOND_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(BlocksHolder.DIAMOND_NETHER_ORE.getDefaultState(), BlocksHolder.DENSE_DIAMOND_NETHER_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2560, 1, 0, 128)));
                if (netherConfig.DENSE_EMERALD_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(BlocksHolder.EMERALD_END_ORE.getDefaultState(), BlocksHolder.DENSE_EMERALD_NETHER_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2560, 1, 0, 128)));
                if (netherConfig.DENSE_GOLD_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(BlocksHolder.GOLD_NETHER_ORE.getDefaultState(), BlocksHolder.DENSE_GOLD_NETHER_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2560, 1, 0, 128)));
                if (netherConfig.DENSE_IRON_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(BlocksHolder.IRON_NETHER_ORE.getDefaultState(), BlocksHolder.DENSE_IRON_NETHER_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2560, 1, 0, 128)));
                if (netherConfig.DENSE_LAPIS_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(BlocksHolder.LAPIS_NETHER_ORE.getDefaultState(), BlocksHolder.DENSE_LAPIS_NETHER_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2560, 1, 0, 128)));
                if (netherConfig.DENSE_REDSTONE_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(BlocksHolder.REDSTONE_NETHER_ORE.getDefaultState(), BlocksHolder.DENSE_REDSTONE_NETHER_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2560, 1, 0, 128)));
                if (netherConfig.DENSE_QUARTZ_NETHER_ORE.get())
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), BlocksHolder.DENSE_QUARTZ_NETHER_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2560, 1, 0, 128)));
            }
        });
    }
}
