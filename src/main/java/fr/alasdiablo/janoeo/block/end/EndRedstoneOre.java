package fr.alasdiablo.janoeo.block.end;

import fr.alasdiablo.janoeo.block.EndOre;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class EndRedstoneOre extends RedstoneOreBlock {
    public EndRedstoneOre(String registryName) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .tickRandomly()
                .hardnessAndResistance(4f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .func_235838_a_((p) -> 9)
        );
        this.setRegistryName(registryName);
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBlockHarvested(worldIn, pos, state, player);
        EndOre.angerEnderman(player, worldIn, pos.getX(), pos.getY(), pos.getZ());
    }
}
