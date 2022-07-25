package io.gitee.crankygoudan.tsingshantechnology.machines.Fadianji;

import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.gitee.crankygoudan.tsingshantechnology.machines.Fadianji.Fadianjijieko.Dynamo;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

public class Fadianji_vip extends Dynamo {
    public Fadianji_vip(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    /**
     * 这个方法将返回方块最多能装载的电量
     *
     * @return 这个方块最多能装载的电量
     */
    @Override
    public int getCapacity() {
        return 6000000;
    }

    /**
     * 设置该机器每TICK发电量，该值不可以小于等于0
     */
    @Override
    public int getEnergyOut() {
        return 120000;
    }

    /**
     * 这个方法将返回显示在机器页面的发电类型的字符串
     */
    @Override
    public String getEnergyTypeShow() {
        return TextUtil.colorPseudorandomString("VIP (专属发电机)");
    }
}
