package io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.jiqizhuce.qingshanjiqizhuce;

import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.Nonnull;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.machines.jiqi.qingshanjiqi.fenmobaofaqi.*;
import io.gitee.crankygoudan.tsingshantechnology.utils.C;
import io.gitee.crankygoudan.tsingshantechnology.utils.T;
import io.gitee.crankygoudan.tsingshantechnology.utils.Y;
import io.github.mooy1.infinitylib.machines.MachineBlock;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.machines.ElectricSmeltery;

import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanCaiLiao.*;
import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.jiqizhuce.qingshanjiqizhuce.QingShanJiQi.*;

public class QingShanJiQi_V2 {
    public static final SlimefunItemStack QS_SHEN_JI_YE_LIAN_CHANG = new SlimefunItemStack (
        "QS_SHEN_JI_YE_LIAN_CHANG",
        T.QS_SHEN_JI_YE_LIAN_CHANG,
        Y.colorPseudorandomString ("青山神级冶炼厂") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("冶炼厂"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(3000));
    public static final SlimefunItemStack QS_CHU_JI_FEN_MO_BAO_FA_QI = new SlimefunItemStack (
        "QS_CHU_JI_FEN_MO_BAO_FA_QI",
        T.QS_CHU_JI_FEN_MO_BAO_FA_QI,
        Y.colorPseudorandomString ("青山初级粉沫爆发器") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("圆石变为粉末"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(800));
    public static final SlimefunItemStack QS_SHEN_JI_FEN_MO_BAO_FA_QI = new SlimefunItemStack (
        "QS_SHEN__JI_FEN_MO_BAO_FA_QI",
        T.QS_SHEN_JI_FEN_MO_BAO_FA_QI,
        Y.colorPseudorandomString ("青山神级粉沫爆发器") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("圆石变为粉末"),
        MachineLore.speed(64),
        MachineLore.energyPerSecond(4000));
    public static final SlimefunItemStack QS_CHU_JI_YING_HUA_QI = new SlimefunItemStack (
        "QS_CHU_JI_YING_HUA_QI",
        T.QS_CHU_JI_YING_HUA_QI,
        Y.colorPseudorandomString ("青山初级硬化器") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("粉末变为锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(800));
    public static final SlimefunItemStack QS_SHEN_JI_YING_HUA_QI = new SlimefunItemStack (
        "QS_SHEN_JI_YING_HUA_QI",
        T.QS_SHEN_JI_YING_HUA_QI,
        Y.colorPseudorandomString ("青山神级硬化器") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("粉末变为锭"),
        MachineLore.speed(64),
        MachineLore.energyPerSecond(4000));

    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("金粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个金粉"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));

    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("铝粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个铝粉"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("镁粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个镁粉"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("铅粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个铅粉"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("铁粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个铁粉"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("铜粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个铜粉"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("锡粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个锡粉"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("锌粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个锌粉"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("银粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个银粉"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("金粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个金粉"),
        MachineLore.speed(8),
        MachineLore.energyPerSecond(250000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("铝粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个铝粉"),
        MachineLore.speed(8),
        MachineLore.energyPerSecond(250000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("镁粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个镁粉"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(250000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("铅粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个铅粉"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(250000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("铁粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个铁粉"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(250000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("铜粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个铜粉"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(250000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("锡粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个锡粉"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(250000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("锌粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个锌粉"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(250000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN",
        T. QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("银粉"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个银粉"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(250000));

    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("金锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个金锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("银锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个银锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("铜锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个铜锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("铁锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个铁锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("铝锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个铝锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("锌锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个锌锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("锡锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个锡锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("铅锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个铅锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN = new SlimefunItemStack (
        " QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN,
        Y.colorPseudorandomString ("初级定向粉沫爆发器") + " " + Y.colorPseudorandomString("镁锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产1个镁锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("金锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个金锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("银锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个银锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("铜锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个铜锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("铁锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个铁锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("铝锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个铝锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("锌锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个锌锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("锡锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个锡锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("铅锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个铅锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));
    public static final SlimefunItemStack QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN = new SlimefunItemStack (
        " QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN",
        T.QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN,
        Y.colorPseudorandomString ("高级定向粉沫爆发器") + " " + Y.colorPseudorandomString("镁锭"),
        Y.colorPseudorandomString("  "),
        Y.colorPseudorandomString("每秒生产8个镁锭"),
        MachineLore.speed(1),
        MachineLore.energyPerSecond(50000));


    public static void setup(TsingshanTechnology qs) {
        new ElectricSmeltery ( C.QS_JQ_V2, QS_SHEN_JI_YE_LIAN_CHANG, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.DAMASCUS_STEEL_INGOT,
            SlimefunItems.HEATING_COIL, SlimefunItems.POWER_CRYSTAL, SlimefunItems.HEATING_COIL,
            SlimefunItems.GILDED_IRON, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.GILDED_IRON
        } ).setCapacity ( 3000 ).setProcessingSpeed ( 5 ).setEnergyConsumption ( 3000 ).register ( qs );


        RandomizedItemStack twoDust = new RandomizedItemStack(
            new SlimefunItemStack(SlimefunItems.COPPER_DUST, 2),
            new SlimefunItemStack(SlimefunItems.ZINC_DUST, 2),
            new SlimefunItemStack(SlimefunItems.TIN_DUST, 2),
            new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 2),
            new SlimefunItemStack(SlimefunItems.LEAD_DUST, 2),
            new SlimefunItemStack(SlimefunItems.SILVER_DUST, 2),
            new SlimefunItemStack(SlimefunItems.GOLD_DUST, 2),
            new SlimefunItemStack(SlimefunItems.IRON_DUST, 2),
            new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 2) );
        new MachineBlock ( C.QS_JQ_V2, QS_CHU_JI_FEN_MO_BAO_FA_QI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            SlimefunItems.GOLD_DUST, SlimefunItems.GOLD_DUST, SlimefunItems.GOLD_DUST,
            SlimefunItems.GOLD_DUST, QS_DAIDAI_DE_TIE_KUAI, SlimefunItems.GOLD_DUST,
            SlimefunItems.GOLD_DUST, SlimefunItems.GOLD_DUST, SlimefunItems.GOLD_DUST,
        }).ticksPerOutput(1).addRecipe(twoDust, new ItemStack( Material.COBBLESTONE, 4))
            .addRecipe(twoDust, new ItemStack(Material.ANDESITE, 4))
            .addRecipe(twoDust, new ItemStack(Material.STONE, 4))
            .addRecipe(twoDust, new ItemStack(Material.DIORITE, 4))
            .addRecipe(twoDust, new ItemStack(Material.GRANITE, 4))
            .energyPerTick(800).register(qs);

        RandomizedItemStack sixtyFourDust = new RandomizedItemStack(
            new SlimefunItemStack(SlimefunItems.COPPER_DUST, 64),
            new SlimefunItemStack(SlimefunItems.ZINC_DUST, 64),
            new SlimefunItemStack(SlimefunItems.TIN_DUST, 64),
            new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 64),
            new SlimefunItemStack(SlimefunItems.LEAD_DUST, 64),
            new SlimefunItemStack(SlimefunItems.SILVER_DUST, 64),
            new SlimefunItemStack(SlimefunItems.GOLD_DUST, 64),
            new SlimefunItemStack(SlimefunItems.IRON_DUST, 64),
            new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 64) );
        new MachineBlock ( C.QS_JQ_V2, QS_SHEN_JI_FEN_MO_BAO_FA_QI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            QS_CHU_JI_FEN_MO_BAO_FA_QI, QS_SHI_MO_XI_QI_NING_JIAO, QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_QING_SHAN_GAI_TAI_KUANG, QS_QING_SHAN_NA_MI_DIAN, QS_QING_SHAN_GAI_TAI_KUANG,
            QS_CHU_JI_FEN_MO_BAO_FA_QI, QS_SHI_MO_XI_QI_NING_JIAO, QS_CHU_JI_FEN_MO_BAO_FA_QI,
        }).addRecipe(sixtyFourDust, new ItemStack(Material.COBBLESTONE, 64))
            .addRecipe(sixtyFourDust, new ItemStack(Material.ANDESITE, 64))
            .addRecipe(sixtyFourDust, new ItemStack(Material.STONE, 64))
            .addRecipe(sixtyFourDust, new ItemStack(Material.DIORITE, 64))
            .addRecipe(sixtyFourDust, new ItemStack(Material.GRANITE, 64))
            .ticksPerOutput(1).energyPerTick(40000).register(qs);

        new MachineBlock(C.QS_JQ_V2, QS_CHU_JI_YING_HUA_QI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            new ItemStack (Material.IRON_INGOT ), new ItemStack (Material.IRON_INGOT ), new ItemStack (Material.IRON_INGOT ),
            new ItemStack (Material.IRON_INGOT ),QS_DAIDAI_DE_ZUAN_SHI_KUAI, new ItemStack (Material.IRON_INGOT ),
            new ItemStack (Material.IRON_INGOT ), new ItemStack (Material.IRON_INGOT ), new ItemStack (Material.IRON_INGOT ),
        }).addRecipe(new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 4), new SlimefunItemStack(SlimefunItems.COPPER_DUST, 8))
            .addRecipe(new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 4), new SlimefunItemStack(SlimefunItems.ZINC_DUST, 8))
            .addRecipe(new SlimefunItemStack(SlimefunItems.TIN_INGOT, 4), new SlimefunItemStack(SlimefunItems.TIN_DUST, 8))
            .addRecipe(new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 4), new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 8))
            .addRecipe(new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 4), new SlimefunItemStack(SlimefunItems.LEAD_DUST, 8))
            .addRecipe(new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 4), new SlimefunItemStack(SlimefunItems.SILVER_DUST, 8))
            .addRecipe(new SlimefunItemStack(SlimefunItems.GOLD_24K, 1), new SlimefunItemStack(SlimefunItems.GOLD_DUST, 8))
            .addRecipe(new ItemStack(Material.IRON_INGOT, 4), new SlimefunItemStack(SlimefunItems.IRON_DUST, 8))
            .addRecipe(new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 4), new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 8))
            .ticksPerOutput(1).energyPerTick(800).register(qs);

        new MachineBlock(C.QS_JQ_V2, QS_SHEN_JI_YING_HUA_QI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            QS_CHU_JI_YING_HUA_QI,QS_SHI_MO_XI_QI_NING_JIAO,   QS_CHU_JI_YING_HUA_QI,
            QS_QING_SHAN_PAO_MO, QS_QING_SHAN_NA_MI_DIAN, QS_QING_SHAN_PAO_MO,
           QS_QING_SHAN_PAO_MO,QS_SHI_MO_XI_QI_NING_JIAO, QS_QING_SHAN_PAO_MO,
    }).addRecipe(new SlimefunItemStack(SlimefunItems.COPPER_INGOT,64), new SlimefunItemStack(SlimefunItems.COPPER_DUST, 64))
        .addRecipe(new SlimefunItemStack(SlimefunItems.ZINC_INGOT,64), new SlimefunItemStack(SlimefunItems.ZINC_DUST, 64))
        .addRecipe(new SlimefunItemStack(SlimefunItems.TIN_INGOT,64), new SlimefunItemStack(SlimefunItems.TIN_DUST, 64))
        .addRecipe(new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,64), new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 64))
        .addRecipe(new SlimefunItemStack(SlimefunItems.LEAD_INGOT,64), new SlimefunItemStack(SlimefunItems.LEAD_DUST, 64))
        .addRecipe(new SlimefunItemStack(SlimefunItems.SILVER_INGOT,64), new SlimefunItemStack(SlimefunItems.SILVER_DUST, 64))
        .addRecipe(new SlimefunItemStack(SlimefunItems.GOLD_24K, 22), new SlimefunItemStack(SlimefunItems.GOLD_DUST, 64))
        .addRecipe(new ItemStack(Material.IRON_INGOT,64), new SlimefunItemStack(SlimefunItems.IRON_DUST, 64))
        .addRecipe(new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT,64), new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 64))
        .ticksPerOutput(1).energyPerTick(4000).register(qs);

        new ChuJiDinXiangFenMoBaoFaQi_JINFEN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YUAN_SHI_ZHI_ZAO_JI, SlimefunItems.ELECTRIC_GOLD_PAN_3, QS_YUAN_SHI_ZHI_ZAO_JI,
            SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.GOLD_DUST, SlimefunItems.ELECTRIC_ORE_GRINDER_3,
            QS_YUAN_SHI_ZHI_ZAO_JI, QS_YUAN_SHI_BAO_FA_QI_I,QS_YUAN_SHI_ZHI_ZAO_JI
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_JINFEN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN,
            QS_YUAN_SHI_BAO_FA_QI_II,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN,    QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN
        }).register ( qs );
        new ChuJiDinXiangFenMoBaoFaQi_LVFEN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YUAN_SHI_ZHI_ZAO_JI, SlimefunItems.ELECTRIC_GOLD_PAN_3, QS_YUAN_SHI_ZHI_ZAO_JI,
            SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ALUMINUM_DUST, SlimefunItems.ELECTRIC_ORE_GRINDER_3,
            QS_YUAN_SHI_ZHI_ZAO_JI, QS_YUAN_SHI_BAO_FA_QI_I,QS_YUAN_SHI_ZHI_ZAO_JI
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_LVFEN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN,
            QS_YUAN_SHI_BAO_FA_QI_II, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN, QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN
        }).register ( qs );
        new ChuJiDinXiangFenMoBaoFaQi_MEIFEN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YUAN_SHI_ZHI_ZAO_JI, SlimefunItems.ELECTRIC_GOLD_PAN_3, QS_YUAN_SHI_ZHI_ZAO_JI,
            SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.MAGNESIUM_DUST, SlimefunItems.ELECTRIC_ORE_GRINDER_3,
            QS_YUAN_SHI_ZHI_ZAO_JI, QS_YUAN_SHI_BAO_FA_QI_I,QS_YUAN_SHI_ZHI_ZAO_JI
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_MEIFEN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN,
            QS_YUAN_SHI_BAO_FA_QI_II,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN,    QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN
        }).register ( qs );
        new ChuJiDinXiangFenMoBaoFaQi_QIANFEN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YUAN_SHI_ZHI_ZAO_JI, SlimefunItems.ELECTRIC_GOLD_PAN_3, QS_YUAN_SHI_ZHI_ZAO_JI,
            SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.LEAD_DUST, SlimefunItems.ELECTRIC_ORE_GRINDER_3,
            QS_YUAN_SHI_ZHI_ZAO_JI, QS_YUAN_SHI_BAO_FA_QI_I,QS_YUAN_SHI_ZHI_ZAO_JI
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_QIANFEN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN,
            QS_YUAN_SHI_BAO_FA_QI_II,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN,    QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN
        }).register ( qs );
        new ChuJiDinXiangFenMoBaoFaQi_TIEFEN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YUAN_SHI_ZHI_ZAO_JI, SlimefunItems.ELECTRIC_GOLD_PAN_3, QS_YUAN_SHI_ZHI_ZAO_JI,
            SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.IRON_DUST, SlimefunItems.ELECTRIC_ORE_GRINDER_3,
            QS_YUAN_SHI_ZHI_ZAO_JI, QS_YUAN_SHI_BAO_FA_QI_I,QS_YUAN_SHI_ZHI_ZAO_JI
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_TIEFEN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN,
            QS_YUAN_SHI_BAO_FA_QI_II,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN,    QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN
        }).register ( qs );

        new ChuJiDinXiangFenMoBaoFaQi_TONGFEN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YUAN_SHI_ZHI_ZAO_JI, SlimefunItems.ELECTRIC_GOLD_PAN_3, QS_YUAN_SHI_ZHI_ZAO_JI,
            SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.COPPER_DUST, SlimefunItems.ELECTRIC_ORE_GRINDER_3,
            QS_YUAN_SHI_ZHI_ZAO_JI, QS_YUAN_SHI_BAO_FA_QI_I,QS_YUAN_SHI_ZHI_ZAO_JI
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_TONGFEN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN,
            QS_YUAN_SHI_BAO_FA_QI_II,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN,    QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN
        }).register ( qs );

        new ChuJiDinXiangFenMoBaoFaQi_XIFEN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YUAN_SHI_ZHI_ZAO_JI, SlimefunItems.ELECTRIC_GOLD_PAN_3, QS_YUAN_SHI_ZHI_ZAO_JI,
            SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.TIN_DUST, SlimefunItems.ELECTRIC_ORE_GRINDER_3,
            QS_YUAN_SHI_ZHI_ZAO_JI, QS_YUAN_SHI_BAO_FA_QI_I,QS_YUAN_SHI_ZHI_ZAO_JI
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_XIFEN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN,
            QS_YUAN_SHI_BAO_FA_QI_II,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN,    QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN
        }).register ( qs );

        new ChuJiDinXiangFenMoBaoFaQi_XINFEN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YUAN_SHI_ZHI_ZAO_JI, SlimefunItems.ELECTRIC_GOLD_PAN_3, QS_YUAN_SHI_ZHI_ZAO_JI,
            SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.ZINC_DUST, SlimefunItems.ELECTRIC_ORE_GRINDER_3,
            QS_YUAN_SHI_ZHI_ZAO_JI, QS_YUAN_SHI_BAO_FA_QI_I,QS_YUAN_SHI_ZHI_ZAO_JI
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_XINFEN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN,
            QS_YUAN_SHI_BAO_FA_QI_II,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN,    QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN
        }).register ( qs );

        new ChuJiDinXiangFenMoBaoFaQi_YINFEN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YUAN_SHI_ZHI_ZAO_JI, SlimefunItems.ELECTRIC_GOLD_PAN_3, QS_YUAN_SHI_ZHI_ZAO_JI,
            SlimefunItems.ELECTRIC_DUST_WASHER_3, SlimefunItems.SILVER_DUST, SlimefunItems.ELECTRIC_ORE_GRINDER_3,
            QS_YUAN_SHI_ZHI_ZAO_JI, QS_YUAN_SHI_BAO_FA_QI_I,QS_YUAN_SHI_ZHI_ZAO_JI
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_YINFEN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN,
            QS_YUAN_SHI_BAO_FA_QI_II,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN,    QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN,  QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN
        }).register ( qs );




        new ChuJiDinXiangFenMoBaoFaQi_JINDIN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_FEN, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_JINDIN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN,
            QS_CHU_JI_FEN_MO_BAO_FA_QI, QS_CHU_JI_YING_HUA_QI, QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_JIN_DIN,
        }).register ( qs );



        new ChuJiDinXiangFenMoBaoFaQi_YINDIN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_FEN, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_YINDIN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN,
            QS_CHU_JI_FEN_MO_BAO_FA_QI, QS_CHU_JI_YING_HUA_QI, QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_YIN_DIN,
        }).register ( qs );



        new ChuJiDinXiangFenMoBaoFaQi_TONGDIN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_FEN, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_TONGDIN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN,
            QS_CHU_JI_FEN_MO_BAO_FA_QI, QS_CHU_JI_YING_HUA_QI, QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TONG_DIN,
        }).register ( qs );



        new ChuJiDinXiangFenMoBaoFaQi_TIEDIN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_FEN, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_TIEDIN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN,
            QS_CHU_JI_FEN_MO_BAO_FA_QI, QS_CHU_JI_YING_HUA_QI, QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_TIE_DIN,
        }).register ( qs );



        new ChuJiDinXiangFenMoBaoFaQi_LVDIN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_FEN, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_LVDIN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN,
            QS_CHU_JI_FEN_MO_BAO_FA_QI, QS_CHU_JI_YING_HUA_QI, QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_LV_DIN,
        }).register ( qs );



        new ChuJiDinXiangFenMoBaoFaQi_XINDIN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_FEN, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_XINDIN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN,
            QS_CHU_JI_FEN_MO_BAO_FA_QI, QS_CHU_JI_YING_HUA_QI, QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XIN_DIN,
        }).register ( qs );



        new ChuJiDinXiangFenMoBaoFaQi_XIDIN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_FEN, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_XIDIN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN,
            QS_CHU_JI_FEN_MO_BAO_FA_QI, QS_CHU_JI_YING_HUA_QI, QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_XI_DIN,
        }).register ( qs );



        new ChuJiDinXiangFenMoBaoFaQi_QIANDIN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_FEN, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_QIANDIN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN,
            QS_CHU_JI_FEN_MO_BAO_FA_QI, QS_CHU_JI_YING_HUA_QI, QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_QIAN_DIN,
        }).register ( qs );




        new ChuJiDinXiangFenMoBaoFaQi_MEIDIN_V1 ( C.QS_JQ_V2, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_FEN, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
            SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
        }).register ( qs );
        new GaoJiDinXiangFenMoBaoFaQi_MEIDIN_V2 ( C.QS_JQ_V2, QS_GAO_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN,
            QS_CHU_JI_FEN_MO_BAO_FA_QI, QS_CHU_JI_YING_HUA_QI, QS_CHU_JI_FEN_MO_BAO_FA_QI,
            QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN, QS_CHU_JI_DIN_XIANG_FEN_MO_BAO_FA_QI_MEI_DIN,
        }).register ( qs );






    }
    private static final class RandomizedItemStack extends ItemStack {

        private final ItemStack[] items;

        public RandomizedItemStack(ItemStack... outputs) {
            super(outputs[0]);
            this.items = outputs;
        }

        @Nonnull
        @Override
        public ItemStack clone() {
            return this.items[ThreadLocalRandom.current().nextInt(this.items.length)].clone();
        }

    }
    }
