package fr.alasdiablo.janoeo.foundation.resource;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public enum ResourceType {
    StoneOre("", "ore", true),
    TinyStoneOre("tiny", "ore", true),
    DeepSlateOre("deepslate", "ore", true),
    TinyDeepSlateOre("deepslate_tiny", "ore", true),
    NetherOre("nether", "ore", true),
    GravelOre("gravel", "ore", true),
    EndOre("end", "ore", true),
    RawMaterialBlock("raw", "block"),
    StorageBlock("", "block"),
    RawMaterialItem("raw", ""),
    Ingot("", "ingot"),
    Nugget("", "nugget"),
    Dust("", "dust"),
    Gear("", "gear"),
    Rod("", "rod");

    public static final ResourceType[] ALL               = ResourceType.values();
    public static final ResourceType[] ALL_ORE_WITH_ITEM = new ResourceType[]{
            StoneOre, TinyStoneOre, DeepSlateOre, TinyDeepSlateOre, NetherOre, GravelOre, EndOre, RawMaterialBlock, StorageBlock,
            RawMaterialItem, Ingot, Nugget, Dust
    };
    public static final ResourceType[] ITEMS             = new ResourceType[]{
            Dust, Nugget, Ingot, RawMaterialItem, Rod, Gear
    };
    public static final ResourceType[] BLOCKS            = new ResourceType[]{
            StoneOre, TinyStoneOre, DeepSlateOre, TinyDeepSlateOre, NetherOre, GravelOre, EndOre, RawMaterialBlock, StorageBlock
    };

    private final String  prefix;
    private final String  suffix;
    private final boolean isOre;

    ResourceType(String prefix, String suffix) {
        this(prefix, suffix, false);
    }

    ResourceType(String prefix, String suffix, boolean isOre) {
        this.prefix = prefix;
        this.suffix = suffix;
        this.isOre  = isOre;
    }

    @Contract("_ -> new")
    public @NotNull String format(String name) {
        if (this.prefix.equals("") && this.suffix.equals(""))
            return String.join("_", name);

        if (this.prefix.equals(""))
            return String.join("_", name, this.suffix);

        if (this.suffix.equals(""))
            return String.join("_", this.prefix, name);

        return String.join("_", this.prefix, name, this.suffix);
    }

    public boolean isOre() {
        return this.isOre;
    }
}
