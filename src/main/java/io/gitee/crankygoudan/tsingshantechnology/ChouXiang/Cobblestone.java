package io/gitee/crankygoudan/tsingshantechnology/ChouXiang;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineProcessHolder;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.core.machines.MachineProcessor;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.implementation.handlers.SimpleBlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.implementation.operations.CraftingOperation;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.interfaces.InventoryBlock;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.apache.commons.lang.Validate;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Random;

public abstract class Cobblestone extends SlimefunItem implements InventoryBlock, EnergyNetComponent, MachineProcessHolder<CraftingOperation> {
    private static final int[] BORDER = {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 18, 19, 20, 21, 22, 27, 28, 29, 30, 31, 36, 37, 38, 39, 40, 41, 42, 43, 44
    };
    private static final int[] OUTPUT_BORDER = {
            14, 15, 16, 17, 23, 26, 32, 33, 34, 35
    };
    //机器进程
    private final MachineProcessor<CraftingOperation> processor = new MachineProcessor<>(this);
    //机器配方
    protected final ArrayList<Recipe> recipes = new ArrayList<>();

    protected Cobblestone(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);

        createPreset(this, getInvTitle(), this::constructMenu);

        addItemHandler(onBreak());
    }

    /**
     * 机器运行速度
     * 该方法返回的值必须大于0
     */
    public abstract int getSpeed();

    /**
     * 机器可容纳的电量
     * 该方法返回的值必须大于0
     */
    public abstract int getCapacity();

    /**
     * 机器进程消耗的电量/Tick
     * 该方法返回的值必须<strong>大于0且小于等于getCapacity()方法返回值</strong>
     * 否则，机器将不会工作
     */
    public abstract int getEnergyConsumption();

    /**
     * 此方法将返回GUI的标题
     */
    public abstract String getInvTitle();

    /**
     * 重写此方法以注册配方
     */
    public abstract void registerDefaultRecipes();

    @NotNull
    protected BlockBreakHandler onBreak() {
        return new SimpleBlockBreakHandler() {

            @Override
            public void onBlockBreak(@NotNull Block b) {
                BlockMenu inv = BlockStorage.getInventory(b);

                if (inv != null) {
                    //inv.dropItems(b.getLocation(), getInputSlots());
                    inv.dropItems(b.getLocation(), getOutputSlots());
                }

                processor.endOperation(b);
            }

        };
    }

    @Override
    public void register(@NotNull SlimefunAddon addon) {
        this.addon = addon;

        if (getCapacity() <= 0) {
            warn("错误！机器电量容量不能小于等于0！！！");
            warn("请确保 '" + getClass().getSimpleName() + "'中的getCapacity()方法返回值大于等于0！该物品已废弃，不再注册！ ");
            warn("同时，请您在检查getCapacity方法返回值时，请一并检查getEnergyConsumption方法与getSpeed方法返回值，以免这两个方法出现错误");
            return;
        }

        if (getEnergyConsumption() <= 0) {
            warn("错误！机器进程电量使用量不能小于等于0！！！");
            warn("请确保 '" + getClass().getSimpleName() + "'中的getEnergyConsumption()方法返回值大于等于0！该物品已废弃，不再注册！ ");
            warn("同时，请您在检查getEnergyConsumption方法返回值时，请一并检查getSpeed方法返回值，以免这个方法出现错误");
            return;
        }

        if (getSpeed() <= 0) {
            warn("错误！机器进程速度不能小于等于0！！！");
            warn("请确保 '" + getClass().getSimpleName() + "'中的getSpeed()方法返回值大于等于0！该物品已废弃，不再注册！ ");
            return;
        }

        registerDefaultRecipes();

        super.register(addon);
    }

    /**
     * 此方法将注册最后返回的物品
     * @param seconds 该参数是指制作该物品所花费的时间
     * @param out 该参数是指最后产出的物品
     */
    public void registerRecipe(int seconds, Material out) {
        registerRecipe(seconds, new ItemStack(out));
    }
    /**
     * 此方法将注册最后返回的物品
     * @param seconds 该参数是指制作该物品所花费的时间
     * @param out 该参数是指最后产出的物品
     */
    public void registerRecipe(int seconds, ItemStack out) {
        this.recipes.add(new Recipe(seconds, out));
    }

    /**
     * 此方法将注册最后返回的物品
     * @param seconds 该参数指制作该物品花费的时间
     * @param out 该参数指最后产出物品
     */
    public void registerRecipe(int seconds, SlimefunItemStack out) {
        this.recipes.add(new Recipe(seconds, out));
    }

    protected void constructMenu(BlockMenuPreset preset) {
        for (int i : BORDER) {
            preset.addItem(i, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
        }
        for (int i : OUTPUT_BORDER) {
            preset.addItem(i, ChestMenuUtils.getOutputSlotTexture(), ChestMenuUtils.getEmptyClickHandler());
        }

        //preset.addItem(22, new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " "), ChestMenuUtils.getEmptyClickHandler());

        for (int i : getOutputSlots()) {
            preset.addMenuClickHandler(i, new ChestMenu.AdvancedMenuClickHandler() {

                @Override
                public boolean onClick(Player p, int slot, ItemStack cursor, ClickAction action) {
                    return false;
                }

                @Override
                public boolean onClick(InventoryClickEvent e, Player p, int slot, ItemStack cursor, ClickAction action) {
                    return cursor == null || cursor.getType() == null || cursor.getType() == Material.AIR;
                }
            });
        }
    }

    @Override
    public void preRegister() {
        addItemHandler(new BlockTicker() {
            @Override
            public boolean isSynchronized() {
                return false;
            }

            @Override
            public void tick(Block b, SlimefunItem item, Config data) {
                Cobblestone.this.tick(b);
            }
        });
    }

    protected void tick(Block b) {
        BlockMenu inv = BlockStorage.getInventory(b);
        CraftingOperation operation = processor.getOperation(b);

        if (operation != null) {
            if (takeCharge(b.getLocation())) {
                if (!operation.isFinished()) {
                    operation.addProgress(1);
                } else {
                    for (ItemStack output : operation.getResults()) {
                        inv.pushItem(output.clone(), getOutputSlots());
                    }
                    processor.endOperation(b);
                }
            }
        } else {
            MachineRecipe recipe =  findNextRecipe();

            if (recipe != null) {
                processor.startOperation(b, new CraftingOperation(recipe));
            }
        }
    }


    protected MachineRecipe findNextRecipe() {
        Random r = new Random();
        //随机获取输出
        int next = r.nextInt(recipes.size());
        Recipe recipe = recipes.get(next);
        ItemStack out = recipe.getOut();
        return new MachineRecipe(recipe.getSeconds(),new ItemStack[]{out},new ItemStack[]{out});
    }

    protected boolean takeCharge(@NotNull Location l) {
        Validate.notNull(l, "Can't attempt to take charge from a null location!");

        if (isChargeable()) {
            int charge = getCharge(l);

            if (charge < getEnergyConsumption()) {
                return false;

            }

            setCharge(l, charge - getEnergyConsumption());
        }
        return true;
    }


    @Override
    public int[] getInputSlots() {
        return new int[] {};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[] { 24, 25 };
    }

    @NotNull
    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.CONSUMER;
    }

    @NotNull
    @Override
    public MachineProcessor<CraftingOperation> getMachineProcessor() {
        return processor;
    }
}
