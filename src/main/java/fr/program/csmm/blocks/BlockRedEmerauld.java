package fr.program.csmm.blocks;

import fr.program.csmm.tileentity.TileEntityRedEmerauld;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.swing.*;

public class BlockRedEmerauld extends Block {
    public BlockRedEmerauld() {
        super(AbstractBlock.Properties.of(Material.METAL).strength(5f , 20f).harvestTool(ToolType.PICKAXE).harvestLevel(1).requiresCorrectToolForDrops());
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new TileEntityRedEmerauld();
    }

    @Override
    public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {

        if(worldIn.getBlockEntity(pos) instanceof TileEntityRedEmerauld)
        {
            TileEntityRedEmerauld te = (TileEntityRedEmerauld) worldIn.getBlockEntity(pos);
            player.displayClientMessage(new StringTextComponent("Counter : " + te.getCounter()), true);
            return ActionResultType.SUCCESS;
        }

        return ActionResultType.PASS;
    }

}