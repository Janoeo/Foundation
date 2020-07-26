package fr.alasdiablo.janoeo.world;

import fr.alasdiablo.janoeo.world.gen.feature.CustomFillerBlockType;
import fr.alasdiablo.janoeo.world.gen.feature.CustomOreFeature;
import fr.alasdiablo.janoeo.world.gen.feature.CustomOreFeatureConfig;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ReplaceBlockConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class OreGenUtils {

    public static void addOreGenOnBiome(Biome biome, CustomFillerBlockType blockType, BlockState oreBlock, int size, int count, int bottom, int top) {
        biome.addFeature(
                GenerationStage.Decoration.UNDERGROUND_ORES,
                CustomOreFeature.INSTANCE.withConfiguration(
                        new CustomOreFeatureConfig(
                                blockType,
                                oreBlock,
                                size
                        )
                ).withPlacement(
                        Placement.COUNT_RANGE.configure(
                                new CountRangeConfig(
                                        count,
                                        bottom,
                                        0,
                                        top
                                )
                        )
                )
        );
    }

    public static void addBlockGenOnBiome(Biome biome, BlockState replamentBlock, BlockState oreBlock, int count, int bottom, int top) {
        biome.addFeature(
                GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.EMERALD_ORE.withConfiguration(
                        new ReplaceBlockConfig(
                                replamentBlock,
                                oreBlock
                        )
                ).withPlacement(
                        Placement.COUNT_RANGE.configure(
                                new CountRangeConfig(
                                        count,
                                        bottom,
                                        0,
                                        top
                                )
                        )
                )
        );
    }
}
