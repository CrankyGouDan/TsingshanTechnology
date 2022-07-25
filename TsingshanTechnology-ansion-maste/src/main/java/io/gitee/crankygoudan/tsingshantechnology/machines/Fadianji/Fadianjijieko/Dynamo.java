package io.gitee.crankygoudan.tsingshantechnology.machines.Fadianji.Fadianjijieko;

import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineProcessHolder;
import io.github.thebusybiscuit.slimefun4.core.machines.MachineProcessor;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNet;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.AbstractEnergyProvider;
import io.github.thebusybiscuit.slimefun4.implementation.operations.FuelOperation;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public abstract class Dynamo extends AbstractEnergyProvider implements MachineProcessHolder<FuelOperation> {

    private static final int[] BORDER = {
            0, 1, 2, 3, 5, 6, 7, 8
    };

    private static ItemStack SLOT = new CustomItemStack(Material.ORANGE_STAINED_GLASS_PANE, "§4无法发电");

    private final MachineProcessor<FuelOperation> processor = new MachineProcessor<>(this);

    protected Dynamo(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);

        /*
        new BlockMenuPreset(item.getItemId(), getInventoryTitle()) {

            @Override
            public void init() {
                constructMenu(this);
            }

            @Override
            public boolean canOpen(@NotNull Block b, @NotNull Player p) {
                return p.hasPermission("slimefun.inventory.bypass")
                        || Slimefun.getProtectionManager().hasPermission(p, b.getLocation(), Interaction.INTERACT_BLOCK);
            }

            @Override
            public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
                return new int[0];
            }
        };

         */
        createPreset(this, getInventoryTitle(), this::constructMenu);
    }
    @Override
    protected void registerDefaultFuelTypes() {

    }

    @Override
    public @NotNull MachineProcessor<FuelOperation> getMachineProcessor() {
        return processor;
    }

    private void constructMenu(BlockMenuPreset preset) {
        for (int i : BORDER) {
            preset.addItem(i, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
        }
        preset.addItem(4, SLOT, ChestMenuUtils.getEmptyClickHandler());
    }

    @Override
    public int[] getInputSlots() {
        return new int[0];
    }

    @Override
    public int[] getOutputSlots() {
        return new int[0];
    }

    @Override
    public int getGeneratedOutput(@NotNull Location l, @NotNull Config data) {
        BlockMenu inv = BlockStorage.getInventory(l);
        ItemMeta meta = SLOT.getItemMeta();
        if (meta == null) {
            warn("错误，Meta不能为null! Dynamo类第131行");
            return 0;
        }
        if (EnergyNet.getNetworkFromLocation(l) != null) {
            meta.setDisplayName(TextUtil.colorPseudorandomString("正在发电中..."));
            List<String> lores = new ArrayList<>();
            lores.add(TextUtil.colorPseudorandomString("类型:") + getEnergyTypeShow());
            lores.add(TextUtil.colorPseudorandomString("发电量:") + getEnergyOut() + " J/s");
            lores.add(TextUtil.colorPseudorandomString("电量储存:") + getCapacity() + " J");
            meta.setLore(lores);
            SLOT.setItemMeta(meta);
            SLOT.setType(Material.GREEN_STAINED_GLASS_PANE);
            inv.replaceExistingItem(4, SLOT);
            return getEnergyProduction();
        } else {
            SLOT = new CustomItemStack(Material.ORANGE_STAINED_GLASS_PANE, TextUtil.colorPseudorandomString("colorRandomString"));
            return 0;
        }
    }

    /**
     * 这个方法将返回方块最多能装载的电量
     *
     * @return 这个方块最多能装载的电量
     */
    public abstract int getCapacity();

    /**
     * 这个方法将返回机器每TICK产出的电量
     * @return 机器产出电量/TICK
     */
    public abstract int getEnergyOut();

    /**
     * 这个方法将返回显示在机器页面的发电类型的字符串
     */
    public abstract String getEnergyTypeShow();

    @Override
    public int getEnergyProduction() {
        return getEnergyOut();
    }

    @Override
    public @NotNull ItemStack getProgressBar() {
        return new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, "");
    }

    @Override
    public void register(@NotNull SlimefunAddon addon) {
        this.addon = addon;

        if (getCapacity() < 0) {
            warn("The capacity has not been configured correctly. The Item was disabled.");
            warn("Make sure to call '" + getClass().getSimpleName() + "#setEnergyCapacity(...)' before registering!");
        }

        if (getEnergyProduction() <= 0) {
            warn("The energy consumption has not been configured correctly. The Item was disabled.");
            warn("Make sure to call '" + getClass().getSimpleName() + "#setEnergyProduction(...)' before registering!");
        }

        if (getCapacity() >= 0 && getEnergyProduction() > 0) {
            super.register(addon);
        }
    }

}
