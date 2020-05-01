package fr.alasdiablo.janoeo.ores.nether;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.block.NetherOre;
import fr.alasdiablo.janoeo.block.nether.NetherRedstoneOre;
import fr.alasdiablo.janoeo.utils.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class NetherOresBlocks {

    @ObjectHolder(Registries.MODID + ":" + Registries.ALUMINIUM_NETHER_ORE)
    public static Block ALUMINIUM_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.COAL_NETHER_ORE)
    public static Block COAL_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.COPPER_NETHER_ORE)
    public static Block COPPER_NETHER_ORE;
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
    @ObjectHolder(Registries.MODID + ":" + Registries.LEAD_NETHER_ORE)
    public static Block LEAD_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.REDSTONE_NETHER_ORE)
    public static Block REDSTONE_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.RUBY_NETHER_ORE)
    public static Block RUBY_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.SAPPHIRE_NETHER_ORE)
    public static Block SAPPHIRE_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.SILVER_NETHER_ORE)
    public static Block SILVER_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.TIN_NETHER_ORE)
    public static Block TIN_NETHER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.URANIUM_NETHER_ORE)
    public static Block URANIUM_NETHER_ORE;

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new NetherOre(Registries.ALUMINIUM_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.COAL_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.COPPER_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.DIAMOND_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.EMERALD_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.GOLD_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.IRON_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.LAPIS_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.LEAD_NETHER_ORE));
            event.getRegistry().register(new NetherRedstoneOre(Registries.REDSTONE_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.RUBY_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.SAPPHIRE_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.SILVER_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.TIN_NETHER_ORE));
            event.getRegistry().register(new NetherOre(Registries.URANIUM_NETHER_ORE));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoOreGroup);
            event.getRegistry().register(new BlockItem(NetherOresBlocks.ALUMINIUM_NETHER_ORE, properties).setRegistryName(Registries.ALUMINIUM_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.COAL_NETHER_ORE, properties).setRegistryName(Registries.COAL_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.COPPER_NETHER_ORE, properties).setRegistryName(Registries.COPPER_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.DIAMOND_NETHER_ORE, properties).setRegistryName(Registries.DIAMOND_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.EMERALD_NETHER_ORE, properties).setRegistryName(Registries.EMERALD_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.GOLD_NETHER_ORE, properties).setRegistryName(Registries.GOLD_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.IRON_NETHER_ORE, properties).setRegistryName(Registries.IRON_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.LAPIS_NETHER_ORE, properties).setRegistryName(Registries.LAPIS_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.LEAD_NETHER_ORE, properties).setRegistryName(Registries.LEAD_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.REDSTONE_NETHER_ORE, properties).setRegistryName(Registries.REDSTONE_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.RUBY_NETHER_ORE, properties).setRegistryName(Registries.RUBY_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.SAPPHIRE_NETHER_ORE, properties).setRegistryName(Registries.SAPPHIRE_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.SILVER_NETHER_ORE, properties).setRegistryName(Registries.SILVER_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.TIN_NETHER_ORE, properties).setRegistryName(Registries.TIN_NETHER_ORE));
            event.getRegistry().register(new BlockItem(NetherOresBlocks.URANIUM_NETHER_ORE, properties).setRegistryName(Registries.URANIUM_NETHER_ORE));
        }
    }
}
