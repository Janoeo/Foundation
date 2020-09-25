package fr.alasdiablo.janoeo.init;

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

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class ModBlocks {

    private static List<Block> BLOCKS;
    private static boolean init = false;

    public static Block SAPPHIRE_BLOCK;
    public static Block RUBY_BLOCK;

    public static void init() {
        if (init) {
            throw new RuntimeException("OverworldDenseOresBlocks can't be init 2 time");
        } else {
            init = true;
        }

        BLOCKS = new ArrayList<>();

        BLOCKS.add(SAPPHIRE_BLOCK = new Block(
                Block.Properties.create(Material.IRON)
                        .sound(SoundType.METAL)
                        .hardnessAndResistance(3f)
                        .harvestTool(ToolType.PICKAXE))
                .setRegistryName(Registries.RUBY_BLOCK)
        );

        BLOCKS.add(RUBY_BLOCK = new Block(
                Block.Properties.create(Material.IRON)
                        .sound(SoundType.METAL)
                        .hardnessAndResistance(3f)
                        .harvestTool(ToolType.PICKAXE))
                .setRegistryName(Registries.RUBY_BLOCK)
        );
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            for (Block block: BLOCKS) {
                event.getRegistry().register(block);
            }
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoItemGroup);
            for (Block block: BLOCKS) {
                event.getRegistry().register(new BlockItem(block, properties).setRegistryName(block.getRegistryName()));
            }
        }
    }
}
