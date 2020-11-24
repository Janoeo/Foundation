package fr.alasdiablo.janoeo.util;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import fr.alasdiablo.diolib.data.DioLootTableProvider;
import fr.alasdiablo.janoeo.data.ModBlockLootTable;
import fr.alasdiablo.janoeo.data.CraftRecipes;
import fr.alasdiablo.janoeo.data.SmeltingBlastingRecipes;
import net.minecraft.data.DataGenerator;
import net.minecraft.loot.LootParameterSets;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

/**
 * Data generator event handler
 */
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@SuppressWarnings("unused")
public class DataGenerators {

    /**
     * Handle the data event
     * @param event Instance of the event
     */
    @SubscribeEvent
    public static void gatherDate(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(new CraftRecipes(generator));
        generator.addProvider(new SmeltingBlastingRecipes(generator));
        generator.addProvider(new DioLootTableProvider(generator, ImmutableList.of(Pair.of(ModBlockLootTable::new, LootParameterSets.BLOCK)), LootParameterSets.BLOCK, "Janoeo"));
    }
}
