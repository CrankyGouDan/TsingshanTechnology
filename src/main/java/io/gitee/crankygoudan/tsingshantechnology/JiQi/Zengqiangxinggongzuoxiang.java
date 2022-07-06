package io.gitee.crankygoudan.tsingshantechnology.JiQi;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.ncbpfluffybear.fluffymachines.objects.AutoCrafter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Zengqiangxinggongzuoxiang extends AutoCrafter {
    public Zengqiangxinggongzuoxiang(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&b&l全自动增强型工作台",
            Material.CRAFTING_TABLE, "&b&l增强型工作台", RecipeType.ENHANCED_CRAFTING_TABLE
        );
    }
}
