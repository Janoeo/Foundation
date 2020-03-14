package fr.alasdiablo.janoeo.ores.overworld;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.block.*;
import fr.alasdiablo.janoeo.utils.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@SuppressWarnings("unused")
public class OverworldOresBlocks {

    @ObjectHolder(Registries.MODID + ":" + Registries.COPPER_ORE)
    public static Block COPPER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.TIN_ORE)
    public static Block TIN_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.ALUMINIUM_ORE)
    public static Block ALUMINIUM_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.URANIUM_ORE)
    public static Block URANIUM_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.SILVER_ORE)
    public static Block SILVER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.LEAD_ORE)
    public static Block LEAD_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.RUBY_ORE)
    public static Block RUBY_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.SAPPHIRE_ORE)
    public static Block SAPPHIRE_ORE;

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new BasicOre(Registries.COPPER_ORE, 1));
            event.getRegistry().register(new BasicOre(Registries.TIN_ORE, 1));
            event.getRegistry().register(new BasicOre(Registries.ALUMINIUM_ORE, 1));
            event.getRegistry().register(new BasicOre(Registries.URANIUM_ORE, 2));
            event.getRegistry().register(new BasicOre(Registries.SILVER_ORE, 2));
            event.getRegistry().register(new BasicOre(Registries.LEAD_ORE, 1));
            event.getRegistry().register(new BasicOre(Registries.RUBY_ORE, 2));
            event.getRegistry().register(new BasicOre(Registries.SAPPHIRE_ORE, 2));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoOreGroup);
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.COPPER_ORE, properties).setRegistryName(Registries.COPPER_ORE));
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.TIN_ORE, properties).setRegistryName(Registries.TIN_ORE));
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.ALUMINIUM_ORE, properties).setRegistryName(Registries.ALUMINIUM_ORE));
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.URANIUM_ORE, properties).setRegistryName(Registries.URANIUM_ORE));
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.SILVER_ORE, properties).setRegistryName(Registries.SILVER_ORE));
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.LEAD_ORE, properties).setRegistryName(Registries.LEAD_ORE));
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.RUBY_ORE, properties).setRegistryName(Registries.RUBY_ORE));
            event.getRegistry().register(new BlockItem(OverworldOresBlocks.SAPPHIRE_ORE, properties).setRegistryName(Registries.SAPPHIRE_ORE));
        }
    }
}
