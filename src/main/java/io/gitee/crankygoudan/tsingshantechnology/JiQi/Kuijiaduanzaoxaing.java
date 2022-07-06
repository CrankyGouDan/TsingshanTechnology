package io.gitee.crankygoudan.tsingshantechnology.JiQi;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.ncbpfluffybear.fluffymachines.objects.AutoCrafter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Kuijiaduanzaoxaing extends AutoCrafter {

    public Kuijiaduanzaoxaing(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&B&L全自动盔甲锻造台", Material.ANVIL, "&A&l盔甲锻造台", RecipeType.ARMOR_FORGE);
    }
}
