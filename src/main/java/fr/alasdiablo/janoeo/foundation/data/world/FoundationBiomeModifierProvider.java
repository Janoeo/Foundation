package fr.alasdiablo.janoeo.foundation.data.world;

import com.google.gson.JsonObject;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import fr.alasdiablo.janoeo.foundation.resource.ResourceType;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class FoundationBiomeModifierProvider implements DataProvider {
    private final String     modid;
    private final PackOutput output;

    public FoundationBiomeModifierProvider(PackOutput output) {
        this.modid = Foundation.MOD_ID;
        this.output   = output;
    }

    @Override
    public @NotNull CompletableFuture<?> run(@NotNull CachedOutput cache) {
        List<CompletableFuture<?>> output = new ArrayList<>();

        for (Resource resource: Resource.values()) {
            if (resource.has(ResourceType.StoneOre) && resource.has(ResourceType.DeepSlateOre)) {
                var config = FoundationConfig.OVERWORLD_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    JsonObject json = new JsonObject();
                    String     name = resource.getName(ResourceType.StoneOre);
                    json.addProperty("type", "forge:add_features");
                    json.addProperty("biomes", "#minecraft:is_overworld");
                    json.addProperty("step", "underground_ores");
                    json.addProperty("features", this.modid + ":" + name);
                    output.add(DataProvider.saveStable(cache, json,
                           this.output.getOutputFolder(PackOutput.Target.DATA_PACK)
                                   .resolve(modid)
                                   .resolve("forge")
                                   .resolve("biome_modifier")
                                   .resolve(name + ".json")
                    ));
                }
            }
            if (resource.has(ResourceType.TinyStoneOre) && resource.has(ResourceType.TinyDeepSlateOre)) {
                var config = FoundationConfig.OVERWORLD_ORE_TINY_CONFIG.get(resource);
                if (config.isEnable()) {
                    JsonObject json = new JsonObject();
                    String     name = resource.getName(ResourceType.TinyStoneOre);
                    json.addProperty("type", "forge:add_features");
                    json.addProperty("biomes", "#minecraft:is_overworld");
                    json.addProperty("step", "underground_ores");
                    json.addProperty("features", this.modid + ":" + name);
                    output.add(DataProvider.saveStable(cache, json,
                           this.output.getOutputFolder(PackOutput.Target.DATA_PACK)
                                   .resolve(modid)
                                   .resolve("forge")
                                   .resolve("biome_modifier")
                                   .resolve(name + ".json")
                    ));
                }
            }
            if (resource.has(ResourceType.GravelOre)) {
                var config = FoundationConfig.ALL_GRAVEL_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    JsonObject json = new JsonObject();
                    String     name = resource.getName(ResourceType.GravelOre);
                    json.addProperty("type", "forge:add_features");
                    json.addProperty("biomes", "#forge:has_gravel");
                    json.addProperty("step", "underground_ores");
                    json.addProperty("features", this.modid + ":" + name);
                    output.add(DataProvider.saveStable(cache, json,
                           this.output.getOutputFolder(PackOutput.Target.DATA_PACK)
                                   .resolve(modid)
                                   .resolve("forge")
                                   .resolve("biome_modifier")
                                   .resolve(name + ".json")
                    ));
                }
            }
            if (resource.has(ResourceType.NetherOre)) {
                var config = FoundationConfig.NETHER_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    JsonObject json = new JsonObject();
                    String     name = resource.getName(ResourceType.NetherOre);
                    json.addProperty("type", "forge:add_features");
                    json.addProperty("biomes", "#minecraft:is_nether");
                    json.addProperty("step", "underground_ores");
                    json.addProperty("features", this.modid + ":" + name);
                    output.add(DataProvider.saveStable(cache, json,
                           this.output.getOutputFolder(PackOutput.Target.DATA_PACK)
                                   .resolve(modid)
                                   .resolve("forge")
                                   .resolve("biome_modifier")
                                   .resolve(name + ".json")
                    ));
                }
            }

            if (resource.has(ResourceType.EndOre)) {
                var config = FoundationConfig.END_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    JsonObject json = new JsonObject();
                    String     name = resource.getName(ResourceType.EndOre);
                    json.addProperty("type", "forge:add_features");
                    json.addProperty("biomes", "#minecraft:is_end");
                    json.addProperty("step", "underground_ores");
                    json.addProperty("features", this.modid + ":" + name);
                    output.add(DataProvider.saveStable(cache, json,
                           this.output.getOutputFolder(PackOutput.Target.DATA_PACK)
                                   .resolve(modid)
                                   .resolve("forge")
                                   .resolve("biome_modifier")
                                   .resolve(name + ".json")
                    ));
                }
            }
        }
        return CompletableFuture.allOf(output.toArray(CompletableFuture[]::new));
    }

    @Override
    public @NotNull String getName() {
        return "Janoeo Foundation - Biome Modifier";
    }
}
