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

public class Hunnitujiaobanji extends AContainer implements RecipeDisplayItem {

    public Hunnitujiaobanji(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);

        addItemHandler(onBreak());

    }

    @Override
    protected void registerDefaultRecipes() {

        registerRecipe(2, new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE_POWDER, 8)},
            new ItemStack[] {new ItemStack(Material.WHITE_CONCRETE, 8)});
        registerRecipe(2, new ItemStack[] {new ItemStack(Material.ORANGE_CONCRETE_POWDER, 8)},
            new ItemStack[] {new ItemStack(Material.ORANGE_CONCRETE, 8)});
        registerRecipe(2, new ItemStack[] {new ItemStack(Material.MAGENTA_CONCRETE_POWDER, 8)},
            new ItemStack[] {new ItemStack(Material.MAGENTA_CONCRETE, 8)});
        registerRecipe(2, new ItemStack[] {new ItemStack(Material.LIGHT_BLUE_CONCRETE_POWDER, 8)},
            new ItemStack[] {new ItemStack(Material.LIGHT_BLUE_CONCRETE, 8)});
        registerRecipe(2, new ItemStack[] {new ItemStack(Material.YELLOW_CONCRETE_POWDER, 8)},
            new ItemStack[] {new ItemStack(Material.YELLOW_CONCRETE, 8)});
        registerRecipe(2, new ItemStack[] {new ItemStack(Material.LIME_CONCRETE_POWDER, 8)},
            new ItemStack[] {new ItemStack(Material.LIME_CONCRETE, 8)});
        registerRecipe(2, new ItemStack[] {new ItemStack(Material.PINK_CONCRETE_POWDER, 8)},
            new ItemStack[] {new ItemStack(Material.PINK_CONCRETE, 8)});
        registerRecipe(2, new ItemStack[] {new ItemStack(Material.GRAY_CONCRETE_POWDER, 8)},
            new ItemStack[] {new ItemStack(Material.GRAY_CONCRETE, 8)});
        registerRecipe(2, new ItemStack[] {new ItemStack(Material.LIGHT_GRAY_CONCRETE_POWDER, 8)},
            new ItemStack[] {new ItemStack(Material.LIGHT_GRAY_CONCRETE, 8)});
        registerRecipe(2, new ItemStack[] {new ItemStack(Material.CYAN_CONCRETE_POWDER, 8)},
            new ItemStack[] {new ItemStack(Material.CYAN_CONCRETE, 8)});
        registerRecipe(2, new ItemStack[] {new ItemStack(Material.PURPLE_CONCRETE_POWDER, 8)},
            new ItemStack[] {new ItemStack(Material.PURPLE_CONCRETE, 8)});
        registerRecipe(2, new ItemStack[] {new ItemStack(Material.BLUE_CONCRETE_POWDER, 8)},
            new ItemStack[] {new ItemStack(Material.BLUE_CONCRETE, 8)});
        registerRecipe(2, new ItemStack[] {new ItemStack(Material.BROWN_CONCRETE_POWDER, 8)},
            new ItemStack[] {new ItemStack(Material.BROWN_CONCRETE, 8)});
        registerRecipe(2, new ItemStack[] {new ItemStack(Material.GREEN_CONCRETE_POWDER, 8)},
            new ItemStack[] {new ItemStack(Material.GREEN_CONCRETE, 8)});
        registerRecipe(2, new ItemStack[] {new ItemStack(Material.RED_CONCRETE_POWDER, 8)},
            new ItemStack[] {new ItemStack(Material.RED_CONCRETE, 8)});
        registerRecipe(2, new ItemStack[] {new ItemStack(Material.BLACK_CONCRETE_POWDER, 8)},
            new ItemStack[] {new ItemStack(Material.BLACK_CONCRETE, 8)});

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
        return new ItemStack(Material.IRON_SHOVEL);
    }

    @Override
    public String getInventoryTitle() {
        return  TextUtil.colorPseudorandomString("混凝土搅拌机");
    }

    @Override
    public String getMachineIdentifier() {
        return "QS_JQ_HNTJBJ";
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
