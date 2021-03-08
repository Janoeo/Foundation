package fr.alasdiablo.janoeo.foundation.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

/**
 * TODO: Finish documentation
 */
public class NetherConfig {

    /**
     * Janoeo config spec
     */
    public static final ForgeConfigSpec CONFIG_SPEC;
    /**
     * Janoeo config
     */
    public static final NetherConfig.Config CONFIG;

    /**
     * Janoeo static constructor
     */
    static {
        Pair<NetherConfig.Config, ForgeConfigSpec> configPair = new ForgeConfigSpec.Builder().configure(NetherConfig.Config::new);
        CONFIG_SPEC = configPair.getRight();
        CONFIG = configPair.getLeft();
    }

    /**
     * Janoeo config builder
     */
    public static class Config {

        public final ForgeConfigSpec.BooleanValue ALUMINIUM_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue COAL_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DIAMOND_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue EMERALD_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue GOLD_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue IRON_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue LAPIS_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue LEAD_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue REDSTONE_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue RUBY_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue SAPPHIRE_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue SILVER_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue URANIUM_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_QUARTZ_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_COAL_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_DIAMOND_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_EMERALD_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_GOLD_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_IRON_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_LAPIS_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_REDSTONE_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue TIN_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue COPPER_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue OSMIUM_NETHER_ORE;

        /**
         * build the config file
         * @param builder
         */
        public Config(ForgeConfigSpec.Builder builder) {
            builder.comment("Nether Ore config for janoeo").push("janoeo");
            ALUMINIUM_NETHER_ORE = builder.comment("Nether aluminium ore generation: disable / enable").define("netherAluminiumOreGen", true);
            COAL_NETHER_ORE = builder.comment("Nether coal ore generation: disable / enable").define("netherCoalOreGen", true);
            DIAMOND_NETHER_ORE = builder.comment("Nether diamond ore generation: disable / enable").define("netherDiamondOreGen", true);
            EMERALD_NETHER_ORE = builder.comment("Nether emerald ore generation: disable / enable").define("netherEmeraldOreGen", true);
            GOLD_NETHER_ORE = builder.comment("Nether gold ore generation: disable / enable").define("netherGoldOreGen", false);
            IRON_NETHER_ORE = builder.comment("Nether iron ore generation: disable / enable").define("netherIronOreGen", true);
            LAPIS_NETHER_ORE = builder.comment("Nether lapis ore generation: disable / enable").define("netherLapisOreGen", true);
            LEAD_NETHER_ORE = builder.comment("Nether lead ore generation: disable / enable").define("netherLeadOreGen", true);
            REDSTONE_NETHER_ORE = builder.comment("Nether redstone ore generation: disable / enable").define("netherRedstoneOreGen", true);
            RUBY_NETHER_ORE = builder.comment("Nether ruby ore generation: disable / enable").define("netherRubyOreGen", true);
            SAPPHIRE_NETHER_ORE = builder.comment("Nether sapphire ore generation: disable / enable").define("netherSapphireOreGen", true);
            SILVER_NETHER_ORE = builder.comment("Nether silver ore generation: disable / enable").define("netherSilverOreGen", true);
            URANIUM_NETHER_ORE = builder.comment("Nether uranium ore generation: disable / enable").define("netherUraniumOreGen", true);
            DENSE_QUARTZ_NETHER_ORE = builder.comment("Nether dense quartz ore generation: disable / enable").define("netherDenseQuartzOreGen", true);
            DENSE_COAL_NETHER_ORE = builder.comment("Nether dense coal generation: disable / enable").define("netherDenseCoalOreGen", true);
            DENSE_DIAMOND_NETHER_ORE = builder.comment("Nether dense diamond generation: disable / enable").define("netherDenseDiamondOreGen", true);
            DENSE_EMERALD_NETHER_ORE = builder.comment("Nether dense emerald ore generation: disable / enable").define("netherDenseEmeraldOreGen", true);
            DENSE_GOLD_NETHER_ORE = builder.comment("Nether dense gold ore generation: disable / enable").define("netherDenseGoldOreGen", true);
            DENSE_IRON_NETHER_ORE = builder.comment("Nether dense iron ore generation: disable / enable").define("netherDenseIronOreGen", true);
            DENSE_LAPIS_NETHER_ORE = builder.comment("Nether dense lapis ore generation: disable / enable").define("netherDenseLapisOreGen", true);
            DENSE_REDSTONE_NETHER_ORE = builder.comment("Nether dense redstone ore generation: disable / enable").define("netherDenseRedstoneOreGen", true);
            TIN_NETHER_ORE = builder.comment("Nether tin ore generation: disable / enable").define("netherTinOreGen", true);
            COPPER_NETHER_ORE = builder.comment("Nether copper ore generation: disable / enable").define("netherCopperOreGen", true);
            OSMIUM_NETHER_ORE = builder.comment("Nether osmium ore generation: disable / enable").define("netherOsmiumOreGen", true);
            builder.pop();
        }
    }
}
