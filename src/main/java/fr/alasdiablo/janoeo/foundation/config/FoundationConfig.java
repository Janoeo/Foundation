package fr.alasdiablo.janoeo.foundation.config;

import fr.alasdiablo.diolib.config.json.JsonConfigBuilder;
import fr.alasdiablo.janoeo.foundation.Registries;

import java.io.IOException;

public class FoundationConfig {

    /* * * * * * * * * * * * * * * Ore * * *  * * * * * * * * * * */
    public static final OreConfig BAUXITE_ORE_CONFIG = new OreConfig(Registries.BAUXITE_ORE, true).placementUniform(10, 0, 96, 6);
    public static final OreConfig LEAD_ORE_CONFIG    = new OreConfig(Registries.LEAD_ORE, true).placementUniform(6, 0, 48, 6);
    public static final OreConfig NICKEL_ORE_CONFIG  = new OreConfig(Registries.NICKEL_ORE, true).placementUniform(6, 0, 32, 4);
    public static final OreConfig SILVER_ORE_CONFIG  = new OreConfig(Registries.SILVER_ORE, true).placementUniform(6, -16, 28, 4);
    public static final OreConfig TIN_ORE_CONFIG     = new OreConfig(Registries.TIN_ORE, true).placementUniform(10, 0, 96, 6);
    public static final OreConfig URANIUM_ORE_CONFIG = new OreConfig(Registries.URANIUM_ORE, true).placementUniform(6, -24, 28, 4);

    /* * * * * * * * * * * * * * * Tiny Ore * * *  * * * * * * * * * * */
    public static final OreConfig TINY_COAL_ORE_CONFIG       = new OreConfig(Registries.TINY_COAL_ORE, true).placementUniform(17, -24, 180, 20);
    public static final OreConfig TINY_COPPER_ORE_CONFIG     = new OreConfig(Registries.TINY_COPPER_ORE, true).placementUniform(10, -16, 112, 6);
    public static final OreConfig TINY_DIAMOND_ORE_CONFIG    = new OreConfig(Registries.TINY_DIAMOND_ORE, true).placementUniform(8, -24, 16, 4);
    public static final OreConfig TINY_EMERALD_ORE_CONFIG    = new OreConfig(Registries.TINY_EMERALD_ORE, true).placementUniform(2, 4, 31, 4);
    public static final OreConfig TINY_GOLD_ORE_CONFIG       = new OreConfig(Registries.TINY_GOLD_ORE, true).placementUniform(9, -64, 32, 2);
    public static final OreConfig TINY_GOLD_ORE_EXTRA_CONFIG = new OreConfig(Registries.TINY_GOLD_ORE_EXTRA, true).placementUniform(9, 32, 80, 20);
    public static final OreConfig TINY_IRON_ORE_CONFIG       = new OreConfig(Registries.TINY_IRON_ORE, true).placementUniform(9, -24, 180, 20);
    public static final OreConfig TINY_LAPIS_ORE_CONFIG      = new OreConfig(Registries.TINY_LAPIS_ORE, true).placementTriangle(7, 16, 16, 4);
    public static final OreConfig TINY_REDSTONE_ORE_CONFIG   = new OreConfig(Registries.TINY_REDSTONE_ORE, true).placementUniform(8, -16, 16, 8);

    public static final OreConfig TINY_BAUXITE_ORE_CONFIG = new OreConfig(Registries.TINY_BAUXITE_ORE, true).placementUniform(10, 0, 96, 6);
    public static final OreConfig TINY_LEAD_ORE_CONFIG    = new OreConfig(Registries.TINY_LEAD_ORE, true).placementUniform(6, 0, 48, 6);
    public static final OreConfig TINY_NICKEL_ORE_CONFIG  = new OreConfig(Registries.TINY_NICKEL_ORE, true).placementUniform(6, 0, 32, 4);
    public static final OreConfig TINY_SILVER_ORE_CONFIG  = new OreConfig(Registries.TINY_SILVER_ORE, true).placementUniform(6, -16, 28, 4);
    public static final OreConfig TINY_TIN_ORE_CONFIG     = new OreConfig(Registries.TINY_TIN_ORE, true).placementUniform(10, 0, 96, 6);
    public static final OreConfig TINY_URANIUM_ORE_CONFIG = new OreConfig(Registries.TINY_URANIUM_ORE, true).placementUniform(6, -24, 28, 4);

    /* * * * * * * * * * * * * * * Nether Ore * * *  * * * * * * * * * * */
    public static final OreConfig NETHER_COAL_ORE_CONFIG     = new OreConfig(Registries.NETHER_COAL_ORE, true).placementUniform(10, 10, 118, 10);
    public static final OreConfig NETHER_COPPER_ORE_CONFIG   = new OreConfig(Registries.NETHER_COPPER_ORE, true).placementUniform(10, 10, 118, 10);
    public static final OreConfig NETHER_DIAMOND_ORE_CONFIG  = new OreConfig(Registries.NETHER_DIAMOND_ORE, true).placementUniform(10, 10, 118, 10);
    public static final OreConfig NETHER_EMERALD_ORE_CONFIG  = new OreConfig(Registries.NETHER_EMERALD_ORE, true).placementUniform(10, 10, 118, 10);
    public static final OreConfig NETHER_IRON_ORE_CONFIG     = new OreConfig(Registries.NETHER_IRON_ORE, true).placementUniform(10, 10, 118, 10);
    public static final OreConfig NETHER_LAPIS_ORE_CONFIG    = new OreConfig(Registries.NETHER_LAPIS_ORE, true).placementUniform(10, 10, 118, 10);
    public static final OreConfig NETHER_REDSTONE_ORE_CONFIG = new OreConfig(Registries.NETHER_REDSTONE_ORE, true).placementUniform(10, 10, 118, 10);

    public static final OreConfig NETHER_BAUXITE_ORE_CONFIG = new OreConfig(Registries.NETHER_BAUXITE_ORE, true).placementUniform(10, 10, 118, 10);
    public static final OreConfig NETHER_LEAD_ORE_CONFIG    = new OreConfig(Registries.NETHER_LEAD_ORE, true).placementUniform(10, 10, 118, 10);
    public static final OreConfig NETHER_NICKEL_ORE_CONFIG  = new OreConfig(Registries.NETHER_NICKEL_ORE, true).placementUniform(10, 10, 118, 10);
    public static final OreConfig NETHER_SILVER_ORE_CONFIG  = new OreConfig(Registries.NETHER_SILVER_ORE, true).placementUniform(10, 10, 118, 10);
    public static final OreConfig NETHER_TIN_ORE_CONFIG     = new OreConfig(Registries.NETHER_TIN_ORE, true).placementUniform(10, 10, 118, 10);
    public static final OreConfig NETHER_URANIUM_ORE_CONFIG = new OreConfig(Registries.NETHER_URANIUM_ORE, true).placementUniform(10, 10, 118, 10);

    /* * * * * * * * * * * * * * * Config Builder * * *  * * * * * * * * * * */
    private static final JsonConfigBuilder OVERWORLD_ORE_TINY_CONFIG = new JsonConfigBuilder("janoeo", "foundation", "overworld", "tiny");
    private static final JsonConfigBuilder OVERWORLD_ORE_CONFIG      = new JsonConfigBuilder("janoeo", "foundation", "overworld");
    private static final JsonConfigBuilder NETHER_ORE_CONFIG         = new JsonConfigBuilder("janoeo", "foundation", "nether");

    public static void init() throws IOException {
        OVERWORLD_ORE_TINY_CONFIG.add(TINY_COAL_ORE_CONFIG).add(TINY_COPPER_ORE_CONFIG).add(TINY_DIAMOND_ORE_CONFIG).add(TINY_EMERALD_ORE_CONFIG)
                .add(TINY_GOLD_ORE_CONFIG).add(TINY_GOLD_ORE_EXTRA_CONFIG).add(TINY_IRON_ORE_CONFIG).add(TINY_LAPIS_ORE_CONFIG).add(TINY_REDSTONE_ORE_CONFIG)
                .add(TINY_BAUXITE_ORE_CONFIG).add(TINY_LEAD_ORE_CONFIG).add(TINY_NICKEL_ORE_CONFIG).add(TINY_SILVER_ORE_CONFIG).add(TINY_TIN_ORE_CONFIG)
                .add(TINY_URANIUM_ORE_CONFIG).build();

        OVERWORLD_ORE_CONFIG.add(BAUXITE_ORE_CONFIG).add(LEAD_ORE_CONFIG).add(NICKEL_ORE_CONFIG).add(SILVER_ORE_CONFIG).add(TIN_ORE_CONFIG)
                .add(URANIUM_ORE_CONFIG).build();

        NETHER_ORE_CONFIG.add(NETHER_COAL_ORE_CONFIG).add(NETHER_COPPER_ORE_CONFIG).add(NETHER_DIAMOND_ORE_CONFIG).add(NETHER_EMERALD_ORE_CONFIG)
                .add(NETHER_IRON_ORE_CONFIG).add(NETHER_LAPIS_ORE_CONFIG).add(NETHER_REDSTONE_ORE_CONFIG).add(NETHER_BAUXITE_ORE_CONFIG)
                .add(NETHER_LEAD_ORE_CONFIG).add(NETHER_NICKEL_ORE_CONFIG).add(NETHER_SILVER_ORE_CONFIG).add(NETHER_TIN_ORE_CONFIG)
                .add(NETHER_URANIUM_ORE_CONFIG).build();
    }
}
