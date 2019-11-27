package fr.alasdiablo.janoeo.holder;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.blocks.*;
import fr.alasdiablo.janoeo.blocks.end.*;
import fr.alasdiablo.janoeo.blocks.nether.*;
import fr.alasdiablo.janoeo.blocks.overworld.RedstoneOre;
import fr.alasdiablo.janoeo.utils.Registries;
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
    @ObjectHolder(Registries.MODID + ":" + Registries.COPPER_ORE)
    public static Block COPPER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.TIN_ORE)
    public static Block TIN_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_COAL_ORE)
    public static Block DENSE_COAL_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_COPPER_ORE)
    public static Block DENSE_COPPER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_DIAMOND_ORE)
    public static Block DENSE_DIAMOND_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_EMERALD_ORE)
    public static Block DENSE_EMERALD_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_GOLD_ORE)
    public static Block DENSE_GOLD_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_IRON_ORE)
    public static Block DENSE_IRON_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_LAPIS_ORE)
    public static Block DENSE_LAPIS_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_REDSTONE_ORE)
    public static Block DENSE_REDSTONE_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_TIN_ORE)
    public static Block DENSE_TIN_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.ALUMINIUM_ORE)
    public static Block ALUMINIUM_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.URANIUM_ORE)
    public static Block URANIUM_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.SILVER_ORE)
    public static Block SILVER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.LEAD_ORE)
    public static Block LEAD_ORE;

    /*------------------------------------+
    |                                     |
    |           Nether Ore List           |
    |                                     |
    +-------------------------------------*/
    @ObjectHolder(Registries.MODID + ":" + Registries.COAL_NETHER_ORE)
    public static Block COAL_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DIAMOND_NETHER_ORE)
    public static Block DIAMOND_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.EMERALD_NETHER_ORE)
    public static Block EMERALD_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.GOLD_NETHER_ORE)
    public static Block GOLD_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.IRON_NETHER_ORE)
    public static Block IRON_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.LAPIS_NETHER_ORE)
    public static Block LAPIS_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.REDSTONE_NETHER_ORE)
    public static Block REDSTONE_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_QUARTZ_NETHER_ORE)
    public static Block DENSE_QUARTZ_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_COAL_NETHER_ORE)
    public static Block DENSE_COAL_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_DIAMOND_NETHER_ORE)
    public static Block DENSE_DIAMOND_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_EMERALD_NETHER_ORE)
    public static Block DENSE_EMERALD_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_GOLD_NETHER_ORE)
    public static Block DENSE_GOLD_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_IRON_NETHER_ORE)
    public static Block DENSE_IRON_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_LAPIS_NETHER_ORE)
    public static Block DENSE_LAPIS_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DENSE_REDSTONE_NETHER_ORE)
    public static Block DENSE_REDSTONE_NETHER_ORE;

    /*------------------------------------+
    |                                     |
    |            End Ore List             |
    |                                     |
    +-------------------------------------*/
    @ObjectHolder(Registries.MODID + ":" + Registries.COAL_END_ORE)
    public static Block COAL_END_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.DIAMOND_END_ORE)
    public static Block DIAMOND_END_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.EMERALD_END_ORE)
    public static Block EMERALD_END_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.GOLD_END_ORE)
    public static Block GOLD_END_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.IRON_END_ORE)
    public static Block IRON_END_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.LAPIS_END_ORE)
    public static Block LAPIS_END_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.REDSTONE_END_ORE)
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
            event.getRegistry().register(new BasicOre(Registries.COPPER_ORE, 1));
            event.getRegistry().register(new BasicOre(Registries.TIN_ORE, 1));
            event.getRegistry().register(new BasicOre(Registries.DENSE_COAL_ORE, 1));
            event.getRegistry().register(new RedstoneOre(Registries.DENSE_COPPER_ORE));
            event.getRegistry().register(new BasicOre(Registries.DENSE_DIAMOND_ORE, 2));
            event.getRegistry().register(new BasicOre(Registries.DENSE_EMERALD_ORE, 2));
            event.getRegistry().register(new BasicOre(Registries.DENSE_GOLD_ORE, 2));
            event.getRegistry().register(new BasicOre(Registries.DENSE_IRON_ORE, 1));
            event.getRegistry().register(new BasicOre(Registries.DENSE_LAPIS_ORE, 2));
            event.getRegistry().register(new BasicOre(Registries.DENSE_REDSTONE_ORE, 2));
            event.getRegistry().register(new BasicOre(Registries.DENSE_TIN_ORE, 1));
            event.getRegistry().register(new BasicOre(Registries.ALUMINIUM_ORE, 1));
            event.getRegistry().register(new BasicOre(Registries.URANIUM_ORE, 2));
            event.getRegistry().register(new BasicOre(Registries.SILVER_ORE, 2));
            event.getRegistry().register(new BasicOre(Registries.LEAD_ORE, 1));

            /*------------------------------------+
            |                                     |
            |         Nether Ore register         |
            |                                     |
            +-------------------------------------*/
            event.getRegistry().register(new NetherOre(Registries.COAL_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.DIAMOND_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.EMERALD_NETHER_ORE));
            event.getRegistry().register(new BasicNetherOre(Registries.GOLD_NETHER_ORE));
            event.getRegistry().register(new BasicNetherOre(Registries.IRON_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.LAPIS_NETHER_ORE));
            event.getRegistry().register(new NetherRedstoneOre(Registries.REDSTONE_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.DENSE_QUARTZ_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.DENSE_COAL_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.DENSE_DIAMOND_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.DENSE_EMERALD_NETHER_ORE));
            event.getRegistry().register(new BasicNetherOre(Registries.DENSE_GOLD_NETHER_ORE));
            event.getRegistry().register(new BasicNetherOre(Registries.DENSE_IRON_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.DENSE_LAPIS_NETHER_ORE));
            event.getRegistry().register(new NetherRedstoneOre(Registries.DENSE_REDSTONE_NETHER_ORE));

            /*------------------------------------+
            |                                     |
            |          End Ore register           |
            |                                     |
            +-------------------------------------*/
            event.getRegistry().register(new EndOre(Registries.COAL_END_ORE));
            event.getRegistry().register(new EndOre(Registries.DIAMOND_END_ORE));
            event.getRegistry().register(new EndOre(Registries.EMERALD_END_ORE));
            event.getRegistry().register(new BasicEndOre(Registries.GOLD_END_ORE));
            event.getRegistry().register(new BasicEndOre(Registries.IRON_END_ORE));
            event.getRegistry().register(new EndOre(Registries.LAPIS_END_ORE));
            event.getRegistry().register(new EndRedstoneOre(Registries.REDSTONE_END_ORE));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoOreGroup);
            /*------------------------------------+
            |                                     |
            |       Overworld Ore register        |
            |                                     |
            +-------------------------------------*/
            event.getRegistry().register(new BlockItem(BlocksHolder.COPPER_ORE, properties).setRegistryName(Registries.COPPER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.TIN_ORE, properties).setRegistryName(Registries.TIN_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_COAL_ORE, properties).setRegistryName(Registries.DENSE_COAL_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_COPPER_ORE, properties).setRegistryName(Registries.DENSE_COPPER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_DIAMOND_ORE, properties).setRegistryName(Registries.DENSE_DIAMOND_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_EMERALD_ORE, properties).setRegistryName(Registries.DENSE_EMERALD_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_GOLD_ORE, properties).setRegistryName(Registries.DENSE_GOLD_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_IRON_ORE, properties).setRegistryName(Registries.DENSE_IRON_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_LAPIS_ORE, properties).setRegistryName(Registries.DENSE_LAPIS_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_REDSTONE_ORE, properties).setRegistryName(Registries.DENSE_REDSTONE_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_TIN_ORE, properties).setRegistryName(Registries.DENSE_TIN_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.ALUMINIUM_ORE, properties).setRegistryName(Registries.ALUMINIUM_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.URANIUM_ORE, properties).setRegistryName(Registries.URANIUM_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.SILVER_ORE, properties).setRegistryName(Registries.SILVER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.LEAD_ORE, properties).setRegistryName(Registries.LEAD_ORE));

            /*------------------------------------+
            |                                     |
            |         Nether Ore register         |
            |                                     |
            +-------------------------------------*/
            event.getRegistry().register(new BlockItem(BlocksHolder.COAL_NETHER_ORE, properties).setRegistryName(Registries.COAL_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DIAMOND_NETHER_ORE, properties).setRegistryName(Registries.DIAMOND_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.EMERALD_NETHER_ORE, properties).setRegistryName(Registries.EMERALD_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.GOLD_NETHER_ORE, properties).setRegistryName(Registries.GOLD_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.IRON_NETHER_ORE, properties).setRegistryName(Registries.IRON_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.LAPIS_NETHER_ORE, properties).setRegistryName(Registries.LAPIS_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.REDSTONE_NETHER_ORE, properties).setRegistryName(Registries.REDSTONE_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_QUARTZ_NETHER_ORE, properties).setRegistryName(Registries.DENSE_QUARTZ_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_COAL_NETHER_ORE, properties).setRegistryName(Registries.DENSE_COAL_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_DIAMOND_NETHER_ORE, properties).setRegistryName(Registries.DENSE_DIAMOND_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_EMERALD_NETHER_ORE, properties).setRegistryName(Registries.DENSE_EMERALD_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_GOLD_NETHER_ORE, properties).setRegistryName(Registries.DENSE_GOLD_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_IRON_NETHER_ORE, properties).setRegistryName(Registries.DENSE_IRON_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_LAPIS_NETHER_ORE, properties).setRegistryName(Registries.DENSE_LAPIS_NETHER_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DENSE_REDSTONE_NETHER_ORE, properties).setRegistryName(Registries.DENSE_REDSTONE_NETHER_ORE));

            /*------------------------------------+
            |                                     |
            |          End Ore register           |
            |                                     |
            +-------------------------------------*/
            event.getRegistry().register(new BlockItem(BlocksHolder.COAL_END_ORE, properties).setRegistryName(Registries.COAL_END_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.DIAMOND_END_ORE, properties).setRegistryName(Registries.DIAMOND_END_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.EMERALD_END_ORE, properties).setRegistryName(Registries.EMERALD_END_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.GOLD_END_ORE, properties).setRegistryName(Registries.GOLD_END_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.IRON_END_ORE, properties).setRegistryName(Registries.IRON_END_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.LAPIS_END_ORE, properties).setRegistryName(Registries.LAPIS_END_ORE));
            event.getRegistry().register(new BlockItem(BlocksHolder.REDSTONE_END_ORE, properties).setRegistryName(Registries.REDSTONE_END_ORE));
        }
    }
}
