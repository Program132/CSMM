package fr.program.csmm;

import fr.program.csmm.init.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CSMM.ModID)
public class CSMM {
    public static final String ModID = "csmm";

    public CSMM() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModTileEntities.TILE_ENTITIES.register(bus);
    }

    private void setup(FMLCommonSetupEvent event) {
        ModFeatures features = new ModFeatures();
        features.init();
        MinecraftForge.EVENT_BUS.register(features);
    }

    private void clientSetup(FMLClientSetupEvent event) {
        IEventBus bus = MinecraftForge.EVENT_BUS;
        ModKeybindings.register();
        bus.addListener(ModKeybindings::onKeyPress);
    }
}