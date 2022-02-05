package fr.alasdiablo.janoeo.foundation.init;

import fr.alasdiablo.diolib.block.ExperienceRarity;
import fr.alasdiablo.diolib.registries.RegistryHelper;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.block.NetherOreBlock;
import fr.alasdiablo.janoeo.foundation.block.NetherRedstoneOreBlock;
import fr.alasdiablo.janoeo.foundation.block.OreBlock;
import fr.alasdiablo.janoeo.foundation.block.RedstoneOreBlock;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;
import org.jetbrains.annotations.NotNull;

public class FoundationBlocks {
    /* * * * * * * * * * * * * * * Item Properties * * *  * * * * * * * * * * */
    private static final Item.Properties PROPERTIES_ITEM_BLOCK = new Item.Properties().tab(Foundation.ORES_GROUP);

    /* * * * * * * * * * * * * * * Block Properties * * *  * * * * * * * * * * */
    private static final BlockBehaviour.Properties PROPERTIES_STONE_ORE = BlockBehaviour.Properties.of(Material.STONE)
            .requiresCorrectToolForDrops()
            .strength(3.0F, 3.0F);

    /* * * * * * * * * * * * * * * Stone Ore * * *  * * * * * * * * * * */
    public static final Block BAUXITE_ORE = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.BAUXITE_ORE);
    public static final Block LEAD_ORE    = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.LEAD_ORE);
    public static final Block NICKEL_ORE  = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.NICKEL_ORE);
    public static final Block SILVER_ORE  = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.UNCOMMON, Registries.SILVER_ORE);
    public static final Block TIN_ORE     = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.TIN_ORE);
    public static final Block URANIUM_ORE = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.UNCOMMON, Registries.URANIUM_ORE);

    /* * * * * * * * * * * * * * * Stone Tiny Ore * * * * * * * * * * * * * */
    public static final Block TINY_COAL_ORE     = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.TINY_COAL_ORE);
    public static final Block TINY_COPPER_ORE   = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.TINY_COPPER_ORE);
    public static final Block TINY_DIAMOND_ORE  = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.RARE, Registries.TINY_DIAMOND_ORE);
    public static final Block TINY_EMERALD_ORE  = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.RARE, Registries.TINY_EMERALD_ORE);
    public static final Block TINY_GOLD_ORE     = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.UNCOMMON, Registries.TINY_GOLD_ORE);
    public static final Block TINY_IRON_ORE     = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.TINY_IRON_ORE);
    public static final Block TINY_LAPIS_ORE    = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.UNCOMMON, Registries.TINY_LAPIS_ORE);
    public static final Block TINY_REDSTONE_ORE = new RedstoneOreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.UNCOMMON, Registries.TINY_REDSTONE_ORE);
    public static final Block TINY_BAUXITE_ORE  = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.TINY_BAUXITE_ORE);
    public static final Block TINY_LEAD_ORE     = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.TINY_LEAD_ORE);
    public static final Block TINY_NICKEL_ORE   = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.TINY_NICKEL_ORE);
    public static final Block TINY_SILVER_ORE   = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.UNCOMMON, Registries.TINY_SILVER_ORE);
    public static final Block TINY_TIN_ORE      = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.COMMON, Registries.TINY_TIN_ORE);
    public static final Block TINY_URANIUM_ORE  = new OreBlock(PROPERTIES_STONE_ORE, ExperienceRarity.UNCOMMON, Registries.TINY_URANIUM_ORE);

    /* * * * * * * * * * * * * * * Deepslate Block Properties * * *  * * * * * * * * * * */
    private static final BlockBehaviour.Properties PROPERTIES_DEEPSLATE_ORE = BlockBehaviour.Properties.of(Material.STONE)
            .requiresCorrectToolForDrops()
            .color(MaterialColor.DEEPSLATE)
            .strength(4.5F, 3.0F)
            .sound(SoundType.DEEPSLATE);

    /* * * * * * * * * * * * * * * Deepslate Ore * * * * * * * * * * * * * */
    public static final Block DEEPSLATE_BAUXITE_ORE = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_BAUXITE_ORE);
    public static final Block DEEPSLATE_LEAD_ORE    = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_LEAD_ORE);
    public static final Block DEEPSLATE_NICKEL_ORE  = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_NICKEL_ORE);
    public static final Block DEEPSLATE_SILVER_ORE  = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.UNCOMMON, Registries.DEEPSLATE_SILVER_ORE);
    public static final Block DEEPSLATE_TIN_ORE     = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_TIN_ORE);
    public static final Block DEEPSLATE_URANIUM_ORE = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.UNCOMMON, Registries.DEEPSLATE_URANIUM_ORE);

    /* * * * * * * * * * * * * * * Deepslate Tiny Ore * * * * * * * * * * * * * */
    public static final Block DEEPSLATE_TINY_COAL_ORE     = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_TINY_COAL_ORE);
    public static final Block DEEPSLATE_TINY_COPPER_ORE   = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_TINY_COPPER_ORE
    );
    public static final Block DEEPSLATE_TINY_DIAMOND_ORE  = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.RARE, Registries.DEEPSLATE_TINY_DIAMOND_ORE
    );
    public static final Block DEEPSLATE_TINY_EMERALD_ORE  = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.RARE, Registries.DEEPSLATE_TINY_EMERALD_ORE
    );
    public static final Block DEEPSLATE_TINY_GOLD_ORE     = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.UNCOMMON, Registries.DEEPSLATE_TINY_GOLD_ORE
    );
    public static final Block DEEPSLATE_TINY_IRON_ORE     = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_TINY_IRON_ORE);
    public static final Block DEEPSLATE_TINY_LAPIS_ORE    = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.UNCOMMON, Registries.DEEPSLATE_TINY_LAPIS_ORE
    );
    public static final Block DEEPSLATE_TINY_REDSTONE_ORE = new RedstoneOreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.UNCOMMON, Registries.DEEPSLATE_TINY_REDSTONE_ORE
    );
    public static final Block DEEPSLATE_TINY_BAUXITE_ORE  = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_TINY_BAUXITE_ORE
    );
    public static final Block DEEPSLATE_TINY_LEAD_ORE     = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_TINY_LEAD_ORE);
    public static final Block DEEPSLATE_TINY_NICKEL_ORE   = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_TINY_NICKEL_ORE
    );
    public static final Block DEEPSLATE_TINY_SILVER_ORE   = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.UNCOMMON, Registries.DEEPSLATE_TINY_SILVER_ORE
    );
    public static final Block DEEPSLATE_TINY_TIN_ORE      = new OreBlock(PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.COMMON, Registries.DEEPSLATE_TINY_TIN_ORE);
    public static final Block DEEPSLATE_TINY_URANIUM_ORE  = new OreBlock(
            PROPERTIES_DEEPSLATE_ORE, ExperienceRarity.UNCOMMON, Registries.DEEPSLATE_TINY_URANIUM_ORE
    );

    /* * * * * * * * * * * * * * * Nether Block Properties * * *  * * * * * * * * * * */
    private static final BlockBehaviour.Properties PROPERTIES_NETHER_ORE = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER)
            .requiresCorrectToolForDrops()
            .strength(3.0F, 3.0F)
            .sound(SoundType.NETHER_ORE);

    /* * * * * * * * * * * * * * * Nether Ore * * * * * * * * * * * * * */
    public static final Block NETHER_COAL_ORE     = new NetherOreBlock(PROPERTIES_NETHER_ORE, ExperienceRarity.COMMON, Registries.NETHER_COAL_ORE);
    public static final Block NETHER_COPPER_ORE   = new NetherOreBlock(PROPERTIES_NETHER_ORE, ExperienceRarity.COMMON, Registries.NETHER_COPPER_ORE);
    public static final Block NETHER_DIAMOND_ORE  = new NetherOreBlock(PROPERTIES_NETHER_ORE, ExperienceRarity.RARE, Registries.NETHER_DIAMOND_ORE);
    public static final Block NETHER_EMERALD_ORE  = new NetherOreBlock(PROPERTIES_NETHER_ORE, ExperienceRarity.RARE, Registries.NETHER_EMERALD_ORE);
    public static final Block NETHER_IRON_ORE     = new NetherOreBlock(PROPERTIES_NETHER_ORE, ExperienceRarity.COMMON, Registries.NETHER_IRON_ORE);
    public static final Block NETHER_LAPIS_ORE    = new NetherOreBlock(
            PROPERTIES_NETHER_ORE, ExperienceRarity.UNCOMMON, Registries.NETHER_LAPIS_ORE);
    public static final Block NETHER_REDSTONE_ORE = new NetherRedstoneOreBlock(
            PROPERTIES_NETHER_ORE, ExperienceRarity.UNCOMMON, Registries.NETHER_REDSTONE_ORE
    );
    public static final Block NETHER_BAUXITE_ORE  = new NetherOreBlock(
            PROPERTIES_NETHER_ORE, ExperienceRarity.COMMON, Registries.NETHER_BAUXITE_ORE);
    public static final Block NETHER_LEAD_ORE     = new NetherOreBlock(
            PROPERTIES_NETHER_ORE, ExperienceRarity.COMMON, Registries.NETHER_LEAD_ORE);
    public static final Block NETHER_NICKEL_ORE   = new NetherOreBlock(
            PROPERTIES_NETHER_ORE, ExperienceRarity.COMMON, Registries.NETHER_NICKEL_ORE);
    public static final Block NETHER_SILVER_ORE   = new NetherOreBlock(
            PROPERTIES_NETHER_ORE, ExperienceRarity.UNCOMMON, Registries.NETHER_SILVER_ORE);
    public static final Block NETHER_TIN_ORE      = new NetherOreBlock(
            PROPERTIES_NETHER_ORE, ExperienceRarity.COMMON, Registries.NETHER_TIN_ORE);
    public static final Block NETHER_URANIUM_ORE  = new NetherOreBlock(
            PROPERTIES_NETHER_ORE, ExperienceRarity.UNCOMMON, Registries.NETHER_URANIUM_ORE);

    /* * * * * * * * * * * * * * * Storage Block Properties * * * * * * * * * * * * * */
    private static final Item.Properties PROPERTIES_ITEM_STORAGE_BLOCK = new Item.Properties().tab(Foundation.MATERIALS_GROUP);

    /* * * * * * * * * * * * * * * Storage Block * * * * * * * * * * * * * */
    public static final Block ALUMINIUM_BLOCK = createStorageBlock(Registries.ALUMINIUM_BLOCK, MaterialColor.METAL);
    public static final Block LEAD_BLOCK      = createStorageBlock(Registries.LEAD_BLOCK, MaterialColor.COLOR_GRAY);
    public static final Block NICKEL_BLOCK    = createStorageBlock(Registries.NICKEL_BLOCK, MaterialColor.SAND);
    public static final Block SILVER_BLOCK    = createStorageBlock(Registries.SILVER_BLOCK, MaterialColor.SNOW);
    public static final Block TIN_BLOCK       = createStorageBlock(Registries.TIN_BLOCK, MaterialColor.METAL);
    public static final Block URANIUM_BLOCK   = createStorageBlock(Registries.URANIUM_BLOCK, MaterialColor.COLOR_YELLOW);

    public static final Block RAW_ALUMINIUM_BLOCK = createRawBlock(Registries.RAW_ALUMINIUM_BLOCK, MaterialColor.METAL);
    public static final Block RAW_LEAD_BLOCK      = createRawBlock(Registries.RAW_LEAD_BLOCK, MaterialColor.COLOR_GRAY);
    public static final Block RAW_NICKEL_BLOCK    = createRawBlock(Registries.RAW_NICKEL_BLOCK, MaterialColor.SAND);
    public static final Block RAW_SILVER_BLOCK    = createRawBlock(Registries.RAW_SILVER_BLOCK, MaterialColor.SNOW);
    public static final Block RAW_TIN_BLOCK       = createRawBlock(Registries.RAW_TIN_BLOCK, MaterialColor.METAL);
    public static final Block RAW_URANIUM_BLOCK   = createRawBlock(Registries.RAW_URANIUM_BLOCK, MaterialColor.COLOR_YELLOW);

    private static @NotNull Block createStorageBlock(String name, MaterialColor color) {
        var block = new Block(BlockBehaviour.Properties.of(
                Material.METAL, color
        ).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL));
        block.setRegistryName(name);
        return block;
    }

    private static @NotNull Block createRawBlock(String name, MaterialColor color) {
        var block = new Block(BlockBehaviour.Properties.of(
                Material.STONE, color
        ).requiresCorrectToolForDrops().strength(5.0F, 6.0F));
        block.setRegistryName(name);
        return block;
    }

    public static void initBlock(RegistryEvent.@NotNull Register<Block> event) {
        final IForgeRegistry<Block> registry = event.getRegistry();
        initOreBlock(registry);
        initTinyOreBlock(registry);
        initNetherOreBlock(registry);
        initStorageBlock(registry);
    }

    public static void initItem(RegistryEvent.@NotNull Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();
        initOreItem(registry);
        initTinyOreItem(registry);
        initNetherOreItem(registry);
        initStorageItem(registry);
    }

    private static void initOreBlock(IForgeRegistry<Block> registry) {
        RegistryHelper.registerBlock(
                registry, BAUXITE_ORE, LEAD_ORE, NICKEL_ORE, SILVER_ORE, TIN_ORE, URANIUM_ORE, DEEPSLATE_BAUXITE_ORE, DEEPSLATE_LEAD_ORE, DEEPSLATE_NICKEL_ORE,
                DEEPSLATE_SILVER_ORE, DEEPSLATE_TIN_ORE, DEEPSLATE_URANIUM_ORE
        );
    }

    private static void initOreItem(IForgeRegistry<Item> registry) {
        RegistryHelper.registerBlockItem(
                registry, PROPERTIES_ITEM_BLOCK, BAUXITE_ORE, LEAD_ORE, NICKEL_ORE, SILVER_ORE, TIN_ORE, URANIUM_ORE, DEEPSLATE_BAUXITE_ORE, DEEPSLATE_LEAD_ORE,
                DEEPSLATE_NICKEL_ORE, DEEPSLATE_SILVER_ORE, DEEPSLATE_TIN_ORE, DEEPSLATE_URANIUM_ORE
        );
    }

    private static void initTinyOreBlock(IForgeRegistry<Block> registry) {
        RegistryHelper.registerBlock(
                registry, TINY_COAL_ORE, TINY_COPPER_ORE, TINY_DIAMOND_ORE, TINY_EMERALD_ORE, TINY_GOLD_ORE, TINY_IRON_ORE, TINY_LAPIS_ORE, TINY_REDSTONE_ORE,
                DEEPSLATE_TINY_COAL_ORE, DEEPSLATE_TINY_COPPER_ORE, DEEPSLATE_TINY_DIAMOND_ORE, DEEPSLATE_TINY_EMERALD_ORE, DEEPSLATE_TINY_GOLD_ORE,
                DEEPSLATE_TINY_IRON_ORE, DEEPSLATE_TINY_LAPIS_ORE, DEEPSLATE_TINY_REDSTONE_ORE, TINY_BAUXITE_ORE, TINY_LEAD_ORE, TINY_NICKEL_ORE,
                TINY_SILVER_ORE, TINY_TIN_ORE, TINY_URANIUM_ORE, DEEPSLATE_TINY_BAUXITE_ORE, DEEPSLATE_TINY_LEAD_ORE, DEEPSLATE_TINY_NICKEL_ORE,
                DEEPSLATE_TINY_SILVER_ORE, DEEPSLATE_TINY_TIN_ORE, DEEPSLATE_TINY_URANIUM_ORE
        );
    }

    private static void initTinyOreItem(IForgeRegistry<Item> registry) {
        RegistryHelper.registerBlockItem(
                registry, PROPERTIES_ITEM_BLOCK, TINY_COAL_ORE, TINY_COPPER_ORE, TINY_DIAMOND_ORE, TINY_EMERALD_ORE, TINY_GOLD_ORE, TINY_IRON_ORE,
                TINY_LAPIS_ORE, TINY_REDSTONE_ORE, DEEPSLATE_TINY_COAL_ORE, DEEPSLATE_TINY_COPPER_ORE, DEEPSLATE_TINY_DIAMOND_ORE, DEEPSLATE_TINY_EMERALD_ORE,
                DEEPSLATE_TINY_GOLD_ORE, DEEPSLATE_TINY_IRON_ORE, DEEPSLATE_TINY_LAPIS_ORE, DEEPSLATE_TINY_REDSTONE_ORE, TINY_BAUXITE_ORE, TINY_LEAD_ORE,
                TINY_NICKEL_ORE, TINY_SILVER_ORE, TINY_TIN_ORE, TINY_URANIUM_ORE, DEEPSLATE_TINY_BAUXITE_ORE, DEEPSLATE_TINY_LEAD_ORE,
                DEEPSLATE_TINY_NICKEL_ORE, DEEPSLATE_TINY_SILVER_ORE, DEEPSLATE_TINY_TIN_ORE, DEEPSLATE_TINY_URANIUM_ORE
        );
    }

    private static void initNetherOreBlock(IForgeRegistry<Block> registry) {
        RegistryHelper.registerBlock(
                registry, NETHER_COAL_ORE, NETHER_COPPER_ORE, NETHER_DIAMOND_ORE, NETHER_EMERALD_ORE, NETHER_IRON_ORE, NETHER_LAPIS_ORE, NETHER_REDSTONE_ORE,
                NETHER_BAUXITE_ORE, NETHER_LEAD_ORE, NETHER_NICKEL_ORE, NETHER_SILVER_ORE, NETHER_TIN_ORE, NETHER_URANIUM_ORE
        );
    }

    private static void initNetherOreItem(IForgeRegistry<Item> registry) {
        RegistryHelper.registerBlockItem(
                registry, PROPERTIES_ITEM_BLOCK, NETHER_COAL_ORE, NETHER_COPPER_ORE, NETHER_DIAMOND_ORE, NETHER_EMERALD_ORE, NETHER_IRON_ORE, NETHER_LAPIS_ORE,
                NETHER_REDSTONE_ORE, NETHER_BAUXITE_ORE, NETHER_LEAD_ORE, NETHER_NICKEL_ORE, NETHER_SILVER_ORE, NETHER_TIN_ORE, NETHER_URANIUM_ORE
        );
    }

    private static void initStorageBlock(IForgeRegistry<Block> registry) {
        RegistryHelper.registerBlock(
                registry, ALUMINIUM_BLOCK, LEAD_BLOCK, NICKEL_BLOCK, SILVER_BLOCK, TIN_BLOCK, URANIUM_BLOCK, RAW_ALUMINIUM_BLOCK, RAW_LEAD_BLOCK,
                RAW_NICKEL_BLOCK, RAW_SILVER_BLOCK, RAW_TIN_BLOCK, RAW_URANIUM_BLOCK
        );
    }

    private static void initStorageItem(IForgeRegistry<Item> registry) {
        RegistryHelper.registerBlockItem(
                registry, PROPERTIES_ITEM_STORAGE_BLOCK, ALUMINIUM_BLOCK, LEAD_BLOCK, NICKEL_BLOCK, SILVER_BLOCK, TIN_BLOCK, URANIUM_BLOCK, RAW_ALUMINIUM_BLOCK,
                RAW_LEAD_BLOCK, RAW_NICKEL_BLOCK, RAW_SILVER_BLOCK, RAW_TIN_BLOCK, RAW_URANIUM_BLOCK
        );
    }
}
