package io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.items.mobs.QingShanRT;
import io.gitee.crankygoudan.tsingshantechnology.utils.C;
import io.gitee.crankygoudan.tsingshantechnology.utils.T;
import io.gitee.crankygoudan.tsingshantechnology.utils.Y;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;

import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanYaSuoCaiLiao.*;
public class QingShanCaiLiao {

    public static final SlimefunItemStack QS_DAIDAI_DE_TIE_KUAI = new SlimefunItemStack ( "QS_DAIDAI_DE_TIE_KUAI", T.QS_DAIDAI_DE_TIE_KUAI, Y.colorPseudorandomString ("呆呆的铁块") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("可用于合成高级"), Y.colorPseudorandomString("难得的材料") );
    public static final SlimefunItemStack QS_DAIDAI_DE_YUAN_SHI = new SlimefunItemStack ( "QS_DAIDAI_DE_YUAN_SHI", T.QS_DAIDAI_DE_YUAN_SHI, Y.colorPseudorandomString ("呆呆的圆石") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("可用于合成高级"), Y.colorPseudorandomString("难得的材料") );
    public static final SlimefunItemStack QS_DAIDAI_DE_JI_YAN = new SlimefunItemStack ( "QS_DAIDAI_DE_JI_YAN", T.QS_DAIDAI_DE_JI_YAN, Y.colorPseudorandomString ("呆呆的基岩") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("可用于合成高级"), Y.colorPseudorandomString("难得的材料") );
    public static final SlimefunItemStack QS_DAIDAI_DE_HONG_SHI_KUAI= new SlimefunItemStack ( "QS_DAIDAI_DE_HONG_SHI_KUAI", T.QS_DAIDAI_DE_HONG_SHI_KUAI, Y.colorPseudorandomString ("呆呆的红石块") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("可用于合成高级"), Y.colorPseudorandomString("难得的材料") );
    public static final SlimefunItemStack QS_DAIDAI_DE_RO_LU= new SlimefunItemStack ( "QS_DAIDAI_DE_RO_LU", T.QS_DAIDAI_DE_RO_LU, Y.colorPseudorandomString ("呆呆的熔炉") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("可用于合成高级"), Y.colorPseudorandomString("难得的材料") );
    public static final SlimefunItemStack QS_DAIDAI_DE_ZUAN_SHI_KUAI= new SlimefunItemStack ( "QS_DAIDAI_DE_ZUAN_SHI_KUAI", T.QS_DAIDAI_DE_ZUAN_SHI_KUAI, Y.colorPseudorandomString ("呆呆的钻石块") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("可用于合成高级"), Y.colorPseudorandomString("难得的材料") );
    public static final SlimefunItemStack QS_LIE_ZHI_DE_JU_BIAN_HE_XIN= new SlimefunItemStack ( "QS_LIE_ZHI_DE_JU_BIAN_HE_XIN", T.QS_LIE_ZHI_DE_JU_BIAN_HE_XIN, Y.colorPseudorandomString ("劣质的聚变核心") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("可用于合成核聚变装置"), Y.colorPseudorandomString("及其难得的材料") );
    public static final SlimefunItemStack QS_GANG_JIN_HE_XIN = new SlimefunItemStack ( "QS_GANG_JIN_HE_XIN", T.QS_GANG_JIN_HE_XIN, Y.colorPseudorandomString ("钢筋核心") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "), Y.colorPseudorandomString("可用于合成高级"), Y.colorPseudorandomString("难得的材料") );
    public static final SlimefunItemStack QS_GAO_JIE_LONG_DAN = new SlimefunItemStack ( "QS_GAO_JIE_LONG_DAN", T.QS_GAO_JIE_LONG_DAN, Y.colorPseudorandomString ("高级龙蛋") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("高级的材料") );
    public static final SlimefunItemStack QS_CHAO_JI_LONG_DAN = new SlimefunItemStack ( "QS_CHAO_JI_LONG_DAN", T.QS_CHAO_JI_LONG_DAN, Y.colorPseudorandomString ("超级龙蛋") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("顶级的材料") );
    public static final SlimefunItemStack QS_SHI_MO_XI_FEN_CHEN = new SlimefunItemStack ( "QS_SHI_MO_XI_FEN_CHEN", T.QS_SHI_MO_XI_FEN_CHEN, Y.colorPseudorandomString ("石墨烯粉尘") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_SHI_MO_XI = new SlimefunItemStack ( "QS_SHI_MO_XI", T.QS_SHI_MO_XI, Y.colorPseudorandomString ("石墨烯") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_SHI_MO_XI_BAN = new SlimefunItemStack ( "QS_SHI_MO_XI_BAN", T.QS_SHI_MO_XI_BAN, Y.colorPseudorandomString ("石墨烯板") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_SHI_MO_XI_QI_NING_JIAO = new SlimefunItemStack ( "QS_SHI_MO_XI_QI_NING_JIAO", T.QS_SHI_MO_XI_QI_NING_JIAO, Y.colorPseudorandomString ("石墨烯气凝胶") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("及其难得的材料"));
    public static final SlimefunItemStack QS_GAO_ZHUAN_SU_MA_DA = new SlimefunItemStack ( "QS_GAO_ZHUAN_SU_MA_DA", T.QS_GAO_ZHUAN_SU_MA_DA, Y.colorPseudorandomString ("高转速马达") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_YA_SUO_MA_DA = new SlimefunItemStack ( "QS_YA_SUO_MA_DA", T.QS_GAO_ZHUAN_SU_MA_DA, Y.colorPseudorandomString ("压缩马达") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_JI_XIAN_YA_SUO_MA_DA = new SlimefunItemStack ( "QS_JI_XIAN_YA_SUO_MA_DA", T.QS_GAO_ZHUAN_SU_MA_DA, Y.colorPseudorandomString ("极限压缩马达") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_QING_SHAN_MA_DA = new SlimefunItemStack ( "QS_QING_SHAN_MA_DA", T.QS_QING_SHAN_MA_DA, Y.colorPseudorandomString ("青山马达") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_FANG_SHENG_SHU_LIAO = new SlimefunItemStack ( "QS_FANG_SHENG_SHU_LIAO", T.QS_FANG_SHENG_SHU_LIAO, Y.colorPseudorandomString ("仿生塑料") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_FANG_SHENG_JIN_SHU = new SlimefunItemStack ( "QS_FANG_SHENG_JIN_SHU", T.QS_FANG_SHENG_SHU_LIAO, Y.colorPseudorandomString ("仿生金属") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_QING_SHAN_JING_GANG = new SlimefunItemStack ( "QS_QING_SHAN_JING_GANG", T.QS_FANG_SHENG_SHU_LIAO, Y.colorPseudorandomString ("青山精钢") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_JIN_SHU_PAO_MO = new SlimefunItemStack ( "QS_JIN_SHU_PAO_MO", T.QS_JIN_SHU_PAO_MO, Y.colorPseudorandomString ("金属泡沫") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("及其难得的材料"));
    public static final SlimefunItemStack QS_YING_HUA_PAO_MO = new SlimefunItemStack ( "QS_YING_HUA_PAO_MO", T.QS_JIN_SHU_PAO_MO, Y.colorPseudorandomString ("硬化泡沫") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("及其难得的材料"));
    public static final SlimefunItemStack QS_QING_SHAN_PAO_MO = new SlimefunItemStack ( "QS_QING_SHAN_PAO_MO", T.QS_JIN_SHU_PAO_MO, Y.colorPseudorandomString ("青山泡沫") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("及其难得的材料"));
    public static final SlimefunItemStack QS_SAN_YUAN_CUI_HUA_QI = new SlimefunItemStack ( "QS_SAN_YUAN_CUI_HUA_QI", T.QS_SAN_YUAN_CUI_HUA_QI, Y.colorPseudorandomString ("三元催化器") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_WU_YUAN_CUI_HUA_QI = new SlimefunItemStack ( "QS_WU_YUAN_CUI_HUA_QI", T.QS_SAN_YUAN_CUI_HUA_QI, Y.colorPseudorandomString ("五元催化器") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_QING_SHAN_CUI_HUA_QI = new SlimefunItemStack ( "QS_QING_SHAN_CUI_HUA_QI", T.QS_SAN_YUAN_CUI_HUA_QI, Y.colorPseudorandomString ("青山催化器") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_BO_JIN_HE_JIN = new SlimefunItemStack ( "QS_BO_JIN_HE_JIN", T.QS_BO_JIN_HE_JIN, Y.colorPseudorandomString ("铂金合金") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_GAO_QIANG_DU_HE_JIN = new SlimefunItemStack ( "QS_GAO_QIANG_DU_HE_JIN", T.QS_BO_JIN_HE_JIN, Y.colorPseudorandomString ("高强度合金") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_QING_SHAN_HE_JIN = new SlimefunItemStack ( "QS_QING_SHAN_HE_JIN", T.QS_BO_JIN_HE_JIN, Y.colorPseudorandomString ("青山合金") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_WEI_JIN_GE = new SlimefunItemStack ( "QS_WEI_JIN_GE", T.QS_WEI_JIN_GE, Y.colorPseudorandomString ("微晶格") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("及其难得的材料"));
    public static final SlimefunItemStack QS_YA_SUO_WEI_JIN_GE = new SlimefunItemStack ( "QS_YA_SUO_WEI_JIN_GE", T.QS_WEI_JIN_GE, Y.colorPseudorandomString ("压缩微晶格") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("及其难得的材料"));
    public static final SlimefunItemStack QS_QING_SHAN_JIN_GE = new SlimefunItemStack ( "QS_QING_SHAN_JIN_GE", T.QS_WEI_JIN_GE, Y.colorPseudorandomString ("青山晶格") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("及其难得的材料"));
    public static final SlimefunItemStack QS_ZHEN_JUN_PAO_MO = new SlimefunItemStack ( "QS_ZHEN_JUN_PAO_MO", T.QS_ZHEN_JUN_PAO_MO, Y.colorPseudorandomString ("真菌泡沫") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_NA_MI_TAN_WEI_SU = new SlimefunItemStack ( "QS_NA_MI_TAN_WEI_SU", T.QS_NA_MI_TAN_WEI_SU, Y.colorPseudorandomString ("纳米碳维素") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_GAI_TAI_KUANG = new SlimefunItemStack ( "QS_GAI_TAI_KUANG", T.QS_GAI_TAI_KUANG, Y.colorPseudorandomString ("钙钛矿") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_QING_SHAN_GAI_TAI_KUANG = new SlimefunItemStack ( "QS_QING_SHAN_GAI_TAI_KUANG", T.QS_GAI_TAI_KUANG, Y.colorPseudorandomString ("青山钙钛矿") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_NA_MI_DIAN = new SlimefunItemStack ( "QS_NA_MI_DIAN", T.QS_NA_MI_DIAN, Y.colorPseudorandomString ("纳米点") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_QING_SHAN_NA_MI_DIAN = new SlimefunItemStack ( "QS_QING_SHAN_NA_MI_DIAN", T.QS_NA_MI_DIAN, Y.colorPseudorandomString ("青山纳米点") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_QING_SHAN_SHUI_JING = new SlimefunItemStack ( "QS_QING_SHAN_SHUI_JING", T.QS_QING_SHAN_SHUI_JING, Y.colorPseudorandomString ("青山水晶") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_JI_YAN = new SlimefunItemStack ( "QS_JI_YAN", T.QS_JI_YAN, Y.colorPseudorandomString ("基岩") + " " + Y.colorPseudorandomString(" "));
    public static final SlimefunItemStack QS_JI_YAN_SUI_KUAI = new SlimefunItemStack ( "QS_JI_YAN_SUI_KUAI", Material.GOLD_INGOT, Y.colorPseudorandomString ("基岩碎块") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("手指头那么大一块..."));
    public static final SlimefunItemStack QS_JI_YAN_KE_LI = new SlimefunItemStack ( "QS_JI_YAN_KE_LI", Material.GOLD_NUGGET, Y.colorPseudorandomString ("基岩颗粒") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("形成颗粒了..."));
    public static final SlimefunItemStack QS_JI_YAN_FEN_MO = new SlimefunItemStack ( "QS_JI_YAN_FEN_MO", Material.GLOWSTONE_DUST, Y.colorPseudorandomString ("基岩粉末") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("一点点粉尘..."));
    public static final SlimefunItemStack QS_JU_BIAN_HE_XIN_CUI_HUA_QI = new SlimefunItemStack ( "QS_JU_BIAN_HE_XIN_CUI_HUA_QI", Material.PRISMARINE_CRYSTALS, Y.colorPseudorandomString ("聚变核心催化器") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("可用于合成聚变核心"));
    public static final SlimefunItemStack QS_ZI_JING_SHI = new SlimefunItemStack ( "QS_ZI_JING_SHI",T.QS_ZI_JING_SHI, Y.colorPseudorandomString ("紫晶石") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_ZI_JING_SHI_ZHUANG = new SlimefunItemStack ( "QS_ZI_JING_SHI_ZHUANG",T.QS_ZI_JING_SHI_ZHUANG, Y.colorPseudorandomString ("紫晶石装") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_ZI_JING_MO_HE = new SlimefunItemStack ( "QS_ZI_JING_MO_HE",T.QS_ZI_JING_MO_HE, Y.colorPseudorandomString ("紫晶魔核") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_KE_JI_ZHI_XIN = new SlimefunItemStack ( "QS_KE_JI_ZHI_XIN",T.QS_KE_JI_ZHI_XIN, Y.colorPseudorandomString ("科技之星") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_GAO_JIE_XIA_JIE = new SlimefunItemStack ( "QS_GAO_JIE_XIA_JIE",Material.NETHER_STAR, Y.colorPseudorandomString ("高阶下届之星") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_QIANG_HUA_DIN = new SlimefunItemStack ( "QS_QIANG_HUA_DIN",T.QS_QIANG_HUA_DIN, Y.colorPseudorandomString ("强化锭") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static final SlimefunItemStack QS_QIANG_HUA_BAN = new SlimefunItemStack ( "QS_QIANG_HUA_BAN",T.QS_QIANG_HUA_BAN, Y.colorPseudorandomString ("强化板") + " " + Y.colorPseudorandomString(" "), Y.colorPseudorandomString("  "),Y.colorPseudorandomString("难得的材料"));
    public static void setup(TsingshanTechnology qs) {

        new UnplaceableBlock ( C.QS_CL, QS_DAIDAI_DE_TIE_KUAI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            new ItemStack ( Material.IRON_BLOCK,64 ), new ItemStack ( Material.IRON_BLOCK,64 ),new ItemStack ( Material.IRON_BLOCK,64 ),
            QS_JI_YAN, QS_JI_YAN, QS_JI_YAN,
            new ItemStack ( Material.IRON_BLOCK,64 ), new ItemStack ( Material.IRON_BLOCK,64 ),new ItemStack ( Material.IRON_BLOCK,64 )
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_DAIDAI_DE_YUAN_SHI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            new ItemStack ( Material.COBBLESTONE,64 ), new ItemStack ( Material.COBBLESTONE,64 ), new ItemStack ( Material.COBBLESTONE,64 ),
            QS_JI_YAN, new ItemStack ( Material.COBBLESTONE,64 ), QS_JI_YAN,
            new ItemStack ( Material.COBBLESTONE,64 ), new ItemStack ( Material.COBBLESTONE,64 ), new ItemStack ( Material.COBBLESTONE,64 )
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_DAIDAI_DE_JI_YAN , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            null, QS_JI_YAN, null,
            QS_JI_YAN, QS_JI_YAN, QS_JI_YAN,
            null, QS_JI_YAN, null
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_DAIDAI_DE_HONG_SHI_KUAI , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            new ItemStack ( Material.REDSTONE_BLOCK,64 ), new ItemStack ( Material.REDSTONE_BLOCK,64 ), new ItemStack ( Material.REDSTONE_BLOCK,64 ),
            new ItemStack ( Material.REDSTONE_BLOCK,64 ), QS_JI_YAN, new ItemStack ( Material.REDSTONE_BLOCK,64 ),
            new ItemStack ( Material.REDSTONE_BLOCK,64 ), new ItemStack ( Material.REDSTONE_BLOCK,64 ), new ItemStack ( Material.REDSTONE_BLOCK,64 )
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_DAIDAI_DE_RO_LU , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            new ItemStack ( Material.FURNACE,64 ), new ItemStack ( Material.FURNACE,64 ),new ItemStack ( Material.FURNACE,64 ),
            new ItemStack ( Material.FURNACE,64 ), QS_JI_YAN, new ItemStack ( Material.FURNACE,64 ),
            new ItemStack ( Material.FURNACE,64 ), new ItemStack ( Material.FURNACE,64 ), new ItemStack ( Material.FURNACE,64 )
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_DAIDAI_DE_ZUAN_SHI_KUAI , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            new ItemStack ( Material.DIAMOND_BLOCK,64 ), QS_JI_YAN, new ItemStack ( Material.DIAMOND_BLOCK,64 ),
            new ItemStack ( Material.DIAMOND_BLOCK,64 ), new ItemStack ( Material.DIAMOND_BLOCK,64 ), new ItemStack ( Material.DIAMOND_BLOCK,64 ),
            new ItemStack ( Material.DIAMOND_BLOCK,64 ), QS_JI_YAN, new ItemStack ( Material.DIAMOND_BLOCK,64 )
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_LIE_ZHI_DE_JU_BIAN_HE_XIN , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_JU_BIAN_HE_XIN_CUI_HUA_QI, QS_JU_BIAN_HE_XIN_CUI_HUA_QI, QS_JU_BIAN_HE_XIN_CUI_HUA_QI,
            QS_JU_BIAN_HE_XIN_CUI_HUA_QI, QS_JU_BIAN_HE_XIN_CUI_HUA_QI, QS_JU_BIAN_HE_XIN_CUI_HUA_QI,
            QS_JU_BIAN_HE_XIN_CUI_HUA_QI, QS_JU_BIAN_HE_XIN_CUI_HUA_QI, QS_JU_BIAN_HE_XIN_CUI_HUA_QI
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_GANG_JIN_HE_XIN , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YI_JIE_YUAN_SU_JIE_JING, QS_GAO_JIE_XIA_JIE, QS_ER_JIE_YUAN_SU_JIE_JING,
            QS_QIANG_HUA_DIN, QS_WU_JIE_YUAN_SU_JIE_JING, QS_QIANG_HUA_DIN,
            QS_SAN_JIE_YUAN_SU_JIE_JING, QS_GAO_JIE_XIA_JIE, QS_SI_JIE_YUAN_SU_JIE_JING
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_GAO_JIE_LONG_DAN , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            new ItemStack (Material.DRAGON_EGG ), new ItemStack (Material.DRAGON_EGG ), new ItemStack (Material.DRAGON_EGG ),
            new ItemStack (Material.DRAGON_EGG ), new ItemStack (Material.DRAGON_EGG ), new ItemStack (Material.DRAGON_EGG ),
            new ItemStack (Material.DRAGON_EGG ), new ItemStack (Material.DRAGON_EGG ), new ItemStack (Material.DRAGON_EGG )
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_CHAO_JI_LONG_DAN , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_JIE_LONG_DAN, QS_GAO_JIE_LONG_DAN, QS_GAO_JIE_LONG_DAN,
            QS_GAO_JIE_LONG_DAN, QS_GAO_JIE_LONG_DAN, QS_GAO_JIE_LONG_DAN,
            QS_GAO_JIE_LONG_DAN, QS_GAO_JIE_LONG_DAN, QS_GAO_JIE_LONG_DAN
        } ).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_SHI_MO_XI_FEN_CHEN , QingShanRT.QSWP, new ItemStack[]{
            null, null, null,
            null, new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.colorPseudorandomString ("一头呆呆："), Y.colorPseudorandomString ( "尊敬勇士的请您 前往青山世界查看！")), null,
            null, null, null
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_SHI_MO_XI , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SHI_MO_XI_FEN_CHEN, QS_SHI_MO_XI_FEN_CHEN, QS_SHI_MO_XI_FEN_CHEN,
            QS_SHI_MO_XI_FEN_CHEN, QS_SHI_MO_XI_FEN_CHEN, QS_SHI_MO_XI_FEN_CHEN,
            QS_SHI_MO_XI_FEN_CHEN, QS_SHI_MO_XI_FEN_CHEN, QS_SHI_MO_XI_FEN_CHEN
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_SHI_MO_XI_BAN , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SHI_MO_XI, QS_SHI_MO_XI, QS_SHI_MO_XI,
            QS_SHI_MO_XI, QS_SHI_MO_XI, QS_SHI_MO_XI,
            QS_SHI_MO_XI, QS_SHI_MO_XI, QS_SHI_MO_XI
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_SHI_MO_XI_QI_NING_JIAO , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SHI_MO_XI_BAN, QS_SHI_MO_XI_BAN, QS_SHI_MO_XI_BAN,
            QS_SHI_MO_XI_BAN, QS_SHI_MO_XI_BAN, QS_SHI_MO_XI_BAN,
            QS_SHI_MO_XI_BAN, QS_SHI_MO_XI_BAN, QS_SHI_MO_XI_BAN
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_GAO_ZHUAN_SU_MA_DA , QingShanRT.QSWP, new ItemStack[]{
            null, null, null,
            null, new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.colorPseudorandomString ("一头呆呆："), Y.colorPseudorandomString ( "尊敬勇士的请您 前往青山世界查看！")), null,
            null, null, null
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_YA_SUO_MA_DA , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_ZHUAN_SU_MA_DA, QS_GAO_ZHUAN_SU_MA_DA, QS_GAO_ZHUAN_SU_MA_DA,
            QS_GAO_ZHUAN_SU_MA_DA, QS_GAO_ZHUAN_SU_MA_DA, QS_GAO_ZHUAN_SU_MA_DA,
            QS_GAO_ZHUAN_SU_MA_DA, QS_GAO_ZHUAN_SU_MA_DA, QS_GAO_ZHUAN_SU_MA_DA
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_JI_XIAN_YA_SUO_MA_DA , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YA_SUO_MA_DA, QS_YA_SUO_MA_DA, QS_YA_SUO_MA_DA,
            QS_YA_SUO_MA_DA, QS_YA_SUO_MA_DA, QS_YA_SUO_MA_DA,
            QS_YA_SUO_MA_DA, QS_YA_SUO_MA_DA, QS_YA_SUO_MA_DA
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_QING_SHAN_MA_DA , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_JI_XIAN_YA_SUO_MA_DA, QS_JI_XIAN_YA_SUO_MA_DA, QS_JI_XIAN_YA_SUO_MA_DA,
            QS_JI_XIAN_YA_SUO_MA_DA, QS_JI_XIAN_YA_SUO_MA_DA, QS_JI_XIAN_YA_SUO_MA_DA,
            QS_JI_XIAN_YA_SUO_MA_DA, QS_JI_XIAN_YA_SUO_MA_DA, QS_JI_XIAN_YA_SUO_MA_DA
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_FANG_SHENG_SHU_LIAO , QingShanRT.QSWP, new ItemStack[]{
            null, null, null,
            null, new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.colorPseudorandomString ("一头呆呆："), Y.colorPseudorandomString ( "尊敬勇士的请您 前往青山世界查看！")), null,
            null, null, null
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_FANG_SHENG_JIN_SHU, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_FANG_SHENG_SHU_LIAO, QS_FANG_SHENG_SHU_LIAO, QS_FANG_SHENG_SHU_LIAO,
            QS_FANG_SHENG_SHU_LIAO, QS_FANG_SHENG_SHU_LIAO, QS_FANG_SHENG_SHU_LIAO,
            QS_FANG_SHENG_SHU_LIAO, QS_FANG_SHENG_SHU_LIAO, QS_FANG_SHENG_SHU_LIAO
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL,QS_QING_SHAN_JING_GANG , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_FANG_SHENG_JIN_SHU, QS_FANG_SHENG_JIN_SHU, QS_FANG_SHENG_JIN_SHU,
            QS_FANG_SHENG_JIN_SHU, QS_FANG_SHENG_JIN_SHU, QS_FANG_SHENG_JIN_SHU,
            QS_FANG_SHENG_JIN_SHU, QS_FANG_SHENG_JIN_SHU, QS_FANG_SHENG_JIN_SHU
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_JIN_SHU_PAO_MO , QingShanRT.QSWP, new ItemStack[]{
            null, null, null,
            null, new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.colorPseudorandomString ("一头呆呆："), Y.colorPseudorandomString ( "尊敬勇士的请您 前往青山世界查看！")), null,
            null, null, null
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_YING_HUA_PAO_MO, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_JIN_SHU_PAO_MO, QS_JIN_SHU_PAO_MO, QS_JIN_SHU_PAO_MO,
            QS_JIN_SHU_PAO_MO, QS_JIN_SHU_PAO_MO, QS_JIN_SHU_PAO_MO,
            QS_JIN_SHU_PAO_MO, QS_JIN_SHU_PAO_MO, QS_JIN_SHU_PAO_MO
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_QING_SHAN_PAO_MO, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_YING_HUA_PAO_MO, QS_YING_HUA_PAO_MO, QS_YING_HUA_PAO_MO,
            QS_YING_HUA_PAO_MO, QS_YING_HUA_PAO_MO, QS_YING_HUA_PAO_MO,
            QS_YING_HUA_PAO_MO, QS_YING_HUA_PAO_MO, QS_YING_HUA_PAO_MO
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_SAN_YUAN_CUI_HUA_QI , QingShanRT.QSWP, new ItemStack[]{
            null, null, null,
            null, new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.colorPseudorandomString ("一头呆呆："), Y.colorPseudorandomString ( "尊敬勇士的请您 前往青山世界查看！")), null,
            null, null, null
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_WU_YUAN_CUI_HUA_QI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SAN_YUAN_CUI_HUA_QI, QS_SAN_YUAN_CUI_HUA_QI, QS_SAN_YUAN_CUI_HUA_QI,
            QS_SAN_YUAN_CUI_HUA_QI, QS_SAN_YUAN_CUI_HUA_QI, QS_SAN_YUAN_CUI_HUA_QI,
            QS_SAN_YUAN_CUI_HUA_QI, QS_SAN_YUAN_CUI_HUA_QI, QS_SAN_YUAN_CUI_HUA_QI
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_QING_SHAN_CUI_HUA_QI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_WU_YUAN_CUI_HUA_QI, QS_WU_YUAN_CUI_HUA_QI, QS_WU_YUAN_CUI_HUA_QI,
            QS_WU_YUAN_CUI_HUA_QI, QS_WU_YUAN_CUI_HUA_QI, QS_WU_YUAN_CUI_HUA_QI,
            QS_WU_YUAN_CUI_HUA_QI, QS_WU_YUAN_CUI_HUA_QI, QS_WU_YUAN_CUI_HUA_QI
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_BO_JIN_HE_JIN , QingShanRT.QSWP, new ItemStack[]{
            null, null, null,
            null, new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.colorPseudorandomString ("一头呆呆："), Y.colorPseudorandomString ( "尊敬勇士的请您 前往青山世界查看！")), null,
            null, null, null
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_GAO_QIANG_DU_HE_JIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_BO_JIN_HE_JIN, QS_BO_JIN_HE_JIN, QS_BO_JIN_HE_JIN,
            QS_BO_JIN_HE_JIN, QS_BO_JIN_HE_JIN, QS_BO_JIN_HE_JIN,
            QS_BO_JIN_HE_JIN, QS_BO_JIN_HE_JIN, QS_BO_JIN_HE_JIN
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_QING_SHAN_HE_JIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAO_QIANG_DU_HE_JIN, QS_GAO_QIANG_DU_HE_JIN, QS_GAO_QIANG_DU_HE_JIN,
            QS_GAO_QIANG_DU_HE_JIN, QS_GAO_QIANG_DU_HE_JIN, QS_GAO_QIANG_DU_HE_JIN,
            QS_GAO_QIANG_DU_HE_JIN, QS_GAO_QIANG_DU_HE_JIN, QS_GAO_QIANG_DU_HE_JIN
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_WEI_JIN_GE , QingShanRT.QSWP, new ItemStack[]{
            null, null, null,
            null, new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.colorPseudorandomString ("一头呆呆："), Y.colorPseudorandomString ( "尊敬勇士的请您 前往青山世界查看！")), null,
            null, null, null
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_YA_SUO_WEI_JIN_GE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_WEI_JIN_GE, QS_WEI_JIN_GE, QS_WEI_JIN_GE,
            QS_WEI_JIN_GE, QS_WEI_JIN_GE, QS_WEI_JIN_GE,
            QS_WEI_JIN_GE, QS_WEI_JIN_GE, QS_WEI_JIN_GE
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_QING_SHAN_JIN_GE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_WEI_JIN_GE, QS_WEI_JIN_GE, QS_WEI_JIN_GE,
            QS_WEI_JIN_GE, QS_WEI_JIN_GE, QS_WEI_JIN_GE,
            QS_WEI_JIN_GE, QS_WEI_JIN_GE, QS_WEI_JIN_GE
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_ZHEN_JUN_PAO_MO , QingShanRT.QSWP, new ItemStack[]{
            null, null, null,
            null, new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.colorPseudorandomString ("一头呆呆："), Y.colorPseudorandomString ( "尊敬勇士的请您 前往青山世界查看！")), null,
            null, null, null
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_NA_MI_TAN_WEI_SU , QingShanRT.QSWP, new ItemStack[]{
            null, null, null,
            null, new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.colorPseudorandomString ("一头呆呆："), Y.colorPseudorandomString ( "尊敬勇士的请您 前往青山世界查看！")), null,
            null, null, null
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_GAI_TAI_KUANG , QingShanRT.QSWP, new ItemStack[]{
            null, null, null,
            null, new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.colorPseudorandomString ("一头呆呆："), Y.colorPseudorandomString ( "尊敬勇士的请您 前往青山世界查看！")), null,
            null, null, null
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_QING_SHAN_GAI_TAI_KUANG, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_GAI_TAI_KUANG, QS_GAI_TAI_KUANG, QS_GAI_TAI_KUANG,
            QS_GAI_TAI_KUANG, QS_GAI_TAI_KUANG, QS_GAI_TAI_KUANG,
            QS_GAI_TAI_KUANG, QS_GAI_TAI_KUANG, QS_GAI_TAI_KUANG
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_NA_MI_DIAN , QingShanRT.QSWP, new ItemStack[]{
            null, null, null,
            null, new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.colorPseudorandomString ("一头呆呆："), Y.colorPseudorandomString ( "尊敬勇士的请您 前往青山世界查看！")), null,
            null, null, null
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_QING_SHAN_NA_MI_DIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_NA_MI_DIAN, QS_NA_MI_DIAN, QS_NA_MI_DIAN,
            QS_NA_MI_DIAN, QS_NA_MI_DIAN, QS_NA_MI_DIAN,
            QS_NA_MI_DIAN, QS_NA_MI_DIAN, QS_NA_MI_DIAN
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_QING_SHAN_SHUI_JING , RecipeType.NULL, new ItemStack[]{
            null, null, null,
            null, null, null,
            null, null, null
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_JI_YAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_JI_YAN_SUI_KUAI, QS_JI_YAN_SUI_KUAI, QS_JI_YAN_SUI_KUAI,
            QS_JI_YAN_SUI_KUAI, QS_JI_YAN_SUI_KUAI, QS_JI_YAN_SUI_KUAI,
            QS_JI_YAN_SUI_KUAI, QS_JI_YAN_SUI_KUAI, QS_JI_YAN_SUI_KUAI
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_JI_YAN_SUI_KUAI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_JI_YAN_KE_LI, QS_JI_YAN_KE_LI, QS_JI_YAN_KE_LI,
            QS_JI_YAN_KE_LI, QS_JI_YAN_KE_LI, QS_JI_YAN_KE_LI,
            QS_JI_YAN_KE_LI, QS_JI_YAN_KE_LI, QS_JI_YAN_KE_LI
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_JI_YAN_KE_LI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_JI_YAN_FEN_MO, QS_JI_YAN_FEN_MO, QS_JI_YAN_FEN_MO,
            QS_JI_YAN_FEN_MO, QS_JI_YAN_FEN_MO, QS_JI_YAN_FEN_MO,
            QS_JI_YAN_FEN_MO, QS_JI_YAN_FEN_MO, QS_JI_YAN_FEN_MO
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_JI_YAN_FEN_MO , QingShanRT.QSWP, new ItemStack[]{
            null, null, null,
            null, new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.colorPseudorandomString ("一头呆呆："), Y.colorPseudorandomString ( "尊敬勇士的请您 前往青山世界查看！")), null,
            null, null, null
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_JU_BIAN_HE_XIN_CUI_HUA_QI , QingShanRT.QSWP, new ItemStack[]{
            null, null, null,
            null, new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.colorPseudorandomString ("一头呆呆："), Y.colorPseudorandomString ( "尊敬勇士的请您 前往青山世界查看！")), null,
            null, null, null
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_ZI_JING_SHI , QingShanRT.QSWP, new ItemStack[]{
            null, null, null,
            null, new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.colorPseudorandomString ("一头呆呆："), Y.colorPseudorandomString ( "尊敬勇士的请您 前往青山世界查看！")), null,
            null, null, null
        }).register ( qs );

        new UnplaceableBlock ( C.QS_CL, QS_ZI_JING_SHI_ZHUANG, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_ZI_JING_SHI, QS_ZI_JING_SHI, QS_ZI_JING_SHI,
            QS_ZI_JING_SHI, QS_ZI_JING_SHI, QS_ZI_JING_SHI,
            QS_ZI_JING_SHI, QS_ZI_JING_SHI, QS_ZI_JING_SHI
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_ZI_JING_MO_HE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_ZI_JING_SHI_ZHUANG, QS_ZI_JING_SHI_ZHUANG, QS_ZI_JING_SHI_ZHUANG,
            QS_ZI_JING_SHI_ZHUANG, QS_ZI_JING_SHI_ZHUANG, QS_ZI_JING_SHI_ZHUANG,
            QS_ZI_JING_SHI_ZHUANG, QS_ZI_JING_SHI_ZHUANG, QS_ZI_JING_SHI_ZHUANG
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_KE_JI_ZHI_XIN , QingShanRT.QSWP, new ItemStack[]{
            null, null, null,
            null, new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.colorPseudorandomString ("一头呆呆："), Y.colorPseudorandomString ( "尊敬勇士的请您 前往青山世界查看！")), null,
            null, null, null
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_GAO_JIE_XIA_JIE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            new ItemStack ( Material.NETHER_STAR ), new ItemStack ( Material.NETHER_STAR ), new ItemStack ( Material.NETHER_STAR ),
            new ItemStack ( Material.NETHER_STAR ), new ItemStack ( Material.NETHER_STAR ), new ItemStack ( Material.NETHER_STAR ),
            new ItemStack ( Material.NETHER_STAR ), new ItemStack ( Material.NETHER_STAR ), new ItemStack ( Material.NETHER_STAR ),
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_QIANG_HUA_DIN, QingShanRT.YLL, new ItemStack[]{
            SlimefunItems.PLUTONIUM, SlimefunItems.REDSTONE_ALLOY, SlimefunItems.URANIUM,
            SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.CARBONADO, SlimefunItems.REINFORCED_ALLOY_INGOT,
            SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.GOLD_22K, SlimefunItems.NEPTUNIUM
        }).register ( qs );
        new UnplaceableBlock ( C.QS_CL, QS_QIANG_HUA_BAN, RecipeType.COMPRESSOR, new ItemStack[]{
            new SlimefunItemStack ( QS_QIANG_HUA_DIN,8 ), null, null,
            null, null, null,
            null, null, null
        }).register ( qs );



    }
}
