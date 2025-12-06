package com.f708.realisticforging.platform.services;

import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public interface IPlatformHelper {

    String getPlatformName();

    boolean isModLoaded(String modId);

    boolean isDevelopmentEnvironment();

    default String getEnvironmentName() {
        return isDevelopmentEnvironment() ? "development" : "production";
    }

    Supplier<Item> registerItem(Supplier<Item> supplier);
}