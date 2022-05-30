package fr.program.csmm.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class TradiumOreBlock extends Block {

    public TradiumOreBlock() {
        super(AbstractBlock.Properties.of(Material.STONE).strength(5f, 17f).harvestTool(ToolType.PICKAXE).harvestLevel(3).requiresCorrectToolForDrops());
    }

    @Override
    public void destroy(IWorld w, BlockPos pos, BlockState state) {
        World world = null;
        Vector3d position = new Vector3d(pos.getX(), pos.getY() + 2, pos.getZ());
        if (w instanceof World) {
            world = (World) w;
            for (int i = 1; i < 4;i++) {
                CreeperEntity creeper = EntityType.CREEPER.create(world);
                creeper.setPos(pos.getX(), pos.getY(), pos.getZ());
                if (i >= 2) {
                    creeper.setPos(pos.getX() + i - 1, pos.getY(), pos.getZ() - i + 2);
                }
                world.addFreshEntity(creeper);
            }
        }
        super.destroy(w, pos, state);
    }
}
