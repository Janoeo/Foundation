package fr.alasdiablo.janoeo.foundation.data.tag;

import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import static fr.alasdiablo.janoeo.foundation.init.FoundationBlocks.*;
import static fr.alasdiablo.janoeo.foundation.init.FoundationTags.Blocks.*;

@SuppressWarnings("unchecked")
public class FoundationBlockTagsProvider extends BlockTagsProvider {
    public FoundationBlockTagsProvider(DataGenerator generatorIn, @Nullable ExistingFileHelper existingFileHelper) {
        super(generatorIn, Registries.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.tag(Tags.Blocks.ORES).addTags(ORES_ALUMINIUM, ORES_ALUMINUM, ORES_LEAD, ORES_NICKEL, ORES_SILVER, ORES_TIN, ORES_URANIUM, ORES_TINY);

        this.tag(ORES_ALUMINUM).addTags(ORES_ALUMINIUM); // Reference to ORES_ALUMINIUM
        this.tag(ORES_ALUMINIUM).add(BAUXITE_ORE, DEEPSLATE_BAUXITE_ORE, NETHER_BAUXITE_ORE);
        this.tag(ORES_LEAD).add(LEAD_ORE, DEEPSLATE_LEAD_ORE, NETHER_LEAD_ORE);
        this.tag(ORES_NICKEL).add(NICKEL_ORE, DEEPSLATE_NICKEL_ORE, NICKEL_ORE);
        this.tag(ORES_SILVER).add(SILVER_ORE, DEEPSLATE_SILVER_ORE, NETHER_SILVER_ORE);
        this.tag(ORES_TIN).add(TIN_ORE, DEEPSLATE_TIN_ORE, NETHER_TIN_ORE);
        this.tag(ORES_URANIUM).add(URANIUM_ORE, DEEPSLATE_URANIUM_ORE, NETHER_URANIUM_ORE);

        this.tag(Tags.Blocks.ORES_REDSTONE).add(NETHER_REDSTONE_ORE);
        this.tag(Tags.Blocks.ORES_LAPIS).add(NETHER_LAPIS_ORE);
        this.tag(Tags.Blocks.ORES_IRON).add(NETHER_IRON_ORE);
        this.tag(Tags.Blocks.ORES_EMERALD).add(NETHER_EMERALD_ORE);
        this.tag(Tags.Blocks.ORES_DIAMOND).add(NETHER_DIAMOND_ORE);
        this.tag(ORES_COPPER).add(NETHER_COPPER_ORE);
        this.tag(Tags.Blocks.ORES_COAL).add(NETHER_COAL_ORE);

        this.tag(ORES_TINY).addTags(ORES_TINY_COAL, ORES_TINY_COPPER, ORES_TINY_DIAMOND, ORES_TINY_EMERALD, ORES_TINY_GOLD, ORES_TINY_IRON, ORES_TINY_LAPIS,
                                    ORES_TINY_REDSTONE, ORES_TINY_ALUMINIUM, ORES_TINY_ALUMINUM, ORES_TINY_LEAD, ORES_TINY_NICKEL, ORES_TINY_SILVER,
                                    ORES_TINY_TIN, ORES_TINY_URANIUM
        );

        this.tag(ORES_TINY_COAL).add(TINY_COAL_ORE, DEEPSLATE_TINY_COAL_ORE);
        this.tag(ORES_TINY_COPPER).add(TINY_COPPER_ORE, DEEPSLATE_TINY_COPPER_ORE);
        this.tag(ORES_TINY_DIAMOND).add(TINY_DIAMOND_ORE, DEEPSLATE_TINY_DIAMOND_ORE);
        this.tag(ORES_TINY_EMERALD).add(TINY_EMERALD_ORE, DEEPSLATE_TINY_EMERALD_ORE);
        this.tag(ORES_TINY_GOLD).add(TINY_GOLD_ORE, DEEPSLATE_TINY_GOLD_ORE);
        this.tag(ORES_TINY_IRON).add(TINY_IRON_ORE, DEEPSLATE_TINY_IRON_ORE);
        this.tag(ORES_TINY_LAPIS).add(TINY_LAPIS_ORE, DEEPSLATE_TINY_LAPIS_ORE);
        this.tag(ORES_TINY_REDSTONE).add(TINY_REDSTONE_ORE, DEEPSLATE_TINY_REDSTONE_ORE);

        this.tag(ORES_TINY_ALUMINUM).addTags(ORES_TINY_ALUMINIUM); // Reference to ORES_TINY_ALUMINIUM
        this.tag(ORES_TINY_ALUMINIUM).add(TINY_BAUXITE_ORE, DEEPSLATE_TINY_BAUXITE_ORE);
        this.tag(ORES_TINY_LEAD).add(TINY_LEAD_ORE, DEEPSLATE_TINY_LEAD_ORE);
        this.tag(ORES_TINY_NICKEL).add(TINY_NICKEL_ORE, DEEPSLATE_TINY_NICKEL_ORE);
        this.tag(ORES_TINY_SILVER).add(TINY_SILVER_ORE, DEEPSLATE_TINY_SILVER_ORE);
        this.tag(ORES_TINY_TIN).add(TINY_TIN_ORE, DEEPSLATE_TINY_TIN_ORE);
        this.tag(ORES_TINY_URANIUM).add(TINY_URANIUM_ORE, DEEPSLATE_TINY_URANIUM_ORE);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BAUXITE_ORE, LEAD_ORE, NICKEL_ORE, SILVER_ORE, TIN_ORE, URANIUM_ORE, DEEPSLATE_BAUXITE_ORE, DEEPSLATE_LEAD_ORE, DEEPSLATE_NICKEL_ORE,
                     DEEPSLATE_SILVER_ORE, DEEPSLATE_TIN_ORE, DEEPSLATE_URANIUM_ORE, TINY_COAL_ORE, TINY_COPPER_ORE, TINY_DIAMOND_ORE, TINY_EMERALD_ORE,
                     TINY_GOLD_ORE, TINY_IRON_ORE, TINY_LAPIS_ORE, TINY_REDSTONE_ORE, DEEPSLATE_TINY_COAL_ORE, DEEPSLATE_TINY_COPPER_ORE,
                     DEEPSLATE_TINY_DIAMOND_ORE, DEEPSLATE_TINY_EMERALD_ORE, DEEPSLATE_TINY_GOLD_ORE, DEEPSLATE_TINY_IRON_ORE, DEEPSLATE_TINY_LAPIS_ORE,
                     DEEPSLATE_TINY_REDSTONE_ORE, TINY_BAUXITE_ORE, TINY_LEAD_ORE, TINY_NICKEL_ORE, TINY_SILVER_ORE, TINY_TIN_ORE, TINY_URANIUM_ORE,
                     DEEPSLATE_TINY_BAUXITE_ORE, DEEPSLATE_TINY_LEAD_ORE, DEEPSLATE_TINY_NICKEL_ORE, DEEPSLATE_TINY_SILVER_ORE, DEEPSLATE_TINY_TIN_ORE,
                     DEEPSLATE_TINY_URANIUM_ORE
                );

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(BAUXITE_ORE, LEAD_ORE, TIN_ORE, DEEPSLATE_BAUXITE_ORE, DEEPSLATE_LEAD_ORE, DEEPSLATE_TIN_ORE, TINY_COPPER_ORE, TINY_IRON_ORE,
                     DEEPSLATE_TINY_COPPER_ORE, DEEPSLATE_TINY_IRON_ORE, TINY_BAUXITE_ORE, TINY_LEAD_ORE, TINY_TIN_ORE, DEEPSLATE_TINY_BAUXITE_ORE,
                     DEEPSLATE_TINY_LEAD_ORE, DEEPSLATE_TINY_TIN_ORE
                );

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(NICKEL_ORE, SILVER_ORE, URANIUM_ORE, DEEPSLATE_NICKEL_ORE, DEEPSLATE_SILVER_ORE, DEEPSLATE_URANIUM_ORE, TINY_DIAMOND_ORE, TINY_EMERALD_ORE,
                     TINY_GOLD_ORE, TINY_LAPIS_ORE, TINY_REDSTONE_ORE, DEEPSLATE_TINY_DIAMOND_ORE, DEEPSLATE_TINY_EMERALD_ORE, DEEPSLATE_TINY_GOLD_ORE,
                     DEEPSLATE_TINY_LAPIS_ORE, DEEPSLATE_TINY_REDSTONE_ORE, TINY_NICKEL_ORE, TINY_SILVER_ORE, TINY_URANIUM_ORE, DEEPSLATE_TINY_NICKEL_ORE,
                     DEEPSLATE_TINY_SILVER_ORE, DEEPSLATE_TINY_URANIUM_ORE, NETHER_COAL_ORE, NETHER_COPPER_ORE, NETHER_DIAMOND_ORE, NETHER_EMERALD_ORE,
                     NETHER_IRON_ORE, NETHER_LAPIS_ORE, NETHER_REDSTONE_ORE, NETHER_BAUXITE_ORE, NETHER_LEAD_ORE, NETHER_NICKEL_ORE, NETHER_SILVER_ORE,
                     NETHER_TIN_ORE, NETHER_URANIUM_ORE
                );
    }

    @Nonnull
    @Override
    public String getName() {
        return "Janoeo Block Tags";
    }
}