package fr.alasdiablo.janoeo.foundation;

import fr.alasdiablo.diolib.api.item.GroundCreativeModeTab;
import fr.alasdiablo.janoeo.foundation.compatibility.jer.JERCompat;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.data.loot.FoundationLootTableProvider;
import fr.alasdiablo.janoeo.foundation.data.model.FoundationBlockModelProvider;
import fr.alasdiablo.janoeo.foundation.data.model.FoundationBlockStateProvider;
import fr.alasdiablo.janoeo.foundation.data.model.FoundationItemModelProvider;
import fr.alasdiablo.janoeo.foundation.data.recipe.FoundationRecipeProvider;
import fr.alasdiablo.janoeo.foundation.data.tag.FoundationBlockTagsProvider;
import fr.alasdiablo.janoeo.foundation.data.tag.FoundationItemTagsProvider;
import fr.alasdiablo.janoeo.foundation.data.world.BiomeModifierProvider;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import fr.alasdiablo.janoeo.foundation.world.feature.FoundationFeatures;
import fr.alasdiablo.janoeo.foundation.world.placement.FoundationPlacements;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

@Mod(Foundation.MOD_ID)
@MethodsReturnNonnullByDefault
public class Foundation {

    public static final String MOD_ID = "janoeo_foundation";

    public static final Logger logger = LogManager.getLogger(Foundation.MOD_ID);

    public static final CreativeModeTab MATERIALS_GROUP = new GroundCreativeModeTab("janoeo.foundation.materials") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FoundationItems.GEARS.get(Resource.Silver).get());
        }
    };

    public static final CreativeModeTab ORES_GROUP = new GroundCreativeModeTab("janoeo.foundation.ores") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FoundationBlocks.STONE_ORES.get(Resource.Silver).get());
        }
    };

    public Foundation() throws IOException {
        this.foundCompat();
        FoundationConfig.init();
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        FoundationItems.init(modBus);
        FoundationBlocks.init(modBus);
        FoundationFeatures.init(modBus);
        FoundationPlacements.init(modBus);
        modBus.addListener(this::setup);
        modBus.addListener(this::gatherData);
    }

    private void foundCompat() {
        final ModList modList = ModList.get();
        Compat.JUST_ENOUGH_RESOURCES = modList.isLoaded("jeresources");
    }

    private void gatherData(@NotNull GatherDataEvent event) {
        Foundation.logger.debug("Start data generator");
        final DataGenerator      generator          = event.getGenerator();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        Foundation.logger.debug("Add Block Model Provider");
        generator.addProvider(true, new FoundationBlockModelProvider(generator, existingFileHelper));

        Foundation.logger.debug("Add Block State Provider");
        generator.addProvider(true, new FoundationBlockStateProvider(generator));

        Foundation.logger.debug("Add Item Model Provider");
        generator.addProvider(true, new FoundationItemModelProvider(generator, existingFileHelper));

        Foundation.logger.debug("Add Tags Provider");
        final FoundationBlockTagsProvider blockTagsProvider = new FoundationBlockTagsProvider(
                generator, existingFileHelper);
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, new FoundationItemTagsProvider(generator, blockTagsProvider, existingFileHelper));

        Foundation.logger.debug("Add Recipes Provider");
        generator.addProvider(true, new FoundationRecipeProvider(generator));

        Foundation.logger.debug("Add Loot Tables Provider");
        generator.addProvider(true, new FoundationLootTableProvider(generator));

        Foundation.logger.debug("Add Biome Modifier Provider");
        generator.addProvider(true, new BiomeModifierProvider(generator));
    }

    private void setup(final FMLCommonSetupEvent commonSetupEvent) {
        this.initCompat();
    }

    private void initCompat() {
        try {
            if (Compat.JUST_ENOUGH_RESOURCES) JERCompat.init();
        } catch (Exception e) {
            logger.warn("Just Enough Ressources compatibility patch have failed!");
        }
    }

    private static class Compat {
        public static boolean JUST_ENOUGH_RESOURCES = false;
    }
}
