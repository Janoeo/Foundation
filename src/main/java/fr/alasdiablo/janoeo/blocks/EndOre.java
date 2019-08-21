package fr.alasdiablo.janoeo.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class EndOre extends Block {

    public EndOre(String registryName) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(4f)
                .harvestLevel(3)
        );
        this.setRegistryName(registryName);
    }
}
