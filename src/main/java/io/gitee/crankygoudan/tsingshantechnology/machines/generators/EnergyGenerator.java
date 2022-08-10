package io.gitee.crankygoudan.tsingshantechnology.machines.generators;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.gitee.crankygoudan.tsingshantechnology.utils.Y;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.mooy1.infinitylib.machines.MenuBlock;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetProvider;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.inventory.DirtyChestMenu;

/**
 * Solar panels and some other basic generators
 *
 * @author Mooy1
 *
 * Thanks to panda for some stuff to work off of
 */
@ParametersAreNonnullByDefault
public final class EnergyGenerator extends MenuBlock implements EnergyNetProvider {

    private final GenerationType type;
    private final int generation;

    public EnergyGenerator(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe,
                           int generation, GenerationType type) {
        super(category, item, recipeType, recipe);
        this.type = type;
        this.generation = generation;
    }

    @Override
    protected void setup(BlockMenuPreset blockMenuPreset) {
        blockMenuPreset.drawBackground(new int[] {
                0, 1, 2, 3, 4, 5, 6, 7, 8
        });
    }

    @Nonnull
    @Override
    protected int[] getInputSlots(DirtyChestMenu dirtyChestMenu, ItemStack itemStack) {
        return new int[0];
    }

    @Override
    protected int[] getInputSlots() {
        return new int[0];
    }

    @Override
    protected int[] getOutputSlots() {
        return new int[0];
    }

    @Override
    public int getGeneratedOutput(Location l, Config data) {
        int gen = this.type.generate(l.getWorld(), l.getBlock(), this.generation);

        BlockMenu inv = BlockStorage.getInventory(l);
        if (inv != null && inv.hasViewer()) {
            if (gen == 0) {
                inv.replaceExistingItem(4, new CustomItemStack(
                        Material.GREEN_STAINED_GLASS_PANE,
                    Y.colorRandomString ("未发电"),
                    Y.colorRandomString ("已储存: " + MachineLore.format(getCharge(l)) + " J"
                )));
            }
            else {
                inv.replaceExistingItem(4, new CustomItemStack(
                        Material.GREEN_STAINED_GLASS_PANE,
                    Y.colorRandomString ("发电中"),
                    Y.colorRandomString ("类型: ") + this.type,
                    Y.colorRandomString (("发电速度: " + MachineLore.formatEnergy(gen) + " J/s ")),
                    Y.colorRandomString ("已储存: " + MachineLore.format(getCharge(l)) + " J")
                ));
            }
        }

        return gen;
    }

    @Override
    public int getCapacity() {
        return this.generation * 100;
    }

    @Nonnull
    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.GENERATOR;
    }

}
