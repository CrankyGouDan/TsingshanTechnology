package io.gitee.crankygoudan.tsingshantechnology.items.chucun;


import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.utils.C;
import io.gitee.crankygoudan.tsingshantechnology.utils.T;
import io.gitee.crankygoudan.tsingshantechnology.utils.Y;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import lombok.experimental.UtilityClass;

import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanCaiLiao.*;
import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanYaSuoCaiLiao.*;

@UtilityClass
public final class Storage {

    /**
     * 存储制造机
     */
    public static final SlimefunItemStack QS_RO_HE_BAO_XIANG = new SlimefunItemStack(
            "QS_RO_HE_BAO_XIANG ",
            Material.HORN_CORAL_BLOCK,
        Y.colorPseudorandomString("融合宝箱") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString ("制造或升级箱子"),
        Y.colorPseudorandomString ("必须放在水周围")
    );
    /**
     * 这是存储的容量
     */
    private static final int MU_XIANG = 5000;
    private static final int TIE_XIANG = 58611;
    private static final int JIN_XIANG = 108611;
    private static final int ZUAN_SHI_XIANG = 508611;
    private static final int CHU_XUE_ZHE_BAO_XIANG = 1008611;
    private static final int BIAO_ZHUN_REN_WU_BAO_XIANG = 5108611;
    private static final int QIANG_DA_DE_REN_WU_BAO_XIANG = 11008611;
    private static final int JIE_JING_SHI_SHI_REN_WU_BAO_XIANG = 51008611;
    private static final int MI_FENG_SHI_SHI_REN_WU_BAO_XIANG = 101008611;
    private static final int HUANG_JIA_SHI_SHI_REN_WU_BAO_XIANG = 501008611;
    private static final int XIE_JIAO_SHI_SHI_REN_WU_BAO_XIANG = 1001008611;
    private static final int DA_LI_SHI_SHI_SHI_REN_WU_BAO_XIANG = 1501008611;
    private static final int WU_XIAO_DE_SHI_SHI_REN_WU_BAO_XIANG = 2001008611;

    /**
     * 存储注册
     */
    public static final SlimefunItemStack QS_MU_XIANG = new SlimefunItemStack(
        "QS_MU_XIANG",
        T.QS_MU_XIANG,
        Y.colorPseudorandomString ("木箱") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("容量： ") + MachineLore.format(MU_XIANG) + Y.colorPseudorandomString (" 个物品")
    );
    public static final SlimefunItemStack QS_TIE_XIANG = new SlimefunItemStack(
        "QS_TIE_XIANG",
        T.QS_TIE_XIANG,
        Y.colorPseudorandomString ("铁箱") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("容量： ") + MachineLore.format(TIE_XIANG) + Y.colorPseudorandomString (" 个物品")
    );
    public static final SlimefunItemStack QS_JIN_XIANG = new SlimefunItemStack(
        "QS_JIN_XIANG",
        T.QS_JIN_XIANG,
        Y.colorPseudorandomString ("金箱") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("容量： ") + MachineLore.format(JIN_XIANG) + Y.colorPseudorandomString (" 个物品")
    );
    public static final SlimefunItemStack QS_ZUAN_SHI_XIANG = new SlimefunItemStack(
        "ZUAN_SHI_XIANG",
        T.QS_ZUAN_SHI_XIANG,
        Y.colorPseudorandomString ("钻石箱") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("容量： ") + MachineLore.format(ZUAN_SHI_XIANG) + Y.colorPseudorandomString (" 个物品")
    );

    public static final SlimefunItemStack QS_CHU_XUE_ZHE_BAO_XIANG = new SlimefunItemStack(
            "QS_CHU_XUE_ZHE_BAO_XIANG",
            T.QS_CHU_XUE_ZHE_BAO_XIANG,
        Y.colorPseudorandomString ("初学者任务箱") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("容量： ") + MachineLore.format(CHU_XUE_ZHE_BAO_XIANG) + Y.colorPseudorandomString (" 个物品")
    );
    public static final SlimefunItemStack QS_BIAO_ZHUN_REN_WU_BAO_XIANG = new SlimefunItemStack(
        "QS_BIAO_ZHUN_REN_WU_BAO_XIANG",
        T.QS_BIAO_ZHUN_REN_WU_BAO_XIANG,
        Y.colorPseudorandomString ("标准任务箱") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("容量： ") + MachineLore.format(BIAO_ZHUN_REN_WU_BAO_XIANG) + Y.colorPseudorandomString (" 个物品")
    );

    public static final SlimefunItemStack QS_QIANG_DA_DE_REN_WU_BAO_XIANG = new SlimefunItemStack(
        "QS_QIANG_DA_DE_REN_WU_BAO_XIANG",
        T.QS_QIANG_DA_DE_REN_WU_BAO_XIANG,
        Y.colorPseudorandomString ("强大的任务宝箱") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("容量： ") + MachineLore.format(QIANG_DA_DE_REN_WU_BAO_XIANG) + Y.colorPseudorandomString (" 个物品")
    );

    public static final SlimefunItemStack QS_JIE_JING_SHI_SHI_REN_WU_BAO_XIANG = new SlimefunItemStack(
        "JIE_JING_SHI_SHI_REN_WU_BAO_XIANG",
        T.QS_JIE_JING_SHI_SHI_REN_WU_BAO_XIANG,
        Y.colorPseudorandomString ("结晶史诗任务宝箱") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("容量： ") + MachineLore.format(JIE_JING_SHI_SHI_REN_WU_BAO_XIANG) + Y.colorPseudorandomString (" 个物品")
    );

    public static final SlimefunItemStack QS_MI_FENG_SHI_SHI_REN_WU_BAO_XIANG = new SlimefunItemStack(
        "QS_JIE_JING_SHI_SHI_REN_WU_XIANG",
        T.QS_MI_FENG_SHI_SHI_REN_WU_BAO_XIANG,
        Y.colorPseudorandomString ("蜜蜂史诗任务宝箱") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("容量： ") + MachineLore.format(MI_FENG_SHI_SHI_REN_WU_BAO_XIANG) + Y.colorPseudorandomString (" 个物品")
    );

    public static final SlimefunItemStack QS_HUANG_JIA_SHI_SHI_REN_WU_BAO_XIANG = new SlimefunItemStack(
        "QS_HUANG_JIA_SHI_SHI_REN_WU_XIANG",
        T.QS_HUANG_JIA_SHI_SHI_REN_WU_BAO_XIANG,
        Y.colorPseudorandomString ("皇家史诗任务宝箱") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("容量： ") + MachineLore.format(HUANG_JIA_SHI_SHI_REN_WU_BAO_XIANG) + Y.colorPseudorandomString (" 个物品")
    );

    public static final SlimefunItemStack QS_XIE_JIAO_SHI_SHI_REN_WU_BAO_XIANG = new SlimefunItemStack(
        "QS_XIE_JIAO_SHI_SHI_REN_WU_BAO_XIANG",
        T.QS_XIE_JIAO_SHI_SHI_REN_WU_BAO_XIANG,
        Y.colorPseudorandomString ("邪教史诗任务宝箱") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("容量： ") + MachineLore.format(XIE_JIAO_SHI_SHI_REN_WU_BAO_XIANG) + Y.colorPseudorandomString (" 个物品")
    );
    public static final SlimefunItemStack QS_DA_LI_SHI_SHI_SHI_REN_WU_BAO_XIANG = new SlimefunItemStack(
        "QS_DA_LI_SHI_SHI_SHI_REN_WU_BAO_XIANG",
        T.QS_DA_LI_SHI_SHI_SHI_REN_WU_BAO_XIANG,
        Y.colorPseudorandomString ("大理石史诗任务宝箱") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("容量： ") + MachineLore.format(DA_LI_SHI_SHI_SHI_REN_WU_BAO_XIANG) + Y.colorPseudorandomString (" 个物品")
    );
    public static final SlimefunItemStack QS_WU_XIAO_DE_SHI_SHI_REN_WU_BAO_XIANG = new SlimefunItemStack(
        "QS_WU_XIAO_DE_SHI_SHI_REN_WU_BAO_XIANG",
        T.QS_WU_XIAO_DE_SHI_SHI_REN_WU_BAO_XIANG,
        Y.colorPseudorandomString ("无效的史诗任务宝箱") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("容量： ") + MachineLore.format(WU_XIAO_DE_SHI_SHI_REN_WU_BAO_XIANG) + Y.colorPseudorandomString (" 个物品")
    );

    /**
     * 存储合成机 和存储配方
     */
    public static void setup(TsingshanTechnology qs) {

        new StorageForge( C.QS_CC, QS_RO_HE_BAO_XIANG, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.REINFORCED_ALLOY_INGOT,
            SlimefunItems.HARDENED_GLASS, new ItemStack ( Material.CRAFTING_TABLE), SlimefunItems.HARDENED_GLASS,
            SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.REINFORCED_ALLOY_INGOT
        }).register(qs);//这个是存储合成机

        /**
         * 下面写存储的配方
         */

        new StorageUnit(QS_MU_XIANG, MU_XIANG, new ItemStack[] {
            SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack ( Material.OAK_PLANKS), SlimefunItems.REINFORCED_ALLOY_INGOT,
            new ItemStack ( Material.OAK_PLANKS), new ItemStack ( Material.CHEST), new ItemStack ( Material.OAK_PLANKS),
            SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack ( Material.OAK_PLANKS), SlimefunItems.REINFORCED_ALLOY_INGOT
        }).register(qs);
        new StorageUnit(QS_TIE_XIANG, TIE_XIANG, new ItemStack[] {
            QS_ER_JIE_NO_SUO_TIE, QS_ER_JIE_NO_SUO_TIE, QS_ER_JIE_NO_SUO_TIE,
            QS_ER_JIE_NO_SUO_TIE, QS_MU_XIANG, QS_ER_JIE_NO_SUO_TIE,
            QS_ER_JIE_NO_SUO_TIE, QS_ER_JIE_NO_SUO_TIE, QS_ER_JIE_NO_SUO_TIE
        }).register(qs);
        new StorageUnit(QS_JIN_XIANG, JIN_XIANG, new ItemStack[] {
            QS_ER_JIE_NO_SUO_JIN, QS_ER_JIE_NO_SUO_JIN, QS_ER_JIE_NO_SUO_JIN,
            QS_ER_JIE_NO_SUO_JIN, QS_TIE_XIANG, QS_ER_JIE_NO_SUO_JIN,
            QS_ER_JIE_NO_SUO_JIN, QS_ER_JIE_NO_SUO_JIN, QS_ER_JIE_NO_SUO_JIN
        }).register(qs);
        new StorageUnit(QS_ZUAN_SHI_XIANG, ZUAN_SHI_XIANG, new ItemStack[] {
            QS_DAIDAI_DE_ZUAN_SHI_KUAI, QS_DAIDAI_DE_ZUAN_SHI_KUAI, QS_DAIDAI_DE_ZUAN_SHI_KUAI,
            QS_DAIDAI_DE_ZUAN_SHI_KUAI, QS_JIN_XIANG, QS_DAIDAI_DE_ZUAN_SHI_KUAI,
            QS_DAIDAI_DE_ZUAN_SHI_KUAI, QS_DAIDAI_DE_ZUAN_SHI_KUAI, QS_DAIDAI_DE_ZUAN_SHI_KUAI
        }).register(qs);
        new StorageUnit(QS_CHU_XUE_ZHE_BAO_XIANG, CHU_XUE_ZHE_BAO_XIANG, new ItemStack[] {
            QS_YI_JIE_YUAN_SU_JIE_JING, QS_YI_JIE_YUAN_SU_JIE_JING, QS_YI_JIE_YUAN_SU_JIE_JING,
            QS_YI_JIE_YUAN_SU_JIE_JING, QS_ZUAN_SHI_XIANG, QS_YI_JIE_YUAN_SU_JIE_JING,
            QS_YI_JIE_YUAN_SU_JIE_JING, QS_YI_JIE_YUAN_SU_JIE_JING, QS_YI_JIE_YUAN_SU_JIE_JING
        }).register(qs);
        new StorageUnit(QS_BIAO_ZHUN_REN_WU_BAO_XIANG, BIAO_ZHUN_REN_WU_BAO_XIANG, new ItemStack[] {
            QS_ER_JIE_YUAN_SU_JIE_JING, QS_ER_JIE_YUAN_SU_JIE_JING, QS_ER_JIE_YUAN_SU_JIE_JING,
            QS_ER_JIE_YUAN_SU_JIE_JING, QS_CHU_XUE_ZHE_BAO_XIANG, QS_ER_JIE_YUAN_SU_JIE_JING,
            QS_ER_JIE_YUAN_SU_JIE_JING, QS_ER_JIE_YUAN_SU_JIE_JING, QS_ER_JIE_YUAN_SU_JIE_JING
        }).register(qs);
        new StorageUnit(QS_QIANG_DA_DE_REN_WU_BAO_XIANG, QIANG_DA_DE_REN_WU_BAO_XIANG, new ItemStack[] {
            QS_SAN_JIE_YUAN_SU_JIE_JING, QS_SAN_JIE_YUAN_SU_JIE_JING, QS_SAN_JIE_YUAN_SU_JIE_JING,
            QS_SAN_JIE_YUAN_SU_JIE_JING, QS_BIAO_ZHUN_REN_WU_BAO_XIANG, QS_SAN_JIE_YUAN_SU_JIE_JING,
            QS_SAN_JIE_YUAN_SU_JIE_JING, QS_SAN_JIE_YUAN_SU_JIE_JING, QS_SAN_JIE_YUAN_SU_JIE_JING
        }).register(qs);
        new StorageUnit(QS_JIE_JING_SHI_SHI_REN_WU_BAO_XIANG, JIE_JING_SHI_SHI_REN_WU_BAO_XIANG, new ItemStack[] {
            QS_SI_JIE_YUAN_SU_JIE_JING, QS_SI_JIE_YUAN_SU_JIE_JING, QS_SI_JIE_YUAN_SU_JIE_JING,
            QS_SI_JIE_YUAN_SU_JIE_JING, QS_QIANG_DA_DE_REN_WU_BAO_XIANG, QS_SI_JIE_YUAN_SU_JIE_JING,
            QS_SI_JIE_YUAN_SU_JIE_JING, QS_SI_JIE_YUAN_SU_JIE_JING, QS_SI_JIE_YUAN_SU_JIE_JING
        }).register(qs);
        new StorageUnit(QS_MI_FENG_SHI_SHI_REN_WU_BAO_XIANG, MI_FENG_SHI_SHI_REN_WU_BAO_XIANG, new ItemStack[] {
            QS_WU_JIE_YUAN_SU_JIE_JING, QS_WU_JIE_YUAN_SU_JIE_JING, QS_WU_JIE_YUAN_SU_JIE_JING,
            QS_WU_JIE_YUAN_SU_JIE_JING, QS_JIE_JING_SHI_SHI_REN_WU_BAO_XIANG, QS_WU_JIE_YUAN_SU_JIE_JING,
            QS_WU_JIE_YUAN_SU_JIE_JING, QS_WU_JIE_YUAN_SU_JIE_JING, QS_WU_JIE_YUAN_SU_JIE_JING,
        }).register(qs);
        new StorageUnit(QS_HUANG_JIA_SHI_SHI_REN_WU_BAO_XIANG, HUANG_JIA_SHI_SHI_REN_WU_BAO_XIANG, new ItemStack[] {
            QS_QING_SHAN_JING_GANG, QS_QING_SHAN_JING_GANG, QS_QING_SHAN_JING_GANG,
            QS_QING_SHAN_JING_GANG, QS_MI_FENG_SHI_SHI_REN_WU_BAO_XIANG, QS_QING_SHAN_JING_GANG,
            QS_QING_SHAN_JING_GANG, QS_QING_SHAN_JING_GANG, QS_QING_SHAN_JING_GANG
        }).register(qs);
        new StorageUnit(QS_XIE_JIAO_SHI_SHI_REN_WU_BAO_XIANG, XIE_JIAO_SHI_SHI_REN_WU_BAO_XIANG, new ItemStack[] {
            QS_QING_SHAN_PAO_MO, QS_QING_SHAN_PAO_MO, QS_QING_SHAN_PAO_MO,
            QS_QING_SHAN_PAO_MO, QS_HUANG_JIA_SHI_SHI_REN_WU_BAO_XIANG, QS_QING_SHAN_PAO_MO,
            QS_QING_SHAN_PAO_MO, QS_QING_SHAN_PAO_MO, QS_QING_SHAN_PAO_MO
        }).register(qs);
        new StorageUnit(QS_DA_LI_SHI_SHI_SHI_REN_WU_BAO_XIANG, DA_LI_SHI_SHI_SHI_REN_WU_BAO_XIANG, new ItemStack[] {
            QS_QING_SHAN_HE_JIN, QS_QING_SHAN_HE_JIN, QS_QING_SHAN_HE_JIN,
            QS_QING_SHAN_HE_JIN, QS_XIE_JIAO_SHI_SHI_REN_WU_BAO_XIANG, QS_QING_SHAN_HE_JIN,
            QS_QING_SHAN_HE_JIN, QS_QING_SHAN_HE_JIN, QS_QING_SHAN_HE_JIN
        }).register(qs);
        new StorageUnit(QS_WU_XIAO_DE_SHI_SHI_REN_WU_BAO_XIANG, WU_XIAO_DE_SHI_SHI_REN_WU_BAO_XIANG, new ItemStack[] {
            QS_QING_SHAN_JIN_GE, QS_QING_SHAN_JIN_GE, QS_QING_SHAN_JIN_GE,
            QS_QING_SHAN_JIN_GE, QS_DA_LI_SHI_SHI_SHI_REN_WU_BAO_XIANG, QS_QING_SHAN_JIN_GE,
            QS_QING_SHAN_JIN_GE, QS_QING_SHAN_JIN_GE, QS_QING_SHAN_JIN_GE
        }).register(qs);
    }

}
