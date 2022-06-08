package fr.alasdiablo.janoeo.foundation.resource;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public enum ResourceType {
    StoneOre("", "ore"),
    TinyStoneOre("tiny", "ore"),
    DeepSlate("deepslate", "ore"),
    TinyDeepSlate("deepslate", "ore"),
    NetherOre("nether", "ore"),
    GravelOre("gravel", "ore"),
    RawMaterialBlock("raw", "block"),
    RawMaterialItem("raw", ""),
    Ingot("", "ingot"),
    Nugget("", "nugget"),
    Dust("", "dust"),
    Gear("", "gear"),
    Rod("", "rod");

    private final String prefix;
    private final String suffix;

    ResourceType(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    @Contract("_ -> new")
    public @NotNull String format(String name) {
        return String.join("_", prefix, name, suffix);
    }
}
