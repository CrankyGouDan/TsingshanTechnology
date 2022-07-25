package io.gitee.crankygoudan.tsingshantechnology.machines.baofaqi;

import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.gitee.crankygoudan.tsingshantechnology.machines.baofaqi.baofaqijieko.Qianyinghebaofaqi_3;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Qianyinghebaofaqi_V3 extends Qianyinghebaofaqi_3 {
    public Qianyinghebaofaqi_V3(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
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
        return 5000000;
    }

    /**
     * 机器进程消耗的电量/Tick
     * 该方法返回的值必须<strong>大于0且小于等于getCapacity()方法返回值</strong>
     * 否则，机器将不会工作
     */
    @Override
    public int getEnergyConsumption() {
        return 5000000;
    }

    /**
     * 此方法将返回GUI的标题
     */
    @Override
    public String getInvTitle() {
        return TextUtil.colorPseudorandomString("究极 潜影盒爆发器");
    }

    /**
     * 重写此方法以注册配方
     */
    @Override
    public void registerDefaultRecipes() {
        //这行代码注册了一个配方，即每过1秒生成一个圆石
        this.registerRecipe(1, Material.SHULKER_BOX);
        this.registerRecipe(1, Material.BLACK_SHULKER_BOX);
        this.registerRecipe(1, Material.BLUE_SHULKER_BOX);
        this.registerRecipe(1, Material.CYAN_SHULKER_BOX);
        this.registerRecipe(1, Material.GRAY_SHULKER_BOX);
        this.registerRecipe(1, Material.GREEN_SHULKER_BOX);
        this.registerRecipe(1, Material.LIGHT_BLUE_SHULKER_BOX);
        this.registerRecipe(1, Material.LIME_SHULKER_BOX);
        this.registerRecipe(1, Material.MAGENTA_SHULKER_BOX);
        this.registerRecipe(1, Material.ORANGE_SHULKER_BOX);
        this.registerRecipe(1, Material.PINK_SHULKER_BOX);
        this.registerRecipe(1, Material.YELLOW_SHULKER_BOX);
        this.registerRecipe(1, Material.WHITE_SHULKER_BOX);
        this.registerRecipe(1, Material.RED_SHULKER_BOX);
        this.registerRecipe(1, Material.PURPLE_SHULKER_BOX);
        this.registerRecipe(1, Material.LIGHT_GRAY_SHULKER_BOX);
        this.registerRecipe(1, Material.BROWN_SHULKER_BOX);

        //现在，这台机器便有了3个配方，即每过1秒产出一个石头，每过两秒产出一个石头按钮，每过3秒产出一个
        //请注意，注册时第一个参数对应的是第二个参数的产出时间，且物品产出随机，也就是说，按照上述注册方法，可能会发生以下情况：
        //开启机器，过了1秒，产出了一块石头，又过了2秒，产出了一块石头按钮
    }
}
