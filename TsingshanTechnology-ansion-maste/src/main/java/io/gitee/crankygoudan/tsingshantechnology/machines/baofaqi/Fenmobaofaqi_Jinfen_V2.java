package io.gitee.crankygoudan.tsingshantechnology.machines.baofaqi;

import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.gitee.crankygoudan.tsingshantechnology.machines.baofaqi.baofaqijieko.Fenmobaofaqi_Fenmo_1;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.inventory.ItemStack;

public class Fenmobaofaqi_Jinfen_V2 extends Fenmobaofaqi_Fenmo_1 {
    public Fenmobaofaqi_Jinfen_V2(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
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
        return 57600;
    }

    /**
     * 机器进程消耗的电量/Tick
     * 该方法返回的值必须<strong>大于0且小于等于getCapacity()方法返回值</strong>
     * 否则，机器将不会工作
     */
    @Override
    public int getEnergyConsumption() {
        return 57600;
    }

    /**
     * 此方法将返回GUI的标题
     */
    @Override
    public String getInvTitle() {
        return TextUtil.colorPseudorandomString("高级 金粉爆发器");
    }

    /**
     * 重写此方法以注册配方
     */
    @Override
    public void registerDefaultRecipes() {
        //这行代码注册了一个配方，即每过1秒生成一个圆石
        registerRecipe(0, new SlimefunItemStack ( SlimefunItems.GOLD_DUST,8));


        //现在，这台机器便有了3个配方，即每过1秒产出一个石头，每过两秒产出一个石头按钮，每过3秒产出一个
        //请注意，注册时第一个参数对应的是第二个参数的产出时间，且物品产出随机，也就是说，按照上述注册方法，可能会发生以下情况：
        //开启机器，过了1秒，产出了一块石头，又过了2秒，产出了一块石头按钮
    }
}
