package fr.alasdiablo.janoeo;

import fr.alasdiablo.janoeo.holder.RegistryHolder;
import fr.alasdiablo.janoeo.utils.*;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Main class of the mods
 */
@Mod(RegistryHolder.MODID)
public class JANOEO {

    /**
     * Mod setup
     */
    public static ModSetup setup = new ModSetup();

    /**
     * Mod logger (not use for the moment)
     */
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * Mod constructor
     */
    public JANOEO() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, JANOEOConfig.CONFIG_SPEC);
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
