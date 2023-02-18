package fr.alasdiablo.janoeo.foundation.data.world;

import com.google.common.collect.ImmutableMap;
import fr.alasdiablo.diolib.api.util.ResourceLocations;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import fr.alasdiablo.janoeo.foundation.resource.ResourceType;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;
import java.util.Map;

public class ConfiguredFeatures {
    public static final Map<Resource, ResourceKey<ConfiguredFeature<?, ?>>> ALL_GRAVEL_ORE_FEATURE;
    public static final Map<Resource, ResourceKey<ConfiguredFeature<?, ?>>> OVERWORLD_ORE_TINY_FEATURE;
    public static final Map<Resource, ResourceKey<ConfiguredFeature<?, ?>>> OVERWORLD_ORE_FEATURE;
    public static final Map<Resource, ResourceKey<ConfiguredFeature<?, ?>>> NETHER_ORE_FEATURE;
    public static final Map<Resource, ResourceKey<ConfiguredFeature<?, ?>>> END_ORE_FEATURE;

    static {
        var allGravelOreFeature     = new ImmutableMap.Builder<Resource, ResourceKey<ConfiguredFeature<?, ?>>>();
        var overworldOreTinyFeature = new ImmutableMap.Builder<Resource, ResourceKey<ConfiguredFeature<?, ?>>>();
        var overworldOreFeature     = new ImmutableMap.Builder<Resource, ResourceKey<ConfiguredFeature<?, ?>>>();
        var netherOreFeature        = new ImmutableMap.Builder<Resource, ResourceKey<ConfiguredFeature<?, ?>>>();
        var endOreFeature           = new ImmutableMap.Builder<Resource, ResourceKey<ConfiguredFeature<?, ?>>>();

        for (Resource resource: Resource.values()) {
            if (resource.has(ResourceType.StoneOre) && resource.has(ResourceType.DeepSlateOre)) {
                var config = FoundationConfig.OVERWORLD_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    overworldOreFeature.put(
                            resource,
                            ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocations.of(Foundation.MOD_ID, resource.getName(ResourceType.StoneOre)))
                    );
                }
            }
            if (resource.has(ResourceType.TinyStoneOre) && resource.has(ResourceType.TinyDeepSlateOre)) {
                var config = FoundationConfig.OVERWORLD_ORE_TINY_CONFIG.get(resource);
                if (config.isEnable()) {
                    overworldOreTinyFeature.put(
                            resource,
                            ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocations.of(Foundation.MOD_ID, resource.getName(ResourceType.TinyStoneOre)))
                    );
                }
            }

            if (resource.has(ResourceType.GravelOre)) {
                var config = FoundationConfig.ALL_GRAVEL_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    allGravelOreFeature.put(
                            resource,
                            ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocations.of(Foundation.MOD_ID, resource.getName(ResourceType.GravelOre)))
                    );
                }
            }

            if (resource.has(ResourceType.NetherOre)) {
                var config = FoundationConfig.NETHER_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    netherOreFeature.put(
                            resource,
                            ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocations.of(Foundation.MOD_ID, resource.getName(ResourceType.NetherOre)))
                    );
                }
            }

            if (resource.has(ResourceType.EndOre)) {
                var config = FoundationConfig.END_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    endOreFeature.put(
                            resource,
                            ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocations.of(Foundation.MOD_ID, resource.getName(ResourceType.EndOre)))
                    );
                }
            }
        }

        ALL_GRAVEL_ORE_FEATURE     = allGravelOreFeature.build();
        OVERWORLD_ORE_TINY_FEATURE = overworldOreTinyFeature.build();
        OVERWORLD_ORE_FEATURE      = overworldOreFeature.build();
        NETHER_ORE_FEATURE         = netherOreFeature.build();
        END_ORE_FEATURE            = endOreFeature.build();
    }

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> bootstrap) {
        RuleTest STONE_ORE_REPLACEABLES = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest DEEPSLATE_ORE_REPLACEABLES = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest NETHER_ORE_REPLACEABLES = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest GRAVEL_ORE_REPLACEABLES = new BlockMatchTest(Blocks.GRAVEL);
        RuleTest END_ORE_REPLACEABLES = new BlockMatchTest(Blocks.END_STONE);

        for (Resource resource: Resource.values()) {
            if (resource.has(ResourceType.StoneOre) && resource.has(ResourceType.DeepSlateOre)) {
                var config = FoundationConfig.OVERWORLD_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    List<OreConfiguration.TargetBlockState> targets = List.of(
                            OreConfiguration.target(STONE_ORE_REPLACEABLES, FoundationBlocks.STONE_ORES.get(resource).get().defaultBlockState()),
                            OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_ORES.get(resource).get().defaultBlockState())
                    );

                    var configuredFeature = OVERWORLD_ORE_FEATURE.get(resource);

                    bootstrap.register(
                            configuredFeature, new ConfiguredFeature<>(
                                    Feature.ORE,
                                    new OreConfiguration(targets, config.getSize())
                            )
                    );
                }
            }
            if (resource.has(ResourceType.TinyStoneOre) && resource.has(ResourceType.TinyDeepSlateOre)) {
                var config = FoundationConfig.OVERWORLD_ORE_TINY_CONFIG.get(resource);
                if (config.isEnable()) {
                    List<OreConfiguration.TargetBlockState> targets = List.of(
                            OreConfiguration.target(
                                    STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_STONE_ORES.get(resource).get().defaultBlockState()),
                            OreConfiguration.target(
                                    DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.TINY_DEEPSLATE_ORES.get(resource).get().defaultBlockState())
                    );

                    var configuredFeature = OVERWORLD_ORE_TINY_FEATURE.get(resource);

                    bootstrap.register(
                            configuredFeature, new ConfiguredFeature<>(
                                    Feature.ORE,
                                    new OreConfiguration(targets, config.getSize())
                            )
                    );
                }
            }

            if (resource.has(ResourceType.GravelOre)) {
                var config = FoundationConfig.ALL_GRAVEL_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    List<OreConfiguration.TargetBlockState> targets = List.of(
                            OreConfiguration.target(GRAVEL_ORE_REPLACEABLES, FoundationBlocks.GRAVEL_ORES.get(resource).get().defaultBlockState())
                    );

                    var configuredFeature = ALL_GRAVEL_ORE_FEATURE.get(resource);

                    bootstrap.register(
                            configuredFeature, new ConfiguredFeature<>(
                                    Feature.ORE,
                                    new OreConfiguration(targets, config.getSize())
                            )
                    );
                }
            }

            if (resource.has(ResourceType.NetherOre)) {
                var config = FoundationConfig.NETHER_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    List<OreConfiguration.TargetBlockState> targets = List.of(
                            OreConfiguration.target(NETHER_ORE_REPLACEABLES, FoundationBlocks.NETHER_ORES.get(resource).get().defaultBlockState())
                    );

                    var configuredFeature = NETHER_ORE_FEATURE.get(resource);

                    bootstrap.register(
                            configuredFeature, new ConfiguredFeature<>(
                                    Feature.ORE,
                                    new OreConfiguration(targets, config.getSize())
                            )
                    );
                }
            }

            if (resource.has(ResourceType.EndOre)) {
                var config = FoundationConfig.END_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    List<OreConfiguration.TargetBlockState> targets = List.of(
                            OreConfiguration.target(END_ORE_REPLACEABLES, FoundationBlocks.END_ORES.get(resource).get().defaultBlockState())
                    );

                    var configuredFeature = END_ORE_FEATURE.get(resource);

                    bootstrap.register(
                            configuredFeature, new ConfiguredFeature<>(
                                    Feature.ORE,
                                    new OreConfiguration(targets, config.getSize())
                            )
                    );
                }
            }
        }
    }
}
