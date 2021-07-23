package fr.alasdiablo.janoeo.foundation.world.gen;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.diolib.world.WorldGenerationHelper;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.config.OreConfig;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.Objects;

public class FoundationFeatures {

    private static ConfiguredFeature<?, ?> createOreFeature(Block block, RuleTest target, OreConfig config) {
        switch (config.getPlacement()) {
            case "range" -> {
                return Feature.ORE.configured(
                        new OreConfiguration(target, block.defaultBlockState(), config.getSize())
                ).rangeUniform(
                        VerticalAnchor.bottom(),
                        VerticalAnchor.absolute(config.getRange())
                ).squared().count(config.getCount());
            }
            case "triangle" -> {
                return Feature.ORE.configured(
                        new OreConfiguration(target, block.defaultBlockState(), config.getSize())
                ).rangeTriangle(
                        VerticalAnchor.absolute(config.getBottom()),
                        VerticalAnchor.absolute(config.getTop())
                ).squared();
            }
            case "uniform" -> {
                return Feature.ORE.configured(
                        new OreConfiguration(target, block.defaultBlockState(), config.getSize())
                ).rangeUniform(
                        VerticalAnchor.absolute(config.getBottom()),
                        VerticalAnchor.absolute(config.getTop())
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

    public static final ConfiguredFeature<?, ?> ORE_TINY_COAL = createOreFeature(FoundationBlocks.TINY_COAL_ORE, OreConfiguration.Predicates.NATURAL_STONE, FoundationConfig.TINY_COAL_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_COPPER = createOreFeature(FoundationBlocks.TINY_COPPER_ORE, OreConfiguration.Predicates.NATURAL_STONE, FoundationConfig.TINY_COPPER_ORE_CONFIG);
    ;
    public static final ConfiguredFeature<?, ?> ORE_TINY_DIAMOND = createOreFeature(FoundationBlocks.TINY_DIAMOND_ORE, OreConfiguration.Predicates.NATURAL_STONE, FoundationConfig.TINY_DIAMOND_ORE_CONFIG);
    ;
    // add emerald
    public static final ConfiguredFeature<?, ?> ORE_TINY_GOLD = createOreFeature(FoundationBlocks.TINY_GOLD_ORE, OreConfiguration.Predicates.NATURAL_STONE, FoundationConfig.TINY_GOLD_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_GOLD_EXTRA = createOreFeature(FoundationBlocks.TINY_GOLD_ORE, OreConfiguration.Predicates.NATURAL_STONE, FoundationConfig.TINY_GOLD_ORE_EXTRA_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_IRON = createOreFeature(FoundationBlocks.TINY_IRON_ORE, OreConfiguration.Predicates.NATURAL_STONE, FoundationConfig.TINY_IRON_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_LAPIS = createOreFeature(FoundationBlocks.TINY_LAPIS_ORE, OreConfiguration.Predicates.NATURAL_STONE, FoundationConfig.TINY_LAPIS_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_REDSTONE = createOreFeature(FoundationBlocks.TINY_REDSTONE_ORE, OreConfiguration.Predicates.NATURAL_STONE, FoundationConfig.TINY_REDSTONE_ORE_CONFIG);
    ;
}
