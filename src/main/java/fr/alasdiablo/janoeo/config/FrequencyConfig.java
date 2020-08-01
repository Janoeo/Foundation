package fr.alasdiablo.janoeo.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class FrequencyConfig {

    public static final ForgeConfigSpec CONFIG_SPEC;
    public static final Config CONFIG;

    static {
        Pair<Config, ForgeConfigSpec> configPair = new ForgeConfigSpec.Builder().configure(Config::new);
        CONFIG_SPEC = configPair.getRight();
        CONFIG = configPair.getLeft();
    }

    public static class Config {

        public final ForgeConfigSpec.IntValue COPPER_ORE_SIZE;
        public final ForgeConfigSpec.IntValue COPPER_ORE_COUNT;
        public final ForgeConfigSpec.IntValue COPPER_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue COPPER_ORE_TOP;

        public final ForgeConfigSpec.IntValue TIN_ORE_SIZE;
        public final ForgeConfigSpec.IntValue TIN_ORE_COUNT;
        public final ForgeConfigSpec.IntValue TIN_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue TIN_ORE_TOP;

        public final ForgeConfigSpec.IntValue ALUMINIUM_ORE_SIZE;
        public final ForgeConfigSpec.IntValue ALUMINIUM_ORE_COUNT;
        public final ForgeConfigSpec.IntValue ALUMINIUM_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue ALUMINIUM_ORE_TOP;

        public final ForgeConfigSpec.IntValue URANIUM_ORE_SIZE;
        public final ForgeConfigSpec.IntValue URANIUM_ORE_COUNT;
        public final ForgeConfigSpec.IntValue URANIUM_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue URANIUM_ORE_TOP;

        public final ForgeConfigSpec.IntValue LEAD_ORE_SIZE;
        public final ForgeConfigSpec.IntValue LEAD_ORE_COUNT;
        public final ForgeConfigSpec.IntValue LEAD_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue LEAD_ORE_TOP;

        public final ForgeConfigSpec.IntValue SILVER_ORE_SIZE;
        public final ForgeConfigSpec.IntValue SILVER_ORE_COUNT;
        public final ForgeConfigSpec.IntValue SILVER_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue SILVER_ORE_TOP;

        public final ForgeConfigSpec.IntValue RUBY_ORE_SIZE;
        public final ForgeConfigSpec.IntValue RUBY_ORE_COUNT;
        public final ForgeConfigSpec.IntValue RUBY_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue RUBY_ORE_TOP;

        public final ForgeConfigSpec.IntValue SAPPHIRE_ORE_SIZE;
        public final ForgeConfigSpec.IntValue SAPPHIRE_ORE_COUNT;
        public final ForgeConfigSpec.IntValue SAPPHIRE_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue SAPPHIRE_ORE_TOP;

        public final ForgeConfigSpec.IntValue AMETHYST_ORE_SIZE;
        public final ForgeConfigSpec.IntValue AMETHYST_ORE_COUNT;
        public final ForgeConfigSpec.IntValue AMETHYST_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue AMETHYST_ORE_TOP;

        public final ForgeConfigSpec.IntValue ZINC_ORE_SIZE;
        public final ForgeConfigSpec.IntValue ZINC_ORE_COUNT;
        public final ForgeConfigSpec.IntValue ZINC_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue ZINC_ORE_TOP;

        public final ForgeConfigSpec.IntValue DENSE_COPPER_ORE_COUNT;
        public final ForgeConfigSpec.IntValue DENSE_COPPER_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue DENSE_COPPER_ORE_TOP;

        public final ForgeConfigSpec.IntValue DENSE_TIN_ORE_COUNT;
        public final ForgeConfigSpec.IntValue DENSE_TIN_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue DENSE_TIN_ORE_TOP;

        public final ForgeConfigSpec.IntValue DENSE_EMERALD_ORE_COUNT;
        public final ForgeConfigSpec.IntValue DENSE_EMERALD_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue DENSE_EMERALD_ORE_TOP;

        public final ForgeConfigSpec.IntValue DENSE_COAL_ORE_COUNT;
        public final ForgeConfigSpec.IntValue DENSE_COAL_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue DENSE_COAL_ORE_TOP;

        public final ForgeConfigSpec.IntValue DENSE_GOLD_ORE_COUNT;
        public final ForgeConfigSpec.IntValue DENSE_GOLD_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue DENSE_GOLD_ORE_TOP;

        public final ForgeConfigSpec.IntValue DENSE_IRON_ORE_COUNT;
        public final ForgeConfigSpec.IntValue DENSE_IRON_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue DENSE_IRON_ORE_TOP;

        public final ForgeConfigSpec.IntValue DENSE_LAPIS_ORE_COUNT;
        public final ForgeConfigSpec.IntValue DENSE_LAPIS_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue DENSE_LAPIS_ORE_TOP;

        public final ForgeConfigSpec.IntValue DENSE_REDSTONE_ORE_COUNT;
        public final ForgeConfigSpec.IntValue DENSE_REDSTONE_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue DENSE_REDSTONE_ORE_TOP;

        public final ForgeConfigSpec.IntValue DENSE_DIAMOND_ORE_COUNT;
        public final ForgeConfigSpec.IntValue DENSE_DIAMOND_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue DENSE_DIAMOND_ORE_TOP;

        public final ForgeConfigSpec.IntValue COAL_BASALT_ORE_SIZE;
        public final ForgeConfigSpec.IntValue COAL_BASALT_ORE_COUNT;
        public final ForgeConfigSpec.IntValue COAL_BASALT_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue COAL_BASALT_ORE_TOP;

        public final ForgeConfigSpec.IntValue GOLD_BASALT_ORE_SIZE;
        public final ForgeConfigSpec.IntValue GOLD_BASALT_ORE_COUNT;
        public final ForgeConfigSpec.IntValue GOLD_BASALT_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue GOLD_BASALT_ORE_TOP;

        public final ForgeConfigSpec.IntValue DIAMOND_BASALT_ORE_SIZE;
        public final ForgeConfigSpec.IntValue DIAMOND_BASALT_ORE_COUNT;
        public final ForgeConfigSpec.IntValue DIAMOND_BASALT_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue DIAMOND_BASALT_ORE_TOP;

        public final ForgeConfigSpec.IntValue EMERALD_BASALT_ORE_COUNT;
        public final ForgeConfigSpec.IntValue EMERALD_BASALT_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue EMERALD_BASALT_ORE_TOP;

        public final ForgeConfigSpec.IntValue IRON_BASALT_ORE_SIZE;
        public final ForgeConfigSpec.IntValue IRON_BASALT_ORE_COUNT;
        public final ForgeConfigSpec.IntValue IRON_BASALT_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue IRON_BASALT_ORE_TOP;

        public final ForgeConfigSpec.IntValue LAPIS_BASALT_ORE_SIZE;
        public final ForgeConfigSpec.IntValue LAPIS_BASALT_ORE_COUNT;
        public final ForgeConfigSpec.IntValue LAPIS_BASALT_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue LAPIS_BASALT_ORE_TOP;

        public final ForgeConfigSpec.IntValue REDSTONE_BASALT_ORE_SIZE;
        public final ForgeConfigSpec.IntValue REDSTONE_BASALT_ORE_COUNT;
        public final ForgeConfigSpec.IntValue REDSTONE_BASALT_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue REDSTONE_BASALT_ORE_TOP;

        public Config(ForgeConfigSpec.Builder builder) {
            builder.comment("Ore frequency and height config for janoeo").push("janoeo");

            final int sizeMin = 1, sizeMax = 128, countMin = 0, countMax = 4096, worldMin = 1, worldMax = 255;

            COPPER_ORE_SIZE             = builder.defineInRange("overworld.copper_size"             , 8 , sizeMin, sizeMax);
            COPPER_ORE_COUNT            = builder.defineInRange("overworld.copper_count"            , 12, countMin, countMax);
            COPPER_ORE_TOP              = builder.defineInRange("overworld.copper_top"              , 63, worldMin, worldMax);
            COPPER_ORE_BOTTOM           = builder.defineInRange("overworld.copper_bottom"           , 1 , worldMin, worldMax);

            TIN_ORE_SIZE                = builder.defineInRange("overworld.tin_size"                , 8 , sizeMin, sizeMax);
            TIN_ORE_COUNT               = builder.defineInRange("overworld.tin_count"               , 12, countMin, countMax);
            TIN_ORE_TOP                 = builder.defineInRange("overworld.tin_top"                 , 63, worldMin, worldMax);
            TIN_ORE_BOTTOM              = builder.defineInRange("overworld.tin_bottom"              , 1 , worldMin, worldMax);

            ALUMINIUM_ORE_SIZE          = builder.defineInRange("overworld.aluminium_size"          , 12, sizeMin, sizeMax);
            ALUMINIUM_ORE_COUNT         = builder.defineInRange("overworld.aluminium_count"         , 12, countMin, countMax);
            ALUMINIUM_ORE_TOP           = builder.defineInRange("overworld.aluminium_top"           , 63, worldMin, worldMax);
            ALUMINIUM_ORE_BOTTOM        = builder.defineInRange("overworld.aluminium_bottom"        , 1 , worldMin, worldMax);

            URANIUM_ORE_SIZE            = builder.defineInRange("overworld.uranium_size"            , 4 , sizeMin, sizeMax);
            URANIUM_ORE_COUNT           = builder.defineInRange("overworld.uranium_count"           , 12, countMin, countMax);
            URANIUM_ORE_TOP             = builder.defineInRange("overworld.uranium_top"             , 32, worldMin, worldMax);
            URANIUM_ORE_BOTTOM          = builder.defineInRange("overworld.uranium_bottom"          , 1 , worldMin, worldMax);

            LEAD_ORE_SIZE               = builder.defineInRange("overworld.lead_size"               , 12, sizeMin, sizeMax);
            LEAD_ORE_COUNT              = builder.defineInRange("overworld.lead_count"              , 12, countMin, countMax);
            LEAD_ORE_TOP                = builder.defineInRange("overworld.lead_top"                , 63, worldMin, worldMax);
            LEAD_ORE_BOTTOM             = builder.defineInRange("overworld.lead_bottom"             , 1 , worldMin, worldMax);

            SILVER_ORE_SIZE             = builder.defineInRange("overworld.silver_size"             , 4 , sizeMin, sizeMax);
            SILVER_ORE_COUNT            = builder.defineInRange("overworld.silver_count"            , 12, countMin, countMax);
            SILVER_ORE_TOP              = builder.defineInRange("overworld.silver_top"              , 26, worldMin, worldMax);
            SILVER_ORE_BOTTOM           = builder.defineInRange("overworld.silver_bottom"           , 1 , worldMin, worldMax);

            RUBY_ORE_SIZE               = builder.defineInRange("overworld.ruby_size"               , 2 , sizeMin, sizeMax);
            RUBY_ORE_COUNT              = builder.defineInRange("overworld.ruby_count"              , 12, countMin, countMax);
            RUBY_ORE_TOP                = builder.defineInRange("overworld.ruby_top"                , 26, worldMin, worldMax);
            RUBY_ORE_BOTTOM             = builder.defineInRange("overworld.ruby_bottom"             , 1 , worldMin, worldMax);

            SAPPHIRE_ORE_SIZE           = builder.defineInRange("overworld.sapphire_size"           , 2 , sizeMin, sizeMax);
            SAPPHIRE_ORE_COUNT          = builder.defineInRange("overworld.sapphire_count"          , 12, countMin, countMax);
            SAPPHIRE_ORE_TOP            = builder.defineInRange("overworld.sapphire_top"            , 26, worldMin, worldMax);
            SAPPHIRE_ORE_BOTTOM         = builder.defineInRange("overworld.sapphire_bottom"         , 1 , worldMin, worldMax);

            AMETHYST_ORE_SIZE           = builder.defineInRange("overworld.amethyst_size"           , 2 , sizeMin, sizeMax);
            AMETHYST_ORE_COUNT          = builder.defineInRange("overworld.amethyst_count"          , 12, countMin, countMax);
            AMETHYST_ORE_TOP            = builder.defineInRange("overworld.amethyst_top"            , 26, worldMin, worldMax);
            AMETHYST_ORE_BOTTOM         = builder.defineInRange("overworld.amethyst_bottom"         , 1 , worldMin, worldMax);

            ZINC_ORE_SIZE               = builder.defineInRange("overworld.zinc_size"               , 8 , sizeMin, sizeMax);
            ZINC_ORE_COUNT              = builder.defineInRange("overworld.zinc_count"              , 12, countMin, countMax);
            ZINC_ORE_TOP                = builder.defineInRange("overworld.zinc_top"                , 63, worldMin, worldMax);
            ZINC_ORE_BOTTOM             = builder.defineInRange("overworld.zinc_bottom"             , 1 , worldMin, worldMax);

            DENSE_COPPER_ORE_COUNT      = builder.defineInRange("overworld.dense.copper_count"      , 1260, countMin, countMax);
            DENSE_COPPER_ORE_TOP        = builder.defineInRange("overworld.dense.copper_top"        , 63  , worldMin, worldMax);
            DENSE_COPPER_ORE_BOTTOM     = builder.defineInRange("overworld.dense.copper_bottom"     , 1   , worldMin, worldMax);

            DENSE_TIN_ORE_COUNT         = builder.defineInRange("overworld.dense.tin_count"         , 1260, countMin, countMax);
            DENSE_TIN_ORE_TOP           = builder.defineInRange("overworld.dense.tin_top"           , 63  , worldMin, worldMax);
            DENSE_TIN_ORE_BOTTOM        = builder.defineInRange("overworld.dense.tin_bottom"        , 1   , worldMin, worldMax);

            DENSE_EMERALD_ORE_COUNT     = builder.defineInRange("overworld.dense.emerald_count"     , 640, countMin, countMax);
            DENSE_EMERALD_ORE_TOP       = builder.defineInRange("overworld.dense.emerald_top"       , 32 , worldMin, worldMax);
            DENSE_EMERALD_ORE_BOTTOM    = builder.defineInRange("overworld.dense.emerald_bottom"    , 1  , worldMin, worldMax);

            DENSE_COAL_ORE_COUNT        = builder.defineInRange("overworld.dense.coal_count"        , 2600, countMin, countMax);
            DENSE_COAL_ORE_TOP          = builder.defineInRange("overworld.dense.coal_top"          , 130 , worldMin, worldMax);
            DENSE_COAL_ORE_BOTTOM       = builder.defineInRange("overworld.dense.coal_bottom"       , 1   , worldMin, worldMax);

            DENSE_GOLD_ORE_COUNT        = builder.defineInRange("overworld.dense.gold_count"        , 640, countMin, countMax);
            DENSE_GOLD_ORE_TOP          = builder.defineInRange("overworld.dense.gold_top"          , 32 , worldMin, worldMax);
            DENSE_GOLD_ORE_BOTTOM       = builder.defineInRange("overworld.dense.gold_bottom"       , 1  , worldMin, worldMax);

            DENSE_IRON_ORE_COUNT        = builder.defineInRange("overworld.dense.iron_count"        , 1260, countMin, countMax);
            DENSE_IRON_ORE_TOP          = builder.defineInRange("overworld.dense.iron_top"          , 63  , worldMin, worldMax);
            DENSE_IRON_ORE_BOTTOM       = builder.defineInRange("overworld.dense.iron_bottom"       , 1   , worldMin, worldMax);

            DENSE_LAPIS_ORE_COUNT       = builder.defineInRange("overworld.dense.lapis_count"       , 640, countMin, countMax);
            DENSE_LAPIS_ORE_TOP         = builder.defineInRange("overworld.dense.lapis_top"         , 32 , worldMin, worldMax);
            DENSE_LAPIS_ORE_BOTTOM      = builder.defineInRange("overworld.dense.lapis_bottom"      , 1  , worldMin, worldMax);

            DENSE_REDSTONE_ORE_COUNT    = builder.defineInRange("overworld.dense.redstone_count"    , 320, countMin, countMax);
            DENSE_REDSTONE_ORE_TOP      = builder.defineInRange("overworld.dense.redstone_top"      , 16 , worldMin, worldMax);
            DENSE_REDSTONE_ORE_BOTTOM   = builder.defineInRange("overworld.dense.redstone_bottom"   , 1  , worldMin, worldMax);

            DENSE_DIAMOND_ORE_COUNT     = builder.defineInRange("overworld.dense.diamond_count"     , 320, countMin, countMax);
            DENSE_DIAMOND_ORE_TOP       = builder.defineInRange("overworld.dense.diamond_top"       , 16 , worldMin, worldMax);
            DENSE_DIAMOND_ORE_BOTTOM    = builder.defineInRange("overworld.dense.diamond_bottom"    , 1  , worldMin, worldMax);

            COAL_BASALT_ORE_SIZE        = builder.defineInRange("nether.basalt.coal_size"           , 12  , sizeMin, sizeMax);
            COAL_BASALT_ORE_COUNT       = builder.defineInRange("nether.basalt.coal_count"          , 17 , countMin, countMax);
            COAL_BASALT_ORE_TOP         = builder.defineInRange("nether.basalt.coal_top"            , 127, worldMin, worldMax);
            COAL_BASALT_ORE_BOTTOM      = builder.defineInRange("nether.basalt.coal_bottom"         , 1  , worldMin, worldMax);

            DIAMOND_BASALT_ORE_SIZE     = builder.defineInRange("nether.basalt.diamond_size"        , 4  , sizeMin, sizeMax);
            DIAMOND_BASALT_ORE_COUNT    = builder.defineInRange("nether.basalt.diamond_count"       , 5 , countMin, countMax);
            DIAMOND_BASALT_ORE_TOP      = builder.defineInRange("nether.basalt.diamond_top"         , 127, worldMin, worldMax);
            DIAMOND_BASALT_ORE_BOTTOM   = builder.defineInRange("nether.basalt.diamond_bottom"      , 1  , worldMin, worldMax);

            EMERALD_BASALT_ORE_COUNT    = builder.defineInRange("nether.basalt.emerald_count"       , 2  , countMin, countMax);
            EMERALD_BASALT_ORE_TOP      = builder.defineInRange("nether.basalt.emerald_top"         , 127, worldMin, worldMax);
            EMERALD_BASALT_ORE_BOTTOM   = builder.defineInRange("nether.basalt.emerald_bottom"      , 1  , worldMin, worldMax);

            GOLD_BASALT_ORE_SIZE        = builder.defineInRange("nether.basalt.gold_size"           , 4  , sizeMin, sizeMax);
            GOLD_BASALT_ORE_COUNT       = builder.defineInRange("nether.basalt.gold_count"          , 8 , countMin, countMax);
            GOLD_BASALT_ORE_TOP         = builder.defineInRange("nether.basalt.gold_top"            , 127, worldMin, worldMax);
            GOLD_BASALT_ORE_BOTTOM      = builder.defineInRange("nether.basalt.gold_bottom"         , 1  , worldMin, worldMax);

            IRON_BASALT_ORE_SIZE        = builder.defineInRange("nether.basalt.iron_size"           , 6  , sizeMin, sizeMax);
            IRON_BASALT_ORE_COUNT       = builder.defineInRange("nether.basalt.iron_count"          , 10 , countMin, countMax);
            IRON_BASALT_ORE_TOP         = builder.defineInRange("nether.basalt.iron_top"            , 127, worldMin, worldMax);
            IRON_BASALT_ORE_BOTTOM      = builder.defineInRange("nether.basalt.iron_bottom"         , 1  , worldMin, worldMax);

            LAPIS_BASALT_ORE_SIZE       = builder.defineInRange("nether.basalt.lapis_size"          , 6  , sizeMin, sizeMax);
            LAPIS_BASALT_ORE_COUNT      = builder.defineInRange("nether.basalt.lapis_count"         , 5 , countMin, countMax);
            LAPIS_BASALT_ORE_TOP        = builder.defineInRange("nether.basalt.lapis_top"           , 127, worldMin, worldMax);
            LAPIS_BASALT_ORE_BOTTOM     = builder.defineInRange("nether.basalt.lapis_bottom"        , 1  , worldMin, worldMax);

            REDSTONE_BASALT_ORE_SIZE    = builder.defineInRange("nether.basalt.redstone_size"       , 8  , sizeMin, sizeMax);
            REDSTONE_BASALT_ORE_COUNT   = builder.defineInRange("nether.basalt.redstone_count"      , 8 , countMin, countMax);
            REDSTONE_BASALT_ORE_TOP     = builder.defineInRange("nether.basalt.redstone_top"        , 127, worldMin, worldMax);
            REDSTONE_BASALT_ORE_BOTTOM  = builder.defineInRange("nether.basalt.redstone_bottom"     , 1  , worldMin, worldMax);

            builder.pop();
        }
    }
}
