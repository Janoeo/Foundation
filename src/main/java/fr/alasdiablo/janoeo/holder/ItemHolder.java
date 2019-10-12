package fr.alasdiablo.janoeo.holder;

import fr.alasdiablo.janoeo.JANOEO;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

/**
 * class with all item
 */
@SuppressWarnings("unused")
public class ItemHolder {

    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.COPPER_INGOT)
    public static Item COPPER_INGOT;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.TIN_INGOT)
    public static Item TIN_INGOT;

    // TODO add more ingot, nugget

    /**
     * item registerer
     */
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoItemGroup);
            event.getRegistry().register(new Item(properties).setRegistryName(RegistryHolder.COPPER_INGOT));
            event.getRegistry().register(new Item(properties).setRegistryName(RegistryHolder.TIN_INGOT));
        }
    }
}
