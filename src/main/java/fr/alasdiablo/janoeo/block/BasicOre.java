package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.diolib.generic.ExperienceRarity;
import fr.alasdiablo.diolib.generic.IDropExperience;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

import java.util.Random;

/**
 * Default implementation of Ore blocks
 */
public class BasicOre extends OreBlock implements IDropExperience {

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
    public BasicOre(String registryName, int harvestLevel, ExperienceRarity experienceRarity) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3f)
                .harvestLevel(harvestLevel)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
        );
        this.setRegistryName(registryName);
        this.experienceRarity = experienceRarity;
    }

    /**
     * Rewrite <i>getExperience</i> for make it compatible with <i>IDropExperience</i>
     *
     * @see fr.alasdiablo.diolib.generic.IDropExperience
     * @see net.minecraft.block.OreBlock
     */
    @Override
    protected int getExperience(Random random) {
        int experience = this.getExperience(random, this);
        return experience != -1 ? experience : super.getExperience(random);
    }

    /**
     * Implement getter of <i>IDropExperience</i>
     *
     * @see fr.alasdiablo.diolib.generic.IDropExperience
     */
    @Override
    public ExperienceRarity getExperienceRarity() {
        return this.experienceRarity;
    }
}
