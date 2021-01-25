package fr.alasdiablo.janoeo.world.gen.feature;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.diolib.world.ExtenedFillerBlockType;
import fr.alasdiablo.diolib.world.WorldGenerationHelper;
import fr.alasdiablo.janoeo.init.*;
import fr.alasdiablo.janoeo.config.FrequencyConfig;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.Objects;

/**
 * OreFeature Handler
 */
public class OresFeatures {

    /**
     * Instance of Frequency config
     */
    private static final FrequencyConfig.Config FREQUENCY_CONFIG = FrequencyConfig.CONFIG;

    /**
     * Initialized Nether Dense Ore
     */
    public static void initNetherDenseOre() {
        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_COAL_NETHER_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(NetherDenseOresBlocks.DENSE_COAL_NETHER_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    NetherOresBlocks.COAL_NETHER_ORE.getDefaultState(),
                    NetherDenseOresBlocks.DENSE_COAL_NETHER_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_COAL_NETHER_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_COAL_NETHER_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_COAL_NETHER_ORE_TOP.get()
            );

        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_DIAMOND_NETHER_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(NetherDenseOresBlocks.DENSE_DIAMOND_NETHER_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    NetherOresBlocks.DIAMOND_NETHER_ORE.getDefaultState(),
                    NetherDenseOresBlocks.DENSE_DIAMOND_NETHER_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_DIAMOND_NETHER_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_DIAMOND_NETHER_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_DIAMOND_NETHER_ORE_TOP.get()
            );

        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_EMERALD_NETHER_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(NetherDenseOresBlocks.DENSE_EMERALD_NETHER_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    NetherOresBlocks.EMERALD_NETHER_ORE.getDefaultState(),
                    NetherDenseOresBlocks.DENSE_EMERALD_NETHER_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_EMERALD_NETHER_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_EMERALD_NETHER_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_EMERALD_NETHER_ORE_TOP.get()
            );

        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_GOLD_NETHER_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(NetherDenseOresBlocks.DENSE_GOLD_NETHER_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    NetherOresBlocks.GOLD_NETHER_ORE.getDefaultState(),
                    NetherDenseOresBlocks.DENSE_GOLD_NETHER_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_GOLD_NETHER_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_GOLD_NETHER_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_GOLD_NETHER_ORE_TOP.get()
            );

        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_IRON_NETHER_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(NetherDenseOresBlocks.DENSE_IRON_NETHER_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    NetherOresBlocks.IRON_NETHER_ORE.getDefaultState(),
                    NetherDenseOresBlocks.DENSE_IRON_NETHER_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_IRON_NETHER_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_IRON_NETHER_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_IRON_NETHER_ORE_TOP.get()
            );

        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_LAPIS_NETHER_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(NetherDenseOresBlocks.DENSE_LAPIS_NETHER_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    NetherOresBlocks.LAPIS_NETHER_ORE.getDefaultState(),
                    NetherDenseOresBlocks.DENSE_LAPIS_NETHER_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_LAPIS_NETHER_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_LAPIS_NETHER_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_LAPIS_NETHER_ORE_TOP.get()
            );

        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_REDSTONE_NETHER_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(NetherDenseOresBlocks.DENSE_REDSTONE_NETHER_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    NetherOresBlocks.REDSTONE_NETHER_ORE.getDefaultState(),
                    NetherDenseOresBlocks.DENSE_REDSTONE_NETHER_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_REDSTONE_NETHER_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_REDSTONE_NETHER_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_REDSTONE_NETHER_ORE_TOP.get()
            );

        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_QUARTZ_NETHER_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(NetherDenseOresBlocks.DENSE_QUARTZ_NETHER_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    Blocks.NETHER_QUARTZ_ORE.getDefaultState(),
                    NetherDenseOresBlocks.DENSE_QUARTZ_NETHER_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_QUARTZ_NETHER_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_QUARTZ_NETHER_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_QUARTZ_NETHER_ORE_TOP.get()
            );
    }

    /**
     * Initialized Dense Ore
     */
    public static void initDenseOre() {
        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_COAL_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_COAL_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    Blocks.COAL_ORE.getDefaultState(),
                    OverworldDenseOresBlocks.DENSE_COAL_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_COAL_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_COAL_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_COAL_ORE_TOP.get()
            );

        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_DIAMOND_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_DIAMOND_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    Blocks.DIAMOND_ORE.getDefaultState(),
                    OverworldDenseOresBlocks.DENSE_DIAMOND_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_DIAMOND_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_DIAMOND_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_DIAMOND_ORE_TOP.get()
            );

        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_EMERALD_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    Blocks.EMERALD_ORE.getDefaultState(),
                    OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_EMERALD_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_EMERALD_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_EMERALD_ORE_TOP.get()
            );

        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_GOLD_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_GOLD_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    Blocks.GOLD_ORE.getDefaultState(),
                    OverworldDenseOresBlocks.DENSE_GOLD_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_GOLD_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_GOLD_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_GOLD_ORE_TOP.get()
            );

        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_IRON_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_IRON_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    Blocks.IRON_ORE.getDefaultState(),
                    OverworldDenseOresBlocks.DENSE_IRON_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_IRON_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_IRON_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_IRON_ORE_TOP.get()
            );

        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_LAPIS_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_LAPIS_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    Blocks.LAPIS_ORE.getDefaultState(),
                    OverworldDenseOresBlocks.DENSE_LAPIS_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_LAPIS_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_LAPIS_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_LAPIS_ORE_TOP.get()
            );

        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_REDSTONE_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_REDSTONE_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    Blocks.REDSTONE_ORE.getDefaultState(),
                    OverworldDenseOresBlocks.DENSE_REDSTONE_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_REDSTONE_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_REDSTONE_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_REDSTONE_ORE_TOP.get()
            );

        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_TIN_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_TIN_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    OverworldOresBlocks.TIN_ORE.getDefaultState(),
                    OverworldDenseOresBlocks.DENSE_TIN_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_TIN_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_TIN_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_TIN_ORE_TOP.get()
            );

        for (int i = 0; i < FREQUENCY_CONFIG.DENSE_COPPER_ORE_MULTIPLIER_FACTOR.get(); i++)
            WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                    Objects.requireNonNull(
                            RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_COPPER_ORE.getRegistryName(), String.valueOf(i))
                    ),
                    OverworldOresBlocks.COPPER_ORE.getDefaultState(),
                    OverworldDenseOresBlocks.DENSE_COPPER_ORE.getDefaultState(),
                    FREQUENCY_CONFIG.DENSE_COPPER_ORE_COUNT.get(),
                    FREQUENCY_CONFIG.DENSE_COPPER_ORE_BOTTOM.get(),
                    FREQUENCY_CONFIG.DENSE_COPPER_ORE_TOP.get()
            );
    }

    /**
     * Initialized The End Ore
     */
    public static void initTheEnd() {
        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        EndOresBlocks.COAL_END_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.END_STONE.get(),
                EndOresBlocks.COAL_END_ORE.getDefaultState(),
                FREQUENCY_CONFIG.COAL_THEEND_ORE_SIZE.get(),
                FREQUENCY_CONFIG.COAL_THEEND_ORE_COUNT.get(),
                FREQUENCY_CONFIG.COAL_THEEND_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.COAL_THEEND_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        EndOresBlocks.DIAMOND_END_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.END_STONE.get(),
                EndOresBlocks.DIAMOND_END_ORE.getDefaultState(),
                FREQUENCY_CONFIG.DIAMOND_THEEND_ORE_SIZE.get(),
                FREQUENCY_CONFIG.DIAMOND_THEEND_ORE_COUNT.get(),
                FREQUENCY_CONFIG.DIAMOND_THEEND_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.DIAMOND_THEEND_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                Objects.requireNonNull(
                        EndOresBlocks.EMERALD_END_ORE.getRegistryName()
                ),
                Blocks.END_STONE.getDefaultState(),
                EndOresBlocks.EMERALD_END_ORE.getDefaultState(),
                FREQUENCY_CONFIG.EMERALD_THEEND_ORE_COUNT.get(),
                FREQUENCY_CONFIG.EMERALD_THEEND_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.EMERALD_THEEND_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        EndOresBlocks.GOLD_END_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.END_STONE.get(),
                EndOresBlocks.GOLD_END_ORE.getDefaultState(),
                FREQUENCY_CONFIG.GOLD_THEEND_ORE_SIZE.get(),
                FREQUENCY_CONFIG.GOLD_THEEND_ORE_COUNT.get(),
                FREQUENCY_CONFIG.GOLD_THEEND_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.GOLD_THEEND_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        EndOresBlocks.IRON_END_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.END_STONE.get(),
                EndOresBlocks.IRON_END_ORE.getDefaultState(),
                FREQUENCY_CONFIG.IRON_THEEND_ORE_SIZE.get(),
                FREQUENCY_CONFIG.IRON_THEEND_ORE_COUNT.get(),
                FREQUENCY_CONFIG.IRON_THEEND_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.IRON_THEEND_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        EndOresBlocks.LAPIS_END_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.END_STONE.get(),
                EndOresBlocks.LAPIS_END_ORE.getDefaultState(),
                FREQUENCY_CONFIG.LAPIS_THEEND_ORE_SIZE.get(),
                FREQUENCY_CONFIG.LAPIS_THEEND_ORE_COUNT.get(),
                FREQUENCY_CONFIG.LAPIS_THEEND_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.LAPIS_THEEND_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        EndOresBlocks.REDSTONE_END_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.END_STONE.get(),
                EndOresBlocks.REDSTONE_END_ORE.getDefaultState(),
                FREQUENCY_CONFIG.REDSTONE_THEEND_ORE_SIZE.get(),
                FREQUENCY_CONFIG.REDSTONE_THEEND_ORE_COUNT.get(),
                FREQUENCY_CONFIG.REDSTONE_THEEND_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.REDSTONE_THEEND_ORE_TOP.get()
        );
    }

    /**
     * Initialized Basalt Ore
     */
    public static void initNetherBasalt() {
        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        BasaltOresBlocks.COAL_BASALT_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.BASALT.get(),
                BasaltOresBlocks.COAL_BASALT_ORE.getDefaultState(),
                FREQUENCY_CONFIG.COAL_BASALT_ORE_SIZE.get(),
                FREQUENCY_CONFIG.COAL_BASALT_ORE_COUNT.get(),
                FREQUENCY_CONFIG.COAL_BASALT_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.COAL_BASALT_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        BasaltOresBlocks.DIAMOND_BASALT_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.BASALT.get(),
                BasaltOresBlocks.DIAMOND_BASALT_ORE.getDefaultState(),
                FREQUENCY_CONFIG.DIAMOND_BASALT_ORE_SIZE.get(),
                FREQUENCY_CONFIG.DIAMOND_BASALT_ORE_COUNT.get(),
                FREQUENCY_CONFIG.DIAMOND_BASALT_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.DIAMOND_BASALT_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                Objects.requireNonNull(
                        BasaltOresBlocks.EMERALD_BASALT_ORE.getRegistryName()
                ),
                Blocks.BASALT.getDefaultState(),
                BasaltOresBlocks.EMERALD_BASALT_ORE.getDefaultState(),
                FREQUENCY_CONFIG.EMERALD_BASALT_ORE_COUNT.get(),
                FREQUENCY_CONFIG.EMERALD_BASALT_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.EMERALD_BASALT_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        BasaltOresBlocks.GOLD_BASALT_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.BASALT.get(),
                BasaltOresBlocks.GOLD_BASALT_ORE.getDefaultState(),
                FREQUENCY_CONFIG.GOLD_BASALT_ORE_SIZE.get(),
                FREQUENCY_CONFIG.GOLD_BASALT_ORE_COUNT.get(),
                FREQUENCY_CONFIG.GOLD_BASALT_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.GOLD_BASALT_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        BasaltOresBlocks.IRON_BASALT_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.BASALT.get(),
                BasaltOresBlocks.IRON_BASALT_ORE.getDefaultState(),
                FREQUENCY_CONFIG.IRON_BASALT_ORE_SIZE.get(),
                FREQUENCY_CONFIG.IRON_BASALT_ORE_COUNT.get(),
                FREQUENCY_CONFIG.IRON_BASALT_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.IRON_BASALT_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        BasaltOresBlocks.LAPIS_BASALT_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.BASALT.get(),
                BasaltOresBlocks.LAPIS_BASALT_ORE.getDefaultState(),
                FREQUENCY_CONFIG.LAPIS_BASALT_ORE_SIZE.get(),
                FREQUENCY_CONFIG.LAPIS_BASALT_ORE_COUNT.get(),
                FREQUENCY_CONFIG.LAPIS_BASALT_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.LAPIS_BASALT_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        BasaltOresBlocks.REDSTONE_BASALT_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.BASALT.get(),
                BasaltOresBlocks.REDSTONE_BASALT_ORE.getDefaultState(),
                FREQUENCY_CONFIG.REDSTONE_BASALT_ORE_SIZE.get(),
                FREQUENCY_CONFIG.REDSTONE_BASALT_ORE_COUNT.get(),
                FREQUENCY_CONFIG.REDSTONE_BASALT_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.REDSTONE_BASALT_ORE_TOP.get()
        );
    }

    /**
     * Initialized Nether Ore
     */
    public static void initNetherGravel() {
        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        RegistryHelper.setPrefixOnRegistryName(GravelsOresBlocks.IRON_GRAVEL_ORE.getRegistryName(), "nether")
                ),
                ExtenedFillerBlockType.GRAVEL.get(),
                GravelsOresBlocks.IRON_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.NETHER_IRON_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.NETHER_IRON_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.NETHER_IRON_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.NETHER_IRON_GRAVEL_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        RegistryHelper.setPrefixOnRegistryName(GravelsOresBlocks.GOLD_GRAVEL_ORE.getRegistryName(), "nether")
                ),
                ExtenedFillerBlockType.GRAVEL.get(),
                GravelsOresBlocks.GOLD_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.NETHER_GOLD_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.NETHER_GOLD_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.NETHER_GOLD_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.NETHER_GOLD_GRAVEL_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        RegistryHelper.setPrefixOnRegistryName(GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getRegistryName(), "nether")
                ),
                ExtenedFillerBlockType.GRAVEL.get(),
                GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.NETHER_DIAMOND_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.NETHER_DIAMOND_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.NETHER_DIAMOND_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.NETHER_DIAMOND_GRAVEL_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        RegistryHelper.setPrefixOnRegistryName(GravelsOresBlocks.COAL_GRAVEL_ORE.getRegistryName(), "nether")
                ),
                ExtenedFillerBlockType.GRAVEL.get(),
                GravelsOresBlocks.COAL_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.NETHER_COAL_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.NETHER_COAL_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.NETHER_COAL_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.NETHER_COAL_GRAVEL_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        RegistryHelper.setPrefixOnRegistryName(GravelsOresBlocks.LAPIS_GRAVEL_ORE.getRegistryName(), "nether")
                ),
                ExtenedFillerBlockType.GRAVEL.get(),
                GravelsOresBlocks.LAPIS_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.NETHER_LAPIS_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.NETHER_LAPIS_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.NETHER_LAPIS_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.NETHER_LAPIS_GRAVEL_ORE_TOP.get()
        );
    }

    /**
     * Initialized Ocean Gravel Ore
     */
    public static void initOceanGravel() {
        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        RegistryHelper.setPrefixOnRegistryName(GravelsOresBlocks.IRON_GRAVEL_ORE.getRegistryName(), "ocean")
                ),
                ExtenedFillerBlockType.GRAVEL.get(),
                GravelsOresBlocks.IRON_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.OCEAN_IRON_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.OCEAN_IRON_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.OCEAN_IRON_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.OCEAN_IRON_GRAVEL_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        RegistryHelper.setPrefixOnRegistryName(GravelsOresBlocks.GOLD_GRAVEL_ORE.getRegistryName(), "ocean")
                ),
                ExtenedFillerBlockType.GRAVEL.get(),
                GravelsOresBlocks.GOLD_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.OCEAN_GOLD_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.OCEAN_GOLD_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.OCEAN_GOLD_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.OCEAN_GOLD_GRAVEL_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        RegistryHelper.setPrefixOnRegistryName(GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getRegistryName(), "ocean")
                ),
                ExtenedFillerBlockType.GRAVEL.get(),
                GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.OCEAN_DIAMOND_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.OCEAN_DIAMOND_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.OCEAN_DIAMOND_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.OCEAN_DIAMOND_GRAVEL_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        RegistryHelper.setPrefixOnRegistryName(GravelsOresBlocks.COAL_GRAVEL_ORE.getRegistryName(), "ocean")
                ),
                ExtenedFillerBlockType.GRAVEL.get(),
                GravelsOresBlocks.COAL_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.OCEAN_COAL_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.OCEAN_COAL_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.OCEAN_COAL_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.OCEAN_COAL_GRAVEL_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        RegistryHelper.setPrefixOnRegistryName(GravelsOresBlocks.LAPIS_GRAVEL_ORE.getRegistryName(), "ocean")
                ),
                ExtenedFillerBlockType.GRAVEL.get(),
                GravelsOresBlocks.LAPIS_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.OCEAN_LAPIS_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.OCEAN_LAPIS_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.OCEAN_LAPIS_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.OCEAN_LAPIS_GRAVEL_ORE_TOP.get()
        );
    }

    /**
     * Initialized Gravel Ore
     */
    public static void initGravel() {
        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        GravelsOresBlocks.IRON_GRAVEL_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.GRAVEL.get(),
                GravelsOresBlocks.IRON_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.IRON_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.IRON_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.IRON_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.IRON_GRAVEL_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        GravelsOresBlocks.GOLD_GRAVEL_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.GRAVEL.get(),
                GravelsOresBlocks.GOLD_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.GOLD_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.GOLD_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.GOLD_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.GOLD_GRAVEL_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.GRAVEL.get(),
                GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.DIAMOND_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.DIAMOND_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.DIAMOND_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.DIAMOND_GRAVEL_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        GravelsOresBlocks.COAL_GRAVEL_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.GRAVEL.get(),
                GravelsOresBlocks.COAL_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.COAL_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.COAL_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.COAL_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.COAL_GRAVEL_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        GravelsOresBlocks.LAPIS_GRAVEL_ORE.getRegistryName()
                ),
                ExtenedFillerBlockType.GRAVEL.get(),
                GravelsOresBlocks.LAPIS_GRAVEL_ORE.getDefaultState(),
                FREQUENCY_CONFIG.LAPIS_GRAVEL_ORE_SIZE.get(),
                FREQUENCY_CONFIG.LAPIS_GRAVEL_ORE_COUNT.get(),
                FREQUENCY_CONFIG.LAPIS_GRAVEL_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.LAPIS_GRAVEL_ORE_TOP.get()
        );
    }

    /**
     * Initialized Nether Ore
     */
    public static void initNether() {
        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        NetherOresBlocks.COAL_NETHER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.NETHERRACK,
                NetherOresBlocks.COAL_NETHER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.COAL_NETHER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.COAL_NETHER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.COAL_NETHER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.COAL_NETHER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        NetherOresBlocks.DIAMOND_NETHER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.NETHERRACK,
                NetherOresBlocks.DIAMOND_NETHER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.DIAMOND_NETHER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.DIAMOND_NETHER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.DIAMOND_NETHER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.DIAMOND_NETHER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerReplaceBlockFeature(
                Objects.requireNonNull(
                        NetherOresBlocks.EMERALD_NETHER_ORE.getRegistryName()
                ),
                Blocks.NETHERRACK.getDefaultState(),
                NetherOresBlocks.EMERALD_NETHER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.EMERALD_NETHER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.EMERALD_NETHER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.EMERALD_NETHER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        NetherOresBlocks.GOLD_NETHER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.NETHERRACK,
                NetherOresBlocks.GOLD_NETHER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.GOLD_NETHER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.GOLD_NETHER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.GOLD_NETHER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.GOLD_NETHER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        NetherOresBlocks.IRON_NETHER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.NETHERRACK,
                NetherOresBlocks.IRON_NETHER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.IRON_NETHER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.IRON_NETHER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.IRON_NETHER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.IRON_NETHER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        NetherOresBlocks.LAPIS_NETHER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.NETHERRACK,
                NetherOresBlocks.LAPIS_NETHER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.LAPIS_NETHER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.LAPIS_NETHER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.LAPIS_NETHER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.LAPIS_NETHER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        NetherOresBlocks.REDSTONE_NETHER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.NETHERRACK,
                NetherOresBlocks.REDSTONE_NETHER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.REDSTONE_NETHER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.REDSTONE_NETHER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.REDSTONE_NETHER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.REDSTONE_NETHER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        NetherOresBlocks.ALUMINIUM_NETHER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.NETHERRACK,
                NetherOresBlocks.ALUMINIUM_NETHER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.ALUMINIUM_NETHER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.ALUMINIUM_NETHER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.ALUMINIUM_NETHER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.ALUMINIUM_NETHER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        NetherOresBlocks.LEAD_NETHER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.NETHERRACK,
                NetherOresBlocks.LEAD_NETHER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.LEAD_NETHER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.LEAD_NETHER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.LEAD_NETHER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.LEAD_NETHER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        NetherOresBlocks.TIN_NETHER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.NETHERRACK,
                NetherOresBlocks.TIN_NETHER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.TIN_NETHER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.TIN_NETHER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.TIN_NETHER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.TIN_NETHER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        NetherOresBlocks.COPPER_NETHER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.NETHERRACK,
                NetherOresBlocks.COPPER_NETHER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.COPPER_NETHER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.COPPER_NETHER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.COPPER_NETHER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.COPPER_NETHER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        NetherOresBlocks.RUBY_NETHER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.NETHERRACK,
                NetherOresBlocks.RUBY_NETHER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.RUBY_NETHER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.RUBY_NETHER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.RUBY_NETHER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.RUBY_NETHER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        NetherOresBlocks.SAPPHIRE_NETHER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.NETHERRACK,
                NetherOresBlocks.SAPPHIRE_NETHER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.SAPPHIRE_NETHER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.SAPPHIRE_NETHER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.SAPPHIRE_NETHER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.SAPPHIRE_NETHER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        NetherOresBlocks.SILVER_NETHER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.NETHERRACK,
                NetherOresBlocks.SILVER_NETHER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.SILVER_NETHER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.SILVER_NETHER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.SILVER_NETHER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.SILVER_NETHER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        NetherOresBlocks.URANIUM_NETHER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.NETHERRACK,
                NetherOresBlocks.URANIUM_NETHER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.URANIUM_NETHER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.URANIUM_NETHER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.URANIUM_NETHER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.URANIUM_NETHER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        NetherOresBlocks.OSMIUM_NETHER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.NETHERRACK,
                NetherOresBlocks.OSMIUM_NETHER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.OSMIUM_NETHER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.OSMIUM_NETHER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.OSMIUM_NETHER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.OSMIUM_NETHER_ORE_TOP.get()
        );
    }

    /**
     * Initialized Overworld Ore
     */
    public static void initOverworld() {
        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        OverworldOresBlocks.COPPER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                OverworldOresBlocks.COPPER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.COPPER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.COPPER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.COPPER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.COPPER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        OverworldOresBlocks.TIN_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                OverworldOresBlocks.TIN_ORE.getDefaultState(),
                FREQUENCY_CONFIG.TIN_ORE_SIZE.get(),
                FREQUENCY_CONFIG.TIN_ORE_COUNT.get(),
                FREQUENCY_CONFIG.TIN_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.TIN_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        OverworldOresBlocks.ALUMINIUM_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                OverworldOresBlocks.ALUMINIUM_ORE.getDefaultState(),
                FREQUENCY_CONFIG.ALUMINIUM_ORE_SIZE.get(),
                FREQUENCY_CONFIG.ALUMINIUM_ORE_COUNT.get(),
                FREQUENCY_CONFIG.ALUMINIUM_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.ALUMINIUM_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        OverworldOresBlocks.URANIUM_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                OverworldOresBlocks.URANIUM_ORE.getDefaultState(),
                FREQUENCY_CONFIG.URANIUM_ORE_SIZE.get(),
                FREQUENCY_CONFIG.URANIUM_ORE_COUNT.get(),
                FREQUENCY_CONFIG.URANIUM_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.URANIUM_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        OverworldOresBlocks.OSMIUM_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                OverworldOresBlocks.OSMIUM_ORE.getDefaultState(),
                FREQUENCY_CONFIG.OSMIUM_ORE_SIZE.get(),
                FREQUENCY_CONFIG.OSMIUM_ORE_COUNT.get(),
                FREQUENCY_CONFIG.OSMIUM_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.OSMIUM_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        OverworldOresBlocks.LEAD_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                OverworldOresBlocks.LEAD_ORE.getDefaultState(),
                FREQUENCY_CONFIG.LEAD_ORE_SIZE.get(),
                FREQUENCY_CONFIG.LEAD_ORE_COUNT.get(),
                FREQUENCY_CONFIG.LEAD_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.LEAD_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        OverworldOresBlocks.SILVER_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                OverworldOresBlocks.SILVER_ORE.getDefaultState(),
                FREQUENCY_CONFIG.SILVER_ORE_SIZE.get(),
                FREQUENCY_CONFIG.SILVER_ORE_COUNT.get(),
                FREQUENCY_CONFIG.SILVER_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.SILVER_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        OverworldOresBlocks.RUBY_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                OverworldOresBlocks.RUBY_ORE.getDefaultState(),
                FREQUENCY_CONFIG.RUBY_ORE_SIZE.get(),
                FREQUENCY_CONFIG.RUBY_ORE_COUNT.get(),
                FREQUENCY_CONFIG.RUBY_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.RUBY_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        OverworldOresBlocks.SAPPHIRE_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                OverworldOresBlocks.SAPPHIRE_ORE.getDefaultState(),
                FREQUENCY_CONFIG.SAPPHIRE_ORE_SIZE.get(),
                FREQUENCY_CONFIG.SAPPHIRE_ORE_COUNT.get(),
                FREQUENCY_CONFIG.SAPPHIRE_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.SAPPHIRE_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        OverworldOresBlocks.AMETHYST_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                OverworldOresBlocks.AMETHYST_ORE.getDefaultState(),
                FREQUENCY_CONFIG.AMETHYST_ORE_SIZE.get(),
                FREQUENCY_CONFIG.AMETHYST_ORE_COUNT.get(),
                FREQUENCY_CONFIG.AMETHYST_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.AMETHYST_ORE_TOP.get()
        );

        WorldGenerationHelper.ConfiguredFeatureHelper.registerOreFeature(
                Objects.requireNonNull(
                        OverworldOresBlocks.ZINC_ORE.getRegistryName()
                ),
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                OverworldOresBlocks.ZINC_ORE.getDefaultState(),
                FREQUENCY_CONFIG.ZINC_ORE_SIZE.get(),
                FREQUENCY_CONFIG.ZINC_ORE_COUNT.get(),
                FREQUENCY_CONFIG.ZINC_ORE_BOTTOM.get(),
                FREQUENCY_CONFIG.ZINC_ORE_TOP.get()
        );
    }
}
