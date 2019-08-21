package fr.alasdiablo.janoeo;

import fr.alasdiablo.janoeo.holder.RegistryHolder;
import fr.alasdiablo.janoeo.proxy.ClientProxy;
import fr.alasdiablo.janoeo.proxy.IProxy;
import fr.alasdiablo.janoeo.proxy.ServerProxy;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(RegistryHolder.MODID)
public class JANOEO {

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    private static final Logger LOGGER = LogManager.getLogger();

    public JANOEO() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    /**
     * the setup is called after the item and block init
     * @param event
     */
    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
