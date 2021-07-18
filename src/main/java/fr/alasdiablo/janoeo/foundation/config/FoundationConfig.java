package fr.alasdiablo.janoeo.foundation.config;

import fr.alasdiablo.diolib.config.json.JsonConfigBuilder;
import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class FoundationConfig {

    private static final JsonConfigBuilder OVERWORLD_ORE_CONFIG = new JsonConfigBuilder("janoeo", "foundation", "overworld");

    public static final OreConfig TINY_LAPIS_ORE_CONFIG = new OreConfig(Registries.TINY_LAPIS_ORE, "tag", new ResourceLocation("base_stone_overworld"), 7, 16, 16, true);

    public static void init() throws IOException {
        // Features.ORE_LAPIS;
        OVERWORLD_ORE_CONFIG.add(TINY_LAPIS_ORE_CONFIG).build();
    }
}
