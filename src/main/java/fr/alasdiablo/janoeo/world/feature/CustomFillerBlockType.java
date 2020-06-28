package fr.alasdiablo.janoeo.world.feature;

import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.util.IStringSerializable;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public enum CustomFillerBlockType implements IStringSerializable {
    NATURAL_STONE("natural_stone", (state) -> {
        if (state == null) {
            return false;
        } else {
            Block block = state.getBlock();
            return block == Blocks.STONE || block == Blocks.GRANITE || block == Blocks.DIORITE || block == Blocks.ANDESITE;
        }
    }),
    NETHERRACK("netherrack", new BlockMatcher(Blocks.NETHERRACK)),
    END_STONE("end_stone", new BlockMatcher(Blocks.END_STONE)),
    GRAVEL("gravel", new BlockMatcher(Blocks.GRAVEL));

    private static final Map<String, CustomFillerBlockType> CUSTOM_FILLER_BLOCK_TYPE_MAP;
    public static final Codec<CustomFillerBlockType> FILLER_BLOCK_TYPE_CODEC;
    static {
        CUSTOM_FILLER_BLOCK_TYPE_MAP = Arrays.stream(values()).collect(Collectors.toMap(CustomFillerBlockType::getName, (customFillerBlockType) -> customFillerBlockType));
        FILLER_BLOCK_TYPE_CODEC = IStringSerializable.func_233023_a_(CustomFillerBlockType::values, CustomFillerBlockType::byName);
    }



    private final String name;
    private final Predicate<BlockState> targetBlockPredicate;

    CustomFillerBlockType(String nameIn, Predicate<BlockState> predicateIn) {
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
        return CUSTOM_FILLER_BLOCK_TYPE_MAP.get(name);
    }

    @Override
    public String func_176610_l() {
        return this.name;
    }
}
