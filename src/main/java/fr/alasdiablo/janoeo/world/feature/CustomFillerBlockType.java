package fr.alasdiablo.janoeo.world.feature;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class CustomFillerBlockType {
    private static final Map<String, CustomFillerBlockType> fillerBlockTypeMap;
    public static final CustomFillerBlockType NATURAL_STONE;
    public static final CustomFillerBlockType NETHERRACK;
    public static final CustomFillerBlockType END_STONE;
    public static final CustomFillerBlockType GRAVEL;

    static {
        fillerBlockTypeMap = new HashMap<>();
        NATURAL_STONE = createFillerBlockType("natural_stone", (state) -> {
            if (state == null) {
                return false;
            } else {
                Block block = state.getBlock();
                return block == Blocks.STONE || block == Blocks.GRANITE || block == Blocks.DIORITE || block == Blocks.ANDESITE;
            }
        });
        NETHERRACK  = createFillerBlockType("netherrack", new BlockMatcher(Blocks.NETHERRACK));
        END_STONE = createFillerBlockType("end_stone", new BlockMatcher(Blocks.END_STONE));
        GRAVEL = createFillerBlockType("gravel", new BlockMatcher(Blocks.GRAVEL));
    }

    private final String name;
    private final Predicate<BlockState> targetBlockPredicate;

    private CustomFillerBlockType(String nameIn, Predicate<BlockState> predicateIn) {
        this.name = nameIn;
        this.targetBlockPredicate = predicateIn;
    }

    public String getName() {
        return this.name;
    }

    public Predicate<BlockState> getTargetBlockPredicate() {
        return this.targetBlockPredicate;
    }

    public static CustomFillerBlockType byName(String name) {
        return fillerBlockTypeMap.get(name);
    }

    public static CustomFillerBlockType createFillerBlockType(String nameIn, Predicate<BlockState> predicateIn) {
        CustomFillerBlockType customFillerBlockType = new CustomFillerBlockType(nameIn, predicateIn);
        fillerBlockTypeMap.put(customFillerBlockType.name, customFillerBlockType);
        return customFillerBlockType;
    }
}
