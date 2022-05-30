package fr.program.csmm.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class FirestoneBlock extends Block {
    public FirestoneBlock(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity playerEntity, Hand hand, BlockRayTraceResult rayTraceResult) {
        if (!world.isClientSide) {
            if (hand == Hand.MAIN_HAND) {
                System.out.println("On a cliqué sur la block avec la main principale !");
            } else if (hand == Hand.OFF_HAND) {
                System.out.println("On a cliqué sur la block avec la main secondaire !");
            }
        }
        return super.use(state, world, pos, playerEntity, hand, rayTraceResult);
    }
    @Override
    public void entityInside(BlockState state, World world, BlockPos pos, Entity entity) {
        Firestone.lightEntityOnFire(entity, 5);
        super.entityInside(state, world, pos, entity);
    }

    @Override
    public void stepOn(World world, BlockPos pos, Entity entity) {
        Firestone.lightEntityOnFire(entity, 5);
        super.stepOn(world, pos, entity);
    }
}
