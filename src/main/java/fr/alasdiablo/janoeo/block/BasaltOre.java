package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.block.util.ExperienceRarity;
import fr.alasdiablo.janoeo.block.util.IDropExperience;
import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class BasaltOre extends RotatedPillarBlock implements IDropExperience {

    private final ExperienceRarity experienceRarity;

    public BasaltOre(String registryName, ExperienceRarity experienceRarity) {
        super(Properties.create(Material.ROCK, MaterialColor.BLACK)
                .setRequiresTool()
                .hardnessAndResistance(1.25F, 4.2F)
                .sound(SoundType.BASALT)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
        this.setRegistryName(registryName);
        this.experienceRarity = experienceRarity;
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        if (silktouch == 0) {
            int experience = this.getExperience(RANDOM, this);
            return experience != -1 ? experience : 0;
        } else return 0;
    }

    @Override
    public ExperienceRarity getExperienceRarity() {
        return this.experienceRarity;
    }
}
