package fr.alasdiablo.janoeo.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BasicBlock extends Block {
    public BasicBlock(String registryName) {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(3f)
                .harvestTool(ToolType.PICKAXE)
        );
        this.setRegistryName(registryName);
    }
}
