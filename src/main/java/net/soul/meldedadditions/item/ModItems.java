package net.soul.meldedadditions.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.soul.meldedadditions.MeldedAdditions;
import net.soul.meldedadditions.item.custom.WaitlistItem;
import net.soul.meldedadditions.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MeldedAdditions.MOD_ID);

    public static final RegistryObject <Item> PYROTIN = ITEMS.register("pyrotin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject <Item> TERRACOR = ITEMS.register("terracor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject <Item> AERILIUM = ITEMS.register("aerilium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject <Item> AQUIUM = ITEMS.register("aquium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject <Item> FIRETABLET = ITEMS.register("firetablet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject <Item> WATERTABLET = ITEMS.register("watertablet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject <Item> AIRTABLET = ITEMS.register("airtablet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject <Item> EARTHTABLET = ITEMS.register("earthtablet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject <Item> BLANKTABLET = ITEMS.register("blanktablet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject <Item> WAITLIST = ITEMS.register("waitlist",
            () -> new WaitlistItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject <Item> STENCILDISC = ITEMS.register("stencildisc",
            () -> new RecordItem(6, ModSounds.JOJO_STENCIL,new Item.Properties().stacksTo(1),2565));

    public static final RegistryObject <Item> SUNRISEDISC = ITEMS.register("sunrisedisc",
            () -> new RecordItem(6, ModSounds.JOJO_SUNRISE,new Item.Properties().stacksTo(1),3845));
    public static void register(IEventBus eventBus){ITEMS.register(eventBus);
    }
}
