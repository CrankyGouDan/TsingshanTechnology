package io.gitee.crankygoudan.tsingshantechnology.utils;

import io.gitee.crankygoudan.tsingshantechnology.Categories;
import io.gitee.crankygoudan.tsingshantechnology.TL;
import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.gzt.Qingshan_fmx;
import io.gitee.crankygoudan.tsingshantechnology.gzt.Qingshan_gzt;
import io.gitee.crankygoudan.tsingshantechnology.machines.Gongzuotai.*;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

public class Gongzuoxiang {

    public static final SlimefunItemStack QS_GYX_QSGZX = new SlimefunItemStack ( "QINGSHAN_GONGZUOTAI", TL.QS_GYX_QSGZX,
            TextUtil.colorPseudorandomString("青山工作箱") + " " + TextUtil.colorPseudorandomString(" "),
            TextUtil.colorPseudorandomString("用于制造青山科技的物品"));
    public static final SlimefunItemStack QS_GYX_FMX = new SlimefunItemStack ( "QS_GYX_FMX", TL.QS_GYX_FMX,
            TextUtil.colorPseudorandomString("附魔箱") + " " + TextUtil.colorPseudorandomString(" "),
            TextUtil.colorPseudorandomString("用于制造附魔石"));


    public static void setup(TsingshanTechnology qs) {

        new Qingshan_gzt ( Categories.QS_GYX,  QS_GYX_QSGZX, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        }, 10000000 ).register ( qs );
        new Qingshan_fmx ( Categories.QS_GYX,  QS_GYX_FMX, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        }, 20000000 ).register ( qs );





    }
}
