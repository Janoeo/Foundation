package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.block.util.ExperienceDrop;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class GravelOre extends FallingBlock {

    public GravelOre(String registryName) {
        super(Properties.create(Material.EARTH)
                .sound(SoundType.GROUND)
                .hardnessAndResistance(0.6f)
                .harvestLevel(2)
                .harvestTool(ToolType.SHOVEL)
        );
        this.setRegistryName(registryName);
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public int getDustColor(BlockState state) {
        return -8356741;
    }

    protected int getExperience(Random random) {
        int experience = ExperienceDrop.getExperience(random, this);
        return experience != -1 ? experience : 0;
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.getExperience(RANDOM) : 0;
    }
}
