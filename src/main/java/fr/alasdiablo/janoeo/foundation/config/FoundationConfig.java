package fr.alasdiablo.janoeo.foundation.config;

import com.google.common.collect.ImmutableMap;
import fr.alasdiablo.diolib.api.config.JsonConfigBuilder;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import fr.alasdiablo.janoeo.foundation.resource.ResourceType;

import java.io.IOException;
import java.util.Map;

public class FoundationConfig {

    /* * * * * * * * * * * * * * * Ore * * *  * * * * * * * * * * */
    public static final OreConfig BAUXITE_ORE_CONFIG = new OreConfig(Resource.Aluminium.getName(ResourceType.StoneOre), true).placementUniform(
            10, 8, 96, 6);
    public static final OreConfig LEAD_ORE_CONFIG    = new OreConfig(Resource.Lead.getName(ResourceType.StoneOre), true).placementUniform(
            6, -16, 48, 6);
    public static final OreConfig NICKEL_ORE_CONFIG  = new OreConfig(Resource.Nickel.getName(ResourceType.StoneOre), true).placementUniform(
            6, -24, 32, 4);
    public static final OreConfig SILVER_ORE_CONFIG  = new OreConfig(Resource.Silver.getName(ResourceType.StoneOre), true).placementUniform(
            6, -56, 28, 6);
    public static final OreConfig TIN_ORE_CONFIG     = new OreConfig(Resource.Tin.getName(ResourceType.StoneOre), true).placementUniform(
            10, 0, 96, 8);
    public static final OreConfig URANIUM_ORE_CONFIG = new OreConfig(Resource.Uranium.getName(ResourceType.StoneOre), true).placementUniform(
            6, -56, 28, 6);

    /* * * * * * * * * * * * * * * Tiny Ore * * *  * * * * * * * * * * */
    public static final OreConfig TINY_COAL_ORE_CONFIG     = new OreConfig(Resource.Coal.getName(ResourceType.TinyStoneOre), true).placementUniform(
            17, -36, 180, 8);
    public static final OreConfig TINY_COPPER_ORE_CONFIG   = new OreConfig(Resource.Copper.getName(ResourceType.TinyStoneOre), true).placementUniform(
            10, -16, 112, 6);
    public static final OreConfig TINY_DIAMOND_ORE_CONFIG  = new OreConfig(Resource.Diamond.getName(ResourceType.TinyStoneOre), true).placementUniform(
            8, -62, 16, 2);
    public static final OreConfig TINY_EMERALD_ORE_CONFIG  = new OreConfig(Resource.Emerald.getName(ResourceType.TinyStoneOre), true).placementUniform(
            2, 24, 31, 2);
    public static final OreConfig TINY_GOLD_ORE_CONFIG     = new OreConfig(Resource.Gold.getName(ResourceType.TinyStoneOre), true).placementUniform(
            9, -62, 32, 3);
    public static final OreConfig TINY_IRON_ORE_CONFIG     = new OreConfig(Resource.Iron.getName(ResourceType.TinyStoneOre), true).placementUniform(
            9, -24, 180, 6);
    public static final OreConfig TINY_LAPIS_ORE_CONFIG    = new OreConfig(Resource.Lapis.getName(ResourceType.TinyStoneOre), true).placementTriangle(
            7, -32, 32, 4);
    public static final OreConfig TINY_REDSTONE_ORE_CONFIG = new OreConfig(Resource.RedStone.getName(ResourceType.TinyStoneOre), true).placementUniform(
            8, -62, 16, 5);

    public static final OreConfig TINY_BAUXITE_ORE_CONFIG = new OreConfig(Resource.Aluminium.getName(ResourceType.TinyStoneOre), true).placementUniform(
            10, 8, 96, 6);
    public static final OreConfig TINY_LEAD_ORE_CONFIG    = new OreConfig(Resource.Lead.getName(ResourceType.TinyStoneOre), true).placementUniform(
            6, -16, 48, 5);
    public static final OreConfig TINY_NICKEL_ORE_CONFIG  = new OreConfig(Resource.Nickel.getName(ResourceType.TinyStoneOre), true).placementUniform(
            6, -24, 32, 5);
    public static final OreConfig TINY_SILVER_ORE_CONFIG  = new OreConfig(Resource.Silver.getName(ResourceType.TinyStoneOre), true).placementUniform(
            6, -56, 28, 4);
    public static final OreConfig TINY_TIN_ORE_CONFIG     = new OreConfig(Resource.Tin.getName(ResourceType.TinyStoneOre), true).placementUniform(
            10, 0, 96, 6);
    public static final OreConfig TINY_URANIUM_ORE_CONFIG = new OreConfig(Resource.Uranium.getName(ResourceType.TinyStoneOre), true).placementUniform(
            6, -56, 28, 4);

    /* * * * * * * * * * * * * * * Nether Ore * * *  * * * * * * * * * * */
    public static final OreConfig NETHER_COAL_ORE_CONFIG     = new OreConfig(Resource.Coal.getName(ResourceType.NetherOre), true).placementUniform(
            8, 4, 120, 6);
    public static final OreConfig NETHER_COPPER_ORE_CONFIG   = new OreConfig(Resource.Copper.getName(ResourceType.NetherOre), true).placementUniform(
            8, 4, 120, 5);
    public static final OreConfig NETHER_DIAMOND_ORE_CONFIG  = new OreConfig(Resource.Diamond.getName(ResourceType.NetherOre), true).placementUniform(
            4, 4, 120, 1);
    public static final OreConfig NETHER_EMERALD_ORE_CONFIG  = new OreConfig(Resource.Emerald.getName(ResourceType.NetherOre), true).placementUniform(
            4, 4, 120, 1);
    public static final OreConfig NETHER_IRON_ORE_CONFIG     = new OreConfig(Resource.Iron.getName(ResourceType.NetherOre), true).placementUniform(
            8, 4, 120, 5);
    public static final OreConfig NETHER_LAPIS_ORE_CONFIG    = new OreConfig(Resource.Lapis.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 3);
    public static final OreConfig NETHER_REDSTONE_ORE_CONFIG = new OreConfig(Resource.RedStone.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 3);

    public static final OreConfig NETHER_BAUXITE_ORE_CONFIG = new OreConfig(Resource.Aluminium.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 5);
    public static final OreConfig NETHER_LEAD_ORE_CONFIG    = new OreConfig(Resource.Lead.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 4);
    public static final OreConfig NETHER_NICKEL_ORE_CONFIG  = new OreConfig(Resource.Nickel.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 4);
    public static final OreConfig NETHER_SILVER_ORE_CONFIG  = new OreConfig(Resource.Silver.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 2);
    public static final OreConfig NETHER_TIN_ORE_CONFIG     = new OreConfig(Resource.Tin.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 5);
    public static final OreConfig NETHER_URANIUM_ORE_CONFIG = new OreConfig(Resource.Uranium.getName(ResourceType.NetherOre), true).placementUniform(
            6, 4, 120, 2);

    /* * * * * * * * * * * * * * * Gravel Ore * * *  * * * * * * * * * * */
    public static final OreConfig GRAVEL_COAL_ORE_CONFIG     = new OreConfig(Resource.Coal.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 118, 24);
    public static final OreConfig GRAVEL_COPPER_ORE_CONFIG   = new OreConfig(Resource.Copper.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 118, 24);
    public static final OreConfig GRAVEL_DIAMOND_ORE_CONFIG  = new OreConfig(Resource.Diamond.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 118, 24);
    public static final OreConfig GRAVEL_EMERALD_ORE_CONFIG  = new OreConfig(Resource.Emerald.getName(ResourceType.GravelOre), true).placementUniform(
            4, 2, 118, 24);
    public static final OreConfig GRAVEL_GOLD_ORE_CONFIG     = new OreConfig(Resource.Gold.getName(ResourceType.GravelOre), true).placementUniform(
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


    /* * * * * * * * * * * * * * * End Ore * * *  * * * * * * * * * * */
    public static final OreConfig END_COAL_ORE_CONFIG     = new OreConfig(Resource.Coal.getName(ResourceType.EndOre), true).placementUniform(
            4, 2, 64, 8);
    public static final OreConfig END_COPPER_ORE_CONFIG   = new OreConfig(Resource.Copper.getName(ResourceType.EndOre), true).placementUniform(
            4, 2, 64, 8);
    public static final OreConfig END_DIAMOND_ORE_CONFIG  = new OreConfig(Resource.Diamond.getName(ResourceType.EndOre), true).placementUniform(
            4, 2, 64, 24);
    public static final OreConfig END_EMERALD_ORE_CONFIG  = new OreConfig(Resource.Emerald.getName(ResourceType.EndOre), true).placementUniform(
            2, 2, 64, 24);
    public static final OreConfig END_GOLD_ORE_CONFIG     = new OreConfig(Resource.Gold.getName(ResourceType.EndOre), true).placementUniform(
            4, 2, 64, 18);
    public static final OreConfig END_IRON_ORE_CONFIG     = new OreConfig(Resource.Iron.getName(ResourceType.EndOre), true).placementUniform(
            4, 2, 64, 16);
    public static final OreConfig END_LAPIS_ORE_CONFIG    = new OreConfig(Resource.Lapis.getName(ResourceType.EndOre), true).placementUniform(
            4, 2, 64, 18);
    public static final OreConfig END_REDSTONE_ORE_CONFIG = new OreConfig(Resource.RedStone.getName(ResourceType.EndOre), true).placementUniform(
            4, 2, 64, 16);

    public static final OreConfig END_BAUXITE_ORE_CONFIG = new OreConfig(Resource.Aluminium.getName(ResourceType.EndOre), true).placementUniform(
            4, 2, 64, 8);
    public static final OreConfig END_LEAD_ORE_CONFIG    = new OreConfig(Resource.Lead.getName(ResourceType.EndOre), true).placementUniform(
            4, 2, 64, 8);
    public static final OreConfig END_NICKEL_ORE_CONFIG  = new OreConfig(Resource.Nickel.getName(ResourceType.EndOre), true).placementUniform(
            4, 2, 64, 8);
    public static final OreConfig END_SILVER_ORE_CONFIG  = new OreConfig(Resource.Silver.getName(ResourceType.EndOre), true).placementUniform(
            4, 2, 64, 18);
    public static final OreConfig END_TIN_ORE_CONFIG     = new OreConfig(Resource.Tin.getName(ResourceType.EndOre), true).placementUniform(
            4, 2, 64, 8);
    public static final OreConfig END_URANIUM_ORE_CONFIG = new OreConfig(Resource.Uranium.getName(ResourceType.EndOre), true).placementUniform(
            4, 2, 64, 16);

    /* * * * * * * * * * * * * * * Config Builder * * *  * * * * * * * * * * */
    private static final JsonConfigBuilder ALL_GRAVEL_ORE_CONFIG_BUILDER     = new JsonConfigBuilder("janoeo", "foundation", "all", "gravel");
    private static final JsonConfigBuilder OVERWORLD_ORE_TINY_CONFIG_BUILDER = new JsonConfigBuilder("janoeo", "foundation", "overworld", "tiny");
    private static final JsonConfigBuilder OVERWORLD_ORE_CONFIG_BUILDER      = new JsonConfigBuilder("janoeo", "foundation", "overworld");
    private static final JsonConfigBuilder NETHER_ORE_CONFIG_BUILDER         = new JsonConfigBuilder("janoeo", "foundation", "nether");
    private static final JsonConfigBuilder END_ORE_CONFIG_BUILDER            = new JsonConfigBuilder("janoeo", "foundation", "end");

    /* * * * * * * * * * * * * * * Config Map * * *  * * * * * * * * * * */
    public static final Map<Resource, OreConfig> ALL_GRAVEL_ORE_CONFIG;
    public static final Map<Resource, OreConfig> OVERWORLD_ORE_TINY_CONFIG;
    public static final Map<Resource, OreConfig> OVERWORLD_ORE_CONFIG;
    public static final Map<Resource, OreConfig> NETHER_ORE_CONFIG;
    public static final Map<Resource, OreConfig> END_ORE_CONFIG;

    static {
        try {
            ALL_GRAVEL_ORE_CONFIG_BUILDER.add(GRAVEL_COAL_ORE_CONFIG).add(GRAVEL_COPPER_ORE_CONFIG).add(GRAVEL_DIAMOND_ORE_CONFIG)
                    .add(GRAVEL_EMERALD_ORE_CONFIG).add(GRAVEL_GOLD_ORE_CONFIG).add(GRAVEL_IRON_ORE_CONFIG).add(GRAVEL_LAPIS_ORE_CONFIG)
                    .add(GRAVEL_REDSTONE_ORE_CONFIG)
                    .add(GRAVEL_BAUXITE_ORE_CONFIG).add(GRAVEL_LEAD_ORE_CONFIG).add(GRAVEL_NICKEL_ORE_CONFIG).add(GRAVEL_SILVER_ORE_CONFIG)
                    .add(GRAVEL_TIN_ORE_CONFIG).add(GRAVEL_URANIUM_ORE_CONFIG).build();

            OVERWORLD_ORE_TINY_CONFIG_BUILDER.add(TINY_COAL_ORE_CONFIG).add(TINY_COPPER_ORE_CONFIG).add(TINY_DIAMOND_ORE_CONFIG).add(TINY_EMERALD_ORE_CONFIG)
                    .add(TINY_GOLD_ORE_CONFIG).add(TINY_IRON_ORE_CONFIG).add(TINY_LAPIS_ORE_CONFIG).add(TINY_REDSTONE_ORE_CONFIG)
                    .add(TINY_BAUXITE_ORE_CONFIG).add(TINY_LEAD_ORE_CONFIG).add(TINY_NICKEL_ORE_CONFIG).add(TINY_SILVER_ORE_CONFIG).add(TINY_TIN_ORE_CONFIG)
                    .add(TINY_URANIUM_ORE_CONFIG).build();

            OVERWORLD_ORE_CONFIG_BUILDER.add(BAUXITE_ORE_CONFIG).add(LEAD_ORE_CONFIG).add(NICKEL_ORE_CONFIG).add(SILVER_ORE_CONFIG).add(TIN_ORE_CONFIG)
                    .add(URANIUM_ORE_CONFIG).build();

            NETHER_ORE_CONFIG_BUILDER.add(NETHER_COAL_ORE_CONFIG).add(NETHER_COPPER_ORE_CONFIG).add(NETHER_DIAMOND_ORE_CONFIG).add(NETHER_EMERALD_ORE_CONFIG)
                    .add(NETHER_IRON_ORE_CONFIG).add(NETHER_LAPIS_ORE_CONFIG).add(NETHER_REDSTONE_ORE_CONFIG).add(NETHER_BAUXITE_ORE_CONFIG)
                    .add(NETHER_LEAD_ORE_CONFIG).add(NETHER_NICKEL_ORE_CONFIG).add(NETHER_SILVER_ORE_CONFIG).add(NETHER_TIN_ORE_CONFIG)
                    .add(NETHER_URANIUM_ORE_CONFIG).build();

            END_ORE_CONFIG_BUILDER.add(END_COAL_ORE_CONFIG).add(END_COPPER_ORE_CONFIG).add(END_DIAMOND_ORE_CONFIG)
                    .add(END_EMERALD_ORE_CONFIG).add(END_GOLD_ORE_CONFIG).add(END_IRON_ORE_CONFIG).add(END_LAPIS_ORE_CONFIG)
                    .add(END_REDSTONE_ORE_CONFIG)
                    .add(END_BAUXITE_ORE_CONFIG).add(END_LEAD_ORE_CONFIG).add(END_NICKEL_ORE_CONFIG).add(END_SILVER_ORE_CONFIG)
                    .add(END_TIN_ORE_CONFIG).add(END_URANIUM_ORE_CONFIG).build();
        } catch (IOException e) {
            Foundation.logger.error("Unable to load config files");
        }

        ALL_GRAVEL_ORE_CONFIG = new ImmutableMap.Builder<Resource, OreConfig>()
                .put(Resource.Coal, GRAVEL_COAL_ORE_CONFIG).put(Resource.Copper, GRAVEL_COPPER_ORE_CONFIG).put(Resource.Diamond, GRAVEL_DIAMOND_ORE_CONFIG)
                .put(Resource.Emerald, GRAVEL_EMERALD_ORE_CONFIG).put(Resource.Gold, GRAVEL_GOLD_ORE_CONFIG).put(Resource.Iron, GRAVEL_IRON_ORE_CONFIG)
                .put(Resource.Lapis, GRAVEL_LAPIS_ORE_CONFIG).put(Resource.RedStone, GRAVEL_REDSTONE_ORE_CONFIG)
                .put(Resource.Aluminium, GRAVEL_BAUXITE_ORE_CONFIG).put(Resource.Lead, GRAVEL_LEAD_ORE_CONFIG).put(Resource.Nickel, GRAVEL_NICKEL_ORE_CONFIG)
                .put(Resource.Silver, GRAVEL_SILVER_ORE_CONFIG).put(Resource.Tin, GRAVEL_TIN_ORE_CONFIG).put(Resource.Uranium, GRAVEL_URANIUM_ORE_CONFIG)
                .build();

        OVERWORLD_ORE_TINY_CONFIG = new ImmutableMap.Builder<Resource, OreConfig>()
                .put(Resource.Coal, TINY_COAL_ORE_CONFIG).put(Resource.Copper, TINY_COPPER_ORE_CONFIG).put(Resource.Diamond, TINY_DIAMOND_ORE_CONFIG)
                .put(Resource.Emerald, TINY_EMERALD_ORE_CONFIG).put(Resource.Gold, TINY_GOLD_ORE_CONFIG).put(Resource.Iron, TINY_IRON_ORE_CONFIG)
                .put(Resource.Lapis, TINY_LAPIS_ORE_CONFIG).put(Resource.RedStone, TINY_REDSTONE_ORE_CONFIG).put(Resource.Aluminium, TINY_BAUXITE_ORE_CONFIG)
                .put(Resource.Lead, TINY_LEAD_ORE_CONFIG).put(Resource.Nickel, TINY_NICKEL_ORE_CONFIG).put(Resource.Silver, TINY_SILVER_ORE_CONFIG)
                .put(Resource.Tin, TINY_TIN_ORE_CONFIG).put(Resource.Uranium, TINY_URANIUM_ORE_CONFIG).build();

        OVERWORLD_ORE_CONFIG = new ImmutableMap.Builder<Resource, OreConfig>()
                .put(Resource.Aluminium, BAUXITE_ORE_CONFIG).put(Resource.Lead, LEAD_ORE_CONFIG).put(Resource.Nickel, NICKEL_ORE_CONFIG)
                .put(Resource.Silver, SILVER_ORE_CONFIG).put(Resource.Tin, TIN_ORE_CONFIG).put(Resource.Uranium, URANIUM_ORE_CONFIG).build();

        NETHER_ORE_CONFIG = new ImmutableMap.Builder<Resource, OreConfig>()
                .put(Resource.Coal, NETHER_COAL_ORE_CONFIG).put(Resource.Copper, NETHER_COPPER_ORE_CONFIG).put(Resource.Diamond, NETHER_DIAMOND_ORE_CONFIG)
                .put(Resource.Emerald, NETHER_EMERALD_ORE_CONFIG).put(Resource.Iron, NETHER_IRON_ORE_CONFIG).put(Resource.Lapis, NETHER_LAPIS_ORE_CONFIG)
                .put(Resource.RedStone, NETHER_REDSTONE_ORE_CONFIG).put(Resource.Aluminium, NETHER_BAUXITE_ORE_CONFIG)
                .put(Resource.Lead, NETHER_LEAD_ORE_CONFIG).put(Resource.Nickel, NETHER_NICKEL_ORE_CONFIG).put(Resource.Silver, NETHER_SILVER_ORE_CONFIG)
                .put(Resource.Tin, NETHER_TIN_ORE_CONFIG).put(Resource.Uranium, NETHER_URANIUM_ORE_CONFIG).build();

        END_ORE_CONFIG = new ImmutableMap.Builder<Resource, OreConfig>()
                .put(Resource.Coal, END_COAL_ORE_CONFIG).put(Resource.Copper, END_COPPER_ORE_CONFIG).put(Resource.Diamond, END_DIAMOND_ORE_CONFIG)
                .put(Resource.Emerald, END_EMERALD_ORE_CONFIG).put(Resource.Gold, END_GOLD_ORE_CONFIG).put(Resource.Iron, END_IRON_ORE_CONFIG)
                .put(Resource.Lapis, END_LAPIS_ORE_CONFIG).put(Resource.RedStone, END_REDSTONE_ORE_CONFIG)
                .put(Resource.Aluminium, END_BAUXITE_ORE_CONFIG).put(Resource.Lead, END_LEAD_ORE_CONFIG).put(Resource.Nickel, END_NICKEL_ORE_CONFIG)
                .put(Resource.Silver, END_SILVER_ORE_CONFIG).put(Resource.Tin, END_TIN_ORE_CONFIG).put(Resource.Uranium, END_URANIUM_ORE_CONFIG)
                .build();
    }

    public static void init() {}
}
