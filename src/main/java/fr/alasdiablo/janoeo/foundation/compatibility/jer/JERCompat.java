package fr.alasdiablo.janoeo.foundation.compatibility.jer;

import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.config.OreConfig;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import jeresources.api.IWorldGenRegistry;
import jeresources.api.conditionals.Conditional;
import jeresources.api.distributions.DistributionBase;
import jeresources.api.distributions.DistributionSquare;
import jeresources.api.distributions.DistributionTriangular;
import jeresources.api.drop.LootDrop;
import jeresources.api.restrictions.BiomeRestriction;
import jeresources.api.restrictions.Restriction;
import jeresources.compatibility.JERAPI;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public class JERCompat {

    private static DistributionBase getDistribution(@NotNull OreConfig config) {
        DistributionBase distribution;
        switch (config.getPlacement()) {
            case "triangle" -> distribution = new DistributionTriangular(
                    config.getCount(), config.getSize(),
                    (config.getTop() - config.getBottom()) / 2 + config.getBottom(),
                    config.getTop() - config.getBottom() / 2
            );
            case "uniform" -> distribution = new DistributionSquare(
                    config.getCount(), config.getSize(), config.getBottom(), config.getTop());
            default -> throw new IllegalArgumentException("Unknown placement type");
        }

        return distribution;
    }

    public static void init() {
        IWorldGenRegistry worldGenRegistry = JERAPI.getInstance().getWorldGenRegistry();
        addOres(worldGenRegistry);
        addTinyOre(worldGenRegistry);
    }

    private static void addTinyOre(@NotNull IWorldGenRegistry registry) {
        registry.register(
                new ItemStack(FoundationBlocks.TINY_COAL_ORE.get()),
                getDistribution(FoundationConfig.TINY_COAL_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(FoundationItems.COAL_NUGGET.get()), 2, 6, Conditional.affectedByFortune)
        );
        registry.register(
                new ItemStack(FoundationBlocks.TINY_COPPER_ORE.get()),
                getDistribution(FoundationConfig.TINY_COPPER_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(FoundationItems.COPPER_NUGGET.get()), 2, 6, Conditional.affectedByFortune)
        );
        registry.register(
                new ItemStack(FoundationBlocks.TINY_DIAMOND_ORE.get()),
                getDistribution(FoundationConfig.TINY_DIAMOND_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(FoundationItems.DIAMOND_NUGGET.get()), 2, 6, Conditional.affectedByFortune)
        );
        registry.register(
                new ItemStack(FoundationBlocks.TINY_EMERALD_ORE.get()),
                getDistribution(FoundationConfig.TINY_EMERALD_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(FoundationItems.EMERALD_NUGGET.get()), 2, 6, Conditional.affectedByFortune)
        );
        registry.register(
                new ItemStack(FoundationBlocks.TINY_GOLD_ORE.get()),
                getDistribution(FoundationConfig.TINY_GOLD_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(Items.GOLD_NUGGET), 2, 6, Conditional.affectedByFortune)
        );
        registry.register(
                new ItemStack(FoundationBlocks.TINY_GOLD_ORE.get()),
                getDistribution(FoundationConfig.TINY_GOLD_ORE_CONFIG),
                new Restriction(BiomeRestriction.MESA),
                true,
                new LootDrop(new ItemStack(Items.GOLD_NUGGET), 2, 6, Conditional.affectedByFortune)
        );
        registry.register(
                new ItemStack(FoundationBlocks.TINY_GOLD_ORE.get()),
                getDistribution(FoundationConfig.TINY_GOLD_ORE_EXTRA_CONFIG),
                new Restriction(BiomeRestriction.MESA),
                true,
                new LootDrop(new ItemStack(Items.GOLD_NUGGET), 2, 6, Conditional.affectedByFortune)
        );
        registry.register(
                new ItemStack(FoundationBlocks.TINY_IRON_ORE.get()),
                getDistribution(FoundationConfig.TINY_IRON_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(Items.IRON_NUGGET), 2, 6, Conditional.affectedByFortune)
        );
        registry.register(
                new ItemStack(FoundationBlocks.TINY_LAPIS_ORE.get()),
                getDistribution(FoundationConfig.TINY_LAPIS_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(FoundationItems.LAPIS_NUGGET.get()), 2, 6, Conditional.affectedByFortune)
        );
        registry.register(
                new ItemStack(FoundationBlocks.TINY_REDSTONE_ORE.get()),
                getDistribution(FoundationConfig.TINY_REDSTONE_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(FoundationItems.REDSTONE_NUGGET.get()), 2, 6, Conditional.affectedByFortune)
        );

        registry.register(
                new ItemStack(FoundationBlocks.TINY_BAUXITE_ORE.get()),
                getDistribution(FoundationConfig.TINY_BAUXITE_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(FoundationItems.ALUMINIUM_NUGGET.get()), 2, 6, Conditional.affectedByFortune)
        );
        registry.register(
                new ItemStack(FoundationBlocks.TINY_LEAD_ORE.get()),
                getDistribution(FoundationConfig.TINY_LEAD_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(FoundationItems.LEAD_NUGGET.get()), 2, 6, Conditional.affectedByFortune)
        );
        registry.register(
                new ItemStack(FoundationBlocks.TINY_NICKEL_ORE.get()),
                getDistribution(FoundationConfig.TINY_NICKEL_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(FoundationItems.NICKEL_NUGGET.get()), 2, 6, Conditional.affectedByFortune)
        );
        registry.register(
                new ItemStack(FoundationBlocks.TINY_TIN_ORE.get()),
                getDistribution(FoundationConfig.TINY_TIN_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(FoundationItems.TIN_NUGGET.get()), 2, 6, Conditional.affectedByFortune)
        );
        registry.register(
                new ItemStack(FoundationBlocks.TINY_URANIUM_ORE.get()),
                getDistribution(FoundationConfig.TINY_URANIUM_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(FoundationItems.URANIUM_NUGGET.get()), 2, 6, Conditional.affectedByFortune)
        );
    }

    private static void addOres(@NotNull IWorldGenRegistry registry) {
        registry.register(
                new ItemStack(FoundationBlocks.BAUXITE_ORE.get()),
                getDistribution(FoundationConfig.BAUXITE_ORE_CONFIG),
                new LootDrop(new ItemStack(FoundationItems.RAW_ALUMINIUM.get()))
        );
        registry.register(
                new ItemStack(FoundationBlocks.LEAD_ORE.get()),
                getDistribution(FoundationConfig.LEAD_ORE_CONFIG),
                new LootDrop(new ItemStack(FoundationItems.RAW_LEAD.get()))
        );
        registry.register(
                new ItemStack(FoundationBlocks.NICKEL_ORE.get()),
                getDistribution(FoundationConfig.NICKEL_ORE_CONFIG),
                new LootDrop(new ItemStack(FoundationItems.RAW_NICKEL.get()))
        );
        registry.register(
                new ItemStack(FoundationBlocks.SILVER_ORE.get()),
                getDistribution(FoundationConfig.SILVER_ORE_CONFIG),
                new LootDrop(new ItemStack(FoundationItems.RAW_SILVER.get()))
        );
        registry.register(
                new ItemStack(FoundationBlocks.TIN_ORE.get()),
                getDistribution(FoundationConfig.TIN_ORE_CONFIG),
                new LootDrop(new ItemStack(FoundationItems.RAW_TIN.get()))
        );
        registry.register(
                new ItemStack(FoundationBlocks.URANIUM_ORE.get()),
                getDistribution(FoundationConfig.URANIUM_ORE_CONFIG),
                new LootDrop(new ItemStack(FoundationItems.RAW_URANIUM.get()))
        );
    }
}
