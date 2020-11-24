package fr.alasdiablo.janoeo.data;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.Janoeo;
import fr.alasdiablo.janoeo.init.*;
import fr.alasdiablo.janoeo.util.Registries;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class SmeltingBlastingRecipes extends RecipeProvider {
    public SmeltingBlastingRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        this.registerSmeltingBlasting(DustsItems.IRON_DUST, Items.IRON_INGOT, "has_iron_dust", consumer);
        this.registerSmeltingBlasting(DustsItems.GOLD_DUST, Items.GOLD_INGOT, "has_gold_dust", consumer);
        this.registerSmeltingBlasting(DustsItems.DIAMOND_DUST, Items.DIAMOND, "has_diamond_dust", consumer);
        this.registerSmeltingBlasting(GravelsOresBlocks.IRON_GRAVEL_ORE, Items.IRON_INGOT, "has_gravel_iron_ore", consumer);
        this.registerSmeltingBlasting(GravelsOresBlocks.GOLD_GRAVEL_ORE, Items.GOLD_INGOT, "has_gravel_gold_ore", consumer);
        this.registerSmeltingBlasting(GravelsOresBlocks.DIAMOND_GRAVEL_ORE, Items.DIAMOND, "has_gravel_diamond_ore", consumer);
        this.registerSmeltingBlasting(EndOresBlocks.COAL_END_ORE, Items.COAL, "has_end_coal_ore", consumer);
        this.registerSmeltingBlasting(EndOresBlocks.DIAMOND_END_ORE, Items.DIAMOND, "has_end_diamond_ore", consumer);
        this.registerSmeltingBlasting(EndOresBlocks.EMERALD_END_ORE, Items.EMERALD, "has_end_emerald_ore", consumer);
        this.registerSmeltingBlasting(EndOresBlocks.GOLD_END_ORE, Items.GOLD_INGOT, "has_end_gold_ore", consumer);
        this.registerSmeltingBlasting(EndOresBlocks.IRON_END_ORE, Items.IRON_INGOT, "has_end_iron_ore", consumer);
        this.registerSmeltingBlasting(EndOresBlocks.LAPIS_END_ORE, Items.LAPIS_LAZULI, "has_end_lapis_ore", consumer);
        this.registerSmeltingBlasting(EndOresBlocks.REDSTONE_END_ORE, Items.REDSTONE, "has_end_redstone_ore", consumer);
        this.registerSmeltingBlasting(OverworldOresBlocks.COPPER_ORE, IngotsItems.COPPER_INGOT,"has_copper_ore", consumer);
        this.registerSmeltingBlasting(OverworldOresBlocks.TIN_ORE, IngotsItems.TIN_INGOT, "has_tin_ore", consumer);
        this.registerSmeltingBlasting(OverworldOresBlocks.ALUMINIUM_ORE, IngotsItems.ALUMINIUM_INGOT, "has_aluminium_ore", consumer);
        this.registerSmeltingBlasting(OverworldOresBlocks.LEAD_ORE, IngotsItems.LEAD_INGOT, "has_lead_ore", consumer);
        this.registerSmeltingBlasting(OverworldOresBlocks.SILVER_ORE, IngotsItems.SILVER_INGOT, "has_silver_ore", consumer);
        this.registerSmeltingBlasting(OverworldOresBlocks.URANIUM_ORE, IngotsItems.URANIUM_INGOT, "has_uranium_ore", consumer);
        this.registerSmeltingBlasting(OverworldOresBlocks.OSMIUM_ORE, IngotsItems.OSMIUM_INGOT, "has_osmium_ore", consumer);
        this.registerSmeltingBlasting(OverworldOresBlocks.RUBY_ORE, GemsItems.RUBY, "has_ruby_ore", consumer);
        this.registerSmeltingBlasting(OverworldOresBlocks.SAPPHIRE_ORE, GemsItems.SAPPHIRE, "has_sapphire_ore", consumer);
        this.registerSmeltingBlasting(OverworldOresBlocks.AMETHYST_ORE, GemsItems.AMETHYST, "has_amethyst_ore", consumer);
        this.registerSmeltingBlasting(OverworldOresBlocks.ZINC_ORE, IngotsItems.ZINC_INGOT, "has_zinc_ore", consumer);
        this.registerSmeltingBlasting(NetherOresBlocks.COAL_NETHER_ORE, Items.COAL, "has_nether_coal_ore", consumer);
        this.registerSmeltingBlasting(NetherOresBlocks.DIAMOND_NETHER_ORE, Items.DIAMOND, "has_nether_diamond_ore", consumer);
        this.registerSmeltingBlasting(NetherOresBlocks.EMERALD_NETHER_ORE, Items.EMERALD, "has_nether_emerald_ore", consumer);
        this.registerSmeltingBlasting(NetherOresBlocks.GOLD_NETHER_ORE, Items.GOLD_INGOT, "has_nether_gold_ore", consumer);
        this.registerSmeltingBlasting(NetherOresBlocks.IRON_NETHER_ORE, Items.IRON_INGOT, "has_nether_iron_ore", consumer);
        this.registerSmeltingBlasting(NetherOresBlocks.LAPIS_NETHER_ORE, Items.LAPIS_LAZULI, "has_nether_lapis_ore", consumer);
        this.registerSmeltingBlasting(NetherOresBlocks.REDSTONE_NETHER_ORE, Items.REDSTONE, "has_nether_redstone_ore", consumer);
        this.registerSmeltingBlasting(NetherOresBlocks.ALUMINIUM_NETHER_ORE, IngotsItems.ALUMINIUM_INGOT, "has_nether_aluminium_ore", consumer);
        this.registerSmeltingBlasting(NetherOresBlocks.LEAD_NETHER_ORE, IngotsItems.LEAD_INGOT, "has_nether_lead_ore", consumer);
        this.registerSmeltingBlasting(NetherOresBlocks.RUBY_NETHER_ORE, GemsItems.RUBY, "has_nether_ruby_ore", consumer);
        this.registerSmeltingBlasting(NetherOresBlocks.SAPPHIRE_NETHER_ORE, GemsItems.SAPPHIRE, "has_nether_sapphire_ore", consumer);
        this.registerSmeltingBlasting(NetherOresBlocks.SILVER_NETHER_ORE, IngotsItems.SILVER_INGOT, "has_nether_silver_ore", consumer);
        this.registerSmeltingBlasting(NetherOresBlocks.URANIUM_NETHER_ORE, IngotsItems.URANIUM_INGOT, "has_nether_uranium_ore", consumer);
        this.registerSmeltingBlasting(NetherOresBlocks.TIN_NETHER_ORE, IngotsItems.TIN_INGOT, "has_nether_tin_ore", consumer);
        this.registerSmeltingBlasting(NetherOresBlocks.COPPER_NETHER_ORE, IngotsItems.COPPER_INGOT, "has_nether_copper_ore", consumer);
        this.registerSmeltingBlasting(NetherOresBlocks.OSMIUM_NETHER_ORE, IngotsItems.OSMIUM_INGOT, "has_nether_osmium_ore", consumer);
    }

    private void registerSmeltingBlasting(IItemProvider ingredientIn, IItemProvider resultIn, String criterion, Consumer<IFinishedRecipe> consumer) {
        final ResourceLocation name = new ResourceLocation(Registries.MODID, String.format("%s_to_%s", ingredientIn.asItem().getRegistryName().getPath(), resultIn.asItem().getRegistryName().getPath()));
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ingredientIn), resultIn, 0.1f, 200).addCriterion(criterion, hasItem(ingredientIn)).build(consumer, RegistryHelper.setPrefixOnRegistryName(name, "smelting"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ingredientIn), resultIn, 0.1f, 100).addCriterion(criterion, hasItem(ingredientIn)).build(consumer, RegistryHelper.setPrefixOnRegistryName(name, "blasting"));
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public String getName() {
        return "JANOEO - Smelting Blasting";
    }
}
