package fr.alasdiablo.janoeo.utils;

import fr.alasdiablo.janoeo.holder.BlocksHolder;
import fr.alasdiablo.janoeo.holder.ItemHolder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.feature.ReplaceBlockConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
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
        for(Biome biome : ForgeRegistries.BIOMES) {
            /*------------------------------------+
            |                                     |
            |       Overworld Ore Generation         |
            |                                     |
            +-------------------------------------*/
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, BlocksHolder.COPPER_ORE.getDefaultState(), 8), Placement.COUNT_RANGE, new CountRangeConfig(12, 1, 0, 63)));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(FillerBlockType.NATURAL_STONE, BlocksHolder.TIN_ORE.getDefaultState(), 8), Placement.COUNT_RANGE, new CountRangeConfig(12, 1, 0, 63)));

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

            /*------------------------------------+
            |                                     |
            |         End Ore Generation          |
            |                                     |
            +-------------------------------------*/
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
