package io.gitee.crankygoudan.tsingshantechnology.machines.jiqiMoBan;

import io.gitee.crankygoudan.tsingshantechnology.utils.Y;
import io.github.mooy1.infinitylib.machines.AbstractMachineBlock;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import lombok.Setter;

import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

import java.util.ArrayList;
import java.util.List;

/**
 * Machines that generate materials at the cost of energy
 *
 * @author Mooy1
 */
public final class YuanShiBaoFaQiMoBan extends AbstractMachineBlock implements RecipeDisplayItem {

    private static final int[] OUTPUT_SLOTS = { 13 };
    private static final int STATUS_SLOT = 4;

    @Setter
    private int speed;
    @Setter
    private Material material;

    public YuanShiBaoFaQiMoBan(ItemGroup category, SlimefunItemStack item, RecipeType type, ItemStack[] recipe) {
        super(category, item, type, recipe);
    }

    @Override
    protected void setup(@Nonnull BlockMenuPreset blockMenuPreset) {
        blockMenuPreset.drawBackground(new int[] {
                0, 1, 2, 3, 4, 5, 6, 7, 8,
                9, 10, 11, 12, 14, 15, 16, 17
        });
    }

    @Override
    protected int getStatusSlot() {
        return STATUS_SLOT;
    }

    @Override
    protected int[] getInputSlots() {
        return new int[0];
    }

    @Override
    protected int[] getOutputSlots() {
        return OUTPUT_SLOTS;
    }

    @Override
    public void onNewInstance(@Nonnull BlockMenu menu, @Nonnull Block b) {

    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> items = new ArrayList<>();
        items.add(null);
        items.add(new ItemStack(this.material, this.speed));
        return items;
    }

    @Nonnull
    @Override
    public String getRecipeSectionLabel(@Nonnull Player p) {
        return Y.colorPseudorandomString("产物");
    }

    @Override
    protected boolean process(@Nonnull Block b, @Nonnull BlockMenu inv) {
        ItemStack output = new ItemStack(this.material, this.speed);

        if (!inv.fits(output, OUTPUT_SLOTS)) {

            if (inv.hasViewer()) {
                inv.replaceExistingItem(STATUS_SLOT, NO_ROOM_ITEM);
            }
            return false;

        }

        inv.pushItem(output, OUTPUT_SLOTS);

        if (inv.hasViewer()) {
            inv.replaceExistingItem(STATUS_SLOT, new CustomItemStack(Material.LIME_STAINED_GLASS_PANE, Y.colorPseudorandomString("生产中...")));
        }

        return true;
    }

}
