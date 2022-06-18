package fr.alasdiablo.janoeo.foundation.block;

import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.GravelBlock;
import net.minecraft.world.level.block.state.BlockState;

public class GravelOre extends GravelBlock {
    private final UniformInt xpRange;

    public GravelOre(Properties properties, UniformInt xpRange) {
        super(properties);
        this.xpRange = xpRange;
    }

    @Override
    public int getExpDrop(BlockState state, LevelReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.xpRange.sample(RANDOM) : 0;
    }
}
