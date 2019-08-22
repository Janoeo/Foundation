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


@Mod(RegistryHolder.MODID)
public class JANOEO {

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static ModSetup setup = new ModSetup();

    private static final Logger LOGGER = LogManager.getLogger();

    public JANOEO() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.init();
    }
}
