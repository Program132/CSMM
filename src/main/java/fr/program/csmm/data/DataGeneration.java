package fr.program.csmm.data;


import fr.program.csmm.CSMM;
import fr.program.csmm.recipe.RecipeGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = CSMM.ModID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration {

    @SubscribeEvent
    public static void gatherData(final GatherDataEvent e) {
        DataGenerator generator = e.getGenerator();

        if(e.includeServer()) {
            generator.addProvider(new RecipeGenerator(generator));
        }
    }

}
