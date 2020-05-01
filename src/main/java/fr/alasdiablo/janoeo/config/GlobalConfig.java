package fr.alasdiablo.janoeo.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

/**
 * Janoeo config files
 */
public class GlobalConfig {

    /**
     * Janoeo config spec
     */
    public static final ForgeConfigSpec CONFIG_SPEC;
    /**
     * Janoeo config
     */
    public static final GlobalConfig.Config CONFIG;

    /**
     * Janoeo static constructor
     */
    static {
        Pair<GlobalConfig.Config, ForgeConfigSpec> configPair = new ForgeConfigSpec.Builder().configure(GlobalConfig.Config::new);
        CONFIG_SPEC = configPair.getRight();
        CONFIG = configPair.getLeft();
    }

    /**
     * Janoeo config builder
     */
    public static class Config {

        /**
         * Nether ore generation config value
         */
        public final ForgeConfigSpec.BooleanValue NETHER_ORE_GEN;

        /**
         * End ore generation config value
         */
        public final ForgeConfigSpec.BooleanValue END_ORE_GEN;

        /**
         * dense ore generation config value
         */
        public final ForgeConfigSpec.BooleanValue DENSE_ORE_GEN;

        public final ForgeConfigSpec.BooleanValue NETHER_DENSE_ORE_GEN;

        /**
         * extra ore generation config value
         */
        public final ForgeConfigSpec.BooleanValue EXTRA_ORE_GEN;

        public final ForgeConfigSpec.BooleanValue EXTRA_NETHER_ORE_GEN;

        public final ForgeConfigSpec.BooleanValue ZOMBIE_PIGMAN_ANGER;

        public final ForgeConfigSpec.BooleanValue ENDERMAN_ANGER;

        public final ForgeConfigSpec.IntValue ZOMBIE_PIGMAN_ANGER_RANGE;

        public final ForgeConfigSpec.IntValue ENDERMAN_ANGER_RANGE;

        /**
         * build the config file
         * @param builder
         */
        public Config(ForgeConfigSpec.Builder builder) {
            builder.comment("Common config for janoeo")
                    .push("janoeo");

            NETHER_ORE_GEN = builder.comment("Nether ore generation: disable / enable").define("netherOreGen", true);
            END_ORE_GEN = builder.comment("End ore generation: disable / enable").define("endOreGen", true);
            DENSE_ORE_GEN = builder.comment("Overworld dense ore generation: disable / enable").define("denseOreGen", true);
            NETHER_DENSE_ORE_GEN = builder.comment("Nether dense ore generation: disable / enable").define("denseOreGen", true);
            EXTRA_ORE_GEN = builder.comment("Extra ore generation: disable / enable").define("extraOreGen", true);
            EXTRA_NETHER_ORE_GEN = builder.comment("Extra nether ore generation: disable / enable").define("extraNetherOreGen", true);

            ZOMBIE_PIGMAN_ANGER = builder.comment("Zombie pigman anger on nether ore harvest: disable / enable").define("pigmanAnger", true);
            ENDERMAN_ANGER = builder.comment("Enderman anger on end ore harvest: disable / enable").define("endermanAnger", true);

            ZOMBIE_PIGMAN_ANGER_RANGE = builder.comment("Zombie pigman anger range on nether ore harvest: disable / enable").defineInRange("pigmanAngerRange", 10, 0, 128);
            ENDERMAN_ANGER_RANGE = builder.comment("Enderman anger range on end ore harvest: disable / enable").defineInRange("endermanAngerRange", 10, 0, 128);

            builder.pop();
        }
    }
}
