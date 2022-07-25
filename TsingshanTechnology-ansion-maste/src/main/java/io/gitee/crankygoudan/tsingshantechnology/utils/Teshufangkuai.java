package io.gitee.crankygoudan.tsingshantechnology.utils;

import io.gitee.crankygoudan.tsingshantechnology.Categories;
import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.items.tianshifangkuai.TSFK_Shitou;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Teshufangkuai {
    public static final SlimefunItemStack QS_TSFK_SHITOU = new SlimefunItemStack ( "QS_TSFK_SHITOU", Material.STONE,
            TextUtil.colorPseudorandomString("魔法方块") + " " + TextUtil.colorPseudorandomString("蕴含魔力的石头"),
            TextUtil.colorPseudorandomString("  "),
            TextUtil.colorPseudorandomString("在你脚下放置一个方块"),
            TextUtil.colorPseudorandomString("当你在空中时非常好用"),
            LoreBuilder.RIGHT_CLICK_TO_USE);

    public static void setup(TsingshanTechnology qs) {

        new TSFK_Shitou ( Categories.QS_TSFK, QS_TSFK_SHITOU, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );




    }
}
