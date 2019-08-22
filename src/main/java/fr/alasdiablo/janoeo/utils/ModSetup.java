package fr.alasdiablo.janoeo.utils;

import fr.alasdiablo.janoeo.holder.BlocksHolder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSetup {

    public ItemGroup janoeoGroup = new ItemGroup("janoeo.group") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlocksHolder.COAL_NETHER_ORE);
        }
    };

    public void init() {
        for(Biome biome : ForgeRegistries.BIOMES) {
            /*------------------------------------+
            |                                     |
            |       Nether Ore Generation         |
            |                                     |
            +-------------------------------------*/                                                                                                                                                               // size of the ore group                               //count of ore group on a chunck
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, BlocksHolder.COAL_NETHER_ORE.getDefaultState(), 12), Placement.COUNT_RANGE, new CountRangeConfig(34, 20, 0, 128)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, BlocksHolder.DIAMOND_NETHER_ORE.getDefaultState(), 4), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 128)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, BlocksHolder.EMERALD_NETHER_ORE.getDefaultState(), 2), Placement.COUNT_RANGE, new CountRangeConfig(4, 20, 0, 128)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, BlocksHolder.GOLD_NETHER_ORE.getDefaultState(), 4), Placement.COUNT_RANGE, new CountRangeConfig(16, 20, 0, 128)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, BlocksHolder.IRON_NETHER_ORE.getDefaultState(), 6), Placement.COUNT_RANGE, new CountRangeConfig(20, 20, 0, 128)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, BlocksHolder.LAPIS_NETHER_ORE.getDefaultState(), 6), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 128)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, BlocksHolder.REDSTONE_NETHER_ORE.getDefaultState(), 8), Placement.COUNT_RANGE, new CountRangeConfig(16, 20, 0, 128)));
        }
    }
}
