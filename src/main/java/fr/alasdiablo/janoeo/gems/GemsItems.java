package fr.alasdiablo.janoeo.gems;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.utils.Registries;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class GemsItems {

    @ObjectHolder(Registries.MODID + ":" + Registries.RUBY)
    public static Item RUBY;
    @ObjectHolder(Registries.MODID + ":" + Registries.SAPPHIRE)
    public static Item SAPPHIRE;

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoItemGroup);
            event.getRegistry().register(new Item(properties).setRegistryName(Registries.RUBY));
            event.getRegistry().register(new Item(properties).setRegistryName(Registries.SAPPHIRE));
        }
    }
}
