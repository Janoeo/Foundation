package fr.alasdiablo.janoeo.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class NetherOre extends Block {

    public NetherOre(String registryName) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3f)
                .harvestLevel(2)
        );
        this.setRegistryName(registryName);
    }
}
