package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.block.BasicOre;
import fr.alasdiablo.janoeo.block.RedstoneOre;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class OverworldDenseOresBlocks {

    private static List<Block> BLOCKS;
    private static boolean init = false;

    public static Block DENSE_COAL_ORE;
    public static Block DENSE_COPPER_ORE;
    public static Block DENSE_DIAMOND_ORE;
    public static Block DENSE_EMERALD_ORE;
    public static Block DENSE_GOLD_ORE;
    public static Block DENSE_IRON_ORE;
    public static Block DENSE_LAPIS_ORE;
    public static Block DENSE_REDSTONE_ORE;
    public static Block DENSE_TIN_ORE;

    public static void init() {
        if (init) {
            throw new RuntimeException("OverworldDenseOresBlocks can't be init 2 time");
        } else {
            init = true;
        }

        BLOCKS = new ArrayList<>();

        BLOCKS.add(DENSE_COAL_ORE = new BasicOre(Registries.DENSE_COAL_ORE, 1));
        BLOCKS.add(DENSE_COPPER_ORE = new BasicOre(Registries.DENSE_COPPER_ORE, 1));
        BLOCKS.add(DENSE_DIAMOND_ORE = new BasicOre(Registries.DENSE_DIAMOND_ORE, 2));
        BLOCKS.add(DENSE_EMERALD_ORE = new BasicOre(Registries.DENSE_EMERALD_ORE, 2));
        BLOCKS.add(DENSE_GOLD_ORE = new BasicOre(Registries.DENSE_GOLD_ORE, 2));
        BLOCKS.add(DENSE_IRON_ORE = new BasicOre(Registries.DENSE_IRON_ORE, 1));
        BLOCKS.add(DENSE_LAPIS_ORE = new BasicOre(Registries.DENSE_LAPIS_ORE, 2));
        BLOCKS.add(DENSE_REDSTONE_ORE = new RedstoneOre(Registries.DENSE_REDSTONE_ORE));
        BLOCKS.add(DENSE_TIN_ORE = new BasicOre(Registries.DENSE_TIN_ORE, 1));
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
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoOreGroup);

            for (Block block: BLOCKS) {
                event.getRegistry().register(new BlockItem(block, properties).setRegistryName(block.getRegistryName()));
            }
        }
    }
}
