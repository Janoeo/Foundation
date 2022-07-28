package fr.alasdiablo.janoeo.foundation.world.feature;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableMap;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import fr.alasdiablo.janoeo.foundation.resource.ResourceType;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class FoundationFeatures {
    private static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURE = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Foundation.MOD_ID);

    public static final Map<Resource, RegistryObject<ConfiguredFeature<?, ?>>> ALL_GRAVEL_ORE_FEATURE;
    public static final Map<Resource, RegistryObject<ConfiguredFeature<?, ?>>> OVERWORLD_ORE_TINY_FEATURE;
    public static final Map<Resource, RegistryObject<ConfiguredFeature<?, ?>>> OVERWORLD_ORE_FEATURE;
    public static final Map<Resource, RegistryObject<ConfiguredFeature<?, ?>>> NETHER_ORE_FEATURE;

    static {
        var allGravelOreFeature = new ImmutableMap.Builder<Resource, RegistryObject<ConfiguredFeature<?, ?>>>();
        var overworldOreTinyFeature = new ImmutableMap.Builder<Resource, RegistryObject<ConfiguredFeature<?, ?>>>();
        var overworldOreFeature = new ImmutableMap.Builder<Resource, RegistryObject<ConfiguredFeature<?, ?>>>();
        var netherOreFeature = new ImmutableMap.Builder<Resource, RegistryObject<ConfiguredFeature<?, ?>>>();
        for (Resource resource: Resource.values()) {
            if (resource.has(ResourceType.StoneOre) && resource.has(ResourceType.DeepSlateOre)) {
                var config = FoundationConfig.OVERWORLD_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    Supplier<List<OreConfiguration.TargetBlockState>> targets = Suppliers.memoize(() -> List.of(
                            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.STONE_ORES.get(resource).get().defaultBlockState()),
                            OreConfiguration.target(
                                    OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.DEEPSLATE_ORES.get(resource).get().defaultBlockState())
                    ));
                    overworldOreFeature.put(
                            resource,
                            CONFIGURED_FEATURE.register(
                                    resource.getName(ResourceType.StoneOre),
                                    () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(targets.get(), config.getSize()))
                            )
                    );
                }
            }
            if (resource.has(ResourceType.TinyStoneOre) && resource.has(ResourceType.TinyDeepSlateOre)) {
                var config = FoundationConfig.OVERWORLD_ORE_TINY_CONFIG.get(resource);
                if (config.isEnable()) {
                    Supplier<List<OreConfiguration.TargetBlockState>> targets = Suppliers.memoize(() -> List.of(
                            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, FoundationBlocks.TINY_STONE_ORES.get(resource).get().defaultBlockState()),
                            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, FoundationBlocks.TINY_DEEPSLATE_ORES.get(resource).get().defaultBlockState())
                    ));
                    overworldOreTinyFeature.put(
                            resource,
                            CONFIGURED_FEATURE.register(
                                    resource.getName(ResourceType.TinyStoneOre),
                                    () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(targets.get(), config.getSize()))
                            )
                    );
                }
            }

            if (resource.has(ResourceType.GravelOre)) {
                var config = FoundationConfig.ALL_GRAVEL_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    Supplier<List<OreConfiguration.TargetBlockState>> targets = Suppliers.memoize(() -> List.of(
                            OreConfiguration.target(new BlockMatchTest(Blocks.GRAVEL), FoundationBlocks.GRAVEL_ORES.get(resource).get().defaultBlockState())
                    ));
                    allGravelOreFeature.put(
                            resource,
                            CONFIGURED_FEATURE.register(
                                    resource.getName(ResourceType.GravelOre),
                                    () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(targets.get(), config.getSize()))
                            )
                    );
                }
            }

            if (resource.has(ResourceType.NetherOre)) {
                var config = FoundationConfig.NETHER_ORE_CONFIG.get(resource);
                if (config.isEnable()) {
                    Supplier<List<OreConfiguration.TargetBlockState>> targets = Suppliers.memoize(() -> List.of(
                            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, FoundationBlocks.NETHER_ORES.get(resource).get().defaultBlockState())
                    ));
                    allGravelOreFeature.put(
                            resource,
                            CONFIGURED_FEATURE.register(
                                    resource.getName(ResourceType.GravelOre),
                                    () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(targets.get(), config.getSize()))
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
        CONFIGURED_FEATURE.register(bus);
    }
}
