package fr.alasdiablo.janoeo.foundation.config;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import fr.alasdiablo.diolib.config.json.JsonConfig;

public class OreConfig extends JsonConfig {

    private final String  name;
    private       String  placement;
    private       boolean enable;
    private       int     size;
    private       int     count;
    private       int     bottom;
    private       int     top;

    public OreConfig(String name, boolean enable) {
        this.name      = name;
        this.enable    = enable;
        this.placement = "";
        this.size      = 0;
        this.count     = 0;
        this.bottom    = 0;
        this.top       = 0;
    }

    public OreConfig placementTriangle(int size, int bottom, int top) {
        this.placement = "triangle";
        this.size      = size;
        this.bottom    = bottom;
        this.top       = top;
        return this;
    }

    public OreConfig placementUniform(int size, int bottom, int top, int count) {
        this.placement = "uniform";
        this.size      = size;
        this.bottom    = bottom;
        this.top       = top;
        this.count     = count;
        return this;
    }

    @Override
    protected void read(final JsonObject json) {
        JsonElement type      = json.get("type");
        JsonElement enable    = json.get("enable");
        JsonObject  placement = json.get("placement").getAsJsonObject();
        this.placement = type.getAsString();
        this.enable    = enable.getAsBoolean();
        switch (this.placement) {
            case "triangle", "uniform" -> {
                this.size   = placement.get("size").getAsInt();
                this.bottom = placement.get("bottom").getAsInt();
                this.top    = placement.get("top").getAsInt();
                this.count  = placement.get("count").getAsInt();
            }
            default -> throw new IllegalArgumentException("Unknown placement type");
        }
    }

    @Override
    protected JsonObject write() {
        final JsonObject json = new JsonObject();
        json.addProperty("__comment", "Type: ['triangle', 'uniform']");
        json.addProperty("type", this.placement);
        json.addProperty("enable", this.enable);
        final JsonObject placement = new JsonObject();
        switch (this.placement) {
            case "triangle", "uniform" -> {
                placement.addProperty("size", this.size);
                placement.addProperty("bottom", this.bottom);
                placement.addProperty("top", this.top);
                placement.addProperty("count", this.count);
            }
        }
        json.add("placement", placement);
        return json;
    }

    @Override
    protected String getName() {
        return this.name;
    }

    public String name() {
        return this.name;
    }

    public String getPlacement() {
        return placement;
    }

    public boolean isEnable() {
        return enable;
    }

    public int getSize() {
        return size;
    }

    public int getCount() {
        return count;
    }

    public int getBottom() {
        return bottom;
    }

    public int getTop() {
        return top;
    }
}
