package fr.alasdiablo.janoeo.foundation.data.model;

import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.init.FoundationBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

public class FoundationBlockModelProvider extends BlockModelProvider {
    private static final ResourceLocation CUBE_ALL = new ResourceLocation("block/cube_all");

    public FoundationBlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Foundation.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        FoundationBlocks.STONE_ORES.forEach((resource, block) -> cubeAll(block.getId().getPath(), Folder.ORE));
        FoundationBlocks.DEEPSLATE_ORES.forEach((resource, block) -> cubeAll(block.getId().getPath(), Folder.ORE));
        FoundationBlocks.TINY_STONE_ORES.forEach((resource, block) -> cubeAll(block.getId().getPath(), Folder.TINY_ORE));
        FoundationBlocks.TINY_DEEPSLATE_ORES.forEach((resource, block) -> cubeAll(block.getId().getPath(), Folder.TINY_ORE));
        FoundationBlocks.NETHER_ORES.forEach((resource, block) -> cubeAll(block.getId().getPath(), Folder.NETHER_ORE));
        FoundationBlocks.END_ORES.forEach((resource, block) -> cubeAll(block.getId().getPath(), Folder.END_ORE));
        FoundationBlocks.GRAVEL_ORES.forEach((resource, block) -> cubeAll(block.getId().getPath(), Folder.GRAVEL_ORE));
        FoundationBlocks.RAW_BLOCKS.forEach((resource, block) -> cubeAll(block.getId().getPath(), Folder.DEFAULT));
        FoundationBlocks.STORAGE_BLOCKS.forEach((resource, block) -> cubeAll(block.getId().getPath(), Folder.DEFAULT));
    }

    private void cubeAll(String blockNameIn, @NotNull Folder folder) {
        withExistingParent(blockNameIn, CUBE_ALL).texture("all", new ResourceLocation(Foundation.MOD_ID, "block/" + folder.getFolder() + blockNameIn));
    }

    private enum Folder {
        TINY_ORE("ore/tiny/"),
        GRAVEL_ORE("ore/gravel/"),
        NETHER_ORE("ore/nether/"),
        END_ORE("ore/end/"),
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
