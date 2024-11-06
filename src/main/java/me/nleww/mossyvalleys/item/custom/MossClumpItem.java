package me.nleww.mossyvalleys.item.custom;

import me.nleww.mossyvalleys.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;


import java.util.List;
import java.util.Map;

public class MossClumpItem extends Item {
    public static final Map<Block, Block> MOSS_MAP =
            Map.of(
                    Blocks.STONE, ModBlocks.MOSS_STONE,
                    Blocks.COBBLESTONE, Blocks.MOSSY_COBBLESTONE,
                    Blocks.STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS
            );


    public MossClumpItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

    if(MOSS_MAP.containsKey(clickedBlock)){
        if (!world.isClient) {
            world.setBlockState(context.getBlockPos(), MOSS_MAP.get(clickedBlock).getDefaultState());
            context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                    item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

            world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_AMETHYST_CLUSTER_STEP, SoundCategory.BLOCKS);
        }
    }
        return ActionResult.SUCCESS;
}

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("block.mossyvalleys.moss_clump.tooltip"));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
