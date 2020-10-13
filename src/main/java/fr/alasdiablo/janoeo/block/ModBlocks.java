package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
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
            event.getRegistry().register(new Block(
                    Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(3f).harvestTool(ToolType.PICKAXE)
            ).setRegistryName(Registries.RUBY_BLOCK));
            event.getRegistry().register(new Block(
                    Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(3f).harvestTool(ToolType.PICKAXE)
            ).setRegistryName(Registries.SAPPHIRE_BLOCK));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoItemGroup);
            event.getRegistry().register(new BlockItem(ModBlocks.SAPPHIRE_BLOCK, properties).setRegistryName(Registries.SAPPHIRE_BLOCK));
            event.getRegistry().register(new BlockItem(ModBlocks.RUBY_BLOCK, properties).setRegistryName(Registries.RUBY_BLOCK));
        }
    }
}
