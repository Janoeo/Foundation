package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.block.util.ExperienceRarity;
import fr.alasdiablo.janoeo.block.util.IDropExperience;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class BasicOre extends OreBlock implements IDropExperience {

    private final ExperienceRarity experienceRarity;

    public BasicOre(String registryName, int harvestLevel, ExperienceRarity experienceRarity) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3f)
                .harvestLevel(harvestLevel)
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
    public ExperienceRarity getExperienceRarity() {
        return this.experienceRarity;
    }
}
