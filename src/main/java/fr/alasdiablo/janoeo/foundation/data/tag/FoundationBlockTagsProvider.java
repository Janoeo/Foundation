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
        this.tag(Tags.Blocks.ORES).addTags(
                ORES_ALUMINIUM, ORES_ALUMINUM, ORES_LEAD, ORES_NICKEL, ORES_SILVER, ORES_TIN, ORES_URANIUM, ORES_TINY, ORES_TINY_COAL, ORES_TINY_COPPER,
                ORES_TINY_DIAMOND, ORES_TINY_EMERALD, ORES_TINY_GOLD, ORES_TINY_IRON, ORES_TINY_LAPIS, ORES_TINY_REDSTONE, ORES_TINY_ALUMINIUM,
                ORES_TINY_ALUMINUM, ORES_TINY_LEAD, ORES_TINY_NICKEL, ORES_TINY_SILVER, ORES_TINY_TIN, ORES_TINY_URANIUM
        );

        this.tag(ORES_ALUMINUM).addTags(ORES_ALUMINIUM); // Reference to ORES_ALUMINIUM
        this.tag(ORES_ALUMINIUM).add(BAUXITE_ORE.get(), DEEPSLATE_BAUXITE_ORE.get(), NETHER_BAUXITE_ORE.get());
        this.tag(ORES_LEAD).add(LEAD_ORE.get(), DEEPSLATE_LEAD_ORE.get(), NETHER_LEAD_ORE.get());
        this.tag(ORES_NICKEL).add(NICKEL_ORE.get(), DEEPSLATE_NICKEL_ORE.get(), NICKEL_ORE.get());
        this.tag(ORES_SILVER).add(SILVER_ORE.get(), DEEPSLATE_SILVER_ORE.get(), NETHER_SILVER_ORE.get());
        this.tag(ORES_TIN).add(TIN_ORE.get(), DEEPSLATE_TIN_ORE.get(), NETHER_TIN_ORE.get());
        this.tag(ORES_URANIUM).add(URANIUM_ORE.get(), DEEPSLATE_URANIUM_ORE.get(), NETHER_URANIUM_ORE.get());

        this.tag(Tags.Blocks.ORES_REDSTONE).add(NETHER_REDSTONE_ORE.get());
        this.tag(Tags.Blocks.ORES_LAPIS).add(NETHER_LAPIS_ORE.get());
        this.tag(Tags.Blocks.ORES_IRON).add(NETHER_IRON_ORE.get());
        this.tag(Tags.Blocks.ORES_EMERALD).add(NETHER_EMERALD_ORE.get());
        this.tag(Tags.Blocks.ORES_DIAMOND).add(NETHER_DIAMOND_ORE.get());
        this.tag(Tags.Blocks.ORES_COPPER).add(NETHER_COPPER_ORE.get());
        this.tag(Tags.Blocks.ORES_COAL).add(NETHER_COAL_ORE.get());

        this.tag(ORES_TINY).addTags(
                ORES_TINY_COAL, ORES_TINY_COPPER, ORES_TINY_DIAMOND, ORES_TINY_EMERALD, ORES_TINY_GOLD, ORES_TINY_IRON, ORES_TINY_LAPIS, ORES_TINY_REDSTONE,
                ORES_TINY_ALUMINIUM, ORES_TINY_ALUMINUM, ORES_TINY_LEAD, ORES_TINY_NICKEL, ORES_TINY_SILVER, ORES_TINY_TIN, ORES_TINY_URANIUM
        );

        this.tag(ORES_TINY_COAL).add(TINY_COAL_ORE.get(), DEEPSLATE_TINY_COAL_ORE.get());
        this.tag(ORES_TINY_COPPER).add(TINY_COPPER_ORE.get(), DEEPSLATE_TINY_COPPER_ORE.get());
        this.tag(ORES_TINY_DIAMOND).add(TINY_DIAMOND_ORE.get(), DEEPSLATE_TINY_DIAMOND_ORE.get());
        this.tag(ORES_TINY_EMERALD).add(TINY_EMERALD_ORE.get(), DEEPSLATE_TINY_EMERALD_ORE.get());
        this.tag(ORES_TINY_GOLD).add(TINY_GOLD_ORE.get(), DEEPSLATE_TINY_GOLD_ORE.get());
        this.tag(ORES_TINY_IRON).add(TINY_IRON_ORE.get(), DEEPSLATE_TINY_IRON_ORE.get());
        this.tag(ORES_TINY_LAPIS).add(TINY_LAPIS_ORE.get(), DEEPSLATE_TINY_LAPIS_ORE.get());
        this.tag(ORES_TINY_REDSTONE).add(TINY_REDSTONE_ORE.get(), DEEPSLATE_TINY_REDSTONE_ORE.get());

        this.tag(ORES_TINY_ALUMINUM).addTags(ORES_TINY_ALUMINIUM); // Reference to ORES_TINY_ALUMINIUM
        this.tag(ORES_TINY_ALUMINIUM).add(TINY_BAUXITE_ORE.get(), DEEPSLATE_TINY_BAUXITE_ORE.get());
        this.tag(ORES_TINY_LEAD).add(TINY_LEAD_ORE.get(), DEEPSLATE_TINY_LEAD_ORE.get());
        this.tag(ORES_TINY_NICKEL).add(TINY_NICKEL_ORE.get(), DEEPSLATE_TINY_NICKEL_ORE.get());
        this.tag(ORES_TINY_SILVER).add(TINY_SILVER_ORE.get(), DEEPSLATE_TINY_SILVER_ORE.get());
        this.tag(ORES_TINY_TIN).add(TINY_TIN_ORE.get(), DEEPSLATE_TINY_TIN_ORE.get());
        this.tag(ORES_TINY_URANIUM).add(TINY_URANIUM_ORE.get(), DEEPSLATE_TINY_URANIUM_ORE.get());

        this.tag(Tags.Blocks.STORAGE_BLOCKS).addTags(
                STORAGE_BLOCKS_ALUMINIUM, STORAGE_BLOCKS_ALUMINUM, STORAGE_BLOCKS_LEAD, STORAGE_BLOCKS_NICKEL, STORAGE_BLOCKS_SILVER, STORAGE_BLOCKS_TIN,
                STORAGE_BLOCKS_URANIUM, STORAGE_BLOCKS_RAW_ALUMINIUM, STORAGE_BLOCKS_RAW_ALUMINUM, STORAGE_BLOCKS_RAW_LEAD, STORAGE_BLOCKS_RAW_NICKEL,
                STORAGE_BLOCKS_RAW_SILVER, STORAGE_BLOCKS_RAW_TIN, STORAGE_BLOCKS_RAW_URANIUM
        );

        this.tag(STORAGE_BLOCKS_ALUMINUM).addTags(STORAGE_BLOCKS_ALUMINIUM); // Reference to STORAGE_BLOCKS_ALUMINIUM
        this.tag(STORAGE_BLOCKS_ALUMINIUM).add(ALUMINIUM_BLOCK.get());
        this.tag(STORAGE_BLOCKS_LEAD).add(LEAD_BLOCK.get());
        this.tag(STORAGE_BLOCKS_NICKEL).add(NICKEL_BLOCK.get());
        this.tag(STORAGE_BLOCKS_SILVER).add(SILVER_BLOCK.get());
        this.tag(STORAGE_BLOCKS_TIN).add(TIN_BLOCK.get());
        this.tag(STORAGE_BLOCKS_URANIUM).add(URANIUM_BLOCK.get());

        this.tag(STORAGE_BLOCKS_RAW_ALUMINUM).addTags(STORAGE_BLOCKS_RAW_ALUMINIUM); // Reference to STORAGE_BLOCKS_ALUMINIUM
        this.tag(STORAGE_BLOCKS_RAW_ALUMINIUM).add(RAW_ALUMINIUM_BLOCK.get());
        this.tag(STORAGE_BLOCKS_RAW_LEAD).add(RAW_LEAD_BLOCK.get());
        this.tag(STORAGE_BLOCKS_RAW_NICKEL).add(RAW_NICKEL_BLOCK.get());
        this.tag(STORAGE_BLOCKS_RAW_SILVER).add(RAW_SILVER_BLOCK.get());
        this.tag(STORAGE_BLOCKS_RAW_TIN).add(RAW_TIN_BLOCK.get());
        this.tag(STORAGE_BLOCKS_RAW_URANIUM).add(RAW_URANIUM_BLOCK.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BAUXITE_ORE.get(), LEAD_ORE.get(), NICKEL_ORE.get(), SILVER_ORE.get(), TIN_ORE.get(), URANIUM_ORE.get(), DEEPSLATE_BAUXITE_ORE.get(), DEEPSLATE_LEAD_ORE.get(), DEEPSLATE_NICKEL_ORE.get(),
                        DEEPSLATE_SILVER_ORE.get(), DEEPSLATE_TIN_ORE.get(), DEEPSLATE_URANIUM_ORE.get(), TINY_COAL_ORE.get(), TINY_COPPER_ORE.get(), TINY_DIAMOND_ORE.get(), TINY_EMERALD_ORE.get(),
                        TINY_GOLD_ORE.get(), TINY_IRON_ORE.get(), TINY_LAPIS_ORE.get(), TINY_REDSTONE_ORE.get(), DEEPSLATE_TINY_COAL_ORE.get(), DEEPSLATE_TINY_COPPER_ORE.get(),
                        DEEPSLATE_TINY_DIAMOND_ORE.get(), DEEPSLATE_TINY_EMERALD_ORE.get(), DEEPSLATE_TINY_GOLD_ORE.get(), DEEPSLATE_TINY_IRON_ORE.get(), DEEPSLATE_TINY_LAPIS_ORE.get(),
                        DEEPSLATE_TINY_REDSTONE_ORE.get(), TINY_BAUXITE_ORE.get(), TINY_LEAD_ORE.get(), TINY_NICKEL_ORE.get(), TINY_SILVER_ORE.get(), TINY_TIN_ORE.get(), TINY_URANIUM_ORE.get(),
                        DEEPSLATE_TINY_BAUXITE_ORE.get(), DEEPSLATE_TINY_LEAD_ORE.get(), DEEPSLATE_TINY_NICKEL_ORE.get(), DEEPSLATE_TINY_SILVER_ORE.get(), DEEPSLATE_TINY_TIN_ORE.get(),
                        DEEPSLATE_TINY_URANIUM_ORE.get(), NETHER_COAL_ORE.get(), NETHER_COPPER_ORE.get(), NETHER_DIAMOND_ORE.get(), NETHER_EMERALD_ORE.get(), NETHER_IRON_ORE.get(), NETHER_LAPIS_ORE.get(),
                        NETHER_REDSTONE_ORE.get(), NETHER_BAUXITE_ORE.get(), NETHER_LEAD_ORE.get(), NETHER_NICKEL_ORE.get(), NETHER_SILVER_ORE.get(), NETHER_TIN_ORE.get(), NETHER_URANIUM_ORE.get(),
                        ALUMINIUM_BLOCK.get(), LEAD_BLOCK.get(), NICKEL_BLOCK.get(), SILVER_BLOCK.get(), TIN_BLOCK.get(), URANIUM_BLOCK.get(), RAW_ALUMINIUM_BLOCK.get(), RAW_LEAD_BLOCK.get(), RAW_NICKEL_BLOCK.get(),
                        RAW_SILVER_BLOCK.get(), RAW_TIN_BLOCK.get(), RAW_URANIUM_BLOCK.get()
                );

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(BAUXITE_ORE.get(), LEAD_ORE.get(), TIN_ORE.get(), DEEPSLATE_BAUXITE_ORE.get(), DEEPSLATE_LEAD_ORE.get(), DEEPSLATE_TIN_ORE.get(), TINY_COPPER_ORE.get(), TINY_IRON_ORE.get(),
                        DEEPSLATE_TINY_COPPER_ORE.get(), DEEPSLATE_TINY_IRON_ORE.get(), TINY_BAUXITE_ORE.get(), TINY_LEAD_ORE.get(), TINY_TIN_ORE.get(), DEEPSLATE_TINY_BAUXITE_ORE.get(),
                        DEEPSLATE_TINY_LEAD_ORE.get(), DEEPSLATE_TINY_TIN_ORE.get(), TINY_LAPIS_ORE.get(), DEEPSLATE_TINY_LAPIS_ORE.get(), ALUMINIUM_BLOCK.get(), LEAD_BLOCK.get(), NICKEL_BLOCK.get(),
                        SILVER_BLOCK.get(), TIN_BLOCK.get(), URANIUM_BLOCK.get(), RAW_ALUMINIUM_BLOCK.get(), RAW_LEAD_BLOCK.get(), RAW_NICKEL_BLOCK.get(), RAW_SILVER_BLOCK.get(), RAW_TIN_BLOCK.get(),
                        RAW_URANIUM_BLOCK.get()
                );

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(NICKEL_ORE.get(), SILVER_ORE.get(), URANIUM_ORE.get(), DEEPSLATE_NICKEL_ORE.get(), DEEPSLATE_SILVER_ORE.get(), DEEPSLATE_URANIUM_ORE.get(), TINY_DIAMOND_ORE.get(), TINY_EMERALD_ORE.get(),
                        TINY_GOLD_ORE.get(), TINY_REDSTONE_ORE.get(), DEEPSLATE_TINY_DIAMOND_ORE.get(), DEEPSLATE_TINY_EMERALD_ORE.get(), DEEPSLATE_TINY_GOLD_ORE.get(),
                        DEEPSLATE_TINY_REDSTONE_ORE.get(), TINY_NICKEL_ORE.get(), TINY_SILVER_ORE.get(), TINY_URANIUM_ORE.get(), DEEPSLATE_TINY_NICKEL_ORE.get(),
                        DEEPSLATE_TINY_SILVER_ORE.get(), DEEPSLATE_TINY_URANIUM_ORE.get(), NETHER_COAL_ORE.get(), NETHER_COPPER_ORE.get(), NETHER_DIAMOND_ORE.get(), NETHER_EMERALD_ORE.get(),
                        NETHER_IRON_ORE.get(), NETHER_LAPIS_ORE.get(), NETHER_REDSTONE_ORE.get(), NETHER_BAUXITE_ORE.get(), NETHER_LEAD_ORE.get(), NETHER_NICKEL_ORE.get(), NETHER_SILVER_ORE.get(),
                        NETHER_TIN_ORE.get(), NETHER_URANIUM_ORE.get()
                );
    }

    @Nonnull
    @Override
    public String getName() {
        return "Janoeo Block Tags";
    }
}
