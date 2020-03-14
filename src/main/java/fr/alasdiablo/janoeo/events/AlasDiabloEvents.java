package fr.alasdiablo.janoeo.events;

import fr.alasdiablo.janoeo.utils.Registries;
import net.minecraft.entity.item.FireworkRocketEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = Registries.MODID)
public class AlasDiabloEvents {

    @SubscribeEvent
    public static void onJoin(PlayerEvent.PlayerLoggedInEvent event) {
        PlayerEntity player = event.getPlayer();
        if (player.getName().getString().equals("AlasDiablo")) {
            World world = player.world;

            ItemStack firework = new ItemStack(Items.FIREWORK_ROCKET);
            CompoundNBT rocket = new CompoundNBT();
            CompoundNBT star = new CompoundNBT();
            CompoundNBT fireworkCompound = firework.getOrCreateTag();

            star.putIntArray("Colors", Collections.singletonList(15790320));
            star.putIntArray("FadeColors", Collections.singletonList(11743532));
            star.putBoolean("Flicker", true);
            star.putBoolean("Trail", true);
            star.putInt("Type", 1);
            rocket.putInt("Flight", 3);
            rocket.put("Explosions", Arrays.stream(new CompoundNBT[] {star}).collect(Collectors.toCollection(ListNBT::new)));
            fireworkCompound.put("Fireworks", rocket);

            world.addEntity(new FireworkRocketEntity(world, player.prevPosX, player.prevPosY, player.prevPosZ, firework));
        }
    }
}
