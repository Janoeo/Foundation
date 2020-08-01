package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.block.util.RedstoneOreUtils;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RedstoneOre extends RedstoneOreBlock {

    public RedstoneOre(String registryName) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .tickRandomly()
                .hardnessAndResistance(3f)
                .func_235861_h_()
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .func_235838_a_(RedstoneOreUtils.isLit(9))
        );
        this.setRegistryName(registryName);
    }
}
