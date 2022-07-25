package io.gitee.crankygoudan.tsingshantechnology.machines.jiqi;

import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Yehuaji extends AContainer implements RecipeDisplayItem {

    public Yehuaji(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);

        addItemHandler(onBreak());

    }

    @Override
    protected void registerDefaultRecipes() {

        registerRecipe(2, new ItemStack[] {new ItemStack(Material.WATER_BUCKET)},
            new ItemStack[] {new ItemStack(Material.BUCKET),
                new CustomItemStack(SlimefunItems.SALT, 4)
            });
        registerRecipe(10, new ItemStack[] {new ItemStack(Material.LAVA_BUCKET)},
            new ItemStack[] {new ItemStack(Material.BUCKET),
                new CustomItemStack(SlimefunItems.SULFATE, 20)
            });
        registerRecipe(1, new ItemStack[] {new ItemStack(Material.MAGMA_BLOCK)},
            new ItemStack[] {SlimefunItems.SULFATE});

    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 2);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);
            displayRecipes.add(recipe.getOutput()[recipe.getOutput().length - 1]);
        }

        return displayRecipes;
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.IRON_HOE);
    }

    @Override
    public String getInventoryTitle() {
        return TextUtil.colorPseudorandomString("液化机");
    }

    @Override
    public String getMachineIdentifier() {
        return "QS_JQ_YHJ";
    }

    @Override
    public int getCapacity() {
        return 512;
    }

    @Override
    public int getEnergyConsumption() {return  256;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    public BlockBreakHandler onBreak() {
        return new BlockBreakHandler(false, false) {

            @Override
            public void onPlayerBreak(BlockBreakEvent e, ItemStack item, List<ItemStack> drops) {
                Block b = e.getBlock();
                BlockMenu inv = BlockStorage.getInventory(b);

                if (inv != null) {
                    inv.dropItems(b.getLocation(), getInputSlots());
                    inv.dropItems(b.getLocation(), getOutputSlots());
                }
            }
        };
    }

}

