package com.f708.realisticforging.platform;

import com.f708.realisticforging.platform.services.IPlatformHelper;
import com.f708.realisticforging.registry.FModItems;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public <T extends Item> Supplier<T> registerItem(String name, Supplier<T> supplier) {
        FModItems.register(name, supplier);
        return supplier;
    }
}
