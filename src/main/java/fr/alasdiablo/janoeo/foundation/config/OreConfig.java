package fr.alasdiablo.janoeo.foundation.config;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import fr.alasdiablo.diolib.config.json.JsonConfig;
import net.minecraft.util.ResourceLocation;

public class OreConfig extends JsonConfig {

    private int size;
    private int count;
    private int heightTop;
    private int heightBottom;
    private boolean enable;
    private String countType;
    private ResourceLocation replace;
    private String replaceType;
    private final String name;

    public OreConfig(String name,
                     String replaceType,
                     ResourceLocation replace,
                     int size,
                     int count,
                     int heightBottom,
                     int heightTop,
                     boolean rounded,
                     boolean enable
    ) {
        this.size = size;
        this.count = count;
        this.heightBottom = heightBottom;
        this.heightTop = heightTop;
        this.name = name;
        this.enable = enable;
        this.countType = rounded ? "rounded" : "linear";
        this.replace = replace;
        this.replaceType = replaceType;
    }

    public OreConfig(String name,
                     String replaceType,
                     ResourceLocation replace,
                     int size,
                     int heightBottom,
                     int heightTop,
                     boolean enable
    ) {
        this.size = size;
        this.count = 0;
        this.heightBottom = heightBottom;
        this.heightTop = heightTop;
        this.name = name;
        this.enable = enable;
        this.countType = "square";
        this.replace = replace;
        this.replaceType = replaceType;
    }

    public int getSize() {
        return size;
    }

    public int getCount() {
        return count;
    }

    public int getHeightTop() {
        return heightTop;
    }

    public int getHeightBottom() {
        return heightBottom;
    }

    public boolean isEnable() {
        return enable;
    }

    public String getCountType() {
        return countType;
    }

    public ResourceLocation getReplace() {
        return replace;
    }

    public String getReplaceType() {
        return replaceType;
    }

    @Override
    protected void read(final JsonObject json) {
        JsonElement enable, size, countEle, countType, count, heightEle, bottom, top, replaceEle, replace, replaceType;

        countEle = json.get("count");
        heightEle = json.get("height");
        replaceEle = json.get("replace");

        final JsonObject countObj = countEle.getAsJsonObject(),
                heightObj = heightEle.getAsJsonObject(),
                replaceObj = replaceEle.getAsJsonObject();

        enable = json.get("enable");
        size = json.get("size");
        top = heightObj.get("top");
        bottom = heightObj.get("bottom");
        countType = countObj.get("type");
        replaceType = replaceObj.get("type");
        replace = replaceObj.get("name");

        this.replaceType = replaceType.getAsString();
        this.replace = new ResourceLocation(replace.getAsString());

        this.enable = enable.getAsBoolean();

        int sizeValue = size.getAsInt();
        if (sizeValue >= 128 || sizeValue <= 0)
            throw new IllegalArgumentException("The parameter 'size' is out of range!");
        else this.size = sizeValue;

        int topValue = top.getAsInt();
        int bottomValue = bottom.getAsInt();

        if (topValue < bottomValue)
            throw new IllegalArgumentException("The parameter 'height.top' can't be lower that 'height.bottom'!");

        if (topValue >= 255 || topValue <= -30)
            throw new IllegalArgumentException("The parameter 'height.top' is out of range!");
        else this.heightTop = topValue;

        if (bottomValue <= -30)
            throw new IllegalArgumentException("The parameter 'height.bottom' is out of range!");
        else this.heightBottom = bottomValue;

        String countTypeValue = countType.getAsString();
        switch (countTypeValue) {
            case "linear": {
                this.countType = "linear";
                count = countObj.get("value");
                if (count.isJsonArray())
                    throw new IllegalArgumentException("The parameter 'count.value' can't be an array in 'linear' type");

                int countValue = count.getAsInt();
                if (countValue >= 128 || countValue <= 0)
                    throw new IllegalArgumentException("The parameter 'count.value' is out of range!");
                else this.count = countValue;
                break;
            }

            case "scale": {
                this.countType = "scale";
                break;
            }

            default:
                throw new IllegalArgumentException("The parameter 'count.type' need to be 'linear' or 'scale'!");
        }
    }

    @Override
    protected JsonObject write() {
        final JsonObject json = new JsonObject();
        final JsonObject height = new JsonObject();
        final JsonObject count = new JsonObject();
        final JsonObject replace = new JsonObject();

        height.addProperty("top", this.heightTop);
        height.addProperty("bottom", this.heightBottom);

        count.addProperty("type", this.countType);
        if (this.countType.equals("linear")) count.addProperty("value", this.count);

        replace.addProperty("type", this.replaceType);
        replace.addProperty("name", this.replace.toString());

        json.addProperty("enable", this.enable);
        json.addProperty("size", this.size);
        json.add("height", height);
        json.add("count", count);
        json.add("replace", replace);

        return json;
    }

    @Override
    protected String getName() {
        return this.name;
    }
}
