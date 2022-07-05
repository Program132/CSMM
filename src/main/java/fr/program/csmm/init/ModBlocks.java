package fr.program.csmm.init;

import fr.program.csmm.CSMM;
import fr.program.csmm.blocks.BlockRedEmerauld;
import fr.program.csmm.blocks.TradiumOreBlock;
import fr.program.csmm.custom.FirestoneBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CSMM.ModID);

    public static final RegistryObject<Block> BLACK_DIAMOND_BLOCK = createBlock("black_diamond_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(3f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops())); // On a besoin de func 235861 h pour que les harvest fonctionnent !

    public static final RegistryObject<Block> RED_EMERAULD_BLOCK = createBlock("red_emerauld_block", BlockRedEmerauld::new);

    public static final RegistryObject<Block> COPPER_ORE = createBlock("copper_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(3f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TRADIUM_ORE = createBlock("tradium_ore", TradiumOreBlock::new);

    public static final RegistryObject<Block> FIRESTONE_BLOCK = createBlock("firestone_block",
            () -> new FirestoneBlock(AbstractBlock.Properties.of(Material.STONE).strength(3.5f, 15.5f).harvestTool(ToolType.PICKAXE).harvestLevel(3).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_EMERAULD_STAIRS = createBlock("red_emerauld_stairs",
            () -> new StairsBlock(() -> RED_EMERAULD_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.METAL).harvestLevel(3).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_EMERAULD_FENCE = createBlock("red_emerauld_fence",
            () ->  new FenceBlock(AbstractBlock.Properties.of(Material.METAL).harvestLevel(3).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_EMERAULD_FENCE_GATE = createBlock("red_emerauld_fence_gate",
            () ->  new FenceGateBlock(AbstractBlock.Properties.of(Material.METAL).harvestLevel(3).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_EMERAULD_SLAB = createBlock("red_emerauld_slab",
            () ->  new SlabBlock(AbstractBlock.Properties.of(Material.METAL).harvestLevel(3).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));



    public static RegistryObject<Block> createBlock(String name, Supplier<Block> supplier) {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return block;
    }
}