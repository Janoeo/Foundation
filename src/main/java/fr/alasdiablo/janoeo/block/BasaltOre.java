package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.diabolo.block.ExperienceRarity;
import fr.alasdiablo.diabolo.block.IDropExperience;
import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

/**
 * Default implementation of Basalt Ore blocks
 */
public class BasaltOre extends RotatedPillarBlock implements IDropExperience {

    /**
     * Variable use of store ExperienceRarity needed by IDropExperience
     */
    private final ExperienceRarity experienceRarity;

    /**
     * Default constructor
     *
     * @param registryName     Name of the block
     * @param experienceRarity ExperienceRarity of the block
     */
    public BasaltOre(String registryName, ExperienceRarity experienceRarity) {
        super(Properties.create(Material.ROCK)
                .setRequiresTool()
                .hardnessAndResistance(2f, 4f)
                .sound(SoundType.BASALT)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
        this.setRegistryName(registryName);
        this.experienceRarity = experienceRarity;
    }

    /**
     * Rewrite <i>getExpDrop</i> for make it compatible with <i>IDropExperience</i>
     *
     * @see fr.alasdiablo.diabolo.block.IDropExperience
     * @see net.minecraftforge.common.extensions.IForgeBlock
     */
    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        if (silktouch == 0) {
            int experience = this.getExperience(RANDOM, this);
            return experience != -1 ? experience : 0;
        } else return 0;
    }

    /**
     * Implement getter of <i>IDropExperience</i>
     *
     * @see fr.alasdiablo.diabolo.block.IDropExperience
     */
    @Override
    public ExperienceRarity getExperienceRarity() {
        return this.experienceRarity;
    }
}
