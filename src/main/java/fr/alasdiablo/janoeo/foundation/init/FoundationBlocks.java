package fr.alasdiablo.janoeo.foundation.init;

import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.Registries;
import fr.alasdiablo.janoeo.foundation.block.GravelRedStoneOre;
import fr.alasdiablo.janoeo.foundation.block.NetherOreBlock;
import fr.alasdiablo.janoeo.foundation.block.NetherRedStoneOreBlock;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class FoundationBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Registries.MOD_ID);

    /* * * * * * * * * * * * * * * Item Properties * * *  * * * * * * * * * * */
    private static final Item.Properties PROPERTIES_ITEM_BLOCK = new Item.Properties().tab(Foundation.ORES_GROUP);

    /* * * * * * * * * * * * * * * Block Properties * * *  * * * * * * * * * * */
    private static final BlockBehaviour.Properties PROPERTIES_STONE_ORE = BlockBehaviour.Properties.of(Material.STONE)
            .requiresCorrectToolForDrops()
            .strength(3.0F, 3.0F);

    private static final BlockBehaviour.Properties PROPERTIES_DEEPSLATE_ORE = BlockBehaviour.Properties.of(Material.STONE)
            .requiresCorrectToolForDrops()
            .color(MaterialColor.DEEPSLATE)
            .strength(4.5F, 3.0F)
            .sound(SoundType.DEEPSLATE);

    private static final BlockBehaviour.Properties PROPERTIES_NETHER_ORE = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER)
            .requiresCorrectToolForDrops()
            .strength(3.0F, 3.0F)
            .sound(SoundType.NETHER_ORE);

    /* * * * * * * * * * * * * * * XP Drop range * * *  * * * * * * * * * * */
    private static final UniformInt COMMON = UniformInt.of(0, 2);
    private static final UniformInt UNCOMMON = UniformInt.of(2, 5);
    private static final UniformInt RARE = UniformInt.of(3, 7);

    /* * * * * * * * * * * * * * * Stone Ore * * *  * * * * * * * * * * */
    public static final RegistryObject<Block> BAUXITE_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.BAUXITE_ORE, COMMON);
    public static final RegistryObject<Block> LEAD_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.LEAD_ORE, COMMON);
    public static final RegistryObject<Block> NICKEL_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.NICKEL_ORE, COMMON);
    public static final RegistryObject<Block> SILVER_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.SILVER_ORE, UNCOMMON);
    public static final RegistryObject<Block> TIN_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.TIN_ORE, COMMON);
    public static final RegistryObject<Block> URANIUM_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.URANIUM_ORE, UNCOMMON);

    /* * * * * * * * * * * * * * * Stone Tiny Ore * * * * * * * * * * * * * */
    public static final RegistryObject<Block> TINY_COAL_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.TINY_COAL_ORE, COMMON);
    public static final RegistryObject<Block> TINY_COPPER_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.TINY_COPPER_ORE, COMMON);
    public static final RegistryObject<Block> TINY_DIAMOND_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.TINY_DIAMOND_ORE, RARE);
    public static final RegistryObject<Block> TINY_EMERALD_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.TINY_EMERALD_ORE, RARE);
    public static final RegistryObject<Block> TINY_GOLD_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.TINY_GOLD_ORE, UNCOMMON);
    public static final RegistryObject<Block> TINY_IRON_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.TINY_IRON_ORE, COMMON);
    public static final RegistryObject<Block> TINY_LAPIS_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.TINY_LAPIS_ORE, UNCOMMON);
    public static final RegistryObject<Block> TINY_REDSTONE_ORE = createRedStoneOreBlock(PROPERTIES_STONE_ORE, Registries.TINY_REDSTONE_ORE);
    public static final RegistryObject<Block> TINY_BAUXITE_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.TINY_BAUXITE_ORE, COMMON);
    public static final RegistryObject<Block> TINY_LEAD_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.TINY_LEAD_ORE, COMMON);
    public static final RegistryObject<Block> TINY_NICKEL_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.TINY_NICKEL_ORE, COMMON);
    public static final RegistryObject<Block> TINY_SILVER_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.TINY_SILVER_ORE, UNCOMMON);
    public static final RegistryObject<Block> TINY_TIN_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.TINY_TIN_ORE, COMMON);
    public static final RegistryObject<Block> TINY_URANIUM_ORE = createOreBlock(PROPERTIES_STONE_ORE, Registries.TINY_URANIUM_ORE, UNCOMMON);

    /* * * * * * * * * * * * * * * Deepslate Ore * * * * * * * * * * * * * */
    public static final RegistryObject<Block> DEEPSLATE_BAUXITE_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_BAUXITE_ORE, COMMON);
    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_LEAD_ORE, COMMON);
    public static final RegistryObject<Block> DEEPSLATE_NICKEL_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_NICKEL_ORE, COMMON);
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_SILVER_ORE, UNCOMMON);
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_TIN_ORE, COMMON);
    public static final RegistryObject<Block> DEEPSLATE_URANIUM_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_URANIUM_ORE, UNCOMMON);

    /* * * * * * * * * * * * * * * Deepslate Tiny Ore * * * * * * * * * * * * * */
    public static final RegistryObject<Block> DEEPSLATE_TINY_COAL_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_TINY_COAL_ORE, COMMON);
    public static final RegistryObject<Block> DEEPSLATE_TINY_COPPER_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_TINY_COPPER_ORE, COMMON);
    public static final RegistryObject<Block> DEEPSLATE_TINY_DIAMOND_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_TINY_DIAMOND_ORE, RARE);
    public static final RegistryObject<Block> DEEPSLATE_TINY_EMERALD_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_TINY_EMERALD_ORE, RARE);
    public static final RegistryObject<Block> DEEPSLATE_TINY_GOLD_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_TINY_GOLD_ORE, UNCOMMON);
    public static final RegistryObject<Block> DEEPSLATE_TINY_IRON_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_TINY_IRON_ORE, COMMON);
    public static final RegistryObject<Block> DEEPSLATE_TINY_LAPIS_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_TINY_LAPIS_ORE, UNCOMMON);
    public static final RegistryObject<Block> DEEPSLATE_TINY_REDSTONE_ORE = createRedStoneOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_TINY_REDSTONE_ORE);
    public static final RegistryObject<Block> DEEPSLATE_TINY_BAUXITE_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_TINY_BAUXITE_ORE, COMMON);
    public static final RegistryObject<Block> DEEPSLATE_TINY_LEAD_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_TINY_LEAD_ORE, COMMON);
    public static final RegistryObject<Block> DEEPSLATE_TINY_NICKEL_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_TINY_NICKEL_ORE, COMMON);
    public static final RegistryObject<Block> DEEPSLATE_TINY_SILVER_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_TINY_SILVER_ORE, UNCOMMON);
    public static final RegistryObject<Block> DEEPSLATE_TINY_TIN_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_TINY_TIN_ORE, UNCOMMON);
    public static final RegistryObject<Block> DEEPSLATE_TINY_URANIUM_ORE = createOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.DEEPSLATE_TINY_URANIUM_ORE, UNCOMMON);

    /* * * * * * * * * * * * * * * Nether Ore * * * * * * * * * * * * * */
    public static final RegistryObject<Block> NETHER_COAL_ORE = createNetherOreBlock(PROPERTIES_NETHER_ORE, Registries.NETHER_COAL_ORE, COMMON);
    public static final RegistryObject<Block> NETHER_COPPER_ORE = createNetherOreBlock(PROPERTIES_NETHER_ORE, Registries.NETHER_COPPER_ORE, COMMON);
    public static final RegistryObject<Block> NETHER_DIAMOND_ORE = createNetherOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.NETHER_DIAMOND_ORE, RARE);
    public static final RegistryObject<Block> NETHER_EMERALD_ORE = createNetherOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.NETHER_EMERALD_ORE, RARE);
    public static final RegistryObject<Block> NETHER_IRON_ORE = createNetherOreBlock(PROPERTIES_NETHER_ORE, Registries.NETHER_IRON_ORE, COMMON);
    public static final RegistryObject<Block> NETHER_LAPIS_ORE = createNetherOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.NETHER_LAPIS_ORE, UNCOMMON);
    public static final RegistryObject<Block> NETHER_REDSTONE_ORE = createNetherRedStoneOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.NETHER_REDSTONE_ORE);
    public static final RegistryObject<Block> NETHER_BAUXITE_ORE = createNetherOreBlock(PROPERTIES_NETHER_ORE, Registries.NETHER_BAUXITE_ORE, COMMON);
    public static final RegistryObject<Block> NETHER_LEAD_ORE = createNetherOreBlock(PROPERTIES_NETHER_ORE, Registries.NETHER_LEAD_ORE, COMMON);
    public static final RegistryObject<Block> NETHER_NICKEL_ORE = createNetherOreBlock(PROPERTIES_NETHER_ORE, Registries.NETHER_NICKEL_ORE, COMMON);
    public static final RegistryObject<Block> NETHER_SILVER_ORE = createNetherOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.NETHER_SILVER_ORE, UNCOMMON);
    public static final RegistryObject<Block> NETHER_TIN_ORE = createNetherOreBlock(PROPERTIES_NETHER_ORE, Registries.NETHER_TIN_ORE, COMMON);
    public static final RegistryObject<Block> NETHER_URANIUM_ORE = createNetherOreBlock(PROPERTIES_DEEPSLATE_ORE, Registries.NETHER_URANIUM_ORE, UNCOMMON);

    /* * * * * * * * * * * * * * * Storage Block * * * * * * * * * * * * * */
    public static final RegistryObject<Block> ALUMINIUM_BLOCK = createStorageBlock(Registries.ALUMINIUM_BLOCK, MaterialColor.METAL);
    public static final RegistryObject<Block> LEAD_BLOCK = createStorageBlock(Registries.LEAD_BLOCK, MaterialColor.COLOR_GRAY);
    public static final RegistryObject<Block> NICKEL_BLOCK = createStorageBlock(Registries.NICKEL_BLOCK, MaterialColor.SAND);
    public static final RegistryObject<Block> SILVER_BLOCK = createStorageBlock(Registries.SILVER_BLOCK, MaterialColor.SNOW);
    public static final RegistryObject<Block> TIN_BLOCK = createStorageBlock(Registries.TIN_BLOCK, MaterialColor.METAL);
    public static final RegistryObject<Block> URANIUM_BLOCK = createStorageBlock(Registries.URANIUM_BLOCK, MaterialColor.COLOR_YELLOW);

    public static final RegistryObject<Block> RAW_ALUMINIUM_BLOCK = createRawBlock(Registries.RAW_ALUMINIUM_BLOCK, MaterialColor.METAL);
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = createRawBlock(Registries.RAW_LEAD_BLOCK, MaterialColor.COLOR_GRAY);
    public static final RegistryObject<Block> RAW_NICKEL_BLOCK = createRawBlock(Registries.RAW_NICKEL_BLOCK, MaterialColor.SAND);
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = createRawBlock(Registries.RAW_SILVER_BLOCK, MaterialColor.SNOW);
    public static final RegistryObject<Block> RAW_TIN_BLOCK = createRawBlock(Registries.RAW_TIN_BLOCK, MaterialColor.METAL);
    public static final RegistryObject<Block> RAW_URANIUM_BLOCK = createRawBlock(Registries.RAW_URANIUM_BLOCK, MaterialColor.COLOR_YELLOW);

    private static RegistryObject<Block> createStorageBlock(String name, MaterialColor color) {
        return register(
                () -> new Block(
                        BlockBehaviour.Properties.of(Material.METAL, color)
                                .requiresCorrectToolForDrops()
                                .strength(3.0F, 6.0F)
                                .sound(SoundType.METAL)
                ),
                name
        );
    }

    private static RegistryObject<Block> createRawBlock(String name, MaterialColor color) {
        return register(
                () -> new Block(
                        BlockBehaviour.Properties.of(Material.STONE, color)
                                .requiresCorrectToolForDrops()
                                .strength(5.0F, 6.0F)
                ),
                name
        );
    }

    private static RegistryObject<Block> createOreBlock(BlockBehaviour.Properties properties, String name, UniformInt xp) {
        return register(() -> new OreBlock(properties, xp), name);
    }

    private static RegistryObject<Block> createNetherOreBlock(BlockBehaviour.Properties properties, String name, UniformInt xp) {
        return register(() -> new NetherOreBlock(properties, xp), name);
    }

    private static RegistryObject<Block> createRedStoneOreBlock(BlockBehaviour.Properties properties, String name) {
        return register(() -> new RedStoneOreBlock(properties), name);
    }

    private static RegistryObject<Block> createNetherRedStoneOreBlock(BlockBehaviour.Properties properties, String name) {
        return register(() -> new NetherRedStoneOreBlock(properties), name);
    }

    private static <T extends Block> RegistryObject<T> register(Supplier<T> block, String name) {
        RegistryObject<T> blockRegistry = BLOCKS.register(name, block);
        FoundationItems.ITEMS.register(name, () -> new BlockItem(blockRegistry.get(), PROPERTIES_ITEM_BLOCK));
        return blockRegistry;
    }

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
