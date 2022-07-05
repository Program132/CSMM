package fr.program.csmm.custom;

import fr.program.csmm.CSMM;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class Firestone extends Item {
    public Firestone(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack item, @Nullable World world, List<ITextComponent> list, ITooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            list.add(new TranslationTextComponent("tooltip." + CSMM.ModID + ".firestone_shift"));
        } else {
            list.add(new TranslationTextComponent("tooltip." + CSMM.ModID + ".firestone"));
        }
        super.appendHoverText(item, world, list, flag);
    }

    @Override
    public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
        World world = context.getLevel();

        if (!world.isClientSide) {
            PlayerEntity playerEntity = Objects.requireNonNull(context.getPlayer());
            BlockState clickedBlock = world.getBlockState(context.getClickedPos());

            rightClickOnBlock(clickedBlock, context, playerEntity);
            stack.hurtAndBreak(1, playerEntity, player -> player.broadcastBreakEvent(context.getHand()));

            return ActionResultType.SUCCESS;
        }

        return super.onItemUseFirst(stack, context);
    }

    private void rightClickOnBlock(BlockState clickedBlock, ItemUseContext context, PlayerEntity playerEntity) {
        boolean playerIsNotInFire = !playerEntity.isOnFire();

        if (random.nextFloat() > 0.5f) {
            lightEntityOnFire(playerEntity, 4);
        } else if (playerIsNotInFire && blockIsValidForResistance(clickedBlock)) {
            gainResistanceAndDestroyBlock(playerEntity, context.getLevel(), context.getClickedPos());
        } else {
            lightGroundOnFire(context);
        }
    }

    private boolean blockIsValidForResistance(BlockState clickedBlock) {
        return clickedBlock.getBlock() == Blocks.COBBLESTONE || clickedBlock.getBlock() == Blocks.STONE;
    }

    public static void lightEntityOnFire(Entity entity, int second) {
        entity.setSecondsOnFire(second);
    }

    private void gainResistanceAndDestroyBlock(PlayerEntity playerEntity, World world, BlockPos pos) {
        gainFireResistance(playerEntity);
        world.destroyBlock(pos, false);
    }

    public static void gainFireResistance(PlayerEntity playerEntity) {
        playerEntity.addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 200));
    }

    public static void lightGroundOnFire(ItemUseContext context) {
        PlayerEntity playerentity = context.getPlayer();
        World world = context.getLevel();
        BlockPos blockpos = context.getClickedPos();

        if (AbstractFireBlock.canBePlacedAt(world, blockpos, context.getHorizontalDirection())) {
            world.playSound(playerentity, blockpos, SoundEvents.FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F,
                    random.nextFloat() * 0.4F + 0.8F);

            BlockState blockstate1 = AbstractFireBlock.getState(world, blockpos);
            world.setBlock(blockpos, blockstate1, 11);
        }
    }
}
