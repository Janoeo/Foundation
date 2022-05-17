package fr.alasdiablo.janoeo.foundation.worldgen.features;

import fr.alasdiablo.diolib.api.util.ResourceLocations;
import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.config.OreConfig;
import static fr.alasdiablo.janoeo.foundation.init.FoundationBlocks.*;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;
import java.util.function.Supplier;

public class FoundationFeatures {
    /* * * * * * * * * * * * * * * Ore * * *  * * * * * * * * * * */
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_BAUXITE = createOreFeature(getOverworldTargetList(BAUXITE_ORE, DEEPSLATE_BAUXITE_ORE), FoundationConfig.BAUXITE_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_LEAD = createOreFeature(getOverworldTargetList(LEAD_ORE, DEEPSLATE_LEAD_ORE), FoundationConfig.LEAD_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NICKEL = createOreFeature(getOverworldTargetList(NICKEL_ORE, DEEPSLATE_NICKEL_ORE), FoundationConfig.NICKEL_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_SILVER = createOreFeature(getOverworldTargetList(SILVER_ORE, DEEPSLATE_SILVER_ORE), FoundationConfig.SILVER_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TIN = createOreFeature(getOverworldTargetList(TIN_ORE, DEEPSLATE_TIN_ORE), FoundationConfig.TIN_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_URANIUM = createOreFeature(getOverworldTargetList(URANIUM_ORE, DEEPSLATE_URANIUM_ORE), FoundationConfig.URANIUM_ORE_CONFIG);

    /* * * * * * * * * * * * * * * Tiny Ore * * *  * * * * * * * * * * */
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_COAL = createOreFeature(getOverworldTargetList(TINY_COAL_ORE, DEEPSLATE_TINY_COAL_ORE), FoundationConfig.TINY_COAL_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_COPPER = createOreFeature(getOverworldTargetList(TINY_COPPER_ORE, DEEPSLATE_TINY_COPPER_ORE), FoundationConfig.TINY_COPPER_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_DIAMOND = createOreFeature(getOverworldTargetList(TINY_DIAMOND_ORE, DEEPSLATE_TINY_DIAMOND_ORE), FoundationConfig.TINY_DIAMOND_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_EMERALD = createOreFeature(getOverworldTargetList(TINY_EMERALD_ORE, DEEPSLATE_TINY_EMERALD_ORE), FoundationConfig.TINY_EMERALD_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_GOLD = createOreFeature(getOverworldTargetList(TINY_GOLD_ORE, DEEPSLATE_TINY_GOLD_ORE), FoundationConfig.TINY_GOLD_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_GOLD_EXTRA = createOreFeature(getOverworldTargetList(TINY_GOLD_ORE, DEEPSLATE_TINY_GOLD_ORE), FoundationConfig.TINY_GOLD_ORE_EXTRA_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_IRON = createOreFeature(getOverworldTargetList(TINY_IRON_ORE, DEEPSLATE_TINY_IRON_ORE), FoundationConfig.TINY_IRON_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_LAPIS = createOreFeature(getOverworldTargetList(TINY_LAPIS_ORE, DEEPSLATE_TINY_LAPIS_ORE), FoundationConfig.TINY_LAPIS_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_REDSTONE = createOreFeature(getOverworldTargetList(TINY_REDSTONE_ORE, DEEPSLATE_TINY_REDSTONE_ORE), FoundationConfig.TINY_REDSTONE_ORE_CONFIG);

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_BAUXITE = createOreFeature(getOverworldTargetList(TINY_BAUXITE_ORE, DEEPSLATE_TINY_BAUXITE_ORE), FoundationConfig.TINY_BAUXITE_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_LEAD = createOreFeature(getOverworldTargetList(TINY_LEAD_ORE, DEEPSLATE_TINY_LEAD_ORE), FoundationConfig.TINY_LEAD_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_NICKEL = createOreFeature(getOverworldTargetList(TINY_NICKEL_ORE, DEEPSLATE_TINY_NICKEL_ORE), FoundationConfig.TINY_NICKEL_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_SILVER = createOreFeature(getOverworldTargetList(TINY_SILVER_ORE, DEEPSLATE_TINY_SILVER_ORE), FoundationConfig.TINY_SILVER_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_TIN = createOreFeature(getOverworldTargetList(TINY_TIN_ORE, DEEPSLATE_TINY_TIN_ORE), FoundationConfig.TINY_TIN_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_URANIUM = createOreFeature(getOverworldTargetList(TINY_URANIUM_ORE, DEEPSLATE_TINY_URANIUM_ORE), FoundationConfig.TINY_URANIUM_ORE_CONFIG);

    /* * * * * * * * * * * * * * * Nether Ore * * *  * * * * * * * * * * */
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_COAL   = createOreFeature(OreFeatures.NETHERRACK, NETHER_COAL_ORE, FoundationConfig.NETHER_COAL_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_COPPER = createOreFeature(OreFeatures.NETHERRACK, NETHER_COPPER_ORE, FoundationConfig.NETHER_COPPER_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_DIAMOND = createOreFeature(OreFeatures.NETHERRACK, NETHER_DIAMOND_ORE, FoundationConfig.NETHER_DIAMOND_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_EMERALD = createOreFeature(OreFeatures.NETHERRACK, NETHER_EMERALD_ORE, FoundationConfig.NETHER_EMERALD_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_IRON = createOreFeature(OreFeatures.NETHERRACK, NETHER_IRON_ORE, FoundationConfig.NETHER_IRON_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_LAPIS = createOreFeature(OreFeatures.NETHERRACK, NETHER_LAPIS_ORE, FoundationConfig.NETHER_LAPIS_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_REDSTONE = createOreFeature(OreFeatures.NETHERRACK, NETHER_REDSTONE_ORE, FoundationConfig.NETHER_REDSTONE_ORE_CONFIG);

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_BAUXITE = createOreFeature(OreFeatures.NETHERRACK, NETHER_BAUXITE_ORE, FoundationConfig.NETHER_BAUXITE_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_LEAD = createOreFeature(OreFeatures.NETHERRACK, NETHER_LEAD_ORE, FoundationConfig.NETHER_LEAD_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_NICKEL = createOreFeature(OreFeatures.NETHERRACK, NETHER_NICKEL_ORE, FoundationConfig.NETHER_NICKEL_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_SILVER = createOreFeature(OreFeatures.NETHERRACK, NETHER_SILVER_ORE, FoundationConfig.NETHER_SILVER_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_TIN = createOreFeature(OreFeatures.NETHERRACK, NETHER_TIN_ORE, FoundationConfig.NETHER_TIN_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_URANIUM = createOreFeature(OreFeatures.NETHERRACK, NETHER_URANIUM_ORE, FoundationConfig.NETHER_URANIUM_ORE_CONFIG);

    private static @NotNull @Unmodifiable List<OreConfiguration.TargetBlockState> getOverworldTargetList(Supplier<Block> stoneReplacer, Supplier<Block> deepSlateReplacer) {
        return List.of(
                getTargetList(OreFeatures.STONE_ORE_REPLACEABLES, stoneReplacer.get().defaultBlockState()),
                getTargetList(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, deepSlateReplacer.get().defaultBlockState())
        );
    }

    private static @NotNull OreConfiguration.TargetBlockState getTargetList(RuleTest target, BlockState replacer) {
        return OreConfiguration.target(target, replacer);
    }

    private static @NotNull Holder<ConfiguredFeature<OreConfiguration, ?>> createOreFeature(List<OreConfiguration.TargetBlockState> targetList, @NotNull OreConfig oreConfig) {
        return FeatureUtils.register(
                ResourceLocations.of(Registries.MOD_ID, oreConfig.name()).toString(),
                Feature.ORE,
                new OreConfiguration(targetList, oreConfig.getSize())
        );
    }

    private static @NotNull Holder<ConfiguredFeature<OreConfiguration, ?>> createOreFeature(RuleTest target, @NotNull Supplier<Block> oreBlock, @NotNull OreConfig oreConfig) {
        return FeatureUtils.register(
                ResourceLocations.of(Registries.MOD_ID, oreConfig.name()).toString(),
                Feature.ORE,
                new OreConfiguration(target, oreBlock.get().defaultBlockState(), oreConfig.getSize())
        );
    }
}
