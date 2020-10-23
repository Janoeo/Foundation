package fr.alasdiablo.janoeo.world;

import com.google.common.collect.Lists;
import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.world.gen.*;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class OreGenUtils {

    private static final IWorldGenerator OVERWORLD_GENERATOR = new OverworldOreGenerator();
    private static final IWorldGenerator NETHER_GENERATOR = new NetherOreGenerator();
    private static final IWorldGenerator END_GENERATOR = new EndOreGenerator();
    private static final IWorldGenerator OVERWORLD_GRAVEL_GENERATOR = new GravelOreGenerator.Overworld();
    private static final IWorldGenerator OCEAN_GRAVEL_GENERATOR = new GravelOreGenerator.Ocean();
    private static final IWorldGenerator NETHER_GRAVEL_GENERATOR = new GravelOreGenerator.Nether();
    private static final IWorldGenerator BASALT_GENERATOR = new BasaltOreGenerator();

    public static void setupOres() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            switch (biome.getCategory()) {
                case NETHER:
                    NETHER_GRAVEL_GENERATOR.startWorldGeneration(biome);
                    NETHER_GENERATOR.startWorldGeneration(biome);
                    BASALT_GENERATOR.startWorldGeneration(biome);
                    break;
                case THEEND:
                    END_GENERATOR.startWorldGeneration(biome);
                    break;
                case OCEAN:
                    OCEAN_GRAVEL_GENERATOR.startWorldGeneration(biome);
                    break;
                default:
                    OVERWORLD_GENERATOR.startWorldGeneration(biome);
                    OVERWORLD_GRAVEL_GENERATOR.startWorldGeneration(biome);
                    break;
            }
        }
    }

    public static void addFeatureToBiome(Biome biome,@Nullable ConfiguredFeature<?, ?> configuredFeature, GenerationStage.Decoration decoration) {
        if (configuredFeature == null) throw new NullPointerException("configuredFeature is null");

        List<List<Supplier<ConfiguredFeature<?, ?>>>> biomeFeatures = new ArrayList<>(biome.getGenerationSettings().getFeatures());
        while (biomeFeatures.size() <= decoration.ordinal()) {
            biomeFeatures.add(Lists.newArrayList());
        }
        List<Supplier<ConfiguredFeature<?, ?>>> features = new ArrayList<>(biomeFeatures.get(decoration.ordinal()));
        features.add(() -> configuredFeature);
        biomeFeatures.set(decoration.ordinal(), features);

        ObfuscationReflectionHelper.setPrivateValue(BiomeGenerationSettings.class, biome.getGenerationSettings(), biomeFeatures, "field_242484_f");
    }
}
