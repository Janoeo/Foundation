package fr.alasdiablo.janoeo.blocks;

import fr.alasdiablo.janoeo.holder.BlocksHolder;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class EndOre extends OreBlock {

    public EndOre(String registryName) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(4f)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
        this.setRegistryName(registryName);
    }

    @Override
    protected int getExperience(Random random) {
        if (this == BlocksHolder.COAL_END_ORE) {
            return MathHelper.nextInt(random, 0, 2);
        } else if (this == BlocksHolder.DIAMOND_END_ORE) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == BlocksHolder.EMERALD_END_ORE) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == BlocksHolder.LAPIS_END_ORE) {
            return MathHelper.nextInt(random, 2, 5);
        } else {
            return super.getExperience(random);
        }
    }
}
