package fr.alasdiablo.janoeo.foundation.block;

import fr.alasdiablo.diolib.generic.ExperienceRarity;
import fr.alasdiablo.diolib.generic.IDropExperience;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class OreBlock extends net.minecraft.block.OreBlock implements IDropExperience {
    private final ExperienceRarity experienceRarity;

    public OreBlock(Properties properties, ExperienceRarity experienceRarity, String registryName) {
        super(properties);
        this.experienceRarity = experienceRarity;
        this.setRegistryName(registryName);
    }

    @Override
    public ExperienceRarity getExperienceRarity() {
        return this.experienceRarity;
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        if (silktouch != 0) return 0;
        int exp = this.getExperience(RANDOM, this);
        if (exp == -1) return this.getExperience(RANDOM);
        else return exp;
    }
}
