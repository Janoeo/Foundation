package fr.alasdiablo.janoeo;

import fr.alasdiablo.janoeo.config.EndConfig;
import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.config.NetherConfig;
import fr.alasdiablo.janoeo.config.OverworldConfig;
import fr.alasdiablo.janoeo.utils.Registries;
import fr.alasdiablo.janoeo.utils.*;
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
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    /**
     * setup function
     * @param event
     */
    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
    }
}
