package fr.alasdiablo.janoeo.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;

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

        public final HashMap<String, ForgeConfigSpec.BooleanValue> Ores = new HashMap<String, ForgeConfigSpec.BooleanValue>();

        /*// --------------------------------------- overworld.stone --------------------------------------
        // --> MODDED ORE
        public final ForgeConfigSpec.BooleanValue ALUMINIUM_ORE;
        public final ForgeConfigSpec.BooleanValue AMBER_ORE;
        public final ForgeConfigSpec.BooleanValue AMETHYST_ORE;
        public final ForgeConfigSpec.BooleanValue APATITE_ORE;
        public final ForgeConfigSpec.BooleanValue BITUMINOUS_ORE;
        public final ForgeConfigSpec.BooleanValue CINNABAR_ORE;
        public final ForgeConfigSpec.BooleanValue COPPER_ORE;
        public final ForgeConfigSpec.BooleanValue LEAD_ORE;
        public final ForgeConfigSpec.BooleanValue NICKEL_ORE;
        public final ForgeConfigSpec.BooleanValue NITER_ORE;
        public final ForgeConfigSpec.BooleanValue OSMIUM_ORE;
        public final ForgeConfigSpec.BooleanValue PLATINUM_ORE;
        public final ForgeConfigSpec.BooleanValue RUBY_ORE;
        public final ForgeConfigSpec.BooleanValue SALTPETER_ORE;
        public final ForgeConfigSpec.BooleanValue SAPPHIRE_ORE;
        public final ForgeConfigSpec.BooleanValue SILVER_ORE;
        public final ForgeConfigSpec.BooleanValue SULFUR_ORE;
        public final ForgeConfigSpec.BooleanValue TIN_ORE;
        public final ForgeConfigSpec.BooleanValue URANIUM_ORE;
        public final ForgeConfigSpec.BooleanValue ZINC_ORE;*/
        // ------------------------------------ overworld.stone.dense -----------------------------------
        public final ForgeConfigSpec.BooleanValue DENSE_COAL_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_IRON_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_GOLD_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_DIAMOND_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_EMERALD_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_LAPIS_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_REDSTONE_ORE;
        // --> MODDED ORE
        public final ForgeConfigSpec.BooleanValue DENSE_COPPER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_TIN_ORE;


        public Config(ForgeConfigSpec.Builder builder) {
            builder.comment("Overworld Ore config for janoeo").push("janoeo");
            // --------------------------------------- overworld.stone --------------------------------------
            // --> MODDED ORE
            Ores.put("ALUMINIUM_ORE",   builder.comment("Aluminium ore generation: disable / enable").define("aluminiumOreGen", true));
            Ores.put("AMBER_ORE",       builder.comment("Amber ore generation: disable / enable").define("amberOreGen", true));
            Ores.put("AMETHYST_ORE",    builder.comment("Amethyst ore generation: disable / enable").define("amethystOreGen", true));
            Ores.put("APATITE_ORE",     builder.comment("Apatite ore generation: disable / enable").define("apatiteOreGen", true));
            Ores.put("BITUMINOUS_ORE",  builder.comment("Bituminous ore generation: disable / enable").define("bituminousOreGen", true));
            Ores.put("CINNABAR_ORE",    builder.comment("Cinnabar ore generation: disable / enable").define("cinnabarOreGen", true));
            Ores.put("COPPER_ORE",      builder.comment("Copper ore generation: disable / enable").define("copperOreGen", true));
            Ores.put("LEAD_ORE",        builder.comment("Lead ore generation: disable / enable").define("leadOreGen", true));
            Ores.put("NICKEL_ORE",      builder.comment("Nickel ore generation: disable / enable").define("nickelOreGen", true));
            Ores.put("NITER_ORE",       builder.comment("Niter ore generation: disable / enable").define("niterOreGen", true));
            Ores.put("OSMIUM_ORE",      builder.comment("Osmium ore generation: disable / enable").define("osmiumOreGen", true));
            Ores.put("PLATINUM_ORE",    builder.comment("Platinum ore generation: disable / enable").define("platinumOreGen", true));
            Ores.put("RUBY_ORE",        builder.comment("Ruby ore generation: disable / enable").define("rubyOreGen", true));
            Ores.put("SALTPETER_ORE",   builder.comment("Saltpeter ore generation: disable / enable").define("saltpeterOreGen", true));
            Ores.put("SAPPHIRE_ORE",    builder.comment("Sapphire ore generation: disable / enable").define("sapphireOreGen", true));
            Ores.put("SILVER_ORE",      builder.comment("Silver ore generation: disable / enable").define("silverOreGen", true));
            Ores.put("SULFUR_ORE",      builder.comment("Sulfur ore generation: disable / enable").define("sulfurOreGen", true));
            Ores.put("TIN_ORE",         builder.comment("Tin ore generation: disable / enable").define("tinOreGen", true));
            Ores.put("URANIUM_ORE",     builder.comment("Uranium ore generation: disable / enable").define("uraniumOreGen", true));
            Ores.put("ZINC_ORE",        builder.comment("Zinc ore generation: disable / enable").define("zincOreGen", true));

            // ------------------------------------ overworld.stone.dense -----------------------------------
            DENSE_COAL_ORE     = builder.comment("Dense coal ore generation: disable / enable").define("denseCoalOreGen", true);
            DENSE_IRON_ORE     = builder.comment("Dense iron ore generation: disable / enable").define("denseIronOreGen", true);
            DENSE_GOLD_ORE     = builder.comment("Dense gold ore generation: disable / enable").define("denseGoldOreGen", true);
            DENSE_DIAMOND_ORE  = builder.comment("Dense diamond ore generation: disable / enable").define("denseDiamondOreGen", true);
            DENSE_EMERALD_ORE  = builder.comment("Dense emerald ore generation: disable / enable").define("denseEmeraldOreGen", true);
            DENSE_LAPIS_ORE    = builder.comment("Dense lapis ore generation: disable / enable").define("denseLapisOreGen", true);
            DENSE_REDSTONE_ORE = builder.comment("Dense redstone ore generation: disable / enable").define("denseRedstoneOreGen", true);
            // --> MODDED ORE
            DENSE_COPPER_ORE   = builder.comment("Dense copper ore generation: disable / enable").define("denseCopperOreGen", true);
            DENSE_TIN_ORE      = builder.comment("Dense tin ore generation: disable / enable").define("denseTinOreGen", true);

            builder.pop();
        }
    }
}
