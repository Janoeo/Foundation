package fr.alasdiablo.janoeo.foundation.init;

import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class FoundationItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Registries.MOD_ID);
    private static final Item.Properties ITEMS_PROPERTIES = new Item.Properties().tab(Foundation.MATERIALS_GROUP);
    /* * * * * * * * * * * * * * * Dust * * *  * * * * * * * * * * */
    public static final RegistryObject<Item> ALUMINIUM_DUST = createItem(Registries.ALUMINIUM_DUST);
    public static final RegistryObject<Item> AMETHYST_DUST = createItem(Registries.AMETHYST_DUST);
    public static final RegistryObject<Item> COAL_DUST = createItem(Registries.COAL_DUST);
    public static final RegistryObject<Item> COPPER_DUST = createItem(Registries.COPPER_DUST);
    public static final RegistryObject<Item> DIAMOND_DUST = createItem(Registries.DIAMOND_DUST);
    public static final RegistryObject<Item> EMERALD_DUST = createItem(Registries.EMERALD_DUST);
    public static final RegistryObject<Item> GOLD_DUST = createItem(Registries.GOLD_DUST);
    public static final RegistryObject<Item> IRON_DUST = createItem(Registries.IRON_DUST);
    public static final RegistryObject<Item> LAPIS_DUST = createItem(Registries.LAPIS_DUST);
    public static final RegistryObject<Item> LEAD_DUST = createItem(Registries.LEAD_DUST);
    public static final RegistryObject<Item> NICKEL_DUST = createItem(Registries.NICKEL_DUST);
    public static final RegistryObject<Item> SILVER_DUST = createItem(Registries.SILVER_DUST);
    public static final RegistryObject<Item> TIN_DUST = createItem(Registries.TIN_DUST);
    public static final RegistryObject<Item> URANIUM_DUST = createItem(Registries.URANIUM_DUST);
    /* * * * * * * * * * * * * * * Nugget * * *  * * * * * * * * * * */
    public static final RegistryObject<Item> ALUMINIUM_NUGGET = createItem(Registries.ALUMINIUM_NUGGET);
    public static final RegistryObject<Item> COAL_NUGGET = createItem(Registries.COAL_NUGGET);
    public static final RegistryObject<Item> COPPER_NUGGET = createItem(Registries.COPPER_NUGGET);
    public static final RegistryObject<Item> DIAMOND_NUGGET = createItem(Registries.DIAMOND_NUGGET);
    public static final RegistryObject<Item> EMERALD_NUGGET = createItem(Registries.EMERALD_NUGGET);
    public static final RegistryObject<Item> LAPIS_NUGGET = createItem(Registries.LAPIS_NUGGET);
    public static final RegistryObject<Item> LEAD_NUGGET = createItem(Registries.LEAD_NUGGET);
    public static final RegistryObject<Item> NICKEL_NUGGET = createItem(Registries.NICKEL_NUGGET);
    public static final RegistryObject<Item> REDSTONE_NUGGET = createItem(Registries.REDSTONE_NUGGET);
    public static final RegistryObject<Item> SILVER_NUGGET = createItem(Registries.SILVER_NUGGET);
    public static final RegistryObject<Item> TIN_NUGGET = createItem(Registries.TIN_NUGGET);
    public static final RegistryObject<Item> URANIUM_NUGGET = createItem(Registries.URANIUM_NUGGET);
    /* * * * * * * * * * * * * * * Ingot * * *  * * * * * * * * * * */
    public static final RegistryObject<Item> ALUMINIUM_INGOT = createItem(Registries.ALUMINIUM_INGOT);
    public static final RegistryObject<Item> LEAD_INGOT = createItem(Registries.LEAD_INGOT);
    public static final RegistryObject<Item> NICKEL_INGOT = createItem(Registries.NICKEL_INGOT);
    public static final RegistryObject<Item> SILVER_INGOT = createItem(Registries.SILVER_INGOT);
    public static final RegistryObject<Item> TIN_INGOT = createItem(Registries.TIN_INGOT);
    public static final RegistryObject<Item> URANIUM_INGOT = createItem(Registries.URANIUM_INGOT);
    /* * * * * * * * * * * * * * * Raw * * *  * * * * * * * * * * */
    public static final RegistryObject<Item> RAW_ALUMINIUM = createItem(Registries.RAW_ALUMINIUM);
    public static final RegistryObject<Item> RAW_LEAD = createItem(Registries.RAW_LEAD);
    public static final RegistryObject<Item> RAW_NICKEL = createItem(Registries.RAW_NICKEL);
    public static final RegistryObject<Item> RAW_SILVER = createItem(Registries.RAW_SILVER);
    public static final RegistryObject<Item> RAW_TIN = createItem(Registries.RAW_TIN);
    public static final RegistryObject<Item> RAW_URANIUM = createItem(Registries.RAW_URANIUM);
    /* * * * * * * * * * * * * * * Stick * * *  * * * * * * * * * * */
    public static final RegistryObject<Item> COPPER_STICK = createItem(Registries.COPPER_STICK);
    public static final RegistryObject<Item> DIAMOND_STICK = createItem(Registries.DIAMOND_STICK);
    public static final RegistryObject<Item> GOLD_STICK = createItem(Registries.GOLD_STICK);
    public static final RegistryObject<Item> IRON_STICK = createItem(Registries.IRON_STICK);
    public static final RegistryObject<Item> SILVER_STICK = createItem(Registries.SILVER_STICK);
    public static final RegistryObject<Item> TIN_STICK = createItem(Registries.TIN_STICK);
    /* * * * * * * * * * * * * * * Gear * * *  * * * * * * * * * * */
    public static final RegistryObject<Item> COPPER_GEAR = createItem(Registries.COPPER_GEAR);
    public static final RegistryObject<Item> DIAMOND_GEAR = createItem(Registries.DIAMOND_GEAR);
    public static final RegistryObject<Item> GOLD_GEAR = createItem(Registries.GOLD_GEAR);
    public static final RegistryObject<Item> IRON_GEAR = createItem(Registries.IRON_GEAR);
    public static final RegistryObject<Item> SILVER_GEAR = createItem(Registries.SILVER_GEAR);
    public static final RegistryObject<Item> TIN_GEAR = createItem(Registries.TIN_GEAR);
    public static final RegistryObject<Item> WOODEN_GEAR = createItem(Registries.WOODEN_GEAR);

    private static @NotNull RegistryObject<Item> createItem(String registryName) {
        return register(registryName, () -> new Item(FoundationItems.ITEMS_PROPERTIES));
    }

    public static <T extends Item> RegistryObject<T> register(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }
}
