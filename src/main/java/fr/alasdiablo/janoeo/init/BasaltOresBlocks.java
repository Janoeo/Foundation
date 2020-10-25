package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.janoeo.block.BasaltOre;
import fr.alasdiablo.janoeo.block.BasaltRedstoneOre;
import fr.alasdiablo.janoeo.util.JanoeoGroup;
import fr.alasdiablo.janoeo.util.Registries;
import fr.alasdiablo.janoeo.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("unused")
public class BasaltOresBlocks {

    public static Block COAL_BASALT_ORE
            = new BasaltOre(Registries.COAL_BASALT_ORE);
    public static Block DIAMOND_BASALT_ORE
            = new BasaltOre(Registries.DIAMOND_BASALT_ORE);
    public static Block EMERALD_BASALT_ORE
            = new BasaltOre(Registries.EMERALD_BASALT_ORE);
    public static Block GOLD_BASALT_ORE
            = new BasaltOre(Registries.GOLD_BASALT_ORE);
    public static Block IRON_BASALT_ORE
            = new BasaltOre(Registries.IRON_BASALT_ORE);
    public static Block LAPIS_BASALT_ORE
            = new BasaltOre(Registries.LAPIS_BASALT_ORE);
    public static Block REDSTONE_BASALT_ORE
            = new BasaltRedstoneOre(Registries.REDSTONE_BASALT_ORE);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            Utils.registerBlock(event.getRegistry(),
                    COAL_BASALT_ORE, DIAMOND_BASALT_ORE, EMERALD_BASALT_ORE,
                    GOLD_BASALT_ORE, IRON_BASALT_ORE, LAPIS_BASALT_ORE,
                    REDSTONE_BASALT_ORE
            );
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JanoeoGroup.ORE_BLOCKS);
            Utils.registerBlockItem(event.getRegistry(), properties,
                    COAL_BASALT_ORE, DIAMOND_BASALT_ORE, EMERALD_BASALT_ORE,
                    GOLD_BASALT_ORE, IRON_BASALT_ORE, LAPIS_BASALT_ORE,
                    REDSTONE_BASALT_ORE
            );
        }
    }
}
