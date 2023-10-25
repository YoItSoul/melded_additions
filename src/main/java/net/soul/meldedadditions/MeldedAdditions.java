package net.soul.meldedadditions;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.soul.meldedadditions.block.ModBlocks;
import net.soul.meldedadditions.item.ModCreativeModeTabs;
import net.soul.meldedadditions.item.ModItems;
import net.soul.meldedadditions.sound.ModSounds;
import org.slf4j.Logger;

@Mod(MeldedAdditions.MOD_ID)
public class MeldedAdditions {
    public static final String MOD_ID = "meldedadditions";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MeldedAdditions() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModSounds.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Your common setup code goes here.
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    if(event.getTabKey()== CreativeModeTabs.INGREDIENTS){
        event.accept(ModItems.PYROTIN);
        event.accept(ModItems.AQUIUM);
        event.accept(ModItems.TERRACOR);
        event.accept(ModItems.AERILIUM);
        event.accept(ModItems.BLANKTABLET);
        event.accept(ModItems.FIRETABLET);
        event.accept(ModItems.WATERTABLET);
        event.accept(ModItems.AIRTABLET);
        event.accept(ModItems.EARTHTABLET);

    }
    else if (event.getTabKey()== CreativeModeTabs.TOOLS_AND_UTILITIES) {
        event.accept(ModItems.STENCILDISC);
        event.accept(ModItems.SUNRISEDISC);
        event.accept(ModItems.WAITLIST);


    }
    else if (event.getTabKey()== CreativeModeTabs.BUILDING_BLOCKS) {
        event.accept(ModBlocks.PYROTIN_BLOCK);
        event.accept(ModBlocks.AQUIUM_BLOCK);
        event.accept(ModBlocks.TERRACOR_BLOCK);
        event.accept(ModBlocks.AERILIUM_BLOCK);
    }}



    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Server starting event code.
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Client setup event code.
        }
    }
}
