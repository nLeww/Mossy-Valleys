package me.nleww.mossyvalleys.block.custom;

import me.nleww.mossyvalleys.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;


public class ChiseledMossBlock extends Block {
    public ChiseledMossBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof ItemEntity item) {
            if(item.getStack().getItem() == ModItems.MOSS_CLUMP) {
                world.setBlockState(pos, Blocks.AIR.getDefaultState());
                item.getStack().decrement(1);
                spawnBreakParticles(world, null, pos, state);
                ZombieEntity zombie = EntityType.ZOMBIE.create(world);
                if (zombie != null) {
                    zombie.refreshPositionAndAngles(pos.getX() + 0.5, pos.getY() + 1, pos.getZ() + 0.5, 0, 0);
                    world.spawnEntity(zombie);
                }
            }
        }

        super.onSteppedOn(world, pos, state, entity);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        tooltip.add(Text.translatable("block.mossyvalleys.chiseled_moss_stone.tooltip"));
        super.appendTooltip(stack, context, tooltip, options);
    }
}

