package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.config.GlobalConfig;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.World;

import java.util.List;

public interface IEndOre {

    default void angerEnderman(PlayerEntity player, World world, int x, int y, int z) {
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
