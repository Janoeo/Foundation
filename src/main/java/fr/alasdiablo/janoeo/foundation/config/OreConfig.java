package fr.alasdiablo.janoeo.foundation.config;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import fr.alasdiablo.diolib.config.json.JsonConfig;

public class OreConfig extends JsonConfig {

    private final String name;
    private String placement;
    private boolean enable;
    private int size;
    private int range;
    private int count;
    private int baseline;
    private int spread;
    private int bottomOffset;
    private int topOffset;
    private int maximum;

    public OreConfig(String name, boolean enable) {
        this.name = name;
        this.enable = enable;
        this.placement = "";
        this.size = 0;
        this.range = 0;
        this.count = 0;
        this.baseline = 0;
        this.spread = 0;
        this.bottomOffset = 0;
        this.topOffset = 0;
        this.maximum = 0;
    }

    public OreConfig placementRange(int size, int range, int count) {
        this.placement = "range";
        this.size = size;
        this.range = range;
        this.count = count;
        return this;
    }

    public OreConfig placementDepthAverage(int size, int baseline, int spread) {
        this.placement = "depth_average";
        this.size = size;
        this.baseline = baseline;
        this.spread = spread;
        return this;
    }

    public OreConfig placementTopSolidRange(int size, int bottomOffset, int topOffset, int maximum, int count) {
        this.placement = "top_solid_range";
        this.size = size;
        this.bottomOffset = bottomOffset;
        this.topOffset = topOffset;
        this.maximum = maximum;
        this.count = count;
        return this;
    }

    @Override
    protected void read(final JsonObject json) {
        JsonElement type = json.get("type");
        JsonElement enable = json.get("enable");
        JsonObject placement = json.get("placement").getAsJsonObject();
        this.placement = type.getAsString();
        this.enable = enable.getAsBoolean();
        switch (this.placement) {
            case "range": {
                this.size = placement.get("size").getAsInt();
                this.range = placement.get("range").getAsInt();
                this.count = placement.get("count").getAsInt();
                break;
            }
            case "depth_average": {
                this.size = placement.get("size").getAsInt();
                this.baseline = placement.get("baseline").getAsInt();
                this.spread = placement.get("spread").getAsInt();
                break;
            }
            case "top_solid_range": {
                this.size = placement.get("size").getAsInt();
                this.bottomOffset = placement.get("bottomOffset").getAsInt();
                this.topOffset = placement.get("topOffset").getAsInt();
                this.maximum = placement.get("maximum").getAsInt();
                this.count = placement.get("count").getAsInt();
                break;
            }
            default:
                throw new IllegalArgumentException("Unknown placement type");
        }
    }

    @Override
    protected JsonObject write() {
        final JsonObject json = new JsonObject();
        json.addProperty("type", this.placement);
        json.addProperty("enable", this.enable);
        final JsonObject placement = new JsonObject();
        switch (this.placement) {
            case "range": {
                placement.addProperty("size", this.size);
                placement.addProperty("range", this.range);
                placement.addProperty("count", this.count);
                break;
            }
            case "depth_average": {
                placement.addProperty("size", this.size);
                placement.addProperty("baseline", this.baseline);
                placement.addProperty("spread", this.spread);
                break;
            }
            case "top_solid_range": {
                placement.addProperty("size", this.size);
                placement.addProperty("bottomOffset", this.bottomOffset);
                placement.addProperty("topOffset", this.topOffset);
                placement.addProperty("maximum", this.maximum);
                placement.addProperty("count", this.count);
                break;
            }
        }
        json.add("placement", placement);
        return json;
    }

    @Override
    protected String getName() {
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

    public int getRange() {
        return range;
    }

    public int getCount() {
        return count;
    }

    public int getBaseline() {
        return baseline;
    }

    public int getSpread() {
        return spread;
    }

    public int getBottomOffset() {
        return bottomOffset;
    }

    public int getTopOffset() {
        return topOffset;
    }

    public int getMaximum() {
        return maximum;
    }
}
