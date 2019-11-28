package fr.alasdiablo.janoeo.blocks;

import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.ore.nether.NetherOresBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.ZombiePigmanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.List;
import java.util.Random;

public class NetherOre extends OreBlock {

    public NetherOre(String registryName) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
        this.setRegistryName(registryName);
    }

    @Override
    protected int getExperience(Random random) {
        if (this == NetherOresBlocks.COAL_NETHER_ORE) {
            return MathHelper.nextInt(random, 0, 2);
        } else if (this == NetherOresBlocks.DIAMOND_NETHER_ORE) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == NetherOresBlocks.EMERALD_NETHER_ORE) {
            return MathHelper.nextInt(random, 3, 7);
        } else if (this == NetherOresBlocks.LAPIS_NETHER_ORE) {
            return MathHelper.nextInt(random, 2, 5);
        } else {
            return super.getExperience(random);
        }
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBlockHarvested(worldIn, pos, state, player);
        angerPigman(player, worldIn, pos.getX(), pos.getY(), pos.getZ());
    }

    public static void angerPigman(PlayerEntity player, World world, int x, int y, int z) {
        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        if (globalConfig.ZOMBIE_PIGMAN_ANGER.get()) {
            int aggroRange = globalConfig.ZOMBIE_PIGMAN_ANGER_RANGE.get();
            List<ZombiePigmanEntity> list = world.getEntitiesWithinAABB(ZombiePigmanEntity.class,
                    AxisAlignedBB.func_216363_a(MutableBoundingBox.createProper(
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
