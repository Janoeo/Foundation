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
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class JERCompat {

    private static final IWorldGenRegistry WORLD_GEN_REGISTRY = JERAPI.getInstance().getWorldGenRegistry();

    private static DistributionBase getDistribution(OreConfig config) {
        DistributionBase distribution;
        switch (config.getPlacement()) {
            case "range": {
                distribution = new DistributionSquare(config.getCount(), config.getSize(), 0, config.getRange());
                break;
            }
            case "depth_average": {
                distribution = new DistributionTriangular(config.getBaseline(), config.getSpread(), 0.001f);
                break;
            }
            case "top_solid_range": {
                distribution = new DistributionSquare(config.getCount(), config.getSize(), config.getBottomOffset(), config.getMaximum());
                break;
            }
            default:
                throw new IllegalArgumentException("Unknown placement type");
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
