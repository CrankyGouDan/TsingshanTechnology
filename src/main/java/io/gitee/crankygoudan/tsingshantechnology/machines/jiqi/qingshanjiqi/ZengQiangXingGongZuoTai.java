package io.gitee.crankygoudan.tsingshantechnology.machines.jiqi.qingshanjiqi;

import io.gitee.crankygoudan.tsingshantechnology.machines.jiqiMoBan.GongZuoTaiMoBan;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ZengQiangXingGongZuoTai extends GongZuoTaiMoBan {
    public ZengQiangXingGongZuoTai(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&6全自动增强型工作台",
            Material.CRAFTING_TABLE, "&6增强型工作台", RecipeType.ENHANCED_CRAFTING_TABLE
        );
    }
}
