package com.f708.realisticforging;


import com.f708.realisticforging.registry.NModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class NeoRealisticForging {

    public NeoRealisticForging(IEventBus eventBus) {

        CommonClass.init();
        NModItems.register(eventBus);

    }
}