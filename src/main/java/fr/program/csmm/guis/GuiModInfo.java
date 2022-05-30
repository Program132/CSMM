package fr.program.csmm.guis;

import com.mojang.blaze3d.matrix.MatrixStack;
import fr.program.csmm.CSMM;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;

import javax.xml.soap.Text;
import java.awt.*;

public class GuiModInfo extends Screen {
    private final ResourceLocation GUI_UI = new ResourceLocation(CSMM.ModID, "textures/gui/mod_info.png");

    private int sizeX = 400;
    private int sizeY = 256;

    private int guiTop;
    private int guiLeft;

    public GuiModInfo() {
        super(new TranslationTextComponent(CSMM.ModID + ".gui.modinfo"));
    }

    @Override
    protected void init() {
        this.guiLeft = (this.width - this.sizeX) / 2;
        this.guiTop = (this.height - this.sizeY) / 2;
        this.createGUI();
    }

    private String[] TextsGUI = {"Bienvenue dans le monde CSMM !", "N/A"};
    public boolean titleVisible = true;

    private void createGUI() {
        this.addButton(new Button(this.width / 2 - 102, this.height / 4 + 24 + -16, 204, 20, new TranslationTextComponent(CSMM.ModID + ".gui.modinfo.close"), (p_213070_1_) -> {
            this.minecraft.setScreen((Screen)null); // Dès que le bouton est cliqué !
        }));

        this.addButton(new Button(this.width / 2 - 102, this.height / 4 + 24 + -32, 204, 20, new TranslationTextComponent(CSMM.ModID + ".gui.modinfo.visibletext"), (p_213070_1_) -> {
            if (titleVisible) {
                TextsGUI[0] = "";
                titleVisible = false;
            } else {
                TextsGUI[0] = "Bienvenue dans le monde CSMM !";
                titleVisible = true;
            };
            System.out.println(TextsGUI[0]);
        }));

    }

    public void render(MatrixStack matrix, int mouseX, int mouseY, float partial) {
        drawBackground(matrix);
        super.render(matrix, mouseX, mouseY, partial);
        this.minecraft.font.draw(matrix, TextsGUI[0], guiLeft + 100, 300, Color.BLACK.getRGB());
    }

    private void drawBackground(MatrixStack matrix) {
        this.minecraft.getTextureManager().bind(GUI_UI);
        this.blit(matrix, guiLeft, guiTop, 0, 0, this.sizeX, this.sizeY, 400, 256);
    }
}
