package fr.alasdiablo.janoeo.foundation.worldgen.placement;

import fr.alasdiablo.diolib.registries.RegistryHelper;
import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.config.OreConfig;
import fr.alasdiablo.janoeo.foundation.worldgen.features.FoundationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class FoundationPlacements {
    public static final PlacedFeature ORE_TINY_COAL       = createPlacedFeature(FoundationFeatures.ORE_TINY_COAL, FoundationConfig.TINY_COAL_ORE_CONFIG);
    public static final PlacedFeature ORE_TINY_COPPER     = createPlacedFeature(FoundationFeatures.ORE_TINY_COPPER, FoundationConfig.TINY_COPPER_ORE_CONFIG);
    public static final PlacedFeature ORE_TINY_DIAMOND    = createPlacedFeature(FoundationFeatures.ORE_TINY_DIAMOND, FoundationConfig.TINY_DIAMOND_ORE_CONFIG);
    public static final PlacedFeature ORE_TINY_EMERALD    = createPlacedFeature(FoundationFeatures.ORE_TINY_EMERALD, FoundationConfig.TINY_EMERALD_ORE_CONFIG);
    public static final PlacedFeature ORE_TINY_GOLD       = createPlacedFeature(FoundationFeatures.ORE_TINY_GOLD, FoundationConfig.TINY_GOLD_ORE_CONFIG);
    public static final PlacedFeature ORE_TINY_GOLD_EXTRA = createPlacedFeature(
            FoundationFeatures.ORE_TINY_GOLD_EXTRA, FoundationConfig.TINY_GOLD_ORE_EXTRA_CONFIG);
    public static final PlacedFeature ORE_TINY_IRON       = createPlacedFeature(FoundationFeatures.ORE_TINY_IRON, FoundationConfig.TINY_IRON_ORE_CONFIG);
    public static final PlacedFeature ORE_TINY_LAPIS      = createPlacedFeature(FoundationFeatures.ORE_TINY_LAPIS, FoundationConfig.TINY_LAPIS_ORE_CONFIG);
    public static final PlacedFeature ORE_TINY_REDSTONE   = createPlacedFeature(
            FoundationFeatures.ORE_TINY_REDSTONE, FoundationConfig.TINY_REDSTONE_ORE_CONFIG);
    public static final PlacedFeature ORE_BAUXITE         = createPlacedFeature(FoundationFeatures.ORE_BAUXITE, FoundationConfig.BAUXITE_ORE_CONFIG);
    public static final PlacedFeature ORE_LEAD            = createPlacedFeature(FoundationFeatures.ORE_LEAD, FoundationConfig.LEAD_ORE_CONFIG);
    public static final PlacedFeature ORE_NICKEL          = createPlacedFeature(FoundationFeatures.ORE_NICKEL, FoundationConfig.NICKEL_ORE_CONFIG);
    public static final PlacedFeature ORE_SILVER          = createPlacedFeature(FoundationFeatures.ORE_SILVER, FoundationConfig.SILVER_ORE_CONFIG);
    public static final PlacedFeature ORE_TIN             = createPlacedFeature(FoundationFeatures.ORE_TIN, FoundationConfig.TIN_ORE_CONFIG);
    public static final PlacedFeature ORE_URANIUM         = createPlacedFeature(FoundationFeatures.ORE_URANIUM, FoundationConfig.URANIUM_ORE_CONFIG);
    public static final PlacedFeature TINY_ORE_BAUXITE    = createPlacedFeature(FoundationFeatures.TINY_ORE_BAUXITE, FoundationConfig.TINY_BAUXITE_ORE_CONFIG);
    public static final PlacedFeature TINY_ORE_LEAD       = createPlacedFeature(FoundationFeatures.TINY_ORE_LEAD, FoundationConfig.TINY_LEAD_ORE_CONFIG);
    public static final PlacedFeature TINY_ORE_NICKEL     = createPlacedFeature(FoundationFeatures.TINY_ORE_NICKEL, FoundationConfig.TINY_NICKEL_ORE_CONFIG);
    public static final PlacedFeature TINY_ORE_SILVER     = createPlacedFeature(FoundationFeatures.TINY_ORE_SILVER, FoundationConfig.TINY_SILVER_ORE_CONFIG);
    public static final PlacedFeature TINY_ORE_TIN        = createPlacedFeature(FoundationFeatures.TINY_ORE_TIN, FoundationConfig.TINY_TIN_ORE_CONFIG);
    public static final PlacedFeature TINY_ORE_URANIUM    = createPlacedFeature(FoundationFeatures.TINY_ORE_URANIUM, FoundationConfig.TINY_URANIUM_ORE_CONFIG);

    private static PlacedFeature createPlacedFeature(ConfiguredFeature<?, ?> target, OreConfig config) {
        PlacedFeature placedFeature = switch (config.getPlacement()) {
            case "triangle" -> target.placed(commonOrePlacement(config.getCount(), HeightRangePlacement.triangle(
                    VerticalAnchor.absolute(config.getBottom()),
                    VerticalAnchor.absolute(config.getTop())
            )));
            case "uniform" -> target.placed(commonOrePlacement(config.getCount(), HeightRangePlacement.uniform(
                    VerticalAnchor.absolute(config.getBottom()),
                    VerticalAnchor.absolute(config.getTop())
            )));
            default -> throw new IllegalStateException("Undefined placement type");
        };

        return PlacementUtils.register(RegistryHelper.rl(Registries.MOD_ID, config.name()).toString(), placedFeature);
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier count, PlacementModifier heightRange) {
        return List.of(count, InSquarePlacement.spread(), heightRange, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier heightRange) {
        return orePlacement(CountPlacement.of(count), heightRange);
    }
}
