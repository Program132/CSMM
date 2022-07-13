package fr.program.csmm.data;

import fr.program.csmm.CSMM;
import fr.program.csmm.init.ModBlocks;
import fr.program.csmm.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LangGeneratorEN extends LanguageProvider {

    public LangGeneratorEN(DataGenerator gen) {
        super(gen, CSMM.ModID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Items :
        add(ModItems.COPPER_INGOT.get(), "Copper Ingot");
        add(ModItems.COPPER_STICK.get(), "Copper Stick");
        add(ModItems.COPPER_GEM.get(), "Copper Gem");
        add(ModItems.COPPER_BOOTS.get(), "Copper Boots");
        add(ModItems.COPPER_LEGGINGS.get(), "Copper Leggings");
        add(ModItems.COPPER_CHESTPLATE.get(), "Copper Chestplate");
        add(ModItems.COPPER_HELMET.get(), "Copper Helmet");
        add(ModItems.COPPER_SWORD.get(), "Copper Sword");
        add(ModItems.TRADIUM_INGOT.get(), "Tradium Ingot");
        add(ModItems.FIRESTONE.get(), "Firestone");
        add(ModItems.FIRESTONE_SWORD.get(), "Firestone Sword");
        add(ModItems.FIRESTONE_PICKAXE.get(), "Firestone Pickaxe");
        add(ModItems.FIRESTONE_SHOVEL.get(), "Firestone Shovel");
        add(ModItems.FIRESTONE_AXE.get(), "Firestone Axe");
        add(ModItems.FIRESTONE_HOE.get(), "Firestone Hoe");
        add(ModItems.BAPPLE.get(), "Bapple");


        // Blocks :
        add(ModBlocks.BLACK_DIAMOND_BLOCK.get(), "Black Diamond Block");
        add(ModBlocks.RED_EMERAULD_BLOCK.get(), "Red Emerald Block");
        add(ModBlocks.COPPER_ORE.get(), "Copper Ore");
        add(ModBlocks.TRADIUM_ORE.get(), "Tradium Ore");
        add(ModBlocks.FIRESTONE_BLOCK.get(), "Firestone Block");
        add(ModBlocks.RED_EMERAULD_BUTTON.get(), "Red Emerald Button");
        add(ModBlocks.RED_EMERAULD_DOOR.get(), "Red Emerald Door");
        add(ModBlocks.RED_EMERAULD_FENCE.get(), "Red Emerald Fence");
        add(ModBlocks.RED_EMERAULD_FENCE_GATE.get(), "Red Emerald Fence Gate");
        add(ModBlocks.RED_EMERAULD_PRESSURE_PLATE.get(), "Red Emerald Pressure Plate");
        add(ModBlocks.RED_EMERAULD_SLAB.get(), "Red Emerald Slab");
        add(ModBlocks.RED_EMERAULD_STAIRS.get(), "Red Emerald Stairs");
        add(ModBlocks.RED_EMERAULD_TRAPDOOR.get(), "Red Emerald Trapdoor");
    }
}
