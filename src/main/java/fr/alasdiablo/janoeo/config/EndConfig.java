package fr.alasdiablo.janoeo.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

/**
 * TODO: Add documentation
 */
public class EndConfig {

    public static final ForgeConfigSpec CONFIG_SPEC;
    public static final EndConfig.Config CONFIG;

    static {
        Pair<EndConfig.Config, ForgeConfigSpec> configPair = new ForgeConfigSpec.Builder().configure(EndConfig.Config::new);
        CONFIG_SPEC = configPair.getRight();
        CONFIG = configPair.getLeft();
    }


    public static class Config {

        // ------------------------------------------- theend -------------------------------------------
        public final ForgeConfigSpec.BooleanValue COAL_END_ORE;
        public final ForgeConfigSpec.BooleanValue IRON_END_ORE;
        public final ForgeConfigSpec.BooleanValue GOLD_END_ORE;
        public final ForgeConfigSpec.BooleanValue DIAMOND_END_ORE;
        public final ForgeConfigSpec.BooleanValue EMERALD_END_ORE;
        public final ForgeConfigSpec.BooleanValue LAPIS_END_ORE;
        public final ForgeConfigSpec.BooleanValue REDSTONE_END_ORE;
        // --> MODDED ORE
        public final ForgeConfigSpec.BooleanValue ALUMINIUM_END_ORE;
        public final ForgeConfigSpec.BooleanValue AMETHYST_END_ORE;
        public final ForgeConfigSpec.BooleanValue APATITE_END_ORE;
        public final ForgeConfigSpec.BooleanValue BITUMINOUS_END_ORE;
        public final ForgeConfigSpec.BooleanValue CINNABAR_END_ORE;
        public final ForgeConfigSpec.BooleanValue COPPER_END_ORE;
        public final ForgeConfigSpec.BooleanValue LEAD_END_ORE;
        public final ForgeConfigSpec.BooleanValue NICKEL_END_ORE;
        public final ForgeConfigSpec.BooleanValue NITER_END_ORE;
        public final ForgeConfigSpec.BooleanValue OSMIUM_END_ORE;
        public final ForgeConfigSpec.BooleanValue PLATINUM_END_ORE;
        public final ForgeConfigSpec.BooleanValue RUBY_END_ORE;
        public final ForgeConfigSpec.BooleanValue SALTPETER_END_ORE;
        public final ForgeConfigSpec.BooleanValue SAPPHIRE_END_ORE;
        public final ForgeConfigSpec.BooleanValue SILVER_END_ORE;
        public final ForgeConfigSpec.BooleanValue SULFUR_END_ORE;
        public final ForgeConfigSpec.BooleanValue TIN_END_ORE;
        public final ForgeConfigSpec.BooleanValue URANIUM_END_ORE;
        public final ForgeConfigSpec.BooleanValue ZINC_END_ORE;

        public Config(ForgeConfigSpec.Builder builder) {
            builder.comment("End Ore config for janoeo").push("janoeo");
            // ------------------------------------------- theend -------------------------------------------
            COAL_END_ORE = builder.comment("End coal ore generation: disable / enable").define("endCoalOreGen", true);
            IRON_END_ORE = builder.comment("End iron ore generation: disable / enable").define("endIronOreGen", true);
            GOLD_END_ORE = builder.comment("End gold ore generation: disable / enable").define("endGoldOreGen", true);
            DIAMOND_END_ORE = builder.comment("End diamond ore generation: disable / enable").define("endDiamondOreGen", true);
            EMERALD_END_ORE = builder.comment("End emerald ore generation: disable / enable").define("endEmeraldOreGen", true);
            LAPIS_END_ORE = builder.comment("End lapis ore generation: disable / enable").define("endLapisOreGen", true);
            REDSTONE_END_ORE = builder.comment("End redstone ore generation: disable / enable").define("endRedstoneOreGen", true);

            // --> MODDED ORE
            ALUMINIUM_END_ORE      = builder.comment("End Aluminium ore generation: disable / enable").define("endAluminiumOreGen", true);
            AMETHYST_END_ORE       = builder.comment("End Amethyst ore generation: disable / enable").define("endAmethystOreGen", true);
            APATITE_END_ORE        = builder.comment("End Apatite ore generation: disable / enable").define("endApatiteOreGen", true);
            BITUMINOUS_END_ORE     = builder.comment("End Bituminous ore generation: disable / enable").define("endBituminousOreGen", true);
            CINNABAR_END_ORE       = builder.comment("End Cinnabar ore generation: disable / enable").define("endCinnabarOreGen", true);
            COPPER_END_ORE         = builder.comment("End Copper ore generation: disable / enable").define("endCopperOreGen", true);
            LEAD_END_ORE           = builder.comment("End Lead ore generation: disable / enable").define("endLeadOreGen", true);
            NICKEL_END_ORE         = builder.comment("End Nickel ore generation: disable / enable").define("endNickelOreGen", true);
            NITER_END_ORE          = builder.comment("End Niter ore generation: disable / enable").define("endNiterOreGen", true);
            OSMIUM_END_ORE         = builder.comment("End Osmium ore generation: disable / enable").define("endOsmiumOreGen", true);
            PLATINUM_END_ORE       = builder.comment("End Platinum ore generation: disable / enable").define("endPlatinumOreGen", true);
            RUBY_END_ORE           = builder.comment("End Ruby ore generation: disable / enable").define("endRubyOreGen", true);
            SALTPETER_END_ORE      = builder.comment("End Saltpeter ore generation: disable / enable").define("endSaltpeterOreGen", true);
            SAPPHIRE_END_ORE       = builder.comment("End Sapphire ore generation: disable / enable").define("endSapphireOreGen", true);
            SILVER_END_ORE         = builder.comment("End Silver ore generation: disable / enable").define("endSilverOreGen", true);
            SULFUR_END_ORE         = builder.comment("End Sulfur ore generation: disable / enable").define("endSulfurOreGen", true);
            TIN_END_ORE            = builder.comment("End Tin ore generation: disable / enable").define("endTinOreGen", true);
            URANIUM_END_ORE        = builder.comment("End Uranium ore generation: disable / enable").define("endUraniumOreGen", true);
            ZINC_END_ORE           = builder.comment("End Zinc ore generation: disable / enable").define("endZincOreGen", true);

            builder.pop();
        }
    }
}
