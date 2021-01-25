package fr.alasdiablo.janoeo.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

/**
 * TODO: Add documentation
 */
public class GravelConfig {
    public static final ForgeConfigSpec CONFIG_SPEC;
    public static final GravelConfig.Config CONFIG;

    static {
        Pair<GravelConfig.Config, ForgeConfigSpec> configPair = new ForgeConfigSpec.Builder().configure(GravelConfig.Config::new);
        CONFIG_SPEC = configPair.getRight();
        CONFIG = configPair.getLeft();
    }


    public static class Config {

        public final ForgeConfigSpec.BooleanValue GOLD_GRAVEL_ORE;
        public final ForgeConfigSpec.BooleanValue DIAMOND_GRAVEL_ORE;
        public final ForgeConfigSpec.BooleanValue IRON_GRAVEL_ORE;
        public final ForgeConfigSpec.BooleanValue COAL_GRAVEL_ORE;
        public final ForgeConfigSpec.BooleanValue LAPIS_GRAVEL_ORE;


        public Config(ForgeConfigSpec.Builder builder) {
            builder.comment("Gravel Ore config for janoeo").push("janoeo");

            GOLD_GRAVEL_ORE = builder.comment("Gravel gold ore generation: disable / enable").define("gravelGoldOreGen", true);
            DIAMOND_GRAVEL_ORE = builder.comment("Gravel diamond ore generation: disable / enable").define("gravelDiamondOreGen", true);
            IRON_GRAVEL_ORE = builder.comment("Gravel iron ore generation: disable / enable").define("gravelIronOreGen", true);
            COAL_GRAVEL_ORE = builder.comment("Gravel coal ore generation: disable / enable").define("gravelCoalOreGen", true);
            LAPIS_GRAVEL_ORE = builder.comment("Gravel lapis ore generation: disable / enable").define("gravelLapisOreGen", true);

            builder.pop();
        }
    }
}
