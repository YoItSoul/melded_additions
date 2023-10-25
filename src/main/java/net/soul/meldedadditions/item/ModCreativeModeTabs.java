package net.soul.meldedadditions.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.soul.meldedadditions.MeldedAdditions;
import net.soul.meldedadditions.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS=
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MeldedAdditions.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MELDEDADDITIONS_TAB = CREATIVE_MODE_TABS.register("meldedadditions_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PYROTIN.get()))
                    .title(Component.translatable("creativetab.meldedadditions_tab"))
                    .displayItems((p_270258_, p_259752_) -> {
                        // items
                        p_259752_.accept(ModItems.PYROTIN.get());
                        p_259752_.accept(ModItems.AQUIUM.get());
                        p_259752_.accept(ModItems.AERILIUM.get());
                        p_259752_.accept(ModItems.TERRACOR.get());
                        p_259752_.accept(ModItems.BLANKTABLET.get());
                        p_259752_.accept(ModItems.EARTHTABLET.get());
                        p_259752_.accept(ModItems.WATERTABLET.get());
                        p_259752_.accept(ModItems.AIRTABLET.get());
                        p_259752_.accept(ModItems.FIRETABLET.get());
                        p_259752_.accept(ModItems.SUNRISEDISC.get());
                        p_259752_.accept(ModItems.STENCILDISC.get());
                        p_259752_.accept(ModItems.WAITLIST.get());
                        // blocks
                        p_259752_.accept(ModBlocks.PYROTIN_BLOCK.get());
                        p_259752_.accept(ModBlocks.AQUIUM_BLOCK.get());
                        p_259752_.accept(ModBlocks.AERILIUM_BLOCK.get());
                        p_259752_.accept(ModBlocks.TERRACOR_BLOCK.get());


                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
