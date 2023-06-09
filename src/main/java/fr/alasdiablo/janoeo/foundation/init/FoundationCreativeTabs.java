package fr.alasdiablo.janoeo.foundation.init;

import fr.alasdiablo.diolib.api.item.GroundCreativeModeTab;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class FoundationCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Foundation.MOD_ID);

    public static RegistryObject<CreativeModeTab> MATERIALS_GROUP = CREATIVE_TABS.register("materials", () -> {
        CreativeModeTab.Builder builder = CreativeModeTab.builder();
        GroundCreativeModeTab.createBaseBuilder(builder);
        builder.title(Component.translatable("item_group." + Foundation.MOD_ID + ".materials"));
        builder.icon(() -> new ItemStack(FoundationItems.GEARS.get(Resource.Silver).get()));
        builder.displayItems(FoundationItems::displayItemsGenerator);
        return builder.build();
    });

    public static RegistryObject<CreativeModeTab> ORES_GROUP = CREATIVE_TABS.register("ores", () -> {
        CreativeModeTab.Builder builder = CreativeModeTab.builder();
        GroundCreativeModeTab.createBaseBuilder(builder);
        // builder.title(Component.translatable("item_group." + Foundation.MOD_ID + ".ores"));
        builder.icon(() -> new ItemStack(FoundationBlocks.STONE_ORES.get(Resource.Silver).get()));
        builder.displayItems(FoundationBlocks::displayItemsGenerator);
        return builder.build();
    });

    public static void init(IEventBus bus) {
        CREATIVE_TABS.register(bus);
    }
}
