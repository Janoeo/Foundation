package fr.alasdiablo.janoeo.world.gen;

import net.minecraft.world.biome.Biome;

public interface IWorldGenerator {
    void startWorldGeneration(Biome biome);
}
