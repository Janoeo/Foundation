package fr.alasdiablo.janoeo.block;

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
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .func_235838_a_((p) -> 9)
        );
        this.setRegistryName(registryName);
    }
}
