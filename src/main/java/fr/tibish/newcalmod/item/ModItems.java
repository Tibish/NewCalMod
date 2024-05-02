package fr.tibish.newcalmod.item;

import fr.tibish.newcalmod.newcalmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, newcalmod.MODID);

    public static final RegistryObject<Item> SABRE_DABATTIS = ITEMS.register("sabre_dabattis",
            ()-> new Item(new Item.Properties()));


    //Nickel Items
    public static final RegistryObject<Item> NICKEL = ITEMS.register("nickel",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
            ()-> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
