package fr.program.csmm.recipe;

import fr.program.csmm.CSMM;
import fr.program.csmm.init.ModBlocks;
import fr.program.csmm.init.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider {
    public RecipeGenerator(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {

        // Pour les tables de craft

        ShapedRecipeBuilder.shaped(Blocks.GRASS_BLOCK)
                .pattern(" H ")
                .pattern("THT")
                .pattern(" H ")
                .define('H', Blocks.GRASS)
                .define('T', Blocks.DIRT)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(Blocks.DIRT, Blocks.GRASS))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.COPPER_GEM.get())
                .pattern(" I ")
                .pattern("I I")
                .pattern(" I ")
                .define('I', ModItems.COPPER_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.COPPER_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.COPPER_SWORD.get())
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" C ")
                .define('I', ModItems.COPPER_GEM.get())
                .define('C', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.COPPER_GEM.get(), Items.STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.COPPER_STICK.get())
                .pattern(" G ")
                .define('G', ModItems.COPPER_GEM.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.COPPER_GEM.get()))
                .save(consumer);


        // Pour les fours

        CookingRecipeBuilder.smelting(Ingredient.of(ModItems.COPPER_GEM.get()), Items.ENCHANTED_GOLDEN_APPLE, 0.15f, 100)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.COPPER_GEM.get()))
                .save(consumer);

        CookingRecipeBuilder.cooking(Ingredient.of(ModBlocks.COPPER_ORE.get()), Items.REDSTONE, 0.2f, 150, IRecipeSerializer.SMOKING_RECIPE)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.COPPER_ORE.get()))
                .save(consumer);

        CookingRecipeBuilder.blasting(Ingredient.of(Blocks.STONE), Items.STONE_AXE, 0.5f, 120) // Les block !!!!!!
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(Blocks.STONE))
                .save(consumer);


    }
}
