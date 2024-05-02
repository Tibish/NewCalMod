package fr.tibish.newcalmod;

import fr.tibish.newcalmod.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = newcalmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeTabs {
    public static CreativeModeTab NEWCAL_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        NEWCAL_TAB = event.registerCreativeModeTab(new ResourceLocation(newcalmod.MODID,
                        "newcaltabs"),
                builder -> builder.icon(() -> new ItemStack(ModItems.SABRE_DABATTIS.get()))
                        .title(Component.literal("NewCal Mod")));
    }

}
