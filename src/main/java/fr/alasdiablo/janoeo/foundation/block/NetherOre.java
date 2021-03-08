package fr.alasdiablo.janoeo.foundation.block;

import fr.alasdiablo.diolib.block.INetherOre;
import fr.alasdiablo.diolib.generic.ExperienceRarity;
import fr.alasdiablo.diolib.generic.IDropExperience;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.Random;

/**
 * Default implementation of Nether Ore blocks
 */
public class NetherOre extends OreBlock implements INetherOre, IDropExperience {

    /**
     * Variable use of store ExperienceRarity needed by IDropExperience
     */
    private final ExperienceRarity experienceRarity;

    /**
     * Default constructor
     *
     * @param registryName     Name of the block
     * @param experienceRarity ExperienceRarity of the block
     */
    public NetherOre(String registryName, ExperienceRarity experienceRarity) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.NETHER_ORE)
                .hardnessAndResistance(1f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
        );
        this.setRegistryName(registryName);
        this.experienceRarity = experienceRarity;
    }

    /**
     * Rewrite <i>getExperience</i> for make it compatible with <i>IDropExperience</i>
     *
     * @see fr.alasdiablo.diolib.generic.IDropExperience
     * @see net.minecraft.block.OreBlock
     */
    @Override
    protected int getExperience(Random random) {
        int experience = this.getExperience(random, this);
        return experience != -1 ? experience : super.getExperience(random);
    }

    /**
     * Add event <i>INetherOre.angerPigman</i> event on block harvested
     *
     * @see fr.alasdiablo.diolib.block.INetherOre
     * @see net.minecraft.block.Block
     */
    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBlockHarvested(worldIn, pos, state, player);
        this.angerZombifiedPiglin(player, worldIn, pos, null, null);
    }

    /**
     * Implement getter of <i>IDropExperience</i>
     *
     * @see fr.alasdiablo.diolib.generic.IDropExperience
     */
    @Override
    public ExperienceRarity getExperienceRarity() {
        return this.experienceRarity;
    }
}
