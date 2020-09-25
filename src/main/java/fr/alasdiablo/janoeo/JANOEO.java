package fr.alasdiablo.janoeo;

import fr.alasdiablo.janoeo.config.*;
import fr.alasdiablo.janoeo.init.OverworldDenseOresBlocks;
import fr.alasdiablo.janoeo.init.OverworldOresBlocks;
import fr.alasdiablo.janoeo.util.Registries;
import fr.alasdiablo.janoeo.util.*;
import fr.alasdiablo.janoeo.world.gen.feature.OresFeatures;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * Main class of the mods
 */
@Mod(Registries.MODID)
public class JANOEO {

    /**
     * Mod setup
     */
    public static ModSetup setup = new ModSetup();

    /**
     * Mod constructor
     */
    public JANOEO() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GlobalConfig.CONFIG_SPEC, "janoeo.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, NetherConfig.CONFIG_SPEC, "janoeo-nether.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, OverworldConfig.CONFIG_SPEC, "janoeo-overworld.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, EndConfig.CONFIG_SPEC, "janoeo-end.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GravelConfig.CONFIG_SPEC, "janoeo-gravel.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, FrequencyConfig.CONFIG_SPEC, "janoeo-frequency.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, FrequencyConfig.CONFIG_SPEC, "janoeo-basalt.toml");
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::initOreFeature);
        this.initBlock();
    }

    private void initBlock() {
        setup.block();
    }

    private void initOreFeature(RegistryEvent.NewRegistry e) {
        setup.oreFeature();
    }

    /**
     * setup function
     * @param event
     */
    private void setup(final FMLCommonSetupEvent event) {
        //OresFeatures.init();
        setup.worldGen();
    }
}
