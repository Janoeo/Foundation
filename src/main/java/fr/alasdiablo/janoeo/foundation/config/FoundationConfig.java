package fr.alasdiablo.janoeo.foundation.config;

import fr.alasdiablo.diolib.config.json.JsonConfigBuilder;
import fr.alasdiablo.janoeo.foundation.Registries;

import java.io.IOException;

public class FoundationConfig {

    private static final JsonConfigBuilder OVERWORLD_ORE_TINY_CONFIG = new JsonConfigBuilder(
            "janoeo", "foundation", "overworld", "tiny");

    private static final JsonConfigBuilder OVERWORLD_ORE_CONFIG = new JsonConfigBuilder(
            "janoeo", "foundation", "overworld");

    public static final OreConfig TINY_COAL_ORE_CONFIG       = new OreConfig(
            Registries.TINY_COAL_ORE, true).placementRange(17, 128, 20);
    public static final OreConfig TINY_COPPER_ORE_CONFIG     = new OreConfig(
            Registries.TINY_COPPER_ORE, true).placementUniform(10, 0, 96, 6);
    public static final OreConfig TINY_DIAMOND_ORE_CONFIG    = new OreConfig(
            Registries.TINY_DIAMOND_ORE, true).placementRange(8, 16, 4);
    public static final OreConfig TINY_EMERALD_ORE_CONFIG    = new OreConfig(
            Registries.TINY_EMERALD_ORE, true).placementUniform(2, 4, 31, 4);
    public static final OreConfig TINY_GOLD_ORE_CONFIG       = new OreConfig(
            Registries.TINY_GOLD_ORE, true).placementRange(9, 32, 2);
    public static final OreConfig TINY_GOLD_ORE_EXTRA_CONFIG = new OreConfig(
            Registries.TINY_GOLD_ORE + "_extra", true).placementUniform(9, 32, 80, 20);
    public static final OreConfig TINY_IRON_ORE_CONFIG       = new OreConfig(
            Registries.TINY_IRON_ORE, true).placementRange(9, 64, 20);
    public static final OreConfig TINY_LAPIS_ORE_CONFIG      = new OreConfig(
            Registries.TINY_LAPIS_ORE, true).placementTriangle(7, 16, 16);
    public static final OreConfig TINY_REDSTONE_ORE_CONFIG   = new OreConfig(
            Registries.TINY_REDSTONE_ORE, true).placementRange(8, 16, 8);

    public static final OreConfig BAUXITE_ORE_CONFIG = new OreConfig(Registries.BAUXITE_ORE, true).placementRange(
            10, 96, 6);
    public static final OreConfig LEAD_ORE_CONFIG    = new OreConfig(Registries.LEAD_ORE, true).placementRange(
            6, 48, 6);
    public static final OreConfig NICKEL_ORE_CONFIG  = new OreConfig(Registries.NICKEL_ORE, true).placementRange(
            6, 32, 4);
    public static final OreConfig SILVER_ORE_CONFIG  = new OreConfig(Registries.SILVER_ORE, true).placementRange(
            6, 28, 4);
    public static final OreConfig TIN_ORE_CONFIG     = new OreConfig(Registries.TIN_ORE, true).placementRange(
            10, 96, 6);
    public static final OreConfig URANIUM_ORE_CONFIG = new OreConfig(Registries.URANIUM_ORE, true).placementRange(
            6, 28, 4);

    public static final OreConfig TINY_BAUXITE_ORE_CONFIG = new OreConfig(
            Registries.TINY_BAUXITE_ORE, true).placementRange(10, 96, 6);
    public static final OreConfig TINY_LEAD_ORE_CONFIG    = new OreConfig(
            Registries.TINY_LEAD_ORE, true).placementRange(6, 48, 6);
    public static final OreConfig TINY_NICKEL_ORE_CONFIG  = new OreConfig(
            Registries.TINY_NICKEL_ORE, true).placementRange(6, 32, 4);
    public static final OreConfig TINY_SILVER_ORE_CONFIG  = new OreConfig(
            Registries.TINY_SILVER_ORE, true).placementRange(6, 28, 4);
    public static final OreConfig TINY_TIN_ORE_CONFIG     = new OreConfig(Registries.TINY_TIN_ORE, true).placementRange(
            10, 96, 6);
    public static final OreConfig TINY_URANIUM_ORE_CONFIG = new OreConfig(
            Registries.TINY_URANIUM_ORE, true).placementRange(6, 28, 4);

    public static void init() throws IOException {
        OVERWORLD_ORE_TINY_CONFIG
                .add(TINY_COAL_ORE_CONFIG)
                .add(TINY_COPPER_ORE_CONFIG)
                .add(TINY_DIAMOND_ORE_CONFIG)
                .add(TINY_EMERALD_ORE_CONFIG)
                .add(TINY_GOLD_ORE_CONFIG)
                .add(TINY_GOLD_ORE_EXTRA_CONFIG)
                .add(TINY_IRON_ORE_CONFIG)
                .add(TINY_LAPIS_ORE_CONFIG)
                .add(TINY_REDSTONE_ORE_CONFIG)
                .add(TINY_BAUXITE_ORE_CONFIG)
                .add(TINY_LEAD_ORE_CONFIG)
                .add(TINY_NICKEL_ORE_CONFIG)
                .add(TINY_SILVER_ORE_CONFIG)
                .add(TINY_TIN_ORE_CONFIG)
                .add(TINY_URANIUM_ORE_CONFIG)
                .build();

        OVERWORLD_ORE_CONFIG
                .add(BAUXITE_ORE_CONFIG)
                .add(LEAD_ORE_CONFIG)
                .add(NICKEL_ORE_CONFIG)
                .add(SILVER_ORE_CONFIG)
                .add(TIN_ORE_CONFIG)
                .add(URANIUM_ORE_CONFIG)
                .build();
    }
}
