package fr.alasdiablo.janoeo.foundation.config;

import fr.alasdiablo.diolib.config.json.JsonConfigBuilder;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.config.json.OreConfig;

import java.io.IOException;

public class WorldGenConfig {

    public static final OreConfig COPPER_ORE = new OreConfig("copper_ore", 8, 12, 1, 63, true);
    public static final OreConfig TIN_ORE = new OreConfig("tin_ore", 8, 12, 1, 63, true);


    public static final OreConfig NETHER_IRON_ORE = new OreConfig("nether_copper_ore", 8, 12, 1, 127, true);
    public static final OreConfig NETHER_LAPIS_ORE = new OreConfig("nether_tin_ore", 8, 12, 1, 127, true);
    public static final OreConfig NETHER_COAL_ORE = new OreConfig("nether_copper_ore", 8, 12, 1, 127, true);
    public static final OreConfig NETHER_DIAMOND_ORE = new OreConfig("nether_tin_ore", 8, 12, 1, 127, true);
    public static final OreConfig NETHER_EMERALD_ORE = new OreConfig("nether_tin_ore", 8, 12, 1, 127, true);

    public static final OreConfig NETHER_COPPER_ORE = new OreConfig("nether_copper_ore", 8, 12, 1, 127, true);
    public static final OreConfig NETHER_TIN_ORE = new OreConfig("nether_tin_ore", 8, 12, 1, 127, true);

    public static void setup() {
        final JsonConfigBuilder configBuilder = new JsonConfigBuilder("janoeo-fondation");
        try {
            configBuilder.add(COPPER_ORE)
                    .add(TIN_ORE)
                    .build();
        } catch (IOException e) {
            Foundation.logger.error("Janoeo Fondation Config have failed to setup, this can cause issues if not resolve !");
            Foundation.logger.debug(e);
        }
    }
}
