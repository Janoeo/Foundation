package fr.alasdiablo.janoeo.foundation.init;

import com.google.common.collect.ImmutableMap;
import fr.alasdiablo.diolib.api.item.GroundCreativeModeTab;
import fr.alasdiablo.diolib.api.util.ResourceLocations;
import fr.alasdiablo.diolib.event.IEvent;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.block.*;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import fr.alasdiablo.janoeo.foundation.resource.ResourceType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.function.Supplier;

public class FoundationBlocks {
    static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Foundation.MOD_ID);

    /* * * * * * * * * * * * * * * Blocks * * * * * * * * * * * * * */
    public static final Map<Resource, RegistryObject<Block>> STONE_ORES;
    public static final Map<Resource, RegistryObject<Block>> TINY_STONE_ORES;
    public static final Map<Resource, RegistryObject<Block>> DEEPSLATE_ORES;
    public static final Map<Resource, RegistryObject<Block>> TINY_DEEPSLATE_ORES;
    public static final Map<Resource, RegistryObject<Block>> NETHER_ORES;
    public static final Map<Resource, RegistryObject<Block>> END_ORES;
    public static final Map<Resource, RegistryObject<Block>> GRAVEL_ORES;
    public static final Map<Resource, RegistryObject<Block>> RAW_BLOCKS;
    public static final Map<Resource, RegistryObject<Block>> STORAGE_BLOCKS;

    /* * * * * * * * * * * * * * * Item Properties * * * * * * * * * * * * * */
    private static final Item.Properties PROPERTIES_ITEM_BLOCK = new Item.Properties();

    /* * * * * * * * * * * * * * * Block Properties * * * * * * * * * * * * * */
    private static final BlockBehaviour.Properties PROPERTIES_STONE_ORE     = BlockBehaviour.Properties.of(Material.STONE)
            .requiresCorrectToolForDrops()
            .strength(3.0F, 3.0F);
    private static final BlockBehaviour.Properties PROPERTIES_DEEPSLATE_ORE = BlockBehaviour.Properties.of(Material.STONE)
            .requiresCorrectToolForDrops()
            .color(MaterialColor.DEEPSLATE)
            .strength(4.5F, 3.0F)
            .sound(SoundType.DEEPSLATE);
    private static final BlockBehaviour.Properties PROPERTIES_NETHER_ORE    = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER)
            .requiresCorrectToolForDrops()
            .strength(3.0F, 3.0F)
            .sound(SoundType.NETHER_ORE);
    private static final BlockBehaviour.Properties PROPERTIES_GRAVEL_ORE    = BlockBehaviour.Properties.of(Material.SAND, MaterialColor.STONE)
            .requiresCorrectToolForDrops()
            .strength(0.6F)
            .sound(SoundType.GRAVEL);

    /* * * * * * * * * * * * * * * Block Constructor * * * * * * * * * * * * * */
    static {
        var stoneOres         = new ImmutableMap.Builder<Resource, RegistryObject<Block>>();
        var tinyStoneOres     = new ImmutableMap.Builder<Resource, RegistryObject<Block>>();
        var deepslateOres     = new ImmutableMap.Builder<Resource, RegistryObject<Block>>();
        var tinyDeepslateOres = new ImmutableMap.Builder<Resource, RegistryObject<Block>>();
        var netherOres        = new ImmutableMap.Builder<Resource, RegistryObject<Block>>();
        var endOres        = new ImmutableMap.Builder<Resource, RegistryObject<Block>>();
        var gravelOres        = new ImmutableMap.Builder<Resource, RegistryObject<Block>>();
        var rawBlocks         = new ImmutableMap.Builder<Resource, RegistryObject<Block>>();
        var storageBlocks     = new ImmutableMap.Builder<Resource, RegistryObject<Block>>();

        for (Resource resource: Resource.values()) {
            if (resource == Resource.RedStone) {
                tinyStoneOres.put(resource, createRedStoneOreBlock(PROPERTIES_STONE_ORE, resource.getName(ResourceType.TinyStoneOre)));
                tinyDeepslateOres.put(resource, createRedStoneOreBlock(PROPERTIES_DEEPSLATE_ORE, resource.getName(ResourceType.TinyDeepSlateOre)));
                netherOres.put(resource, createNetherRedStoneOreBlock(resource.getName(ResourceType.NetherOre)));
                endOres.put(resource, createEndRedStoneOreBlock(resource.getName(ResourceType.EndOre)));
                gravelOres.put(resource, createRedStoneGravelOreBlock(resource.getName(ResourceType.GravelOre)));
            } else for (ResourceType type: ResourceType.BLOCKS) {
                if (resource.has(type)) {
                    String name = resource.getName(type);
                    RegistryObject<Block> block = switch (type) {
                        case RawMaterialBlock -> createRawBlock(name, resource.getMaterialColor());
                        case StorageBlock -> createStorageBlock(name, resource.getMaterialColor());
                        case StoneOre, TinyStoneOre -> createOreBlock(PROPERTIES_STONE_ORE, name, resource.getXp());
                        case DeepSlateOre, TinyDeepSlateOre -> createOreBlock(PROPERTIES_DEEPSLATE_ORE, name, resource.getXp());
                        case NetherOre -> createNetherOreBlock(name, resource.getXp());
                        case EndOre -> createEndOreBlock(name, resource.getXp());
                        case GravelOre -> createGravelOreBlock(name, resource.getXp());
                        default -> throw new IllegalStateException("Unknown block type: " + type.name());
                    };

                    if (type == ResourceType.StoneOre) stoneOres.put(resource, block);
                    if (type == ResourceType.TinyStoneOre) tinyStoneOres.put(resource, block);
                    if (type == ResourceType.DeepSlateOre) deepslateOres.put(resource, block);
                    if (type == ResourceType.TinyDeepSlateOre) tinyDeepslateOres.put(resource, block);
                    if (type == ResourceType.NetherOre) netherOres.put(resource, block);
                    if (type == ResourceType.EndOre) endOres.put(resource, block);
                    if (type == ResourceType.GravelOre) gravelOres.put(resource, block);
                    if (type == ResourceType.RawMaterialBlock) rawBlocks.put(resource, block);
                    if (type == ResourceType.StorageBlock) storageBlocks.put(resource, block);
                }
            }
        }

        STONE_ORES          = stoneOres.build();
        TINY_STONE_ORES     = tinyStoneOres.build();
        DEEPSLATE_ORES      = deepslateOres.build();
        TINY_DEEPSLATE_ORES = tinyDeepslateOres.build();
        NETHER_ORES         = netherOres.build();
        END_ORES            = endOres.build();
        GRAVEL_ORES         = gravelOres.build();
        RAW_BLOCKS          = rawBlocks.build();
        STORAGE_BLOCKS      = storageBlocks.build();
    }

    /* * * * * * * * * * * * * * * Block builder * * * * * * * * * * * * * */
    private static <T extends Block> RegistryObject<T> register(Supplier<T> block, String name) {
        RegistryObject<T> blockRegistry = BLOCKS.register(name, block);
        FoundationItems.ITEMS.register(name, () -> new BlockItem(blockRegistry.get(), PROPERTIES_ITEM_BLOCK));
        return blockRegistry;
    }

    private static RegistryObject<Block> createOreBlock(BlockBehaviour.Properties properties, String name, UniformInt xp) {
        return register(() -> new DropExperienceBlock(properties, xp), name);
    }

    private static RegistryObject<Block> createRedStoneOreBlock(BlockBehaviour.Properties properties, String name) {
        return register(() -> new RedStoneOreBlock(properties), name);
    }

    private static RegistryObject<Block> createNetherOreBlock(String name, UniformInt xp) {
        return register(() -> new NetherOreBlock(PROPERTIES_NETHER_ORE, xp), name);
    }

    private static RegistryObject<Block> createNetherRedStoneOreBlock(String name) {
        return register(() -> new NetherRedStoneOreBlock(PROPERTIES_NETHER_ORE), name);
    }

    private static RegistryObject<Block> createEndOreBlock(String name, UniformInt xp) {
        return register(() -> new EndOreBlock(PROPERTIES_NETHER_ORE, xp), name);
    }

    private static RegistryObject<Block> createEndRedStoneOreBlock(String name) {
        return register(() -> new EndRedStoneOreBlock(PROPERTIES_NETHER_ORE), name);
    }

    private static RegistryObject<Block> createGravelOreBlock(String name, UniformInt xp) {
        return register(() -> new GravelOre(PROPERTIES_GRAVEL_ORE, xp), name);
    }

    private static RegistryObject<Block> createRedStoneGravelOreBlock(String name) {
        return register(() -> new GravelRedStoneOre(PROPERTIES_GRAVEL_ORE), name);
    }

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

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
    }

    public static void onCreativeModeTabEvent(@NotNull CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == Foundation.ORES_GROUP) {
            FoundationBlocks.RAW_BLOCKS.values().forEach(blockRegistryObject -> event.accept(blockRegistryObject.get()));
            FoundationBlocks.STORAGE_BLOCKS.values().forEach(blockRegistryObject -> event.accept(blockRegistryObject.get()));
            FoundationBlocks.STONE_ORES.values().forEach(blockRegistryObject -> event.accept(blockRegistryObject.get()));
            FoundationBlocks.TINY_STONE_ORES.values().forEach(blockRegistryObject -> event.accept(blockRegistryObject.get()));
            FoundationBlocks.GRAVEL_ORES.values().forEach(blockRegistryObject -> event.accept(blockRegistryObject.get()));
            FoundationBlocks.DEEPSLATE_ORES.values().forEach(blockRegistryObject -> event.accept(blockRegistryObject.get()));
            FoundationBlocks.TINY_DEEPSLATE_ORES.values().forEach(blockRegistryObject -> event.accept(blockRegistryObject.get()));
            FoundationBlocks.NETHER_ORES.values().forEach(blockRegistryObject -> event.accept(blockRegistryObject.get()));
            FoundationBlocks.END_ORES.values().forEach(blockRegistryObject -> event.accept(blockRegistryObject.get()));
        }
    }
}
