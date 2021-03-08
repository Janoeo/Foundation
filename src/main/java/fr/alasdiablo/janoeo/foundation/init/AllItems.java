package fr.alasdiablo.janoeo.foundation.init;

import net.minecraft.item.Item;
import net.minecraft.util.IItemProvider;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class AllItems {

    public static final class Dusts {
        public static final Map<String, IItemProvider> DUSTS_MAP = new HashMap<>();
        public static final Item ALUMINIUM = DustsItems.ALUMINIUM_DUST;
        public static final Item COAL      = DustsItems.COAL_DUST;
        public static final Item COPPER    = DustsItems.COPPER_DUST;
        public static final Item DIAMOND   = DustsItems.DIAMOND_DUST;
        public static final Item EMERALD   = DustsItems.EMERALD_DUST;
        public static final Item GOLD      = DustsItems.GOLD_DUST;
        public static final Item IRON      = DustsItems.IRON_DUST;
        public static final Item LAPIS     = DustsItems.LAPIS_DUST;
        public static final Item LEAD      = DustsItems.LEAD_DUST;
        public static final Item NICKEL    = DustsItems.NICKEL_DUST;
        public static final Item PLATINUM  = DustsItems.PLATINUM_DUST;
        public static final Item RUBY      = DustsItems.RUBY_DUST;
        public static final Item SAPPHIRE  = DustsItems.SAPPHIRE_DUST;
        public static final Item SILVER    = DustsItems.SILVER_DUST;
        public static final Item TIN       = DustsItems.TIN_DUST;
        public static final Item URANIUM   = DustsItems.URANIUM_DUST;

        static {
            DUSTS_MAP.put(Objects.requireNonNull(ALUMINIUM.getRegistryName()).toString(), ALUMINIUM);
            DUSTS_MAP.put(Objects.requireNonNull(COAL.getRegistryName()).toString()     , COAL);
            DUSTS_MAP.put(Objects.requireNonNull(COPPER.getRegistryName()).toString()   , COPPER);
            DUSTS_MAP.put(Objects.requireNonNull(DIAMOND.getRegistryName()).toString()  , DIAMOND);
            DUSTS_MAP.put(Objects.requireNonNull(EMERALD.getRegistryName()).toString()  , EMERALD);
            DUSTS_MAP.put(Objects.requireNonNull(GOLD.getRegistryName()).toString()     , GOLD);
            DUSTS_MAP.put(Objects.requireNonNull(IRON.getRegistryName()).toString()     , IRON);
            DUSTS_MAP.put(Objects.requireNonNull(LAPIS.getRegistryName()).toString()    , LAPIS);
            DUSTS_MAP.put(Objects.requireNonNull(LEAD.getRegistryName()).toString()     , LEAD);
            DUSTS_MAP.put(Objects.requireNonNull(NICKEL.getRegistryName()).toString()   , NICKEL);
            DUSTS_MAP.put(Objects.requireNonNull(PLATINUM.getRegistryName()).toString() , PLATINUM);
            DUSTS_MAP.put(Objects.requireNonNull(RUBY.getRegistryName()).toString()     , RUBY);
            DUSTS_MAP.put(Objects.requireNonNull(SAPPHIRE.getRegistryName()).toString() , SAPPHIRE);
            DUSTS_MAP.put(Objects.requireNonNull(SILVER.getRegistryName()).toString()   , SILVER);
            DUSTS_MAP.put(Objects.requireNonNull(TIN.getRegistryName()).toString()      , TIN);
            DUSTS_MAP.put(Objects.requireNonNull(URANIUM.getRegistryName()).toString()  , URANIUM);
        }
    }

    public static final class Ingots {
        public static final Map<String, IItemProvider> INGOTS_MAP = new HashMap<>();
        public static final Item ALUMINIUM = IngotsItems.ALUMINIUM_INGOT;
        public static final Item COPPER = IngotsItems.COPPER_INGOT;
        public static final Item LEAD = IngotsItems.LEAD_INGOT;
        public static final Item OSMIUM = IngotsItems.OSMIUM_INGOT;
        public static final Item SILVER = IngotsItems.SILVER_INGOT;
        public static final Item TIN = IngotsItems.TIN_INGOT;
        public static final Item URANIUM = IngotsItems.URANIUM_INGOT;
        public static final Item ZINC = IngotsItems.ZINC_INGOT;
        static {
            INGOTS_MAP.put(Objects.requireNonNull(ALUMINIUM.getRegistryName()).toString(), ALUMINIUM);
            INGOTS_MAP.put(Objects.requireNonNull(COPPER.getRegistryName()).toString()   , COPPER);
            INGOTS_MAP.put(Objects.requireNonNull(LEAD.getRegistryName()).toString()     , LEAD);
            INGOTS_MAP.put(Objects.requireNonNull(OSMIUM.getRegistryName()).toString()   , OSMIUM);
            INGOTS_MAP.put(Objects.requireNonNull(SILVER.getRegistryName()).toString()   , SILVER);
            INGOTS_MAP.put(Objects.requireNonNull(TIN.getRegistryName()).toString()      , TIN);
            INGOTS_MAP.put(Objects.requireNonNull(URANIUM.getRegistryName()).toString()  , URANIUM);
            INGOTS_MAP.put(Objects.requireNonNull(ZINC.getRegistryName()).toString()     , ZINC);
        }
    }

    public static final class Gems {
        public static final Map<String, IItemProvider> GEMS_MAP = new HashMap<>();
        public static final Item RUBY = GemsItems.RUBY;
        public static final Item SAPPHIRE = GemsItems.SAPPHIRE;
        public static final Item AMETHYST = GemsItems.AMETHYST;
        static {
            GEMS_MAP.put(Objects.requireNonNull(RUBY.getRegistryName()).toString()    , RUBY);
            GEMS_MAP.put(Objects.requireNonNull(SAPPHIRE.getRegistryName()).toString(), SAPPHIRE);
            GEMS_MAP.put(Objects.requireNonNull(AMETHYST.getRegistryName()).toString(), AMETHYST);
        }
    }
}
