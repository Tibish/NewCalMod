package fr.tibish.newcalmod;

import com.mojang.logging.LogUtils;
import fr.tibish.newcalmod.block.ModBlocks;
import fr.tibish.newcalmod.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(newcalmod.MODID)
public class newcalmod
{
    public static final String MODID = "newcalmod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public  newcalmod()
    {
        IEventBus modEventBus= FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event){

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event){
        if (event.getTab() == CreativeTabs.NEWCAL_TAB){
            event.accept(ModItems.SABRE_DABATTIS);
            event.accept(ModItems.NICKEL);
            event.accept(ModItems.RAW_NICKEL);
            event.accept(ModBlocks.NICKEL_BLOCK);
            event.accept(ModBlocks.NICKEL_ORE);
            event.accept(ModBlocks.DEEPSLATE_NICKEL_ORE);
            event.accept(ModBlocks.NETHER_NICKEL_ORE);
            event.accept(ModBlocks.END_NICKEL_ORE);
        }

        if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ModBlocks.NICKEL_BLOCK);
        }

        if (event.getTab() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.RAW_NICKEL);
            event.accept(ModItems.NICKEL);
        }

        if (event.getTab() == CreativeModeTabs.COMBAT){
            event.accept(ModItems.SABRE_DABATTIS);
        }


        if (event.getTab() == CreativeModeTabs.NATURAL_BLOCKS){
            event.accept(ModBlocks.NICKEL_ORE);
            event.accept(ModBlocks.DEEPSLATE_NICKEL_ORE);
            event.accept(ModBlocks.NETHER_NICKEL_ORE);
            event.accept(ModBlocks.END_NICKEL_ORE);
        }
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents{
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){
        }
    }
}
