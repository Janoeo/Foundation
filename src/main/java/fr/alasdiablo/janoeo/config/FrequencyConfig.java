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

        public final int countMin = 0, countMax = 4096, worldMin = 1, worldMax = 255;

        public final ForgeConfigSpec.IntValue COPPER_ORE_COUNT;
        public final ForgeConfigSpec.IntValue COPPER_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue COPPER_ORE_TOP;

        public final ForgeConfigSpec.IntValue TIN_ORE_COUNT;
        public final ForgeConfigSpec.IntValue TIN_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue TIN_ORE_TOP;

        public final ForgeConfigSpec.IntValue ALUMINIUM_ORE_COUNT;
        public final ForgeConfigSpec.IntValue ALUMINIUM_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue ALUMINIUM_ORE_TOP;

        public final ForgeConfigSpec.IntValue URANIUM_ORE_COUNT;
        public final ForgeConfigSpec.IntValue URANIUM_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue URANIUM_ORE_TOP;

        public final ForgeConfigSpec.IntValue LEAD_ORE_COUNT;
        public final ForgeConfigSpec.IntValue LEAD_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue LEAD_ORE_TOP;

        public final ForgeConfigSpec.IntValue SILVER_ORE_COUNT;
        public final ForgeConfigSpec.IntValue SILVER_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue SILVER_ORE_TOP;

        public final ForgeConfigSpec.IntValue RUBY_ORE_COUNT;
        public final ForgeConfigSpec.IntValue RUBY_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue RUBY_ORE_TOP;

        public final ForgeConfigSpec.IntValue SAPPHIRE_ORE_COUNT;
        public final ForgeConfigSpec.IntValue SAPPHIRE_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue SAPPHIRE_ORE_TOP;

        public final ForgeConfigSpec.IntValue AMETHYST_ORE_COUNT;
        public final ForgeConfigSpec.IntValue AMETHYST_ORE_BOTTOM;
        public final ForgeConfigSpec.IntValue AMETHYST_ORE_TOP;

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

        public Config(ForgeConfigSpec.Builder builder) {
            builder.comment("Ore frequency and height config for janoeo").push("janoeo");

            COPPER_ORE_COUNT            = builder.defineInRange("overworld.copper_count"            , 12, countMin, countMax);
            COPPER_ORE_TOP              = builder.defineInRange("overworld.copper_top"              , 63, worldMin, worldMax);
            COPPER_ORE_BOTTOM           = builder.defineInRange("overworld.copper_bottom"           , 1 , worldMin, worldMax);

            TIN_ORE_COUNT               = builder.defineInRange("overworld.tin_count"               , 12, countMin, countMax);
            TIN_ORE_TOP                 = builder.defineInRange("overworld.tin_top"                 , 63, worldMin, worldMax);
            TIN_ORE_BOTTOM              = builder.defineInRange("overworld.tin_bottom"              , 1 , worldMin, worldMax);

            ALUMINIUM_ORE_COUNT         = builder.defineInRange("overworld.aluminium_count"         , 12, countMin, countMax);
            ALUMINIUM_ORE_TOP           = builder.defineInRange("overworld.aluminium_top"           , 63, worldMin, worldMax);
            ALUMINIUM_ORE_BOTTOM        = builder.defineInRange("overworld.aluminium_bottom"        , 1 , worldMin, worldMax);

            URANIUM_ORE_COUNT           = builder.defineInRange("overworld.uranium_count"           , 12, countMin, countMax);
            URANIUM_ORE_TOP             = builder.defineInRange("overworld.uranium_top"             , 32, worldMin, worldMax);
            URANIUM_ORE_BOTTOM          = builder.defineInRange("overworld.uranium_bottom"          , 1 , worldMin, worldMax);

            LEAD_ORE_COUNT              = builder.defineInRange("overworld.lead_count"              , 12, countMin, countMax);
            LEAD_ORE_TOP                = builder.defineInRange("overworld.lead_top"                , 63, worldMin, worldMax);
            LEAD_ORE_BOTTOM             = builder.defineInRange("overworld.lead_bottom"             , 1 , worldMin, worldMax);

            SILVER_ORE_COUNT            = builder.defineInRange("overworld.silver_count"            , 12, countMin, countMax);
            SILVER_ORE_TOP              = builder.defineInRange("overworld.silver_top"              , 26, worldMin, worldMax);
            SILVER_ORE_BOTTOM           = builder.defineInRange("overworld.silver_bottom"           , 1 , worldMin, worldMax);

            RUBY_ORE_COUNT              = builder.defineInRange("overworld.ruby_count"              , 12, countMin, countMax);
            RUBY_ORE_TOP                = builder.defineInRange("overworld.ruby_top"                , 26, worldMin, worldMax);
            RUBY_ORE_BOTTOM             = builder.defineInRange("overworld.ruby_bottom"             , 1 , worldMin, worldMax);

            SAPPHIRE_ORE_COUNT          = builder.defineInRange("overworld.sapphire_count"          , 12, countMin, countMax);
            SAPPHIRE_ORE_TOP            = builder.defineInRange("overworld.sapphire_top"            , 26, worldMin, worldMax);
            SAPPHIRE_ORE_BOTTOM         = builder.defineInRange("overworld.sapphire_bottom"         , 1 , worldMin, worldMax);

            AMETHYST_ORE_COUNT          = builder.defineInRange("overworld.amethyst_count"          , 12, countMin, countMax);
            AMETHYST_ORE_TOP            = builder.defineInRange("overworld.amethyst_top"            , 26, worldMin, worldMax);
            AMETHYST_ORE_BOTTOM         = builder.defineInRange("overworld.amethyst_bottom"         , 1 , worldMin, worldMax);

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

            builder.pop();
        }
    }
}
