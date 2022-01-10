package fr.alasdiablo.janoeo.foundation.init;

import fr.alasdiablo.diolib.registries.RegistryHelper;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class FoundationItems {
    private static final Item.Properties PROPERTIES_ORES = new Item.Properties().tab(Foundation.ORES_ITEMS_GROUP);
    /* * * * * * * * * * * * * * * Dust * * *  * * * * * * * * * * */
    public static final  Item            ALUMINIUM_DUST = createItem(PROPERTIES_ORES, Registries.ALUMINIUM_DUST);
    public static final  Item            AMETHYST_DUST = createItem(PROPERTIES_ORES, Registries.AMETHYST_DUST);
    public static final  Item            COAL_DUST = createItem(PROPERTIES_ORES, Registries.COAL_DUST);
    public static final  Item            COPPER_DUST = createItem(PROPERTIES_ORES, Registries.COPPER_DUST);
    public static final  Item            DIAMOND_DUST = createItem(PROPERTIES_ORES, Registries.DIAMOND_DUST);
    public static final  Item            EMERALD_DUST = createItem(PROPERTIES_ORES, Registries.EMERALD_DUST);
    public static final  Item            GOLD_DUST = createItem(PROPERTIES_ORES, Registries.GOLD_DUST);
    public static final  Item            IRON_DUST = createItem(PROPERTIES_ORES, Registries.IRON_DUST);
    public static final  Item            LAPIS_DUST = createItem(PROPERTIES_ORES, Registries.LAPIS_DUST);
    public static final  Item            LEAD_DUST = createItem(PROPERTIES_ORES, Registries.LEAD_DUST);
    public static final  Item            NICKEL_DUST = createItem(PROPERTIES_ORES, Registries.NICKEL_DUST);
    public static final  Item            SILVER_DUST = createItem(PROPERTIES_ORES, Registries.SILVER_DUST);
    public static final  Item            TIN_DUST = createItem(PROPERTIES_ORES, Registries.TIN_DUST);
    public static final  Item            URANIUM_DUST = createItem(PROPERTIES_ORES, Registries.URANIUM_DUST);
    /* * * * * * * * * * * * * * * Nugget * * *  * * * * * * * * * * */
    public static final  Item            ALUMINIUM_NUGGET = createItem(PROPERTIES_ORES, Registries.ALUMINIUM_NUGGET);
    public static final  Item            COAL_NUGGET = createItem(PROPERTIES_ORES, Registries.COAL_NUGGET);
    public static final  Item            COPPER_NUGGET = createItem(PROPERTIES_ORES, Registries.COPPER_NUGGET);
    public static final  Item            DIAMOND_NUGGET = createItem(PROPERTIES_ORES, Registries.DIAMOND_NUGGET);
    public static final  Item            EMERALD_NUGGET = createItem(PROPERTIES_ORES, Registries.EMERALD_NUGGET);
    public static final  Item            LAPIS_NUGGET = createItem(PROPERTIES_ORES, Registries.LAPIS_NUGGET);
    public static final  Item            LEAD_NUGGET = createItem(PROPERTIES_ORES, Registries.LEAD_NUGGET);
    public static final  Item            NICKEL_NUGGET = createItem(PROPERTIES_ORES, Registries.NICKEL_NUGGET);
    public static final  Item            REDSTONE_NUGGET = createItem(PROPERTIES_ORES, Registries.REDSTONE_NUGGET);
    public static final  Item            SILVER_NUGGET = createItem(PROPERTIES_ORES, Registries.SILVER_NUGGET);
    public static final  Item            TIN_NUGGET = createItem(PROPERTIES_ORES, Registries.TIN_NUGGET);
    public static final  Item            URANIUM_NUGGET = createItem(PROPERTIES_ORES, Registries.URANIUM_NUGGET);
    /* * * * * * * * * * * * * * * Ingot * * *  * * * * * * * * * * */
    public static final  Item            ALUMINIUM_INGOT = createItem(PROPERTIES_ORES, Registries.ALUMINIUM_INGOT);
    public static final  Item            LEAD_INGOT = createItem(PROPERTIES_ORES, Registries.LEAD_INGOT);
    public static final  Item            NICKEL_INGOT = createItem(PROPERTIES_ORES, Registries.NICKEL_INGOT);
    public static final  Item            SILVER_INGOT = createItem(PROPERTIES_ORES, Registries.SILVER_INGOT);
    public static final  Item            TIN_INGOT = createItem(PROPERTIES_ORES, Registries.TIN_INGOT);
    public static final  Item            URANIUM_INGOT = createItem(PROPERTIES_ORES, Registries.URANIUM_INGOT);
    /* * * * * * * * * * * * * * * Raw * * *  * * * * * * * * * * */
    public static final  Item            RAW_ALUMINIUM = createItem(PROPERTIES_ORES, Registries.RAW_ALUMINIUM);
    public static final  Item            RAW_LEAD = createItem(PROPERTIES_ORES, Registries.RAW_LEAD);
    public static final  Item            RAW_NICKEL = createItem(PROPERTIES_ORES, Registries.RAW_NICKEL);
    public static final  Item            RAW_SILVER = createItem(PROPERTIES_ORES, Registries.RAW_SILVER);
    public static final  Item            RAW_TIN = createItem(PROPERTIES_ORES, Registries.RAW_TIN);
    public static final  Item            RAW_URANIUM = createItem(PROPERTIES_ORES, Registries.RAW_URANIUM);
    /* * * * * * * * * * * * * * * Other * * *  * * * * * * * * * * */
    public static final  Item            SCRAP = createItem(PROPERTIES_ORES, Registries.SCRAP);
    private static final Item.Properties PROPERTIES_GEAR = new Item.Properties().tab(Foundation.GEAR_ITEMS_GROUP);
    /* * * * * * * * * * * * * * * Stick * * *  * * * * * * * * * * */
    public static final  Item            COPPER_STICK = createItem(PROPERTIES_GEAR, Registries.COPPER_STICK);
    public static final  Item            DIAMOND_STICK = createItem(PROPERTIES_GEAR, Registries.DIAMOND_STICK);
    public static final  Item            GOLD_STICK = createItem(PROPERTIES_GEAR, Registries.GOLD_STICK);
    public static final  Item            IRON_STICK = createItem(PROPERTIES_GEAR, Registries.IRON_STICK);
    public static final  Item            SILVER_STICK = createItem(PROPERTIES_GEAR, Registries.SILVER_STICK);
    public static final  Item            TIN_STICK = createItem(PROPERTIES_GEAR, Registries.TIN_STICK);
    /* * * * * * * * * * * * * * * Gear * * *  * * * * * * * * * * */
    public static final  Item            COPPER_GEAR = createItem(PROPERTIES_GEAR, Registries.COPPER_GEAR);
    public static final  Item            DIAMOND_GEAR = createItem(PROPERTIES_GEAR, Registries.DIAMOND_GEAR);
    public static final  Item            GOLD_GEAR = createItem(PROPERTIES_GEAR, Registries.GOLD_GEAR);
    public static final  Item            IRON_GEAR = createItem(PROPERTIES_GEAR, Registries.IRON_GEAR);
    public static final  Item            SILVER_GEAR = createItem(PROPERTIES_GEAR, Registries.SILVER_GEAR);
    public static final  Item            TIN_GEAR = createItem(PROPERTIES_GEAR, Registries.TIN_GEAR);
    public static final  Item            WOODEN_GEAR = createItem(PROPERTIES_GEAR, Registries.WOODEN_GEAR);

    @Contract("_, _ -> new")
    private static @NotNull Item createItem(Item.Properties properties, String registryName) {
        return new Item(properties).setRegistryName(registryName);
    }

    public static void init(RegistryEvent.@NotNull Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        initDust(registry);
        initNugget(registry);
        initIngot(registry);
        initRaw(registry);
        initOther(registry);
    }

    private static void initDust(IForgeRegistry<Item> registry) {
        RegistryHelper.registerItem(
                registry, ALUMINIUM_DUST, AMETHYST_DUST, COAL_DUST, COPPER_DUST, DIAMOND_DUST, EMERALD_DUST, GOLD_DUST, IRON_DUST, LAPIS_DUST, LEAD_DUST,
                NICKEL_DUST, SILVER_DUST, TIN_DUST, URANIUM_DUST
        );
    }

    private static void initNugget(IForgeRegistry<Item> registry) {
        RegistryHelper.registerItem(
                registry, ALUMINIUM_NUGGET, COAL_NUGGET, COPPER_NUGGET, DIAMOND_NUGGET, EMERALD_NUGGET, LAPIS_NUGGET, LEAD_NUGGET, NICKEL_NUGGET,
                REDSTONE_NUGGET, SILVER_NUGGET, TIN_NUGGET, URANIUM_NUGGET
        );
    }

    private static void initIngot(IForgeRegistry<Item> registry) {
        RegistryHelper.registerItem(registry, ALUMINIUM_INGOT, LEAD_INGOT, NICKEL_INGOT, SILVER_INGOT, TIN_INGOT, URANIUM_INGOT);
    }

    private static void initRaw(IForgeRegistry<Item> registry) {
        RegistryHelper.registerItem(registry, RAW_ALUMINIUM, RAW_LEAD, RAW_NICKEL, RAW_SILVER, RAW_TIN, RAW_URANIUM);
    }

    private static void initOther(IForgeRegistry<Item> registry) {
        RegistryHelper.registerItem(
                registry, SCRAP, COPPER_STICK, DIAMOND_STICK, GOLD_STICK, SILVER_STICK, TIN_STICK, COPPER_GEAR, DIAMOND_GEAR, GOLD_GEAR, SILVER_GEAR, TIN_GEAR,
                WOODEN_GEAR, IRON_STICK, IRON_GEAR
        );
    }
}
