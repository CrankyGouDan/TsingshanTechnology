package io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.jiqizhuce.qingshanjiqizhuce;

import org.bukkit.inventory.ItemStack;

import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.machines.jiqi.qingshanjiqi.fenmobaofaqi.*;
import io.gitee.crankygoudan.tsingshantechnology.utils.C;
import io.gitee.crankygoudan.tsingshantechnology.utils.T;
import io.gitee.crankygoudan.tsingshantechnology.utils.Y;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.jiqizhuce.qingshanjiqizhuce.QingShanJiQi_V2.*;
import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.jiqizhuce.qingshanjiqizhuce.QingShanJiQi.*;


public class QingShanJiQi_V3 {

    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN,
        Y.colorPseudorandomString ( "神级定向粉沫爆发器" ) + " " + Y.colorPseudorandomString ( "金粉" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个金粉" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond ( 500000 ) );
    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN,
        Y.colorPseudorandomString ( "神级定向粉沫爆发器" ) + " " + Y.colorPseudorandomString ( "铝粉" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个铝粉" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));
    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN,
        Y.colorPseudorandomString ( "神级定向粉沫爆发器" ) + " " + Y.colorPseudorandomString ( "镁粉" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个镁粉" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));
    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN,
        Y.colorPseudorandomString ( "神级定向粉沫爆发器" ) + " " + Y.colorPseudorandomString ( "铅粉" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个铅粉" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));
    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN,
        Y.colorPseudorandomString ( "神级定向粉沫爆发器" ) + " " + Y.colorPseudorandomString ( "铁粉" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个铁粉" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));
    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN,
        Y.colorPseudorandomString ( "神级定向粉沫爆发器" ) + " " + Y.colorPseudorandomString ( "铜粉" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个铜粉" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));
    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN,
        Y.colorPseudorandomString ( "神级定向粉沫爆发器" ) + " " + Y.colorPseudorandomString ( "锡粉" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个锡粉" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));
    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN,
        Y.colorPseudorandomString ( "神级定向粉沫爆发器" ) + " " + Y.colorPseudorandomString ( "锌粉" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个锌粉" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));
    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN,
        Y.colorPseudorandomString ( "神级定向粉沫爆发器" ) + " " + Y.colorPseudorandomString ( "银粉" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个银粉" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));

    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN,
        Y.colorPseudorandomString ( "神级定向金属爆发器" ) + " " + Y.colorPseudorandomString ( "金锭" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个金锭" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));
    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN,
        Y.colorPseudorandomString ( "神级定向金属爆发器" ) + " " + Y.colorPseudorandomString ( "银锭" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个银锭" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));
    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN,
        Y.colorPseudorandomString ( "神级定向金属爆发器" ) + " " + Y.colorPseudorandomString ( "铜锭" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个铜锭" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));
    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN,
        Y.colorPseudorandomString ( "神级定向金属爆发器" ) + " " + Y.colorPseudorandomString ( "铁锭" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个铁锭" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));
    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN,
        Y.colorPseudorandomString ( "神级定向金属爆发器" ) + " " + Y.colorPseudorandomString ( "铝锭" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个铝锭" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));
    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN,
        Y.colorPseudorandomString ( "神级定向金属爆发器" ) + " " + Y.colorPseudorandomString ( "锌锭" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个锌锭" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));
    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN,
        Y.colorPseudorandomString ( "神级定向金属爆发器" ) + " " + Y.colorPseudorandomString ( "锡锭" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个锡锭" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));
    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN,
        Y.colorPseudorandomString ( "神级定向金属爆发器" ) + " " + Y.colorPseudorandomString ( "铅锭" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个铅锭" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));
    public static final SlimefunItemStack QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN = new SlimefunItemStack (
        " QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN,
        Y.colorPseudorandomString ( "神级定向金属爆发器" ) + " " + Y.colorPseudorandomString ( "镁锭" ),
        Y.colorPseudorandomString ( "  " ),
        Y.colorPseudorandomString ( "每秒生产64个镁锭" ),
        MachineLore.speed ( 64 ),
        MachineLore.energyPerSecond (500000));


    public static void setup(TsingshanTechnology qs) {
        new ShenJiDinXiangFenMoBaoFaQi_JINFEN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN,
            QS_YUAN_SHI_BAO_FA_QI_III, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN
        }).register ( qs );
        new ShenJiDinXiangFenMoBaoFaQi_LVFEN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN,
            QS_YUAN_SHI_BAO_FA_QI_III, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN
        }).register ( qs );
        new ShenJiDinXiangFenMoBaoFaQi_MEIFEN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN,
            QS_YUAN_SHI_BAO_FA_QI_III, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN
        }).register ( qs );
        new ShenJiDinXiangFenMoBaoFaQi_QIANFEN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN,
            QS_YUAN_SHI_BAO_FA_QI_III, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN
        }).register ( qs );
        new ShenJiDinXiangFenMoBaoFaQi_TIEFEN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN,
            QS_YUAN_SHI_BAO_FA_QI_III, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN
        }).register ( qs );
        new ShenJiDinXiangFenMoBaoFaQi_TONGFEN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN,
            QS_YUAN_SHI_BAO_FA_QI_III, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN
        }).register ( qs );
        new ShenJiDinXiangFenMoBaoFaQi_XIFEN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN,
            QS_YUAN_SHI_BAO_FA_QI_III, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN
        }).register ( qs );
        new ShenJiDinXiangFenMoBaoFaQi_XINFEN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN,
            QS_YUAN_SHI_BAO_FA_QI_III, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN
        }).register ( qs );
        new ShenJiDinXiangFenMoBaoFaQi_YINFEN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN,
            QS_YUAN_SHI_BAO_FA_QI_III, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN
        }).register ( qs );

        new ShenJiDinXiangFenMoBaoFaQi_JINDIN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN,
            QS_SHEN_JI_FEN_MO_BAO_FA_QI, QS_SHEN_JI_YING_HUA_QI, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN
        }).register ( qs );
        new ShenJiDinXiangFenMoBaoFaQi_YINDIN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN,
            QS_SHEN_JI_FEN_MO_BAO_FA_QI, QS_SHEN_JI_YING_HUA_QI, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN
        }).register ( qs );
        new ShenJiDinXiangFenMoBaoFaQi_TONGDIN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN,
            QS_SHEN_JI_FEN_MO_BAO_FA_QI, QS_SHEN_JI_YING_HUA_QI, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN
        }).register ( qs );
        new ShenJiDinXiangFenMoBaoFaQi_TIEDIN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN,
            QS_SHEN_JI_FEN_MO_BAO_FA_QI, QS_SHEN_JI_YING_HUA_QI, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN
        }).register ( qs );
        new ShenJiDinXiangFenMoBaoFaQi_LVDIN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN,
            QS_SHEN_JI_FEN_MO_BAO_FA_QI, QS_SHEN_JI_YING_HUA_QI, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN
        }).register ( qs );
        new ShenJiDinXiangFenMoBaoFaQi_XINDIN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN,
            QS_SHEN_JI_FEN_MO_BAO_FA_QI, QS_SHEN_JI_YING_HUA_QI, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN
        }).register ( qs );
        new ShenJiDinXiangFenMoBaoFaQi_XIDIN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN,
            QS_SHEN_JI_FEN_MO_BAO_FA_QI, QS_SHEN_JI_YING_HUA_QI, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN
        }).register ( qs );
        new ShenJiDinXiangFenMoBaoFaQi_QIANDIN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN,
            QS_SHEN_JI_FEN_MO_BAO_FA_QI, QS_SHEN_JI_YING_HUA_QI, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN
        }).register ( qs );
        new ShenJiDinXiangFenMoBaoFaQi_MEIDIN_V3 ( C.QS_JQ_V3, QS_SHEN_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN,
            QS_SHEN_JI_FEN_MO_BAO_FA_QI, QS_SHEN_JI_YING_HUA_QI, QS_SHEN_JI_FEN_MO_BAO_FA_QI,
            QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN
        }).register ( qs );
    }
}
