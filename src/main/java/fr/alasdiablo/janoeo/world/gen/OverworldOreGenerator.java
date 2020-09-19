package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.janoeo.config.FrequencyConfig;
import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.config.OverworldConfig;
import fr.alasdiablo.janoeo.block.OverworldDenseOresBlocks;
import fr.alasdiablo.janoeo.block.OverworldOresBlocks;
import fr.alasdiablo.janoeo.world.OreGenUtils;
import fr.alasdiablo.janoeo.world.gen.feature.CustomFillerBlockType;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Arrays;
import java.util.List;

public class OverworldOreGenerator implements IWorldGenerator {

    @Override
    public void startWorldGeneration() {
        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        OverworldConfig.Config overworldConfig = OverworldConfig.CONFIG;
        FrequencyConfig.Config frequencyConfig = FrequencyConfig.CONFIG;

        if (globalConfig.DENSE_ORE_GEN.get() && overworldConfig.DENSE_EMERALD_ORE.get()) {
            final List<Biome> biomeList = Arrays.asList(
                    Biomes.MOUNTAINS,
                    Biomes.WOODED_MOUNTAINS,
                    Biomes.GRAVELLY_MOUNTAINS,
                    Biomes.MODIFIED_GRAVELLY_MOUNTAINS,
                    Biomes.MOUNTAIN_EDGE
            );

            biomeList.forEach(biome -> OreGenUtils.addBlockGenOnBiome(
                    biome,
                    Blocks.EMERALD_ORE.getDefaultState(),
                    OverworldDenseOresBlocks.DENSE_EMERALD_ORE.getDefaultState(),
                    frequencyConfig.DENSE_EMERALD_ORE_COUNT.get(),
                    frequencyConfig.DENSE_EMERALD_ORE_BOTTOM.get(),
                    frequencyConfig.DENSE_EMERALD_ORE_TOP.get()
            ));
        }
        ForgeRegistries.BIOMES.forEach(biome -> {
            if (globalConfig.EXTRA_ORE_GEN.get()) {

                if (overworldConfig.COPPER_ORE.get()) {
                    OreGenUtils.addOreGenOnBiome(
                            biome,
                            CustomFillerBlockType.NATURAL_STONE,
                            OverworldOresBlocks.COPPER_ORE.getDefaultState(),
                            frequencyConfig.COPPER_ORE_SIZE.get(),
                            frequencyConfig.COPPER_ORE_COUNT.get(),
                            frequencyConfig.COPPER_ORE_BOTTOM.get(),
                            frequencyConfig.COPPER_ORE_TOP.get()
                    );
                }

                if (overworldConfig.TIN_ORE.get()) {
                    OreGenUtils.addOreGenOnBiome(
                            biome,
                            CustomFillerBlockType.NATURAL_STONE,
                            OverworldOresBlocks.TIN_ORE.getDefaultState(),
                            frequencyConfig.TIN_ORE_SIZE.get(),
                            frequencyConfig.TIN_ORE_COUNT.get(),
                            frequencyConfig.TIN_ORE_BOTTOM.get(),
                            frequencyConfig.TIN_ORE_TOP.get()
                    );
                }

                if (overworldConfig.ALUMINIUM_ORE.get()) {
                    OreGenUtils.addOreGenOnBiome(
                            biome,
                            CustomFillerBlockType.NATURAL_STONE,
                            OverworldOresBlocks.ALUMINIUM_ORE.getDefaultState(),
                            frequencyConfig.ALUMINIUM_ORE_SIZE.get(),
                            frequencyConfig.ALUMINIUM_ORE_COUNT.get(),
                            frequencyConfig.ALUMINIUM_ORE_BOTTOM.get(),
                            frequencyConfig.ALUMINIUM_ORE_TOP.get()
                    );
                }

                if (overworldConfig.URANIUM_ORE.get()) {
                    OreGenUtils.addOreGenOnBiome(
                            biome,
                            CustomFillerBlockType.NATURAL_STONE,
                            OverworldOresBlocks.URANIUM_ORE.getDefaultState(),
                            frequencyConfig.URANIUM_ORE_SIZE.get(),
                            frequencyConfig.URANIUM_ORE_COUNT.get(),
                            frequencyConfig.URANIUM_ORE_BOTTOM.get(),
                            frequencyConfig.URANIUM_ORE_TOP.get()
                    );
                }

                if (overworldConfig.LEAD_ORE.get()) {
                    OreGenUtils.addOreGenOnBiome(
                            biome,
                            CustomFillerBlockType.NATURAL_STONE,
                            OverworldOresBlocks.LEAD_ORE.getDefaultState(),
                            frequencyConfig.LEAD_ORE_SIZE.get(),
                            frequencyConfig.LEAD_ORE_COUNT.get(),
                            frequencyConfig.LEAD_ORE_BOTTOM.get(),
                            frequencyConfig.LEAD_ORE_TOP.get()
                    );
                }

                if (overworldConfig.SILVER_ORE.get()) {
                    OreGenUtils.addOreGenOnBiome(
                            biome,
                            CustomFillerBlockType.NATURAL_STONE,
                            OverworldOresBlocks.SILVER_ORE.getDefaultState(),
                            frequencyConfig.SILVER_ORE_SIZE.get(),
                            frequencyConfig.SILVER_ORE_COUNT.get(),
                            frequencyConfig.SILVER_ORE_BOTTOM.get(),
                            frequencyConfig.SILVER_ORE_TOP.get()
                    );
                }

                if (overworldConfig.RUBY_ORE.get()) {
                    OreGenUtils.addOreGenOnBiome(
                            biome,
                            CustomFillerBlockType.NATURAL_STONE,
                            OverworldOresBlocks.RUBY_ORE.getDefaultState(),
                            frequencyConfig.RUBY_ORE_SIZE.get(),
                            frequencyConfig.RUBY_ORE_COUNT.get(),
                            frequencyConfig.RUBY_ORE_BOTTOM.get(),
                            frequencyConfig.RUBY_ORE_TOP.get()
                    );
                }

                if (overworldConfig.SAPPHIRE_ORE.get()) {
                    OreGenUtils.addOreGenOnBiome(
                            biome,
                            CustomFillerBlockType.NATURAL_STONE,
                            OverworldOresBlocks.SAPPHIRE_ORE.getDefaultState(),
                            frequencyConfig.SAPPHIRE_ORE_SIZE.get(),
                            frequencyConfig.SAPPHIRE_ORE_COUNT.get(),
                            frequencyConfig.SAPPHIRE_ORE_BOTTOM.get(),
                            frequencyConfig.SAPPHIRE_ORE_TOP.get()
                    );
                }

                if (overworldConfig.AMETHYST_ORE.get()) {
                    OreGenUtils.addOreGenOnBiome(
                            biome,
                            CustomFillerBlockType.NATURAL_STONE,
                            OverworldOresBlocks.AMETHYST_ORE.getDefaultState(),
                            frequencyConfig.AMETHYST_ORE_SIZE.get(),
                            frequencyConfig.AMETHYST_ORE_COUNT.get(),
                            frequencyConfig.AMETHYST_ORE_BOTTOM.get(),
                            frequencyConfig.AMETHYST_ORE_TOP.get()
                    );
                }

                if (overworldConfig.ZINC_ORE.get()) {
                    OreGenUtils.addOreGenOnBiome(
                            biome,
                            CustomFillerBlockType.NATURAL_STONE,
                            OverworldOresBlocks.ZINC_ORE.getDefaultState(),
                            frequencyConfig.ZINC_ORE_SIZE.get(),
                            frequencyConfig.ZINC_ORE_COUNT.get(),
                            frequencyConfig.ZINC_ORE_BOTTOM.get(),
                            frequencyConfig.ZINC_ORE_TOP.get()
                    );
                }

                if (globalConfig.DENSE_ORE_GEN.get()) {

                    if (overworldConfig.COPPER_ORE.get() && overworldConfig.DENSE_COPPER_ORE.get()) {
                        OreGenUtils.addBlockGenOnBiome(
                                biome,
                                OverworldOresBlocks.COPPER_ORE.getDefaultState(),
                                OverworldDenseOresBlocks.DENSE_COPPER_ORE.getDefaultState(),
                                frequencyConfig.DENSE_COPPER_ORE_COUNT.get(),
                                frequencyConfig.DENSE_COPPER_ORE_BOTTOM.get(),
                                frequencyConfig.DENSE_COPPER_ORE_TOP.get()
                        );
                    }

                    if (overworldConfig.TIN_ORE.get() && overworldConfig.DENSE_TIN_ORE.get()) {
                        OreGenUtils.addBlockGenOnBiome(
                                biome,
                                OverworldOresBlocks.TIN_ORE.getDefaultState(),
                                OverworldDenseOresBlocks.DENSE_TIN_ORE.getDefaultState(),
                                frequencyConfig.DENSE_TIN_ORE_COUNT.get(),
                                frequencyConfig.DENSE_TIN_ORE_BOTTOM.get(),
                                frequencyConfig.DENSE_TIN_ORE_TOP.get()
                        );
                    }
                }
            }

            if (globalConfig.DENSE_ORE_GEN.get()) {

                if (overworldConfig.DENSE_COAL_ORE.get()) {
                    OreGenUtils.addBlockGenOnBiome(
                            biome,
                            Blocks.COAL_ORE.getDefaultState(),
                            OverworldDenseOresBlocks.DENSE_COAL_ORE.getDefaultState(),
                            frequencyConfig.DENSE_COAL_ORE_COUNT.get(),
                            frequencyConfig.DENSE_COAL_ORE_BOTTOM.get(),
                            frequencyConfig.DENSE_COAL_ORE_TOP.get()
                    );
                }

                if (overworldConfig.DENSE_GOLD_ORE.get()) {
                    OreGenUtils.addBlockGenOnBiome(
                            biome,
                            Blocks.GOLD_ORE.getDefaultState(),
                            OverworldDenseOresBlocks.DENSE_GOLD_ORE.getDefaultState(),
                            frequencyConfig.DENSE_GOLD_ORE_COUNT.get(),
                            frequencyConfig.DENSE_GOLD_ORE_BOTTOM.get(),
                            frequencyConfig.DENSE_GOLD_ORE_TOP.get()
                    );
                }

                if (overworldConfig.DENSE_IRON_ORE.get()) {
                    OreGenUtils.addBlockGenOnBiome(
                            biome,
                            Blocks.IRON_ORE.getDefaultState(),
                            OverworldDenseOresBlocks.DENSE_IRON_ORE.getDefaultState(),
                            frequencyConfig.DENSE_IRON_ORE_COUNT.get(),
                            frequencyConfig.DENSE_IRON_ORE_BOTTOM.get(),
                            frequencyConfig.DENSE_IRON_ORE_TOP.get()
                    );
                }

                if (overworldConfig.DENSE_LAPIS_ORE.get()) {
                    OreGenUtils.addBlockGenOnBiome(
                            biome,
                            Blocks.LAPIS_ORE.getDefaultState(),
                            OverworldDenseOresBlocks.DENSE_LAPIS_ORE.getDefaultState(),
                            frequencyConfig.DENSE_LAPIS_ORE_COUNT.get(),
                            frequencyConfig.DENSE_LAPIS_ORE_BOTTOM.get(),
                            frequencyConfig.DENSE_LAPIS_ORE_TOP.get()
                    );
                }

                if (overworldConfig.DENSE_REDSTONE_ORE.get()) {
                    OreGenUtils.addBlockGenOnBiome(
                            biome,
                            Blocks.REDSTONE_ORE.getDefaultState(),
                            OverworldDenseOresBlocks.DENSE_REDSTONE_ORE.getDefaultState(),
                            frequencyConfig.DENSE_REDSTONE_ORE_COUNT.get(),
                            frequencyConfig.DENSE_REDSTONE_ORE_BOTTOM.get(),
                            frequencyConfig.DENSE_REDSTONE_ORE_TOP.get()
                    );
                }

                if (overworldConfig.DENSE_DIAMOND_ORE.get()) {
                    OreGenUtils.addBlockGenOnBiome(
                            biome,
                            Blocks.DIAMOND_ORE.getDefaultState(),
                            OverworldDenseOresBlocks.DENSE_DIAMOND_ORE.getDefaultState(),
                            frequencyConfig.DENSE_DIAMOND_ORE_COUNT.get(),
                            frequencyConfig.DENSE_DIAMOND_ORE_BOTTOM.get(),
                            frequencyConfig.DENSE_DIAMOND_ORE_TOP.get()
                    );
                }
            }
        });
    }
}
