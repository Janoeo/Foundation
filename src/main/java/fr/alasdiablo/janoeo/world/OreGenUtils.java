package fr.alasdiablo.janoeo.world;

import com.google.common.collect.Lists;
import fr.alasdiablo.janoeo.world.gen.*;
import net.minecraft.block.BlockState;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Some part of this code is inspire by Applied Energistics 2
 */
public class OreGenUtils {

    private static final IWorldGenerator OVERWORLD_GENERATOR = new OverworldOreGenerator();
    private static final IWorldGenerator NETHER_GENERATOR = new NetherOreGenerator();
    private static final IWorldGenerator END_GENERATOR = new EndOreGenerator();
    private static final IWorldGenerator GRAVEL_GENERATOR = new GravelOreGenerator();
    private static final IWorldGenerator BASALT_GENERATOR = new BasaltOreGenerator();

    public static void setupOres() {

        for (Biome biome : ForgeRegistries.BIOMES) {
            if (!biome.getCategory().equals(Biome.Category.NETHER) && !biome.getCategory().equals(Biome.Category.THEEND)) {
                OVERWORLD_GENERATOR.startWorldGeneration(biome);
                GRAVEL_GENERATOR.startWorldGeneration(biome);
            }
            if (biome.getCategory().equals(Biome.Category.NETHER)) {
                GRAVEL_GENERATOR.startWorldGeneration(biome);
                NETHER_GENERATOR.startWorldGeneration(biome);
                BASALT_GENERATOR.startWorldGeneration(biome);
            }
            if (biome.getCategory().equals(Biome.Category.THEEND)) {
                END_GENERATOR.startWorldGeneration(biome);
            }
        }
    }

    public static void addFeatureToBiome(Biome biome, ConfiguredFeature<?, ?> configuredFeature) {
        System.out.println("Feature added ! " + configuredFeature.feature.getRegistryName().toString());

        GenerationStage.Decoration decoration = GenerationStage.Decoration.UNDERGROUND_ORES;

        List<List<Supplier<ConfiguredFeature<?, ?>>>> biomeFeatures = new ArrayList<>(biome.func_242440_e().func_242498_c());
        while (biomeFeatures.size() <= decoration.ordinal()) {
            biomeFeatures.add(Lists.newArrayList());
        }
        List<Supplier<ConfiguredFeature<?, ?>>> features = new ArrayList<>(biomeFeatures.get(decoration.ordinal()));
        features.add(() -> configuredFeature);
        biomeFeatures.set(decoration.ordinal(), features);

        ObfuscationReflectionHelper.setPrivateValue(BiomeGenerationSettings.class, biome.func_242440_e(), biomeFeatures, "field_242484_f");
    }
}
