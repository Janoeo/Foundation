package fr.alasdiablo.janoeo.foundation.block;

import fr.alasdiablo.diolib.block.ExperienceRarity;
import fr.alasdiablo.diolib.block.IDropExperience;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.RedStoneOreBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class RedstoneOreBlock extends RedStoneOreBlock implements IDropExperience {
    private final ExperienceRarity experienceRarity;

    public RedstoneOreBlock(Properties properties, ExperienceRarity experienceRarity, String registryName) {
        super(properties.randomTicks().lightLevel(state -> {
            try {
                return state.getValue(BlockStateProperties.LIT) ? 9 : 0;
            } catch (Exception e) {
                return 0;
            }
        }));
        this.experienceRarity = experienceRarity;
        this.setRegistryName(registryName);
    }

    @Override
    public ExperienceRarity getExperienceRarity() {
        return this.experienceRarity;
    }

    @Override
    public int getExpDrop(BlockState state, LevelReader reader, BlockPos pos, int fortune, int silktouch) {
        if (silktouch != 0) return 0;
        int exp = this.getExperience(RANDOM, this);
        if (exp == -1) return super.getExpDrop(state, reader, pos, fortune, silktouch);
        else return exp;
    }
}
