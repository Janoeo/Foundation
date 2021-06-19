package fr.alasdiablo.janoeo.foundation.data;

import static fr.alasdiablo.janoeo.foundation.init.FoundationBlocks.*;
import static fr.alasdiablo.janoeo.foundation.init.FoundationTags.Blocks.*;

import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
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
    protected void registerTags() {
        this.getOrCreateBuilder(Tags.Blocks.ORES).addTags(
                ORES_ALUMINIUM,
                ORES_ALUMINUM,
                ORES_LEAD,
                ORES_NICKEL,
                ORES_SILVER,
                ORES_TIN,
                ORES_URANIUM,
                ORES_TINY
        );
        this.getOrCreateBuilder(ORES_ALUMINIUM).addItemEntry(BAUXITE_ORE);
        this.getOrCreateBuilder(ORES_ALUMINUM).addTags(ORES_ALUMINIUM); // Reference to DUSTS_ALUMINIUM
        this.getOrCreateBuilder(ORES_LEAD).addItemEntry(LEAD_ORE);
        this.getOrCreateBuilder(ORES_NICKEL).addItemEntry(NICKEL_ORE);
        this.getOrCreateBuilder(ORES_SILVER).addItemEntry(SILVER_ORE);
        this.getOrCreateBuilder(ORES_TIN).addItemEntry(TIN_ORE);
        this.getOrCreateBuilder(ORES_URANIUM).addItemEntry(URANIUM_ORE);

        this.getOrCreateBuilder(ORES_TINY).addTags(
                ORES_TINY_COAL,
                ORES_TINY_COPPER,
                ORES_TINY_DIAMOND,
                ORES_TINY_EMERALD,
                ORES_TINY_GOLD,
                ORES_TINY_IRON,
                ORES_TINY_LAPIS,
                ORES_TINY_REDSTONE
        );
        this.getOrCreateBuilder(ORES_TINY_COAL).addItemEntry(TINY_COAL_ORE);
        this.getOrCreateBuilder(ORES_TINY_COPPER).addItemEntry(TINY_COPPER_ORE);
        this.getOrCreateBuilder(ORES_TINY_DIAMOND).addItemEntry(TINY_DIAMOND_ORE);
        this.getOrCreateBuilder(ORES_TINY_EMERALD).addItemEntry(TINY_EMERALD_ORE);
        this.getOrCreateBuilder(ORES_TINY_GOLD).addItemEntry(TINY_GOLD_ORE);
        this.getOrCreateBuilder(ORES_TINY_IRON).addItemEntry(TINY_IRON_ORE);
        this.getOrCreateBuilder(ORES_TINY_LAPIS).addItemEntry(TINY_LAPIS_ORE);
        this.getOrCreateBuilder(ORES_TINY_REDSTONE).addItemEntry(TINY_REDSTONE_ORE);
    }

    @Nonnull
    @Override
    public String getName() {
        return "Janoeo Block Tags";
    }
}
