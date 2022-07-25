package io.gitee.crankygoudan.tsingshantechnology.utils;

import io.gitee.crankygoudan.tsingshantechnology.Categories;
import io.gitee.crankygoudan.tsingshantechnology.TL;
import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.machines.yunshu.Moyingxiangyunshujiedian_1;
import io.gitee.crankygoudan.tsingshantechnology.machines.yunshu.Moyingxiangyunshujiedian_2;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

public class Yunshuzujian {

    public static final SlimefunItemStack QS_HYZJ_MYXYSJD_1 = new SlimefunItemStack("QS_HYZJ_MYXYSJD_1", TL.QS_HYZJ_MYXYSJD_1,
            TextUtil.colorPseudorandomString("末影货运节点") + " " + TextUtil.colorPseudorandomString("输出"),
            TextUtil.colorPseudorandomString("请把这个机器放在末影箱的一侧"),
            TextUtil.colorPseudorandomString("末影箱输出物品"),
            TextUtil.colorPseudorandomString("从相邻的箱子放入物品"));


    public static final SlimefunItemStack QS_HYZJ_MYXYSJD_2= new SlimefunItemStack("QS_HYZJ_MYXYSJD_2", TL.QS_HYZJ_MYXYSJD_2,
            TextUtil.colorPseudorandomString("末影货运节点") + " " + TextUtil.colorPseudorandomString("输入"),
            TextUtil.colorPseudorandomString("请把这个机器放在末影箱的一侧"),
            TextUtil.colorPseudorandomString("末影箱输入物品"),
            TextUtil.colorPseudorandomString("从相邻的箱子放入物品"));

    public static void setup(TsingshanTechnology qs) {

        new Moyingxiangyunshujiedian_1 ( Categories.QS_YSZJ, QS_HYZJ_MYXYSJD_1, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Moyingxiangyunshujiedian_2 ( Categories.QS_YSZJ, QS_HYZJ_MYXYSJD_2, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );

    }
}
