package fr.alasdiablo.janoeo.block.util;

import net.minecraft.block.BlockState;
import net.minecraft.state.properties.BlockStateProperties;

import java.util.function.ToIntFunction;

public class RedstoneOreUtils {

    public static ToIntFunction<BlockState> isLit(int lightValue) {
        return (states) -> states.get(BlockStateProperties.LIT) ? lightValue : 0;
    }
}
