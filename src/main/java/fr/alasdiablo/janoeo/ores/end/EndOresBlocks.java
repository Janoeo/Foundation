package fr.alasdiablo.janoeo.ores.end;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.blocks.BasicEndOre;
import fr.alasdiablo.janoeo.blocks.EndOre;
import fr.alasdiablo.janoeo.blocks.end.EndRedstoneOre;
import fr.alasdiablo.janoeo.utils.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;


@SuppressWarnings("unused")
public class EndOresBlocks {

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

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
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
            event.getRegistry().register(new BlockItem(EndOresBlocks.COAL_END_ORE, properties).setRegistryName(Registries.COAL_END_ORE));
            event.getRegistry().register(new BlockItem(EndOresBlocks.DIAMOND_END_ORE, properties).setRegistryName(Registries.DIAMOND_END_ORE));
            event.getRegistry().register(new BlockItem(EndOresBlocks.EMERALD_END_ORE, properties).setRegistryName(Registries.EMERALD_END_ORE));
            event.getRegistry().register(new BlockItem(EndOresBlocks.GOLD_END_ORE, properties).setRegistryName(Registries.GOLD_END_ORE));
            event.getRegistry().register(new BlockItem(EndOresBlocks.IRON_END_ORE, properties).setRegistryName(Registries.IRON_END_ORE));
            event.getRegistry().register(new BlockItem(EndOresBlocks.LAPIS_END_ORE, properties).setRegistryName(Registries.LAPIS_END_ORE));
            event.getRegistry().register(new BlockItem(EndOresBlocks.REDSTONE_END_ORE, properties).setRegistryName(Registries.REDSTONE_END_ORE));
        }
    }
}
