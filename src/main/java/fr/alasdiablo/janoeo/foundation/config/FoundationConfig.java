package fr.alasdiablo.janoeo.foundation.config;

import fr.alasdiablo.diolib.config.json.JsonConfigBuilder;
import fr.alasdiablo.janoeo.foundation.Registries;

import java.io.IOException;

public class FoundationConfig {

    private static final JsonConfigBuilder OVERWORLD_ORE_CONFIG = new JsonConfigBuilder("janoeo", "foundation", "overworld");

    public static final OreConfig TINY_COAL_ORE_CONFIG = new OreConfig(Registries.TINY_LAPIS_ORE, true).placementDepthAverage(7, 16, 16);
    public static final OreConfig TINY_COPPER_ORE_CONFIG = new OreConfig(Registries.TINY_LAPIS_ORE, true).placementDepthAverage(7, 16, 16);
    public static final OreConfig TINY_DIAMOND_ORE_CONFIG = new OreConfig(Registries.TINY_LAPIS_ORE, true).placementDepthAverage(7, 16, 16);
    // public static final OreConfig TINY_EMERALD_ORE_CONFIG = new OreConfig(Registries.TINY_LAPIS_ORE, true).placementDepthAverage(7, 16, 16);
    public static final OreConfig TINY_GOLD_ORE_CONFIG = new OreConfig(Registries.TINY_LAPIS_ORE, true).placementRange(9, 32, 2);
    public static final OreConfig TINY_GOLD_ORE_EXTRA_CONFIG = new OreConfig(Registries.TINY_LAPIS_ORE, true).placementTopSolidRange(9, 32, 32, 80, 20);
    public static final OreConfig TINY_IRON_ORE_CONFIG = new OreConfig(Registries.TINY_LAPIS_ORE, true).placementRange(9, 64, 20);
    public static final OreConfig TINY_LAPIS_ORE_CONFIG = new OreConfig(Registries.TINY_LAPIS_ORE, true).placementDepthAverage(7, 16, 16);
    public static final OreConfig TINY_REDSTONE_ORE_CONFIG = new OreConfig(Registries.TINY_LAPIS_ORE, true).placementDepthAverage(7, 16, 16);

    public static void init() throws IOException {
        // Features.ORE_LAPIS;
        OVERWORLD_ORE_CONFIG.add(TINY_LAPIS_ORE_CONFIG).build();
    }
}
