package fr.alasdiablo.janoeo.holder;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.blocks.end.*;
import fr.alasdiablo.janoeo.blocks.nether.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class BlocksHolder {

    /*------------------------------------+
    |                                     |
    |           Nether Ore List           |
    |                                     |
    +-------------------------------------*/
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.COAL_NETHER_ORE)
    public static NetherCoalOre COAL_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DIAMOND_NETHER_ORE)
    public static NetherDiamondOre DIAMOND_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.EMERALD_NETHER_ORE)
    public static NetherEmeraldOre EMERALD_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.GOLD_NETHER_ORE)
    public static NetherGoldOre GOLD_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.IRON_NETHER_ORE)
    public static NetherIronOre IRON_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.LAPIS_NETHER_ORE)
    public static NetherLapisOre LAPIS_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.REDSTONE_NETHER_ORE)
    public static NetherRedstoneOre REDSTONE_NETHER_ORE;

    /*------------------------------------+
    |                                     |
    |            End Ore List             |
    |                                     |
    +-------------------------------------*/
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.COAL_END_ORE)
    public static EndCoalOre COAL_END_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DIAMOND_END_ORE)
    public static EndDiamondOre DIAMOND_END_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.EMERALD_END_ORE)
    public static EndEmeraldOre EMERALD_END_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.GOLD_END_ORE)
    public static EndGoldOre GOLD_END_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.IRON_END_ORE)
    public static EndIronOre IRON_END_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.LAPIS_END_ORE)
    public static EndLapisOre LAPIS_END_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.REDSTONE_END_ORE)
    public static EndRedstoneOre REDSTONE_END_ORE;


    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            /*------------------------------------+
            |                                     |
            |         Nether Ore register         |
            |                                     |
            +-------------------------------------*/
            event.getRegistry().register(new NetherCoalOre(RegistryHolder.COAL_NETHER_ORE));
            event.getRegistry().register(new NetherDiamondOre(RegistryHolder.DIAMOND_NETHER_ORE));
            event.getRegistry().register(new NetherEmeraldOre(RegistryHolder.EMERALD_NETHER_ORE));
            event.getRegistry().register(new NetherGoldOre(RegistryHolder.GOLD_NETHER_ORE));
            event.getRegistry().register(new NetherIronOre(RegistryHolder.IRON_NETHER_ORE));
            event.getRegistry().register(new NetherLapisOre(RegistryHolder.LAPIS_NETHER_ORE));
            event.getRegistry().register(new NetherRedstoneOre(RegistryHolder.REDSTONE_NETHER_ORE));

            /*------------------------------------+
            |                                     |
            |          End Ore register           |
            |                                     |
            +-------------------------------------*/
            event.getRegistry().register(new EndCoalOre(RegistryHolder.COAL_END_ORE));
            event.getRegistry().register(new EndDiamondOre(RegistryHolder.DIAMOND_END_ORE));
            event.getRegistry().register(new EndEmeraldOre(RegistryHolder.EMERALD_END_ORE));
            event.getRegistry().register(new EndGoldOre(RegistryHolder.GOLD_END_ORE));
            event.getRegistry().register(new EndIronOre(RegistryHolder.IRON_END_ORE));
            event.getRegistry().register(new EndLapisOre(RegistryHolder.LAPIS_END_ORE));
            event.getRegistry().register(new EndRedstoneOre(RegistryHolder.REDSTONE_END_ORE));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoGroup);
            /*------------------------------------+
            |                                     |
            |         Nether Ore register         |
            |                                     |
            +-------------------------------------*/
            event.getRegistry().register(new BlockItem(BlocksHolder.COAL_NETHER_ORE, properties).setRegistryName(RegistryHolder.COAL_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DIAMOND_NETHER_ORE, properties).setRegistryName(RegistryHolder.DIAMOND_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.EMERALD_NETHER_ORE, properties).setRegistryName(RegistryHolder.EMERALD_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.GOLD_NETHER_ORE, properties).setRegistryName(RegistryHolder.GOLD_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.IRON_NETHER_ORE, properties).setRegistryName(RegistryHolder.IRON_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.LAPIS_NETHER_ORE, properties).setRegistryName(RegistryHolder.LAPIS_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.REDSTONE_NETHER_ORE, properties).setRegistryName(RegistryHolder.REDSTONE_NETHER_ORE));

            /*------------------------------------+
            |                                     |
            |          End Ore register           |
            |                                     |
            +-------------------------------------*/
            event.getRegistry().register(new BlockItem(BlocksHolder.COAL_END_ORE, properties).setRegistryName(RegistryHolder.COAL_END_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DIAMOND_END_ORE, properties).setRegistryName(RegistryHolder.DIAMOND_END_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.EMERALD_END_ORE, properties).setRegistryName(RegistryHolder.EMERALD_END_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.GOLD_END_ORE, properties).setRegistryName(RegistryHolder.GOLD_END_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.IRON_END_ORE, properties).setRegistryName(RegistryHolder.IRON_END_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.LAPIS_END_ORE, properties).setRegistryName(RegistryHolder.LAPIS_END_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.REDSTONE_END_ORE, properties).setRegistryName(RegistryHolder.REDSTONE_END_ORE));
        }
    }
}
