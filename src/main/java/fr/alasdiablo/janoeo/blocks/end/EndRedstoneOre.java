package fr.alasdiablo.janoeo.blocks.end;

import fr.alasdiablo.janoeo.blocks.EndOre;
import net.minecraft.block.BlockState;
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
                .lightValue(9)
                .hardnessAndResistance(4f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
        this.setRegistryName(registryName);
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBlockHarvested(worldIn, pos, state, player);
        EndOre.angerEnderman(player, worldIn, pos.getX(), pos.getY(), pos.getZ());
    }
}
