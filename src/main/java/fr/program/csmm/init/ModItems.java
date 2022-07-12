package fr.program.csmm.init;

import fr.program.csmm.CSMM;
import fr.program.csmm.custom.Firestone;
import fr.program.csmm.utils.CustomArmorMaterials;
import fr.program.csmm.utils.CustomItemTiers;
import fr.program.csmm.utils.ModItemGroups;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CSMM.ModID);


    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroups.CSMM_TAB)));

    public static final RegistryObject<Item> COPPER_GEM = ITEMS.register("copper_gem",
            () -> new Item(new Item.Properties().tab(ModItemGroups.CSMM_TAB)));
    public static final RegistryObject<Item> COPPER_STICK = ITEMS.register("copper_stick",
            () -> new Item(new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(CustomItemTiers.COPPER, 8, -2.4f, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));


    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(CustomArmorMaterials.COPPER_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(CustomArmorMaterials.COPPER_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(CustomArmorMaterials.COPPER_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(CustomArmorMaterials.COPPER_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));


    public static final RegistryObject<Item> FIRESTONE = ITEMS.register("firestone",
            () -> new Firestone(new Item.Properties().tab(ModItemGroups.CSMM_TAB).stacksTo(1).durability(8)));

    public static final RegistryObject<Item> TRADIUM_INGOT = ITEMS.register("tradium_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroups.CSMM_TAB)));



    public static final RegistryObject<Item> FIRESTONE_SWORD = ITEMS.register("firestone_sword",
            () -> new SwordItem(CustomItemTiers.FIRESTONE,  0, 2f, new Item.Properties().stacksTo(1).tab(ModItemGroups.CSMM_TAB)));

    public static final RegistryObject<Item> FIRESTONE_PICKAXE = ITEMS.register("firestone_pickaxe",
            () -> new PickaxeItem(CustomItemTiers.FIRESTONE,  0, -1f, new Item.Properties().stacksTo(1).tab(ModItemGroups.CSMM_TAB)));

    public static final RegistryObject<Item> FIRESTONE_SHOVEL = ITEMS.register("firestone_shovel",
            () -> new ShovelItem(CustomItemTiers.FIRESTONE,  1, -1f, new Item.Properties().stacksTo(1).tab(ModItemGroups.CSMM_TAB)));

    public static final RegistryObject<Item> FIRESTONE_AXE = ITEMS.register("firestone_axe",
            () -> new AxeItem(CustomItemTiers.FIRESTONE,  2, -4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.CSMM_TAB)));

    public static final RegistryObject<Item> FIRESTONE_HOE = ITEMS.register("firestone_hoe",
            () -> new HoeItem(CustomItemTiers.FIRESTONE,  -4, 3f, new Item.Properties().stacksTo(1).tab(ModItemGroups.CSMM_TAB)));



    public static final  RegistryObject<Item> BAPPLE = ITEMS.register("bapple", () -> new Item(new Item.Properties()
            .tab(ModItemGroups.CSMM_TAB)
            .food(new Food.Builder().nutrition(7).saturationMod(0.85F).alwaysEat().effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 20*15, 0), 1.0f).build()))
            {
                @Override
                public UseAction getUseAnimation(ItemStack p_77661_1_) {
                    return UseAction.DRINK;
                }
            }

    );
}
