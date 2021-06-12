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
        FoundationItems.initRaw(registry);
    }

    /* * * * * * * * * * * * * * * Dust * * *  * * * * * * * * * * */
    public static final Item ALUMINIUM_DUST = createItem(PROPERTIES, Registries.ALUMINIUM_DUST);
    public static final Item AMETHYST_DUST = createItem(PROPERTIES, Registries.AMETHYST_DUST);
    public static final Item COAL_DUST = createItem(PROPERTIES, Registries.COAL_DUST);
    public static final Item COPPER_DUST = createItem(PROPERTIES, Registries.COPPER_DUST);
    public static final Item DIAMOND_DUST = createItem(PROPERTIES, Registries.DIAMOND_DUST);
    public static final Item EMERALD_DUST = createItem(PROPERTIES, Registries.EMERALD_DUST);
    public static final Item GOLD_DUST = createItem(PROPERTIES, Registries.GOLD_DUST);
    public static final Item IRON_DUST = createItem(PROPERTIES, Registries.IRON_DUST);
    public static final Item LAPIS_DUST = createItem(PROPERTIES, Registries.LAPIS_DUST);
    public static final Item LEAD_DUST = createItem(PROPERTIES, Registries.LEAD_DUST);
    public static final Item NICKEL_DUST = createItem(PROPERTIES, Registries.NICKEL_DUST);
    public static final Item SILVER_DUST = createItem(PROPERTIES, Registries.SILVER_DUST);
    public static final Item TIN_DUST = createItem(PROPERTIES, Registries.TIN_DUST);
    public static final Item URANIUM_DUST = createItem(PROPERTIES, Registries.URANIUM_DUST);

    private static void initDust(IForgeRegistry<Item> registry) {
        RegistryHelper.registerItem(registry,
                ALUMINIUM_DUST, AMETHYST_DUST, COAL_DUST, COPPER_DUST,
                DIAMOND_DUST, EMERALD_DUST, GOLD_DUST, IRON_DUST,
                LAPIS_DUST, LEAD_DUST, NICKEL_DUST, SILVER_DUST,
                TIN_DUST, URANIUM_DUST
        );
    }

    /* * * * * * * * * * * * * * * Nugget * * *  * * * * * * * * * * */
    public static final Item ALUMINIUM_NUGGET = createItem(PROPERTIES, Registries.ALUMINIUM_NUGGET);
    public static final Item COAL_NUGGET = createItem(PROPERTIES, Registries.COAL_NUGGET);
    public static final Item COPPER_NUGGET = createItem(PROPERTIES, Registries.COPPER_NUGGET);
    public static final Item DIAMOND_NUGGET = createItem(PROPERTIES, Registries.DIAMOND_NUGGET);
    public static final Item EMERALD_NUGGET = createItem(PROPERTIES, Registries.EMERALD_NUGGET);
    public static final Item LAPIS_NUGGET = createItem(PROPERTIES, Registries.LAPIS_NUGGET);
    public static final Item LEAD_NUGGET = createItem(PROPERTIES, Registries.LEAD_NUGGET);
    public static final Item NICKEL_NUGGET = createItem(PROPERTIES, Registries.NICKEL_NUGGET);
    public static final Item REDSTONE_NUGGET = createItem(PROPERTIES, Registries.REDSTONE_NUGGET);
    public static final Item SILVER_NUGGET = createItem(PROPERTIES, Registries.SILVER_NUGGET);
    public static final Item TIN_NUGGET = createItem(PROPERTIES, Registries.TIN_NUGGET);
    public static final Item URANIUM_NUGGET = createItem(PROPERTIES, Registries.URANIUM_NUGGET);

    private static void initNugget(IForgeRegistry<Item> registry) {
        RegistryHelper.registerItem(registry,
                ALUMINIUM_NUGGET, COAL_NUGGET, COPPER_NUGGET, DIAMOND_NUGGET,
                EMERALD_NUGGET, LAPIS_NUGGET, LEAD_NUGGET, NICKEL_NUGGET,
                REDSTONE_NUGGET, SILVER_NUGGET, TIN_NUGGET, URANIUM_NUGGET
        );
    }

    /* * * * * * * * * * * * * * * Ingot * * *  * * * * * * * * * * */
    public static final Item ALUMINIUM_INGOT = createItem(PROPERTIES, Registries.ALUMINIUM_INGOT);
    public static final Item LEAD_INGOT = createItem(PROPERTIES, Registries.LEAD_INGOT);
    public static final Item NICKEL_INGOT = createItem(PROPERTIES, Registries.NICKEL_INGOT);
    public static final Item SILVER_INGOT = createItem(PROPERTIES, Registries.SILVER_INGOT);
    public static final Item TIN_INGOT = createItem(PROPERTIES, Registries.TIN_INGOT);
    public static final Item URANIUM_INGOT = createItem(PROPERTIES, Registries.URANIUM_INGOT);

    private static void initIngot(IForgeRegistry<Item> registry) {
        RegistryHelper.registerItem(registry,
                ALUMINIUM_INGOT, LEAD_INGOT, NICKEL_INGOT, SILVER_INGOT,
                TIN_INGOT, URANIUM_INGOT
        );
    }

    /* * * * * * * * * * * * * * * Raw * * *  * * * * * * * * * * */
    public static final Item RAW_ALUMINIUM = createItem(PROPERTIES, Registries.RAW_ALUMINIUM);
    public static final Item RAW_LEAD = createItem(PROPERTIES, Registries.RAW_LEAD);
    public static final Item RAW_NICKEL = createItem(PROPERTIES, Registries.RAW_NICKEL);
    public static final Item RAW_SILVER = createItem(PROPERTIES, Registries.RAW_SILVER);
    public static final Item RAW_TIN = createItem(PROPERTIES, Registries.RAW_TIN);
    public static final Item RAW_URANIUM = createItem(PROPERTIES, Registries.RAW_URANIUM);

    private static void initRaw(IForgeRegistry<Item> registry) {
        RegistryHelper.registerItem(registry,
                RAW_ALUMINIUM, RAW_LEAD, RAW_NICKEL, RAW_SILVER,
                RAW_TIN, RAW_URANIUM
        );
    }
}
