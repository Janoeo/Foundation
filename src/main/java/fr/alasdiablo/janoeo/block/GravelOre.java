package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.diolib.block.ExperienceRarity;
import fr.alasdiablo.diolib.block.IDropExperience;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

/**
 * Default implementation of Gravel Ore blocks
 */
public class GravelOre extends GravelBlock implements IDropExperience {

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
    public GravelOre(String registryName, ExperienceRarity experienceRarity) {
        super(Properties.create(Material.SAND)
                .sound(SoundType.GROUND)
                .hardnessAndResistance(1f)
                .harvestLevel(2)
                .harvestTool(ToolType.SHOVEL)
        );
        this.setRegistryName(registryName);
        this.experienceRarity = experienceRarity;
    }

    /**
     * Rewrite <i>getExpDrop</i> for make it compatible with <i>IDropExperience</i>
     *
     * @see fr.alasdiablo.diolib.block.IDropExperience
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
     * @see fr.alasdiablo.diolib.block.IDropExperience
     */
    @Override
    public ExperienceRarity getExperienceRarity() {
        return this.experienceRarity;
    }
}
