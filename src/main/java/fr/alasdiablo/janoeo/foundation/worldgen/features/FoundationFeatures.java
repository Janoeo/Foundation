package fr.alasdiablo.janoeo.foundation.worldgen.features;

import fr.alasdiablo.diolib.api.util.ResourceLocations;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.config.OreConfig;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;
import java.util.function.Supplier;

import static fr.alasdiablo.janoeo.foundation.init.FoundationBlocks.*;

public class FoundationFeatures {
    public static final RuleTest GRAVEL = new BlockMatchTest(Blocks.GRAVEL);

    /* * * * * * * * * * * * * * * Ore * * *  * * * * * * * * * * */
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_BAUXITE = createOreFeature(
            getOverworldTargetList(STONE_ORES.get(Resource.Aluminium), DEEPSLATE_ORES.get(Resource.Aluminium)), FoundationConfig.BAUXITE_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_LEAD    = createOreFeature(
            getOverworldTargetList(STONE_ORES.get(Resource.Lead), DEEPSLATE_ORES.get(Resource.Lead)), FoundationConfig.LEAD_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NICKEL  = createOreFeature(
            getOverworldTargetList(STONE_ORES.get(Resource.Nickel), DEEPSLATE_ORES.get(Resource.Nickel)), FoundationConfig.NICKEL_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_SILVER  = createOreFeature(
            getOverworldTargetList(STONE_ORES.get(Resource.Silver), DEEPSLATE_ORES.get(Resource.Silver)), FoundationConfig.SILVER_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TIN     = createOreFeature(
            getOverworldTargetList(STONE_ORES.get(Resource.Tin), DEEPSLATE_ORES.get(Resource.Tin)), FoundationConfig.TIN_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_URANIUM = createOreFeature(
            getOverworldTargetList(STONE_ORES.get(Resource.Uranium), DEEPSLATE_ORES.get(Resource.Uranium)), FoundationConfig.URANIUM_ORE_CONFIG);

    /* * * * * * * * * * * * * * * Tiny Ore * * *  * * * * * * * * * * */
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_COAL       = createOreFeature(
            getOverworldTargetList(TINY_STONE_ORES.get(Resource.Coal), TINY_DEEPSLATE_ORES.get(Resource.Coal)), FoundationConfig.TINY_COAL_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_COPPER     = createOreFeature(
            getOverworldTargetList(TINY_STONE_ORES.get(Resource.Copper), TINY_DEEPSLATE_ORES.get(Resource.Copper)), FoundationConfig.TINY_COPPER_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_DIAMOND    = createOreFeature(
            getOverworldTargetList(TINY_STONE_ORES.get(Resource.Diamond), TINY_DEEPSLATE_ORES.get(Resource.Diamond)), FoundationConfig.TINY_DIAMOND_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_EMERALD    = createOreFeature(
            getOverworldTargetList(TINY_STONE_ORES.get(Resource.Emerald), TINY_DEEPSLATE_ORES.get(Resource.Emerald)), FoundationConfig.TINY_EMERALD_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_GOLD       = createOreFeature(
            getOverworldTargetList(TINY_STONE_ORES.get(Resource.Gold), TINY_DEEPSLATE_ORES.get(Resource.Gold)), FoundationConfig.TINY_GOLD_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_GOLD_EXTRA = createOreFeature(
            getOverworldTargetList(TINY_STONE_ORES.get(Resource.Gold), TINY_DEEPSLATE_ORES.get(Resource.Gold)), FoundationConfig.TINY_GOLD_ORE_EXTRA_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_IRON       = createOreFeature(
            getOverworldTargetList(TINY_STONE_ORES.get(Resource.Iron), TINY_DEEPSLATE_ORES.get(Resource.Iron)), FoundationConfig.TINY_IRON_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_LAPIS      = createOreFeature(
            getOverworldTargetList(TINY_STONE_ORES.get(Resource.Lapis), TINY_DEEPSLATE_ORES.get(Resource.Lapis)), FoundationConfig.TINY_LAPIS_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_REDSTONE   = createOreFeature(
            getOverworldTargetList(TINY_STONE_ORES.get(Resource.RedStone), TINY_DEEPSLATE_ORES.get(Resource.RedStone)),
            FoundationConfig.TINY_REDSTONE_ORE_CONFIG
    );

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_BAUXITE = createOreFeature(
            getOverworldTargetList(TINY_STONE_ORES.get(Resource.Aluminium), TINY_DEEPSLATE_ORES.get(Resource.Aluminium)),
            FoundationConfig.TINY_BAUXITE_ORE_CONFIG
    );
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_LEAD    = createOreFeature(
            getOverworldTargetList(TINY_STONE_ORES.get(Resource.Lead), TINY_DEEPSLATE_ORES.get(Resource.Lead)), FoundationConfig.TINY_LEAD_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_NICKEL  = createOreFeature(
            getOverworldTargetList(TINY_STONE_ORES.get(Resource.Nickel), TINY_DEEPSLATE_ORES.get(Resource.Nickel)), FoundationConfig.TINY_NICKEL_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_SILVER  = createOreFeature(
            getOverworldTargetList(TINY_STONE_ORES.get(Resource.Silver), TINY_DEEPSLATE_ORES.get(Resource.Silver)), FoundationConfig.TINY_SILVER_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_TIN     = createOreFeature(
            getOverworldTargetList(TINY_STONE_ORES.get(Resource.Tin), TINY_DEEPSLATE_ORES.get(Resource.Tin)), FoundationConfig.TINY_TIN_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_TINY_URANIUM = createOreFeature(
            getOverworldTargetList(TINY_STONE_ORES.get(Resource.Uranium), TINY_DEEPSLATE_ORES.get(Resource.Uranium)), FoundationConfig.TINY_URANIUM_ORE_CONFIG);

    /* * * * * * * * * * * * * * * Nether Ore * * *  * * * * * * * * * * */
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_COAL     = createOreFeature(
            OreFeatures.NETHERRACK, NETHER_ORES.get(Resource.Coal), FoundationConfig.NETHER_COAL_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_COPPER   = createOreFeature(
            OreFeatures.NETHERRACK, NETHER_ORES.get(Resource.Copper), FoundationConfig.NETHER_COPPER_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_DIAMOND  = createOreFeature(
            OreFeatures.NETHERRACK, NETHER_ORES.get(Resource.Diamond), FoundationConfig.NETHER_DIAMOND_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_EMERALD  = createOreFeature(
            OreFeatures.NETHERRACK, NETHER_ORES.get(Resource.Emerald), FoundationConfig.NETHER_EMERALD_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_IRON     = createOreFeature(
            OreFeatures.NETHERRACK, NETHER_ORES.get(Resource.Iron), FoundationConfig.NETHER_IRON_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_LAPIS    = createOreFeature(
            OreFeatures.NETHERRACK, NETHER_ORES.get(Resource.Lapis), FoundationConfig.NETHER_LAPIS_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_REDSTONE = createOreFeature(
            OreFeatures.NETHERRACK, NETHER_ORES.get(Resource.RedStone), FoundationConfig.NETHER_REDSTONE_ORE_CONFIG);

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_BAUXITE = createOreFeature(
            OreFeatures.NETHERRACK, NETHER_ORES.get(Resource.Aluminium), FoundationConfig.NETHER_BAUXITE_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_LEAD    = createOreFeature(
            OreFeatures.NETHERRACK, NETHER_ORES.get(Resource.Lead), FoundationConfig.NETHER_LEAD_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_NICKEL  = createOreFeature(
            OreFeatures.NETHERRACK, NETHER_ORES.get(Resource.Nickel), FoundationConfig.NETHER_NICKEL_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_SILVER  = createOreFeature(
            OreFeatures.NETHERRACK, NETHER_ORES.get(Resource.Silver), FoundationConfig.NETHER_SILVER_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_TIN     = createOreFeature(
            OreFeatures.NETHERRACK, NETHER_ORES.get(Resource.Tin), FoundationConfig.NETHER_TIN_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_NETHER_URANIUM = createOreFeature(
            OreFeatures.NETHERRACK, NETHER_ORES.get(Resource.Uranium), FoundationConfig.NETHER_URANIUM_ORE_CONFIG);

    /* * * * * * * * * * * * * * * Gravel Ore * * *  * * * * * * * * * * */
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRAVEL_COAL     = createOreFeature(
            GRAVEL, GRAVEL_ORES.get(Resource.Coal), FoundationConfig.GRAVEL_COAL_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRAVEL_COPPER   = createOreFeature(
            GRAVEL, GRAVEL_ORES.get(Resource.Copper), FoundationConfig.GRAVEL_COPPER_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRAVEL_DIAMOND  = createOreFeature(
            GRAVEL, GRAVEL_ORES.get(Resource.Diamond), FoundationConfig.GRAVEL_DIAMOND_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRAVEL_EMERALD  = createOreFeature(
            GRAVEL, GRAVEL_ORES.get(Resource.Emerald), FoundationConfig.GRAVEL_EMERALD_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRAVEL_IRON     = createOreFeature(
            GRAVEL, GRAVEL_ORES.get(Resource.Iron), FoundationConfig.GRAVEL_IRON_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRAVEL_LAPIS    = createOreFeature(
            GRAVEL, GRAVEL_ORES.get(Resource.Lapis), FoundationConfig.GRAVEL_LAPIS_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRAVEL_REDSTONE = createOreFeature(
            GRAVEL, GRAVEL_ORES.get(Resource.RedStone), FoundationConfig.GRAVEL_REDSTONE_ORE_CONFIG);

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRAVEL_BAUXITE = createOreFeature(
            GRAVEL, GRAVEL_ORES.get(Resource.Aluminium), FoundationConfig.GRAVEL_BAUXITE_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRAVEL_LEAD    = createOreFeature(
            GRAVEL, GRAVEL_ORES.get(Resource.Lead), FoundationConfig.GRAVEL_LEAD_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRAVEL_NICKEL  = createOreFeature(
            GRAVEL, GRAVEL_ORES.get(Resource.Nickel), FoundationConfig.GRAVEL_NICKEL_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRAVEL_SILVER  = createOreFeature(
            GRAVEL, GRAVEL_ORES.get(Resource.Silver), FoundationConfig.GRAVEL_SILVER_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRAVEL_TIN     = createOreFeature(
            GRAVEL, GRAVEL_ORES.get(Resource.Tin), FoundationConfig.GRAVEL_TIN_ORE_CONFIG);
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_GRAVEL_URANIUM = createOreFeature(
            GRAVEL, GRAVEL_ORES.get(Resource.Uranium), FoundationConfig.GRAVEL_URANIUM_ORE_CONFIG);

    private static @NotNull @Unmodifiable List<OreConfiguration.TargetBlockState> getOverworldTargetList(
            @NotNull Supplier<Block> stoneReplacer, @NotNull Supplier<Block> deepSlateReplacer
    ) {
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
                ResourceLocations.of(Foundation.MOD_ID, oreConfig.name()).toString(),
                Feature.ORE,
                new OreConfiguration(targetList, oreConfig.getSize())
        );
    }

    private static @NotNull Holder<ConfiguredFeature<OreConfiguration, ?>> createOreFeature(RuleTest target, @NotNull Supplier<Block> oreBlock, @NotNull OreConfig oreConfig) {
        return FeatureUtils.register(
                ResourceLocations.of(Foundation.MOD_ID, oreConfig.name()).toString(),
                Feature.ORE,
                new OreConfiguration(target, oreBlock.get().defaultBlockState(), oreConfig.getSize())
        );
    }
}
