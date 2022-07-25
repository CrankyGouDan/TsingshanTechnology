package io.gitee.crankygoudan.tsingshantechnology.machines.Gongzuotai;

import io.gitee.crankygoudan.tsingshantechnology.jieko.AutoCrafter;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Zengqiangxinggongzuoxiang extends AutoCrafter {
    public Zengqiangxinggongzuoxiang(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&6全自动增强型工作箱",
            Material.CRAFTING_TABLE, "&6增强型工作箱", RecipeType.ENHANCED_CRAFTING_TABLE
        );
    }
}
