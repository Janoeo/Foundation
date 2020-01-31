package fr.alasdiablo.janoeo.world;

import fr.alasdiablo.janoeo.config.EndConfig;
import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.ores.end.EndOresBlocks;
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
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), EndOresBlocks.COAL_END_ORE.getDefaultState())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(68, 20, 0, 70))));
            if (endConfig.DIAMOND_END_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), EndOresBlocks.DIAMOND_END_ORE.getDefaultState())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(20, 20, 0, 70))));
            if (endConfig.EMERALD_END_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), EndOresBlocks.EMERALD_END_ORE.getDefaultState())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(8, 20, 0, 70))));
            if (endConfig.GOLD_END_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), EndOresBlocks.GOLD_END_ORE.getDefaultState())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(32, 20, 0, 70))));
            if (endConfig.IRON_END_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), EndOresBlocks.IRON_END_ORE.getDefaultState())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(40, 20, 0, 70))));
            if (endConfig.LAPIS_END_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), EndOresBlocks.LAPIS_END_ORE.getDefaultState())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(20, 20, 0, 70))));
            if (endConfig.REDSTONE_END_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE.withConfiguration(new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), EndOresBlocks.REDSTONE_END_ORE.getDefaultState())).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(32, 20, 0, 70))));
        });
    }
}
