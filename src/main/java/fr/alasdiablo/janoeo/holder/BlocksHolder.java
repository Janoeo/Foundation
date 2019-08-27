package fr.alasdiablo.janoeo.holder;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.blocks.*;
import fr.alasdiablo.janoeo.blocks.end.*;
import fr.alasdiablo.janoeo.blocks.nether.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

/**
 * class with all block
 */
@SuppressWarnings("unused")
public class BlocksHolder {

    /*------------------------------------+
    |                                     |
    |         Overworld Ore List          |
    |                                     |
    +-------------------------------------*/
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.COPPER_ORE)
    public static Block COPPER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.TIN_ORE)
    public static Block TIN_ORE;

    /*------------------------------------+
    |                                     |
    |           Nether Ore List           |
    |                                     |
    +-------------------------------------*/
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.COAL_NETHER_ORE)
    public static Block COAL_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DIAMOND_NETHER_ORE)
    public static Block DIAMOND_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.EMERALD_NETHER_ORE)
    public static Block EMERALD_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.GOLD_NETHER_ORE)
    public static Block GOLD_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.IRON_NETHER_ORE)
    public static Block IRON_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.LAPIS_NETHER_ORE)
    public static Block LAPIS_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.REDSTONE_NETHER_ORE)
    public static Block REDSTONE_NETHER_ORE;

    /*------------------------------------+
    |                                     |
    |            End Ore List             |
    |                                     |
    +-------------------------------------*/
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.COAL_END_ORE)
    public static Block COAL_END_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DIAMOND_END_ORE)
    public static Block DIAMOND_END_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.EMERALD_END_ORE)
    public static Block EMERALD_END_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.GOLD_END_ORE)
    public static Block GOLD_END_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.IRON_END_ORE)
    public static Block IRON_END_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.LAPIS_END_ORE)
    public static Block LAPIS_END_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.REDSTONE_END_ORE)
    public static Block REDSTONE_END_ORE;


    /**
     * Class for handler the registry in minecraft
     */
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            /*------------------------------------+
            |                                     |
            |         Overworld Ore List          |
            |                                     |
            +-------------------------------------*/
            event.getRegistry().register(new BasicOre(RegistryHolder.COPPER_ORE));
            event.getRegistry().register(new BasicOre(RegistryHolder.TIN_ORE));

            /*------------------------------------+
            |                                     |
            |         Nether Ore register         |
            |                                     |
            +-------------------------------------*/
            event.getRegistry().register(new NetherOre(RegistryHolder.COAL_NETHER_ORE));
            event.getRegistry().register(new NetherOre(RegistryHolder.DIAMOND_NETHER_ORE));
            event.getRegistry().register(new NetherOre(RegistryHolder.EMERALD_NETHER_ORE));
            event.getRegistry().register(new BasicNetherOre(RegistryHolder.GOLD_NETHER_ORE));
            event.getRegistry().register(new BasicNetherOre(RegistryHolder.IRON_NETHER_ORE));
            event.getRegistry().register(new NetherOre(RegistryHolder.LAPIS_NETHER_ORE));
            event.getRegistry().register(new NetherRedstoneOre(RegistryHolder.REDSTONE_NETHER_ORE));

            /*------------------------------------+
            |                                     |
            |          End Ore register           |
            |                                     |
            +-------------------------------------*/
            event.getRegistry().register(new EndOre(RegistryHolder.COAL_END_ORE));
            event.getRegistry().register(new EndOre(RegistryHolder.DIAMOND_END_ORE));
            event.getRegistry().register(new EndOre(RegistryHolder.EMERALD_END_ORE));
            event.getRegistry().register(new BasicEndOre(RegistryHolder.GOLD_END_ORE));
            event.getRegistry().register(new BasicEndOre(RegistryHolder.IRON_END_ORE));
            event.getRegistry().register(new EndOre(RegistryHolder.LAPIS_END_ORE));
            event.getRegistry().register(new EndRedstoneOre(RegistryHolder.REDSTONE_END_ORE));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoGroup);
            /*------------------------------------+
            |                                     |
            |         Overworld Ore List          |
            |                                     |
            +-------------------------------------*/
            event.getRegistry().register(new BlockItem(BlocksHolder.COPPER_ORE, properties).setRegistryName(RegistryHolder.COPPER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.TIN_ORE, properties).setRegistryName(RegistryHolder.TIN_ORE));


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
