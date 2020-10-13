package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.config.GravelConfig;
import fr.alasdiablo.janoeo.block.GravelsOresBlocks;
import fr.alasdiablo.janoeo.world.OreGenUtils;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GravelOreGenerator implements IWorldGenerator {

    @Override
    public void startWorldGeneration(Map.Entry<RegistryKey<Biome>, Biome> biome) {
        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        GravelConfig.Config gravelConfig = GravelConfig.CONFIG;

//        final List<Biome> biomeList = Arrays.asList(
//                Biomes.OCEAN,
//                Biomes.FROZEN_OCEAN,
//                Biomes.LUKEWARM_OCEAN,
//                Biomes.WARM_OCEAN,
//                Biomes.COLD_OCEAN,
//                Biomes.DEEP_COLD_OCEAN,
//                Biomes.DEEP_FROZEN_OCEAN,
//                Biomes.DEEP_LUKEWARM_OCEAN,
//                Biomes.DEEP_OCEAN,
//                Biomes.DEEP_WARM_OCEAN,
//                Biomes.RIVER,
//                Biomes.FROZEN_RIVER
//        );
//
//
//        if (globalConfig.GRAVEL_ORE_GEN.get()) {
//
//            biomeList.forEach(biome -> {
//                if (gravelConfig.IRON_GRAVEL_ORE.get()) {
//                    OreGenUtils.addOreGenOnBiome(
//                            biome,
//                            CustomFillerBlockType.GRAVEL,
//                            GravelsOresBlocks.IRON_GRAVEL_ORE.getDefaultState(),
//                            8,
//                            40,
//                            1,
//                            64
//                    );
//                }
//
//                if (gravelConfig.GOLD_GRAVEL_ORE.get()) {
//                    OreGenUtils.addOreGenOnBiome(
//                            biome,
//                            CustomFillerBlockType.GRAVEL,
//                            GravelsOresBlocks.GOLD_GRAVEL_ORE.getDefaultState(),
//                            6,
//                            32,
//                            1,
//                            48
//                    );
//                }
//
//                if (gravelConfig.DIAMOND_GRAVEL_ORE.get()) {
//                    OreGenUtils.addOreGenOnBiome(
//                            biome,
//                            CustomFillerBlockType.GRAVEL,
//                            GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getDefaultState(),
//                            4,
//                            8,
//                            1,
//                            38
//                    );
//                }
//            });
//
//            ForgeRegistries.BIOMES.forEach(biome -> {
//
//                if (gravelConfig.IRON_GRAVEL_ORE.get()) {
//                    OreGenUtils.addOreGenOnBiome(
//                            biome,
//                            CustomFillerBlockType.GRAVEL,
//                            GravelsOresBlocks.IRON_GRAVEL_ORE.getDefaultState(),
//                            8,
//                            48,
//                            1,
//                            48
//                    );
//                }
//
//                if (gravelConfig.GOLD_GRAVEL_ORE.get()) {
//                    OreGenUtils.addOreGenOnBiome(
//                            biome,
//                            CustomFillerBlockType.GRAVEL,
//                            GravelsOresBlocks.GOLD_GRAVEL_ORE.getDefaultState(),
//                            6,
//                            40,
//                            1,
//                            28
//                    );
//                }
//
//                if (gravelConfig.DIAMOND_GRAVEL_ORE.get()) {
//                    OreGenUtils.addOreGenOnBiome(
//                            biome,
//                            CustomFillerBlockType.GRAVEL,
//                            GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getDefaultState(),
//                            4,
//                            32,
//                            1,
//                            18
//                    );
//                }
//            });
//        }
    }
}
