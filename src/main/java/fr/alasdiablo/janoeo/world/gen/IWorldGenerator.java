package fr.alasdiablo.janoeo.world.gen;

import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;

import java.util.Map;

public interface IWorldGenerator {
    void startWorldGeneration(Biome biome);
}
