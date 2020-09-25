package fr.alasdiablo.janoeo.block.util;

import fr.alasdiablo.janoeo.block.*;
import fr.alasdiablo.janoeo.init.*;
import net.minecraft.block.Block;
import net.minecraft.util.math.MathHelper;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ExperienceDrop {

    private static final List<Block> experience_0_2;

    private static final List<Block> experience_3_7;

    private static final List<Block> experience_2_5;

    private static final List<Block> experience_1_4;


    static {
        experience_0_2 = Arrays.asList(
                NetherOresBlocks.COAL_NETHER_ORE,
                EndOresBlocks.COAL_END_ORE,
                GravelsOresBlocks.IRON_GRAVEL_ORE,
                OverworldDenseOresBlocks.DENSE_COAL_ORE,
                OverworldDenseOresBlocks.DENSE_COPPER_ORE,
                OverworldDenseOresBlocks.DENSE_IRON_ORE,
                OverworldDenseOresBlocks.DENSE_TIN_ORE,
                NetherDenseOresBlocks.DENSE_COAL_NETHER_ORE,
                NetherDenseOresBlocks.DENSE_IRON_NETHER_ORE,
                BasaltOresBlocks.COAL_BASALT_ORE
        );

        experience_3_7 = Arrays.asList(
                NetherOresBlocks.DIAMOND_NETHER_ORE,
                NetherOresBlocks.EMERALD_NETHER_ORE,
                NetherOresBlocks.RUBY_NETHER_ORE,
                NetherOresBlocks.SAPPHIRE_NETHER_ORE,
                EndOresBlocks.DIAMOND_END_ORE,
                EndOresBlocks.EMERALD_END_ORE,
                OverworldOresBlocks.RUBY_ORE,
                OverworldOresBlocks.AMETHYST_ORE,
                OverworldOresBlocks.SAPPHIRE_ORE,
                GravelsOresBlocks.DIAMOND_GRAVEL_ORE,
                OverworldDenseOresBlocks.DENSE_DIAMOND_ORE,
                OverworldDenseOresBlocks.DENSE_EMERALD_ORE,
                NetherDenseOresBlocks.DENSE_DIAMOND_NETHER_ORE,
                NetherDenseOresBlocks.DENSE_EMERALD_NETHER_ORE,
                BasaltOresBlocks.DIAMOND_BASALT_ORE,
                BasaltOresBlocks.EMERALD_BASALT_ORE
        );

        experience_2_5 = Arrays.asList(
                NetherOresBlocks.LAPIS_NETHER_ORE,
                EndOresBlocks.LAPIS_END_ORE,
                OverworldDenseOresBlocks.DENSE_LAPIS_ORE,
                NetherDenseOresBlocks.DENSE_LAPIS_NETHER_ORE,
                NetherDenseOresBlocks.DENSE_QUARTZ_NETHER_ORE,
                BasaltOresBlocks.LAPIS_BASALT_ORE
        );

        experience_1_4 = Arrays.asList(
                GravelsOresBlocks.GOLD_GRAVEL_ORE,
                EndOresBlocks.GOLD_END_ORE,
                NetherOresBlocks.GOLD_NETHER_ORE,
                OverworldDenseOresBlocks.DENSE_GOLD_ORE,
                NetherDenseOresBlocks.DENSE_GOLD_NETHER_ORE,
                BasaltOresBlocks.GOLD_BASALT_ORE
        );
    }

    public static int getExperience(Random random, Block block) {
        if (experience_0_2.contains(block))
            return MathHelper.nextInt(random, 0, 2);

        else if (experience_3_7.contains(block))
            return MathHelper.nextInt(random, 3, 7);

        else if (experience_2_5.contains(block))
            return MathHelper.nextInt(random, 2, 5);

        else if (experience_1_4.contains(block))
            return MathHelper.nextInt(random, 1, 4);

        else return -1;
    }
}
