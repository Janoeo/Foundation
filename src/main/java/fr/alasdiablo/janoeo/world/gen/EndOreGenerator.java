package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.janoeo.config.EndConfig;
import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.block.EndOresBlocks;
import fr.alasdiablo.janoeo.world.gen.feature.CustomFillerBlockType;
import fr.alasdiablo.janoeo.world.gen.feature.CustomOreFeature;
import fr.alasdiablo.janoeo.world.gen.feature.CustomOreFeatureConfig;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class EndOreGenerator implements IWorldGenerator {
    @Override
    public void startWorldGeneration() {

        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        EndConfig.Config endConfig = EndConfig.CONFIG;
        if (globalConfig.END_ORE_GEN.get()) ForgeRegistries.BIOMES.forEach(biome -> {
            if (endConfig.COAL_END_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, CustomOreFeature.INSTANCE.withConfiguration(new CustomOreFeatureConfig(CustomFillerBlockType.END_STONE, EndOresBlocks.COAL_END_ORE.getDefaultState(), 12)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(68, 20, 0, 70))));
            if (endConfig.DIAMOND_END_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, CustomOreFeature.INSTANCE.withConfiguration(new CustomOreFeatureConfig(CustomFillerBlockType.END_STONE, EndOresBlocks.DIAMOND_END_ORE.getDefaultState(), 4)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 20, 0, 70))));
            if (endConfig.EMERALD_END_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), EndOresBlocks.EMERALD_END_ORE.getDefaultState())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 20, 0, 70))));
            if (endConfig.GOLD_END_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, CustomOreFeature.INSTANCE.withConfiguration(new CustomOreFeatureConfig(CustomFillerBlockType.END_STONE, EndOresBlocks.GOLD_END_ORE.getDefaultState(), 6)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(32, 20, 0, 70))));
            if (endConfig.IRON_END_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, CustomOreFeature.INSTANCE.withConfiguration(new CustomOreFeatureConfig(CustomFillerBlockType.END_STONE, EndOresBlocks.IRON_END_ORE.getDefaultState(), 8)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(40, 20, 0, 70))));
            if (endConfig.LAPIS_END_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, CustomOreFeature.INSTANCE.withConfiguration(new CustomOreFeatureConfig(CustomFillerBlockType.END_STONE, EndOresBlocks.LAPIS_END_ORE.getDefaultState(), 6)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 20, 0, 70))));
            if (endConfig.REDSTONE_END_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, CustomOreFeature.INSTANCE.withConfiguration(new CustomOreFeatureConfig(CustomFillerBlockType.END_STONE, EndOresBlocks.REDSTONE_END_ORE.getDefaultState(), 6)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(32, 20, 0, 70))));
        });
    }
}
