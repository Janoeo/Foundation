package fr.alasdiablo.janoeo;

import fr.alasdiablo.janoeo.config.*;
import fr.alasdiablo.janoeo.util.Registries;
import fr.alasdiablo.janoeo.world.OreGenUtils;
import fr.alasdiablo.janoeo.world.gen.feature.OresFeatures;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * Janoeo Main class
 */
@Mod(Registries.MODID)
public class Janoeo {

    /**
     * Jannoeo default constructor
     */
    public Janoeo() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GlobalConfig.CONFIG_SPEC, "janoeo.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, NetherConfig.CONFIG_SPEC, "janoeo-nether.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, OverworldConfig.CONFIG_SPEC, "janoeo-overworld.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, EndConfig.CONFIG_SPEC, "janoeo-end.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GravelConfig.CONFIG_SPEC, "janoeo-gravel.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, FrequencyConfig.CONFIG_SPEC, "janoeo-frequency.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, FrequencyConfig.CONFIG_SPEC, "janoeo-basalt.toml");
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::initFeatures);
    }

    /**
     * Initialized all ConfiguredFeature
     * @param e RegistryEvent (not use in this case)
     */
    private void initFeatures(RegistryEvent.NewRegistry e) {
        OresFeatures.initOverworld();
        OresFeatures.initNether();
        OresFeatures.initGravel();
        OresFeatures.initOceanGravel();
        OresFeatures.initNetherGravel();
        OresFeatures.initNetherBasalt();
        OresFeatures.initTheEnd();
        OresFeatures.initDenseOre();
        OresFeatures.initNetherDenseOre();
    }

    /**
     * Step function use for initialized ore generation
     * @param e FMLCommonSetupEvent (not use in this case)
     */
    private void setup(final FMLCommonSetupEvent e) {
        OreGenUtils.initOreGen();
    }
}
