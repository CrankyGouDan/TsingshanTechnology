package io.gitee.crankygoudan.tsingshantechnology.machines.jiqi.qingshanjiqi;

import io.gitee.crankygoudan.tsingshantechnology.machines.jiqiMoBan.GongZuoTaiMoBan;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class KuiJiaDuanZaoTai extends GongZuoTaiMoBan {

    public KuiJiaDuanZaoTai(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&7全自动盔甲锻造台", Material.ANVIL, "&7盔甲锻造台", RecipeType.ARMOR_FORGE);
    }
}
