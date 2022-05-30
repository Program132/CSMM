package fr.program.csmm.utils;

import fr.program.csmm.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {

    public static final ItemGroup CSMM_TAB = new ItemGroup("csmm") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COPPER_GEM.get());
        }
    };

}
