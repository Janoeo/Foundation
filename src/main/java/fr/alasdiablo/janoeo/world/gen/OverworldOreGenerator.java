package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.diolib.world.IWorldGenerator;
import fr.alasdiablo.diolib.world.WorldGenerationHelper;
import fr.alasdiablo.janoeo.Janoeo;
import fr.alasdiablo.janoeo.config.FrequencyConfig;
import fr.alasdiablo.janoeo.init.NetherOresBlocks;
import fr.alasdiablo.janoeo.init.OverworldDenseOresBlocks;
import fr.alasdiablo.janoeo.init.OverworldOresBlocks;
import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.config.OverworldConfig;
import net.minecraft.block.Block;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.Map;

/**
 * Overworld Ore Generator
 */
public class OverworldOreGenerator implements IWorldGenerator{

    /**
     * @param biome Biome which receives the ConfiguredFeature
     * @see fr.alasdiablo.diolib.world.IWorldGenerator
     */
    @Override
    public void startWorldGeneration(Biome biome) {
        final GlobalConfig.Config GLOBAL_CONFIG = GlobalConfig.CONFIG;
        final OverworldConfig.Config OVERWORLD_CONFIG = OverworldConfig.CONFIG;
        final FrequencyConfig.Config FREQUENCY_CONFIG = FrequencyConfig.CONFIG;

        Janoeo.logger.debug("JANOEO OVERWORLD CONFIG = " + OVERWORLD_CONFIG.Ores);

        if (GLOBAL_CONFIG.EXTRA_ORE_GEN.get()) {
            for (Map.Entry<String,  ForgeConfigSpec.BooleanValue> Ore : OVERWORLD_CONFIG.Ores.entrySet()) {
                String OreName = Ore.getKey();
                ForgeConfigSpec.BooleanValue ConfigValue = Ore.getValue();

                Janoeo.logger.debug(OreName + " IS ENABLED = " + ConfigValue.get());
                if (ConfigValue.get() && OverworldOresBlocks.Ores.containsKey(OreName)) {
                    Janoeo.logger.debug("Add World Generation Feature = " + OverworldOresBlocks.Ores.get(OreName).getRegistryName());
                    WorldGenerationHelper.addFeature(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(OverworldOresBlocks.Ores.get(OreName).getRegistryName()),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
            }
        }

        if (GLOBAL_CONFIG.DENSE_ORE_GEN.get()) {
            if (OVERWORLD_CONFIG.DENSE_COAL_ORE.get()) {
                for (int i = 0; i < FREQUENCY_CONFIG.DENSE_COAL_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_COAL_ORE.getRegistryName(), String.valueOf(i))
                        ),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (OVERWORLD_CONFIG.DENSE_DIAMOND_ORE.get()) {
                for (int i = 0; i < FREQUENCY_CONFIG.DENSE_DIAMOND_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_DIAMOND_ORE.getRegistryName(), String.valueOf(i))
                        ),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (OVERWORLD_CONFIG.DENSE_EMERALD_ORE.get()) {
                for (int i = 0; i < FREQUENCY_CONFIG.DENSE_EMERALD_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getRegistryName(), String.valueOf(i))
                        ),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (OVERWORLD_CONFIG.DENSE_GOLD_ORE.get()) {
                for (int i = 0; i < FREQUENCY_CONFIG.DENSE_GOLD_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_GOLD_ORE.getRegistryName(), String.valueOf(i))
                        ),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (OVERWORLD_CONFIG.DENSE_IRON_ORE.get()) {
                for (int i = 0; i < FREQUENCY_CONFIG.DENSE_IRON_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_IRON_ORE.getRegistryName(), String.valueOf(i))
                        ),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (OVERWORLD_CONFIG.DENSE_LAPIS_ORE.get()) {
                for (int i = 0; i < FREQUENCY_CONFIG.DENSE_LAPIS_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_LAPIS_ORE.getRegistryName(), String.valueOf(i))
                        ),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (OVERWORLD_CONFIG.DENSE_REDSTONE_ORE.get()) {
                for (int i = 0; i < FREQUENCY_CONFIG.DENSE_REDSTONE_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                        biome,
                        WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_REDSTONE_ORE.getRegistryName(), String.valueOf(i))
                        ),
                        GenerationStage.Decoration.UNDERGROUND_ORES
                );
            }
            if (GLOBAL_CONFIG.EXTRA_ORE_GEN.get() && false) {
                if (OVERWORLD_CONFIG.DENSE_COPPER_ORE.get()) {
                    for (int i = 0; i < FREQUENCY_CONFIG.DENSE_COPPER_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                    RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_COPPER_ORE.getRegistryName(), String.valueOf(i))
                            ),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
                if (OVERWORLD_CONFIG.DENSE_TIN_ORE.get()) {
                    for (int i = 0; i < FREQUENCY_CONFIG.DENSE_TIN_ORE_MULTIPLIER_FACTOR.get(); i++) WorldGenerationHelper.addFeature(
                            biome,
                            WorldGenRegistries.CONFIGURED_FEATURE.getOrDefault(
                                    RegistryHelper.setPrefixOnRegistryName(OverworldDenseOresBlocks.DENSE_TIN_ORE.getRegistryName(), String.valueOf(i))
                            ),
                            GenerationStage.Decoration.UNDERGROUND_ORES
                    );
                }
            }
        }
    }
}
