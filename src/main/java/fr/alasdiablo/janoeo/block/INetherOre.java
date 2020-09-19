package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.config.GlobalConfig;
import net.minecraft.entity.monster.ZombiePigmanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.World;

import java.util.List;

public interface INetherOre {

    default void angerPigman(PlayerEntity player, World world, int x, int y, int z) {
        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        if (globalConfig.ZOMBIE_PIGMAN_ANGER.get()) {
            int aggroRange = globalConfig.ZOMBIE_PIGMAN_ANGER_RANGE.get();
            List<ZombiePigmanEntity> list = world.getEntitiesWithinAABB(ZombiePigmanEntity.class,
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
