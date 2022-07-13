package fr.program.csmm.data;

import fr.program.csmm.CSMM;
import fr.program.csmm.init.ModBlocks;
import fr.program.csmm.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LangGeneratorFR extends LanguageProvider {

    public LangGeneratorFR(DataGenerator gen) {
        super(gen, CSMM.ModID, "fr_fr");
    }

    @Override
    protected void addTranslations() {
        // Items :
        add(ModItems.COPPER_INGOT.get(), "Lingot en cuivre");
        add(ModItems.COPPER_STICK.get(), "Baton en cuivre");
        add(ModItems.COPPER_GEM.get(), "Gem en cuivre");
        add(ModItems.COPPER_BOOTS.get(), "Bottes en cuivre");
        add(ModItems.COPPER_LEGGINGS.get(), "Pantalon en cuivre");
        add(ModItems.COPPER_CHESTPLATE.get(), "Plastron en cuivre");
        add(ModItems.COPPER_HELMET.get(), "Casque en cuivre");
        add(ModItems.COPPER_SWORD.get(), "Epée en cuivre");
        add(ModItems.TRADIUM_INGOT.get(), "Lingot en tradium");
        add(ModItems.FIRESTONE.get(), "Firestone");
        add(ModItems.FIRESTONE_SWORD.get(), "Epée en firestone");
        add(ModItems.FIRESTONE_PICKAXE.get(), "Pioche en firestone");
        add(ModItems.FIRESTONE_SHOVEL.get(), "Pelle en firestone");
        add(ModItems.FIRESTONE_AXE.get(), "Hache en firestone");
        add(ModItems.FIRESTONE_HOE.get(), "Houe en firestone");
        add(ModItems.BAPPLE.get(), "Bapple");


        // Blocks :
        add(ModBlocks.BLACK_DIAMOND_BLOCK.get(), "Bloc de diamant noir");
        add(ModBlocks.RED_EMERAULD_BLOCK.get(), "Bloc d'émeraude rouge.");
        add(ModBlocks.COPPER_ORE.get(), "Minerai de cuivre");
        add(ModBlocks.TRADIUM_ORE.get(), "Minerai de tradium");
        add(ModBlocks.FIRESTONE_BLOCK.get(), "Bloc de firestone");
        add(ModBlocks.RED_EMERAULD_BUTTON.get(), "Bouton en émeraude rouge");
        add(ModBlocks.RED_EMERAULD_DOOR.get(), "Porte en émeraude rouge");
        add(ModBlocks.RED_EMERAULD_FENCE.get(), "Barrière en émeraude rouge");
        add(ModBlocks.RED_EMERAULD_FENCE_GATE.get(), "Portail en émeraude rouge");
        add(ModBlocks.RED_EMERAULD_PRESSURE_PLATE.get(), "Plaque de pression en émeraude rouge");
        add(ModBlocks.RED_EMERAULD_SLAB.get(), "Dalle en émeraude rouge");
        add(ModBlocks.RED_EMERAULD_STAIRS.get(), "Escalier en émeraude rouge");
        add(ModBlocks.RED_EMERAULD_TRAPDOOR.get(), "Trappe en émeraude rouge");
    }

}
