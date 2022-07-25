package io.gitee.crankygoudan.tsingshantechnology.utils;

import io.gitee.crankygoudan.tsingshantechnology.Categories;
import io.gitee.crankygoudan.tsingshantechnology.TL;
import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.machines.baofaqi.*;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

public class Baofaqi {
    public static final SlimefunItemStack QS_BFQ_QYH_V1 = new SlimefunItemStack ( "QS_BFQ_QYH ", TL.QS_BFQ_QYH_V1, TextUtil.colorPseudorandomString("基础 潜影盒爆发器"));
    public static final SlimefunItemStack QS_BFQ_TIE_V1 = new SlimefunItemStack ( "QS_BFQ_TIE_V1 ", TL.QS_BFQ_TIE_V1, TextUtil.colorPseudorandomString("基础 粉末爆发器(铁粉)"));
    public static final SlimefunItemStack QS_BFQ_JIN_V1 = new SlimefunItemStack ( "QS_BFQ_JIN_V1 ", TL.QS_BFQ_JIN_V1, TextUtil.colorPseudorandomString("基础 粉末爆发器(金粉)"));
    public static final SlimefunItemStack QS_BFQ_TONG_V1 = new SlimefunItemStack ( "QS_BFQ_TONG_V1 ", TL.QS_BFQ_TONG_V1, TextUtil.colorPseudorandomString("基础 粉末爆发器(铜粉)"));
    public static final SlimefunItemStack QS_BFQ_XI_V1 = new SlimefunItemStack ( "QS_BFQ_XI_V1", TL.QS_BFQ_XI_V1, TextUtil.colorPseudorandomString("基础 粉末爆发器(锡粉)"));
    public static final SlimefunItemStack QS_BFQ_QIAN_V1 = new SlimefunItemStack ( "QS_BFQ_QIAN_V1 ", TL.QS_BFQ_QIAN_V1, TextUtil.colorPseudorandomString("基础 粉末爆发器(铅粉)"));
    public static final SlimefunItemStack QS_BFQ_YIN_V1 = new SlimefunItemStack ( "QS_BFQ_YIN_V1", TL.QS_BFQ_YIN_V1, TextUtil.colorPseudorandomString("基础 粉末爆发器(银粉)"));
    public static final SlimefunItemStack QS_BFQ_LV_V1 = new SlimefunItemStack ( "QS_BFQ_LV_V1", TL.QS_BFQ_LV_V1, TextUtil.colorPseudorandomString("基础 粉末爆发器(铝粉)"));
    public static final SlimefunItemStack QS_BFQ_XIN_V1 = new SlimefunItemStack ( "QS_BFQ_TF_V1 ", TL.QS_BFQ_XIN_V1, TextUtil.colorPseudorandomString("基础 粉末爆发器(锌粉)"));
    public static final SlimefunItemStack QS_BFQ_MEI_V1 = new SlimefunItemStack ( "QS_BFQ_MEI_V1 ", TL.QS_BFQ_MEI_V1, TextUtil.colorPseudorandomString("基础 粉末爆发器(镁粉)"));

    //高级 爆发器--------------------------------------------------------------------------------------------------------
    public static final SlimefunItemStack QS_BFQ_QYH_V2 = new SlimefunItemStack ( "QS_BFQ_QYH_V2 ", TL.QS_BFQ_QYH_V2, TextUtil.colorPseudorandomString("高级 潜影盒爆发器"));
    public static final SlimefunItemStack QS_BFQ_TIE_V2 = new SlimefunItemStack ( "QS_BFQ_TIE_V2 ", TL.QS_BFQ_TIE_V1,TextUtil.colorPseudorandomString("高级粉末爆发器(铁粉)"));
    public static final SlimefunItemStack QS_BFQ_JIN_V2 = new SlimefunItemStack ( "QS_BFQ_JIN_V2 ", TL.QS_BFQ_JIN_V1, TextUtil.colorPseudorandomString("高级粉末爆发器(金粉)"));
    public static final SlimefunItemStack QS_BFQ_TONG_V2 = new SlimefunItemStack ( "QS_BFQ_TONG_V2 ", TL.QS_BFQ_TONG_V1, TextUtil.colorPseudorandomString("高级粉末爆发器(铜粉)"));
    public static final SlimefunItemStack QS_BFQ_XI_V2 = new SlimefunItemStack ( "QS_BFQ_XI_V2", TL.QS_BFQ_XI_V1, TextUtil.colorPseudorandomString("高级粉末爆发器(锡粉)"));
    public static final SlimefunItemStack QS_BFQ_QIAN_V2 = new SlimefunItemStack ( "QS_BFQ_QIAN_V2 ", TL.QS_BFQ_QIAN_V1, TextUtil.colorPseudorandomString("高级粉末爆发器(铅粉)"));
    public static final SlimefunItemStack QS_BFQ_YIN_V2 = new SlimefunItemStack ( "QS_BFQ_YIN_V2", TL.QS_BFQ_YIN_V1, TextUtil.colorPseudorandomString("高级粉末爆发器(银粉)"));
    public static final SlimefunItemStack QS_BFQ_LV_V2 = new SlimefunItemStack ( "QS_BFQ_LV_V2", TL.QS_BFQ_LV_V1, TextUtil.colorPseudorandomString("高级粉末爆发器(铝粉)"));
    public static final SlimefunItemStack QS_BFQ_XIN_V2 = new SlimefunItemStack ( "QS_BFQ_TF_V2 ", TL.QS_BFQ_XIN_V1, TextUtil.colorPseudorandomString("高级粉末爆发器(锌粉)"));
    public static final SlimefunItemStack QS_BFQ_MEI_V2 = new SlimefunItemStack ( "QS_BFQ_MEI_V2 ", TL.QS_BFQ_MEI_V1, TextUtil.colorPseudorandomString("高级粉末爆发器(镁粉)"));

    //究极 爆发器--------------------------------------------------------------------------------------------------------
    public static final SlimefunItemStack QS_BFQ_QYH_V3 = new SlimefunItemStack ( "QS_BFQ_QYH_V3 ", TL.QS_BFQ_QYH_V3,
            TextUtil.colorPseudorandomString("幻彩 潜影盒爆发器") + " " + TextUtil.colorPseudorandomString("究极"),
            TextUtil.colorRandomString("生产概率："),
            TextUtil.colorRandomString("          "),
            TextUtil.colorRandomString("潜影盒 50%"),
            TextUtil.colorRandomString("白色潜影盒 50%"),
            TextUtil.colorRandomString("橙色潜影盒 50%"),
            TextUtil.colorRandomString("品红色潜影盒 50%"),
            TextUtil.colorRandomString("淡蓝色潜影盒 50%"),
            TextUtil.colorRandomString("黄色潜影盒 50%"),
            TextUtil.colorRandomString("黄绿色潜影盒 50%"),
            TextUtil.colorRandomString("粉红色潜影盒 50%"),
            TextUtil.colorRandomString("灰色潜影盒 50%"),
            TextUtil.colorRandomString("浅灰色潜影盒 50%"),
            TextUtil.colorRandomString("青色潜影盒 50%"),
            TextUtil.colorRandomString("紫色潜影盒 50%"),
            TextUtil.colorRandomString("蓝色潜影盒 50%"),
            TextUtil.colorRandomString("棕色潜影盒 50%"),
            TextUtil.colorRandomString("绿色潜影盒 50%"),
            TextUtil.colorRandomString("红色潜影盒 50%"),
            MachineLore.speed(1),
            MachineLore.energyPerSecond(2500000));


    public static final SlimefunItemStack QS_BFQ_TIE_V3 = new SlimefunItemStack ( "QS_BFQ_TIE_V3 ", TL.QS_BFQ_TIE_V1, TextUtil.colorPseudorandomString("究极粉末爆发器(铁粉)"));
    public static final SlimefunItemStack QS_BFQ_JIN_V3 = new SlimefunItemStack ( "QS_BFQ_JIN_V3 ", TL.QS_BFQ_JIN_V1, TextUtil.colorPseudorandomString("究极粉末爆发器(金粉)"));
    public static final SlimefunItemStack QS_BFQ_TONG_V3 = new SlimefunItemStack ( "QS_BFQ_TONG_V3 ", TL.QS_BFQ_TONG_V1, TextUtil.colorPseudorandomString("究极粉末爆发器(铜粉)"));
    public static final SlimefunItemStack QS_BFQ_XI_V3 = new SlimefunItemStack ( "QS_BFQ_XI_V3", TL.QS_BFQ_XI_V1, TextUtil.colorPseudorandomString("究极粉末爆发器(锡粉)"));
    public static final SlimefunItemStack QS_BFQ_QIAN_V3 = new SlimefunItemStack ( "QS_BFQ_QIAN_V3 ", TL.QS_BFQ_QIAN_V1, TextUtil.colorPseudorandomString("究极粉末爆发器(铅粉)"));
    public static final SlimefunItemStack QS_BFQ_YIN_V3 = new SlimefunItemStack ( "QS_BFQ_YIN_V3", TL.QS_BFQ_YIN_V1, TextUtil.colorPseudorandomString("究极粉末爆发器(银粉)"));
    public static final SlimefunItemStack QS_BFQ_LV_V3 = new SlimefunItemStack ( "QS_BFQ_LV_V3", TL.QS_BFQ_LV_V1, TextUtil.colorPseudorandomString("究极粉末爆发器(铝粉)"));
    public static final SlimefunItemStack QS_BFQ_XIN_V3 = new SlimefunItemStack ( "QS_BFQ_TF_V3 ", TL.QS_BFQ_XIN_V1, TextUtil.colorPseudorandomString("究极粉末爆发器(锌粉)"));
    public static final SlimefunItemStack QS_BFQ_MEI_V3 = new SlimefunItemStack ( "QS_BFQ_MEI_V3 ", TL.QS_BFQ_MEI_V1, TextUtil.colorPseudorandomString("究极粉末爆发器(镁粉)"));

    public static void setup(TsingshanTechnology qs) {

        //基础 爆发器 配方------------------------------------------------------------------------------------------------
        new Qianyinghebaofaqi_V1 ( Categories.QS_BFQ_V2, QS_BFQ_QYH_V1, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Tiefen_V1 ( Categories.QS_BFQ_V2, QS_BFQ_TIE_V1, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Jinfen_V1 ( Categories.QS_BFQ_V2, QS_BFQ_JIN_V1, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Tongfen_V1 ( Categories.QS_BFQ_V2, QS_BFQ_TONG_V1, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Xifen_V1 ( Categories.QS_BFQ_V2, QS_BFQ_XI_V1, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Qianfen_V1 ( Categories.QS_BFQ_V2, QS_BFQ_QIAN_V1, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Yinfen_V1 ( Categories.QS_BFQ_V2, QS_BFQ_YIN_V1, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Lvfen_V1 ( Categories.QS_BFQ_V2, QS_BFQ_LV_V1, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Xinfen_V1 ( Categories.QS_BFQ_V2, QS_BFQ_XIN_V1, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Meifen_V1 ( Categories.QS_BFQ_V2, QS_BFQ_MEI_V1, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );



        //高级 爆发器 配方----------------------------------------------------------------------------------------------------
        new Qianyinghebaofaqi_V2 ( Categories.QS_BFQ_V2, QS_BFQ_QYH_V2, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Tiefen_V2 ( Categories.QS_BFQ_V2, QS_BFQ_TIE_V2, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Jinfen_V2 ( Categories.QS_BFQ_V2, QS_BFQ_JIN_V2, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Tongfen_V2 ( Categories.QS_BFQ_V2, QS_BFQ_TONG_V2, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Xifen_V2 ( Categories.QS_BFQ_V2, QS_BFQ_XI_V2, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Qianfen_V2 ( Categories.QS_BFQ_V2, QS_BFQ_QIAN_V2, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Yinfen_V2 ( Categories.QS_BFQ_V2, QS_BFQ_YIN_V2, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Lvfen_V2 ( Categories.QS_BFQ_V2, QS_BFQ_LV_V2, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Xinfen_V2 ( Categories.QS_BFQ_V2, QS_BFQ_XIN_V2, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Meifen_V2 ( Categories.QS_BFQ_V2, QS_BFQ_MEI_V2, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );


        //神级 爆发器 配方----------------------------------------------------------------------------------------------------
        new Qianyinghebaofaqi_V3 ( Categories.QS_BFQ_V3, QS_BFQ_QYH_V3, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );

        new Fenmobaofaqi_Tiefen_V3 ( Categories.QS_BFQ_V3, QS_BFQ_TIE_V3, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Jinfen_V3 ( Categories.QS_BFQ_V3, QS_BFQ_JIN_V3, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Tongfen_V3 ( Categories.QS_BFQ_V3, QS_BFQ_TONG_V3, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Xifen_V3 ( Categories.QS_BFQ_V3, QS_BFQ_XI_V3, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Qianfen_V3 ( Categories.QS_BFQ_V3, QS_BFQ_QIAN_V3, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Yinfen_V3 ( Categories.QS_BFQ_V3, QS_BFQ_YIN_V3, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Lvfen_V3 ( Categories.QS_BFQ_V3, QS_BFQ_LV_V3, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Xinfen_V3 ( Categories.QS_BFQ_V3, QS_BFQ_XIN_V3, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Fenmobaofaqi_Meifen_V3 ( Categories.QS_BFQ_V3, QS_BFQ_MEI_V3, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        
    }
}
