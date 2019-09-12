package fr.alasdiablo.janoeo.utils;

import fr.alasdiablo.janoeo.holder.BlocksHolder;
import fr.alasdiablo.janoeo.holder.ItemHolder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.feature.ReplaceBlockConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Mod setup class
 */
public class ModSetup {

    /**
     * Mod creative tab for ore block
     */
    public ItemGroup janoeoOreGroup = new ItemGroup("janoeo.ore.group") {
        /**
         * icon getter for the creative tab
         * @return An itemstack corresponding at the icon
         */
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlocksHolder.COAL_NETHER_ORE);
        }
    };

    /**
     * Mod creative tab for item
     */
    public ItemGroup janoeoItemGroup = new ItemGroup("janoeo.item.group") {
        /**
         * icon getter for the creative tab
         * @return An itemstack corresponding at the icon
         */
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemHolder.COPPER_INGOT);
        }
    };

    /**
     * Mod setup init
     */
    public void init() {
        JANOEOConfig.Config config = JANOEOConfig.CONFIG;

        if (config.DENSE_ORE_GEN.get()) {
            Biomes.MOUNTAINS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.EMERALD_ORE.getDefaultState(), BlocksHolder.DENSE_EMERALD_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(640, 4, 0, 32)));
            Biomes.WOODED_MOUNTAINS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.EMERALD_ORE.getDefaultState(), BlocksHolder.DENSE_EMERALD_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(640, 4, 0, 32)));
            Biomes.GRAVELLY_MOUNTAINS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.EMERALD_ORE.getDefaultState(), BlocksHolder.DENSE_EMERALD_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(640, 4, 0, 32)));
            Biomes.MODIFIED_GRAVELLY_MOUNTAINS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.EMERALD_ORE.getDefaultState(), BlocksHolder.DENSE_EMERALD_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(640, 4, 0, 32)));
            Biomes.MOUNTAIN_EDGE.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.EMERALD_ORE.getDefaultState(), BlocksHolder.DENSE_EMERALD_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(640, 4, 0, 32)));
        }

        for (Biome biome : ForgeRegistries.BIOMES) {
            if (config.EXTRA_ORE_GEN.get()) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, BlocksHolder.COPPER_ORE.getDefaultState(), 8), Placement.COUNT_RANGE, new CountRangeConfig(12, 1, 0, 63)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, BlocksHolder.TIN_ORE.getDefaultState(), 8), Placement.COUNT_RANGE, new CountRangeConfig(12, 1, 0, 63)));
                if (config.DENSE_ORE_GEN.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(BlocksHolder.COPPER_ORE.getDefaultState(), BlocksHolder.DENSE_COPPER_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(1260, 1, 0, 63)));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(BlocksHolder.TIN_ORE.getDefaultState(), BlocksHolder.DENSE_TIN_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(1260, 1, 0, 63)));
                }
            }
            if (config.DENSE_ORE_GEN.get()) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.COAL_ORE.getDefaultState(), BlocksHolder.DENSE_COAL_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2600, 1, 0, 130)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.GOLD_ORE.getDefaultState(), BlocksHolder.DENSE_GOLD_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(640, 1, 0, 32)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.IRON_ORE.getDefaultState(), BlocksHolder.DENSE_IRON_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(1260, 1, 0, 63)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.LAPIS_ORE.getDefaultState(), BlocksHolder.DENSE_LAPIS_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(640, 1, 0, 32)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.REDSTONE_ORE.getDefaultState(), BlocksHolder.DENSE_REDSTONE_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(320, 1, 0, 16)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.DIAMOND_ORE.getDefaultState(), BlocksHolder.DENSE_DIAMOND_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(320, 1, 0, 16)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.NETHER_QUARTZ_ORE.getDefaultState(), BlocksHolder.DENSE_QUARTZ_NETHER_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2560, 1, 0, 128)));
            }

            if (config.NETHER_ORE_GEN.get()) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, BlocksHolder.COAL_NETHER_ORE.getDefaultState(), 12), Placement.COUNT_RANGE, new CountRangeConfig(34, 12, 0, 128)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, BlocksHolder.DIAMOND_NETHER_ORE.getDefaultState(), 4), Placement.COUNT_RANGE, new CountRangeConfig(10, 12, 0, 128)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, BlocksHolder.EMERALD_NETHER_ORE.getDefaultState(), 2), Placement.COUNT_RANGE, new CountRangeConfig(4, 12, 0, 128)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, BlocksHolder.GOLD_NETHER_ORE.getDefaultState(), 4), Placement.COUNT_RANGE, new CountRangeConfig(16, 12, 0, 128)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, BlocksHolder.IRON_NETHER_ORE.getDefaultState(), 6), Placement.COUNT_RANGE, new CountRangeConfig(20, 12, 0, 128)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, BlocksHolder.LAPIS_NETHER_ORE.getDefaultState(), 6), Placement.COUNT_RANGE, new CountRangeConfig(10, 12, 0, 128)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NETHERRACK, BlocksHolder.REDSTONE_NETHER_ORE.getDefaultState(), 8), Placement.COUNT_RANGE, new CountRangeConfig(16, 12, 0, 128)));
                if (config.DENSE_ORE_GEN.get()) {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(BlocksHolder.COAL_NETHER_ORE.getDefaultState(), BlocksHolder.DENSE_COAL_NETHER_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2560, 1, 0, 128)));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(BlocksHolder.GOLD_NETHER_ORE.getDefaultState(), BlocksHolder.DENSE_GOLD_NETHER_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2560, 1, 0, 128)));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(BlocksHolder.IRON_NETHER_ORE.getDefaultState(), BlocksHolder.DENSE_IRON_NETHER_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2560, 1, 0, 128)));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(BlocksHolder.LAPIS_NETHER_ORE.getDefaultState(), BlocksHolder.DENSE_LAPIS_NETHER_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2560, 1, 0, 128)));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(BlocksHolder.REDSTONE_NETHER_ORE.getDefaultState(), BlocksHolder.DENSE_REDSTONE_NETHER_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2560, 1, 0, 128)));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(BlocksHolder.DIAMOND_NETHER_ORE.getDefaultState(), BlocksHolder.DENSE_DIAMOND_NETHER_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(2560, 1, 0, 128)));
                }
            }
            if (config.END_ORE_GEN.get()) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlocksHolder.COAL_END_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(68, 20, 0, 70)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlocksHolder.DIAMOND_END_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(20, 20, 0, 70)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlocksHolder.EMERALD_END_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(8, 20, 0, 70)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlocksHolder.GOLD_END_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(32, 20, 0, 70)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlocksHolder.IRON_END_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(40, 20, 0, 70)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlocksHolder.LAPIS_END_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(20, 20, 0, 70)));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Biome.createDecoratedFeature(Feature.EMERALD_ORE, new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlocksHolder.REDSTONE_END_ORE.getDefaultState()), Placement.COUNT_RANGE, new CountRangeConfig(32, 20, 0, 70)));
            }
        }
    }
}
