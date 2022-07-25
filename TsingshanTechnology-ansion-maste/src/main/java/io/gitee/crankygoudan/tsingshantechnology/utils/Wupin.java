package io.gitee.crankygoudan.tsingshantechnology.utils;

import io.gitee.crankygoudan.tsingshantechnology.Categories;
import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.items.wp.AngelGem;
import io.gitee.crankygoudan.tsingshantechnology.items.wp.AngelGemT2;
import io.gitee.crankygoudan.tsingshantechnology.items.wp.AngelGemT3;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Wupin {

    public static final SlimefunItemStack QS_FXHX_V1 = new SlimefunItemStack ( "QS_FXHX_V1",   Material.HEART_OF_THE_SEA,
            TextUtil.colorPseudorandomString("青山飞行核心 V1"),
            "给予你永久飞行能力",
            "&f可以调节飞行速度",
            "",
            "&f&o像狗蛋一样飞翔~",
            "",
            "&7最大速度: 0.1",
            "&7飞行开关: <enabled>",
            "&7飞行速度: <speed>");
    public static final SlimefunItemStack QS_FXHX_V2 = new SlimefunItemStack ( "QS_FXHX_V2", Material.HEART_OF_THE_SEA, TextUtil.colorPseudorandomString("青山飞行核心 V2"),
            "&f给予你永久飞行能力",
            "&f可以调节飞行速度",
            "",
            "&f&o像狗蛋一样飞翔~",
            "",
            "&7最大速度: 0.2",
            "&7飞行开关: <enabled>",
            "&7飞行速度: <speed>");
    public static final SlimefunItemStack QS_FXHX_V3 = new SlimefunItemStack ( "QS_FXHX_V3", Material.HEART_OF_THE_SEA, TextUtil.colorPseudorandomString("青山飞行核心 V3"),
            "&f给予你永久飞行能力",
            "&f可以调节飞行速度",
            "",
            "&f&o像狗蛋一样飞翔~",
            "",
            "&7最大速度: 0.3",
            "&7飞行开关: <enabled>",
            "&7飞行速度: <speed>");

    public static void setup(TsingshanTechnology qs) {

        new AngelGem ( Categories.QS_WP, QS_FXHX_V1, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new AngelGemT2 ( Categories.QS_WP, QS_FXHX_V2, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new AngelGemT3 ( Categories.QS_WP, QS_FXHX_V3, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );









    }
}
