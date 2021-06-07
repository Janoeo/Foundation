package fr.alasdiablo.janoeo.foundation.config;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import fr.alasdiablo.diolib.config.json.JsonConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OreConfig extends JsonConfig {

    private int size;
    private List<Integer> count;
    private int heightTop;
    private int heightBottom;
    private boolean enable;
    private String countType;
    private final String name;

    public OreConfig(String name,
                     int size,
                     int count,
                     int heightBottom,
                     int heightTop,
                     boolean enable
    ) {
        this.size = size;
        this.count = Collections.singletonList(count);
        this.heightBottom = heightBottom;
        this.heightTop = heightTop;
        this.name = name;
        this.enable = enable;
        this.countType = "linear";
    }

    public OreConfig(String name,
                     int size,
                     Integer[] count,
                     int heightBottom,
                     int heightTop,
                     boolean enable
    ) {
        this.size = size;
        this.count = Arrays.asList(count);
        this.heightBottom = heightBottom;
        this.heightTop = heightTop;
        this.name = name;
        this.enable = enable;
        this.countType = "scale";
    }

    @Override
    protected void read(final JsonObject json) {
        JsonElement enable, size, countEle, countType, count, heightEle, bottom, top;

        countEle = json.get("count");
        heightEle = json.get("height");

        final JsonObject countObj = countEle.getAsJsonObject(), heightObj = heightEle.getAsJsonObject();

        enable = json.get("enable");
        size = json.get("size");
        top = heightObj.get("top");
        bottom = heightObj.get("height");
        countType = countObj.get("type");
        count = countObj.get("value");

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

        switch (countType.getAsString()) {
            case "linear": {
                if (count.isJsonArray())
                    throw new IllegalArgumentException("The parameter 'count.value' can't be an array in 'linear' type");

                int countValue = count.getAsInt();
                if (countValue >= 128 || countValue <= 0)
                    throw new IllegalArgumentException("The parameter 'count.value' is out of range!");
                else this.count = Collections.singletonList(countValue);
                break;
            }

            case "scale": {
                if (!count.isJsonArray())
                    throw new IllegalArgumentException("The parameter 'count.value' need be an array in 'scale' type");

                final List<Integer> countValue = new ArrayList<>();
                count.getAsJsonArray().iterator().forEachRemaining(jsonElement -> {
                    int intElement = jsonElement.getAsInt();
                    if (intElement >= 128 || intElement <= 0)
                        throw new IllegalArgumentException("One element of 'count.value' parameter is out of range!");
                    else countValue.add(intElement);
                });
                this.count = countValue;
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

        height.addProperty("top", this.heightTop);
        height.addProperty("bottom", this.heightBottom);

        count.addProperty("type", this.countType);
        if (this.countType.equals("linear")) count.addProperty("value", this.count.get(0));
        else {
            final JsonArray countArray = new JsonArray();
            this.count.forEach(countArray::add);
            count.add("value", countArray);
        }

        json.addProperty("enable", this.enable);
        json.addProperty("size", this.size);
        json.add("height", height);
        json.add("count", count);

        return json;
    }

    @Override
    protected String getName() {
        return this.name;
    }
}
