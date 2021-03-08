package fr.alasdiablo.janoeo.foundation.config.json;

import com.google.gson.JsonObject;
import fr.alasdiablo.diolib.config.json.JsonConfig;

public class OreConfig extends JsonConfig {

    private int size;
    private int count;
    private int heightTop;
    private int heightBottom;
    private boolean enable;
    private final String name;

    public OreConfig(String name, int size, int count, int heightBottom, int heightTop, boolean enable) {
        this.size = size;
        this.count = count;
        this.heightBottom = heightBottom;
        this.heightTop = heightTop;
        this.name = name;
    }

    @Override
    protected void read(JsonObject json) {
        this.size = json.get("size").getAsInt();
        this.count = json.get("count").getAsInt();
        this.heightBottom = json.get("height_bottom").getAsInt();
        this.heightTop = json.get("height_top").getAsInt();
        this.enable = json.get("enable").getAsBoolean();
    }

    @Override
    protected JsonObject write() {
        final JsonObject json = new JsonObject();
        json.addProperty("size", this.size);
        json.addProperty("count", this.count);
        json.addProperty("height_bottom", this.heightBottom);
        json.addProperty("height_top", this.heightTop);
        json.addProperty("enable", this.enable);
        return json;
    }

    @Override
    protected String getName() {
        return this.name;
    }
}
