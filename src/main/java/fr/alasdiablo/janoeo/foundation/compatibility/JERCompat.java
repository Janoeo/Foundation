package fr.alasdiablo.janoeo.foundation.compatibility;

import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.config.OreConfig;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import jeresources.api.IWorldGenRegistry;
import jeresources.api.distributions.DistributionBase;
import jeresources.api.distributions.DistributionSquare;
import jeresources.api.distributions.DistributionTriangular;
import jeresources.api.drop.LootDrop;
import jeresources.api.restrictions.BiomeRestriction;
import jeresources.api.restrictions.Restriction;
import jeresources.compatibility.JERAPI;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

@Deprecated
public class JERCompat {

    private static final IWorldGenRegistry WORLD_GEN_REGISTRY = JERAPI.getInstance().getWorldGenRegistry();

    private static DistributionBase getDistribution(OreConfig config) {
        DistributionBase distribution;
        switch (config.getPlacement()) {
            case "triangle" -> distribution = new DistributionTriangular(
                    (config.getTop() - config.getBottom()) / 2 + config.getBottom(),
                    config.getTop() - config.getBottom() / 2,
                    0.001f
            );
            case "uniform" -> distribution = new DistributionSquare(
                    config.getCount(), config.getSize(), config.getBottom(), config.getTop());
            default -> throw new IllegalArgumentException("Unknown placement type");
        }

        return distribution;
    }

    public static void init() {
        WORLD_GEN_REGISTRY.register(
                new ItemStack(FoundationBlocks.TINY_COAL_ORE),
                getDistribution(FoundationConfig.TINY_COAL_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(FoundationItems.COAL_NUGGET, 6))
        );

        WORLD_GEN_REGISTRY.register(
                new ItemStack(FoundationBlocks.TINY_COPPER_ORE),
                getDistribution(FoundationConfig.TINY_COPPER_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(FoundationItems.COPPER_NUGGET, 6))
        );

        WORLD_GEN_REGISTRY.register(
                new ItemStack(FoundationBlocks.TINY_DIAMOND_ORE),
                getDistribution(FoundationConfig.TINY_DIAMOND_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(FoundationItems.DIAMOND_NUGGET, 6))
        );

        WORLD_GEN_REGISTRY.register(
                new ItemStack(FoundationBlocks.TINY_GOLD_ORE),
                getDistribution(FoundationConfig.TINY_GOLD_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(Items.GOLD_NUGGET, 6))
        );

        WORLD_GEN_REGISTRY.register(
                new ItemStack(FoundationBlocks.TINY_GOLD_ORE),
                getDistribution(FoundationConfig.TINY_GOLD_ORE_EXTRA_CONFIG),
                new Restriction(BiomeRestriction.MESA),
                true,
                new LootDrop(new ItemStack(Items.GOLD_NUGGET, 6))
        );

        WORLD_GEN_REGISTRY.register(
                new ItemStack(FoundationBlocks.TINY_IRON_ORE),
                getDistribution(FoundationConfig.TINY_IRON_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(Items.IRON_NUGGET, 6))
        );

        WORLD_GEN_REGISTRY.register(
                new ItemStack(FoundationBlocks.TINY_LAPIS_ORE),
                getDistribution(FoundationConfig.TINY_LAPIS_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(FoundationItems.LAPIS_NUGGET, 6))
        );

        WORLD_GEN_REGISTRY.register(
                new ItemStack(FoundationBlocks.TINY_REDSTONE_ORE),
                getDistribution(FoundationConfig.TINY_REDSTONE_ORE_CONFIG),
                true,
                new LootDrop(new ItemStack(FoundationItems.REDSTONE_NUGGET, 6))
        );
    }
}
