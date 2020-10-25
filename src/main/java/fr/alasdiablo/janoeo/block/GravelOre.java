package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.block.util.ExperienceRarity;
import fr.alasdiablo.janoeo.block.util.IDropExperience;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class GravelOre extends FallingBlock implements IDropExperience {

    private final ExperienceRarity experienceRarity;

    public GravelOre(String registryName, ExperienceRarity experienceRarity) {
        super(Properties.create(Material.EARTH)
                .sound(SoundType.GROUND)
                .hardnessAndResistance(0.6f)
                .harvestLevel(2)
                .harvestTool(ToolType.SHOVEL)
        );
        this.setRegistryName(registryName);
        this.experienceRarity = experienceRarity;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public int getDustColor(BlockState state, IBlockReader p_189876_2_, BlockPos p_189876_3_) {
        return -8356741;
    }

    protected int getExperience(Random random) {
        int experience = this.getExperience(random, this);
        return experience != -1 ? experience : 0;
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.getExperience(RANDOM) : 0;
    }

    @Override
    public ExperienceRarity getExperienceRarity() {
        return this.experienceRarity;
    }
}
