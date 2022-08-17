package io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.utils.C;
import io.gitee.crankygoudan.tsingshantechnology.utils.T;
import io.gitee.crankygoudan.tsingshantechnology.utils.Y;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;

public class QingShanYaSuoCaiLiao {

    public static final SlimefunItemStack QS_YI_JIE_YUAN_SU_JIE_JING = new SlimefunItemStack ( "QS_YI_JIE_YUAN_SU_JIE_JING", T.QS_YI_JIE_YUAN_SU_JIE_JING, Y.colorPseudorandomString ("一阶元素结晶") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("9种一阶浓缩元素"));
    public static final SlimefunItemStack QS_ER_JIE_YUAN_SU_JIE_JING = new SlimefunItemStack ( "QS_ER_JIE_YUAN_SU_JIE_JING", T.QS_ER_JIE_YUAN_SU_JIE_JING, Y.colorPseudorandomString ("二阶元素结晶") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("9种二阶浓缩元素"));
    public static final SlimefunItemStack QS_SAN_JIE_YUAN_SU_JIE_JING = new SlimefunItemStack ( "QS_SAN_JIE_YUAN_SU_JIE_JING", T.QS_SAN_JIE_YUAN_SU_JIE_JING, Y.colorPseudorandomString ("三阶元素结晶") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("9种三阶浓缩元素"));
    public static final SlimefunItemStack QS_SI_JIE_YUAN_SU_JIE_JING = new SlimefunItemStack ( "QS_SI_JIE_YUAN_SU_JIE_JING", T.QS_SI_JIE_YUAN_SU_JIE_JING, Y.colorPseudorandomString ("四阶元素结晶") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("9种四阶浓缩元素"));
    public static final SlimefunItemStack QS_WU_JIE_YUAN_SU_JIE_JING = new SlimefunItemStack ( "QS_WU_JIE_YUAN_SU_JIE_JING", T.QS_WU_JIE_YUAN_SU_JIE_JING, Y.colorPseudorandomString ("五阶元素结晶") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("9种五阶浓缩元素"));

    public static final SlimefunItemStack QS_YI_JIE_NO_SUO_TIE = new SlimefunItemStack ( "QS_YI_JIE_NO_SUO_TIE", T.QS_YI_JIE_NO_SUO_TIE, Y.colorPseudorandomString ("一阶浓缩铁") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("9个铁锭"));
    public static final SlimefunItemStack QS_ER_JIE_NO_SUO_TIE = new SlimefunItemStack ( "QS_ER_JIE_NO_SUO_TIE", T.QS_YI_JIE_NO_SUO_TIE, Y.colorPseudorandomString ("二阶浓缩铁") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("81个铁锭"));
    public static final SlimefunItemStack QS_SAN_JIE_NO_SUO_TIE = new SlimefunItemStack ( "QS_SAN_JIE_NO_SUO_TIE", T.QS_YI_JIE_NO_SUO_TIE, Y.colorPseudorandomString ("三阶浓缩铁") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("729个铁锭"));
    public static final SlimefunItemStack QS_SI_JIE_NO_SUO_TIE = new SlimefunItemStack ( "QS_SI_JIE_NO_SUO_TIE", T.QS_YI_JIE_NO_SUO_TIE, Y.colorPseudorandomString ("四阶浓缩铁") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("6561个铁锭"));
    public static final SlimefunItemStack QS_WU_JIE_NO_SUO_TIE = new SlimefunItemStack ( "QS_WU_JIE_NO_SUO_TIE", T.QS_YI_JIE_NO_SUO_TIE, Y.colorPseudorandomString ("五阶浓缩铁") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("59049个铁锭"));

    public static final SlimefunItemStack QS_YI_JIE_NO_SUO_JIN = new SlimefunItemStack ( "QS_YI_JIE_NO_SUO_JIN", T.QS_YI_JIE_NO_SUO_JIN, Y.colorPseudorandomString ("一阶浓缩金") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("9个金锭"));
    public static final SlimefunItemStack QS_ER_JIE_NO_SUO_JIN = new SlimefunItemStack ( "QS_ER_JIE_NO_SUO_JIN", T.QS_YI_JIE_NO_SUO_JIN, Y.colorPseudorandomString ("二阶浓缩金") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("81个金锭"));
    public static final SlimefunItemStack QS_SAN_JIE_NO_SUO_JIN = new SlimefunItemStack ( "QS_SAN_JIE_NO_SUO_JIN", T.QS_YI_JIE_NO_SUO_JIN, Y.colorPseudorandomString ("三阶浓缩金") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("729个金锭"));
    public static final SlimefunItemStack QS_SI_JIE_NO_SUO_JIN = new SlimefunItemStack ( "QS_SI_JIE_NO_SUO_JIN", T.QS_YI_JIE_NO_SUO_JIN, Y.colorPseudorandomString ("四阶浓缩金") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("6561个金锭"));
    public static final SlimefunItemStack QS_WU_JIE_NO_SUO_JIN = new SlimefunItemStack ( "QS_WU_JIE_NO_SUO_JIN", T.QS_YI_JIE_NO_SUO_JIN, Y.colorPseudorandomString ("五阶浓缩金") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("59049个金锭"));

    public static final SlimefunItemStack QS_YI_JIE_NO_SUO_TONG = new SlimefunItemStack ( "QS_YI_JIE_NO_SUO_TONG", T.QS_YI_JIE_NO_SUO_TONG, Y.colorPseudorandomString ("一阶浓缩铜") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("9个铜锭"));
    public static final SlimefunItemStack QS_ER_JIE_NO_SUO_TONG = new SlimefunItemStack ( "QS_ER_JIE_NO_SUO_TONG", T.QS_YI_JIE_NO_SUO_TONG, Y.colorPseudorandomString ("二阶浓缩铜") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("81个铜锭"));
    public static final SlimefunItemStack QS_SAN_JIE_NO_SUO_TONG = new SlimefunItemStack ( "QS_SAN_JIE_NO_SUO_TONG", T.QS_YI_JIE_NO_SUO_TONG, Y.colorPseudorandomString ("三阶浓缩铜") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("729个铜锭"));
    public static final SlimefunItemStack QS_SI_JIE_NO_SUO_TONG = new SlimefunItemStack ( "QS_SI_JIE_NO_SUO_TONG", T.QS_YI_JIE_NO_SUO_TONG, Y.colorPseudorandomString ("四阶浓缩铜") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("6561个铜锭"));
    public static final SlimefunItemStack QS_WU_JIE_NO_SUO_TONG = new SlimefunItemStack ( "QS_WU_JIE_NO_SUO_TONG", T.QS_YI_JIE_NO_SUO_TONG, Y.colorPseudorandomString ("五阶浓缩铜") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("59049个铜锭"));

    public static final SlimefunItemStack QS_YI_JIE_NO_SUO_XI = new SlimefunItemStack ( "QS_YI_JIE_NO_SUO_XI", T.QS_YI_JIE_NO_SUO_XI, Y.colorPseudorandomString ("一阶浓缩锡") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("9个锡锭"));
    public static final SlimefunItemStack QS_ER_JIE_NO_SUO_XI = new SlimefunItemStack ( "QS_ER_JIE_NO_SUO_XI", T.QS_YI_JIE_NO_SUO_XI, Y.colorPseudorandomString ("二阶浓缩锡") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("81个锡锭"));
    public static final SlimefunItemStack QS_SAN_JIE_NO_SUO_XI = new SlimefunItemStack ( "QS_SAN_JIE_NO_SUO_XI", T.QS_YI_JIE_NO_SUO_XI, Y.colorPseudorandomString ("三阶浓缩锡") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("729个锡锭"));
    public static final SlimefunItemStack QS_SI_JIE_NO_SUO_XI = new SlimefunItemStack ( "QS_SI_JIE_NO_SUO_XI", T.QS_YI_JIE_NO_SUO_XI, Y.colorPseudorandomString ("四阶浓缩锡") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("6561个锡锭"));
    public static final SlimefunItemStack QS_WU_JIE_NO_SUO_XI = new SlimefunItemStack ( "QS_WU_JIE_NO_SUO_XI", T.QS_YI_JIE_NO_SUO_XI, Y.colorPseudorandomString ("五阶浓缩锡") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("59049个锡锭"));

    public static final SlimefunItemStack QS_YI_JIE_NO_SUO_QIAN = new SlimefunItemStack ( "QS_YI_JIE_NO_SUO_QIAN", T.QS_YI_JIE_NO_SUO_QIAN, Y.colorPseudorandomString ("一阶浓缩铅") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("9个铅锭"));
    public static final SlimefunItemStack QS_ER_JIE_NO_SUO_QIAN = new SlimefunItemStack ( "QS_ER_JIE_NO_SUO_QIAN", T.QS_YI_JIE_NO_SUO_QIAN, Y.colorPseudorandomString ("二阶浓缩铅") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("81个铅锭"));
    public static final SlimefunItemStack QS_SAN_JIE_NO_SUO_QIAN = new SlimefunItemStack ( "QS_SAN_JIE_NO_SUO_QIAN", T.QS_YI_JIE_NO_SUO_QIAN, Y.colorPseudorandomString ("三阶浓缩铅") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("729个铅锭"));
    public static final SlimefunItemStack QS_SI_JIE_NO_SUO_QIAN = new SlimefunItemStack ( "QS_SI_JIE_NO_SUO_QIAN", T.QS_YI_JIE_NO_SUO_QIAN, Y.colorPseudorandomString ("四阶浓缩铅") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("6561个铅锭"));
    public static final SlimefunItemStack QS_WU_JIE_NO_SUO_QIAN = new SlimefunItemStack ( "QS_WU_JIE_NO_SUO_QIAN", T.QS_YI_JIE_NO_SUO_QIAN, Y.colorPseudorandomString ("五阶浓缩铅") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("59049个铅锭"));

    public static final SlimefunItemStack QS_YI_JIE_NO_SUO_YIN = new SlimefunItemStack ( "QS_YI_JIE_NO_SUO_YIN", T.QS_YI_JIE_NO_SUO_YIN, Y.colorPseudorandomString ("一阶浓缩银") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("9个银锭"));
    public static final SlimefunItemStack QS_ER_JIE_NO_SUO_YIN = new SlimefunItemStack ( "QS_ER_JIE_NO_SUO_YIN", T.QS_YI_JIE_NO_SUO_YIN, Y.colorPseudorandomString ("二阶浓缩银") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("81个银锭"));
    public static final SlimefunItemStack QS_SAN_JIE_NO_SUO_YIN = new SlimefunItemStack ( "QS_SAN_JIE_NO_SUO_YIN", T.QS_YI_JIE_NO_SUO_YIN, Y.colorPseudorandomString ("三阶浓缩银") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("729个银锭"));
    public static final SlimefunItemStack QS_SI_JIE_NO_SUO_YIN = new SlimefunItemStack ( "QS_SI_JIE_NO_SUO_YIN", T.QS_YI_JIE_NO_SUO_YIN, Y.colorPseudorandomString ("四阶浓缩银") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("6561个银锭"));
    public static final SlimefunItemStack QS_WU_JIE_NO_SUO_YIN = new SlimefunItemStack ( "QS_WU_JIE_NO_SUO_YIN", T.QS_YI_JIE_NO_SUO_YIN, Y.colorPseudorandomString ("五阶浓缩银") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("59049个银锭"));

    public static final SlimefunItemStack QS_YI_JIE_NO_SUO_LV = new SlimefunItemStack ( "QS_YI_JIE_NO_SUO_LV", T.QS_YI_JIE_NO_SUO_LV, Y.colorPseudorandomString ("一阶浓缩铝") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("9个铝锭"));
    public static final SlimefunItemStack QS_ER_JIE_NO_SUO_LV = new SlimefunItemStack ( "QS_ER_JIE_NO_SUO_LV", T.QS_YI_JIE_NO_SUO_LV, Y.colorPseudorandomString ("二阶浓缩铝") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("81个铝锭"));
    public static final SlimefunItemStack QS_SAN_JIE_NO_SUO_LV = new SlimefunItemStack ( "QS_SAN_JIE_NO_SUO_LV", T.QS_YI_JIE_NO_SUO_LV, Y.colorPseudorandomString ("三阶浓缩铝") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("729个铝锭"));
    public static final SlimefunItemStack QS_SI_JIE_NO_SUO_LV = new SlimefunItemStack ( "QS_SI_JIE_NO_SUO_LV", T.QS_YI_JIE_NO_SUO_LV, Y.colorPseudorandomString ("四阶浓缩铝") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("6561个铝锭"));
    public static final SlimefunItemStack QS_WU_JIE_NO_SUO_LV = new SlimefunItemStack ( "QS_WU_JIE_NO_SUO_LV", T.QS_YI_JIE_NO_SUO_LV, Y.colorPseudorandomString ("五阶浓缩铝") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("59049个铝锭"));

    public static final SlimefunItemStack QS_YI_JIE_NO_SUO_XIN = new SlimefunItemStack ( "QS_YI_JIE_NO_SUO_XIN", T.QS_YI_JIE_NO_SUO_XIN, Y.colorPseudorandomString ("一阶浓缩锌") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("9个锌锭"));
    public static final SlimefunItemStack QS_ER_JIE_NO_SUO_XIN = new SlimefunItemStack ( "QS_ER_JIE_NO_SUO_XIN", T.QS_YI_JIE_NO_SUO_XIN, Y.colorPseudorandomString ("二阶浓缩锌") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("81个锌锭"));
    public static final SlimefunItemStack QS_SAN_JIE_NO_SUO_XIN = new SlimefunItemStack ( "QS_SAN_JIE_NO_SUO_XIN", T.QS_YI_JIE_NO_SUO_XIN, Y.colorPseudorandomString ("三阶浓缩锌") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("729个锌锭"));
    public static final SlimefunItemStack QS_SI_JIE_NO_SUO_XIN = new SlimefunItemStack ( "QS_SI_JIE_NO_SUO_XIN", T.QS_YI_JIE_NO_SUO_XIN, Y.colorPseudorandomString ("四阶浓缩锌") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("6561个锌锭"));
    public static final SlimefunItemStack QS_WU_JIE_NO_SUO_XIN = new SlimefunItemStack ( "QS_WU_JIE_NO_SUO_XIN", T.QS_YI_JIE_NO_SUO_XIN, Y.colorPseudorandomString ("五阶浓缩锌") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("59049个锌锭"));


    public static final SlimefunItemStack QS_YI_JIE_NO_SUO_MEI = new SlimefunItemStack ( "QS_YI_JIE_NO_SUO_MEI", T.QS_YI_JIE_NO_SUO_MEI, Y.colorPseudorandomString ("一阶浓缩镁") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("9个镁锭"));
    public static final SlimefunItemStack QS_ER_JIE_NO_SUO_MEI = new SlimefunItemStack ( "QS_ER_JIE_NO_SUO_MEI", T.QS_YI_JIE_NO_SUO_MEI, Y.colorPseudorandomString ("二阶浓缩镁") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("81个镁锭"));
    public static final SlimefunItemStack QS_SAN_JIE_NO_SUO_MEI = new SlimefunItemStack ( "QS_SAN_JIE_NO_SUO_MEI", T.QS_YI_JIE_NO_SUO_MEI, Y.colorPseudorandomString ("三阶浓缩镁") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("729个镁锭"));
    public static final SlimefunItemStack QS_SI_JIE_NO_SUO_MEI = new SlimefunItemStack ( "QS_SI_JIE_NO_SUO_MEI", T.QS_YI_JIE_NO_SUO_MEI, Y.colorPseudorandomString ("四阶浓缩镁") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("6561个镁锭"));
    public static final SlimefunItemStack QS_WU_JIE_NO_SUO_MEI = new SlimefunItemStack ( "QS_WU_JIE_NO_SUO_MEI", T.QS_YI_JIE_NO_SUO_MEI, Y.colorPseudorandomString ("五阶浓缩镁") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("59049个镁锭"));




    public static void setup(TsingshanTechnology qs) {

        new UnplaceableBlock ( C.QS_YSCL, QS_YI_JIE_YUAN_SU_JIE_JING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YI_JIE_NO_SUO_TIE, QS_YI_JIE_NO_SUO_JIN, QS_YI_JIE_NO_SUO_TONG,
            QS_YI_JIE_NO_SUO_XI, QS_YI_JIE_NO_SUO_QIAN, QS_YI_JIE_NO_SUO_YIN,
            QS_YI_JIE_NO_SUO_LV, QS_YI_JIE_NO_SUO_XIN, QS_YI_JIE_NO_SUO_MEI
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_ER_JIE_YUAN_SU_JIE_JING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_ER_JIE_NO_SUO_TIE, QS_ER_JIE_NO_SUO_JIN, QS_ER_JIE_NO_SUO_TONG,
            QS_ER_JIE_NO_SUO_XI, QS_ER_JIE_NO_SUO_QIAN, QS_ER_JIE_NO_SUO_YIN,
            QS_ER_JIE_NO_SUO_LV, QS_ER_JIE_NO_SUO_XIN, QS_ER_JIE_NO_SUO_MEI
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SAN_JIE_YUAN_SU_JIE_JING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SAN_JIE_NO_SUO_TIE, QS_SAN_JIE_NO_SUO_JIN, QS_SAN_JIE_NO_SUO_TONG,
            QS_SAN_JIE_NO_SUO_XI, QS_SAN_JIE_NO_SUO_QIAN, QS_SAN_JIE_NO_SUO_YIN,
            QS_SAN_JIE_NO_SUO_LV, QS_SAN_JIE_NO_SUO_XIN, QS_SAN_JIE_NO_SUO_MEI
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SI_JIE_YUAN_SU_JIE_JING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SI_JIE_NO_SUO_TIE, QS_SI_JIE_NO_SUO_JIN, QS_SI_JIE_NO_SUO_TONG,
            QS_SI_JIE_NO_SUO_XI, QS_SI_JIE_NO_SUO_QIAN, QS_SI_JIE_NO_SUO_YIN,
            QS_SI_JIE_NO_SUO_LV, QS_SI_JIE_NO_SUO_XIN, QS_SI_JIE_NO_SUO_MEI
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_WU_JIE_YUAN_SU_JIE_JING, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_WU_JIE_NO_SUO_TIE, QS_WU_JIE_NO_SUO_JIN, QS_WU_JIE_NO_SUO_TONG,
            QS_WU_JIE_NO_SUO_XI, QS_WU_JIE_NO_SUO_QIAN, QS_WU_JIE_NO_SUO_YIN,
            QS_WU_JIE_NO_SUO_LV, QS_WU_JIE_NO_SUO_XIN, QS_WU_JIE_NO_SUO_MEI
        } ).register ( qs );
//铁
        new UnplaceableBlock ( C.QS_YSCL, QS_YI_JIE_NO_SUO_TIE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            new ItemStack ( Material.IRON_INGOT ), new ItemStack ( Material.IRON_INGOT ), new ItemStack ( Material.IRON_INGOT ),
            new ItemStack ( Material.IRON_INGOT ), new ItemStack ( Material.IRON_INGOT ), new ItemStack ( Material.IRON_INGOT ),
            new ItemStack ( Material.IRON_INGOT ), new ItemStack ( Material.IRON_INGOT ), new ItemStack ( Material.IRON_INGOT )
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_ER_JIE_NO_SUO_TIE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YI_JIE_NO_SUO_TIE, QS_YI_JIE_NO_SUO_TIE, QS_YI_JIE_NO_SUO_TIE,
            QS_YI_JIE_NO_SUO_TIE, QS_YI_JIE_NO_SUO_TIE, QS_YI_JIE_NO_SUO_TIE,
            QS_YI_JIE_NO_SUO_TIE, QS_YI_JIE_NO_SUO_TIE, QS_YI_JIE_NO_SUO_TIE
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SAN_JIE_NO_SUO_TIE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_ER_JIE_NO_SUO_TIE, QS_ER_JIE_NO_SUO_TIE, QS_ER_JIE_NO_SUO_TIE,
            QS_ER_JIE_NO_SUO_TIE, QS_ER_JIE_NO_SUO_TIE, QS_ER_JIE_NO_SUO_TIE,
            QS_ER_JIE_NO_SUO_TIE, QS_ER_JIE_NO_SUO_TIE, QS_ER_JIE_NO_SUO_TIE
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SI_JIE_NO_SUO_TIE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SAN_JIE_NO_SUO_TIE, QS_SAN_JIE_NO_SUO_TIE, QS_SAN_JIE_NO_SUO_TIE,
            QS_SAN_JIE_NO_SUO_TIE, QS_SAN_JIE_NO_SUO_TIE, QS_SAN_JIE_NO_SUO_TIE,
            QS_SAN_JIE_NO_SUO_TIE, QS_SAN_JIE_NO_SUO_TIE, QS_SAN_JIE_NO_SUO_TIE
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_WU_JIE_NO_SUO_TIE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SI_JIE_NO_SUO_TIE, QS_SI_JIE_NO_SUO_TIE, QS_SI_JIE_NO_SUO_TIE,
            QS_SI_JIE_NO_SUO_TIE, QS_SI_JIE_NO_SUO_TIE, QS_SI_JIE_NO_SUO_TIE,
            QS_SI_JIE_NO_SUO_TIE, QS_SI_JIE_NO_SUO_TIE, QS_SI_JIE_NO_SUO_TIE
        } ).register ( qs );
//金
        new UnplaceableBlock ( C.QS_YSCL, QS_YI_JIE_NO_SUO_JIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            new ItemStack ( Material.GOLD_INGOT ), new ItemStack ( Material.GOLD_INGOT ), new ItemStack ( Material.GOLD_INGOT ),
            new ItemStack ( Material.GOLD_INGOT ), new ItemStack ( Material.GOLD_INGOT ), new ItemStack ( Material.GOLD_INGOT ),
            new ItemStack ( Material.GOLD_INGOT ), new ItemStack ( Material.GOLD_INGOT ), new ItemStack ( Material.GOLD_INGOT )
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_ER_JIE_NO_SUO_JIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YI_JIE_NO_SUO_JIN, QS_YI_JIE_NO_SUO_JIN, QS_YI_JIE_NO_SUO_JIN,
            QS_YI_JIE_NO_SUO_JIN, QS_YI_JIE_NO_SUO_JIN, QS_YI_JIE_NO_SUO_JIN,
            QS_YI_JIE_NO_SUO_JIN, QS_YI_JIE_NO_SUO_JIN, QS_YI_JIE_NO_SUO_JIN
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SAN_JIE_NO_SUO_JIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_ER_JIE_NO_SUO_JIN, QS_ER_JIE_NO_SUO_JIN, QS_ER_JIE_NO_SUO_JIN,
            QS_ER_JIE_NO_SUO_JIN, QS_ER_JIE_NO_SUO_JIN, QS_ER_JIE_NO_SUO_JIN,
            QS_ER_JIE_NO_SUO_JIN, QS_ER_JIE_NO_SUO_JIN, QS_ER_JIE_NO_SUO_JIN
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SI_JIE_NO_SUO_JIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SAN_JIE_NO_SUO_JIN, QS_SAN_JIE_NO_SUO_JIN, QS_SAN_JIE_NO_SUO_JIN,
            QS_SAN_JIE_NO_SUO_JIN, QS_SAN_JIE_NO_SUO_JIN, QS_SAN_JIE_NO_SUO_JIN,
            QS_SAN_JIE_NO_SUO_JIN, QS_SAN_JIE_NO_SUO_JIN, QS_SAN_JIE_NO_SUO_JIN
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_WU_JIE_NO_SUO_JIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SI_JIE_NO_SUO_JIN, QS_SI_JIE_NO_SUO_JIN, QS_SI_JIE_NO_SUO_JIN,
            QS_SI_JIE_NO_SUO_JIN, QS_SI_JIE_NO_SUO_JIN, QS_SI_JIE_NO_SUO_JIN,
            QS_SI_JIE_NO_SUO_JIN, QS_SI_JIE_NO_SUO_JIN, QS_SI_JIE_NO_SUO_JIN
        } ).register ( qs );


//铜
        new UnplaceableBlock ( C.QS_YSCL, QS_YI_JIE_NO_SUO_TONG, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT,
            SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT,
            SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_ER_JIE_NO_SUO_TONG, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YI_JIE_NO_SUO_TONG, QS_YI_JIE_NO_SUO_TONG, QS_YI_JIE_NO_SUO_TONG,
            QS_YI_JIE_NO_SUO_TONG, QS_YI_JIE_NO_SUO_TONG, QS_YI_JIE_NO_SUO_TONG,
            QS_YI_JIE_NO_SUO_TONG, QS_YI_JIE_NO_SUO_TONG, QS_YI_JIE_NO_SUO_TONG
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SAN_JIE_NO_SUO_TONG, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_ER_JIE_NO_SUO_TONG, QS_ER_JIE_NO_SUO_TONG, QS_ER_JIE_NO_SUO_TONG,
            QS_ER_JIE_NO_SUO_TONG, QS_ER_JIE_NO_SUO_TONG, QS_ER_JIE_NO_SUO_TONG,
            QS_ER_JIE_NO_SUO_TONG, QS_ER_JIE_NO_SUO_TONG, QS_ER_JIE_NO_SUO_TONG
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SI_JIE_NO_SUO_TONG, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SAN_JIE_NO_SUO_TONG, QS_SAN_JIE_NO_SUO_TONG, QS_SAN_JIE_NO_SUO_TONG,
            QS_SAN_JIE_NO_SUO_TONG, QS_SAN_JIE_NO_SUO_TONG, QS_SAN_JIE_NO_SUO_TONG,
            QS_SAN_JIE_NO_SUO_TONG, QS_SAN_JIE_NO_SUO_TONG, QS_SAN_JIE_NO_SUO_TONG
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_WU_JIE_NO_SUO_TONG, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SI_JIE_NO_SUO_TONG, QS_SI_JIE_NO_SUO_TONG, QS_SI_JIE_NO_SUO_TONG,
            QS_SI_JIE_NO_SUO_TONG, QS_SI_JIE_NO_SUO_TONG, QS_SI_JIE_NO_SUO_TONG,
            QS_SI_JIE_NO_SUO_TONG, QS_SI_JIE_NO_SUO_TONG, QS_SI_JIE_NO_SUO_TONG
        } ).register ( qs );



//锡
        new UnplaceableBlock ( C.QS_YSCL, QS_YI_JIE_NO_SUO_XI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.TIN_INGOT, SlimefunItems.TIN_INGOT, SlimefunItems.TIN_INGOT,
            SlimefunItems.TIN_INGOT, SlimefunItems.TIN_INGOT, SlimefunItems.TIN_INGOT,
            SlimefunItems.TIN_INGOT, SlimefunItems.TIN_INGOT, SlimefunItems.TIN_INGOT
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_ER_JIE_NO_SUO_XI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YI_JIE_NO_SUO_XI, QS_YI_JIE_NO_SUO_XI, QS_YI_JIE_NO_SUO_XI,
            QS_YI_JIE_NO_SUO_XI, QS_YI_JIE_NO_SUO_XI, QS_YI_JIE_NO_SUO_XI,
            QS_YI_JIE_NO_SUO_XI, QS_YI_JIE_NO_SUO_XI, QS_YI_JIE_NO_SUO_XI
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SAN_JIE_NO_SUO_XI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_ER_JIE_NO_SUO_XI, QS_ER_JIE_NO_SUO_XI, QS_ER_JIE_NO_SUO_XI,
            QS_ER_JIE_NO_SUO_XI, QS_ER_JIE_NO_SUO_XI, QS_ER_JIE_NO_SUO_XI,
            QS_ER_JIE_NO_SUO_XI, QS_ER_JIE_NO_SUO_XI, QS_ER_JIE_NO_SUO_XI
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SI_JIE_NO_SUO_XI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SAN_JIE_NO_SUO_XI, QS_SAN_JIE_NO_SUO_XI, QS_SAN_JIE_NO_SUO_XI,
            QS_SAN_JIE_NO_SUO_XI, QS_SAN_JIE_NO_SUO_XI, QS_SAN_JIE_NO_SUO_XI,
            QS_SAN_JIE_NO_SUO_XI, QS_SAN_JIE_NO_SUO_XI, QS_SAN_JIE_NO_SUO_XI
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_WU_JIE_NO_SUO_XI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SI_JIE_NO_SUO_XI, QS_SI_JIE_NO_SUO_XI, QS_SI_JIE_NO_SUO_XI,
            QS_SI_JIE_NO_SUO_XI, QS_SI_JIE_NO_SUO_XI, QS_SI_JIE_NO_SUO_XI,
            QS_SI_JIE_NO_SUO_XI, QS_SI_JIE_NO_SUO_XI, QS_SI_JIE_NO_SUO_XI
        } ).register ( qs );


//铅
        new UnplaceableBlock ( C.QS_YSCL, QS_YI_JIE_NO_SUO_QIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.LEAD_INGOT, SlimefunItems.LEAD_INGOT, SlimefunItems.LEAD_INGOT,
            SlimefunItems.LEAD_INGOT, SlimefunItems.LEAD_INGOT, SlimefunItems.LEAD_INGOT,
            SlimefunItems.LEAD_INGOT, SlimefunItems.LEAD_INGOT, SlimefunItems.LEAD_INGOT
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_ER_JIE_NO_SUO_QIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YI_JIE_NO_SUO_QIAN, QS_YI_JIE_NO_SUO_QIAN, QS_YI_JIE_NO_SUO_QIAN,
            QS_YI_JIE_NO_SUO_QIAN, QS_YI_JIE_NO_SUO_QIAN, QS_YI_JIE_NO_SUO_QIAN,
            QS_YI_JIE_NO_SUO_QIAN, QS_YI_JIE_NO_SUO_QIAN, QS_YI_JIE_NO_SUO_QIAN
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SAN_JIE_NO_SUO_QIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_ER_JIE_NO_SUO_QIAN, QS_ER_JIE_NO_SUO_QIAN, QS_ER_JIE_NO_SUO_QIAN,
            QS_ER_JIE_NO_SUO_QIAN, QS_ER_JIE_NO_SUO_QIAN, QS_ER_JIE_NO_SUO_QIAN,
            QS_ER_JIE_NO_SUO_QIAN, QS_ER_JIE_NO_SUO_QIAN, QS_ER_JIE_NO_SUO_QIAN
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SI_JIE_NO_SUO_QIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SAN_JIE_NO_SUO_QIAN, QS_SAN_JIE_NO_SUO_QIAN, QS_SAN_JIE_NO_SUO_QIAN,
            QS_SAN_JIE_NO_SUO_QIAN, QS_SAN_JIE_NO_SUO_QIAN, QS_SAN_JIE_NO_SUO_QIAN,
            QS_SAN_JIE_NO_SUO_QIAN, QS_SAN_JIE_NO_SUO_QIAN, QS_SAN_JIE_NO_SUO_QIAN
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_WU_JIE_NO_SUO_QIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SI_JIE_NO_SUO_QIAN, QS_SI_JIE_NO_SUO_QIAN, QS_SI_JIE_NO_SUO_QIAN,
            QS_SI_JIE_NO_SUO_QIAN, QS_SI_JIE_NO_SUO_QIAN, QS_SI_JIE_NO_SUO_QIAN,
            QS_SI_JIE_NO_SUO_QIAN, QS_SI_JIE_NO_SUO_QIAN, QS_SI_JIE_NO_SUO_QIAN
        } ).register ( qs );

//银
        new UnplaceableBlock ( C.QS_YSCL, QS_YI_JIE_NO_SUO_YIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.SILVER_INGOT, SlimefunItems.SILVER_INGOT, SlimefunItems.SILVER_INGOT,
            SlimefunItems.SILVER_INGOT, SlimefunItems.SILVER_INGOT, SlimefunItems.SILVER_INGOT,
            SlimefunItems.SILVER_INGOT, SlimefunItems.SILVER_INGOT, SlimefunItems.SILVER_INGOT
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_ER_JIE_NO_SUO_YIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YI_JIE_NO_SUO_YIN, QS_YI_JIE_NO_SUO_YIN, QS_YI_JIE_NO_SUO_YIN,
            QS_YI_JIE_NO_SUO_YIN, QS_YI_JIE_NO_SUO_YIN, QS_YI_JIE_NO_SUO_YIN,
            QS_YI_JIE_NO_SUO_YIN, QS_YI_JIE_NO_SUO_YIN, QS_YI_JIE_NO_SUO_YIN
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SAN_JIE_NO_SUO_YIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_ER_JIE_NO_SUO_YIN, QS_ER_JIE_NO_SUO_YIN, QS_ER_JIE_NO_SUO_YIN,
            QS_ER_JIE_NO_SUO_YIN, QS_ER_JIE_NO_SUO_YIN, QS_ER_JIE_NO_SUO_YIN,
            QS_ER_JIE_NO_SUO_YIN, QS_ER_JIE_NO_SUO_YIN, QS_ER_JIE_NO_SUO_YIN
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SI_JIE_NO_SUO_YIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SAN_JIE_NO_SUO_YIN, QS_SAN_JIE_NO_SUO_YIN, QS_SAN_JIE_NO_SUO_YIN,
            QS_SAN_JIE_NO_SUO_YIN, QS_SAN_JIE_NO_SUO_YIN, QS_SAN_JIE_NO_SUO_YIN,
            QS_SAN_JIE_NO_SUO_YIN, QS_SAN_JIE_NO_SUO_YIN, QS_SAN_JIE_NO_SUO_YIN
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_WU_JIE_NO_SUO_YIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SI_JIE_NO_SUO_YIN, QS_SI_JIE_NO_SUO_YIN, QS_SI_JIE_NO_SUO_YIN,
            QS_SI_JIE_NO_SUO_YIN, QS_SI_JIE_NO_SUO_YIN, QS_SI_JIE_NO_SUO_YIN,
            QS_SI_JIE_NO_SUO_YIN, QS_SI_JIE_NO_SUO_YIN, QS_SI_JIE_NO_SUO_YIN
        } ).register ( qs );


//铝
        new UnplaceableBlock ( C.QS_YSCL, QS_YI_JIE_NO_SUO_LV, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ALUMINUM_INGOT,
            SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ALUMINUM_INGOT,
            SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ALUMINUM_INGOT, SlimefunItems.ALUMINUM_INGOT
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_ER_JIE_NO_SUO_LV, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YI_JIE_NO_SUO_LV, QS_YI_JIE_NO_SUO_LV, QS_YI_JIE_NO_SUO_LV,
            QS_YI_JIE_NO_SUO_LV, QS_YI_JIE_NO_SUO_LV, QS_YI_JIE_NO_SUO_LV,
            QS_YI_JIE_NO_SUO_LV, QS_YI_JIE_NO_SUO_LV, QS_YI_JIE_NO_SUO_LV
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SAN_JIE_NO_SUO_LV, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_ER_JIE_NO_SUO_LV, QS_ER_JIE_NO_SUO_LV, QS_ER_JIE_NO_SUO_LV,
            QS_ER_JIE_NO_SUO_LV, QS_ER_JIE_NO_SUO_LV, QS_ER_JIE_NO_SUO_LV,
            QS_ER_JIE_NO_SUO_LV, QS_ER_JIE_NO_SUO_LV, QS_ER_JIE_NO_SUO_LV
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SI_JIE_NO_SUO_LV, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SAN_JIE_NO_SUO_LV, QS_SAN_JIE_NO_SUO_LV, QS_SAN_JIE_NO_SUO_LV,
            QS_SAN_JIE_NO_SUO_LV, QS_SAN_JIE_NO_SUO_LV, QS_SAN_JIE_NO_SUO_LV,
            QS_SAN_JIE_NO_SUO_LV, QS_SAN_JIE_NO_SUO_LV, QS_SAN_JIE_NO_SUO_LV
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_WU_JIE_NO_SUO_LV, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SI_JIE_NO_SUO_LV, QS_SI_JIE_NO_SUO_LV, QS_SI_JIE_NO_SUO_LV,
            QS_SI_JIE_NO_SUO_LV, QS_SI_JIE_NO_SUO_LV, QS_SI_JIE_NO_SUO_LV,
            QS_SI_JIE_NO_SUO_LV, QS_SI_JIE_NO_SUO_LV, QS_SI_JIE_NO_SUO_LV
        } ).register ( qs );

//锌
        new UnplaceableBlock ( C.QS_YSCL, QS_YI_JIE_NO_SUO_XIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.ZINC_INGOT, SlimefunItems.ZINC_INGOT, SlimefunItems.ZINC_INGOT,
            SlimefunItems.ZINC_INGOT, SlimefunItems.ZINC_INGOT, SlimefunItems.ZINC_INGOT,
            SlimefunItems.ZINC_INGOT, SlimefunItems.ZINC_INGOT, SlimefunItems.ZINC_INGOT
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_ER_JIE_NO_SUO_XIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YI_JIE_NO_SUO_XIN, QS_YI_JIE_NO_SUO_XIN, QS_YI_JIE_NO_SUO_XIN,
            QS_YI_JIE_NO_SUO_XIN, QS_YI_JIE_NO_SUO_XIN, QS_YI_JIE_NO_SUO_XIN,
            QS_YI_JIE_NO_SUO_XIN, QS_YI_JIE_NO_SUO_XIN, QS_YI_JIE_NO_SUO_XIN
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SAN_JIE_NO_SUO_XIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_ER_JIE_NO_SUO_XIN, QS_ER_JIE_NO_SUO_XIN, QS_ER_JIE_NO_SUO_XIN,
            QS_ER_JIE_NO_SUO_XIN, QS_ER_JIE_NO_SUO_XIN, QS_ER_JIE_NO_SUO_XIN,
            QS_ER_JIE_NO_SUO_XIN, QS_ER_JIE_NO_SUO_XIN, QS_ER_JIE_NO_SUO_XIN
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SI_JIE_NO_SUO_XIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SAN_JIE_NO_SUO_XIN, QS_SAN_JIE_NO_SUO_XIN, QS_SAN_JIE_NO_SUO_XIN,
            QS_SAN_JIE_NO_SUO_XIN, QS_SAN_JIE_NO_SUO_XIN, QS_SAN_JIE_NO_SUO_XIN,
            QS_SAN_JIE_NO_SUO_XIN, QS_SAN_JIE_NO_SUO_XIN, QS_SAN_JIE_NO_SUO_XIN
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_WU_JIE_NO_SUO_XIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SI_JIE_NO_SUO_XIN, QS_SI_JIE_NO_SUO_XIN, QS_SI_JIE_NO_SUO_XIN,
            QS_SI_JIE_NO_SUO_XIN, QS_SI_JIE_NO_SUO_XIN, QS_SI_JIE_NO_SUO_XIN,
            QS_SI_JIE_NO_SUO_XIN, QS_SI_JIE_NO_SUO_XIN, QS_SI_JIE_NO_SUO_XIN
        } ).register ( qs );

//锌
        new UnplaceableBlock ( C.QS_YSCL, QS_YI_JIE_NO_SUO_MEI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.MAGNESIUM_INGOT,
            SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.MAGNESIUM_INGOT,
            SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.MAGNESIUM_INGOT
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_ER_JIE_NO_SUO_MEI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YI_JIE_NO_SUO_MEI, QS_YI_JIE_NO_SUO_MEI, QS_YI_JIE_NO_SUO_MEI,
            QS_YI_JIE_NO_SUO_MEI, QS_YI_JIE_NO_SUO_MEI, QS_YI_JIE_NO_SUO_MEI,
            QS_YI_JIE_NO_SUO_MEI, QS_YI_JIE_NO_SUO_MEI, QS_YI_JIE_NO_SUO_MEI
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SAN_JIE_NO_SUO_MEI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_ER_JIE_NO_SUO_MEI, QS_ER_JIE_NO_SUO_MEI, QS_ER_JIE_NO_SUO_MEI,
            QS_ER_JIE_NO_SUO_MEI, QS_ER_JIE_NO_SUO_MEI, QS_ER_JIE_NO_SUO_MEI,
            QS_ER_JIE_NO_SUO_MEI, QS_ER_JIE_NO_SUO_MEI, QS_ER_JIE_NO_SUO_MEI
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_SI_JIE_NO_SUO_MEI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SAN_JIE_NO_SUO_MEI, QS_SAN_JIE_NO_SUO_MEI, QS_SAN_JIE_NO_SUO_MEI,
            QS_SAN_JIE_NO_SUO_MEI, QS_SAN_JIE_NO_SUO_MEI, QS_SAN_JIE_NO_SUO_MEI,
            QS_SAN_JIE_NO_SUO_MEI, QS_SAN_JIE_NO_SUO_MEI, QS_SAN_JIE_NO_SUO_MEI
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_YSCL, QS_WU_JIE_NO_SUO_MEI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SI_JIE_NO_SUO_MEI, QS_SI_JIE_NO_SUO_MEI, QS_SI_JIE_NO_SUO_MEI,
            QS_SI_JIE_NO_SUO_MEI, QS_SI_JIE_NO_SUO_MEI, QS_SI_JIE_NO_SUO_MEI,
            QS_SI_JIE_NO_SUO_MEI, QS_SI_JIE_NO_SUO_MEI, QS_SI_JIE_NO_SUO_MEI
        } ).register ( qs );






    }
}
