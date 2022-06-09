package fr.alasdiablo.janoeo.foundation.init;

import com.google.common.collect.ImmutableMap;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import fr.alasdiablo.janoeo.foundation.resource.ResourceType;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.function.Supplier;

public class FoundationItems {
    static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Registries.MOD_ID);
    private static final Item.Properties ITEMS_PROPERTIES = new Item.Properties().tab(Foundation.MATERIALS_GROUP);

    public static final Map<Resource, RegistryObject<Item>> DUSTS;
    public static final Map<Resource, RegistryObject<Item>> NUGGETS;
    public static final Map<Resource, RegistryObject<Item>> INGOTS;
    public static final Map<Resource, RegistryObject<Item>> RAWS;
    public static final Map<Resource, RegistryObject<Item>> RODS;
    public static final Map<Resource, RegistryObject<Item>> GEARS;

    private static @NotNull RegistryObject<Item> createItem(String registryName) {
        return register(registryName, () -> new Item(FoundationItems.ITEMS_PROPERTIES));
    }

    public static <T extends Item> RegistryObject<T> register(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    static {
        var dusts = new ImmutableMap.Builder<Resource, RegistryObject<Item>>();
        var nuggets = new ImmutableMap.Builder<Resource, RegistryObject<Item>>();
        var ingots = new ImmutableMap.Builder<Resource, RegistryObject<Item>>();
        var raws = new ImmutableMap.Builder<Resource, RegistryObject<Item>>();
        var rods = new ImmutableMap.Builder<Resource, RegistryObject<Item>>();
        var gears = new ImmutableMap.Builder<Resource, RegistryObject<Item>>();

        for (Resource resource : Resource.values()) {
            for (ResourceType type : ResourceType.ITEMS) {
                if (resource.has(type)) {
                    String name = resource.getName(type);
                    RegistryObject<Item> item = createItem(name);
                    if (type == ResourceType.Dust) dusts.put(resource, item);
                    if (type == ResourceType.Nugget) nuggets.put(resource, item);
                    if (type == ResourceType.Ingot) ingots.put(resource, item);
                    if (type == ResourceType.RawMaterialItem) raws.put(resource, item);
                    if (type == ResourceType.Rod) rods.put(resource, item);
                    if (type == ResourceType.Gear) gears.put(resource, item);
                }
            }
        }
        DUSTS = dusts.build();
        NUGGETS = nuggets.build();
        INGOTS = ingots.build();
        RAWS = raws.build();
        RODS = rods.build();
        GEARS = gears.build();
    }

    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }
}
