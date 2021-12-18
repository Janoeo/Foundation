package fr.alasdiablo.janoeo.foundation.worldgen.features;

import fr.alasdiablo.diolib.registries.RegistryHelper;
import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.config.OreConfig;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class FoundationFeatures {
    public static final List<OreConfiguration.TargetBlockState> ORE_TINY_COAL_TARGET_LIST     = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_COAL_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_COAL_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ORE_TINY_COPPER_TARGET_LIST   = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_COPPER_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_COPPER_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ORE_TINY_DIAMOND_TARGET_LIST  = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_DIAMOND_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_DIAMOND_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ORE_TINY_EMERALD_TARGET_LIST  = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_EMERALD_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_EMERALD_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ORE_TINY_GOLD_TARGET_LIST     = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_GOLD_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_GOLD_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ORE_TINY_IRON_TARGET_LIST     = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_IRON_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_IRON_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ORE_TINY_LAPIS_TARGET_LIST    = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_LAPIS_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_LAPIS_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ORE_TINY_REDSTONE_TARGET_LIST = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_REDSTONE_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_REDSTONE_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ORE_BAUXITE_TARGET_LIST       = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.BAUXITE_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_BAUXITE_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ORE_LEAD_TARGET_LIST          = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.LEAD_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_LEAD_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ORE_NICKEL_TARGET_LIST        = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.NICKEL_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_NICKEL_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ORE_SILVER_TARGET_LIST        = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.SILVER_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_SILVER_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ORE_TIN_TARGET_LIST           = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.TIN_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TIN_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> ORE_URANIUM_TARGET_LIST       = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.URANIUM_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_URANIUM_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> TINY_ORE_BAUXITE_TARGET_LIST  = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_BAUXITE_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_BAUXITE_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> TINY_ORE_LEAD_TARGET_LIST     = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_LEAD_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_LEAD_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> TINY_ORE_NICKEL_TARGET_LIST   = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_NICKEL_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_NICKEL_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> TINY_ORE_SILVER_TARGET_LIST   = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_SILVER_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_SILVER_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> TINY_ORE_TIN_TARGET_LIST      = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_TIN_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_TIN_ORE.defaultBlockState())
    );
    public static final List<OreConfiguration.TargetBlockState> TINY_ORE_URANIUM_TARGET_LIST  = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_URANIUM_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_TINY_URANIUM_ORE.defaultBlockState())
    );

    public static final ConfiguredFeature<?, ?> ORE_TINY_COAL       = createOreFeature(ORE_TINY_COAL_TARGET_LIST, FoundationConfig.TINY_COAL_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_COPPER     = createOreFeature(ORE_TINY_COPPER_TARGET_LIST, FoundationConfig.TINY_COPPER_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_DIAMOND    = createOreFeature(ORE_TINY_DIAMOND_TARGET_LIST, FoundationConfig.TINY_DIAMOND_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_EMERALD    = createOreFeature(ORE_TINY_EMERALD_TARGET_LIST, FoundationConfig.TINY_EMERALD_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_GOLD       = createOreFeature(ORE_TINY_GOLD_TARGET_LIST, FoundationConfig.TINY_GOLD_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_GOLD_EXTRA = createOreFeature(ORE_TINY_GOLD_TARGET_LIST, FoundationConfig.TINY_GOLD_ORE_EXTRA_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_IRON       = createOreFeature(ORE_TINY_IRON_TARGET_LIST, FoundationConfig.TINY_IRON_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_LAPIS      = createOreFeature(ORE_TINY_LAPIS_TARGET_LIST, FoundationConfig.TINY_LAPIS_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TINY_REDSTONE   = createOreFeature(
            ORE_TINY_REDSTONE_TARGET_LIST, FoundationConfig.TINY_REDSTONE_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_BAUXITE         = createOreFeature(ORE_BAUXITE_TARGET_LIST, FoundationConfig.BAUXITE_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_LEAD            = createOreFeature(ORE_LEAD_TARGET_LIST, FoundationConfig.LEAD_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_NICKEL          = createOreFeature(ORE_NICKEL_TARGET_LIST, FoundationConfig.NICKEL_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_SILVER          = createOreFeature(ORE_SILVER_TARGET_LIST, FoundationConfig.SILVER_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_TIN             = createOreFeature(ORE_TIN_TARGET_LIST, FoundationConfig.TIN_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> ORE_URANIUM         = createOreFeature(ORE_URANIUM_TARGET_LIST, FoundationConfig.URANIUM_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> TINY_ORE_BAUXITE    = createOreFeature(TINY_ORE_BAUXITE_TARGET_LIST, FoundationConfig.TINY_BAUXITE_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> TINY_ORE_LEAD       = createOreFeature(TINY_ORE_LEAD_TARGET_LIST, FoundationConfig.TINY_LEAD_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> TINY_ORE_NICKEL     = createOreFeature(TINY_ORE_NICKEL_TARGET_LIST, FoundationConfig.TINY_NICKEL_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> TINY_ORE_SILVER     = createOreFeature(TINY_ORE_SILVER_TARGET_LIST, FoundationConfig.TINY_SILVER_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> TINY_ORE_TIN        = createOreFeature(TINY_ORE_TIN_TARGET_LIST, FoundationConfig.TINY_TIN_ORE_CONFIG);
    public static final ConfiguredFeature<?, ?> TINY_ORE_URANIUM    = createOreFeature(TINY_ORE_URANIUM_TARGET_LIST, FoundationConfig.TINY_URANIUM_ORE_CONFIG);

    private static ConfiguredFeature<?, ?> createOreFeature(List<OreConfiguration.TargetBlockState> targetList, OreConfig oreConfig) {
        return FeatureUtils.register(
                RegistryHelper.rl(Registries.MOD_ID, oreConfig.name()).toString(),
                Feature.ORE.configured(new OreConfiguration(targetList, oreConfig.getSize()))
        );
    }
}
