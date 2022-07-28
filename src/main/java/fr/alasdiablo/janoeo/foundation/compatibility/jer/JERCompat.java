package fr.alasdiablo.janoeo.foundation.compatibility.jer;

import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.config.OreConfig;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
//import jeresources.api.IWorldGenRegistry;
//import jeresources.api.conditionals.Conditional;
//import jeresources.api.distributions.DistributionBase;
//import jeresources.api.distributions.DistributionSquare;
//import jeresources.api.distributions.DistributionTriangular;
//import jeresources.api.drop.LootDrop;
//import jeresources.api.restrictions.BiomeRestriction;
//import jeresources.api.restrictions.Restriction;
//import jeresources.compatibility.JERAPI;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public class JERCompat {

//    private static DistributionBase getDistribution(@NotNull OreConfig config) {
//        DistributionBase distribution;
//        switch (config.getPlacement()) {
//            case "triangle" -> distribution = new DistributionTriangular(
//                    config.getCount(), config.getSize(),
//                    (config.getTop() - config.getBottom()) / 2 + config.getBottom(),
//                    config.getTop() - config.getBottom() / 2
//            );
//            case "uniform" -> distribution = new DistributionSquare(
//                    config.getCount(), config.getSize(), config.getBottom(), config.getTop());
//            default -> throw new IllegalArgumentException("Unknown placement type");
//        }
//
//        return distribution;
//    }

    public static void init() {
        Foundation.logger.info("You are running jer but the Janoeo Foundation compatibility is currently hard disable");
//        IWorldGenRegistry worldGenRegistry = JERAPI.getInstance().getWorldGenRegistry();
//        addOres(worldGenRegistry);
//        addTinyOre(worldGenRegistry);
    }

//    private static void addTinyOre(@NotNull IWorldGenRegistry registry) {
//        registry.register(
//                new ItemStack(FoundationBlocks.TINY_STONE_ORES.get(Resource.Coal).get()),
//                getDistribution(FoundationConfig.TINY_COAL_ORE_CONFIG),
//                true,
//                new LootDrop(new ItemStack(FoundationItems.NUGGETS.get(Resource.Coal).get()), 2, 6, Conditional.affectedByFortune)
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.TINY_STONE_ORES.get(Resource.Copper).get()),
//                getDistribution(FoundationConfig.TINY_COPPER_ORE_CONFIG),
//                true,
//                new LootDrop(new ItemStack(FoundationItems.NUGGETS.get(Resource.Copper).get()), 2, 6, Conditional.affectedByFortune)
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.TINY_STONE_ORES.get(Resource.Diamond).get()),
//                getDistribution(FoundationConfig.TINY_DIAMOND_ORE_CONFIG),
//                true,
//                new LootDrop(new ItemStack(FoundationItems.NUGGETS.get(Resource.Diamond).get()), 2, 6, Conditional.affectedByFortune)
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.TINY_STONE_ORES.get(Resource.Emerald).get()),
//                getDistribution(FoundationConfig.TINY_EMERALD_ORE_CONFIG),
//                true,
//                new LootDrop(new ItemStack(FoundationItems.NUGGETS.get(Resource.Diamond).get()), 2, 6, Conditional.affectedByFortune)
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.TINY_STONE_ORES.get(Resource.Gold).get()),
//                getDistribution(FoundationConfig.TINY_GOLD_ORE_CONFIG),
//                true,
//                new LootDrop(new ItemStack(Items.GOLD_NUGGET), 2, 6, Conditional.affectedByFortune)
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.TINY_STONE_ORES.get(Resource.Gold).get()),
//                getDistribution(FoundationConfig.TINY_GOLD_ORE_CONFIG),
//                new Restriction(BiomeRestriction.MESA),
//                true,
//                new LootDrop(new ItemStack(Items.GOLD_NUGGET), 2, 6, Conditional.affectedByFortune)
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.TINY_STONE_ORES.get(Resource.Gold).get()),
//                getDistribution(FoundationConfig.TINY_GOLD_ORE_EXTRA_CONFIG),
//                new Restriction(BiomeRestriction.MESA),
//                true,
//                new LootDrop(new ItemStack(Items.GOLD_NUGGET), 2, 6, Conditional.affectedByFortune)
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.TINY_STONE_ORES.get(Resource.Iron).get()),
//                getDistribution(FoundationConfig.TINY_IRON_ORE_CONFIG),
//                true,
//                new LootDrop(new ItemStack(Items.IRON_NUGGET), 2, 6, Conditional.affectedByFortune)
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.TINY_STONE_ORES.get(Resource.Lapis).get()),
//                getDistribution(FoundationConfig.TINY_LAPIS_ORE_CONFIG),
//                true,
//                new LootDrop(new ItemStack(FoundationItems.NUGGETS.get(Resource.Lapis).get()), 2, 6, Conditional.affectedByFortune)
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.TINY_STONE_ORES.get(Resource.RedStone).get()),
//                getDistribution(FoundationConfig.TINY_REDSTONE_ORE_CONFIG),
//                true,
//                new LootDrop(new ItemStack(FoundationItems.NUGGETS.get(Resource.RedStone).get()), 2, 6, Conditional.affectedByFortune)
//        );
//
//        registry.register(
//                new ItemStack(FoundationBlocks.TINY_STONE_ORES.get(Resource.Aluminium).get()),
//                getDistribution(FoundationConfig.TINY_BAUXITE_ORE_CONFIG),
//                true,
//                new LootDrop(new ItemStack(FoundationItems.NUGGETS.get(Resource.Aluminium).get()), 2, 6, Conditional.affectedByFortune)
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.TINY_STONE_ORES.get(Resource.Lead).get()),
//                getDistribution(FoundationConfig.TINY_LEAD_ORE_CONFIG),
//                true,
//                new LootDrop(new ItemStack(FoundationItems.NUGGETS.get(Resource.Lead).get()), 2, 6, Conditional.affectedByFortune)
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.TINY_STONE_ORES.get(Resource.Nickel).get()),
//                getDistribution(FoundationConfig.TINY_NICKEL_ORE_CONFIG),
//                true,
//                new LootDrop(new ItemStack(FoundationItems.NUGGETS.get(Resource.Nickel).get()), 2, 6, Conditional.affectedByFortune)
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.TINY_STONE_ORES.get(Resource.Tin).get()),
//                getDistribution(FoundationConfig.TINY_TIN_ORE_CONFIG),
//                true,
//                new LootDrop(new ItemStack(FoundationItems.NUGGETS.get(Resource.Tin).get()), 2, 6, Conditional.affectedByFortune)
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.TINY_STONE_ORES.get(Resource.Uranium).get()),
//                getDistribution(FoundationConfig.TINY_URANIUM_ORE_CONFIG),
//                true,
//                new LootDrop(new ItemStack(FoundationItems.NUGGETS.get(Resource.Uranium).get()), 2, 6, Conditional.affectedByFortune)
//        );
//    }
//
//    private static void addOres(@NotNull IWorldGenRegistry registry) {
//        registry.register(
//                new ItemStack(FoundationBlocks.STONE_ORES.get(Resource.Aluminium).get()),
//                getDistribution(FoundationConfig.BAUXITE_ORE_CONFIG),
//                new LootDrop(new ItemStack(FoundationItems.RAWS.get(Resource.Aluminium).get()))
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.STONE_ORES.get(Resource.Lead).get()),
//                getDistribution(FoundationConfig.LEAD_ORE_CONFIG),
//                new LootDrop(new ItemStack(FoundationItems.RAWS.get(Resource.Lead).get()))
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.STONE_ORES.get(Resource.Nickel).get()),
//                getDistribution(FoundationConfig.NICKEL_ORE_CONFIG),
//                new LootDrop(new ItemStack(FoundationItems.RAWS.get(Resource.Nickel).get()))
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.STONE_ORES.get(Resource.Silver).get()),
//                getDistribution(FoundationConfig.SILVER_ORE_CONFIG),
//                new LootDrop(new ItemStack(FoundationItems.RAWS.get(Resource.Silver).get()))
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.STONE_ORES.get(Resource.Tin).get()),
//                getDistribution(FoundationConfig.TIN_ORE_CONFIG),
//                new LootDrop(new ItemStack(FoundationItems.RAWS.get(Resource.Tin).get()))
//        );
//        registry.register(
//                new ItemStack(FoundationBlocks.STONE_ORES.get(Resource.Uranium).get()),
//                getDistribution(FoundationConfig.URANIUM_ORE_CONFIG),
//                new LootDrop(new ItemStack(FoundationItems.RAWS.get(Resource.Uranium).get()))
//        );
//    }
}
