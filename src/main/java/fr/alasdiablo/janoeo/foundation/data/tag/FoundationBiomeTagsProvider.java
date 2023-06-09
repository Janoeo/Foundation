package fr.alasdiablo.janoeo.foundation.data.tag;

import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.init.FoundationTags;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

@MethodsReturnNonnullByDefault
@SuppressWarnings("unchecked")
public class FoundationBiomeTagsProvider extends BiomeTagsProvider {

    public FoundationBiomeTagsProvider(
            PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider, @Nullable ExistingFileHelper existingFileHelper
    ) {
        super(pOutput, pProvider, Foundation.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider pProvider) {
        this.tag(FoundationTags.Biomes.HAS_GRAVEL).addTags(
                BiomeTags.IS_NETHER,
                BiomeTags.IS_OVERWORLD
        );
    }

    @Override
    public String getName() {
        return "Janoeo Foundation Biomes Tags";
    }
}
