package fr.alasdiablo.janoeo.foundation.data.model;

import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.init.FoundationItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class FoundationItemModelProvider extends ItemModelProvider {

    private static final ResourceLocation GENERATED = new ResourceLocation("item/generated");

    public FoundationItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Foundation.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        FoundationItems.DUSTS.forEach((resource, item) -> this.withExistingParent(item.getId().getPath(), GENERATED)
                .texture("layer0", new ResourceLocation(Foundation.MOD_ID, "item/dust/" + item.getId().getPath())));

        FoundationItems.NUGGETS.forEach((resource, item) -> this.withExistingParent(item.getId().getPath(), GENERATED)
                .texture("layer0", new ResourceLocation(Foundation.MOD_ID, "item/nugget/" + item.getId().getPath())));

        FoundationItems.INGOTS.forEach((resource, item) -> this.withExistingParent(item.getId().getPath(), GENERATED)
                .texture("layer0", new ResourceLocation(Foundation.MOD_ID, "item/ingot/" + item.getId().getPath())));

        FoundationItems.RAWS.forEach((resource, item) -> this.withExistingParent(item.getId().getPath(), GENERATED)
                .texture("layer0", new ResourceLocation(Foundation.MOD_ID, "item/raw/" + item.getId().getPath())));

        FoundationItems.GEARS.forEach((resource, item) -> this.withExistingParent(item.getId().getPath(), GENERATED)
                .texture("layer0", new ResourceLocation(Foundation.MOD_ID, "item/gear/" + item.getId().getPath())));

        FoundationItems.RODS.forEach((resource, item) -> this.withExistingParent(item.getId().getPath(), GENERATED)
                .texture("layer0", new ResourceLocation(Foundation.MOD_ID, "item/rod/" + item.getId().getPath())));

        FoundationBlockStateProvider.getBlocksList().forEach(block -> withExistingParent(block, new ResourceLocation(Foundation.MOD_ID, "block/" + block)));
    }
}
