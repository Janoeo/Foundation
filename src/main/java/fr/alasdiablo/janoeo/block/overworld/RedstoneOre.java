package fr.alasdiablo.janoeo.block.overworld;

import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RedstoneOre extends RedstoneOreBlock {

    public RedstoneOre(String registryName) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .tickRandomly()
                .lightValue(9)
                .hardnessAndResistance(3f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
        this.setRegistryName(registryName);
    }
}
