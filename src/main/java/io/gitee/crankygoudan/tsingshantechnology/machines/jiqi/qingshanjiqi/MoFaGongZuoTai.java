package io.gitee.crankygoudan.tsingshantechnology.machines.jiqi.qingshanjiqi;

import io.gitee.crankygoudan.tsingshantechnology.machines.jiqiMoBan.GongZuoTaiMoBan;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.api.inventory.DirtyChestMenu;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class MoFaGongZuoTai extends GongZuoTaiMoBan {

    public MoFaGongZuoTai(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&6全自动魔法工作台", Material.BOOKSHELF, "&6魔法工作台", RecipeType.MAGIC_WORKBENCH);
    }

    /**
     * Modified to accept non-stackable items
     */
    @Override
    public int[] getCustomItemTransport(DirtyChestMenu menu, ItemTransportFlow flow, ItemStack item) {
        if (flow == ItemTransportFlow.WITHDRAW) {
            return getOutputSlots();
        }

        if (item.getType().getMaxStackSize() == 1) {
            return getInputSlots();
        }

        List<Integer> slots = new ArrayList<>();
        for (int slot : getInputSlots()) {
            if (menu.getItemInSlot(slot) != null) {
                slots.add(slot);
            }
        }

        slots.sort(compareSlots(menu));

        int[] array = new int[slots.size()];

        for (int i = 0; i < slots.size(); i++) {
            array[i] = slots.get(i);
        }

        return array;
    }
}
