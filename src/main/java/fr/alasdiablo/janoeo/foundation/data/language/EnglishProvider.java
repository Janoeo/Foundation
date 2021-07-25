package fr.alasdiablo.janoeo.foundation.data.language;

import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraftforge.common.data.LanguageProvider;

import static fr.alasdiablo.janoeo.foundation.init.FoundationBlocks.*;
import static fr.alasdiablo.janoeo.foundation.init.FoundationItems.*;

public class EnglishProvider extends LanguageProvider {

    public EnglishProvider(DataGenerator gen) {
        super(gen, Registries.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add(ALUMINIUM_DUST, "Aluminium dust");
        this.add(AMETHYST_DUST, "Amethyst dust");
        this.add(COAL_DUST, "Coal dust");
        this.add(COPPER_DUST, "Copper dust");
        this.add(DIAMOND_DUST, "Diamond dust");
        this.add(EMERALD_DUST, "Emerald dust");
        this.add(GOLD_DUST, "Gold dust");
        this.add(IRON_DUST, "Iron dust");
        this.add(LAPIS_DUST, "Lapis dust");
        this.add(LEAD_DUST, "Lead dust");
        this.add(NICKEL_DUST, "Nickel dust");
        this.add(SILVER_DUST, "Silver dust");
        this.add(TIN_DUST, "Tin dust");
        this.add(URANIUM_DUST, "Uranium dust");

        this.add(ALUMINIUM_NUGGET, "Aluminium nugget");
        this.add(COAL_NUGGET, "Coal chunk");
        this.add(COPPER_NUGGET, "Copper nugget");
        this.add(DIAMOND_NUGGET, "Diamond shard");
        this.add(EMERALD_NUGGET, "Emerald shard");
        this.add(LAPIS_NUGGET, "Lapis fragment");
        this.add(LEAD_NUGGET, "Lead nugget");
        this.add(NICKEL_NUGGET, "Nickel nugget");
        this.add(REDSTONE_NUGGET, "Tiny pile of Redstone");
        this.add(SILVER_NUGGET, "Silver nugget");
        this.add(TIN_NUGGET, "Tin nugget");
        this.add(URANIUM_NUGGET, "Uranium nugget");

        this.add(ALUMINIUM_INGOT, "Aluminium ingot");
        this.add(LEAD_INGOT, "Lead ingot");
        this.add(NICKEL_INGOT, "Nickel ingot");
        this.add(SILVER_INGOT, "Silver ingot");
        this.add(TIN_INGOT, "Tin ingot");
        this.add(URANIUM_INGOT, "Uranium ingot");

        this.add(RAW_ALUMINIUM, "Raw aluminium");
        this.add(RAW_LEAD, "Raw lead");
        this.add(RAW_NICKEL, "Raw nickel");
        this.add(RAW_SILVER, "Raw silver");
        this.add(RAW_TIN, "Raw Tin");
        this.add(RAW_URANIUM, "Raw uranium");

        this.add(BAUXITE_ORE, "Bauxite ore");
        this.add(LEAD_ORE, "Lead ore");
        this.add(NICKEL_ORE, "Nickel ore");
        this.add(SILVER_ORE, "Silver ore");
        this.add(TIN_ORE, "Tin ore");
        this.add(URANIUM_ORE, "Uranium ore");

        this.add(TINY_COAL_ORE, "Tiny coal ore");
        this.add(TINY_COPPER_ORE, "Tiny copper ore");
        this.add(TINY_DIAMOND_ORE, "Tiny diamond ore");
        this.add(TINY_EMERALD_ORE, "Tiny emerald ore");
        this.add(TINY_GOLD_ORE, "Tiny gold ore");
        this.add(TINY_IRON_ORE, "Tiny iron ore");
        this.add(TINY_LAPIS_ORE, "Tiny lapis ore");
        this.add(TINY_REDSTONE_ORE, "Tiny redstone ore");

        this.add(DEEPSLATE_TINY_COAL_ORE, "Deepslate tiny coal ore");
        this.add(DEEPSLATE_TINY_COPPER_ORE, "Deepslate tiny copper ore");
        this.add(DEEPSLATE_TINY_DIAMOND_ORE, "Deepslate tiny diamond ore");
        this.add(DEEPSLATE_TINY_EMERALD_ORE, "Deepslate tiny emerald ore");
        this.add(DEEPSLATE_TINY_GOLD_ORE, "Deepslate tiny gold ore");
        this.add(DEEPSLATE_TINY_IRON_ORE, "Deepslate tiny iron ore");
        this.add(DEEPSLATE_TINY_LAPIS_ORE, "Deepslate tiny lapis ore");
        this.add(DEEPSLATE_TINY_REDSTONE_ORE, "Deepslate tiny redstone ore");


        this.add(((TranslatableComponent) Foundation.ITEMS_GROUP.getDisplayName()).getKey(), "Janoeo Foundation - Items");
        this.add(((TranslatableComponent) Foundation.BLOCKS_GROUP.getDisplayName()).getKey(), "Janoeo Foundation - Blocks");
    }
}
