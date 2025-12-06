package com.f708.realisticforging.registry;

import com.f708.realisticforging.Constants;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Constants.MOD_ID);


    public static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> itemSupplier){
        ITEMS.registerItem(
                name,
                properties1 -> itemSupplier.get()
        );
        return itemSupplier;
    }

    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }


}
