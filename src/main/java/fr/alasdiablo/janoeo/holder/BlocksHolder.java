package fr.alasdiablo.janoeo.holder;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.blocks.*;
import fr.alasdiablo.janoeo.blocks.end.*;
import fr.alasdiablo.janoeo.blocks.nether.*;
import fr.alasdiablo.janoeo.blocks.overworld.RedstoneOre;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneOreBlock;
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
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_COAL_ORE)
    public static Block DENSE_COAL_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_COPPER_ORE)
    public static Block DENSE_COPPER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_DIAMOND_ORE)
    public static Block DENSE_DIAMOND_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_EMERALD_ORE)
    public static Block DENSE_EMERALD_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_GOLD_ORE)
    public static Block DENSE_GOLD_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_IRON_ORE)
    public static Block DENSE_IRON_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_LAPIS_ORE)
    public static Block DENSE_LAPIS_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_REDSTONE_ORE)
    public static Block DENSE_REDSTONE_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_TIN_ORE)
    public static Block DENSE_TIN_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.ALUMINIUM_ORE)
    public static Block ALUMINIUM_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.URANIUM_ORE)
    public static Block URANIUM_ORE;

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
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_QUARTZ_NETHER_ORE)
    public static Block DENSE_QUARTZ_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_COAL_NETHER_ORE)
    public static Block DENSE_COAL_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_DIAMOND_NETHER_ORE)
    public static Block DENSE_DIAMOND_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_EMERALD_NETHER_ORE)
    public static Block DENSE_EMERALD_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_GOLD_NETHER_ORE)
    public static Block DENSE_GOLD_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_IRON_NETHER_ORE)
    public static Block DENSE_IRON_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_LAPIS_NETHER_ORE)
    public static Block DENSE_LAPIS_NETHER_ORE;
    @ObjectHolder(RegistryHolder.MODID + ":" + RegistryHolder.DENSE_REDSTONE_NETHER_ORE)
    public static Block DENSE_REDSTONE_NETHER_ORE;

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
            |       Overworld Ore register        |
            |                                     |
            +-------------------------------------*/
            event.getRegistry().register(new BasicOre(RegistryHolder.COPPER_ORE));
            event.getRegistry().register(new BasicOre(RegistryHolder.TIN_ORE));
            event.getRegistry().register(new BasicOre(RegistryHolder.DENSE_COAL_ORE));
            event.getRegistry().register(new RedstoneOre(RegistryHolder.DENSE_COPPER_ORE));
            event.getRegistry().register(new BasicOre(RegistryHolder.DENSE_DIAMOND_ORE));
            event.getRegistry().register(new BasicOre(RegistryHolder.DENSE_EMERALD_ORE));
            event.getRegistry().register(new BasicOre(RegistryHolder.DENSE_GOLD_ORE));
            event.getRegistry().register(new BasicOre(RegistryHolder.DENSE_IRON_ORE));
            event.getRegistry().register(new BasicOre(RegistryHolder.DENSE_LAPIS_ORE));
            event.getRegistry().register(new BasicOre(RegistryHolder.DENSE_REDSTONE_ORE));
            event.getRegistry().register(new BasicOre(RegistryHolder.DENSE_TIN_ORE));
            event.getRegistry().register(new BasicOre(RegistryHolder.ALUMINIUM_ORE));
            event.getRegistry().register(new BasicOre(RegistryHolder.URANIUM_ORE));

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
            event.getRegistry().register(new NetherOre(RegistryHolder.DENSE_QUARTZ_NETHER_ORE));
            event.getRegistry().register(new NetherOre(RegistryHolder.DENSE_COAL_NETHER_ORE));
            event.getRegistry().register(new NetherOre(RegistryHolder.DENSE_DIAMOND_NETHER_ORE));
            event.getRegistry().register(new NetherOre(RegistryHolder.DENSE_EMERALD_NETHER_ORE));
            event.getRegistry().register(new BasicNetherOre(RegistryHolder.DENSE_GOLD_NETHER_ORE));
            event.getRegistry().register(new BasicNetherOre(RegistryHolder.DENSE_IRON_NETHER_ORE));
            event.getRegistry().register(new NetherOre(RegistryHolder.DENSE_LAPIS_NETHER_ORE));
            event.getRegistry().register(new NetherRedstoneOre(RegistryHolder.DENSE_REDSTONE_NETHER_ORE));

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
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoOreGroup);
            /*------------------------------------+
            |                                     |
            |       Overworld Ore register        |
            |                                     |
            +-------------------------------------*/
            event.getRegistry().register(new BlockItem(BlocksHolder.COPPER_ORE, properties).setRegistryName(RegistryHolder.COPPER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.TIN_ORE, properties).setRegistryName(RegistryHolder.TIN_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_COAL_ORE, properties).setRegistryName(RegistryHolder.DENSE_COAL_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_COPPER_ORE, properties).setRegistryName(RegistryHolder.DENSE_COPPER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_DIAMOND_ORE, properties).setRegistryName(RegistryHolder.DENSE_DIAMOND_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_EMERALD_ORE, properties).setRegistryName(RegistryHolder.DENSE_EMERALD_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_GOLD_ORE, properties).setRegistryName(RegistryHolder.DENSE_GOLD_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_IRON_ORE, properties).setRegistryName(RegistryHolder.DENSE_IRON_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_LAPIS_ORE, properties).setRegistryName(RegistryHolder.DENSE_LAPIS_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_REDSTONE_ORE, properties).setRegistryName(RegistryHolder.DENSE_REDSTONE_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_TIN_ORE, properties).setRegistryName(RegistryHolder.DENSE_TIN_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.ALUMINIUM_ORE, properties).setRegistryName(RegistryHolder.ALUMINIUM_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.URANIUM_ORE, properties).setRegistryName(RegistryHolder.URANIUM_ORE));

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
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_QUARTZ_NETHER_ORE, properties).setRegistryName(RegistryHolder.DENSE_QUARTZ_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_COAL_NETHER_ORE, properties).setRegistryName(RegistryHolder.DENSE_COAL_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_DIAMOND_NETHER_ORE, properties).setRegistryName(RegistryHolder.DENSE_DIAMOND_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_EMERALD_NETHER_ORE, properties).setRegistryName(RegistryHolder.DENSE_EMERALD_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_GOLD_NETHER_ORE, properties).setRegistryName(RegistryHolder.DENSE_GOLD_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_IRON_NETHER_ORE, properties).setRegistryName(RegistryHolder.DENSE_IRON_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_LAPIS_NETHER_ORE, properties).setRegistryName(RegistryHolder.DENSE_LAPIS_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_REDSTONE_NETHER_ORE, properties).setRegistryName(RegistryHolder.DENSE_REDSTONE_NETHER_ORE));

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
