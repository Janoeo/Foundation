package fr.alasdiablo.janoeo.foundation.block;

import fr.alasdiablo.diolib.api.block.AngerEnderman;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;

public class EndRedStoneOreBlock extends RedStoneOreBlock implements AngerEnderman {

    public EndRedStoneOreBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level world, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        this.anger(player, world, pos);
        return super.onDestroyedByPlayer(state, world, pos, player, willHarvest, fluid);
    }
}
