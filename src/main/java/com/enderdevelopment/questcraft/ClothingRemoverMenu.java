package com.enderdevelopment.questcraft;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;

public class ClothingRemoverMenu extends AbstractContainerMenu {
    private final BlockEntity blockEntity;

    public ClothingRemoverMenu(int windowId, Inventory inv, BlockEntity blockEntity) {
        super(MenuType.GENERIC_9x3, windowId);
        this.blockEntity = blockEntity;
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        return ItemStack.EMPTY;
    }
}