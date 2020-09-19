package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.block.util.ExperienceDrop;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class BasicOre extends OreBlock {

    public BasicOre(String registryName, int harvestLevel) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3f)
                .harvestLevel(harvestLevel)
                .harvestTool(ToolType.PICKAXE)
        );
        this.setRegistryName(registryName);
    }

    @Override
    protected int getExperience(Random random) {
        int experience = ExperienceDrop.getExperience(random, this);
        return experience != -1 ? experience : super.getExperience(random);
    }
}
