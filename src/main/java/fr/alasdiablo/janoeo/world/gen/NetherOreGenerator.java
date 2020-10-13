package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.config.NetherConfig;
import net.minecraft.world.biome.Biome;

public class NetherOreGenerator implements IWorldGenerator {
    @Override
    public void startWorldGeneration(Biome biome) {
        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        NetherConfig.Config netherConfig = NetherConfig.CONFIG;

//        if (globalConfig.NETHER_ORE_GEN.get()) ForgeRegistries.BIOMES.forEach(biome -> {
//
//            if (netherConfig.COAL_NETHER_ORE.get()) {
//                OreGenUtils.addOreGenOnBiome(
//                        biome,
//                        CustomFillerBlockType.NETHERRACK,
//                        NetherOresBlocks.COAL_NETHER_ORE.getDefaultState(),
//                        12,
//                        17,
//                        1,
//                        127
//                );
//            }
//
//            if (netherConfig.DIAMOND_NETHER_ORE.get()) {
//                OreGenUtils.addOreGenOnBiome(
//                        biome,
//                        CustomFillerBlockType.NETHERRACK,
//                        NetherOresBlocks.DIAMOND_NETHER_ORE.getDefaultState(),
//                        4,
//                        5,
//                        1,
//                        127
//                );
//            }
//            if (netherConfig.EMERALD_NETHER_ORE.get()) {
//                OreGenUtils.addBlockGenOnBiome(
//                        biome,
//                        Blocks.NETHERRACK.getDefaultState(),
//                        NetherOresBlocks.EMERALD_NETHER_ORE.getDefaultState(),
//                        2,
//                        1,
//                        127
//                );
//            }
//
//            if (netherConfig.GOLD_NETHER_ORE.get()) {
//                OreGenUtils.addOreGenOnBiome(
//                        biome,
//                        CustomFillerBlockType.NETHERRACK,
//                        NetherOresBlocks.GOLD_NETHER_ORE.getDefaultState(),
//                        4,
//                        8,
//                        1,
//                        127
//                );
//            }
//
//            if (netherConfig.IRON_NETHER_ORE.get()) {
//                OreGenUtils.addOreGenOnBiome(
//                        biome,
//                        CustomFillerBlockType.NETHERRACK,
//                        NetherOresBlocks.IRON_NETHER_ORE.getDefaultState(),
//                        6,
//                        10,
//                        1,
//                        127
//                );
//            }
//
//            if (netherConfig.LAPIS_NETHER_ORE.get()) {
//                OreGenUtils.addOreGenOnBiome(
//                        biome,
//                        CustomFillerBlockType.NETHERRACK,
//                        NetherOresBlocks.LAPIS_NETHER_ORE.getDefaultState(),
//                        6,
//                        5,
//                        1,
//                        127
//                );
//            }
//
//            if (netherConfig.REDSTONE_NETHER_ORE.get()) {
//                OreGenUtils.addOreGenOnBiome(
//                        biome,
//                        CustomFillerBlockType.NETHERRACK,
//                        NetherOresBlocks.REDSTONE_NETHER_ORE.getDefaultState(),
//                        8,
//                        8,
//                        1,
//                        127
//                );
//            }
//
//
//            if (globalConfig.EXTRA_NETHER_ORE_GEN.get()) {
//
//                if (netherConfig.ALUMINIUM_NETHER_ORE.get()) {
//                    OreGenUtils.addOreGenOnBiome(
//                            biome,
//                            CustomFillerBlockType.NETHERRACK,
//                            NetherOresBlocks.ALUMINIUM_NETHER_ORE.getDefaultState(),
//                            6,
//                            8,
//                            1,
//                            127
//                    );
//                }
//
//                if (netherConfig.LEAD_NETHER_ORE.get()) {
//                    OreGenUtils.addOreGenOnBiome(
//                            biome,
//                            CustomFillerBlockType.NETHERRACK,
//                            NetherOresBlocks.LEAD_NETHER_ORE.getDefaultState(),
//                            6,
//                            10,
//                            1,
//                            127
//                    );
//                }
//
//                if (netherConfig.TIN_NETHER_ORE.get()) {
//                    OreGenUtils.addOreGenOnBiome(
//                            biome,
//                            CustomFillerBlockType.NETHERRACK,
//                            NetherOresBlocks.TIN_NETHER_ORE.getDefaultState(),
//                            6,
//                            10,
//                            1,
//                            127
//                    );
//                }
//                if (netherConfig.COPPER_NETHER_ORE.get()) {
//                    OreGenUtils.addOreGenOnBiome(
//                            biome,
//                            CustomFillerBlockType.NETHERRACK,
//                            NetherOresBlocks.COPPER_NETHER_ORE.getDefaultState(),
//                            6,
//                            10,
//                            1,
//                            127
//                    );
//                }
//
//                if (netherConfig.RUBY_NETHER_ORE.get()) {
//                    OreGenUtils.addOreGenOnBiome(
//                            biome,
//                            CustomFillerBlockType.NETHERRACK,
//                            NetherOresBlocks.RUBY_NETHER_ORE.getDefaultState(),
//                            4,
//                            5,
//                            1,
//                            127
//                    );
//                }
//
//                if (netherConfig.SAPPHIRE_NETHER_ORE.get()) {
//                    OreGenUtils.addOreGenOnBiome(
//                            biome,
//                            CustomFillerBlockType.NETHERRACK,
//                            NetherOresBlocks.SAPPHIRE_NETHER_ORE.getDefaultState(),
//                            4,
//                            5,
//                            1,
//                            127
//                    );
//                }
//
//                if (netherConfig.SILVER_NETHER_ORE.get()) {
//                    OreGenUtils.addOreGenOnBiome(
//                            biome,
//                            CustomFillerBlockType.NETHERRACK,
//                            NetherOresBlocks.SILVER_NETHER_ORE.getDefaultState(),
//                            4,
//                            8,
//                            1,
//                            127
//                    );
//                }
//
//                if (netherConfig.URANIUM_NETHER_ORE.get()) {
//                    OreGenUtils.addOreGenOnBiome(
//                            biome,
//                            CustomFillerBlockType.NETHERRACK,
//                            NetherOresBlocks.URANIUM_NETHER_ORE.getDefaultState(),
//                            4,
//                            8,
//                            1,
//                            127
//                    );
//                }
//            }
//
//            if (globalConfig.DENSE_ORE_GEN.get()) {
//                if (netherConfig.DENSE_COAL_NETHER_ORE.get()) {
//                    OreGenUtils.addBlockGenOnBiome(
//                            biome,
//                            NetherOresBlocks.COAL_NETHER_ORE.getDefaultState(),
//                            NetherDenseOresBlocks.DENSE_COAL_NETHER_ORE.getDefaultState(),
//                            1280,
//                            1,
//                            127
//                    );
//                }
//
//                if (netherConfig.DENSE_DIAMOND_NETHER_ORE.get()) {
//                    OreGenUtils.addBlockGenOnBiome(
//                            biome,
//                            NetherOresBlocks.DIAMOND_NETHER_ORE.getDefaultState(),
//                            NetherDenseOresBlocks.DENSE_DIAMOND_NETHER_ORE.getDefaultState(),
//                            1280,
//                            1,
//                            127
//                    );
//                }
//
//                if (netherConfig.DENSE_EMERALD_NETHER_ORE.get()) {
//                    OreGenUtils.addBlockGenOnBiome(
//                            biome,
//                            NetherOresBlocks.EMERALD_NETHER_ORE.getDefaultState(),
//                            NetherDenseOresBlocks.DENSE_EMERALD_NETHER_ORE.getDefaultState(),
//                            1280,
//                            1,
//                            127
//                    );
//                }
//
//                if (netherConfig.DENSE_GOLD_NETHER_ORE.get()) {
//                    OreGenUtils.addBlockGenOnBiome(
//                            biome,
//                            NetherOresBlocks.GOLD_NETHER_ORE.getDefaultState(),
//                            NetherDenseOresBlocks.DENSE_GOLD_NETHER_ORE.getDefaultState(),
//                            1280,
//                            1,
//                            127
//                    );
//                }
//
//                if (netherConfig.DENSE_IRON_NETHER_ORE.get()) {
//                    OreGenUtils.addBlockGenOnBiome(
//                            biome,
//                            NetherOresBlocks.IRON_NETHER_ORE.getDefaultState(),
//                            NetherDenseOresBlocks.DENSE_IRON_NETHER_ORE.getDefaultState(),
//                            1280,
//                            1,
//                            127
//                    );
//                }
//
//                if (netherConfig.DENSE_LAPIS_NETHER_ORE.get()) {
//                    OreGenUtils.addBlockGenOnBiome(
//                            biome,
//                            NetherOresBlocks.LAPIS_NETHER_ORE.getDefaultState(),
//                            NetherDenseOresBlocks.DENSE_LAPIS_NETHER_ORE.getDefaultState(),
//                            1280,
//                            1,
//                            127
//                    );
//                }
//
//                if (netherConfig.DENSE_REDSTONE_NETHER_ORE.get()) {
//                    OreGenUtils.addBlockGenOnBiome(
//                            biome,
//                            NetherOresBlocks.REDSTONE_NETHER_ORE.getDefaultState(),
//                            NetherDenseOresBlocks.DENSE_REDSTONE_NETHER_ORE.getDefaultState(),
//                            1280,
//                            1,
//                            127
//                    );
//                }
//
//                if (netherConfig.DENSE_QUARTZ_NETHER_ORE.get()) {
//                    OreGenUtils.addBlockGenOnBiome(
//                            biome,
//                            Blocks.NETHER_QUARTZ_ORE.getDefaultState(),
//                            NetherDenseOresBlocks.DENSE_QUARTZ_NETHER_ORE.getDefaultState(),
//                            1280,
//                            1,
//                            127
//                    );
//                }
//            }
//        });
    }
}
