package fr.alasdiablo.janoeo.utils;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class JANOEOConfig {

    public static final ForgeConfigSpec CONFIG_SPEC;
    public static final Config CONFIG;

    static {
        Pair<Config, ForgeConfigSpec> configPair = new ForgeConfigSpec.Builder().configure(Config::new);
        CONFIG_SPEC = configPair.getRight();
        CONFIG = configPair.getLeft();
    }

    public static class Config {

        public final ForgeConfigSpec.BooleanValue NETHER_ORE_GEN;
        public final ForgeConfigSpec.BooleanValue END_ORE_GEN;
        public final ForgeConfigSpec.BooleanValue DENSE_ORE_GEN;
        public final ForgeConfigSpec.BooleanValue EXTRA_ORE_GEN;

        public Config(ForgeConfigSpec.Builder builder) {
            builder.comment("Common config for janoeo")
                    .push("janoeo");

            NETHER_ORE_GEN = builder.comment("Nether ore generation: disable / enable").define("netherOreGen", true);
            END_ORE_GEN = builder.comment("End ore generation: disable / enable").define("endOreGen", true);
            DENSE_ORE_GEN = builder.comment("Dense ore generation: disable / enable").define("denseOreGen", true);
            EXTRA_ORE_GEN = builder.comment("Extra ore generation: disable / enable").define("extraOreGen", true);

            builder.pop();
        }
    }
}
