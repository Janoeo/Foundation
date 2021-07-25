package fr.alasdiablo.janoeo.foundation.data;

import static fr.alasdiablo.janoeo.foundation.init.FoundationBlocks.*;
import static fr.alasdiablo.janoeo.foundation.init.FoundationTags.Blocks.*;

import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@SuppressWarnings("unchecked")
public class FoundationBlockTagsProvider extends BlockTagsProvider {
    public FoundationBlockTagsProvider(DataGenerator generatorIn, @Nullable ExistingFileHelper existingFileHelper) {
        super(generatorIn, Registries.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.tag(Tags.Blocks.ORES).addTags(
                ORES_ALUMINIUM,
                ORES_ALUMINUM,
                ORES_LEAD,
                ORES_NICKEL,
                ORES_SILVER,
                ORES_TIN,
                ORES_URANIUM,
                ORES_TINY
        );
        this.tag(ORES_ALUMINIUM).add(BAUXITE_ORE);
        this.tag(ORES_ALUMINUM).addTags(ORES_ALUMINIUM); // Reference to DUSTS_ALUMINIUM
        this.tag(ORES_LEAD).add(LEAD_ORE);
        this.tag(ORES_NICKEL).add(NICKEL_ORE);
        this.tag(ORES_SILVER).add(SILVER_ORE);
        this.tag(ORES_TIN).add(TIN_ORE);
        this.tag(ORES_URANIUM).add(URANIUM_ORE);

        this.tag(ORES_TINY).addTags(
                ORES_TINY_COAL,
                ORES_TINY_COPPER,
                ORES_TINY_DIAMOND,
                ORES_TINY_EMERALD,
                ORES_TINY_GOLD,
                ORES_TINY_IRON,
                ORES_TINY_LAPIS,
                ORES_TINY_REDSTONE
        );
        this.tag(ORES_TINY_COAL).add(TINY_COAL_ORE, DEEPSLATE_TINY_COAL_ORE);
        this.tag(ORES_TINY_COPPER).add(TINY_COPPER_ORE, DEEPSLATE_TINY_COPPER_ORE);
        this.tag(ORES_TINY_DIAMOND).add(TINY_DIAMOND_ORE, DEEPSLATE_TINY_DIAMOND_ORE);
        this.tag(ORES_TINY_EMERALD).add(TINY_EMERALD_ORE, DEEPSLATE_TINY_EMERALD_ORE);
        this.tag(ORES_TINY_GOLD).add(TINY_GOLD_ORE, DEEPSLATE_TINY_GOLD_ORE);
        this.tag(ORES_TINY_IRON).add(TINY_IRON_ORE, DEEPSLATE_TINY_IRON_ORE);
        this.tag(ORES_TINY_LAPIS).add(TINY_LAPIS_ORE, DEEPSLATE_TINY_LAPIS_ORE);
        this.tag(ORES_TINY_REDSTONE).add(TINY_REDSTONE_ORE, DEEPSLATE_TINY_REDSTONE_ORE);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                BAUXITE_ORE, LEAD_ORE, NICKEL_ORE, SILVER_ORE,
                TIN_ORE, URANIUM_ORE, TINY_COAL_ORE, TINY_COPPER_ORE,
                TINY_DIAMOND_ORE, TINY_EMERALD_ORE, TINY_GOLD_ORE,
                TINY_IRON_ORE, TINY_LAPIS_ORE, TINY_REDSTONE_ORE,
                DEEPSLATE_TINY_COAL_ORE, DEEPSLATE_TINY_COPPER_ORE,
                DEEPSLATE_TINY_DIAMOND_ORE, DEEPSLATE_TINY_EMERALD_ORE,
                DEEPSLATE_TINY_GOLD_ORE, DEEPSLATE_TINY_IRON_ORE,
                DEEPSLATE_TINY_LAPIS_ORE, DEEPSLATE_TINY_REDSTONE_ORE
        );
    }

    @Nonnull
    @Override
    public String getName() {
        return "Janoeo Block Tags";
    }
}
