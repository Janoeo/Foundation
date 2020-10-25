package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.block.util.ExperienceRarity;
import fr.alasdiablo.janoeo.block.util.IDropExperience;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class EndOre extends OreBlock implements IEndOre, IDropExperience {

    private final ExperienceRarity experienceRarity;

    public EndOre(String registryName, ExperienceRarity experienceRarity) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(4f)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
        this.setRegistryName(registryName);
        this.experienceRarity = experienceRarity;
    }

    @Override
    protected int getExperience(Random random) {
        int experience = this.getExperience(random, this);
        return experience != -1 ? experience : super.getExperience(random);
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBlockHarvested(worldIn, pos, state, player);
        this.angerEnderman(player, worldIn, pos.getX(), pos.getY(), pos.getZ());
    }

    @Override
    public ExperienceRarity getExperienceRarity() {
        return this.experienceRarity;
    }
}
