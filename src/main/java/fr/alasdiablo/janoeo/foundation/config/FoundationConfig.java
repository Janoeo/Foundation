package fr.alasdiablo.janoeo.foundation.config;

import fr.alasdiablo.diolib.api.config.JsonConfigBuilder;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import fr.alasdiablo.janoeo.foundation.resource.ResourceType;

import java.io.IOException;

public class FoundationConfig {

    /* * * * * * * * * * * * * * * Ore * * *  * * * * * * * * * * */
    public static final OreConfig BAUXITE_ORE_CONFIG = new OreConfig(Resource.Aluminium.getName(ResourceType.StoneOre), true).placementUniform(10, 8, 96, 6);
    public static final OreConfig LEAD_ORE_CONFIG    = new OreConfig(Resource.Lead.getName(ResourceType.StoneOre), true).placementUniform(6, -16, 48, 6);
    public static final OreConfig NICKEL_ORE_CONFIG  = new OreConfig(Resource.Nickel.getName(ResourceType.StoneOre), true).placementUniform(6, -24, 32, 4);
    public static final OreConfig SILVER_ORE_CONFIG  = new OreConfig(Resource.Silver.getName(ResourceType.StoneOre), true).placementUniform(6, -56, 28, 6);
    public static final OreConfig TIN_ORE_CONFIG     = new OreConfig(Resource.Tin.getName(ResourceType.StoneOre), true).placementUniform(10, 0, 96, 8);
    public static final OreConfig URANIUM_ORE_CONFIG = new OreConfig(Resource.Uranium.getName(ResourceType.StoneOre), true).placementUniform(6, -56, 28, 6);

    /* * * * * * * * * * * * * * * Tiny Ore * * *  * * * * * * * * * * */
    public static final OreConfig TINY_COAL_ORE_CONFIG       = new OreConfig(Resource.Coal.getName(ResourceType.TinyStoneOre), true).placementUniform(
            17, -36, 180, 20);
    public static final OreConfig TINY_COPPER_ORE_CONFIG     = new OreConfig(Resource.Copper.getName(ResourceType.TinyStoneOre), true).placementUniform(
            10, -16, 112, 6);
    public static final OreConfig TINY_DIAMOND_ORE_CONFIG    = new OreConfig(Resource.Diamond.getName(ResourceType.TinyStoneOre), true).placementUniform(
            8, -62, 16, 4);
    public static final OreConfig TINY_EMERALD_ORE_CONFIG    = new OreConfig(Resource.Emerald.getName(ResourceType.TinyStoneOre), true).placementUniform(
            2, 24, 31, 4);
    public static final OreConfig TINY_GOLD_ORE_CONFIG       = new OreConfig(Resource.Gold.getName(ResourceType.TinyStoneOre), true).placementUniform(
            9, -62, 32, 2);
    public static final OreConfig TINY_GOLD_ORE_EXTRA_CONFIG = new OreConfig(
            Resource.Gold.getName(ResourceType.TinyStoneOre) + "_extra", true).placementUniform(9, 32, 80, 20);
    public static final OreConfig TINY_IRON_ORE_CONFIG       = new OreConfig(Resource.Iron.getName(ResourceType.TinyStoneOre), true).placementUniform(
            9, -24, 180, 20);
    public static final OreConfig TINY_LAPIS_ORE_CONFIG      = new OreConfig(Resource.Lapis.getName(ResourceType.TinyStoneOre), true).placementTriangle(
            7, 16, 16, 4);
    public static final OreConfig TINY_REDSTONE_ORE_CONFIG   = new OreConfig(Resource.RedStone.getName(ResourceType.TinyStoneOre), true).placementUniform(
            8, -62, 16, 8);

    public static final OreConfig TINY_BAUXITE_ORE_CONFIG = new OreConfig(Resource.Aluminium.getName(ResourceType.TinyStoneOre), true).placementUniform(
            10, 8, 96, 6);
    public static final OreConfig TINY_LEAD_ORE_CONFIG    = new OreConfig(Resource.Lead.getName(ResourceType.TinyStoneOre), true).placementUniform(
            6, -16, 48, 6);
    public static final OreConfig TINY_NICKEL_ORE_CONFIG  = new OreConfig(Resource.Nickel.getName(ResourceType.TinyStoneOre), true).placementUniform(
            6, -24, 32, 4);
    public static final OreConfig TINY_SILVER_ORE_CONFIG  = new OreConfig(Resource.Silver.getName(ResourceType.TinyStoneOre), true).placementUniform(
            6, -56, 28, 4);
    public static final OreConfig TINY_TIN_ORE_CONFIG     = new OreConfig(Resource.Tin.getName(ResourceType.TinyStoneOre), true).placementUniform(10, 0, 96, 8);
    public static final OreConfig TINY_URANIUM_ORE_CONFIG = new OreConfig(Resource.Uranium.getName(ResourceType.TinyStoneOre), true).placementUniform(
            6, -56, 28, 6);

    /* * * * * * * * * * * * * * * Nether Ore * * *  * * * * * * * * * * */
    public static final OreConfig NETHER_COAL_ORE_CONFIG     = new OreConfig(Resource.Coal.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 6);
    public static final OreConfig NETHER_COPPER_ORE_CONFIG   = new OreConfig(Resource.Copper.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 6);
    public static final OreConfig NETHER_DIAMOND_ORE_CONFIG  = new OreConfig(Resource.Diamond.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 4);
    public static final OreConfig NETHER_EMERALD_ORE_CONFIG  = new OreConfig(Resource.Emerald.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 4);
    public static final OreConfig NETHER_IRON_ORE_CONFIG     = new OreConfig(Resource.Iron.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 6);
    public static final OreConfig NETHER_LAPIS_ORE_CONFIG    = new OreConfig(Resource.Lapis.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 4);
    public static final OreConfig NETHER_REDSTONE_ORE_CONFIG = new OreConfig(Resource.RedStone.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 4);

    public static final OreConfig NETHER_BAUXITE_ORE_CONFIG = new OreConfig(Resource.Aluminium.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 6);
    public static final OreConfig NETHER_LEAD_ORE_CONFIG    = new OreConfig(Resource.Lead.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 6);
    public static final OreConfig NETHER_NICKEL_ORE_CONFIG  = new OreConfig(Resource.Nickel.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 4);
    public static final OreConfig NETHER_SILVER_ORE_CONFIG  = new OreConfig(Resource.Silver.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 4);
    public static final OreConfig NETHER_TIN_ORE_CONFIG     = new OreConfig(Resource.Tin.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 6);
    public static final OreConfig NETHER_URANIUM_ORE_CONFIG = new OreConfig(Resource.Uranium.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 4);

    /* * * * * * * * * * * * * * * Gravel Ore * * *  * * * * * * * * * * */
    public static final OreConfig GRAVEL_COAL_ORE_CONFIG     = new OreConfig(Resource.Coal.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 118, 24);
    public static final OreConfig GRAVEL_COPPER_ORE_CONFIG   = new OreConfig(Resource.Copper.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 118, 24);
    public static final OreConfig GRAVEL_DIAMOND_ORE_CONFIG  = new OreConfig(Resource.Diamond.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 118, 24);
    public static final OreConfig GRAVEL_EMERALD_ORE_CONFIG  = new OreConfig(Resource.Emerald.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 118, 24);
    public static final OreConfig GRAVEL_IRON_ORE_CONFIG     = new OreConfig(Resource.Iron.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 118, 24);
    public static final OreConfig GRAVEL_LAPIS_ORE_CONFIG    = new OreConfig(Resource.Lapis.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 118, 24);
    public static final OreConfig GRAVEL_REDSTONE_ORE_CONFIG = new OreConfig(Resource.RedStone.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 118, 24);

    public static final OreConfig GRAVEL_BAUXITE_ORE_CONFIG = new OreConfig(Resource.Aluminium.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 242, 24);
    public static final OreConfig GRAVEL_LEAD_ORE_CONFIG    = new OreConfig(Resource.Lead.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 242, 24);
    public static final OreConfig GRAVEL_NICKEL_ORE_CONFIG  = new OreConfig(Resource.Nickel.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 242, 24);
    public static final OreConfig GRAVEL_SILVER_ORE_CONFIG  = new OreConfig(Resource.Silver.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 242, 24);
    public static final OreConfig GRAVEL_TIN_ORE_CONFIG     = new OreConfig(Resource.Tin.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 242, 24);
    public static final OreConfig GRAVEL_URANIUM_ORE_CONFIG = new OreConfig(Resource.Uranium.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 242, 24);

    /* * * * * * * * * * * * * * * Config Builder * * *  * * * * * * * * * * */
    private static final JsonConfigBuilder ALL_GRAVEL_ORE_CONFIG     = new JsonConfigBuilder("janoeo", "foundation", "all", "gravel");
    private static final JsonConfigBuilder OVERWORLD_ORE_TINY_CONFIG = new JsonConfigBuilder("janoeo", "foundation", "overworld", "tiny");
    private static final JsonConfigBuilder OVERWORLD_ORE_CONFIG      = new JsonConfigBuilder("janoeo", "foundation", "overworld");
    private static final JsonConfigBuilder NETHER_ORE_CONFIG         = new JsonConfigBuilder("janoeo", "foundation", "nether");

    public static void init() throws IOException {
        ALL_GRAVEL_ORE_CONFIG.add(GRAVEL_COAL_ORE_CONFIG).add(GRAVEL_COPPER_ORE_CONFIG).add(GRAVEL_DIAMOND_ORE_CONFIG).add(GRAVEL_EMERALD_ORE_CONFIG)
                .add(GRAVEL_IRON_ORE_CONFIG).add(GRAVEL_LAPIS_ORE_CONFIG).add(GRAVEL_REDSTONE_ORE_CONFIG).add(GRAVEL_BAUXITE_ORE_CONFIG)
                .add(GRAVEL_LEAD_ORE_CONFIG)
                .add(GRAVEL_NICKEL_ORE_CONFIG).add(GRAVEL_SILVER_ORE_CONFIG).add(GRAVEL_TIN_ORE_CONFIG).add(GRAVEL_URANIUM_ORE_CONFIG).build();

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
