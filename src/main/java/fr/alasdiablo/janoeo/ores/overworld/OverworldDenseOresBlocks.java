package fr.alasdiablo.janoeo.ores.overworld;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.block.BasicOre;
import fr.alasdiablo.janoeo.block.overworld.RedstoneOre;
import fr.alasdiablo.janoeo.utils.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class OverworldDenseOresBlocks {

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

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new BasicOre(Registries.DENSE_COAL_ORE, 1));
            event.getRegistry().register(new BasicOre(Registries.DENSE_COPPER_ORE, 1));
            event.getRegistry().register(new BasicOre(Registries.DENSE_DIAMOND_ORE, 2));
            event.getRegistry().register(new BasicOre(Registries.DENSE_EMERALD_ORE, 2));
            event.getRegistry().register(new BasicOre(Registries.DENSE_GOLD_ORE, 2));
            event.getRegistry().register(new BasicOre(Registries.DENSE_IRON_ORE, 1));
            event.getRegistry().register(new BasicOre(Registries.DENSE_LAPIS_ORE, 2));
            event.getRegistry().register(new RedstoneOre(Registries.DENSE_REDSTONE_ORE));
            event.getRegistry().register(new BasicOre(Registries.DENSE_TIN_ORE, 1));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoOreGroup);
            event.getRegistry().register(new BlockItem(OverworldDenseOresBlocks.DENSE_COAL_ORE, properties).setRegistryName(Registries.DENSE_COAL_ORE));
            event.getRegistry().register(new BlockItem(OverworldDenseOresBlocks.DENSE_COPPER_ORE, properties).setRegistryName(Registries.DENSE_COPPER_ORE));
            event.getRegistry().register(new BlockItem(OverworldDenseOresBlocks.DENSE_DIAMOND_ORE, properties).setRegistryName(Registries.DENSE_DIAMOND_ORE));
            event.getRegistry().register(new BlockItem(OverworldDenseOresBlocks.DENSE_EMERALD_ORE, properties).setRegistryName(Registries.DENSE_EMERALD_ORE));
            event.getRegistry().register(new BlockItem(OverworldDenseOresBlocks.DENSE_GOLD_ORE, properties).setRegistryName(Registries.DENSE_GOLD_ORE));
            event.getRegistry().register(new BlockItem(OverworldDenseOresBlocks.DENSE_IRON_ORE, properties).setRegistryName(Registries.DENSE_IRON_ORE));
            event.getRegistry().register(new BlockItem(OverworldDenseOresBlocks.DENSE_LAPIS_ORE, properties).setRegistryName(Registries.DENSE_LAPIS_ORE));
            event.getRegistry().register(new BlockItem(OverworldDenseOresBlocks.DENSE_REDSTONE_ORE, properties).setRegistryName(Registries.DENSE_REDSTONE_ORE));
            event.getRegistry().register(new BlockItem(OverworldDenseOresBlocks.DENSE_TIN_ORE, properties).setRegistryName(Registries.DENSE_TIN_ORE));
        }
    }

}
