package fr.alasdiablo.janoeo.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
import org.apache.commons.lang3.tuple.Pair;

public class FrequencyConfig {

    // TODO: Add all generation here (no more hard coded)

    public static final ForgeConfigSpec CONFIG_SPEC;
    public static final Config CONFIG;

    static {
        Pair<Config, ForgeConfigSpec> configPair = new ForgeConfigSpec.Builder().configure(Config::new);
        CONFIG_SPEC = configPair.getRight();
        CONFIG = configPair.getLeft();
    }

    public static class Config {

        public final IntValue COPPER_ORE_SIZE, COPPER_ORE_COUNT, COPPER_ORE_BOTTOM, COPPER_ORE_TOP;

        public final IntValue TIN_ORE_SIZE, TIN_ORE_COUNT, TIN_ORE_BOTTOM, TIN_ORE_TOP;

        public final IntValue ALUMINIUM_ORE_SIZE, ALUMINIUM_ORE_COUNT, ALUMINIUM_ORE_BOTTOM, ALUMINIUM_ORE_TOP;

        public final IntValue URANIUM_ORE_SIZE, URANIUM_ORE_COUNT, URANIUM_ORE_BOTTOM, URANIUM_ORE_TOP;

        public final IntValue LEAD_ORE_SIZE, LEAD_ORE_COUNT, LEAD_ORE_BOTTOM, LEAD_ORE_TOP;

        public final IntValue SILVER_ORE_SIZE, SILVER_ORE_COUNT ,SILVER_ORE_BOTTOM, SILVER_ORE_TOP;

        public final IntValue RUBY_ORE_SIZE, RUBY_ORE_COUNT, RUBY_ORE_BOTTOM, RUBY_ORE_TOP;

        public final IntValue SAPPHIRE_ORE_SIZE, SAPPHIRE_ORE_COUNT, SAPPHIRE_ORE_BOTTOM, SAPPHIRE_ORE_TOP;

        public final IntValue AMETHYST_ORE_SIZE, AMETHYST_ORE_COUNT, AMETHYST_ORE_BOTTOM, AMETHYST_ORE_TOP;

        public final IntValue ZINC_ORE_SIZE, ZINC_ORE_COUNT, ZINC_ORE_BOTTOM, ZINC_ORE_TOP;

        public final IntValue DENSE_COPPER_ORE_COUNT, DENSE_COPPER_ORE_BOTTOM, DENSE_COPPER_ORE_TOP;

        public final IntValue DENSE_TIN_ORE_COUNT, DENSE_TIN_ORE_BOTTOM, DENSE_TIN_ORE_TOP;

        public final IntValue DENSE_EMERALD_ORE_COUNT, DENSE_EMERALD_ORE_BOTTOM, DENSE_EMERALD_ORE_TOP;

        public final IntValue DENSE_COAL_ORE_COUNT, DENSE_COAL_ORE_BOTTOM, DENSE_COAL_ORE_TOP;

        public final IntValue DENSE_GOLD_ORE_COUNT, DENSE_GOLD_ORE_BOTTOM, DENSE_GOLD_ORE_TOP;

        public final IntValue DENSE_IRON_ORE_COUNT ,DENSE_IRON_ORE_BOTTOM ,DENSE_IRON_ORE_TOP;

        public final IntValue DENSE_LAPIS_ORE_COUNT, DENSE_LAPIS_ORE_BOTTOM, DENSE_LAPIS_ORE_TOP;

        public final IntValue DENSE_REDSTONE_ORE_COUNT, DENSE_REDSTONE_ORE_BOTTOM, DENSE_REDSTONE_ORE_TOP;

        public final IntValue DENSE_DIAMOND_ORE_COUNT ,DENSE_DIAMOND_ORE_BOTTOM, DENSE_DIAMOND_ORE_TOP;

        public final IntValue COAL_BASALT_ORE_SIZE, COAL_BASALT_ORE_COUNT, COAL_BASALT_ORE_BOTTOM, COAL_BASALT_ORE_TOP;

        public final IntValue GOLD_BASALT_ORE_SIZE, GOLD_BASALT_ORE_COUNT, GOLD_BASALT_ORE_BOTTOM, GOLD_BASALT_ORE_TOP;

        public final IntValue DIAMOND_BASALT_ORE_SIZE, DIAMOND_BASALT_ORE_COUNT, DIAMOND_BASALT_ORE_BOTTOM, DIAMOND_BASALT_ORE_TOP;

        public final IntValue EMERALD_BASALT_ORE_COUNT, EMERALD_BASALT_ORE_BOTTOM, EMERALD_BASALT_ORE_TOP;

        public final IntValue IRON_BASALT_ORE_SIZE, IRON_BASALT_ORE_COUNT, IRON_BASALT_ORE_BOTTOM, IRON_BASALT_ORE_TOP;

        public final IntValue LAPIS_BASALT_ORE_SIZE, LAPIS_BASALT_ORE_COUNT, LAPIS_BASALT_ORE_BOTTOM, LAPIS_BASALT_ORE_TOP;

        public final IntValue REDSTONE_BASALT_ORE_SIZE, REDSTONE_BASALT_ORE_COUNT, REDSTONE_BASALT_ORE_BOTTOM, REDSTONE_BASALT_ORE_TOP;

        public final IntValue IRON_GRAVEL_ORE_SIZE, IRON_GRAVEL_ORE_COUNT, IRON_GRAVEL_ORE_BOTTOM, IRON_GRAVEL_ORE_TOP;

        public final IntValue GOLD_GRAVEL_ORE_SIZE, GOLD_GRAVEL_ORE_COUNT, GOLD_GRAVEL_ORE_BOTTOM, GOLD_GRAVEL_ORE_TOP;

        public final IntValue DIAMOND_GRAVEL_ORE_SIZE, DIAMOND_GRAVEL_ORE_COUNT, DIAMOND_GRAVEL_ORE_BOTTOM, DIAMOND_GRAVEL_ORE_TOP;

        public final IntValue OCEAN_IRON_GRAVEL_ORE_SIZE, OCEAN_IRON_GRAVEL_ORE_COUNT, OCEAN_IRON_GRAVEL_ORE_BOTTOM, OCEAN_IRON_GRAVEL_ORE_TOP;

        public final IntValue OCEAN_GOLD_GRAVEL_ORE_SIZE, OCEAN_GOLD_GRAVEL_ORE_COUNT, OCEAN_GOLD_GRAVEL_ORE_BOTTOM, OCEAN_GOLD_GRAVEL_ORE_TOP;

        public final IntValue OCEAN_DIAMOND_GRAVEL_ORE_SIZE, OCEAN_DIAMOND_GRAVEL_ORE_COUNT, OCEAN_DIAMOND_GRAVEL_ORE_BOTTOM, OCEAN_DIAMOND_GRAVEL_ORE_TOP;

        public final IntValue NETHER_IRON_GRAVEL_ORE_SIZE, NETHER_IRON_GRAVEL_ORE_COUNT, NETHER_IRON_GRAVEL_ORE_BOTTOM, NETHER_IRON_GRAVEL_ORE_TOP;

        public final IntValue NETHER_GOLD_GRAVEL_ORE_SIZE, NETHER_GOLD_GRAVEL_ORE_COUNT, NETHER_GOLD_GRAVEL_ORE_BOTTOM, NETHER_GOLD_GRAVEL_ORE_TOP;

        public final IntValue NETHER_DIAMOND_GRAVEL_ORE_SIZE, NETHER_DIAMOND_GRAVEL_ORE_COUNT, NETHER_DIAMOND_GRAVEL_ORE_BOTTOM, NETHER_DIAMOND_GRAVEL_ORE_TOP;

        public final IntValue COAL_NETHER_ORE_SIZE, COAL_NETHER_ORE_COUNT, COAL_NETHER_ORE_BOTTOM, COAL_NETHER_ORE_TOP;

        public final IntValue DIAMOND_NETHER_ORE_SIZE, DIAMOND_NETHER_ORE_COUNT, DIAMOND_NETHER_ORE_BOTTOM, DIAMOND_NETHER_ORE_TOP;

        public final IntValue EMERALD_NETHER_ORE_COUNT, EMERALD_NETHER_ORE_BOTTOM, EMERALD_NETHER_ORE_TOP;

        public final IntValue GOLD_NETHER_ORE_SIZE, GOLD_NETHER_ORE_COUNT, GOLD_NETHER_ORE_BOTTOM, GOLD_NETHER_ORE_TOP;

        public final IntValue IRON_NETHER_ORE_SIZE, IRON_NETHER_ORE_COUNT, IRON_NETHER_ORE_BOTTOM, IRON_NETHER_ORE_TOP;

        public final IntValue LAPIS_NETHER_ORE_SIZE, LAPIS_NETHER_ORE_COUNT, LAPIS_NETHER_ORE_BOTTOM, LAPIS_NETHER_ORE_TOP;

        public final IntValue REDSTONE_NETHER_ORE_SIZE, REDSTONE_NETHER_ORE_COUNT, REDSTONE_NETHER_ORE_BOTTOM, REDSTONE_NETHER_ORE_TOP;

        public final IntValue ALUMINIUM_NETHER_ORE_SIZE, ALUMINIUM_NETHER_ORE_COUNT, ALUMINIUM_NETHER_ORE_BOTTOM, ALUMINIUM_NETHER_ORE_TOP;

        public final IntValue LEAD_NETHER_ORE_SIZE, LEAD_NETHER_ORE_COUNT, LEAD_NETHER_ORE_BOTTOM, LEAD_NETHER_ORE_TOP;

        public final IntValue TIN_NETHER_ORE_SIZE, TIN_NETHER_ORE_COUNT, TIN_NETHER_ORE_BOTTOM, TIN_NETHER_ORE_TOP;

        public final IntValue COPPER_NETHER_ORE_SIZE, COPPER_NETHER_ORE_COUNT, COPPER_NETHER_ORE_BOTTOM, COPPER_NETHER_ORE_TOP;

        public final IntValue RUBY_NETHER_ORE_SIZE, RUBY_NETHER_ORE_COUNT, RUBY_NETHER_ORE_BOTTOM, RUBY_NETHER_ORE_TOP;

        public final IntValue SAPPHIRE_NETHER_ORE_SIZE, SAPPHIRE_NETHER_ORE_COUNT, SAPPHIRE_NETHER_ORE_BOTTOM, SAPPHIRE_NETHER_ORE_TOP;

        public final IntValue SILVER_NETHER_ORE_SIZE, SILVER_NETHER_ORE_COUNT, SILVER_NETHER_ORE_BOTTOM, SILVER_NETHER_ORE_TOP;

        public final IntValue URANIUM_NETHER_ORE_SIZE, URANIUM_NETHER_ORE_COUNT, URANIUM_NETHER_ORE_BOTTOM, URANIUM_NETHER_ORE_TOP;


        public Config(ForgeConfigSpec.Builder builder) {
            builder.comment("Ore frequency and height config for janoeo").push("janoeo");

            final int sizeMin = 1, sizeMax = 128, countMin = 0, countMax = 4096, worldMin = 1, worldMax = 255;

            // --------------------------------------------- overworld ---------------------------------------------

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

            // --------------------------------------------- overworld.gravel ---------------------------------------------

            IRON_GRAVEL_ORE_SIZE             = builder.defineInRange("overworld.gravel.iron_size"             , 8 , sizeMin, sizeMax);
            IRON_GRAVEL_ORE_COUNT            = builder.defineInRange("overworld.gravel.iron_count"            , 48, countMin, countMax);
            IRON_GRAVEL_ORE_TOP              = builder.defineInRange("overworld.gravel.iron_top"              , 48, worldMin, worldMax);
            IRON_GRAVEL_ORE_BOTTOM           = builder.defineInRange("overworld.gravel.iron_bottom"           , 1 , worldMin, worldMax);

            GOLD_GRAVEL_ORE_SIZE             = builder.defineInRange("overworld.gravel.gold_size"             , 6 , sizeMin, sizeMax);
            GOLD_GRAVEL_ORE_COUNT            = builder.defineInRange("overworld.gravel.gold_count"            , 40, countMin, countMax);
            GOLD_GRAVEL_ORE_TOP              = builder.defineInRange("overworld.gravel.gold_top"              , 28, worldMin, worldMax);
            GOLD_GRAVEL_ORE_BOTTOM           = builder.defineInRange("overworld.gravel.gold_bottom"           , 1 , worldMin, worldMax);

            DIAMOND_GRAVEL_ORE_SIZE             = builder.defineInRange("overworld.gravel.diamond_size"             , 4 , sizeMin, sizeMax);
            DIAMOND_GRAVEL_ORE_COUNT            = builder.defineInRange("overworld.gravel.diamond_count"            , 32, countMin, countMax);
            DIAMOND_GRAVEL_ORE_TOP              = builder.defineInRange("overworld.gravel.diamond_top"              , 18, worldMin, worldMax);
            DIAMOND_GRAVEL_ORE_BOTTOM           = builder.defineInRange("overworld.gravel.diamond_bottom"           , 1 , worldMin, worldMax);

            // --------------------------------------------- overworld.dense ---------------------------------------------

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

            // --------------------------------------------- overworld.ocean.gravel ---------------------------------------------

            OCEAN_IRON_GRAVEL_ORE_SIZE       = builder.defineInRange("overworld.ocean.gravel.iron_size"             , 8 , sizeMin, sizeMax);
            OCEAN_IRON_GRAVEL_ORE_COUNT      = builder.defineInRange("overworld.ocean.gravel.iron_count"            , 40, countMin, countMax);
            OCEAN_IRON_GRAVEL_ORE_TOP        = builder.defineInRange("overworld.ocean.gravel.iron_top"              , 64, worldMin, worldMax);
            OCEAN_IRON_GRAVEL_ORE_BOTTOM     = builder.defineInRange("overworld.ocean.gravel.iron_bottom"           , 1 , worldMin, worldMax);

            OCEAN_GOLD_GRAVEL_ORE_SIZE       = builder.defineInRange("overworld.ocean.gravel.gold_size"             , 6 , sizeMin, sizeMax);
            OCEAN_GOLD_GRAVEL_ORE_COUNT      = builder.defineInRange("overworld.ocean.gravel.gold_count"            , 32, countMin, countMax);
            OCEAN_GOLD_GRAVEL_ORE_TOP        = builder.defineInRange("overworld.ocean.gravel.gold_top"              , 48, worldMin, worldMax);
            OCEAN_GOLD_GRAVEL_ORE_BOTTOM     = builder.defineInRange("overworld.ocean.gravel.gold_bottom"           , 1 , worldMin, worldMax);

            OCEAN_DIAMOND_GRAVEL_ORE_SIZE    = builder.defineInRange("overworld.ocean.gravel.diamond_size"             , 4 , sizeMin, sizeMax);
            OCEAN_DIAMOND_GRAVEL_ORE_COUNT   = builder.defineInRange("overworld.ocean.gravel.diamond_count"            , 8, countMin, countMax);
            OCEAN_DIAMOND_GRAVEL_ORE_TOP     = builder.defineInRange("overworld.ocean.gravel.diamond_top"              , 38, worldMin, worldMax);
            OCEAN_DIAMOND_GRAVEL_ORE_BOTTOM  = builder.defineInRange("overworld.ocean.gravel.diamond_bottom"           , 1 , worldMin, worldMax);

            // --------------------------------------------- nether ---------------------------------------------

            COAL_NETHER_ORE_SIZE       = builder.defineInRange("nether.coal_size"             , 12 , sizeMin, sizeMax);
            COAL_NETHER_ORE_COUNT      = builder.defineInRange("nether.coal_count"            , 68, countMin, countMax);
            COAL_NETHER_ORE_TOP        = builder.defineInRange("nether.coal_top"              , 127, worldMin, worldMax);
            COAL_NETHER_ORE_BOTTOM     = builder.defineInRange("nether.coal_bottom"           , 1 , worldMin, worldMax);

            DIAMOND_NETHER_ORE_SIZE       = builder.defineInRange("nether.diamond_size"             , 4 , sizeMin, sizeMax);
            DIAMOND_NETHER_ORE_COUNT      = builder.defineInRange("nether.diamond_count"            , 20, countMin, countMax);
            DIAMOND_NETHER_ORE_TOP        = builder.defineInRange("nether.diamond_top"              , 127, worldMin, worldMax);
            DIAMOND_NETHER_ORE_BOTTOM     = builder.defineInRange("nether.diamond_bottom"           , 1 , worldMin, worldMax);

            EMERALD_NETHER_ORE_COUNT      = builder.defineInRange("nether.emerald_count"            , 8, countMin, countMax);
            EMERALD_NETHER_ORE_TOP        = builder.defineInRange("nether.emerald_top"              , 127, worldMin, worldMax);
            EMERALD_NETHER_ORE_BOTTOM     = builder.defineInRange("nether.emerald_bottom"           , 1 , worldMin, worldMax);

            GOLD_NETHER_ORE_SIZE       = builder.defineInRange("nether.gold_size"             , 4 , sizeMin, sizeMax);
            GOLD_NETHER_ORE_COUNT      = builder.defineInRange("nether.gold_count"            , 32, countMin, countMax);
            GOLD_NETHER_ORE_TOP        = builder.defineInRange("nether.gold_top"              , 127, worldMin, worldMax);
            GOLD_NETHER_ORE_BOTTOM     = builder.defineInRange("nether.gold_bottom"           , 1 , worldMin, worldMax);

            IRON_NETHER_ORE_SIZE       = builder.defineInRange("nether.iron_size"             , 6 , sizeMin, sizeMax);
            IRON_NETHER_ORE_COUNT      = builder.defineInRange("nether.iron_count"            , 40, countMin, countMax);
            IRON_NETHER_ORE_TOP        = builder.defineInRange("nether.iron_top"              , 127, worldMin, worldMax);
            IRON_NETHER_ORE_BOTTOM     = builder.defineInRange("nether.iron_bottom"           , 1 , worldMin, worldMax);

            LAPIS_NETHER_ORE_SIZE       = builder.defineInRange("nether.lapis_size"             , 6 , sizeMin, sizeMax);
            LAPIS_NETHER_ORE_COUNT      = builder.defineInRange("nether.lapis_count"            , 20, countMin, countMax);
            LAPIS_NETHER_ORE_TOP        = builder.defineInRange("nether.lapis_top"              , 127, worldMin, worldMax);
            LAPIS_NETHER_ORE_BOTTOM     = builder.defineInRange("nether.lapis_bottom"           , 1 , worldMin, worldMax);

            REDSTONE_NETHER_ORE_SIZE       = builder.defineInRange("nether.redstone_size"             , 8 , sizeMin, sizeMax);
            REDSTONE_NETHER_ORE_COUNT      = builder.defineInRange("nether.redstone_count"            , 32, countMin, countMax);
            REDSTONE_NETHER_ORE_TOP        = builder.defineInRange("nether.redstone_top"              , 127, worldMin, worldMax);
            REDSTONE_NETHER_ORE_BOTTOM     = builder.defineInRange("nether.redstone_bottom"           , 1 , worldMin, worldMax);

            ALUMINIUM_NETHER_ORE_SIZE       = builder.defineInRange("nether.aluminium_size"             , 6 , sizeMin, sizeMax);
            ALUMINIUM_NETHER_ORE_COUNT      = builder.defineInRange("nether.aluminium_count"            , 32, countMin, countMax);
            ALUMINIUM_NETHER_ORE_TOP        = builder.defineInRange("nether.aluminium_top"              , 127, worldMin, worldMax);
            ALUMINIUM_NETHER_ORE_BOTTOM     = builder.defineInRange("nether.aluminium_bottom"           , 1 , worldMin, worldMax);

            LEAD_NETHER_ORE_SIZE       = builder.defineInRange("nether.lead_size"             , 6 , sizeMin, sizeMax);
            LEAD_NETHER_ORE_COUNT      = builder.defineInRange("nether.lead_count"            , 40, countMin, countMax);
            LEAD_NETHER_ORE_TOP        = builder.defineInRange("nether.lead_top"              , 127, worldMin, worldMax);
            LEAD_NETHER_ORE_BOTTOM     = builder.defineInRange("nether.lead_bottom"           , 1 , worldMin, worldMax);

            TIN_NETHER_ORE_SIZE       = builder.defineInRange("nether.tin_size"             , 6 , sizeMin, sizeMax);
            TIN_NETHER_ORE_COUNT      = builder.defineInRange("nether.tin_count"            , 32, countMin, countMax);
            TIN_NETHER_ORE_TOP        = builder.defineInRange("nether.tin_top"              , 127, worldMin, worldMax);
            TIN_NETHER_ORE_BOTTOM     = builder.defineInRange("nether.tin_bottom"           , 1 , worldMin, worldMax);

            COPPER_NETHER_ORE_SIZE       = builder.defineInRange("nether.copper_size"             , 6 , sizeMin, sizeMax);
            COPPER_NETHER_ORE_COUNT      = builder.defineInRange("nether.copper_count"            , 40, countMin, countMax);
            COPPER_NETHER_ORE_TOP        = builder.defineInRange("nether.copper_top"              , 127, worldMin, worldMax);
            COPPER_NETHER_ORE_BOTTOM     = builder.defineInRange("nether.copper_bottom"           , 1 , worldMin, worldMax);

            RUBY_NETHER_ORE_SIZE       = builder.defineInRange("nether.ruby_size"             , 4 , sizeMin, sizeMax);
            RUBY_NETHER_ORE_COUNT      = builder.defineInRange("nether.ruby_count"            , 20, countMin, countMax);
            RUBY_NETHER_ORE_TOP        = builder.defineInRange("nether.ruby_top"              , 127, worldMin, worldMax);
            RUBY_NETHER_ORE_BOTTOM     = builder.defineInRange("nether.ruby_bottom"           , 1 , worldMin, worldMax);

            SAPPHIRE_NETHER_ORE_SIZE       = builder.defineInRange("nether.sapphire_size"             , 4 , sizeMin, sizeMax);
            SAPPHIRE_NETHER_ORE_COUNT      = builder.defineInRange("nether.sapphire_count"            , 20, countMin, countMax);
            SAPPHIRE_NETHER_ORE_TOP        = builder.defineInRange("nether.sapphire_top"              , 127, worldMin, worldMax);
            SAPPHIRE_NETHER_ORE_BOTTOM     = builder.defineInRange("nether.sapphire_bottom"           , 1 , worldMin, worldMax);

            SILVER_NETHER_ORE_SIZE       = builder.defineInRange("nether.silver_size"             , 4 , sizeMin, sizeMax);
            SILVER_NETHER_ORE_COUNT      = builder.defineInRange("nether.silver_count"            , 32, countMin, countMax);
            SILVER_NETHER_ORE_TOP        = builder.defineInRange("nether.silver_top"              , 127, worldMin, worldMax);
            SILVER_NETHER_ORE_BOTTOM     = builder.defineInRange("nether.silver_bottom"           , 1 , worldMin, worldMax);

            URANIUM_NETHER_ORE_SIZE       = builder.defineInRange("nether.uranium_size"             , 4 , sizeMin, sizeMax);
            URANIUM_NETHER_ORE_COUNT      = builder.defineInRange("nether.uranium_count"            , 32, countMin, countMax);
            URANIUM_NETHER_ORE_TOP        = builder.defineInRange("nether.uranium_top"              , 127, worldMin, worldMax);
            URANIUM_NETHER_ORE_BOTTOM     = builder.defineInRange("nether.uranium_bottom"           , 1 , worldMin, worldMax);

            // --------------------------------------------- nether.gravel ---------------------------------------------

            NETHER_IRON_GRAVEL_ORE_SIZE       = builder.defineInRange("nether.gravel.iron_size"             , 8 , sizeMin, sizeMax);
            NETHER_IRON_GRAVEL_ORE_COUNT      = builder.defineInRange("nether.gravel.iron_count"            , 48, countMin, countMax);
            NETHER_IRON_GRAVEL_ORE_TOP        = builder.defineInRange("nether.gravel.iron_top"              , 127, worldMin, worldMax);
            NETHER_IRON_GRAVEL_ORE_BOTTOM     = builder.defineInRange("nether.gravel.iron_bottom"           , 1 , worldMin, worldMax);

            NETHER_GOLD_GRAVEL_ORE_SIZE       = builder.defineInRange("nether.gravel.gold_size"             , 6 , sizeMin, sizeMax);
            NETHER_GOLD_GRAVEL_ORE_COUNT      = builder.defineInRange("nether.gravel.gold_count"            , 40, countMin, countMax);
            NETHER_GOLD_GRAVEL_ORE_TOP        = builder.defineInRange("nether.gravel.gold_top"              , 127, worldMin, worldMax);
            NETHER_GOLD_GRAVEL_ORE_BOTTOM     = builder.defineInRange("nether.gravel.gold_bottom"           , 1 , worldMin, worldMax);

            NETHER_DIAMOND_GRAVEL_ORE_SIZE    = builder.defineInRange("nether.gravel.diamond_size"             , 4 , sizeMin, sizeMax);
            NETHER_DIAMOND_GRAVEL_ORE_COUNT   = builder.defineInRange("nether.gravel.diamond_count"            , 32, countMin, countMax);
            NETHER_DIAMOND_GRAVEL_ORE_TOP     = builder.defineInRange("nether.gravel.diamond_top"              , 127, worldMin, worldMax);
            NETHER_DIAMOND_GRAVEL_ORE_BOTTOM  = builder.defineInRange("nether.gravel.diamond_bottom"           , 1 , worldMin, worldMax);

            // --------------------------------------------- nether.basalt ---------------------------------------------

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
