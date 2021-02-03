package fr.alasdiablo.janoeo.tags;

import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;

public class BlocksTags {


    private static ITag.INamedTag<Block> forgeTag(String path) {
        return tag("forge", path);
    }

    private static ITag.INamedTag<Block> tag(String namespace, String path) {
        return BlockTags.makeWrapperTag(new ResourceLocation(namespace, path).toString());
    }
}
