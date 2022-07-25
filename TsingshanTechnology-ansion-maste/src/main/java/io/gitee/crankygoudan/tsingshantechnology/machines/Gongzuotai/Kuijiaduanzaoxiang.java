package io.gitee.crankygoudan.tsingshantechnology.machines.Gongzuotai;

import io.gitee.crankygoudan.tsingshantechnology.jieko.AutoCrafter;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Kuijiaduanzaoxiang extends AutoCrafter {

    public Kuijiaduanzaoxiang(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&7全自动盔甲锻造箱",
                Material.ANVIL, "&7盔甲锻造箱", RecipeType.ARMOR_FORGE);
    }
}
