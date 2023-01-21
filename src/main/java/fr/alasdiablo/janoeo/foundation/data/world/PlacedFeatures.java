package fr.alasdiablo.janoeo.foundation.data.world;

import com.google.common.collect.ImmutableMap;
import fr.alasdiablo.diolib.api.util.ResourceLocations;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.config.OreConfig;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import fr.alasdiablo.janoeo.foundation.resource.ResourceType;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;
import java.util.Map;

public class PlacedFeatures {
    public static Map<Resource, ResourceKey<PlacedFeature>> ALL_GRAVEL_ORE_PLACED;
    public static Map<Resource, ResourceKey<PlacedFeature>> OVERWORLD_ORE_TINY_PLACED;
    public static Map<Resource, ResourceKey<PlacedFeature>> OVERWORLD_ORE_PLACED;
    public static Map<Resource, ResourceKey<PlacedFeature>> NETHER_ORE_PLACED;

    static {
        var allGravelOrePlaced     = new ImmutableMap.Builder<Resource, ResourceKey<PlacedFeature>>();
        var overworldOreTinyPlaced = new ImmutableMap.Builder<Resource, ResourceKey<PlacedFeature>>();
        var overworldOrePlaced     = new ImmutableMap.Builder<Resource, ResourceKey<PlacedFeature>>();
        var netherOrePlaced        = new ImmutableMap.Builder<Resource, ResourceKey<PlacedFeature>>();

        for (Resource resource: Resource.values()) {
            if (resource.has(ResourceType.StoneOre) && resource.has(ResourceType.DeepSlateOre)) {
                var config = FoundationConfig.OVERWORLD_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    overworldOrePlaced.put(
                            resource,
                            ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocations.of(Foundation.MOD_ID, resource.getName(ResourceType.StoneOre)))
                    );
                }
            }
            if (resource.has(ResourceType.TinyStoneOre) && resource.has(ResourceType.TinyDeepSlateOre)) {
                var config = FoundationConfig.OVERWORLD_ORE_TINY_CONFIG.get(resource);
                if (config.isEnable()) {
                    overworldOreTinyPlaced.put(
                            resource,
                            ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocations.of(Foundation.MOD_ID, resource.getName(ResourceType.TinyStoneOre)))
                    );
                }
            }

            if (resource.has(ResourceType.GravelOre)) {
                var config = FoundationConfig.ALL_GRAVEL_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    allGravelOrePlaced.put(
                            resource,
                            ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocations.of(Foundation.MOD_ID, resource.getName(ResourceType.GravelOre)))
                    );
                }
            }

            if (resource.has(ResourceType.NetherOre)) {
                var config = FoundationConfig.NETHER_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    netherOrePlaced.put(
                            resource,
                            ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocations.of(Foundation.MOD_ID, resource.getName(ResourceType.NetherOre)))
                    );
                }
            }
        }

        ALL_GRAVEL_ORE_PLACED     = allGravelOrePlaced.build();
        OVERWORLD_ORE_TINY_PLACED = overworldOreTinyPlaced.build();
        OVERWORLD_ORE_PLACED      = overworldOrePlaced.build();
        NETHER_ORE_PLACED         = netherOrePlaced.build();
    }


    private static List<PlacementModifier> createPlacementModifier(@NotNull OreConfig config) {
        return switch (config.getPlacement()) {
            case "triangle" -> commonOrePlacement(
                config.getCount(),
                HeightRangePlacement.triangle(
                        VerticalAnchor.absolute(config.getBottom()),
                        VerticalAnchor.absolute(config.getTop())
                )
            );
            case "uniform" -> commonOrePlacement(
                config.getCount(),
                HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(config.getBottom()),
                    VerticalAnchor.absolute(config.getTop())
                )
            );
            default -> throw new IllegalStateException("Undefined placement type");
        };
    }

    private static @Unmodifiable List<PlacementModifier> orePlacement(PlacementModifier count, PlacementModifier heightRange) {
        return List.of(count, InSquarePlacement.spread(), heightRange, BiomeFilter.biome());
    }

    private static @Unmodifiable List<PlacementModifier> commonOrePlacement(int count, PlacementModifier heightRange) {
        return orePlacement(CountPlacement.of(count), heightRange);
    }

    public static void bootstrap(BootstapContext<PlacedFeature> bootstrap) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = bootstrap.lookup(Registries.CONFIGURED_FEATURE);

        for (Resource resource: Resource.values()) {
            if (resource.has(ResourceType.StoneOre) && resource.has(ResourceType.DeepSlateOre)) {
                var config = FoundationConfig.OVERWORLD_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    var configuredFeature = ConfiguredFeatures.OVERWORLD_ORE_FEATURE.get(resource);
                    var placedFeature = OVERWORLD_ORE_PLACED.get(resource);

                    bootstrap.register(placedFeature,
                       new PlacedFeature(
                           configuredFeatures.getOrThrow(configuredFeature),
                           createPlacementModifier(config)
                       )
                    );
                }
            }
            if (resource.has(ResourceType.TinyStoneOre) && resource.has(ResourceType.TinyDeepSlateOre)) {
                var config = FoundationConfig.OVERWORLD_ORE_TINY_CONFIG.get(resource);
                if (config.isEnable()) {
                    var configuredFeature = ConfiguredFeatures.OVERWORLD_ORE_TINY_FEATURE.get(resource);
                    var placedFeature = OVERWORLD_ORE_TINY_PLACED.get(resource);
                    bootstrap.register(placedFeature,
                       new PlacedFeature(
                           configuredFeatures.getOrThrow(configuredFeature),
                           createPlacementModifier(config)
                       )
                    );
                }
            }

            if (resource.has(ResourceType.GravelOre)) {
                var config = FoundationConfig.ALL_GRAVEL_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    var configuredFeature = ConfiguredFeatures.ALL_GRAVEL_ORE_FEATURE.get(resource);
                    var placedFeature = ALL_GRAVEL_ORE_PLACED.get(resource);
                    bootstrap.register(placedFeature,
                       new PlacedFeature(
                           configuredFeatures.getOrThrow(configuredFeature),
                           createPlacementModifier(config)
                       )
                    );
                }
            }

            if (resource.has(ResourceType.NetherOre)) {
                var config = FoundationConfig.NETHER_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    var configuredFeature = ConfiguredFeatures.NETHER_ORE_FEATURE.get(resource);
                    var placedFeature = NETHER_ORE_PLACED.get(resource);
                    bootstrap.register(placedFeature,
                       new PlacedFeature(
                           configuredFeatures.getOrThrow(configuredFeature),
                           createPlacementModifier(config)
                       )
                    );
                }
            }
        }
    }
}
