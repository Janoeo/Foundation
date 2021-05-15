package fr.alasdiablo.janoeo.foundation.init;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;

public class FoundationItems {
    /* * * * * * * * * * * * Item Properties * * * * * * * * * * * */
    private static final Item.Properties PROPERTIES = new Item.Properties().group(Foundation.ITEMS_GROUP);

    /* * * * * * * * * * * * * * * Dust * * *  * * * * * * * * * * */
    public static Item AMETHYST_DUST = createItem(PROPERTIES, Registries.AMETHYST_DUST);
    public static Item COAL_DUST = createItem(PROPERTIES, Registries.COAL_DUST);
    public static Item COPPER_DUST = createItem(PROPERTIES, Registries.COPPER_DUST);
    public static Item DIAMOND_DUST = createItem(PROPERTIES, Registries.DIAMOND_DUST);
    public static Item EMERALD_DUST = createItem(PROPERTIES, Registries.EMERALD_DUST);
    public static Item GOLD_DUST = createItem(PROPERTIES, Registries.GOLD_DUST);
    public static Item IRON_DUST = createItem(PROPERTIES, Registries.IRON_DUST);
    public static Item LAPIS_DUST = createItem(PROPERTIES, Registries.LAPIS_DUST);

    /* * * * * * * * * * * * * * * Nugget * * *  * * * * * * * * * * */
    public static Item COPPER_NUGGET = createItem(PROPERTIES, Registries.COPPER_NUGGET);

    private static Item createItem(Item.Properties properties, String registryName) {
        return new Item(properties).setRegistryName(registryName);
    }

    public static void init(RegistryEvent.Register<Item> event) {
        RegistryHelper.registerItem(
                event.getRegistry(),
                AMETHYST_DUST, COAL_DUST, COPPER_DUST, DIAMOND_DUST,
                EMERALD_DUST, GOLD_DUST, IRON_DUST, LAPIS_DUST,
                COPPER_NUGGET
        );
    }
}
