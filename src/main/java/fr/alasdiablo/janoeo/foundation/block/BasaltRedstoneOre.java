package fr.alasdiablo.janoeo.foundation.block;

import fr.alasdiablo.janoeo.foundation.util.RedstoneOreUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraftforge.common.ToolType;

/**
 * Default implementation of Basalt Redstone Ore blocks
 */
public class BasaltRedstoneOre extends RedstoneOreBlock {
    /**
     * Reimplementation of RotatedPillarBlock
     *
     * @see net.minecraft.block.RotatedPillarBlock
     */
    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;

    /**
     * Default constructor
     *
     * @param registryName Name of the block
     */
    public BasaltRedstoneOre(String registryName) {
        super(Properties.create(Material.ROCK)
                .setRequiresTool()
                .hardnessAndResistance(2f, 4f)
                .sound(SoundType.NETHER_GOLD)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .tickRandomly()
                .setLightLevel(RedstoneOreUtils.isLit(9))
        );
        this.setRegistryName(registryName);
        this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y));
    }

    /**
     * Reimplementation of RotatedPillarBlock
     *
     * @see net.minecraft.block.RotatedPillarBlock
     */
    @SuppressWarnings({"NullableProblems", "deprecation"})
    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        switch (rot) {
            case COUNTERCLOCKWISE_90:
            case CLOCKWISE_90:
                switch (state.get(AXIS)) {
                    case X:
                        return state.with(AXIS, Direction.Axis.Z);
                    case Z:
                        return state.with(AXIS, Direction.Axis.X);
                    default:
                        return state;
                }
            default:
                return state;
        }
    }

    /**
     * Reimplementation of RotatedPillarBlock
     *
     * @see net.minecraft.block.RotatedPillarBlock
     */
    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(AXIS).add(LIT);
    }

    /**
     * Reimplementation of RotatedPillarBlock
     *
     * @see net.minecraft.block.RotatedPillarBlock
     */
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(AXIS, context.getFace().getAxis());
    }
}
