package net.ImmenseJaguar.Bingus.item;

import net.ImmenseJaguar.Bingus.Bingus;
import net.ImmenseJaguar.Bingus.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Bingus.MODID);


    public static final Supplier<CreativeModeTab>
            BINGUS_ITEMS_TAB = CREATIVE_MODE_TAB.register("bingus_items",
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(ModItems.BINGUSTOOTH.get()))
                    .title(Component.translatable("creativetab.bingusthedunestalker.bingus_items"))
                    .displayItems((parameters, output) -> {

                        output.accept(ModItems.BINGUSTOOTH);

                    }).build());

    public static final Supplier<CreativeModeTab>
            BINGUS_BLOCK_TAB = CREATIVE_MODE_TAB.register("bingus_blocks",
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(ModBlocks.BINGUSTOOTH_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Bingus.MODID, "bingus_items_tab"))
                    .title(Component.translatable("creativetab.bingusthedunestalker.bingus_blocks"))
                    .displayItems((parameters, output) -> {

                        output.accept(ModBlocks.BINGUSTOOTH_BLOCK);

                    }).build());


    public static void register(IEventBus eventBus) {

        CREATIVE_MODE_TAB.register(eventBus);

    }



}
