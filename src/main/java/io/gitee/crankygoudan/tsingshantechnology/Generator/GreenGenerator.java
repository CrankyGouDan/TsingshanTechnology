package io.gitee.crankygoudan.tsingshantechnology.Generator;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class GreenGenerator extends AGenerator {

    public GreenGenerator(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Nonnull
    @Override
    public String getInventoryTitle() {
        return "&a&l绿色发电机";
    }

    @Override
    public int getCapacity() {
        return 400;
    }

    @Override
    public int getEnergyProduction() {
        return 100;
    }

    @Override
    protected void registerDefaultFuelTypes() {
        registerFuel(new MachineFuel(8, new ItemStack(Material.OAK_SAPLING)));
        registerFuel(new MachineFuel(8, new ItemStack(Material.SPRUCE_SAPLING)));
        registerFuel(new MachineFuel(8, new ItemStack(Material.BIRCH_SAPLING)));
        registerFuel(new MachineFuel(8, new ItemStack(Material.JUNGLE_SAPLING)));
        registerFuel(new MachineFuel(8, new ItemStack(Material.ACACIA_SAPLING)));
        registerFuel(new MachineFuel(8, new ItemStack(Material.DARK_OAK_SAPLING)));
        registerFuel(new MachineFuel(8, new ItemStack(Material.GRASS)));
        registerFuel(new MachineFuel(8, new ItemStack(Material.OAK_LEAVES)));
        registerFuel(new MachineFuel(8, new ItemStack(Material.SPRUCE_LEAVES)));
        registerFuel(new MachineFuel(8, new ItemStack(Material.BIRCH_LEAVES)));
        registerFuel(new MachineFuel(8, new ItemStack(Material.JUNGLE_LEAVES)));
        registerFuel(new MachineFuel(8, new ItemStack(Material.ACACIA_LEAVES)));
        registerFuel(new MachineFuel(8, new ItemStack(Material.DARK_OAK_LEAVES)));
    }

    @Nonnull
    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.GRASS);
    }

}