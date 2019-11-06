package fr.alasdiablo.janoeo.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class EndConfig {

    public static final ForgeConfigSpec CONFIG_SPEC;
    public static final EndConfig.Config CONFIG;

    static {
        Pair<EndConfig.Config, ForgeConfigSpec> configPair = new ForgeConfigSpec.Builder().configure(EndConfig.Config::new);
        CONFIG_SPEC = configPair.getRight();
        CONFIG = configPair.getLeft();
    }


    public static class Config {

        public final ForgeConfigSpec.BooleanValue COAL_END_ORE;
        public final ForgeConfigSpec.BooleanValue GOLD_END_ORE;
        public final ForgeConfigSpec.BooleanValue DIAMOND_END_ORE;
        public final ForgeConfigSpec.BooleanValue EMERALD_END_ORE;
        public final ForgeConfigSpec.BooleanValue IRON_END_ORE;
        public final ForgeConfigSpec.BooleanValue LAPIS_END_ORE;
        public final ForgeConfigSpec.BooleanValue REDSTONE_END_ORE;


        public Config(ForgeConfigSpec.Builder builder) {
            builder.comment("Common config for janoeo")
                    .push("janoeo");

            COAL_END_ORE = builder.comment("End coal ore generation: disable / enable").define("endCoalOreGen", true);
            DIAMOND_END_ORE = builder.comment("End diamond ore generation: disable / enable").define("endDiamondOreGen", true);
            EMERALD_END_ORE = builder.comment("End emerald ore generation: disable / enable").define("endEmeraldOreGen", true);
            GOLD_END_ORE = builder.comment("End gold ore generation: disable / enable").define("endGoldOreGen", true);
            IRON_END_ORE = builder.comment("End iron ore generation: disable / enable").define("endIronOreGen", true);
            LAPIS_END_ORE = builder.comment("End lapis ore generation: disable / enable").define("endLapisOreGen", true);
            REDSTONE_END_ORE = builder.comment("End redstone ore generation: disable / enable").define("endRedstoneOreGen", true);

            builder.pop();
        }
    }
}
