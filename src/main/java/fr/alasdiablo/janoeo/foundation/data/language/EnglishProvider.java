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
        this.add(COPPER_STICK, "Copper Rod");
        this.add(DIAMOND_STICK, "Diamond Rod");
        this.add(GOLD_STICK, "Golden Rod");
        this.add(IRON_STICK, "Iron Rod");
        this.add(SILVER_STICK, "Silver Rod");
        this.add(TIN_STICK, "Tin Rod");

        this.add(COPPER_GEAR, "Copper Gear");
        this.add(DIAMOND_GEAR, "Diamond Gear");
        this.add(GOLD_GEAR, "Golden Gear");
        this.add(IRON_GEAR, "Iron Gear");
        this.add(SILVER_GEAR, "Silver Gear");
        this.add(TIN_GEAR, "Tin Gear");
        this.add(WOODEN_GEAR, "Wooden Gear");

        this.add(ALUMINIUM_DUST, "Aluminium Dust");
        this.add(AMETHYST_DUST, "Amethyst Dust");
        this.add(COAL_DUST, "Coal Dust");
        this.add(COPPER_DUST, "Copper Dust");
        this.add(DIAMOND_DUST, "Diamond Dust");
        this.add(EMERALD_DUST, "Emerald Dust");
        this.add(GOLD_DUST, "Gold Dust");
        this.add(IRON_DUST, "Iron Dust");
        this.add(LAPIS_DUST, "Lapis Lazuli Dust");
        this.add(LEAD_DUST, "Lead Dust");
        this.add(NICKEL_DUST, "Nickel Dust");
        this.add(SILVER_DUST, "Silver Dust");
        this.add(TIN_DUST, "Tin Dust");
        this.add(URANIUM_DUST, "Uranium Dust");

        this.add(ALUMINIUM_NUGGET, "Aluminium Nugget");
        this.add(COAL_NUGGET, "Coal Chunk");
        this.add(COPPER_NUGGET, "Copper Nugget");
        this.add(DIAMOND_NUGGET, "Diamond Shard");
        this.add(EMERALD_NUGGET, "Emerald Shard");
        this.add(LAPIS_NUGGET, "Lapis Lazuli Fragment");
        this.add(LEAD_NUGGET, "Lead Nugget");
        this.add(NICKEL_NUGGET, "Nickel Nugget");
        this.add(REDSTONE_NUGGET, "Tiny Pile of Redstone");
        this.add(SILVER_NUGGET, "Silver Nugget");
        this.add(TIN_NUGGET, "Tin Nugget");
        this.add(URANIUM_NUGGET, "Uranium Nugget");

        this.add(ALUMINIUM_INGOT, "Aluminium Ingot");
        this.add(LEAD_INGOT, "Lead Ingot");
        this.add(NICKEL_INGOT, "Nickel Ingot");
        this.add(SILVER_INGOT, "Silver Ingot");
        this.add(TIN_INGOT, "Tin Ingot");
        this.add(URANIUM_INGOT, "Uranium Ingot");

        this.add(RAW_ALUMINIUM, "Raw Aluminium");
        this.add(RAW_LEAD, "Raw Lead");
        this.add(RAW_NICKEL, "Raw Nickel");
        this.add(RAW_SILVER, "Raw Silver");
        this.add(RAW_TIN, "Raw Tin");
        this.add(RAW_URANIUM, "Raw Uranium");

        this.add(SCRAP, "Scrap");

        this.add(BAUXITE_ORE, "Bauxite Ore");
        this.add(LEAD_ORE, "Lead Ore");
        this.add(NICKEL_ORE, "Nickel Ore");
        this.add(SILVER_ORE, "Silver Ore");
        this.add(TIN_ORE, "Tin Ore");
        this.add(URANIUM_ORE, "Uranium Ore");

        this.add(DEEPSLATE_BAUXITE_ORE, "Deepslate Bauxite Ore");
        this.add(DEEPSLATE_LEAD_ORE, "Deepslate Lead Ore");
        this.add(DEEPSLATE_NICKEL_ORE, "Deepslate Nickel Ore");
        this.add(DEEPSLATE_SILVER_ORE, "Deepslate Silver Ore");
        this.add(DEEPSLATE_TIN_ORE, "Deepslate Tin Ore");
        this.add(DEEPSLATE_URANIUM_ORE, "Deepslate Uranium Ore");

        this.add(TINY_BAUXITE_ORE, "Tiny Bauxite Ore");
        this.add(TINY_LEAD_ORE, "Tiny Lead Ore");
        this.add(TINY_NICKEL_ORE, "Tiny Nickel Ore");
        this.add(TINY_SILVER_ORE, "Tiny Silver Ore");
        this.add(TINY_TIN_ORE, "Tiny Tin Ore");
        this.add(TINY_URANIUM_ORE, "Tiny Uranium Ore");

        this.add(DEEPSLATE_TINY_BAUXITE_ORE, "Deepslate Tiny Bauxite Ore");
        this.add(DEEPSLATE_TINY_LEAD_ORE, "Deepslate Tiny Lead Ore");
        this.add(DEEPSLATE_TINY_NICKEL_ORE, "Deepslate Tiny Nickel Ore");
        this.add(DEEPSLATE_TINY_SILVER_ORE, "Deepslate tiny Silver Ore");
        this.add(DEEPSLATE_TINY_TIN_ORE, "Deepslate Tiny Tin Ore");
        this.add(DEEPSLATE_TINY_URANIUM_ORE, "Deepslate Tiny Uranium Ore");

        this.add(TINY_COAL_ORE, "Tiny Coal Ore");
        this.add(TINY_COPPER_ORE, "Tiny Copper Ore");
        this.add(TINY_DIAMOND_ORE, "Tiny Diamond Ore");
        this.add(TINY_EMERALD_ORE, "Tiny Emerald Ore");
        this.add(TINY_GOLD_ORE, "Tiny Gold Ore");
        this.add(TINY_IRON_ORE, "Tiny Iron Ore");
        this.add(TINY_LAPIS_ORE, "Tiny Lapis Lazuli Ore");
        this.add(TINY_REDSTONE_ORE, "Tiny Redstone Ore");

        this.add(DEEPSLATE_TINY_COAL_ORE, "Deepslate Tiny Coal Ore");
        this.add(DEEPSLATE_TINY_COPPER_ORE, "Deepslate Tiny Copper Ore");
        this.add(DEEPSLATE_TINY_DIAMOND_ORE, "Deepslate Tiny Diamond Ore");
        this.add(DEEPSLATE_TINY_EMERALD_ORE, "Deepslate Tiny Emerald Ore");
        this.add(DEEPSLATE_TINY_GOLD_ORE, "Deepslate Tiny Gold Ore");
        this.add(DEEPSLATE_TINY_IRON_ORE, "Deepslate Tiny Iron Ore");
        this.add(DEEPSLATE_TINY_LAPIS_ORE, "Deepslate Tiny Lapis Lazuli Ore");
        this.add(DEEPSLATE_TINY_REDSTONE_ORE, "Deepslate Tiny Redstone Ore");

        this.add(NETHER_COAL_ORE, "Nether Coal Ore");
        this.add(NETHER_COPPER_ORE, "Nether Copper Ore");
        this.add(NETHER_DIAMOND_ORE, "Nether Diamond Ore");
        this.add(NETHER_EMERALD_ORE, "Nether Emerald Ore");
        this.add(NETHER_IRON_ORE, "Nether Iron Ore");
        this.add(NETHER_LAPIS_ORE, "Nether Lapis Lazuli Ore");
        this.add(NETHER_REDSTONE_ORE, "Nether Redstone Ore");

        this.add(NETHER_BAUXITE_ORE, "Nether Bauxite Ore");
        this.add(NETHER_LEAD_ORE, "Nether Lead Ore");
        this.add(NETHER_NICKEL_ORE, "Nether Nickel Ore");
        this.add(NETHER_SILVER_ORE, "Nether Silver Ore");
        this.add(NETHER_TIN_ORE, "Nether Tin Ore");
        this.add(NETHER_URANIUM_ORE, "Nether Uranium Ore");

        this.add(ALUMINIUM_BLOCK, "Block of Aluminium");
        this.add(LEAD_BLOCK, "Block of Lead");
        this.add(NICKEL_BLOCK, "Block of Nickel");
        this.add(SILVER_BLOCK, "Block of Silver");
        this.add(TIN_BLOCK, "Block of Tin");
        this.add(URANIUM_BLOCK, "Block of Uranium");

        this.add(
                ((TranslatableComponent) Foundation.ORES_ITEMS_GROUP.getDisplayName()).getKey(),
                "Janoeo Foundation - Items"
        );
        this.add(
                ((TranslatableComponent) Foundation.GEAR_ITEMS_GROUP.getDisplayName()).getKey(),
                "Janoeo Foundation - Gear"
        );
        this.add(
                ((TranslatableComponent) Foundation.ORES_BLOCKS_GROUP.getDisplayName()).getKey(),
                "Janoeo Foundation - Blocks"
        );
    }
}
