package fr.alasdiablo.janoeo.foundation.data.tag;

import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;

import java.util.concurrent.CompletableFuture;

import static fr.alasdiablo.janoeo.foundation.init.FoundationBlocks.*;
import static fr.alasdiablo.janoeo.foundation.init.FoundationTags.Blocks.*;

@SuppressWarnings("unchecked")
public class FoundationBlockTagsProvider extends BlockTagsProvider {
    public FoundationBlockTagsProvider(
            PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
            @Nullable ExistingFileHelper existingFileHelper
    ) {
        super(output, lookupProvider, Foundation.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider pProvider) {
        this.tag(Tags.Blocks.ORES).addTags(
                ORES_ALUMINIUM, ORES_ALUMINUM, ORES_LEAD, ORES_NICKEL, ORES_SILVER, ORES_TIN, ORES_URANIUM, ORES_TINY, ORES_TINY_COAL, ORES_TINY_COPPER,
                ORES_TINY_DIAMOND, ORES_TINY_EMERALD, ORES_TINY_GOLD, ORES_TINY_IRON, ORES_TINY_LAPIS, ORES_TINY_REDSTONE, ORES_TINY_ALUMINIUM,
                ORES_TINY_ALUMINUM, ORES_TINY_LEAD, ORES_TINY_NICKEL, ORES_TINY_SILVER, ORES_TINY_TIN, ORES_TINY_URANIUM
        );

        this.tag(ORES_ALUMINUM).addTags(ORES_ALUMINIUM); // Reference to ORES_ALUMINIUM
        this.tag(ORES_ALUMINIUM)
                .add(STONE_ORES.get(Resource.Aluminium).get(), DEEPSLATE_ORES.get(Resource.Aluminium).get(), NETHER_ORES.get(Resource.Aluminium).get());
        this.tag(ORES_LEAD).add(STONE_ORES.get(Resource.Lead).get(), DEEPSLATE_ORES.get(Resource.Lead).get(), NETHER_ORES.get(Resource.Lead).get());
        this.tag(ORES_NICKEL).add(STONE_ORES.get(Resource.Nickel).get(), DEEPSLATE_ORES.get(Resource.Nickel).get(), NETHER_ORES.get(Resource.Nickel).get());
        this.tag(ORES_SILVER).add(STONE_ORES.get(Resource.Silver).get(), DEEPSLATE_ORES.get(Resource.Silver).get(), NETHER_ORES.get(Resource.Silver).get());
        this.tag(ORES_TIN).add(STONE_ORES.get(Resource.Tin).get(), DEEPSLATE_ORES.get(Resource.Tin).get(), NETHER_ORES.get(Resource.Tin).get());
        this.tag(ORES_URANIUM).add(STONE_ORES.get(Resource.Uranium).get(), DEEPSLATE_ORES.get(Resource.Uranium).get(), NETHER_ORES.get(Resource.Uranium).get());

        this.tag(Tags.Blocks.ORES_REDSTONE).add(NETHER_ORES.get(Resource.RedStone).get());
        this.tag(Tags.Blocks.ORES_LAPIS).add(NETHER_ORES.get(Resource.Lapis).get());
        this.tag(Tags.Blocks.ORES_IRON).add(NETHER_ORES.get(Resource.Iron).get());
        this.tag(Tags.Blocks.ORES_EMERALD).add(NETHER_ORES.get(Resource.Emerald).get());
        this.tag(Tags.Blocks.ORES_DIAMOND).add(NETHER_ORES.get(Resource.Diamond).get());
        this.tag(Tags.Blocks.ORES_COPPER).add(NETHER_ORES.get(Resource.Copper).get());
        this.tag(Tags.Blocks.ORES_COAL).add(NETHER_ORES.get(Resource.Copper).get());

        this.tag(ORES_TINY).addTags(
                ORES_TINY_COAL, ORES_TINY_COPPER, ORES_TINY_DIAMOND, ORES_TINY_EMERALD, ORES_TINY_GOLD, ORES_TINY_IRON, ORES_TINY_LAPIS, ORES_TINY_REDSTONE,
                ORES_TINY_ALUMINIUM, ORES_TINY_ALUMINUM, ORES_TINY_LEAD, ORES_TINY_NICKEL, ORES_TINY_SILVER, ORES_TINY_TIN, ORES_TINY_URANIUM
        );

        this.tag(ORES_TINY_COAL).add(TINY_STONE_ORES.get(Resource.Coal).get(), TINY_DEEPSLATE_ORES.get(Resource.Coal).get());
        this.tag(ORES_TINY_COPPER).add(TINY_STONE_ORES.get(Resource.Copper).get(), TINY_DEEPSLATE_ORES.get(Resource.Copper).get());
        this.tag(ORES_TINY_DIAMOND).add(TINY_STONE_ORES.get(Resource.Diamond).get(), TINY_DEEPSLATE_ORES.get(Resource.Diamond).get());
        this.tag(ORES_TINY_EMERALD).add(TINY_STONE_ORES.get(Resource.Emerald).get(), TINY_DEEPSLATE_ORES.get(Resource.Emerald).get());
        this.tag(ORES_TINY_GOLD).add(TINY_STONE_ORES.get(Resource.Gold).get(), TINY_DEEPSLATE_ORES.get(Resource.Gold).get());
        this.tag(ORES_TINY_IRON).add(TINY_STONE_ORES.get(Resource.Iron).get(), TINY_DEEPSLATE_ORES.get(Resource.Iron).get());
        this.tag(ORES_TINY_LAPIS).add(TINY_STONE_ORES.get(Resource.Lapis).get(), TINY_DEEPSLATE_ORES.get(Resource.Lapis).get());
        this.tag(ORES_TINY_REDSTONE).add(TINY_STONE_ORES.get(Resource.RedStone).get(), TINY_DEEPSLATE_ORES.get(Resource.RedStone).get());

        this.tag(ORES_TINY_ALUMINUM).addTags(ORES_TINY_ALUMINIUM); // Reference to ORES_TINY_ALUMINIUM
        this.tag(ORES_TINY_ALUMINIUM).add(TINY_STONE_ORES.get(Resource.Aluminium).get(), TINY_DEEPSLATE_ORES.get(Resource.Aluminium).get());
        this.tag(ORES_TINY_LEAD).add(TINY_STONE_ORES.get(Resource.Lead).get(), TINY_DEEPSLATE_ORES.get(Resource.Lead).get());
        this.tag(ORES_TINY_NICKEL).add(TINY_STONE_ORES.get(Resource.Nickel).get(), TINY_DEEPSLATE_ORES.get(Resource.Nickel).get());
        this.tag(ORES_TINY_SILVER).add(TINY_STONE_ORES.get(Resource.Silver).get(), TINY_DEEPSLATE_ORES.get(Resource.Silver).get());
        this.tag(ORES_TINY_TIN).add(TINY_STONE_ORES.get(Resource.Tin).get(), TINY_DEEPSLATE_ORES.get(Resource.Tin).get());
        this.tag(ORES_TINY_URANIUM).add(TINY_STONE_ORES.get(Resource.Uranium).get(), TINY_DEEPSLATE_ORES.get(Resource.Uranium).get());

        this.tag(Tags.Blocks.STORAGE_BLOCKS).addTags(
                STORAGE_BLOCKS_ALUMINIUM, STORAGE_BLOCKS_ALUMINUM, STORAGE_BLOCKS_LEAD, STORAGE_BLOCKS_NICKEL, STORAGE_BLOCKS_SILVER, STORAGE_BLOCKS_TIN,
                STORAGE_BLOCKS_URANIUM, STORAGE_BLOCKS_RAW_ALUMINIUM, STORAGE_BLOCKS_RAW_ALUMINUM, STORAGE_BLOCKS_RAW_LEAD, STORAGE_BLOCKS_RAW_NICKEL,
                STORAGE_BLOCKS_RAW_SILVER, STORAGE_BLOCKS_RAW_TIN, STORAGE_BLOCKS_RAW_URANIUM
        );

        this.tag(STORAGE_BLOCKS_ALUMINUM).addTags(STORAGE_BLOCKS_ALUMINIUM); // Reference to STORAGE_BLOCKS_ALUMINIUM
        this.tag(STORAGE_BLOCKS_ALUMINIUM).add(STORAGE_BLOCKS.get(Resource.Aluminium).get());
        this.tag(STORAGE_BLOCKS_LEAD).add(STORAGE_BLOCKS.get(Resource.Lead).get());
        this.tag(STORAGE_BLOCKS_NICKEL).add(STORAGE_BLOCKS.get(Resource.Nickel).get());
        this.tag(STORAGE_BLOCKS_SILVER).add(STORAGE_BLOCKS.get(Resource.Silver).get());
        this.tag(STORAGE_BLOCKS_TIN).add(STORAGE_BLOCKS.get(Resource.Tin).get());
        this.tag(STORAGE_BLOCKS_URANIUM).add(STORAGE_BLOCKS.get(Resource.Uranium).get());

        this.tag(STORAGE_BLOCKS_RAW_ALUMINUM).addTags(STORAGE_BLOCKS_RAW_ALUMINIUM); // Reference to STORAGE_BLOCKS_ALUMINIUM
        this.tag(STORAGE_BLOCKS_RAW_ALUMINIUM).add(RAW_BLOCKS.get(Resource.Aluminium).get());
        this.tag(STORAGE_BLOCKS_RAW_LEAD).add(RAW_BLOCKS.get(Resource.Lead).get());
        this.tag(STORAGE_BLOCKS_RAW_NICKEL).add(RAW_BLOCKS.get(Resource.Nickel).get());
        this.tag(STORAGE_BLOCKS_RAW_SILVER).add(RAW_BLOCKS.get(Resource.Silver).get());
        this.tag(STORAGE_BLOCKS_RAW_TIN).add(RAW_BLOCKS.get(Resource.Tin).get());
        this.tag(STORAGE_BLOCKS_RAW_URANIUM).add(RAW_BLOCKS.get(Resource.Uranium).get());

        var mineableWithPickaxe = this.tag(BlockTags.MINEABLE_WITH_PICKAXE);
        var mineableWithShovel  = this.tag(BlockTags.MINEABLE_WITH_SHOVEL);
        var needsStoneTool      = this.tag(BlockTags.NEEDS_STONE_TOOL);
        var needsIronTool       = this.tag(BlockTags.NEEDS_IRON_TOOL);
        var needsDiamondTool    = this.tag(BlockTags.NEEDS_DIAMOND_TOOL);

        STONE_ORES.forEach((resource, block) -> mineableWithPickaxe.add(block.get()));
        DEEPSLATE_ORES.forEach((resource, block) -> mineableWithPickaxe.add(block.get()));
        TINY_STONE_ORES.forEach((resource, block) -> mineableWithPickaxe.add(block.get()));
        TINY_DEEPSLATE_ORES.forEach((resource, block) -> mineableWithPickaxe.add(block.get()));
        GRAVEL_ORES.forEach((resource, block) -> mineableWithShovel.add(block.get()));
        NETHER_ORES.forEach((resource, block) -> {
            mineableWithPickaxe.add(block.get());
            needsIronTool.add(block.get());
        });
        END_ORES.forEach((resource, block) -> {
            mineableWithPickaxe.add(block.get());
            needsDiamondTool.add(block.get());
        });

        STORAGE_BLOCKS.forEach((resource, block) -> mineableWithPickaxe.add(block.get()));

        RAW_BLOCKS.forEach((resource, block) -> mineableWithPickaxe.add(block.get()));

        needsStoneTool.add(
                STONE_ORES.get(Resource.Aluminium).get(),
                STONE_ORES.get(Resource.Lead).get(),
                STONE_ORES.get(Resource.Tin).get(),
                DEEPSLATE_ORES.get(Resource.Aluminium).get(),
                DEEPSLATE_ORES.get(Resource.Lead).get(),
                DEEPSLATE_ORES.get(Resource.Tin).get(),

                TINY_STONE_ORES.get(Resource.Aluminium).get(),
                TINY_STONE_ORES.get(Resource.Lead).get(),
                TINY_STONE_ORES.get(Resource.Tin).get(),
                TINY_DEEPSLATE_ORES.get(Resource.Aluminium).get(),
                TINY_DEEPSLATE_ORES.get(Resource.Lead).get(),
                TINY_DEEPSLATE_ORES.get(Resource.Tin).get(),

                TINY_STONE_ORES.get(Resource.Copper).get(),
                TINY_STONE_ORES.get(Resource.Iron).get(),
                TINY_STONE_ORES.get(Resource.Lapis).get(),
                TINY_DEEPSLATE_ORES.get(Resource.Copper).get(),
                TINY_DEEPSLATE_ORES.get(Resource.Iron).get(),
                TINY_DEEPSLATE_ORES.get(Resource.Lapis).get()
        );

        needsIronTool.add(
                STONE_ORES.get(Resource.Nickel).get(),
                STONE_ORES.get(Resource.Silver).get(),
                STONE_ORES.get(Resource.Uranium).get(),
                DEEPSLATE_ORES.get(Resource.Nickel).get(),
                DEEPSLATE_ORES.get(Resource.Silver).get(),
                DEEPSLATE_ORES.get(Resource.Uranium).get(),

                TINY_STONE_ORES.get(Resource.Nickel).get(),
                TINY_STONE_ORES.get(Resource.Silver).get(),
                TINY_STONE_ORES.get(Resource.Uranium).get(),
                TINY_DEEPSLATE_ORES.get(Resource.Nickel).get(),
                TINY_DEEPSLATE_ORES.get(Resource.Silver).get(),
                TINY_DEEPSLATE_ORES.get(Resource.Uranium).get(),

                TINY_STONE_ORES.get(Resource.Diamond).get(),
                TINY_STONE_ORES.get(Resource.Emerald).get(),
                TINY_STONE_ORES.get(Resource.Gold).get(),
                TINY_STONE_ORES.get(Resource.RedStone).get(),
                TINY_DEEPSLATE_ORES.get(Resource.Diamond).get(),
                TINY_DEEPSLATE_ORES.get(Resource.Emerald).get(),
                TINY_DEEPSLATE_ORES.get(Resource.Gold).get(),
                TINY_DEEPSLATE_ORES.get(Resource.RedStone).get()
        );
    }

    @Nonnull
    @Override
    public String getName() {
        return "Janoeo Block Tags";
    }
}
