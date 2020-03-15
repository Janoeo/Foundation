package fr.alasdiablo.janoeo.blocks;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.block.BasicBlock;
import fr.alasdiablo.janoeo.utils.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class ModBlocks {

    @ObjectHolder(Registries.MODID + ":" + Registries.SAPPHIRE_BLOCK)
    public static Block SAPPHIRE_BLOCK;

    @ObjectHolder(Registries.MODID + ":" + Registries.RUBY_BLOCK)
    public static Block RUBY_BLOCK;

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new BasicBlock(Registries.SAPPHIRE_BLOCK));
            event.getRegistry().register(new BasicBlock(Registries.RUBY_BLOCK));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoItemGroup);
            event.getRegistry().register(new BlockItem(ModBlocks.SAPPHIRE_BLOCK, properties).setRegistryName(Registries.SAPPHIRE_BLOCK));
            event.getRegistry().register(new BlockItem(ModBlocks.RUBY_BLOCK, properties).setRegistryName(Registries.RUBY_BLOCK));
        }
    }
}
