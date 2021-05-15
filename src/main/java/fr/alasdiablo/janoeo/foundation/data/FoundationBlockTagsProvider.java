package fr.alasdiablo.janoeo.foundation.data;

import fr.alasdiablo.janoeo.foundation.Registries;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class FoundationBlockTagsProvider extends BlockTagsProvider {
    public FoundationBlockTagsProvider(DataGenerator generatorIn, @Nullable ExistingFileHelper existingFileHelper) {
        super(generatorIn, Registries.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
    }

    @Override
    public String getName() {
        return "Janoeo Block Tags";
    }
}
