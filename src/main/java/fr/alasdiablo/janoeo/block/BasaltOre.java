package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.block.util.ExperienceDrop;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class BasaltOre extends RotatedPillarBlock {
    public BasaltOre(String registryName) {
        super(Properties.create(Material.ROCK, MaterialColor.BLACK)
                .func_235861_h_()
                .hardnessAndResistance(1.25F, 4.2F)
                .sound(SoundType.field_235587_I_)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
        this.setRegistryName(registryName);
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        if (silktouch == 0) {
            int experience = ExperienceDrop.getExperience(RANDOM, this);
            return experience != -1 ? experience : 0;
        } else return 0;
    }
}
