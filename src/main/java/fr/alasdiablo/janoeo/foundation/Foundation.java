package fr.alasdiablo.janoeo.foundation;

import fr.alasdiablo.diolib.item.GroundCreativeModeTab;
import fr.alasdiablo.janoeo.foundation.compatibility.JERCompat;
import fr.alasdiablo.janoeo.foundation.config.FoundationConfig;
import fr.alasdiablo.janoeo.foundation.data.language.EnglishProvider;
import fr.alasdiablo.janoeo.foundation.data.language.FrenchProvider;
import fr.alasdiablo.janoeo.foundation.data.language.SpanishProvider;
import fr.alasdiablo.janoeo.foundation.data.loot.FoundationLootTableProvider;
import fr.alasdiablo.janoeo.foundation.data.model.FoundationBlockModelProvider;
import fr.alasdiablo.janoeo.foundation.data.model.FoundationBlockStateProvider;
import fr.alasdiablo.janoeo.foundation.data.model.FoundationItemModelProvider;
import fr.alasdiablo.janoeo.foundation.data.recipe.FoundationRecipeProvider;
import fr.alasdiablo.janoeo.foundation.data.tag.FoundationBlockTagsProvider;
import fr.alasdiablo.janoeo.foundation.data.tag.FoundationItemTagsProvider;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import fr.alasdiablo.janoeo.foundation.init.FoundationGeneration;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

@Mod(Registries.MOD_ID)
@MethodsReturnNonnullByDefault
public class Foundation {

    public static final Logger logger = LogManager.getLogger(Registries.MOD_ID);

    public static final CreativeModeTab ORES_ITEMS_GROUP = new GroundCreativeModeTab("janoeo.foundation.ores.item") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FoundationItems.SILVER_INGOT);
        }
    };

    public static final CreativeModeTab GEAR_ITEMS_GROUP = new GroundCreativeModeTab("janoeo.foundation.gear.item") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FoundationItems.SILVER_GEAR);
        }
    };

    public static final CreativeModeTab ORES_BLOCKS_GROUP = new GroundCreativeModeTab("janoeo.foundation.ores.block") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FoundationBlocks.SILVER_ORE);
        }
    };

    public Foundation() throws IOException {
        this.foundCompat();
        FoundationConfig.init();
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(this::initFeatures);
        modBus.addListener(this::setup);
        modBus.addListener(this::gatherData);
        modBus.addGenericListener(Block.class, FoundationBlocks::initBlock);
        modBus.addGenericListener(Item.class, FoundationBlocks::initItem);
        modBus.addGenericListener(Item.class, FoundationItems::init);
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
        generator.addProvider(new FoundationBlockModelProvider(generator, existingFileHelper));

        Foundation.logger.debug("Add Block State Provider");
        generator.addProvider(new FoundationBlockStateProvider(generator));

        Foundation.logger.debug("Add Item Model Provider");
        generator.addProvider(new FoundationItemModelProvider(generator, existingFileHelper));

        Foundation.logger.debug("Add Language Provider");
        generator.addProvider(new EnglishProvider(generator));
        generator.addProvider(new FrenchProvider(generator));
        generator.addProvider(new SpanishProvider(generator));

        Foundation.logger.debug("Add Tags Provider");
        final FoundationBlockTagsProvider blockTagsProvider = new FoundationBlockTagsProvider(
                generator, existingFileHelper);
        generator.addProvider(blockTagsProvider);
        generator.addProvider(new FoundationItemTagsProvider(generator, blockTagsProvider, existingFileHelper));

        Foundation.logger.debug("Add Recipes Provider");
        generator.addProvider(new FoundationRecipeProvider(generator));

        Foundation.logger.debug("Add Loot Tables Provider");
        generator.addProvider(new FoundationLootTableProvider(generator));
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

    private void initFeatures(RegistryEvent.NewRegistry newRegistry) {
        MinecraftForge.EVENT_BUS.addListener(FoundationGeneration::onBiomeLoading);
    }

    public static class Compat {
        public static boolean JUST_ENOUGH_RESOURCES = false;
    }
}
