package fr.alasdiablo.janoeo.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
import org.apache.commons.lang3.tuple.Pair;

/**
 * TODO: Add documentation
 */
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

        public final IntValue DENSE_COPPER_ORE_COUNT, DENSE_COPPER_ORE_BOTTOM, DENSE_COPPER_ORE_TOP, DENSE_COPPER_ORE_MULTIPLIER_FACTOR;

        public final IntValue DENSE_TIN_ORE_COUNT, DENSE_TIN_ORE_BOTTOM, DENSE_TIN_ORE_TOP, DENSE_TIN_ORE_MULTIPLIER_FACTOR;

        public final IntValue DENSE_EMERALD_ORE_COUNT, DENSE_EMERALD_ORE_BOTTOM, DENSE_EMERALD_ORE_TOP, DENSE_EMERALD_ORE_MULTIPLIER_FACTOR;

        public final IntValue DENSE_COAL_ORE_COUNT, DENSE_COAL_ORE_BOTTOM, DENSE_COAL_ORE_TOP, DENSE_COAL_ORE_MULTIPLIER_FACTOR;

        public final IntValue DENSE_GOLD_ORE_COUNT, DENSE_GOLD_ORE_BOTTOM, DENSE_GOLD_ORE_TOP, DENSE_GOLD_ORE_MULTIPLIER_FACTOR;

        public final IntValue DENSE_IRON_ORE_COUNT ,DENSE_IRON_ORE_BOTTOM ,DENSE_IRON_ORE_TOP, DENSE_IRON_ORE_MULTIPLIER_FACTOR;

        public final IntValue DENSE_LAPIS_ORE_COUNT, DENSE_LAPIS_ORE_BOTTOM, DENSE_LAPIS_ORE_TOP, DENSE_LAPIS_ORE_MULTIPLIER_FACTOR;

        public final IntValue DENSE_REDSTONE_ORE_COUNT, DENSE_REDSTONE_ORE_BOTTOM, DENSE_REDSTONE_ORE_TOP, DENSE_REDSTONE_ORE_MULTIPLIER_FACTOR;

        public final IntValue DENSE_DIAMOND_ORE_COUNT ,DENSE_DIAMOND_ORE_BOTTOM, DENSE_DIAMOND_ORE_TOP, DENSE_DIAMOND_ORE_MULTIPLIER_FACTOR;

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

        public final IntValue COAL_THEEND_ORE_SIZE, COAL_THEEND_ORE_COUNT, COAL_THEEND_ORE_BOTTOM, COAL_THEEND_ORE_TOP;

        public final IntValue DIAMOND_THEEND_ORE_SIZE, DIAMOND_THEEND_ORE_COUNT, DIAMOND_THEEND_ORE_BOTTOM, DIAMOND_THEEND_ORE_TOP;

        public final IntValue EMERALD_THEEND_ORE_COUNT, EMERALD_THEEND_ORE_BOTTOM, EMERALD_THEEND_ORE_TOP;

        public final IntValue GOLD_THEEND_ORE_SIZE, GOLD_THEEND_ORE_COUNT, GOLD_THEEND_ORE_BOTTOM, GOLD_THEEND_ORE_TOP;

        public final IntValue IRON_THEEND_ORE_SIZE, IRON_THEEND_ORE_COUNT, IRON_THEEND_ORE_BOTTOM, IRON_THEEND_ORE_TOP;

        public final IntValue LAPIS_THEEND_ORE_SIZE, LAPIS_THEEND_ORE_COUNT, LAPIS_THEEND_ORE_BOTTOM, LAPIS_THEEND_ORE_TOP;

        public final IntValue REDSTONE_THEEND_ORE_SIZE, REDSTONE_THEEND_ORE_COUNT, REDSTONE_THEEND_ORE_BOTTOM, REDSTONE_THEEND_ORE_TOP;

        public final IntValue DENSE_COAL_NETHER_ORE_COUNT, DENSE_COAL_NETHER_ORE_BOTTOM, DENSE_COAL_NETHER_ORE_TOP, DENSE_COAL_NETHER_ORE_MULTIPLIER_FACTOR;

        public final IntValue DENSE_GOLD_NETHER_ORE_COUNT, DENSE_GOLD_NETHER_ORE_BOTTOM, DENSE_GOLD_NETHER_ORE_TOP, DENSE_GOLD_NETHER_ORE_MULTIPLIER_FACTOR;

        public final IntValue DENSE_IRON_NETHER_ORE_COUNT ,DENSE_IRON_NETHER_ORE_BOTTOM ,DENSE_IRON_NETHER_ORE_TOP, DENSE_IRON_NETHER_ORE_MULTIPLIER_FACTOR;

        public final IntValue DENSE_LAPIS_NETHER_ORE_COUNT, DENSE_LAPIS_NETHER_ORE_BOTTOM, DENSE_LAPIS_NETHER_ORE_TOP, DENSE_LAPIS_NETHER_ORE_MULTIPLIER_FACTOR;

        public final IntValue DENSE_REDSTONE_NETHER_ORE_COUNT, DENSE_REDSTONE_NETHER_ORE_BOTTOM, DENSE_REDSTONE_NETHER_ORE_TOP, DENSE_REDSTONE_NETHER_ORE_MULTIPLIER_FACTOR;

        public final IntValue DENSE_DIAMOND_NETHER_ORE_COUNT ,DENSE_DIAMOND_NETHER_ORE_BOTTOM, DENSE_DIAMOND_NETHER_ORE_TOP, DENSE_DIAMOND_NETHER_ORE_MULTIPLIER_FACTOR;

        public final IntValue DENSE_EMERALD_NETHER_ORE_COUNT ,DENSE_EMERALD_NETHER_ORE_BOTTOM, DENSE_EMERALD_NETHER_ORE_TOP, DENSE_EMERALD_NETHER_ORE_MULTIPLIER_FACTOR;

        public final IntValue DENSE_QUARTZ_NETHER_ORE_COUNT ,DENSE_QUARTZ_NETHER_ORE_BOTTOM, DENSE_QUARTZ_NETHER_ORE_TOP, DENSE_QUARTZ_NETHER_ORE_MULTIPLIER_FACTOR;

        public Config(ForgeConfigSpec.Builder builder) {
            builder.comment("Ore frequency and height config for janoeo").push("janoeo");

            final int sizeMin = 1, sizeMax = 128, countMin = 0, countMax = 128, worldMin = 1, worldMax = 255, factorMin = 1, factorMax = 32;

            // --------------------------------------------- overworld ---------------------------------------------

            COPPER_ORE_SIZE             = builder.defineInRange("overworld.copper.size"             , 8 , sizeMin, sizeMax);
            COPPER_ORE_COUNT            = builder.defineInRange("overworld.copper.count"            , 12, countMin, countMax);
            COPPER_ORE_TOP              = builder.defineInRange("overworld.copper.top"              , 63, worldMin, worldMax);
            COPPER_ORE_BOTTOM           = builder.defineInRange("overworld.copper.bottom"           , 1 , worldMin, worldMax);

            TIN_ORE_SIZE                = builder.defineInRange("overworld.tin.size"                , 8 , sizeMin, sizeMax);
            TIN_ORE_COUNT               = builder.defineInRange("overworld.tin.count"               , 12, countMin, countMax);
            TIN_ORE_TOP                 = builder.defineInRange("overworld.tin.top"                 , 63, worldMin, worldMax);
            TIN_ORE_BOTTOM              = builder.defineInRange("overworld.tin.bottom"              , 1 , worldMin, worldMax);

            ALUMINIUM_ORE_SIZE          = builder.defineInRange("overworld.aluminium.size"          , 12, sizeMin, sizeMax);
            ALUMINIUM_ORE_COUNT         = builder.defineInRange("overworld.aluminium.count"         , 12, countMin, countMax);
            ALUMINIUM_ORE_TOP           = builder.defineInRange("overworld.aluminium.top"           , 63, worldMin, worldMax);
            ALUMINIUM_ORE_BOTTOM        = builder.defineInRange("overworld.aluminium.bottom"        , 1 , worldMin, worldMax);

            URANIUM_ORE_SIZE            = builder.defineInRange("overworld.uranium.size"            , 4 , sizeMin, sizeMax);
            URANIUM_ORE_COUNT           = builder.defineInRange("overworld.uranium.count"           , 12, countMin, countMax);
            URANIUM_ORE_TOP             = builder.defineInRange("overworld.uranium.top"             , 32, worldMin, worldMax);
            URANIUM_ORE_BOTTOM          = builder.defineInRange("overworld.uranium.bottom"          , 1 , worldMin, worldMax);

            LEAD_ORE_SIZE               = builder.defineInRange("overworld.lead.size"               , 12, sizeMin, sizeMax);
            LEAD_ORE_COUNT              = builder.defineInRange("overworld.lead.count"              , 12, countMin, countMax);
            LEAD_ORE_TOP                = builder.defineInRange("overworld.lead.top"                , 63, worldMin, worldMax);
            LEAD_ORE_BOTTOM             = builder.defineInRange("overworld.lead.bottom"             , 1 , worldMin, worldMax);

            SILVER_ORE_SIZE             = builder.defineInRange("overworld.silver.size"             , 4 , sizeMin, sizeMax);
            SILVER_ORE_COUNT            = builder.defineInRange("overworld.silver.count"            , 12, countMin, countMax);
            SILVER_ORE_TOP              = builder.defineInRange("overworld.silver.top"              , 26, worldMin, worldMax);
            SILVER_ORE_BOTTOM           = builder.defineInRange("overworld.silver.bottom"           , 1 , worldMin, worldMax);

            RUBY_ORE_SIZE               = builder.defineInRange("overworld.ruby.size"               , 2 , sizeMin, sizeMax);
            RUBY_ORE_COUNT              = builder.defineInRange("overworld.ruby.count"              , 12, countMin, countMax);
            RUBY_ORE_TOP                = builder.defineInRange("overworld.ruby.top"                , 26, worldMin, worldMax);
            RUBY_ORE_BOTTOM             = builder.defineInRange("overworld.ruby.bottom"             , 1 , worldMin, worldMax);

            SAPPHIRE_ORE_SIZE           = builder.defineInRange("overworld.sapphire.size"           , 2 , sizeMin, sizeMax);
            SAPPHIRE_ORE_COUNT          = builder.defineInRange("overworld.sapphire.count"          , 12, countMin, countMax);
            SAPPHIRE_ORE_TOP            = builder.defineInRange("overworld.sapphire.top"            , 26, worldMin, worldMax);
            SAPPHIRE_ORE_BOTTOM         = builder.defineInRange("overworld.sapphire.bottom"         , 1 , worldMin, worldMax);

            AMETHYST_ORE_SIZE           = builder.defineInRange("overworld.amethyst.size"           , 2 , sizeMin, sizeMax);
            AMETHYST_ORE_COUNT          = builder.defineInRange("overworld.amethyst.count"          , 12, countMin, countMax);
            AMETHYST_ORE_TOP            = builder.defineInRange("overworld.amethyst.top"            , 26, worldMin, worldMax);
            AMETHYST_ORE_BOTTOM         = builder.defineInRange("overworld.amethyst.bottom"         , 1 , worldMin, worldMax);

            ZINC_ORE_SIZE               = builder.defineInRange("overworld.zinc.size"               , 8 , sizeMin, sizeMax);
            ZINC_ORE_COUNT              = builder.defineInRange("overworld.zinc.count"              , 12, countMin, countMax);
            ZINC_ORE_TOP                = builder.defineInRange("overworld.zinc.top"                , 63, worldMin, worldMax);
            ZINC_ORE_BOTTOM             = builder.defineInRange("overworld.zinc.bottom"             , 1 , worldMin, worldMax);

            // --------------------------------------------- overworld.gravel ---------------------------------------------

            IRON_GRAVEL_ORE_SIZE      = builder.defineInRange("overworld.gravel.iron.size"             , 8 , sizeMin, sizeMax);
            IRON_GRAVEL_ORE_COUNT     = builder.defineInRange("overworld.gravel.iron.count"            , 48, countMin, countMax);
            IRON_GRAVEL_ORE_TOP       = builder.defineInRange("overworld.gravel.iron.top"              , 48, worldMin, worldMax);
            IRON_GRAVEL_ORE_BOTTOM    = builder.defineInRange("overworld.gravel.iron.bottom"           , 1 , worldMin, worldMax);

            GOLD_GRAVEL_ORE_SIZE      = builder.defineInRange("overworld.gravel.gold.size"             , 6 , sizeMin, sizeMax);
            GOLD_GRAVEL_ORE_COUNT     = builder.defineInRange("overworld.gravel.gold.count"            , 40, countMin, countMax);
            GOLD_GRAVEL_ORE_TOP       = builder.defineInRange("overworld.gravel.gold.top"              , 28, worldMin, worldMax);
            GOLD_GRAVEL_ORE_BOTTOM    = builder.defineInRange("overworld.gravel.gold.bottom"           , 1 , worldMin, worldMax);

            DIAMOND_GRAVEL_ORE_SIZE   = builder.defineInRange("overworld.gravel.diamond.size"          , 4 , sizeMin, sizeMax);
            DIAMOND_GRAVEL_ORE_COUNT  = builder.defineInRange("overworld.gravel.diamond.count"         , 32, countMin, countMax);
            DIAMOND_GRAVEL_ORE_TOP    = builder.defineInRange("overworld.gravel.diamond.top"           , 18, worldMin, worldMax);
            DIAMOND_GRAVEL_ORE_BOTTOM = builder.defineInRange("overworld.gravel.diamond.bottom"        , 1 , worldMin, worldMax);

            // --------------------------------------------- overworld.dense ---------------------------------------------

            DENSE_COPPER_ORE_COUNT               = builder.defineInRange("overworld.dense.copper.count"      , 128, countMin, countMax);
            DENSE_COPPER_ORE_TOP                 = builder.defineInRange("overworld.dense.copper.top"        , 63 , worldMin, worldMax);
            DENSE_COPPER_ORE_BOTTOM              = builder.defineInRange("overworld.dense.copper.bottom"     , 1  , worldMin, worldMax);
            DENSE_COPPER_ORE_MULTIPLIER_FACTOR   = builder.defineInRange("overworld.dense.copper.factor"     , 10 , factorMin, factorMax);

            DENSE_TIN_ORE_COUNT                  = builder.defineInRange("overworld.dense.tin.count"         , 128, countMin, countMax);
            DENSE_TIN_ORE_TOP                    = builder.defineInRange("overworld.dense.tin.top"           , 63 , worldMin, worldMax);
            DENSE_TIN_ORE_BOTTOM                 = builder.defineInRange("overworld.dense.tin.bottom"        , 1  , worldMin, worldMax);
            DENSE_TIN_ORE_MULTIPLIER_FACTOR      = builder.defineInRange("overworld.dense.tin.factor"        , 10 , factorMin, factorMax);

            DENSE_EMERALD_ORE_COUNT              = builder.defineInRange("overworld.dense.emerald.count"     , 128, countMin, countMax);
            DENSE_EMERALD_ORE_TOP                = builder.defineInRange("overworld.dense.emerald.top"       , 32 , worldMin, worldMax);
            DENSE_EMERALD_ORE_BOTTOM             = builder.defineInRange("overworld.dense.emerald.bottom"    , 1  , worldMin, worldMax);
            DENSE_EMERALD_ORE_MULTIPLIER_FACTOR  = builder.defineInRange("overworld.dense.emerald.factor"    , 6  , factorMin, factorMax);

            DENSE_COAL_ORE_COUNT                 = builder.defineInRange("overworld.dense.coal.count"        , 128, countMin, countMax);
            DENSE_COAL_ORE_TOP                   = builder.defineInRange("overworld.dense.coal.top"          , 130, worldMin, worldMax);
            DENSE_COAL_ORE_BOTTOM                = builder.defineInRange("overworld.dense.coal.bottom"       , 1  , worldMin, worldMax);
            DENSE_COAL_ORE_MULTIPLIER_FACTOR     = builder.defineInRange("overworld.dense.coal.factor"       , 18 , factorMin, factorMax);

            DENSE_GOLD_ORE_COUNT                 = builder.defineInRange("overworld.dense.gold.count"        , 128, countMin, countMax);
            DENSE_GOLD_ORE_TOP                   = builder.defineInRange("overworld.dense.gold.top"          , 32 , worldMin, worldMax);
            DENSE_GOLD_ORE_BOTTOM                = builder.defineInRange("overworld.dense.gold.bottom"       , 1  , worldMin, worldMax);
            DENSE_GOLD_ORE_MULTIPLIER_FACTOR     = builder.defineInRange("overworld.dense.gold.factor"       , 6  , factorMin, factorMax);

            DENSE_IRON_ORE_COUNT                 = builder.defineInRange("overworld.dense.iron.count"        , 128, countMin, countMax);
            DENSE_IRON_ORE_TOP                   = builder.defineInRange("overworld.dense.iron.top"          , 63 , worldMin, worldMax);
            DENSE_IRON_ORE_BOTTOM                = builder.defineInRange("overworld.dense.iron.bottom"       , 1  , worldMin, worldMax);
            DENSE_IRON_ORE_MULTIPLIER_FACTOR     = builder.defineInRange("overworld.dense.iron.factor"       , 10 , factorMin, factorMax);

            DENSE_LAPIS_ORE_COUNT                = builder.defineInRange("overworld.dense.lapis.count"       , 128, countMin, countMax);
            DENSE_LAPIS_ORE_TOP                  = builder.defineInRange("overworld.dense.lapis.top"         , 32 , worldMin, worldMax);
            DENSE_LAPIS_ORE_BOTTOM               = builder.defineInRange("overworld.dense.lapis.bottom"      , 1  , worldMin, worldMax);
            DENSE_LAPIS_ORE_MULTIPLIER_FACTOR    = builder.defineInRange("overworld.dense.lapis.factor"      , 6  , factorMin, factorMax);

            DENSE_REDSTONE_ORE_COUNT             = builder.defineInRange("overworld.dense.redstone.count"    , 128, countMin, countMax);
            DENSE_REDSTONE_ORE_TOP               = builder.defineInRange("overworld.dense.redstone.top"      , 16 , worldMin, worldMax);
            DENSE_REDSTONE_ORE_BOTTOM            = builder.defineInRange("overworld.dense.redstone.bottom"   , 1  , worldMin, worldMax);
            DENSE_REDSTONE_ORE_MULTIPLIER_FACTOR = builder.defineInRange("overworld.dense.redstone.factor"   , 3  , factorMin, factorMax);

            DENSE_DIAMOND_ORE_COUNT              = builder.defineInRange("overworld.dense.diamond.count"     , 128, countMin, countMax);
            DENSE_DIAMOND_ORE_TOP                = builder.defineInRange("overworld.dense.diamond.top"       , 16 , worldMin, worldMax);
            DENSE_DIAMOND_ORE_BOTTOM             = builder.defineInRange("overworld.dense.diamond.bottom"    , 1  , worldMin, worldMax);
            DENSE_DIAMOND_ORE_MULTIPLIER_FACTOR  = builder.defineInRange("overworld.dense.diamond.factor"    , 3  , factorMin, factorMax);

            // --------------------------------------------- overworld.ocean.gravel ---------------------------------------------

            OCEAN_IRON_GRAVEL_ORE_SIZE       = builder.defineInRange("overworld.ocean.gravel.iron.size"             , 8 , sizeMin, sizeMax);
            OCEAN_IRON_GRAVEL_ORE_COUNT      = builder.defineInRange("overworld.ocean.gravel.iron.count"            , 40, countMin, countMax);
            OCEAN_IRON_GRAVEL_ORE_TOP        = builder.defineInRange("overworld.ocean.gravel.iron.top"              , 64, worldMin, worldMax);
            OCEAN_IRON_GRAVEL_ORE_BOTTOM     = builder.defineInRange("overworld.ocean.gravel.iron.bottom"           , 1 , worldMin, worldMax);

            OCEAN_GOLD_GRAVEL_ORE_SIZE       = builder.defineInRange("overworld.ocean.gravel.gold.size"             , 6 , sizeMin, sizeMax);
            OCEAN_GOLD_GRAVEL_ORE_COUNT      = builder.defineInRange("overworld.ocean.gravel.gold.count"            , 32, countMin, countMax);
            OCEAN_GOLD_GRAVEL_ORE_TOP        = builder.defineInRange("overworld.ocean.gravel.gold.top"              , 48, worldMin, worldMax);
            OCEAN_GOLD_GRAVEL_ORE_BOTTOM     = builder.defineInRange("overworld.ocean.gravel.gold.bottom"           , 1 , worldMin, worldMax);

            OCEAN_DIAMOND_GRAVEL_ORE_SIZE    = builder.defineInRange("overworld.ocean.gravel.diamond.size"          , 4 , sizeMin, sizeMax);
            OCEAN_DIAMOND_GRAVEL_ORE_COUNT   = builder.defineInRange("overworld.ocean.gravel.diamond.count"         , 8 , countMin, countMax);
            OCEAN_DIAMOND_GRAVEL_ORE_TOP     = builder.defineInRange("overworld.ocean.gravel.diamond.top"           , 38, worldMin, worldMax);
            OCEAN_DIAMOND_GRAVEL_ORE_BOTTOM  = builder.defineInRange("overworld.ocean.gravel.diamond.bottom"        , 1 , worldMin, worldMax);

            // --------------------------------------------- nether ---------------------------------------------

            COAL_NETHER_ORE_SIZE        = builder.defineInRange("nether.coal.size"         , 12 , sizeMin, sizeMax);
            COAL_NETHER_ORE_COUNT       = builder.defineInRange("nether.coal.count"        , 68 , countMin, countMax);
            COAL_NETHER_ORE_TOP         = builder.defineInRange("nether.coal.top"          , 127, worldMin, worldMax);
            COAL_NETHER_ORE_BOTTOM      = builder.defineInRange("nether.coal.bottom"       , 1  , worldMin, worldMax);

            DIAMOND_NETHER_ORE_SIZE     = builder.defineInRange("nether.diamond.size"      , 4  , sizeMin, sizeMax);
            DIAMOND_NETHER_ORE_COUNT    = builder.defineInRange("nether.diamond.count"     , 20 , countMin, countMax);
            DIAMOND_NETHER_ORE_TOP      = builder.defineInRange("nether.diamond.top"       , 127, worldMin, worldMax);
            DIAMOND_NETHER_ORE_BOTTOM   = builder.defineInRange("nether.diamond.bottom"    , 1  , worldMin, worldMax);

            EMERALD_NETHER_ORE_COUNT    = builder.defineInRange("nether.emerald.count"     , 8  , countMin, countMax);
            EMERALD_NETHER_ORE_TOP      = builder.defineInRange("nether.emerald.top"       , 127, worldMin, worldMax);
            EMERALD_NETHER_ORE_BOTTOM   = builder.defineInRange("nether.emerald.bottom"    , 1  , worldMin, worldMax);

            GOLD_NETHER_ORE_SIZE        = builder.defineInRange("nether.gold.size"         , 4  , sizeMin, sizeMax);
            GOLD_NETHER_ORE_COUNT       = builder.defineInRange("nether.gold.count"        , 32 , countMin, countMax);
            GOLD_NETHER_ORE_TOP         = builder.defineInRange("nether.gold.top"          , 127, worldMin, worldMax);
            GOLD_NETHER_ORE_BOTTOM      = builder.defineInRange("nether.gold.bottom"       , 1  , worldMin, worldMax);

            IRON_NETHER_ORE_SIZE        = builder.defineInRange("nether.iron.size"         , 6  , sizeMin, sizeMax);
            IRON_NETHER_ORE_COUNT       = builder.defineInRange("nether.iron.count"        , 40 , countMin, countMax);
            IRON_NETHER_ORE_TOP         = builder.defineInRange("nether.iron.top"          , 127, worldMin, worldMax);
            IRON_NETHER_ORE_BOTTOM      = builder.defineInRange("nether.iron.bottom"       , 1  , worldMin, worldMax);

            LAPIS_NETHER_ORE_SIZE       = builder.defineInRange("nether.lapis.size"        , 6  , sizeMin, sizeMax);
            LAPIS_NETHER_ORE_COUNT      = builder.defineInRange("nether.lapis.count"       , 20 , countMin, countMax);
            LAPIS_NETHER_ORE_TOP        = builder.defineInRange("nether.lapis.top"         , 127, worldMin, worldMax);
            LAPIS_NETHER_ORE_BOTTOM     = builder.defineInRange("nether.lapis.bottom"      , 1  , worldMin, worldMax);

            REDSTONE_NETHER_ORE_SIZE    = builder.defineInRange("nether.redstone.size"     , 8  , sizeMin, sizeMax);
            REDSTONE_NETHER_ORE_COUNT   = builder.defineInRange("nether.redstone.count"    , 32 , countMin, countMax);
            REDSTONE_NETHER_ORE_TOP     = builder.defineInRange("nether.redstone.top"      , 127, worldMin, worldMax);
            REDSTONE_NETHER_ORE_BOTTOM  = builder.defineInRange("nether.redstone.bottom"   , 1  , worldMin, worldMax);

            ALUMINIUM_NETHER_ORE_SIZE   = builder.defineInRange("nether.aluminium.size"    , 6  , sizeMin, sizeMax);
            ALUMINIUM_NETHER_ORE_COUNT  = builder.defineInRange("nether.aluminium.count"   , 32 , countMin, countMax);
            ALUMINIUM_NETHER_ORE_TOP    = builder.defineInRange("nether.aluminium.top"     , 127, worldMin, worldMax);
            ALUMINIUM_NETHER_ORE_BOTTOM = builder.defineInRange("nether.aluminium.bottom"  , 1  , worldMin, worldMax);

            LEAD_NETHER_ORE_SIZE        = builder.defineInRange("nether.lead.size"         , 6  , sizeMin, sizeMax);
            LEAD_NETHER_ORE_COUNT       = builder.defineInRange("nether.lead.count"        , 40 , countMin, countMax);
            LEAD_NETHER_ORE_TOP         = builder.defineInRange("nether.lead.top"          , 127, worldMin, worldMax);
            LEAD_NETHER_ORE_BOTTOM      = builder.defineInRange("nether.lead.bottom"       , 1  , worldMin, worldMax);

            TIN_NETHER_ORE_SIZE         = builder.defineInRange("nether.tin.size"          , 6  , sizeMin, sizeMax);
            TIN_NETHER_ORE_COUNT        = builder.defineInRange("nether.tin.count"         , 32 , countMin, countMax);
            TIN_NETHER_ORE_TOP          = builder.defineInRange("nether.tin.top"           , 127, worldMin, worldMax);
            TIN_NETHER_ORE_BOTTOM       = builder.defineInRange("nether.tin.bottom"        , 1  , worldMin, worldMax);

            COPPER_NETHER_ORE_SIZE      = builder.defineInRange("nether.copper.size"       , 6  , sizeMin, sizeMax);
            COPPER_NETHER_ORE_COUNT     = builder.defineInRange("nether.copper.count"      , 40 , countMin, countMax);
            COPPER_NETHER_ORE_TOP       = builder.defineInRange("nether.copper.top"        , 127, worldMin, worldMax);
            COPPER_NETHER_ORE_BOTTOM    = builder.defineInRange("nether.copper.bottom"     , 1  , worldMin, worldMax);

            RUBY_NETHER_ORE_SIZE        = builder.defineInRange("nether.ruby.size"         , 4  , sizeMin, sizeMax);
            RUBY_NETHER_ORE_COUNT       = builder.defineInRange("nether.ruby.count"        , 20 , countMin, countMax);
            RUBY_NETHER_ORE_TOP         = builder.defineInRange("nether.ruby.top"          , 127, worldMin, worldMax);
            RUBY_NETHER_ORE_BOTTOM      = builder.defineInRange("nether.ruby.bottom"       , 1  , worldMin, worldMax);

            SAPPHIRE_NETHER_ORE_SIZE    = builder.defineInRange("nether.sapphire.size"     , 4  , sizeMin, sizeMax);
            SAPPHIRE_NETHER_ORE_COUNT   = builder.defineInRange("nether.sapphire.count"    , 20 , countMin, countMax);
            SAPPHIRE_NETHER_ORE_TOP     = builder.defineInRange("nether.sapphire.top"      , 127, worldMin, worldMax);
            SAPPHIRE_NETHER_ORE_BOTTOM  = builder.defineInRange("nether.sapphire.bottom"   , 1  , worldMin, worldMax);

            SILVER_NETHER_ORE_SIZE      = builder.defineInRange("nether.silver.size"       , 4  , sizeMin, sizeMax);
            SILVER_NETHER_ORE_COUNT     = builder.defineInRange("nether.silver.count"      , 32 , countMin, countMax);
            SILVER_NETHER_ORE_TOP       = builder.defineInRange("nether.silver.top"        , 127, worldMin, worldMax);
            SILVER_NETHER_ORE_BOTTOM    = builder.defineInRange("nether.silver.bottom"     , 1  , worldMin, worldMax);

            URANIUM_NETHER_ORE_SIZE     = builder.defineInRange("nether.uranium.size"      , 4  , sizeMin, sizeMax);
            URANIUM_NETHER_ORE_COUNT    = builder.defineInRange("nether.uranium.count"     , 32 , countMin, countMax);
            URANIUM_NETHER_ORE_TOP      = builder.defineInRange("nether.uranium.top"       , 127, worldMin, worldMax);
            URANIUM_NETHER_ORE_BOTTOM   = builder.defineInRange("nether.uranium.bottom"    , 1  , worldMin, worldMax);

            // --------------------------------------------- nether.dense ---------------------------------------------

            DENSE_QUARTZ_NETHER_ORE_COUNT               = builder.defineInRange("nether.dense.quartz.count"     , 128, countMin, countMax);
            DENSE_QUARTZ_NETHER_ORE_TOP                 = builder.defineInRange("nether.dense.quartz.top"       , 127, worldMin, worldMax);
            DENSE_QUARTZ_NETHER_ORE_BOTTOM              = builder.defineInRange("nether.dense.quartz.bottom"    , 1  , worldMin, worldMax);
            DENSE_QUARTZ_NETHER_ORE_MULTIPLIER_FACTOR   = builder.defineInRange("nether.dense.quartz.factor"    , 10 , factorMin, factorMax);

            DENSE_EMERALD_NETHER_ORE_COUNT              = builder.defineInRange("nether.dense.emerald.count"    , 128, countMin, countMax);
            DENSE_EMERALD_NETHER_ORE_TOP                = builder.defineInRange("nether.dense.emerald.top"      , 127, worldMin, worldMax);
            DENSE_EMERALD_NETHER_ORE_BOTTOM             = builder.defineInRange("nether.dense.emerald.bottom"   , 1  , worldMin, worldMax);
            DENSE_EMERALD_NETHER_ORE_MULTIPLIER_FACTOR  = builder.defineInRange("nether.dense.emerald.factor"   , 10 , factorMin, factorMax);

            DENSE_COAL_NETHER_ORE_COUNT                 = builder.defineInRange("nether.dense.coal.count"       , 128, countMin, countMax);
            DENSE_COAL_NETHER_ORE_TOP                   = builder.defineInRange("nether.dense.coal.top"         , 127, worldMin, worldMax);
            DENSE_COAL_NETHER_ORE_BOTTOM                = builder.defineInRange("nether.dense.coal.bottom"      , 1  , worldMin, worldMax);
            DENSE_COAL_NETHER_ORE_MULTIPLIER_FACTOR     = builder.defineInRange("nether.dense.coal.factor"      , 10 , factorMin, factorMax);

            DENSE_GOLD_NETHER_ORE_COUNT                 = builder.defineInRange("nether.dense.gold.count"       , 128, countMin, countMax);
            DENSE_GOLD_NETHER_ORE_TOP                   = builder.defineInRange("nether.dense.gold.top"         , 127, worldMin, worldMax);
            DENSE_GOLD_NETHER_ORE_BOTTOM                = builder.defineInRange("nether.dense.gold.bottom"      , 1  , worldMin, worldMax);
            DENSE_GOLD_NETHER_ORE_MULTIPLIER_FACTOR     = builder.defineInRange("nether.dense.gold.factor"      , 10 , factorMin, factorMax);

            DENSE_IRON_NETHER_ORE_COUNT                 = builder.defineInRange("nether.dense.iron.count"       , 128, countMin, countMax);
            DENSE_IRON_NETHER_ORE_TOP                   = builder.defineInRange("nether.dense.iron.top"         , 127, worldMin, worldMax);
            DENSE_IRON_NETHER_ORE_BOTTOM                = builder.defineInRange("nether.dense.iron.bottom"      , 1  , worldMin, worldMax);
            DENSE_IRON_NETHER_ORE_MULTIPLIER_FACTOR     = builder.defineInRange("nether.dense.iron.factor"      , 10 , factorMin, factorMax);

            DENSE_LAPIS_NETHER_ORE_COUNT                = builder.defineInRange("nether.dense.lapis.count"      , 128, countMin, countMax);
            DENSE_LAPIS_NETHER_ORE_TOP                  = builder.defineInRange("nether.dense.lapis.top"        , 127, worldMin, worldMax);
            DENSE_LAPIS_NETHER_ORE_BOTTOM               = builder.defineInRange("nether.dense.lapis.bottom"     , 1  , worldMin, worldMax);
            DENSE_LAPIS_NETHER_ORE_MULTIPLIER_FACTOR    = builder.defineInRange("nether.dense.lapis.factor"     , 10 , factorMin, factorMax);

            DENSE_REDSTONE_NETHER_ORE_COUNT             = builder.defineInRange("nether.dense.redstone.count"   , 128, countMin, countMax);
            DENSE_REDSTONE_NETHER_ORE_TOP               = builder.defineInRange("nether.dense.redstone.top"     , 127, worldMin, worldMax);
            DENSE_REDSTONE_NETHER_ORE_BOTTOM            = builder.defineInRange("nether.dense.redstone.bottom"  , 1  , worldMin, worldMax);
            DENSE_REDSTONE_NETHER_ORE_MULTIPLIER_FACTOR = builder.defineInRange("nether.dense.redstone.factor"  , 10 , factorMin, factorMax);

            DENSE_DIAMOND_NETHER_ORE_COUNT              = builder.defineInRange("nether.dense.diamond.count"    , 128, countMin, countMax);
            DENSE_DIAMOND_NETHER_ORE_TOP                = builder.defineInRange("nether.dense.diamond.top"      , 127, worldMin, worldMax);
            DENSE_DIAMOND_NETHER_ORE_BOTTOM             = builder.defineInRange("nether.dense.diamond.bottom"   , 1  , worldMin, worldMax);
            DENSE_DIAMOND_NETHER_ORE_MULTIPLIER_FACTOR  = builder.defineInRange("nether.dense.diamond.factor"   , 10 , factorMin, factorMax);

            // --------------------------------------------- nether.gravel ---------------------------------------------

            NETHER_IRON_GRAVEL_ORE_SIZE       = builder.defineInRange("nether.gravel.iron.size"       , 8  , sizeMin, sizeMax);
            NETHER_IRON_GRAVEL_ORE_COUNT      = builder.defineInRange("nether.gravel.iron.count"      , 48 , countMin, countMax);
            NETHER_IRON_GRAVEL_ORE_TOP        = builder.defineInRange("nether.gravel.iron.top"        , 127, worldMin, worldMax);
            NETHER_IRON_GRAVEL_ORE_BOTTOM     = builder.defineInRange("nether.gravel.iron.bottom"     , 1  , worldMin, worldMax);

            NETHER_GOLD_GRAVEL_ORE_SIZE       = builder.defineInRange("nether.gravel.gold.size"       , 6  , sizeMin, sizeMax);
            NETHER_GOLD_GRAVEL_ORE_COUNT      = builder.defineInRange("nether.gravel.gold.count"      , 40 , countMin, countMax);
            NETHER_GOLD_GRAVEL_ORE_TOP        = builder.defineInRange("nether.gravel.gold.top"        , 127, worldMin, worldMax);
            NETHER_GOLD_GRAVEL_ORE_BOTTOM     = builder.defineInRange("nether.gravel.gold.bottom"     , 1  , worldMin, worldMax);

            NETHER_DIAMOND_GRAVEL_ORE_SIZE    = builder.defineInRange("nether.gravel.diamond.size"    , 4  , sizeMin, sizeMax);
            NETHER_DIAMOND_GRAVEL_ORE_COUNT   = builder.defineInRange("nether.gravel.diamond.count"   , 32 , countMin, countMax);
            NETHER_DIAMOND_GRAVEL_ORE_TOP     = builder.defineInRange("nether.gravel.diamond.top"     , 127, worldMin, worldMax);
            NETHER_DIAMOND_GRAVEL_ORE_BOTTOM  = builder.defineInRange("nether.gravel.diamond.bottom"  , 1  , worldMin, worldMax);

            // --------------------------------------------- nether.basalt ---------------------------------------------

            COAL_BASALT_ORE_SIZE        = builder.defineInRange("nether.basalt.coal.size"           , 12 , sizeMin, sizeMax);
            COAL_BASALT_ORE_COUNT       = builder.defineInRange("nether.basalt.coal.count"          , 17 , countMin, countMax);
            COAL_BASALT_ORE_TOP         = builder.defineInRange("nether.basalt.coal.top"            , 127, worldMin, worldMax);
            COAL_BASALT_ORE_BOTTOM      = builder.defineInRange("nether.basalt.coal.bottom"         , 1  , worldMin, worldMax);

            DIAMOND_BASALT_ORE_SIZE     = builder.defineInRange("nether.basalt.diamond.size"        , 4  , sizeMin, sizeMax);
            DIAMOND_BASALT_ORE_COUNT    = builder.defineInRange("nether.basalt.diamond.count"       , 5  , countMin, countMax);
            DIAMOND_BASALT_ORE_TOP      = builder.defineInRange("nether.basalt.diamond.top"         , 127, worldMin, worldMax);
            DIAMOND_BASALT_ORE_BOTTOM   = builder.defineInRange("nether.basalt.diamond.bottom"      , 1  , worldMin, worldMax);

            EMERALD_BASALT_ORE_COUNT    = builder.defineInRange("nether.basalt.emerald.count"       , 2  , countMin, countMax);
            EMERALD_BASALT_ORE_TOP      = builder.defineInRange("nether.basalt.emerald.top"         , 127, worldMin, worldMax);
            EMERALD_BASALT_ORE_BOTTOM   = builder.defineInRange("nether.basalt.emerald.bottom"      , 1  , worldMin, worldMax);

            GOLD_BASALT_ORE_SIZE        = builder.defineInRange("nether.basalt.gold.size"           , 4  , sizeMin, sizeMax);
            GOLD_BASALT_ORE_COUNT       = builder.defineInRange("nether.basalt.gold.count"          , 8  , countMin, countMax);
            GOLD_BASALT_ORE_TOP         = builder.defineInRange("nether.basalt.gold.top"            , 127, worldMin, worldMax);
            GOLD_BASALT_ORE_BOTTOM      = builder.defineInRange("nether.basalt.gold.bottom"         , 1  , worldMin, worldMax);

            IRON_BASALT_ORE_SIZE        = builder.defineInRange("nether.basalt.iron.size"           , 6  , sizeMin, sizeMax);
            IRON_BASALT_ORE_COUNT       = builder.defineInRange("nether.basalt.iron.count"          , 10 , countMin, countMax);
            IRON_BASALT_ORE_TOP         = builder.defineInRange("nether.basalt.iron.top"            , 127, worldMin, worldMax);
            IRON_BASALT_ORE_BOTTOM      = builder.defineInRange("nether.basalt.iron.bottom"         , 1  , worldMin, worldMax);

            LAPIS_BASALT_ORE_SIZE       = builder.defineInRange("nether.basalt.lapis.size"          , 6  , sizeMin, sizeMax);
            LAPIS_BASALT_ORE_COUNT      = builder.defineInRange("nether.basalt.lapis.count"         , 5  , countMin, countMax);
            LAPIS_BASALT_ORE_TOP        = builder.defineInRange("nether.basalt.lapis.top"           , 127, worldMin, worldMax);
            LAPIS_BASALT_ORE_BOTTOM     = builder.defineInRange("nether.basalt.lapis.bottom"        , 1  , worldMin, worldMax);

            REDSTONE_BASALT_ORE_SIZE    = builder.defineInRange("nether.basalt.redstone.size"       , 8  , sizeMin, sizeMax);
            REDSTONE_BASALT_ORE_COUNT   = builder.defineInRange("nether.basalt.redstone.count"      , 8  , countMin, countMax);
            REDSTONE_BASALT_ORE_TOP     = builder.defineInRange("nether.basalt.redstone.top"        , 127, worldMin, worldMax);
            REDSTONE_BASALT_ORE_BOTTOM  = builder.defineInRange("nether.basalt.redstone.bottom"     , 1  , worldMin, worldMax);

            // --------------------------------------------- the end ---------------------------------------------

            COAL_THEEND_ORE_SIZE       = builder.defineInRange("theend.coal.size"       , 12, sizeMin, sizeMax);
            COAL_THEEND_ORE_COUNT      = builder.defineInRange("theend.coal.count"      , 34, countMin, countMax);
            COAL_THEEND_ORE_TOP        = builder.defineInRange("theend.coal.top"        , 70, worldMin, worldMax);
            COAL_THEEND_ORE_BOTTOM     = builder.defineInRange("theend.coal.bottom"     , 20, worldMin, worldMax);

            DIAMOND_THEEND_ORE_SIZE    = builder.defineInRange("theend.diamond.size"    , 4 , sizeMin, sizeMax);
            DIAMOND_THEEND_ORE_COUNT   = builder.defineInRange("theend.diamond.count"   , 10, countMin, countMax);
            DIAMOND_THEEND_ORE_TOP     = builder.defineInRange("theend.diamond.top"     , 70, worldMin, worldMax);
            DIAMOND_THEEND_ORE_BOTTOM  = builder.defineInRange("theend.diamond.bottom"  , 20, worldMin, worldMax);

            EMERALD_THEEND_ORE_COUNT   = builder.defineInRange("theend.emerald.count"   , 4 , countMin, countMax);
            EMERALD_THEEND_ORE_TOP     = builder.defineInRange("theend.emerald.top"     , 70, worldMin, worldMax);
            EMERALD_THEEND_ORE_BOTTOM  = builder.defineInRange("theend.emerald.bottom"  , 20, worldMin, worldMax);

            GOLD_THEEND_ORE_SIZE       = builder.defineInRange("theend.gold.size"       , 6 , sizeMin, sizeMax);
            GOLD_THEEND_ORE_COUNT      = builder.defineInRange("theend.gold.count"      , 16, countMin, countMax);
            GOLD_THEEND_ORE_TOP        = builder.defineInRange("theend.gold.top"        , 70, worldMin, worldMax);
            GOLD_THEEND_ORE_BOTTOM     = builder.defineInRange("theend.gold.bottom"     , 20, worldMin, worldMax);

            IRON_THEEND_ORE_SIZE       = builder.defineInRange("theend.iron.size"       , 8 , sizeMin, sizeMax);
            IRON_THEEND_ORE_COUNT      = builder.defineInRange("theend.iron.count"      , 20, countMin, countMax);
            IRON_THEEND_ORE_TOP        = builder.defineInRange("theend.iron.top"        , 70, worldMin, worldMax);
            IRON_THEEND_ORE_BOTTOM     = builder.defineInRange("theend.iron.bottom"     , 20, worldMin, worldMax);

            LAPIS_THEEND_ORE_SIZE      = builder.defineInRange("theend.lapis.size"      , 6 , sizeMin, sizeMax);
            LAPIS_THEEND_ORE_COUNT     = builder.defineInRange("theend.lapis.count"     , 10, countMin, countMax);
            LAPIS_THEEND_ORE_TOP       = builder.defineInRange("theend.lapis.top"       , 70, worldMin, worldMax);
            LAPIS_THEEND_ORE_BOTTOM    = builder.defineInRange("theend.lapis.bottom"    , 20, worldMin, worldMax);

            REDSTONE_THEEND_ORE_SIZE   = builder.defineInRange("theend.redstone.size"   , 6 , sizeMin, sizeMax);
            REDSTONE_THEEND_ORE_COUNT  = builder.defineInRange("theend.redstone.count"  , 16, countMin, countMax);
            REDSTONE_THEEND_ORE_TOP    = builder.defineInRange("theend.redstone.top"    , 70, worldMin, worldMax);
            REDSTONE_THEEND_ORE_BOTTOM = builder.defineInRange("theend.redstone.bottom" , 20, worldMin, worldMax);

            builder.pop();
        }
    }
}
