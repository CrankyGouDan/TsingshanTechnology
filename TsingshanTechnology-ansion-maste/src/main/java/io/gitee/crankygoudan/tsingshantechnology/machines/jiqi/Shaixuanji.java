package io.gitee.crankygoudan.tsingshantechnology.machines.jiqi;

import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
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

public class Shaixuanji extends AContainer implements RecipeDisplayItem {

    public Shaixuanji(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);

        addItemHandler(onBreak());

    }

    @Override
    protected void registerDefaultRecipes() {

        registerRecipe(8, new ItemStack[] {new ItemStack(Material.STONE, 4)},
            new ItemStack[] {new ItemStack(Material.SAND)});
        registerRecipe(8, new ItemStack[] {new ItemStack(Material.GRANITE, 4)},
            new ItemStack[] {new ItemStack(Material.SAND)});
        registerRecipe(8, new ItemStack[] {new ItemStack(Material.DIORITE, 4)},
            new ItemStack[] {new ItemStack(Material.SAND)});
        registerRecipe(8, new ItemStack[] {new ItemStack(Material.ANDESITE, 4)},
            new ItemStack[] {new ItemStack(Material.SAND)});
        registerRecipe(8, new ItemStack[] {new ItemStack(Material.COBBLESTONE, 4)},
            new ItemStack[] {new ItemStack(Material.SAND)});

        registerRecipe(8, new ItemStack[] {new ItemStack(Material.GRAVEL, 4)},
            new ItemStack[] {new ItemStack(Material.SAND)});
        registerRecipe(8, new ItemStack[] {new ItemStack(Material.GRASS_BLOCK, 4)},
            new ItemStack[] {new ItemStack(Material.SAND)});
        registerRecipe(8, new ItemStack[] {new ItemStack(Material.DIRT, 4)},
            new ItemStack[] {new ItemStack(Material.SAND)});
        registerRecipe(8, new ItemStack[] {new ItemStack(Material.COARSE_DIRT, 4)},
            new ItemStack[] {new ItemStack(Material.SAND)});
        registerRecipe(8, new ItemStack[] {new ItemStack(Material.PODZOL, 4)},
            new ItemStack[] {new ItemStack(Material.SAND)});

        registerRecipe(8, new ItemStack[] {new ItemStack(Material.NETHERRACK, 4)},
            new ItemStack[] {new ItemStack(Material.SOUL_SAND)});

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
        return new ItemStack(Material.IRON_PICKAXE);
    }

    @Override
    public String getInventoryTitle() {
        return TextUtil.colorPseudorandomString("赛筛机");
    }

    @Override
    public String getMachineIdentifier() {
        return "QS_JQ_SXJ";
    }

    @Override
    public int getCapacity() {
        return 256;
    }

    @Override
    public int getEnergyConsumption() {
        return 128;
    }

    @Override
    public int getSpeed() {
        return 4;
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
