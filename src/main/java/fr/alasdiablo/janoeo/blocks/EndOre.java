package fr.alasdiablo.janoeo.blocks;

import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.ores.end.EndOresBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.List;
import java.util.Random;

public class EndOre extends OreBlock {

    public EndOre(String registryName) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(4f)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
        this.setRegistryName(registryName);
    }

    @Override
    protected int getExperience(Random random) {
        if (this == EndOresBlocks.COAL_END_ORE) {
            return MathHelper.nextInt(random, 0, 2);
        } else if (this == EndOresBlocks.DIAMOND_END_ORE) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == EndOresBlocks.EMERALD_END_ORE) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == EndOresBlocks.LAPIS_END_ORE) {
            return MathHelper.nextInt(random, 2, 5);
        } else {
            return super.getExperience(random);
        }
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBlockHarvested(worldIn, pos, state, player);
        angerEnderman(player, worldIn, pos.getX(), pos.getY(), pos.getZ());
    }

    public static void angerEnderman(PlayerEntity player, World world, int x, int y, int z) {
        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        if (globalConfig.ENDERMAN_ANGER.get()) {
            int aggroRange = globalConfig.ENDERMAN_ANGER_RANGE.get();
            List<EndermanEntity> list = world.getEntitiesWithinAABB(EndermanEntity.class,
                    AxisAlignedBB.toImmutable(MutableBoundingBox.createProper(
                            x - aggroRange,
                            y - aggroRange,
                            z - aggroRange,
                            x + aggroRange + 1,
                            y + aggroRange + 1,
                            z + aggroRange + 1))
            );
            list.forEach(e -> e.setAttackTarget(player));
        }
    }
}
