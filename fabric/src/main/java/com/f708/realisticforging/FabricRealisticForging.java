package com.f708.realisticforging;

import com.f708.realisticforging.registry.FModItems;
import net.fabricmc.api.ModInitializer;

public class FabricRealisticForging implements ModInitializer {
    
    @Override
    public void onInitialize() {

        FModItems.initialize();

        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
    }
}
