package fr.alasdiablo.janoeo.foundation.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

/**
 * TODO: Add documentation
 */
public class BasaltConfig {

    public static final ForgeConfigSpec CONFIG_SPEC;
    public static final BasaltConfig.Config CONFIG;

    static {
        Pair<BasaltConfig.Config, ForgeConfigSpec> configPair = new ForgeConfigSpec.Builder().configure(BasaltConfig.Config::new);
        CONFIG_SPEC = configPair.getRight();
        CONFIG = configPair.getLeft();
    }


    public static class Config {

        public final ForgeConfigSpec.BooleanValue COAL_BASALT_ORE;
        public final ForgeConfigSpec.BooleanValue GOLD_BASALT_ORE;
        public final ForgeConfigSpec.BooleanValue DIAMOND_BASALT_ORE;
        public final ForgeConfigSpec.BooleanValue EMERALD_BASALT_ORE;
        public final ForgeConfigSpec.BooleanValue IRON_BASALT_ORE;
        public final ForgeConfigSpec.BooleanValue LAPIS_BASALT_ORE;
        public final ForgeConfigSpec.BooleanValue REDSTONE_BASALT_ORE;


        public Config(ForgeConfigSpec.Builder builder) {
            builder.comment("Basalt Ore config for janoeo").push("janoeo");

            COAL_BASALT_ORE = builder.comment("Basalt coal ore generation: disable / enable").define("basaltCoalOreGen", true);
            DIAMOND_BASALT_ORE = builder.comment("Basalt diamond ore generation: disable / enable").define("basaltDiamondOreGen", true);
            EMERALD_BASALT_ORE = builder.comment("Basalt emerald ore generation: disable / enable").define("basaltEmeraldOreGen", true);
            GOLD_BASALT_ORE = builder.comment("Basalt gold ore generation: disable / enable").define("basaltGoldOreGen", true);
            IRON_BASALT_ORE = builder.comment("Basalt iron ore generation: disable / enable").define("basaltIronOreGen", true);
            LAPIS_BASALT_ORE = builder.comment("Basalt lapis ore generation: disable / enable").define("basaltLapisOreGen", true);
            REDSTONE_BASALT_ORE = builder.comment("Basalt redstone ore generation: disable / enable").define("basaltRedstoneOreGen", true);

            builder.pop();
        }
    }
}
