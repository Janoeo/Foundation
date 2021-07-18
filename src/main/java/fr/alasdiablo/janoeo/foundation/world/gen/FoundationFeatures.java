package fr.alasdiablo.janoeo.foundation.world.gen;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.diolib.world.WorldGenerationHelper;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.config.OreConfig;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.DepthAverageConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;

import java.util.Objects;

public class FoundationFeatures {

    private static ConfiguredFeature<?, ?> createOreFeature(Block block, RuleTest target, OreConfig config) {
        switch (config.getPlacement()) {
            case "range": {
                return Feature.ORE.configured(
                        new OreFeatureConfig(target, block.defaultBlockState(), config.getSize())
                ).range(config.getRange()).squared().count(config.getCount());
            }
            case "depth_average": {
                return Feature.ORE.configured(
                        new OreFeatureConfig(target, block.defaultBlockState(), config.getSize())
                ).decorated(
                        Placement.DEPTH_AVERAGE.configured(
                                new DepthAverageConfig(config.getBaseline(), config.getSpread())
                        )
                ).squared();

            }
            case "top_solid_range": {
                return Feature.ORE.configured(
                        new OreFeatureConfig(target, block.defaultBlockState(), config.getSize())
                ).decorated(
                        Placement.RANGE.configured(
                                new TopSolidRangeConfig(
                                        config.getBottomOffset(),
                                        config.getTopOffset(),
                                        config.getMaximum()
                                )
                        )
                ).squared().count(config.getCount());
            }
        }
        throw new IllegalStateException("Undefined placement type");
    }

    private static void register(Block block, ConfiguredFeature<?, ?> configuredFeature) {
        WorldGenerationHelper.ConfiguredFeatureHelper.register(
                Objects.requireNonNull(block.getRegistryName()), configuredFeature
        );
    }

    private static void register(Block block, String prefix, ConfiguredFeature<?, ?> configuredFeature) {
        WorldGenerationHelper.ConfiguredFeatureHelper.register(
                Objects.requireNonNull(
                        RegistryHelper.setPrefixOnRegistryName(block.getRegistryName(), prefix)
                ), configuredFeature
        );
    }

    public static void init() {
        register(FoundationBlocks.TINY_COAL_ORE, ORE_TINY_COAL);
        register(FoundationBlocks.TINY_COPPER_ORE, ORE_TINY_COPPER);
        register(FoundationBlocks.TINY_DIAMOND_ORE, ORE_TINY_DIAMOND);
        // add emerald
        register(FoundationBlocks.TINY_GOLD_ORE, ORE_TINY_GOLD);
        register(FoundationBlocks.TINY_GOLD_ORE, "extra", ORE_TINY_GOLD_EXTRA);
        register(FoundationBlocks.TINY_IRON_ORE, ORE_TINY_IRON);
        register(FoundationBlocks.TINY_LAPIS_ORE, ORE_TINY_LAPIS);
        register(FoundationBlocks.TINY_REDSTONE_ORE, ORE_TINY_REDSTONE);
    }

    public static final ConfiguredFeature<?, ?> ORE_TINY_COAL = createOreFeature(FoundationBlocks.TINY_COAL_ORE, OreFeatureConfig.FillerBlockType.NATURAL_STONE, FoundationConfig.TINY_COAL_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_COPPER = createOreFeature(FoundationBlocks.TINY_COPPER_ORE, OreFeatureConfig.FillerBlockType.NATURAL_STONE, FoundationConfig.TINY_COPPER_ORE_CONFIG);
    ;
    public static final ConfiguredFeature<?, ?> ORE_TINY_DIAMOND = createOreFeature(FoundationBlocks.TINY_DIAMOND_ORE, OreFeatureConfig.FillerBlockType.NATURAL_STONE, FoundationConfig.TINY_DIAMOND_ORE_CONFIG);
    ;
    // add emerald
    public static final ConfiguredFeature<?, ?> ORE_TINY_GOLD = createOreFeature(FoundationBlocks.TINY_GOLD_ORE, OreFeatureConfig.FillerBlockType.NATURAL_STONE, FoundationConfig.TINY_GOLD_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_GOLD_EXTRA = createOreFeature(FoundationBlocks.TINY_GOLD_ORE, OreFeatureConfig.FillerBlockType.NATURAL_STONE, FoundationConfig.TINY_GOLD_ORE_EXTRA_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_IRON = createOreFeature(FoundationBlocks.TINY_IRON_ORE, OreFeatureConfig.FillerBlockType.NATURAL_STONE, FoundationConfig.TINY_IRON_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_LAPIS = createOreFeature(FoundationBlocks.TINY_LAPIS_ORE, OreFeatureConfig.FillerBlockType.NATURAL_STONE, FoundationConfig.TINY_LAPIS_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_REDSTONE = createOreFeature(FoundationBlocks.TINY_REDSTONE_ORE, OreFeatureConfig.FillerBlockType.NATURAL_STONE, FoundationConfig.TINY_REDSTONE_ORE_CONFIG);
    ;
}
