package fr.alasdiablo.janoeo.events;

import fr.alasdiablo.janoeo.utils.Registries;
import net.minecraft.entity.item.FireworkRocketEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = Registries.MODID)
public class AlasDiabloEvents {

    @SubscribeEvent()
    public static void onJoin(PlayerEvent.PlayerLoggedInEvent event) {
        PlayerEntity player = event.getPlayer();
        if (player.getName().getString().equals("AlasDiablo")) {
            World world = player.world;
            world.addEntity(new FireworkRocketEntity(world, player.posX, player.posY, player.posZ, new ItemStack(Items.FIREWORK_ROCKET)));
        }
    }
}
