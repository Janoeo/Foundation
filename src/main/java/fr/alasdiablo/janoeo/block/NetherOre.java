package fr.alasdiablo.janoeo.block;

import fr.alasdiablo.janoeo.block.util.ExperienceRarity;
import fr.alasdiablo.janoeo.block.util.IDropExperience;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class NetherOre extends OreBlock implements INetherOre, IDropExperience {

    private final ExperienceRarity experienceRarity;

    public NetherOre(String registryName, ExperienceRarity experienceRarity) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
        this.setRegistryName(registryName);
        this.experienceRarity = experienceRarity;
    }

    @Override
    protected int getExperience(Random random) {
        int experience = this.getExperience(random, this);
        return experience != -1 ? experience : super.getExperience(random);
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBlockHarvested(worldIn, pos, state, player);
        this.angerPigman(player, worldIn, pos.getX(), pos.getY(), pos.getZ());
    }

    @Override
    public ExperienceRarity getExperienceRarity() {
        return this.experienceRarity;
    }
}
