package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.block.util.RedstoneOreUtils;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

/**
 * Default implementation of Nether Redstone Ore blocks
 */
public class NetherRedstoneOre extends RedstoneOreBlock implements INetherOre {

    /**
     * Default constructor
     *
     * @param registryName Name of the block
     */
    public NetherRedstoneOre(String registryName) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.NETHERRACK)
                .tickRandomly()
                .hardnessAndResistance(1f)
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
     * @see fr.alasdiablo.janoeo.block.IEndOre
     * @see net.minecraft.block.Block
     */
    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBlockHarvested(worldIn, pos, state, player);
        this.angerPigman(player, worldIn, pos);
    }
}
