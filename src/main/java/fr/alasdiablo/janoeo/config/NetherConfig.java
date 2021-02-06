package fr.alasdiablo.janoeo.config;

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
        // ------------------------------------------- nether -------------------------------------------
        public final ForgeConfigSpec.BooleanValue COAL_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue IRON_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue GOLD_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DIAMOND_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue EMERALD_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue LAPIS_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue REDSTONE_NETHER_ORE;
        // --> MODDED ORE
        public final ForgeConfigSpec.BooleanValue ALUMINIUM_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue AMETHYST_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue APATITE_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue BITUMINOUS_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue CINNABAR_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue COPPER_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue LEAD_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue NICKEL_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue NITER_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue OSMIUM_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue PLATINUM_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue RUBY_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue SALTPETER_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue SAPPHIRE_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue SILVER_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue SULFUR_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue TIN_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue URANIUM_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue ZINC_NETHER_ORE;
        // ---------------------------------------- nether.dense ----------------------------------------
        public final ForgeConfigSpec.BooleanValue DENSE_COAL_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_IRON_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_GOLD_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_DIAMOND_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_EMERALD_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_LAPIS_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_REDSTONE_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_QUARTZ_NETHER_ORE;
        // --> MODDED ORE
        /*public final ForgeConfigSpec.BooleanValue DENSE_ALUMINIUM_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_AMETHYST_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_APATITE_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_BITUMINOUS_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_CINNABAR_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_COPPER_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_LEAD_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_NICKEL_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_NITER_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_OSMIUM_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_PLATINUM_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_RUBY_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_SALTPETER_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_SAPPHIRE_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_SILVER_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_SULFUR_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_TIN_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_URANIUM_NETHER_ORE;
        public final ForgeConfigSpec.BooleanValue DENSE_ZINC_NETHER_ORE;*/

        /**
         * build the config file
         * @param builder
         */
        public Config(ForgeConfigSpec.Builder builder) {
            builder.comment("Nether Ore config for janoeo").push("janoeo");

            // ------------------------------------------- nether -------------------------------------------
            COAL_NETHER_ORE                 = builder.comment("Nether coal ore generation: disable / enable").define("netherCoalOreGen", true);
            IRON_NETHER_ORE                 = builder.comment("Nether iron ore generation: disable / enable").define("netherIronOreGen", true);
            GOLD_NETHER_ORE                 = builder.comment("Nether gold ore generation: disable / enable").define("netherGoldOreGen", false);
            DIAMOND_NETHER_ORE              = builder.comment("Nether diamond ore generation: disable / enable").define("netherDiamondOreGen", true);
            EMERALD_NETHER_ORE              = builder.comment("Nether emerald ore generation: disable / enable").define("netherEmeraldOreGen", true);
            LAPIS_NETHER_ORE                = builder.comment("Nether lapis ore generation: disable / enable").define("netherLapisOreGen", true);
            REDSTONE_NETHER_ORE             = builder.comment("Nether redstone ore generation: disable / enable").define("netherRedstoneOreGen", true);
            // --> MODDED ORE
            ALUMINIUM_NETHER_ORE            = builder.comment("Nether Aluminium ore generation: disable / enable").define("netherAluminiumOreGen", true);
            AMETHYST_NETHER_ORE             = builder.comment("Nether Amethyst ore generation: disable / enable").define("netherAmethystOreGen", true);
            APATITE_NETHER_ORE              = builder.comment("Nether Apatite ore generation: disable / enable").define("netherApatiteOreGen", true);
            BITUMINOUS_NETHER_ORE           = builder.comment("Nether Bituminous ore generation: disable / enable").define("netherBituminousOreGen", true);
            CINNABAR_NETHER_ORE             = builder.comment("Nether Cinnabar ore generation: disable / enable").define("netherCinnabarOreGen", true);
            COPPER_NETHER_ORE               = builder.comment("Nether Copper ore generation: disable / enable").define("netherCopperOreGen", true);
            LEAD_NETHER_ORE                 = builder.comment("Nether Lead ore generation: disable / enable").define("netherLeadOreGen", true);
            NICKEL_NETHER_ORE               = builder.comment("Nether Nickel ore generation: disable / enable").define("netherNickelOreGen", true);
            NITER_NETHER_ORE                = builder.comment("Nether Niter ore generation: disable / enable").define("netherNiterOreGen", true);
            OSMIUM_NETHER_ORE               = builder.comment("Nether Osmium ore generation: disable / enable").define("netherOsmiumOreGen", true);
            PLATINUM_NETHER_ORE             = builder.comment("Nether Platinum ore generation: disable / enable").define("netherPlatinumOreGen", true);
            RUBY_NETHER_ORE                 = builder.comment("Nether Ruby ore generation: disable / enable").define("netherRubyOreGen", true);
            SALTPETER_NETHER_ORE            = builder.comment("Nether Ruby ore generation: disable / enable").define("netherSaltpeterOreGen", true);
            SAPPHIRE_NETHER_ORE             = builder.comment("Nether Sapphire ore generation: disable / enable").define("netherSapphireOreGen", true);
            SILVER_NETHER_ORE               = builder.comment("Nether Silver ore generation: disable / enable").define("netherSilverOreGen", true);
            SULFUR_NETHER_ORE               = builder.comment("Nether Sulfur ore generation: disable / enable").define("netherSulfurOreGen", true);
            TIN_NETHER_ORE                  = builder.comment("Nether Tin ore generation: disable / enable").define("netherTinOreGen", true);
            URANIUM_NETHER_ORE              = builder.comment("Nether Uranium ore generation: disable / enable").define("netherUraniumOreGen", true);
            ZINC_NETHER_ORE                 = builder.comment("Nether Zinc ore generation: disable / enable").define("netherZincOreGen", true);

            // ---------------------------------------- nether.dense ----------------------------------------
            DENSE_COAL_NETHER_ORE           = builder.comment("Nether dense coal generation: disable / enable").define("netherDenseCoalOreGen", true);
            DENSE_IRON_NETHER_ORE           = builder.comment("Nether dense iron ore generation: disable / enable").define("netherDenseIronOreGen", true);
            DENSE_GOLD_NETHER_ORE           = builder.comment("Nether dense gold ore generation: disable / enable").define("netherDenseGoldOreGen", true);
            DENSE_DIAMOND_NETHER_ORE        = builder.comment("Nether dense diamond generation: disable / enable").define("netherDenseDiamondOreGen", true);
            DENSE_EMERALD_NETHER_ORE        = builder.comment("Nether dense emerald ore generation: disable / enable").define("netherDenseEmeraldOreGen", true);
            DENSE_LAPIS_NETHER_ORE          = builder.comment("Nether dense lapis ore generation: disable / enable").define("netherDenseLapisOreGen", true);
            DENSE_REDSTONE_NETHER_ORE       = builder.comment("Nether dense redstone ore generation: disable / enable").define("netherDenseRedstoneOreGen", true);
            DENSE_QUARTZ_NETHER_ORE         = builder.comment("Nether dense quartz ore generation: disable / enable").define("netherDenseQuartzOreGen", true);
            // --> MODDED ORE
            /*DENSE_ALUMINIUM_NETHER_ORE      = builder.comment("Nether DenseAluminium ore generation: disable / enable").define("netherDenseAluminiumOreGen", true);
            DENSE_AMETHYST_NETHER_ORE       = builder.comment("Nether DenseAmethyst ore generation: disable / enable").define("netherDenseAmethystOreGen", true);
            DENSE_APATITE_NETHER_ORE        = builder.comment("Nether DenseApatite ore generation: disable / enable").define("netherDenseApatiteOreGen", true);
            DENSE_BITUMINOUS_NETHER_ORE     = builder.comment("Nether DenseBituminous ore generation: disable / enable").define("netherDenseBituminousOreGen", true);
            DENSE_CINNABAR_NETHER_ORE       = builder.comment("Nether DenseCinnabar ore generation: disable / enable").define("netherDenseCinnabarOreGen", true);
            DENSE_COPPER_NETHER_ORE         = builder.comment("Nether DenseCopper ore generation: disable / enable").define("netherDenseCopperOreGen", true);
            DENSE_LEAD_NETHER_ORE           = builder.comment("Nether DenseLead ore generation: disable / enable").define("netherDenseLeadOreGen", true);
            DENSE_NICKEL_NETHER_ORE         = builder.comment("Nether DenseNickel ore generation: disable / enable").define("netherDenseNickelOreGen", true);
            DENSE_NITER_NETHER_ORE          = builder.comment("Nether DenseNiter ore generation: disable / enable").define("netherDenseNiterOreGen", true);
            DENSE_OSMIUM_NETHER_ORE         = builder.comment("Nether DenseOsmium ore generation: disable / enable").define("netherDenseOsmiumOreGen", true);
            DENSE_PLATINUM_NETHER_ORE       = builder.comment("Nether DensePlatinum ore generation: disable / enable").define("netherDensePlatinumOreGen", true);
            DENSE_RUBY_NETHER_ORE           = builder.comment("Nether DenseRuby ore generation: disable / enable").define("netherDenseRubyOreGen", true);
            DENSE_SALTPETER_NETHER_ORE      = builder.comment("Nether DenseRuby ore generation: disable / enable").define("netherDenseSaltpeterOreGen", true);
            DENSE_SAPPHIRE_NETHER_ORE       = builder.comment("Nether DenseSapphire ore generation: disable / enable").define("netherDenseSapphireOreGen", true);
            DENSE_SILVER_NETHER_ORE         = builder.comment("Nether DenseSilver ore generation: disable / enable").define("netherDenseSilverOreGen", true);
            DENSE_SULFUR_NETHER_ORE         = builder.comment("Nether DenseSulfur ore generation: disable / enable").define("netherDenseSulfurOreGen", true);
            DENSE_TIN_NETHER_ORE            = builder.comment("Nether DenseTin ore generation: disable / enable").define("netherDenseTinOreGen", true);
            DENSE_URANIUM_NETHER_ORE        = builder.comment("Nether DenseUranium ore generation: disable / enable").define("netherDenseUraniumOreGen", true);
            DENSE_ZINC_NETHER_ORE           = builder.comment("Nether DenseZinc ore generation: disable / enable").define("netherDenseZincOreGen", true);*/


            builder.pop();
        }
    }
}
