package fr.program.csmm.init;

import fr.program.csmm.CSMM;
import fr.program.csmm.guis.GuiModInfo;
        import net.minecraft.client.Minecraft;
        import net.minecraft.client.settings.KeyBinding;
        import net.minecraftforge.api.distmarker.Dist;
        import net.minecraftforge.api.distmarker.OnlyIn;
        import net.minecraftforge.client.event.InputEvent;
        import net.minecraftforge.eventbus.api.SubscribeEvent;
        import net.minecraftforge.fml.client.registry.ClientRegistry;
        import org.lwjgl.glfw.GLFW;

public class ModKeybindings {

    public static final KeyBinding TEST_KEY = new KeyBinding("key." + CSMM.ModID + ".test_key", GLFW.GLFW_KEY_G, "key.categories." + CSMM.ModID);

    public static final KeyBinding MOD_INFO = new KeyBinding("key." + CSMM.ModID + ".mod_info", GLFW.GLFW_KEY_M, "key.categories." + CSMM.ModID);

    public static void register() {
        ClientRegistry.registerKeyBinding(TEST_KEY);
        ClientRegistry.registerKeyBinding(MOD_INFO);
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onKeyPressed(InputEvent.KeyInputEvent e) {
        if (TEST_KEY.isDown()) {
            System.out.println("Salut, tu as appuyé sur la touche G !");
        } else if (MOD_INFO.isDown()) {
            Minecraft.getInstance().setScreen(new GuiModInfo());
        }
    }

}
