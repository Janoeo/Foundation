package fr.alasdiablo.janoeo.util;

import net.minecraft.block.BlockState;
import net.minecraft.state.properties.BlockStateProperties;

import java.util.function.ToIntFunction;

/**
 * Class use of store Redstone ore block function
 */
public class RedstoneOreUtils {

    /**
     * Function use by redstone block for making glowing when <i>LIT</i> is true
     *
     * @param lightValue Quantity of light emitted by the block
     * @return Return <i>lightValue</i> or 0
     */
    public static ToIntFunction<BlockState> isLit(int lightValue) {
        return (states) -> states.get(BlockStateProperties.LIT) ? lightValue : 0;
    }
}
