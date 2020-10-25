package fr.alasdiablo.janoeo.block.util;

import net.minecraft.util.math.MathHelper;

import java.util.Random;

public interface IDropExperience {
    
    ExperienceRarity getExperienceRarity();

    default int getExperience(Random random, IDropExperience block) {
        switch (block.getExperienceRarity()) {
            case COMMON:
                return MathHelper.nextInt(random, 0, 2);
            case UNCOMMON:
                return MathHelper.nextInt(random, 2, 5);
            case RARE:
                return MathHelper.nextInt(random, 3, 7);
            default:
                return -1;
        }
    }
}
