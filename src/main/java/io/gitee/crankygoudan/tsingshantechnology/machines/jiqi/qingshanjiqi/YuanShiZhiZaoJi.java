package io.gitee.crankygoudan.tsingshantechnology.machines.jiqi.qingshanjiqi;

import io.gitee.crankygoudan.tsingshantechnology.machines.jiqiMoBan.QianYingHeMoBan;
import io.gitee.crankygoudan.tsingshantechnology.utils.Y;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class YuanShiZhiZaoJi extends QianYingHeMoBan {
    public YuanShiZhiZaoJi(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    /**
     * 机器运行速度
     * 该方法返回的值必须大于0
     */
    @Override
    public int getSpeed() {
        return 1;
    }

    /**
     * 机器可容纳的电量
     * 该方法返回的值必须大于0
     */
    @Override
    public int getCapacity() {
        return 512;
    }

    /**
     * 机器进程消耗的电量/Tick
     * 该方法返回的值必须<strong>大于0且小于等于getCapacity()方法返回值</strong>
     * 否则，机器将不会工作
     */
    @Override
    public int getEnergyConsumption() {
        return 72;
    }

    /**
     * 此方法将返回GUI的标题
     */
    @Override
    public String getInvTitle() {
        return Y.colorPseudorandomString("圆石制造机");
    }

    /**
     * 重写此方法以注册配方
     */
    @Override
    public void registerDefaultRecipes() {
        //这行代码注册了一个配方，即每过1秒生成一个圆石
        this.registerRecipe(0, Material.COBBLESTONE);

        //现在，这台机器便有了3个配方，即每过1秒产出一个石头，每过两秒产出一个石头按钮，每过3秒产出一个
        //请注意，注册时第一个参数对应的是第二个参数的产出时间，且物品产出随机，也就是说，按照上述注册方法，可能会发生以下情况：
        //开启机器，过了1秒，产出了一块石头，又过了2秒，产出了一块石头按钮
    }
}
