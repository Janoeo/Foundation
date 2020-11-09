package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.block.util.RedstoneOreUtils;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

/**
 * Reimplementation of <i>RedstoneOreBlock</i> use for simplify constructor call
 */
public class RedstoneOre extends RedstoneOreBlock {

    /**
     * Default constructor
     *
     * @param registryName Name of the block
     */
    public RedstoneOre(String registryName) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .tickRandomly()
                .hardnessAndResistance(3f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
                .setLightLevel(RedstoneOreUtils.isLit(9))
        );
        this.setRegistryName(registryName);
    }
}
