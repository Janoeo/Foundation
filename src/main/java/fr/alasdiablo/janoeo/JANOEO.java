package fr.alasdiablo.janoeo;

import fr.alasdiablo.janoeo.holder.RegistryHolder;
import fr.alasdiablo.janoeo.utils.ClientProxy;
import fr.alasdiablo.janoeo.utils.IProxy;
import fr.alasdiablo.janoeo.utils.ModSetup;
import fr.alasdiablo.janoeo.utils.ServerProxy;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
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
     * Sided proxy
     */
    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

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
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    /**
     * setup function
     * @param event
     */
    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.init();
    }
}
