package fr.alasdiablo.janoeo.blocks;

import fr.alasdiablo.janoeo.blocks.nether.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

public class JANOEOBlocks {

    @ObjectHolder("janoeo:coal_nether_ore")
    public static NetherCoalOre COAL_NETHER_ORE;

    @ObjectHolder("janoeo:diamond_nether_ore")
    public static NetherDiamondOre DIAMOND_NETHER_ORE;

    @ObjectHolder("janoeo:emerald_nether_ore")
    public static NetherEmeraldOre EMERALD_NETHER_ORE;

    @ObjectHolder("janoeo:gold_nether_ore")
    public static NetherGoldOre GOLD_NETHER_ORE;

    @ObjectHolder("janoeo:iron_nether_ore")
    public static NetherIronOre IRON_NETHER_ORE;

    @ObjectHolder("janoeo:lapis_nether_ore")
    public static NetherLapisOre LAPIS_NETHER_ORE;

    @ObjectHolder("janoeo:redstone_nether_ore")
    public static NetherRedstoneOre REDSTONE_NETHER_ORE;


    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new NetherCoalOre());
            event.getRegistry().register(new NetherDiamondOre());
            event.getRegistry().register(new NetherEmeraldOre());
            event.getRegistry().register(new NetherGoldOre());
            event.getRegistry().register(new NetherIronOre());
            event.getRegistry().register(new NetherLapisOre());
            event.getRegistry().register(new NetherRedstoneOre());
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            event.getRegistry().register(new BlockItem(JANOEOBlocks.COAL_NETHER_ORE, new Item.Properties()).setRegistryName("coal_nether_ore"));
            event.getRegistry().register(new BlockItem(JANOEOBlocks.DIAMOND_NETHER_ORE, new Item.Properties()).setRegistryName("diamond_nether_ore"));
            event.getRegistry().register(new BlockItem(JANOEOBlocks.EMERALD_NETHER_ORE, new Item.Properties()).setRegistryName("emerald_nether_ore"));
            event.getRegistry().register(new BlockItem(JANOEOBlocks.GOLD_NETHER_ORE, new Item.Properties()).setRegistryName("gold_nether_ore"));
            event.getRegistry().register(new BlockItem(JANOEOBlocks.IRON_NETHER_ORE, new Item.Properties()).setRegistryName("iron_nether_ore"));
            event.getRegistry().register(new BlockItem(JANOEOBlocks.LAPIS_NETHER_ORE, new Item.Properties()).setRegistryName("lapis_nether_ore"));
            event.getRegistry().register(new BlockItem(JANOEOBlocks.REDSTONE_NETHER_ORE, new Item.Properties()).setRegistryName("redstone_nether_ore"));
        }
    }
}
