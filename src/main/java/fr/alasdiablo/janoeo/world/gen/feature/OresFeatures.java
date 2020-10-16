package fr.alasdiablo.janoeo.world.gen.feature;

import fr.alasdiablo.janoeo.init.GravelsOresBlocks;
import fr.alasdiablo.janoeo.init.NetherOresBlocks;
import fr.alasdiablo.janoeo.init.OverworldOresBlocks;
import fr.alasdiablo.janoeo.config.FrequencyConfig;
import fr.alasdiablo.janoeo.util.Utils;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.ReplaceBlockConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;

public class OresFeatures {

    public static final class FillerBlockType {
        public static final RuleTest GRAVEL = new BlockMatchRuleTest(Blocks.GRAVEL);
    }

    private static final FrequencyConfig.Config FREQUENCY_CONFIG = FrequencyConfig.CONFIG;

    public static void initNetherGravel() {
        createOreGenFeature(
                Utils.setPrefixOnRegistryName(GravelsOresBlocks.IRON_GRAVEL_ORE.getRegistryName(), "nether"),
                FillerBlockType.GRAVEL,
                GravelsOresBlocks.IRON_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.NETHER_IRON_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.NETHER_IRON_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.NETHER_IRON_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.NETHER_IRON_GRAVEL_ORE_TOP.get()
        );

        createOreGenFeature(
                Utils.setPrefixOnRegistryName(GravelsOresBlocks.GOLD_GRAVEL_ORE.getRegistryName(), "nether"),
                FillerBlockType.GRAVEL,
                GravelsOresBlocks.GOLD_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.NETHER_GOLD_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.NETHER_GOLD_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.NETHER_GOLD_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.NETHER_GOLD_GRAVEL_ORE_TOP.get()
        );

        createOreGenFeature(
                Utils.setPrefixOnRegistryName(GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getRegistryName(), "nether"),
                FillerBlockType.GRAVEL,
                GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.NETHER_DIAMOND_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.NETHER_DIAMOND_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.NETHER_DIAMOND_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.NETHER_DIAMOND_GRAVEL_ORE_TOP.get()
        );
    }

    public static void initOceanGravel() {
        createOreGenFeature(
                Utils.setPrefixOnRegistryName(GravelsOresBlocks.IRON_GRAVEL_ORE.getRegistryName(), "ocean"),
                FillerBlockType.GRAVEL,
                GravelsOresBlocks.IRON_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.OCEAN_IRON_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.OCEAN_IRON_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.OCEAN_IRON_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.OCEAN_IRON_GRAVEL_ORE_TOP.get()
        );

        createOreGenFeature(
                Utils.setPrefixOnRegistryName(GravelsOresBlocks.GOLD_GRAVEL_ORE.getRegistryName(), "ocean"),
                FillerBlockType.GRAVEL,
                GravelsOresBlocks.GOLD_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.OCEAN_GOLD_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.OCEAN_GOLD_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.OCEAN_GOLD_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.OCEAN_GOLD_GRAVEL_ORE_TOP.get()
        );

        createOreGenFeature(
                Utils.setPrefixOnRegistryName(GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getRegistryName(), "ocean"),
                FillerBlockType.GRAVEL,
                GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.OCEAN_DIAMOND_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.OCEAN_DIAMOND_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.OCEAN_DIAMOND_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.OCEAN_DIAMOND_GRAVEL_ORE_TOP.get()
        );
    }

    public static void initGravel() {
        createOreGenFeature(
                GravelsOresBlocks.IRON_GRAVEL_ORE.getRegistryName(),
                FillerBlockType.GRAVEL,
                GravelsOresBlocks.IRON_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.IRON_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.IRON_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.IRON_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.IRON_GRAVEL_ORE_TOP.get()
        );

        createOreGenFeature(
                GravelsOresBlocks.GOLD_GRAVEL_ORE.getRegistryName(),
                FillerBlockType.GRAVEL,
                GravelsOresBlocks.GOLD_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.GOLD_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.GOLD_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.GOLD_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.GOLD_GRAVEL_ORE_TOP.get()
        );

        createOreGenFeature(
                GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getRegistryName(),
                FillerBlockType.GRAVEL,
                GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.DIAMOND_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.DIAMOND_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.DIAMOND_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.DIAMOND_GRAVEL_ORE_TOP.get()
        );
    }

    public static void initNether() {
        createOreGenFeature(
                NetherOresBlocks.COAL_NETHER_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241883_b,
                NetherOresBlocks.COAL_NETHER_ORE.getDefaultState(),
                12,
                68,
                1,
                127
        );

        createOreGenFeature(
                NetherOresBlocks.DIAMOND_NETHER_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241883_b,
                NetherOresBlocks.DIAMOND_NETHER_ORE.getDefaultState(),
                4,
                20,
                1,
                127
        );

        createBlockGenFeature(
                NetherOresBlocks.EMERALD_NETHER_ORE.getRegistryName(),
                Blocks.NETHERRACK.getDefaultState(),
                NetherOresBlocks.EMERALD_NETHER_ORE.getDefaultState(),
                8,
                1,
                127
        );

        createOreGenFeature(
                NetherOresBlocks.GOLD_NETHER_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241883_b,
                NetherOresBlocks.GOLD_NETHER_ORE.getDefaultState(),
                4,
                32,
                1,
                127
        );

        createOreGenFeature(
                NetherOresBlocks.IRON_NETHER_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241883_b,
                NetherOresBlocks.IRON_NETHER_ORE.getDefaultState(),
                6,
                40,
                1,
                127
        );

        createOreGenFeature(
                NetherOresBlocks.LAPIS_NETHER_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241883_b,
                NetherOresBlocks.LAPIS_NETHER_ORE.getDefaultState(),
                6,
                20,
                1,
                127
        );

        createOreGenFeature(
                NetherOresBlocks.REDSTONE_NETHER_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241883_b,
                NetherOresBlocks.REDSTONE_NETHER_ORE.getDefaultState(),
                8,
                32,
                1,
                127
        );



        createOreGenFeature(
                NetherOresBlocks.ALUMINIUM_NETHER_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241883_b,
                NetherOresBlocks.ALUMINIUM_NETHER_ORE.getDefaultState(),
                6,
                32,
                1,
                127
        );

        createOreGenFeature(
                NetherOresBlocks.LEAD_NETHER_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241883_b,
                NetherOresBlocks.LEAD_NETHER_ORE.getDefaultState(),
                6,
                40,
                1,
                127
        );

        createOreGenFeature(
                NetherOresBlocks.TIN_NETHER_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241883_b,
                NetherOresBlocks.TIN_NETHER_ORE.getDefaultState(),
                6,
                32,
                1,
                127
        );

        createOreGenFeature(
                NetherOresBlocks.COPPER_NETHER_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241883_b,
                NetherOresBlocks.COPPER_NETHER_ORE.getDefaultState(),
                6,
                40,
                1,
                127
        );

        createOreGenFeature(
                NetherOresBlocks.RUBY_NETHER_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241883_b,
                NetherOresBlocks.RUBY_NETHER_ORE.getDefaultState(),
                4,
                20,
                1,
                127
        );

        createOreGenFeature(
                NetherOresBlocks.SAPPHIRE_NETHER_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241883_b,
                NetherOresBlocks.SAPPHIRE_NETHER_ORE.getDefaultState(),
                4,
                20,
                1,
                127
        );

        createOreGenFeature(
                NetherOresBlocks.SILVER_NETHER_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241883_b,
                NetherOresBlocks.SILVER_NETHER_ORE.getDefaultState(),
                4,
                32,
                1,
                127
        );

        createOreGenFeature(
                NetherOresBlocks.URANIUM_NETHER_ORE.getRegistryName(),
                OreFeatureConfig.FillerBlockType.field_241883_b,
                NetherOresBlocks.URANIUM_NETHER_ORE.getDefaultState(),
                4,
                32,
                1,
                127
        );




    }

    public static void initOverworld() {
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
