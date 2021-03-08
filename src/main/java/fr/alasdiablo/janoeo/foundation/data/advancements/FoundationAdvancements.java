package fr.alasdiablo.janoeo.foundation.data.advancements;

import fr.alasdiablo.janoeo.foundation.init.*;
import fr.alasdiablo.janoeo.foundation.util.Registries;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.IRequirementsStrategy;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.function.Consumer;

public class FoundationAdvancements implements Consumer<Consumer<Advancement>> {
    @Override
    public void accept(Consumer<Advancement> advancementConsumer) {

        Advancement mineNewOre = Advancement.Builder.builder()
                .withDisplay(
                        Blocks.COAL_ORE,
                        new TranslationTextComponent("advancements.foundation.root.title"),
                        new TranslationTextComponent("advancements.foundation.root.description"),
                        new ResourceLocation("minecraft", "textures/gui/advancements/backgrounds/stone.png"),
                        FrameType.TASK, true, true, false)
                .withRequirementsStrategy(IRequirementsStrategy.OR)
                .withCriterion("aluminium", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.ALUMINIUM_ORE.asItem()))
                .withCriterion("copper", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.COPPER_ORE.asItem()))
                .withCriterion("osmium", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.OSMIUM_ORE.asItem()))
                .withCriterion("lead", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.LEAD_ORE.asItem()))
                .withCriterion("silver", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.SILVER_ORE.asItem()))
                .withCriterion("tin", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.TIN_ORE.asItem()))
                .withCriterion("uranium", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.URANIUM_ORE.asItem()))
                .withCriterion("zinc", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.ZINC_ORE.asItem()))
                .withCriterion("amethyst_ore", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.AMETHYST_ORE.asItem()))
                .withCriterion("ruby_ore", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.RUBY_ORE.asItem()))
                .withCriterion("sapphire_ore", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.SAPPHIRE_ORE.asItem()))
                .withCriterion("dense_coal", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_COAL_ORE.asItem()))
                .withCriterion("dense_copper", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_COPPER_ORE.asItem()))
                .withCriterion("dense_diamond", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_DIAMOND_ORE.asItem()))
                .withCriterion("dense_gold", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_GOLD_ORE.asItem()))
                .withCriterion("dense_iron", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_IRON_ORE.asItem()))
                .withCriterion("dense_emerald", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_EMERALD_ORE.asItem()))
                .withCriterion("dense_lapis", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_LAPIS_ORE.asItem()))
                .withCriterion("dense_redstone", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_REDSTONE_ORE.asItem()))
                .withCriterion("dense_tin", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_TIN_ORE.asItem()))
                .withCriterion("amethyst", InventoryChangeTrigger.Instance.forItems(() -> GemsItems.AMETHYST))
                .withCriterion("ruby", InventoryChangeTrigger.Instance.forItems(() -> GemsItems.RUBY))
                .withCriterion("sapphire", InventoryChangeTrigger.Instance.forItems(() -> GemsItems.SAPPHIRE))
                .register(advancementConsumer, new ResourceLocation(Registries.MODID, "root").toString());

        Advancement.Builder.builder()
                .withParent(mineNewOre)
                .withDisplay(
                        GemsItems.AMETHYST,
                        new TranslationTextComponent("advancements.foundation.new_shiny.title"),
                        new TranslationTextComponent("advancements.foundation.new_shiny.description"),
                        null, FrameType.TASK, true, true, false)
                .withRequirementsStrategy(IRequirementsStrategy.OR)
                .withCriterion("amethyst_ore", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.AMETHYST_ORE.asItem()))
                .withCriterion("ruby_ore", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.RUBY_ORE.asItem()))
                .withCriterion("sapphire_ore", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.SAPPHIRE_ORE.asItem()))
                .withCriterion("amethyst", InventoryChangeTrigger.Instance.forItems(() -> GemsItems.AMETHYST))
                .withCriterion("ruby", InventoryChangeTrigger.Instance.forItems(() -> GemsItems.RUBY))
                .withCriterion("sapphire", InventoryChangeTrigger.Instance.forItems(() -> GemsItems.SAPPHIRE))
                .register(advancementConsumer, new ResourceLocation(Registries.MODID, "new_shiny").toString());

        Advancement.Builder.builder()
                .withParent(mineNewOre)
                .withDisplay(
                        NetherOresBlocks.COAL_NETHER_ORE,
                        new TranslationTextComponent("advancements.foundation.new_nether_ore.title"),
                        new TranslationTextComponent("advancements.foundation.new_nether_ore.description"),
                        null, FrameType.TASK, true, true, false)
                .withRequirementsStrategy(IRequirementsStrategy.OR)
                .withCriterion("nether_aluminium", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.ALUMINIUM_NETHER_ORE.asItem()))
                .withCriterion("nether_coal", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.COAL_NETHER_ORE.asItem()))
                .withCriterion("nether_copper", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.COPPER_NETHER_ORE.asItem()))
                .withCriterion("nether_diamond", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.DIAMOND_NETHER_ORE.asItem()))
                .withCriterion("nether_emerald", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.EMERALD_NETHER_ORE.asItem()))
                .withCriterion("nether_gold", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.GOLD_NETHER_ORE.asItem()))
                .withCriterion("nether_iron", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.IRON_NETHER_ORE.asItem()))
                .withCriterion("nether_lapis", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.LAPIS_NETHER_ORE.asItem()))
                .withCriterion("nether_lead", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.LEAD_NETHER_ORE.asItem()))
                .withCriterion("nether_osmium", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.OSMIUM_NETHER_ORE.asItem()))
                .withCriterion("nether_redstone", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.REDSTONE_NETHER_ORE.asItem()))
                .withCriterion("nether_ruby", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.RUBY_NETHER_ORE.asItem()))
                .withCriterion("nether_sapphire", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.SAPPHIRE_NETHER_ORE.asItem()))
                .withCriterion("nether_silver", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.SILVER_NETHER_ORE.asItem()))
                .withCriterion("nether_tin", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.TIN_NETHER_ORE.asItem()))
                .withCriterion("nether_uranium", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.URANIUM_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_coal", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_COAL_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_diamond", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_DIAMOND_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_emerald", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_EMERALD_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_gold", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_GOLD_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_iron", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_IRON_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_lapis", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_LAPIS_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_quartz", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_QUARTZ_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_redstone", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_REDSTONE_NETHER_ORE.asItem()))
                .register(advancementConsumer, new ResourceLocation(Registries.MODID, "new_nether_ore").toString());

        Advancement.Builder.builder()
                .withParent(mineNewOre)
                .withDisplay(
                        EndOresBlocks.COAL_END_ORE,
                        new TranslationTextComponent("advancements.foundation.new_the_end_ore.title"),
                        new TranslationTextComponent("advancements.foundation.new_the_end_ore.description"),
                        null, FrameType.GOAL, true, true, false)
                .withRequirementsStrategy(IRequirementsStrategy.OR)
                .withCriterion("the_end_coal", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.COAL_END_ORE.asItem()))
                .withCriterion("the_end_diamond", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.DIAMOND_END_ORE.asItem()))
                .withCriterion("the_end_emerald", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.EMERALD_END_ORE.asItem()))
                .withCriterion("the_end_gold", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.GOLD_END_ORE.asItem()))
                .withCriterion("the_end_iron", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.IRON_END_ORE.asItem()))
                .withCriterion("the_end_lapis", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.LAPIS_END_ORE.asItem()))
                .withCriterion("the_end_redstone", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.REDSTONE_END_ORE.asItem()))
                .register(advancementConsumer, new ResourceLocation(Registries.MODID, "new_the_end_ore").toString());


        Advancement.Builder.builder()
                .withParent(mineNewOre)
                .withDisplay(
                        Blocks.DIAMOND_ORE,
                        new TranslationTextComponent("advancements.foundation.overworld_miner.title"),
                        new TranslationTextComponent("advancements.foundation.overworld_miner.description"),
                        null, FrameType.GOAL, true, true, false)
                .withCriterion("aluminium", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.ALUMINIUM_ORE.asItem()))
                .withCriterion("copper", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.COPPER_ORE.asItem()))
                .withCriterion("osmium", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.OSMIUM_ORE.asItem()))
                .withCriterion("lead", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.LEAD_ORE.asItem()))
                .withCriterion("silver", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.SILVER_ORE.asItem()))
                .withCriterion("tin", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.TIN_ORE.asItem()))
                .withCriterion("uranium", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.URANIUM_ORE.asItem()))
                .withCriterion("zinc", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.ZINC_ORE.asItem()))
                .withCriterion("amethyst", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.AMETHYST_ORE.asItem()))
                .withCriterion("ruby", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.RUBY_ORE.asItem()))
                .withCriterion("sapphire", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.SAPPHIRE_ORE.asItem()))
                .withCriterion("dense_coal", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_COAL_ORE.asItem()))
                .withCriterion("dense_copper", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_COPPER_ORE.asItem()))
                .withCriterion("dense_diamond", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_DIAMOND_ORE.asItem()))
                .withCriterion("dense_gold", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_GOLD_ORE.asItem()))
                .withCriterion("dense_iron", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_IRON_ORE.asItem()))
                .withCriterion("dense_emerald", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_EMERALD_ORE.asItem()))
                .withCriterion("dense_lapis", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_LAPIS_ORE.asItem()))
                .withCriterion("dense_redstone", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_REDSTONE_ORE.asItem()))
                .withCriterion("dense_tin", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_TIN_ORE.asItem()))
                .register(advancementConsumer, new ResourceLocation(Registries.MODID, "overworld_miner").toString());


        Advancement.Builder.builder()
                .withParent(mineNewOre)
                .withDisplay(
                        NetherOresBlocks.DIAMOND_NETHER_ORE,
                        new TranslationTextComponent("advancements.foundation.nether_miner.title"),
                        new TranslationTextComponent("advancements.foundation.nether_miner.description"),
                        null, FrameType.GOAL, true, true, false)
                .withCriterion("nether_aluminium", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.ALUMINIUM_NETHER_ORE.asItem()))
                .withCriterion("nether_coal", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.COAL_NETHER_ORE.asItem()))
                .withCriterion("nether_copper", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.COPPER_NETHER_ORE.asItem()))
                .withCriterion("nether_diamond", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.DIAMOND_NETHER_ORE.asItem()))
                .withCriterion("nether_emerald", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.EMERALD_NETHER_ORE.asItem()))
                .withCriterion("nether_gold", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.GOLD_NETHER_ORE.asItem()))
                .withCriterion("nether_iron", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.IRON_NETHER_ORE.asItem()))
                .withCriterion("nether_lapis", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.LAPIS_NETHER_ORE.asItem()))
                .withCriterion("nether_lead", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.LEAD_NETHER_ORE.asItem()))
                .withCriterion("nether_osmium", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.OSMIUM_NETHER_ORE.asItem()))
                .withCriterion("nether_redstone", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.REDSTONE_NETHER_ORE.asItem()))
                .withCriterion("nether_ruby", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.RUBY_NETHER_ORE.asItem()))
                .withCriterion("nether_sapphire", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.SAPPHIRE_NETHER_ORE.asItem()))
                .withCriterion("nether_silver", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.SILVER_NETHER_ORE.asItem()))
                .withCriterion("nether_tin", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.TIN_NETHER_ORE.asItem()))
                .withCriterion("nether_uranium", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.URANIUM_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_coal", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_COAL_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_diamond", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_DIAMOND_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_emerald", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_EMERALD_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_gold", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_GOLD_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_iron", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_IRON_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_lapis", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_LAPIS_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_quartz", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_QUARTZ_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_redstone", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_REDSTONE_NETHER_ORE.asItem()))
                .register(advancementConsumer, new ResourceLocation(Registries.MODID, "nether_miner").toString());

        Advancement.Builder.builder()
                .withParent(mineNewOre)
                .withDisplay(
                        EndOresBlocks.DIAMOND_END_ORE,
                        new TranslationTextComponent("advancements.foundation.the_end_miner.title"),
                        new TranslationTextComponent("advancements.foundation.the_end_miner.description"),
                        null, FrameType.GOAL, true, true, false)
                .withCriterion("the_end_coal", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.COAL_END_ORE.asItem()))
                .withCriterion("the_end_diamond", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.DIAMOND_END_ORE.asItem()))
                .withCriterion("the_end_emerald", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.EMERALD_END_ORE.asItem()))
                .withCriterion("the_end_gold", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.GOLD_END_ORE.asItem()))
                .withCriterion("the_end_iron", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.IRON_END_ORE.asItem()))
                .withCriterion("the_end_lapis", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.LAPIS_END_ORE.asItem()))
                .withCriterion("the_end_redstone", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.REDSTONE_END_ORE.asItem()))
                .register(advancementConsumer, new ResourceLocation(Registries.MODID, "the_end_miner").toString());


        Advancement.Builder.builder()
                .withParent(mineNewOre)
                .withDisplay(
                        OverworldDenseOresBlocks.DENSE_DIAMOND_ORE,
                        new TranslationTextComponent("advancements.foundation.god_like_miner.title"),
                        new TranslationTextComponent("advancements.foundation.god_like_miner.description"),
                        null, FrameType.CHALLENGE, true, true, false)
                .withCriterion("aluminium", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.ALUMINIUM_ORE.asItem()))
                .withCriterion("copper", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.COPPER_ORE.asItem()))
                .withCriterion("osmium", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.OSMIUM_ORE.asItem()))
                .withCriterion("lead", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.LEAD_ORE.asItem()))
                .withCriterion("silver", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.SILVER_ORE.asItem()))
                .withCriterion("tin", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.TIN_ORE.asItem()))
                .withCriterion("uranium", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.URANIUM_ORE.asItem()))
                .withCriterion("zinc", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.ZINC_ORE.asItem()))
                .withCriterion("amethyst", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.AMETHYST_ORE.asItem()))
                .withCriterion("ruby", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.RUBY_ORE.asItem()))
                .withCriterion("sapphire", InventoryChangeTrigger.Instance.forItems(() -> OverworldOresBlocks.SAPPHIRE_ORE.asItem()))
                .withCriterion("dense_coal", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_COAL_ORE.asItem()))
                .withCriterion("dense_copper", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_COPPER_ORE.asItem()))
                .withCriterion("dense_diamond", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_DIAMOND_ORE.asItem()))
                .withCriterion("dense_gold", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_GOLD_ORE.asItem()))
                .withCriterion("dense_iron", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_IRON_ORE.asItem()))
                .withCriterion("dense_emerald", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_EMERALD_ORE.asItem()))
                .withCriterion("dense_lapis", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_LAPIS_ORE.asItem()))
                .withCriterion("dense_redstone", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_REDSTONE_ORE.asItem()))
                .withCriterion("dense_tin", InventoryChangeTrigger.Instance.forItems(() -> OverworldDenseOresBlocks.DENSE_TIN_ORE.asItem()))
                .withCriterion("nether_aluminium", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.ALUMINIUM_NETHER_ORE.asItem()))
                .withCriterion("nether_coal", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.COAL_NETHER_ORE.asItem()))
                .withCriterion("nether_copper", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.COPPER_NETHER_ORE.asItem()))
                .withCriterion("nether_diamond", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.DIAMOND_NETHER_ORE.asItem()))
                .withCriterion("nether_emerald", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.EMERALD_NETHER_ORE.asItem()))
                .withCriterion("nether_gold", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.GOLD_NETHER_ORE.asItem()))
                .withCriterion("nether_iron", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.IRON_NETHER_ORE.asItem()))
                .withCriterion("nether_lapis", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.LAPIS_NETHER_ORE.asItem()))
                .withCriterion("nether_lead", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.LEAD_NETHER_ORE.asItem()))
                .withCriterion("nether_osmium", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.OSMIUM_NETHER_ORE.asItem()))
                .withCriterion("nether_redstone", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.REDSTONE_NETHER_ORE.asItem()))
                .withCriterion("nether_ruby", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.RUBY_NETHER_ORE.asItem()))
                .withCriterion("nether_sapphire", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.SAPPHIRE_NETHER_ORE.asItem()))
                .withCriterion("nether_silver", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.SILVER_NETHER_ORE.asItem()))
                .withCriterion("nether_tin", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.TIN_NETHER_ORE.asItem()))
                .withCriterion("nether_uranium", InventoryChangeTrigger.Instance.forItems(() -> NetherOresBlocks.URANIUM_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_coal", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_COAL_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_diamond", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_DIAMOND_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_emerald", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_EMERALD_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_gold", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_GOLD_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_iron", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_IRON_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_lapis", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_LAPIS_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_quartz", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_QUARTZ_NETHER_ORE.asItem()))
                .withCriterion("dense_nether_redstone", InventoryChangeTrigger.Instance.forItems(() -> NetherDenseOresBlocks.DENSE_REDSTONE_NETHER_ORE.asItem()))
                .withCriterion("the_end_coal", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.COAL_END_ORE.asItem()))
                .withCriterion("the_end_diamond", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.DIAMOND_END_ORE.asItem()))
                .withCriterion("the_end_emerald", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.EMERALD_END_ORE.asItem()))
                .withCriterion("the_end_gold", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.GOLD_END_ORE.asItem()))
                .withCriterion("the_end_iron", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.IRON_END_ORE.asItem()))
                .withCriterion("the_end_lapis", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.LAPIS_END_ORE.asItem()))
                .withCriterion("the_end_redstone", InventoryChangeTrigger.Instance.forItems(() -> EndOresBlocks.REDSTONE_END_ORE.asItem()))
                .register(advancementConsumer, new ResourceLocation(Registries.MODID, "god_like_miner").toString());

    }
}
