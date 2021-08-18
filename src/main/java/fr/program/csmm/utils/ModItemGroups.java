package fr.program.csmm.utils;

import fr.program.csmm.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ModItemGroups {

    public static final ItemGroup CSMM_TAB = new ItemGroup("csmmtab") {

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AMETHYST_GEM.get());
        }
    };

}