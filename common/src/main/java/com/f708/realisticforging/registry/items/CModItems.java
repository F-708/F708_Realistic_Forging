package com.f708.realisticforging.registry.items;

import com.f708.realisticforging.platform.Services;
import com.f708.realisticforging.registry.items.custom.SmithingHammer;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class CModItems {

    public static Supplier<SmithingHammer> FORGING_HAMMER;

    public static Supplier<Item> HOT_IRON_ORE;

    public static void register(){
        FORGING_HAMMER = registerItems("smithing_hammer", () -> new SmithingHammer(new Item.Properties()));
        HOT_IRON_ORE = registerItems("hot_iron_ore", () -> new Item(new Item.Properties()));
    }

    public static <T extends Item> Supplier<T> registerItems(String name, Supplier<T> item){
        return Services.PLATFORM.registerItem(name, item);
    }

}
