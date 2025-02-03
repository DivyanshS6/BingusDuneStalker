package net.ImmenseJaguar.Bingus.item;

import net.ImmenseJaguar.Bingus.Bingus;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Bingus.MODID);

    public static final DeferredItem<Item> BINGUSTOOTH = ITEMS.register("bingustooth",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_TRIFILIUM = ITEMS.register("raw_trifilium",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TRIFILIUM_INGOT = ITEMS.register("trifilium_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
