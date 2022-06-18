package fr.alasdiablo.janoeo.foundation.data.model;

import com.google.common.collect.ImmutableList;
import fr.alasdiablo.diolib.api.data.blockstate.DioBlockStateProvider;
import fr.alasdiablo.janoeo.foundation.Foundation;
import fr.alasdiablo.janoeo.foundation.resource.Resource;
import fr.alasdiablo.janoeo.foundation.resource.ResourceType;
import net.minecraft.data.DataGenerator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;

public class FoundationBlockStateProvider extends DioBlockStateProvider {
    public FoundationBlockStateProvider(DataGenerator generator) {
        super(generator, Foundation.MOD_ID);
    }

    static @NotNull @Unmodifiable List<String> getBlocksList() {
        ImmutableList.Builder<String> toReturn = new ImmutableList.Builder<>();

        for (ResourceType type: ResourceType.BLOCKS) {
            for (Resource resource: Resource.values()) {
                if (resource.has(type)) {
                    toReturn.add(resource.getName(type));
                }
            }
        }

        return toReturn.build();
    }

    @Override
    protected void registerStates() {
        getBlocksList().forEach(this::cubeAll);
    }
}
