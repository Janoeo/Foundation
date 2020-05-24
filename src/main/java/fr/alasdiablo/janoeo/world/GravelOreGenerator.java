package fr.alasdiablo.janoeo.world;

import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.config.GravelConfig;
import fr.alasdiablo.janoeo.ores.GravelsOresBlocks;
import fr.alasdiablo.janoeo.world.feature.CustomFillerBlockType;
import fr.alasdiablo.janoeo.world.feature.CustomOreFeature;
import fr.alasdiablo.janoeo.world.feature.CustomOreFeatureConfig;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class GravelOreGenerator implements IWorldGenerator {

    @Override
    public void startWorldGeneration() {
        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        GravelConfig.Config gravelConfig = GravelConfig.CONFIG;
        if (globalConfig.GRAVEL_ORE_GEN.get()) ForgeRegistries.BIOMES.forEach(biome -> {
            if (gravelConfig.IRON_GRAVEL_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, CustomOreFeature.INSTANCE.withConfiguration(new CustomOreFeatureConfig(CustomFillerBlockType.GRAVEL, GravelsOresBlocks.IRON_GRAVEL_ORE.getDefaultState(), 6)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(48, 1, 0, 63))));
            if (gravelConfig.GOLD_GRAVEL_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, CustomOreFeature.INSTANCE.withConfiguration(new CustomOreFeatureConfig(CustomFillerBlockType.GRAVEL, GravelsOresBlocks.GOLD_GRAVEL_ORE.getDefaultState(), 4)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(40, 1, 0, 30))));
            if (gravelConfig.DIAMOND_GRAVEL_ORE.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, CustomOreFeature.INSTANCE.withConfiguration(new CustomOreFeatureConfig(CustomFillerBlockType.GRAVEL, GravelsOresBlocks.DIAMOND_GRAVEL_ORE.getDefaultState(), 4)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(32, 1, 0, 20))));
        });
    }
}
