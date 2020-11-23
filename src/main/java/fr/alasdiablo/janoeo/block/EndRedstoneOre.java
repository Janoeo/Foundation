package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.diabolo.block.IEndOre;
import fr.alasdiablo.janoeo.util.RedstoneOreUtils;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

/**
 * Default implementation of The End Redstone Ore blocks
 */
public class EndRedstoneOre extends RedstoneOreBlock implements IEndOre {

    /**
     * Default constructor
     *
     * @param registryName Name of the block
     */
    public EndRedstoneOre(String registryName) {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(4.0f, 8.0f)
                .sound(SoundType.STONE)
                .tickRandomly()
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
                .setLightLevel(RedstoneOreUtils.isLit(9))
        );
        this.setRegistryName(registryName);
    }

    /**
     * Add event <i>IEndOre.angerEnderman</i> event on block harvested
     *
     * @see fr.alasdiablo.diabolo.block.IEndOre
     * @see net.minecraft.block.Block
     */
    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBlockHarvested(worldIn, pos, state, player);
        this.angerEnderman(player, worldIn, pos, null, null);
    }
}
