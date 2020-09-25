package fr.alasdiablo.janoeo.world.gen.feature;

import fr.alasdiablo.janoeo.init.OverworldDenseOresBlocks;
import fr.alasdiablo.janoeo.init.OverworldOresBlocks;
import fr.alasdiablo.janoeo.config.FrequencyConfig;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.ReplaceBlockConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;

public class OresFeatures {

    private static final FrequencyConfig.Config FREQUENCY_CONFIG = FrequencyConfig.CONFIG;

    public static void init() {
        createBlockGenFeature(
                OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getRegistryName(),
                Blocks.EMERALD_ORE.getDefaultState(),
                OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getDefaultState(),
                FREQUENCY_CONFIG.DENSE_EMERALD_ORE_COUNT.get(),
                FREQUENCY_CONFIG.DENSE_EMERALD_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.DENSE_EMERALD_ORE_TOP.get()
        );

        createOreGenFeature(
                OverworldOresBlocks.COPPER_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241882_a,
                OverworldOresBlocks.COPPER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.COPPER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.COPPER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.COPPER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.COPPER_ORE_TOP.get()
        );

        createOreGenFeature(
                OverworldOresBlocks.TIN_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241882_a,
                OverworldOresBlocks.TIN_ORE.getDefaultState(),
                FREQUENCY_CONFIG.TIN_ORE_SIZE.get(),
                FREQUENCY_CONFIG.TIN_ORE_COUNT.get(),
                FREQUENCY_CONFIG.TIN_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.TIN_ORE_TOP.get()
        );

        createOreGenFeature(
                OverworldOresBlocks.ALUMINIUM_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241882_a,
                OverworldOresBlocks.ALUMINIUM_ORE.getDefaultState(),
                FREQUENCY_CONFIG.ALUMINIUM_ORE_SIZE.get(),
                FREQUENCY_CONFIG.ALUMINIUM_ORE_COUNT.get(),
                FREQUENCY_CONFIG.ALUMINIUM_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.ALUMINIUM_ORE_TOP.get()
        );

        createOreGenFeature(
                OverworldOresBlocks.URANIUM_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241882_a,
                OverworldOresBlocks.URANIUM_ORE.getDefaultState(),
                FREQUENCY_CONFIG.URANIUM_ORE_SIZE.get(),
                FREQUENCY_CONFIG.URANIUM_ORE_COUNT.get(),
                FREQUENCY_CONFIG.URANIUM_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.URANIUM_ORE_TOP.get()
        );

        createOreGenFeature(
                OverworldOresBlocks.LEAD_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241882_a,
                OverworldOresBlocks.LEAD_ORE.getDefaultState(),
                FREQUENCY_CONFIG.LEAD_ORE_SIZE.get(),
                FREQUENCY_CONFIG.LEAD_ORE_COUNT.get(),
                FREQUENCY_CONFIG.LEAD_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.LEAD_ORE_TOP.get()
        );

        createOreGenFeature(
                OverworldOresBlocks.SILVER_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241882_a,
                OverworldOresBlocks.SILVER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.SILVER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.SILVER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.SILVER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.SILVER_ORE_TOP.get()
        );

        createOreGenFeature(
                OverworldOresBlocks.RUBY_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241882_a,
                OverworldOresBlocks.RUBY_ORE.getDefaultState(),
                FREQUENCY_CONFIG.RUBY_ORE_SIZE.get(),
                FREQUENCY_CONFIG.RUBY_ORE_COUNT.get(),
                FREQUENCY_CONFIG.RUBY_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.RUBY_ORE_TOP.get()
        );

        createOreGenFeature(
                OverworldOresBlocks.SAPPHIRE_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241882_a,
                OverworldOresBlocks.SAPPHIRE_ORE.getDefaultState(),
                FREQUENCY_CONFIG.SAPPHIRE_ORE_SIZE.get(),
                FREQUENCY_CONFIG.SAPPHIRE_ORE_COUNT.get(),
                FREQUENCY_CONFIG.SAPPHIRE_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.SAPPHIRE_ORE_TOP.get()
        );

        createOreGenFeature(
                OverworldOresBlocks.AMETHYST_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241882_a,
                OverworldOresBlocks.AMETHYST_ORE.getDefaultState(),
                FREQUENCY_CONFIG.AMETHYST_ORE_SIZE.get(),
                FREQUENCY_CONFIG.AMETHYST_ORE_COUNT.get(),
                FREQUENCY_CONFIG.AMETHYST_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.AMETHYST_ORE_TOP.get()
        );

        createOreGenFeature(
                OverworldOresBlocks.ZINC_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241882_a,
                OverworldOresBlocks.ZINC_ORE.getDefaultState(),
                FREQUENCY_CONFIG.ZINC_ORE_SIZE.get(),
                FREQUENCY_CONFIG.ZINC_ORE_COUNT.get(),
                FREQUENCY_CONFIG.ZINC_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.ZINC_ORE_TOP.get()
        );
    }

    private static void createOreGenFeature(ResourceLocation name, RuleTest blockType, BlockState oreBlock, int size, int count, int bottom, int top) {
        Registry.register(
                WorldGenRegistries.field_243653_e,
                name,
                Feature.ORE.withConfiguration(
                        new OreFeatureConfig(
                                blockType,
                                oreBlock,
                                size
                        )
                ).withPlacement(
                        Placement.field_242907_l/* RANGE */.configure(
                                new TopSolidRangeConfig(
                                        bottom,
                                        0,
                                        top)
                        )
                ).func_242728_a/* spreadHorizontally */().func_242731_b/* repeat */(count)
        );
    }

    private static void createBlockGenFeature(ResourceLocation name, BlockState replacementBlock, BlockState oreBlock, int count, int bottom, int top) {
        Registry.register(
                WorldGenRegistries.field_243653_e,
                name,
                Feature.EMERALD_ORE.withConfiguration(
                        new ReplaceBlockConfig(
                                replacementBlock,
                                oreBlock
                        )
                ).withPlacement(
                        Placement.field_242907_l/* RANGE */.configure(
                                new TopSolidRangeConfig(
                                        bottom,
                                        0,
                                        top)
                        )
                ).func_242728_a/* spreadHorizontally */().func_242731_b/* repeat */(count)
        );
    }
}
