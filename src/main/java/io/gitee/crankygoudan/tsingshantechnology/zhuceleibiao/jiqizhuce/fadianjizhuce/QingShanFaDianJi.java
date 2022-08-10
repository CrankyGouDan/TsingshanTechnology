package io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.jiqizhuce.fadianjizhuce;

import org.bukkit.inventory.ItemStack;

import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.machines.generators.EnergyGenerator;
import io.gitee.crankygoudan.tsingshantechnology.machines.generators.GenerationType;
import io.gitee.crankygoudan.tsingshantechnology.utils.C;
import io.gitee.crankygoudan.tsingshantechnology.utils.T;
import io.gitee.crankygoudan.tsingshantechnology.utils.Y;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

import lombok.experimental.UtilityClass;

import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanCaiLiao.*;
import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanYaSuoCaiLiao.QS_SAN_JIE_YUAN_SU_JIE_JING;
@UtilityClass
public final class QingShanFaDianJi {


    private static final int PAOPAOFADIANJI_FDL = 50_000;
    private static final int FADIANJI_FDL_1 = 600000;
    private static final int FADIANJI_FDL_2 = 7500000;
    private static final int FADIANJI_FDL_3 = 25000000;
    private static final int FADIANJI_FDL_4 = 250000000;

    public static final SlimefunItemStack QS_PAO_PAO_FA_DIAN_JI = new SlimefunItemStack (
        "QS_PAO_PAO_FA_DIAN_JI",
        T.QS_PAO_PAO_FA_DIAN_JI,
        Y.colorPseudorandomString ("跑跑发电机") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("   "),
        Y.colorPseudorandomString("可在任意时间发电"),
        Y.colorPseudorandomString("太阳能发电机,需要露天"),
        Y.colorPseudorandomString("挖掘后较容易损坏"),
        Y.colorPseudorandomString("挖掘过造成损坏损失紫行承担"),
        MachineLore.energyBuffer(PAOPAOFADIANJI_FDL * 5),
        MachineLore.energyPerSecond(PAOPAOFADIANJI_FDL)
    );
    public static final SlimefunItemStack QS_I_FA_DIAN_JI = new SlimefunItemStack (
        "QS_I_FADIANJI_FDL",
        T.QS_PAO_PAO_FA_DIAN_JI,
        Y.colorPseudorandomString ("？-发电机") + " " + Y.colorPseudorandomString("待冠名 "),
        Y.colorPseudorandomString("   "),
        Y.colorPseudorandomString("可在任意时间发电"),
        Y.colorPseudorandomString("太阳能发电机,需要露天"),
        Y.colorPseudorandomString("挖掘后较容易损坏"),
        Y.colorPseudorandomString("挖掘过造成损坏损失紫行承担"),
        MachineLore.energyBuffer(FADIANJI_FDL_1 * 5),
        MachineLore.energyPerSecond(FADIANJI_FDL_1)
    );
    public static final SlimefunItemStack QS_II_FA_DIAN_JI = new SlimefunItemStack (
        "QS_II_FADIANJI_FDL",
        T.QS_PAO_PAO_FA_DIAN_JI,
        Y.colorPseudorandomString ("？？-发电机") + " " + Y.colorPseudorandomString("待冠名 "),
        Y.colorPseudorandomString("   "),
        Y.colorPseudorandomString("可在任意时间发电"),
        Y.colorPseudorandomString("太阳能发电机,需要露天"),
        Y.colorPseudorandomString("挖掘后较容易损坏"),
        Y.colorPseudorandomString("挖掘过造成损坏损失紫行承担"),
        MachineLore.energyBuffer(FADIANJI_FDL_2 * 5),
        MachineLore.energyPerSecond(FADIANJI_FDL_2)
    );
    public static final SlimefunItemStack QS_III_FA_DIAN_JI= new SlimefunItemStack (
        "QS_III_FADIANJI_FDL",
        T.QS_PAO_PAO_FA_DIAN_JI,
        Y.colorPseudorandomString ("？？？-发电机") + " " + Y.colorPseudorandomString("待冠名 "),
        Y.colorPseudorandomString("   "),
        Y.colorPseudorandomString("可在任意时间发电"),
        Y.colorPseudorandomString("太阳能发电机,需要露天"),
        Y.colorPseudorandomString("挖掘后较容易损坏"),
        Y.colorPseudorandomString("挖掘过造成损坏损失紫行承担"),
        MachineLore.energyBuffer(FADIANJI_FDL_3 * 5),
        MachineLore.energyPerSecond(FADIANJI_FDL_3)
    );
    public static final SlimefunItemStack QS_IIII_FA_DIAN_JI = new SlimefunItemStack (
        "QS_IIII_FADIANJI_FDL",
        T.QS_PAO_PAO_FA_DIAN_JI,
        Y.colorPseudorandomString ("？？？？-发电机") + " " + Y.colorPseudorandomString("待冠名 "),
        Y.colorPseudorandomString("   "),
        Y.colorPseudorandomString("可在任意时间发电"),
        Y.colorPseudorandomString("太阳能发电机,需要露天"),
        Y.colorPseudorandomString("挖掘后较容易损坏"),
        Y.colorPseudorandomString("挖掘过造成损坏损失紫行承担"),
        MachineLore.energyBuffer(FADIANJI_FDL_4 * 5),
        MachineLore.energyPerSecond(FADIANJI_FDL_4)
    );

    public static void setup(TsingshanTechnology qs) {



        new EnergyGenerator ( C.QS_FDJ, QS_PAO_PAO_FA_DIAN_JI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SAN_JIE_YUAN_SU_JIE_JING, QS_SAN_JIE_YUAN_SU_JIE_JING, QS_SAN_JIE_YUAN_SU_JIE_JING,
            QS_SAN_JIE_YUAN_SU_JIE_JING, QS_JI_YAN, QS_SAN_JIE_YUAN_SU_JIE_JING,
            QS_SAN_JIE_YUAN_SU_JIE_JING, QS_SAN_JIE_YUAN_SU_JIE_JING, QS_SAN_JIE_YUAN_SU_JIE_JING
        }, PAOPAOFADIANJI_FDL, GenerationType.PAOPAOFADIANJI).register(qs);

        new EnergyGenerator ( C.QS_FDJ, QS_I_FA_DIAN_JI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_PAO_PAO_FA_DIAN_JI,QS_SHI_MO_XI_BAN,QS_PAO_PAO_FA_DIAN_JI,
            QS_PAO_PAO_FA_DIAN_JI,QS_CHAO_JI_LONG_DAN,QS_PAO_PAO_FA_DIAN_JI,
            QS_PAO_PAO_FA_DIAN_JI,QS_SHI_MO_XI_BAN,QS_PAO_PAO_FA_DIAN_JI
        }, FADIANJI_FDL_1, GenerationType.I_FADIANJI_FDL).register(qs);

        new EnergyGenerator ( C.QS_FDJ, QS_II_FA_DIAN_JI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_I_FA_DIAN_JI,QS_I_FA_DIAN_JI,QS_I_FA_DIAN_JI,
            QS_I_FA_DIAN_JI,QS_SHI_MO_XI_QI_NING_JIAO,QS_I_FA_DIAN_JI,
            QS_I_FA_DIAN_JI,QS_I_FA_DIAN_JI,QS_I_FA_DIAN_JI,
        }, FADIANJI_FDL_2, GenerationType.I_FADIANJI_FDL).register(qs);

        new EnergyGenerator ( C.QS_FDJ, QS_III_FA_DIAN_JI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_II_FA_DIAN_JI,QS_ZI_JING_MO_HE,QS_II_FA_DIAN_JI,
            QS_ZI_JING_MO_HE,QS_II_FA_DIAN_JI,QS_ZI_JING_MO_HE,
            QS_II_FA_DIAN_JI,QS_ZI_JING_MO_HE,QS_II_FA_DIAN_JI
        }, FADIANJI_FDL_3, GenerationType.I_FADIANJI_FDL).register(qs);

        new EnergyGenerator ( C.QS_FDJ, QS_IIII_FA_DIAN_JI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_IIII_FA_DIAN_JI,QS_IIII_FA_DIAN_JI,QS_IIII_FA_DIAN_JI,
            QS_IIII_FA_DIAN_JI,QS_KE_JI_ZHI_XIN,QS_IIII_FA_DIAN_JI,
            QS_IIII_FA_DIAN_JI,QS_IIII_FA_DIAN_JI,QS_IIII_FA_DIAN_JI,
        }, FADIANJI_FDL_4, GenerationType.I_FADIANJI_FDL).register(qs);





    }

}
