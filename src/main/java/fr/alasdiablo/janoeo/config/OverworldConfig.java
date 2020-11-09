package fr.alasdiablo.janoeo.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

/**
 * TODO: Add documentation
 */
public class OverworldConfig {

    public static final ForgeConfigSpec CONFIG_SPEC;
    public static final OverworldConfig.Config CONFIG;

    static {
        Pair<OverworldConfig.Config, ForgeConfigSpec> configPair = new ForgeConfigSpec.Builder().configure(OverworldConfig.Config::new);
        CONFIG_SPEC = configPair.getRight();
        CONFIG = configPair.getLeft();
    }


    public static class Config {

        public final ForgeConfigSpec.BooleanValue AMETHYST_ORE;
        public final ForgeConfigSpec.BooleanValue ZINC_ORE;
        public final ForgeConfigSpec.BooleanValue COPPER_ORE;
        public final ForgeConfigSpec.BooleanValue TIN_ORE;
        public final ForgeConfigSpec.BooleanValue ALUMINIUM_ORE;
        public final ForgeConfigSpec.BooleanValue URANIUM_ORE;
        public final ForgeConfigSpec.BooleanValue SILVER_ORE;
        public final ForgeConfigSpec.BooleanValue LEAD_ORE;
        public final ForgeConfigSpec.BooleanValue RUBY_ORE;
        public final ForgeConfigSpec.BooleanValue SAPPHIRE_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_COAL_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_COPPER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_DIAMOND_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_EMERALD_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_GOLD_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_IRON_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_LAPIS_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_REDSTONE_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_TIN_ORE;


        public Config(ForgeConfigSpec.Builder builder) {
            builder.comment("Overworld Ore config for janoeo").push("janoeo");

            COPPER_ORE         = builder.comment("Copper ore generation: disable / enable").define("copperOreGen", true);
            TIN_ORE            = builder.comment("Tin ore generation: disable / enable").define("tinOreGen", true);
            ALUMINIUM_ORE      = builder.comment("Aluminium ore generation: disable / enable").define("aluminiumOreGen", true);
            URANIUM_ORE        = builder.comment("Uranium ore generation: disable / enable").define("uraniumOreGen", true);
            SILVER_ORE         = builder.comment("Silver ore generation: disable / enable").define("silverOreGen", true);
            LEAD_ORE           = builder.comment("Lead ore generation: disable / enable").define("leadOreGen", true);
            RUBY_ORE           = builder.comment("Ruby ore generation: disable / enable").define("rubyOreGen", true);
            SAPPHIRE_ORE       = builder.comment("Sapphire ore generation: disable / enable").define("sapphireOreGen", true);
            AMETHYST_ORE       = builder.comment("Amethyst ore generation: disable / enable").define("amethystOreGen", true);
            ZINC_ORE           = builder.comment("Zinc ore generation: disable / enable").define("zincOreGen", true);
            DENSE_COAL_ORE     = builder.comment("Dense coal ore generation: disable / enable").define("denseCoalOreGen", true);
            DENSE_COPPER_ORE   = builder.comment("Dense copper ore generation: disable / enable").define("denseCopperOreGen", true);
            DENSE_DIAMOND_ORE  = builder.comment("Dense diamond ore generation: disable / enable").define("denseDiamondOreGen", true);
            DENSE_EMERALD_ORE  = builder.comment("Dense emerald ore generation: disable / enable").define("denseEmeraldOreGen", true);
            DENSE_GOLD_ORE     = builder.comment("Dense gold ore generation: disable / enable").define("denseGoldOreGen", true);
            DENSE_IRON_ORE     = builder.comment("Dense iron ore generation: disable / enable").define("denseIronOreGen", true);
            DENSE_LAPIS_ORE    = builder.comment("Dense lapis ore generation: disable / enable").define("denseLapisOreGen", true);
            DENSE_REDSTONE_ORE = builder.comment("Dense redstone ore generation: disable / enable").define("denseRedstoneOreGen", true);
            DENSE_TIN_ORE      = builder.comment("Dense tin ore generation: disable / enable").define("denseTinOreGen", true);

            builder.pop();
        }
    }
}
