package fr.alasdiablo.janoeo.foundation.block;

import fr.alasdiablo.diolib.block.ExperienceRarity;
import fr.alasdiablo.diolib.block.INetherOre;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;

public class NetherOreBlock extends OreBlock implements INetherOre {
    public NetherOreBlock(Properties properties, ExperienceRarity experienceRarity, String registryName) {
        super(properties, experienceRarity, registryName);
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level world, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        this.angerZombifiedPiglin(player, world, pos, null, null);
        return super.onDestroyedByPlayer(state, world, pos, player, willHarvest, fluid);
    }
}
