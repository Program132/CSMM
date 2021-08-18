package fr.program.csmm.init;

import fr.program.csmm.CSMM;
import fr.program.csmm.blocks.BlockRedEmerauld;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public final static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CSMM.ModID);

    public static final RegistryObject<Block> BLUE_EMERALD_BLOCK = createBlock("blue_emerald_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).harvestTool(ToolType.PICKAXE).strength(2f).harvestLevel(2).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_EMERALD_BLOCK = createBlock("red_emerald_block", BlockRedEmerauld::new);


    public static final RegistryObject<Block> AMETHYST_ORE = createBlock("amethyst_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestTool(ToolType.PICKAXE).strength(2f).harvestLevel(2).requiresCorrectToolForDrops()));


    public static RegistryObject<Block> createBlock(String name, Supplier<Block> supplier) {

        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }
}
