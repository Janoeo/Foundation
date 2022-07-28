package fr.alasdiablo.janoeo.foundation.data.world;

import com.google.gson.JsonObject;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import fr.alasdiablo.janoeo.foundation.resource.ResourceType;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class BiomeModifierProvider implements DataProvider {
    private final String modid;
    private final DataGenerator gen;
    public BiomeModifierProvider(DataGenerator gen) {
        this.modid = Foundation.MOD_ID;
        this.gen = gen;
    }

    @Override
    public void run(@NotNull CachedOutput cache) throws IOException {

        for (Resource resource: Resource.values()) {
            if (resource.has(ResourceType.StoneOre) && resource.has(ResourceType.DeepSlateOre)) {
                var config = FoundationConfig.OVERWORLD_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    JsonObject json = new JsonObject();
                    String name = resource.getName(ResourceType.StoneOre);
                    json.addProperty("type", "forge:add_features");
                    json.addProperty("biomes", "#minecraft:is_overworld");
                    json.addProperty("step", "underground_ores");
                    json.addProperty("features", this.modid + ":" + name);
                    DataProvider.saveStable(cache, json, this.gen.getOutputFolder().resolve("data/" + modid + "/forge/biome_modifier/" + name + ".json"));
                }
            }
            if (resource.has(ResourceType.TinyStoneOre) && resource.has(ResourceType.TinyDeepSlateOre)) {
                var config = FoundationConfig.OVERWORLD_ORE_TINY_CONFIG.get(resource);
                if (config.isEnable()) {
                    JsonObject json = new JsonObject();
                    String name = resource.getName(ResourceType.TinyStoneOre);
                    json.addProperty("type", "forge:add_features");
                    json.addProperty("biomes", "#minecraft:is_overworld");
                    json.addProperty("step", "underground_ores");
                    json.addProperty("features", this.modid + ":" + name);
                    DataProvider.saveStable(cache, json, this.gen.getOutputFolder().resolve("data/" + modid + "/forge/biome_modifier/" + name + ".json"));
                }
            }

            if (resource.has(ResourceType.GravelOre)) {
                var config = FoundationConfig.ALL_GRAVEL_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    JsonObject json = new JsonObject();
                    String name = resource.getName(ResourceType.GravelOre);
                    json.addProperty("type", "forge:add_features");
                    json.addProperty("biomes", "#minecraft:is_overworld");
                    json.addProperty("step", "underground_ores");
                    json.addProperty("features", this.modid + ":" + name);
                    DataProvider.saveStable(cache, json, this.gen.getOutputFolder().resolve("data/" + modid + "/forge/biome_modifier/" + name + ".json"));
                }
            }

            if (resource.has(ResourceType.NetherOre)) {
                var config = FoundationConfig.NETHER_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    JsonObject json = new JsonObject();
                    String name = resource.getName(ResourceType.NetherOre);
                    json.addProperty("type", "forge:add_features");
                    json.addProperty("biomes", "#minecraft:is_nether");
                    json.addProperty("step", "underground_ores");
                    json.addProperty("features", this.modid + ":" + name);
                    DataProvider.saveStable(cache, json, this.gen.getOutputFolder().resolve("data/" + modid + "/forge/biome_modifier/" + name + ".json"));
                }
            }
        }
    }

    @Override
    public @NotNull String getName() {
        return "Janoeo Foundation - Biome Modifier";
    }
}
