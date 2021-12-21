package fr.alasdiablo.janoeo.foundation.data.model;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.List;

import static fr.alasdiablo.janoeo.foundation.Registries.*;

public class FoundationBlockModelProvider extends BlockModelProvider {
    private static final ResourceLocation CUBE_ALL = new ResourceLocation("block/cube_all");

    public FoundationBlockModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        List<String> ores = List.of(
                BAUXITE_ORE, LEAD_ORE, NICKEL_ORE, SILVER_ORE, TIN_ORE, URANIUM_ORE, DEEPSLATE_BAUXITE_ORE, DEEPSLATE_LEAD_ORE, DEEPSLATE_NICKEL_ORE,
                DEEPSLATE_SILVER_ORE, DEEPSLATE_TIN_ORE, DEEPSLATE_URANIUM_ORE, NETHER_COAL_ORE, NETHER_COPPER_ORE, NETHER_DIAMOND_ORE, NETHER_EMERALD_ORE,
                NETHER_IRON_ORE, NETHER_LAPIS_ORE, NETHER_REDSTONE_ORE, NETHER_BAUXITE_ORE, NETHER_LEAD_ORE, NETHER_NICKEL_ORE, NETHER_SILVER_ORE,
                NETHER_TIN_ORE, NETHER_URANIUM_ORE
        );

        ores.forEach(block -> cubeAll(block, Folder.ORE));

        List<String> tinyOres = List.of(
                TINY_COAL_ORE, TINY_COPPER_ORE, TINY_DIAMOND_ORE, TINY_EMERALD_ORE, TINY_GOLD_ORE, TINY_IRON_ORE, TINY_LAPIS_ORE, TINY_REDSTONE_ORE,
                DEEPSLATE_TINY_COAL_ORE, DEEPSLATE_TINY_COPPER_ORE, DEEPSLATE_TINY_DIAMOND_ORE, DEEPSLATE_TINY_EMERALD_ORE, DEEPSLATE_TINY_GOLD_ORE,
                DEEPSLATE_TINY_IRON_ORE, DEEPSLATE_TINY_LAPIS_ORE, DEEPSLATE_TINY_REDSTONE_ORE, TINY_BAUXITE_ORE, TINY_LEAD_ORE, TINY_NICKEL_ORE,
                TINY_SILVER_ORE, TINY_TIN_ORE, TINY_URANIUM_ORE, DEEPSLATE_TINY_BAUXITE_ORE, DEEPSLATE_TINY_LEAD_ORE, DEEPSLATE_TINY_NICKEL_ORE,
                DEEPSLATE_TINY_SILVER_ORE, DEEPSLATE_TINY_TIN_ORE, DEEPSLATE_TINY_URANIUM_ORE
        );

        tinyOres.forEach(block -> cubeAll(block, Folder.TINY_ORE));
    }

    private void cubeAll(String blockNameIn, Folder folder) {
        withExistingParent(blockNameIn, CUBE_ALL).texture("all", new ResourceLocation(MOD_ID, "block/" + folder.getFolder() + blockNameIn));
    }

    private enum Folder {
        TINY_ORE("ore/tiny/"),
        ORE("ore/"),
        DEFAULT("");

        private final String folder;

        Folder(String folder) {
            this.folder = folder;
        }

        public String getFolder() {
            return folder;
        }
    }
}
