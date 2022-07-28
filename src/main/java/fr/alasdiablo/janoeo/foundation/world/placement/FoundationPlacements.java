package fr.alasdiablo.janoeo.foundation.world.placement;

import com.google.common.collect.ImmutableMap;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.config.OreConfig;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import fr.alasdiablo.janoeo.foundation.resource.ResourceType;
import fr.alasdiablo.janoeo.foundation.world.feature.FoundationFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;
import java.util.Map;

@SuppressWarnings("OptionalGetWithoutIsPresent")
public class FoundationPlacements {
    private static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Foundation.MOD_ID);

    public static final Map<Resource, RegistryObject<PlacedFeature>> ALL_GRAVEL_ORE_FEATURE;
    public static final Map<Resource, RegistryObject<PlacedFeature>> OVERWORLD_ORE_TINY_FEATURE;
    public static final Map<Resource, RegistryObject<PlacedFeature>> OVERWORLD_ORE_FEATURE;
    public static final Map<Resource, RegistryObject<PlacedFeature>> NETHER_ORE_FEATURE;

    private static PlacedFeature createPlacedFeature(@NotNull Holder<ConfiguredFeature<?, ?>> target, @NotNull OreConfig config) {
        return switch (config.getPlacement()) {
            case "triangle" -> new PlacedFeature(
                    target,
                    commonOrePlacement(
                            config.getCount(),
                            HeightRangePlacement.triangle(
                                    VerticalAnchor.absolute(config.getBottom()),
                                    VerticalAnchor.absolute(config.getTop()
                                    )
                            )
                    )
            );
            case "uniform" -> new PlacedFeature(
                    target,
                    commonOrePlacement(
                            config.getCount(),
                            HeightRangePlacement.uniform(
                                    VerticalAnchor.absolute(config.getBottom()),
                                    VerticalAnchor.absolute(config.getTop())
                            )
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

    static {
        var allGravelOreFeature = new ImmutableMap.Builder<Resource, RegistryObject<PlacedFeature>>();
        var overworldOreTinyFeature = new ImmutableMap.Builder<Resource, RegistryObject<PlacedFeature>>();
        var overworldOreFeature = new ImmutableMap.Builder<Resource, RegistryObject<PlacedFeature>>();
        var netherOreFeature = new ImmutableMap.Builder<Resource, RegistryObject<PlacedFeature>>();
        for (Resource resource: Resource.values()) {
            if (resource.has(ResourceType.StoneOre) && resource.has(ResourceType.DeepSlateOre)) {
                var config = FoundationConfig.OVERWORLD_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    overworldOreFeature.put(resource,
                        PLACED_FEATURES.register(
                            resource.getName(ResourceType.StoneOre),
                            () -> createPlacedFeature(
                                    FoundationFeatures.OVERWORLD_ORE_FEATURE.get(resource).getHolder().get(),
                                    config
                            )
                        )
                    );
                }
            }
            if (resource.has(ResourceType.TinyStoneOre) && resource.has(ResourceType.TinyDeepSlateOre)) {
                var config = FoundationConfig.OVERWORLD_ORE_TINY_CONFIG.get(resource);
                if (config.isEnable()) {
                    overworldOreTinyFeature.put(resource,
                        PLACED_FEATURES.register(
                            resource.getName(ResourceType.TinyStoneOre),
                            () -> createPlacedFeature(
                                    FoundationFeatures.OVERWORLD_ORE_TINY_FEATURE.get(resource).getHolder().get(),
                                    config
                            )
                        )
                    );
                }
            }

            if (resource.has(ResourceType.GravelOre)) {
                var config = FoundationConfig.ALL_GRAVEL_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    allGravelOreFeature.put(resource,
                        PLACED_FEATURES.register(
                            resource.getName(ResourceType.GravelOre),
                            () -> createPlacedFeature(
                                    FoundationFeatures.ALL_GRAVEL_ORE_FEATURE.get(resource).getHolder().get(),
                                    config
                            )
                        )
                    );
                }
            }

            if (resource.has(ResourceType.NetherOre)) {
                var config = FoundationConfig.NETHER_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    netherOreFeature.put(resource,
                        PLACED_FEATURES.register(
                            resource.getName(ResourceType.NetherOre),
                            () -> createPlacedFeature(
                                    FoundationFeatures.NETHER_ORE_FEATURE.get(resource).getHolder().get(),
                                    config
                            )
                        )
                    );
                }
            }
        }

        ALL_GRAVEL_ORE_FEATURE = allGravelOreFeature.build();
        OVERWORLD_ORE_TINY_FEATURE = overworldOreTinyFeature.build();
        OVERWORLD_ORE_FEATURE = overworldOreFeature.build();
        NETHER_ORE_FEATURE = netherOreFeature.build();
    }


    public static void init(IEventBus bus) {
        PLACED_FEATURES.register(bus);
    }
}
