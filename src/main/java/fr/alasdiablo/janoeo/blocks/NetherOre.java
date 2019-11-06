package fr.alasdiablo.janoeo.blocks;

import fr.alasdiablo.janoeo.holder.BlocksHolder;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class NetherOre extends OreBlock {

    public NetherOre(String registryName) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
        this.setRegistryName(registryName);
    }

    @Override
    protected int getExperience(Random random) {
        if (this == BlocksHolder.COAL_NETHER_ORE) {
            return MathHelper.nextInt(random, 0, 2);
        } else if (this == BlocksHolder.DIAMOND_NETHER_ORE) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == BlocksHolder.EMERALD_NETHER_ORE) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == BlocksHolder.LAPIS_NETHER_ORE) {
            return MathHelper.nextInt(random, 2, 5);
        } else {
            return super.getExperience(random);
        }
    }
}
