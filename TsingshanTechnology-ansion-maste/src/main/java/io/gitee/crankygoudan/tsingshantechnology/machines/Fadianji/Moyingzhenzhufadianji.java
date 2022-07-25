package io.gitee.crankygoudan.tsingshantechnology.machines.Fadianji;

import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Moyingzhenzhufadianji extends AGenerator {

    public Moyingzhenzhufadianji(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public String getInventoryTitle() {
        return  TextUtil.colorPseudorandomString("末影珍珠发电机");
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack( Material.ENDER_PEARL);
    }

    @Override
    public int getEnergyProduction() {
        return 512;
    }

    @Override
    protected void registerDefaultFuelTypes() {
        registerFuel(new MachineFuel (5, new ItemStack(Material.ENDER_PEARL)));
    }

    @Override
    public int getCapacity() {
        return 640;
    }
}
