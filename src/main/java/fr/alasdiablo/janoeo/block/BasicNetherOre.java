package fr.alasdiablo.janoeo.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BasicNetherOre extends Block {

    public BasicNetherOre(String registryName) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
        this.setRegistryName(registryName);
    }
}
