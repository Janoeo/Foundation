package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.janoeo.block.BasaltOresBlocks;
import fr.alasdiablo.janoeo.config.BasaltConfig;
import fr.alasdiablo.janoeo.config.FrequencyConfig;
import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.world.OreGenUtils;
import net.minecraft.block.Blocks;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;

public class BasaltOreGenerator implements IWorldGenerator {
    @Override
    public void startWorldGeneration(Map.Entry<RegistryKey<Biome>, Biome> biome) {
        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        BasaltConfig.Config basaltConfig = BasaltConfig.CONFIG;
        FrequencyConfig.Config frequencyConfig = FrequencyConfig.CONFIG;

//        if (globalConfig.BASALT_ORE_GEN.get()) ForgeRegistries.BIOMES.forEach(biome -> {
//
//            if (basaltConfig.COAL_BASALT_ORE.get()) {
//                OreGenUtils.addOreGenOnBiome(
//                        biome,
//                        CustomFillerBlockType.BASALT,
//                        BasaltOresBlocks.COAL_BASALT_ORE.getDefaultState(),
//                        frequencyConfig.COAL_BASALT_ORE_SIZE.get(),
//                        frequencyConfig.COAL_BASALT_ORE_COUNT.get(),
//                        frequencyConfig.COAL_BASALT_ORE_BOTTOM.get(),
//                        frequencyConfig.COAL_BASALT_ORE_TOP.get()
//                );
//            }
//
//            if (basaltConfig.DIAMOND_BASALT_ORE.get()) {
//                OreGenUtils.addOreGenOnBiome(
//                        biome,
//                        CustomFillerBlockType.BASALT,
//                        BasaltOresBlocks.DIAMOND_BASALT_ORE.getDefaultState(),
//                        frequencyConfig.DIAMOND_BASALT_ORE_SIZE.get(),
//                        frequencyConfig.DIAMOND_BASALT_ORE_COUNT.get(),
//                        frequencyConfig.DIAMOND_BASALT_ORE_BOTTOM.get(),
//                        frequencyConfig.DIAMOND_BASALT_ORE_TOP.get()
//                );
//            }
//
//            if (basaltConfig.EMERALD_BASALT_ORE.get()) {
//                OreGenUtils.addBlockGenOnBiome(
//                        biome,
//                        Blocks.field_235337_cO_.getDefaultState(),
//                        BasaltOresBlocks.EMERALD_BASALT_ORE.getDefaultState(),
//                        frequencyConfig.EMERALD_BASALT_ORE_COUNT.get(),
//                        frequencyConfig.EMERALD_BASALT_ORE_BOTTOM.get(),
//                        frequencyConfig.EMERALD_BASALT_ORE_TOP.get()
//                );
//            }
//
//            if (basaltConfig.GOLD_BASALT_ORE.get()) {
//                OreGenUtils.addOreGenOnBiome(
//                        biome,
//                        CustomFillerBlockType.BASALT,
//                        BasaltOresBlocks.GOLD_BASALT_ORE.getDefaultState(),
//                        frequencyConfig.GOLD_BASALT_ORE_SIZE.get(),
//                        frequencyConfig.GOLD_BASALT_ORE_COUNT.get(),
//                        frequencyConfig.GOLD_BASALT_ORE_BOTTOM.get(),
//                        frequencyConfig.GOLD_BASALT_ORE_TOP.get()
//                );
//            }
//
//            if (basaltConfig.IRON_BASALT_ORE.get()) {
//                OreGenUtils.addOreGenOnBiome(
//                        biome,
//                        CustomFillerBlockType.BASALT,
//                        BasaltOresBlocks.IRON_BASALT_ORE.getDefaultState(),
//                        frequencyConfig.IRON_BASALT_ORE_SIZE.get(),
//                        frequencyConfig.IRON_BASALT_ORE_COUNT.get(),
//                        frequencyConfig.IRON_BASALT_ORE_BOTTOM.get(),
//                        frequencyConfig.IRON_BASALT_ORE_TOP.get()
//                );
//            }
//
//            if (basaltConfig.LAPIS_BASALT_ORE.get()) {
//                OreGenUtils.addOreGenOnBiome(
//                        biome,
//                        CustomFillerBlockType.BASALT,
//                        BasaltOresBlocks.LAPIS_BASALT_ORE.getDefaultState(),
//                        frequencyConfig.LAPIS_BASALT_ORE_SIZE.get(),
//                        frequencyConfig.LAPIS_BASALT_ORE_COUNT.get(),
//                        frequencyConfig.LAPIS_BASALT_ORE_BOTTOM.get(),
//                        frequencyConfig.LAPIS_BASALT_ORE_TOP.get()
//                );
//            }
//
//            if (basaltConfig.REDSTONE_BASALT_ORE.get()) {
//                OreGenUtils.addOreGenOnBiome(
//                        biome,
//                        CustomFillerBlockType.BASALT,
//                        BasaltOresBlocks.REDSTONE_BASALT_ORE.getDefaultState(),
//                        frequencyConfig.REDSTONE_BASALT_ORE_SIZE.get(),
//                        frequencyConfig.REDSTONE_BASALT_ORE_COUNT.get(),
//                        frequencyConfig.REDSTONE_BASALT_ORE_BOTTOM.get(),
//                        frequencyConfig.REDSTONE_BASALT_ORE_TOP.get()
//                );
//            }
//        });
    }
}
