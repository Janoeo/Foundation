package fr.alasdiablo.janoeo.foundation.world;

import fr.alasdiablo.diolib.world.IWorldGenerator;
import fr.alasdiablo.janoeo.foundation.world.gen.*;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Class use for handle the ore generation
 */
public class OreGenUtils {

    /**
     * Instance of the Overworld ore generator
     */
    private static final IWorldGenerator OVERWORLD_GENERATOR = new OverworldOreGenerator();
    /**
     * Instance of the Nether ore generator
     */
    private static final IWorldGenerator NETHER_GENERATOR = new NetherOreGenerator();
    /**
     * Instance of the The End ore generator
     */
    private static final IWorldGenerator END_GENERATOR = new EndOreGenerator();
    /**
     * Instance of the Overworld Gravel ore generator
     */
    private static final IWorldGenerator OVERWORLD_GRAVEL_GENERATOR = new GravelOreGenerator.Overworld();
    /**
     * Instance of the Ocean Gravel ore generator
     */
    private static final IWorldGenerator OCEAN_GRAVEL_GENERATOR = new GravelOreGenerator.Ocean();
    /**
     * Instance of the Nether Gravel ore generator
     */
    private static final IWorldGenerator NETHER_GRAVEL_GENERATOR = new GravelOreGenerator.Nether();
    /**
     * Instance of the Basalt ore generator
     */
    private static final IWorldGenerator BASALT_GENERATOR = new BasaltOreGenerator();

    /**
     * Initialized the ore generation
     */
    public static void initOreGen() {
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
}
