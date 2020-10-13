package fr.alasdiablo.janoeo.init;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.block.BasicOre;
import fr.alasdiablo.janoeo.block.RedstoneOre;
import fr.alasdiablo.janoeo.util.Registries;
import fr.alasdiablo.janoeo.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class OverworldDenseOresBlocks {

    public static Block DENSE_COAL_ORE
            = new BasicOre(Registries.DENSE_COAL_ORE, 1);
    public static Block DENSE_COPPER_ORE
            = new BasicOre(Registries.DENSE_COPPER_ORE, 1);
    public static Block DENSE_DIAMOND_ORE
            = new BasicOre(Registries.DENSE_DIAMOND_ORE, 2);
    public static Block DENSE_EMERALD_ORE
            = new BasicOre(Registries.DENSE_EMERALD_ORE, 2);
    public static Block DENSE_GOLD_ORE
            = new BasicOre(Registries.DENSE_GOLD_ORE, 2);
    public static Block DENSE_IRON_ORE
            = new BasicOre(Registries.DENSE_IRON_ORE, 1);
    public static Block DENSE_LAPIS_ORE
            = new BasicOre(Registries.DENSE_LAPIS_ORE, 2);
    public static Block DENSE_REDSTONE_ORE
            = new RedstoneOre(Registries.DENSE_REDSTONE_ORE);
    public static Block DENSE_TIN_ORE
            = new BasicOre(Registries.DENSE_TIN_ORE, 1);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            Utils.registerBlock(event.getRegistry(),
                    DENSE_COAL_ORE, DENSE_COPPER_ORE, DENSE_DIAMOND_ORE,
                    DENSE_EMERALD_ORE, DENSE_GOLD_ORE, DENSE_IRON_ORE,
                    DENSE_LAPIS_ORE, DENSE_REDSTONE_ORE, DENSE_TIN_ORE
            );
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoOreGroup);
            Utils.registerBlockItem(event.getRegistry(), properties,
                    DENSE_COAL_ORE, DENSE_COPPER_ORE, DENSE_DIAMOND_ORE,
                    DENSE_EMERALD_ORE, DENSE_GOLD_ORE, DENSE_IRON_ORE,
                    DENSE_LAPIS_ORE, DENSE_REDSTONE_ORE, DENSE_TIN_ORE
            );
        }
    }

}
