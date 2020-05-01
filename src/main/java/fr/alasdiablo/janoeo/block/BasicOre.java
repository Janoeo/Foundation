package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.ores.overworld.OverworldOresBlocks;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.MathHelper;
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
        if (
                this == OverworldOresBlocks.RUBY_ORE ||
                this == OverworldOresBlocks.AMETHYST_ORE ||
                this == OverworldOresBlocks.SAPPHIRE_ORE
        ) {
            return MathHelper.nextInt(random, 3, 7);
        } else {
            return super.getExperience(random);
        }
    }
}
