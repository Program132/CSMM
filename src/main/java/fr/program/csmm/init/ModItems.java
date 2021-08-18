package fr.program.csmm.init;

import fr.program.csmm.CSMM;
import fr.program.csmm.utils.CustomArmorMaterials;
import fr.program.csmm.utils.CustomItemTiers;
import fr.program.csmm.utils.ModItemGroups;
import javafx.scene.effect.Effect;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CSMM.ModID);

    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().tab(ModItemGroups.CSMM_TAB)));
    public static final RegistryObject<Item> COPPER_STICK = ITEMS.register("copper_stick", () -> new Item(new Item.Properties().tab(ModItemGroups.CSMM_TAB).stacksTo(1)));

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(CustomItemTiers.COPPER, 2, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(CustomItemTiers.COPPER, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(CustomItemTiers.COPPER, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(CustomItemTiers.COPPER, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));


    public static final RegistryObject<Item> AMETHYST_GEM = ITEMS.register("amethyst_gem", () -> new Item(new Item.Properties().tab(ModItemGroups.CSMM_TAB)));

    public static final RegistryObject<Item> AMETHYST_HELEMT = ITEMS.register("amethyst_helmet", () -> new ArmorItem(CustomArmorMaterials.AMETHYST_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(CustomArmorMaterials.AMETHYST_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(CustomArmorMaterials.AMETHYST_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(CustomArmorMaterials.AMETHYST_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT)));


    public static final RegistryObject<Item> BLUE_APPLE = ITEMS.register("blue_apple", () -> new Item(new Item.Properties()
            .tab(ItemGroup.TAB_FOOD)
            .food(new Food.Builder().nutrition(7).saturationMod(0.8f).meat().effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 20*30, 1), 1.0f).build())));

    public static final RegistryObject<Item> GREEN_APPLE = ITEMS.register("green_apple", () -> new Item(new Item.Properties()
            .tab(ItemGroup.TAB_FOOD)
            .food(new Food.Builder().nutrition(10).alwaysEat().saturationMod(0.8f).effect(() -> new EffectInstance(Effects.DAMAGE_BOOST, 20*15, 1), 0.5f).build())));

}
