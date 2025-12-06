package com.f708.realisticforging.registry;

import com.f708.realisticforging.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class FModItems {

    public static <T extends Item>Supplier<T> register(String name, Supplier<T> item){
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(
                Constants.MOD_ID, name
        ), item.get());
        return item;
    }

    public static void initialize(){}
}
