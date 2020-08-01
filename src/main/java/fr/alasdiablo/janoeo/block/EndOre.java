package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.block.util.ExperienceDrop;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class EndOre extends OreBlock implements IEndOre {

    public EndOre(String registryName) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .func_235861_h_()
                .hardnessAndResistance(4f)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
        this.setRegistryName(registryName);
    }

    @Override
    protected int getExperience(Random random) {
        int experience = ExperienceDrop.getExperience(random, this);
        return experience != -1 ? experience : super.getExperience(random);
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBlockHarvested(worldIn, pos, state, player);
        this.angerEnderman(player, worldIn, pos.getX(), pos.getY(), pos.getZ());
    }
}
