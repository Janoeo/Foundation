package fr.alasdiablo.janoeo.foundation.world.gen;

import com.google.common.collect.ImmutableList;
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

    private static ConfiguredFeature<?, ?> createOreFeature(ImmutableList<OreConfiguration.TargetBlockState> target, OreConfig config) {
        switch (config.getPlacement()) {
            case "range" -> {
                return Feature.ORE.configured(
                        new OreConfiguration(target, config.getSize())
                ).rangeUniform(
                        VerticalAnchor.bottom(),
                        VerticalAnchor.absolute(config.getRange())
                ).squared().count(config.getCount());
            }
            case "triangle" -> {
                return Feature.ORE.configured(
                        new OreConfiguration(target, config.getSize())
                ).rangeTriangle(
                        VerticalAnchor.absolute(config.getBottom()),
                        VerticalAnchor.absolute(config.getTop())
                ).squared();
            }
            case "uniform" -> {
                return Feature.ORE.configured(
                        new OreConfiguration(target, config.getSize())
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
        register(FoundationBlocks.TINY_EMERALD_ORE, ORE_TINY_EMERALD);
        register(FoundationBlocks.TINY_GOLD_ORE, ORE_TINY_GOLD);
        register(FoundationBlocks.TINY_GOLD_ORE, "extra", ORE_TINY_GOLD_EXTRA);
        register(FoundationBlocks.TINY_IRON_ORE, ORE_TINY_IRON);
        register(FoundationBlocks.TINY_LAPIS_ORE, ORE_TINY_LAPIS);
        register(FoundationBlocks.TINY_REDSTONE_ORE, ORE_TINY_REDSTONE);

        register(FoundationBlocks.BAUXITE_ORE, ORE_BAUXITE);
        register(FoundationBlocks.LEAD_ORE, ORE_LEAD);
        register(FoundationBlocks.NICKEL_ORE, ORE_NICKEL);
        register(FoundationBlocks.SILVER_ORE, ORE_SILVER);
        register(FoundationBlocks.TIN_ORE, ORE_TIN);
        register(FoundationBlocks.URANIUM_ORE, ORE_URANIUM);
    }

    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_TINY_COAL_LIST = ImmutableList.of(
            OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_COAL_ORE.defaultBlockState()),
            OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_COAL_ORE.defaultBlockState())
    );
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_TINY_COPPER_LIST = ImmutableList.of(
            OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_COPPER_ORE.defaultBlockState()),
            OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_COPPER_ORE.defaultBlockState())
    );
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_TINY_DIAMOND_LIST = ImmutableList.of(
            OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_DIAMOND_ORE.defaultBlockState()),
            OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_DIAMOND_ORE.defaultBlockState())
    );
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_TINY_EMERALD_LIST = ImmutableList.of(
            OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_EMERALD_ORE.defaultBlockState()),
            OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_EMERALD_ORE.defaultBlockState())
    );
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_TINY_GOLD_LIST = ImmutableList.of(
            OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_GOLD_ORE.defaultBlockState()),
            OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_GOLD_ORE.defaultBlockState())
    );
    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_TINY_IRON_LIST = ImmutableList.of(
            OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_IRON_ORE.defaultBlockState()),
            OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_IRON_ORE.defaultBlockState())
    );

    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_TINY_LAPIS_LIST = ImmutableList.of(
            OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_LAPIS_ORE.defaultBlockState()),
            OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_LAPIS_ORE.defaultBlockState())
    );

    public static final ImmutableList<OreConfiguration.TargetBlockState> ORE_TINY_REDSTONE_LIST = ImmutableList.of(
            OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_REDSTONE_ORE.defaultBlockState()),
            OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_REDSTONE_ORE.defaultBlockState())
    );

    public static final ConfiguredFeature<?, ?> ORE_TINY_COAL = createOreFeature(ORE_TINY_COAL_LIST, FoundationConfig.TINY_COAL_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_COPPER = createOreFeature(ORE_TINY_COPPER_LIST, FoundationConfig.TINY_COPPER_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_DIAMOND = createOreFeature(ORE_TINY_DIAMOND_LIST, FoundationConfig.TINY_DIAMOND_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_EMERALD = createOreFeature(ORE_TINY_EMERALD_LIST, FoundationConfig.TINY_EMERALD_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_GOLD = createOreFeature(ORE_TINY_GOLD_LIST, FoundationConfig.TINY_GOLD_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_GOLD_EXTRA = createOreFeature(ORE_TINY_GOLD_LIST, FoundationConfig.TINY_GOLD_ORE_EXTRA_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_IRON = createOreFeature(ORE_TINY_IRON_LIST, FoundationConfig.TINY_IRON_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_LAPIS = createOreFeature(ORE_TINY_LAPIS_LIST, FoundationConfig.TINY_LAPIS_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_REDSTONE = createOreFeature(ORE_TINY_REDSTONE_LIST, FoundationConfig.TINY_REDSTONE_ORE_CONFIG);

    public static final ConfiguredFeature<?, ?> ORE_BAUXITE = createOreFeature(FoundationBlocks.BAUXITE_ORE, OreConfiguration.Predicates.NATURAL_STONE, FoundationConfig.BAUXITE_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_LEAD = createOreFeature(FoundationBlocks.LEAD_ORE, OreConfiguration.Predicates.NATURAL_STONE, FoundationConfig.LEAD_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_NICKEL = createOreFeature(FoundationBlocks.NICKEL_ORE, OreConfiguration.Predicates.NATURAL_STONE, FoundationConfig.NICKEL_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_SILVER = createOreFeature(FoundationBlocks.SILVER_ORE, OreConfiguration.Predicates.NATURAL_STONE, FoundationConfig.SILVER_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TIN = createOreFeature(FoundationBlocks.TIN_ORE, OreConfiguration.Predicates.NATURAL_STONE, FoundationConfig.TIN_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_URANIUM = createOreFeature(FoundationBlocks.URANIUM_ORE, OreConfiguration.Predicates.NATURAL_STONE, FoundationConfig.URANIUM_ORE_CONFIG);
}
