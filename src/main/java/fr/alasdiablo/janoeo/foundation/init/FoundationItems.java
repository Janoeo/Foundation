package fr.alasdiablo.janoeo.foundation.init;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class FoundationItems {

    private static final Item.Properties PROPERTIES = new Item.Properties().group(Foundation.ITEMS_GROUP);

    private static Item createItem(Item.Properties properties, String registryName) {
        return new Item(properties).setRegistryName(registryName);
    }

    public static void init(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        FoundationItems.initDust(registry);
        FoundationItems.initNugget(registry);
        FoundationItems.initIngot(registry);
    }

    /* * * * * * * * * * * * * * * Dust * * *  * * * * * * * * * * */
    public static Item AMETHYST_DUST = createItem(PROPERTIES, Registries.AMETHYST_DUST);
    public static Item COAL_DUST     = createItem(PROPERTIES, Registries.COAL_DUST);
    public static Item COPPER_DUST   = createItem(PROPERTIES, Registries.COPPER_DUST);
    public static Item DIAMOND_DUST  = createItem(PROPERTIES, Registries.DIAMOND_DUST);
    public static Item EMERALD_DUST  = createItem(PROPERTIES, Registries.EMERALD_DUST);
    public static Item GOLD_DUST     = createItem(PROPERTIES, Registries.GOLD_DUST);
    public static Item IRON_DUST = createItem(PROPERTIES, Registries.IRON_DUST);
    public static Item LAPIS_DUST = createItem(PROPERTIES, Registries.LAPIS_DUST);

    private static void initDust(IForgeRegistry<Item> registry) {
        RegistryHelper.registerItem(registry,
                AMETHYST_DUST, COAL_DUST, COPPER_DUST, DIAMOND_DUST,
                EMERALD_DUST, GOLD_DUST, IRON_DUST, LAPIS_DUST
        );
    }

    /* * * * * * * * * * * * * * * Nugget * * *  * * * * * * * * * * */
    public static Item ALUMINIUM_NUGGET = createItem(PROPERTIES, Registries.ALUMINIUM_NUGGET);
    public static Item COPPER_NUGGET = createItem(PROPERTIES, Registries.COPPER_NUGGET);
    public static Item LEAD_NUGGET = createItem(PROPERTIES, Registries.LEAD_NUGGET);
    public static Item NICKEL_NUGGET = createItem(PROPERTIES, Registries.NICKEL_NUGGET);
    public static Item SILVER_NUGGET = createItem(PROPERTIES, Registries.SILVER_NUGGET);
    public static Item TIN_NUGGET = createItem(PROPERTIES, Registries.TIN_NUGGET);
    public static Item URANIUM_NUGGET = createItem(PROPERTIES, Registries.URANIUM_NUGGET);

    private static void initNugget(IForgeRegistry<Item> registry) {
        RegistryHelper.registerItem(registry,
                ALUMINIUM_NUGGET, COPPER_NUGGET, LEAD_NUGGET,
                NICKEL_NUGGET, SILVER_NUGGET, TIN_NUGGET,
                URANIUM_NUGGET
        );
    }

    /* * * * * * * * * * * * * * * Ingot * * *  * * * * * * * * * * */
    public static Item ALUMINIUM_INGOT = createItem(PROPERTIES, Registries.ALUMINIUM_INGOT);
    public static Item LEAD_INGOT = createItem(PROPERTIES, Registries.LEAD_INGOT);
    public static Item NICKEL_INGOT = createItem(PROPERTIES, Registries.NICKEL_INGOT);
    public static Item SILVER_INGOT = createItem(PROPERTIES, Registries.SILVER_INGOT);
    public static Item TIN_INGOT = createItem(PROPERTIES, Registries.TIN_INGOT);
    public static Item URANIUM_INGOT = createItem(PROPERTIES, Registries.URANIUM_INGOT);

    private static void initIngot(IForgeRegistry<Item> registry) {
        RegistryHelper.registerItem(registry,
                ALUMINIUM_INGOT, LEAD_INGOT, NICKEL_INGOT,
                SILVER_INGOT, TIN_INGOT, URANIUM_INGOT
        );
    }
}
