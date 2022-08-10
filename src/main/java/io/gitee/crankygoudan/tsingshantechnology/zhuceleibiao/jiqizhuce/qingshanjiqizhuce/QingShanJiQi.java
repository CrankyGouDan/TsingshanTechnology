package io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.jiqizhuce.qingshanjiqizhuce;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.machines.jiqi.qingshanjiqi.*;
import io.gitee.crankygoudan.tsingshantechnology.machines.jiqiMoBan.YuanShiBaoFaQiMoBan;
import io.gitee.crankygoudan.tsingshantechnology.utils.C;
import io.gitee.crankygoudan.tsingshantechnology.utils.T;
import io.gitee.crankygoudan.tsingshantechnology.utils.Y;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanCaiLiao.*;
import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanYaSuoCaiLiao.*;

public class QingShanJiQi {

    public static final SlimefunItemStack QS_QIAN_YING_HE_BAO_FA_QI = new SlimefunItemStack
            ( "QS_QIAN_YING_HE_BAO_FA_QI ",
                    T.QS_QIAN_YING_HE_BAO_FA_QI,
                    Y.colorPseudorandomString ("潜影盒爆发器")+ " " + Y.colorPseudorandomString("I"),
                Y.colorPseudorandomString("源源不断的潜影盒"),
                Y.colorPseudorandomString("  "),
                MachineLore.energyBuffer (250000000),
                MachineLore.energyPerSecond(25000000));


    public static final SlimefunItemStack QS_KE_KONG_HR_JU_BIAN_ZHUANG_ZHI_I = new SlimefunItemStack
            ( "QS_KE_KONG_HR_JU_BIAN_ZHUANG_ZHI_I ",
                    T.QS_KE_KONG_HR_JU_BIAN_ZHUANG_ZHI_I,
                    Y.colorPseudorandomString ("可控核聚变装置") + " " + Y.colorPseudorandomString("I"),
                    Y.colorPseudorandomString("达到极限的尖端科技， 用于制造凋零骷髅头"),
                    Y.colorPseudorandomString("需要耗费巨额电量 "),
                    Y.colorPseudorandomString("每300秒完成一次聚变"),
                    Y.colorPseudorandomString("  "),
                    MachineLore.energyBuffer (250000000),
                    MachineLore.energyPerSecond(25000000));

    public static final SlimefunItemStack QS_KE_KONG_HR_JU_BIAN_ZHUANG_ZHI_II = new SlimefunItemStack
            ( "QS_KE_KONG_HR_JU_BIAN_ZHUANG_ZHI_II ",
                    T.QS_KE_KONG_HR_JU_BIAN_ZHUANG_ZHI_II,
                    Y.colorPseudorandomString ("可控核聚变装置") + " " + Y.colorPseudorandomString("II"),
                    Y.colorPseudorandomString("达到极限的尖端科技， 用于制造下届之星"),
                    Y.colorPseudorandomString("需要耗费巨额电量 "),
                    Y.colorPseudorandomString("每300秒完成一次聚变"),
                Y.colorPseudorandomString("  "),
                MachineLore.energyBuffer (500000000),
                MachineLore.energyPerSecond(50000000));

    public static final SlimefunItemStack QS_YUAN_SHI_BAO_FA_QI_I = new SlimefunItemStack
            ( "QS_YUAN_SHI_BAO_FA_QI_I ",
                    T.QS_YUAN_SHI_BAO_FA_QI_I,
                    Y.colorPseudorandomString ("青山初级原石爆发器") + " " + Y.colorPseudorandomString(" "),
                    Y.colorPseudorandomString("   "),
                    Y.colorPseudorandomString("每秒生产一个原石"),
                    MachineLore.speed(1),
                    MachineLore.energyPerSecond(520));


    public static final SlimefunItemStack QS_YUAN_SHI_BAO_FA_QI_II = new SlimefunItemStack
            ( "QS_YUAN_SHI_BAO_FA_QI_II ",
                    T.QS_YUAN_SHI_BAO_FA_QI_II,
                    Y.colorPseudorandomString ("青山高级原石爆发器") + " " + Y.colorPseudorandomString(" "),
                    Y.colorPseudorandomString("   "),
                    Y.colorPseudorandomString("每秒生产4个原石"),
                    MachineLore.speed(4),
                    MachineLore.energyPerSecond(3500));

    public static final SlimefunItemStack QS_YUAN_SHI_BAO_FA_QI_III = new SlimefunItemStack
            ( "QS_YUAN_SHI_BAO_FA_QI_III ",
                    T.QS_YUAN_SHI_BAO_FA_QI_III,
                    Y.colorPseudorandomString ("青山神级原石爆发器") + " " + Y.colorPseudorandomString(" "),
                    Y.colorPseudorandomString("   "),
                    Y.colorPseudorandomString("每秒生产64个原石"),
                    MachineLore.speed(64),
                    MachineLore.energyPerSecond(25000));

    public static final SlimefunItemStack QS_ZENG_QIANG_XING_GONG_ZUO_TAI = new SlimefunItemStack (
        "QS_ZENG_QIANG_XING_GONG_ZUO_TAI",
        T.QS_ZENG_QIANG_XING_GONG_ZUO_TAI,
        Y.colorPseudorandomString ("自动增强型工作台") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("   "),
        Y.colorPseudorandomString("全自动制造增强型工作台物品"),
        MachineLore.energyBuffer(1536),
        MachineLore.energyPerSecond(512));

    public static final SlimefunItemStack QS_MO_FA_GONG_ZUO_TAI = new SlimefunItemStack (
        "QS_MO_FA_GONG_ZUO_TAI",
        T.QS_MO_FA_GONG_ZUO_TAI,
        Y.colorPseudorandomString ("自动魔法工作台") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("   "),
        Y.colorPseudorandomString("全自动制造魔法工作台物品"),
        MachineLore.energyBuffer(1536),
        MachineLore.energyPerSecond(512));

    public static final SlimefunItemStack QS_KUI_JIA_DUAN_ZAO_TAI = new SlimefunItemStack (
        "QS_KUI_JIA_DUAN_ZAO_TAI",
        T.QS_KUI_JIA_DUAN_ZAO_TAI,
        Y.colorPseudorandomString ("自动盔甲锻造台") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("   "),
        Y.colorPseudorandomString("全自动制造盔甲锻造台物品"),
        MachineLore.energyBuffer(1536),
        MachineLore.energyPerSecond(512));

    public static final SlimefunItemStack QS_YUAN_GU_JI_TAN = new SlimefunItemStack (
        "QS_YUAN_GU_JI_TAN",
        T.QS_YUAN_GU_JI_TAN,
        Y.colorPseudorandomString ("自动远古祭坛") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("   "),
        Y.colorPseudorandomString("全自动制造远古祭坛物品"),
        MachineLore.energyBuffer(1536),
        MachineLore.energyPerSecond(512));

    public static final SlimefunItemStack QS_YUAN_SHI_ZHI_ZAO_JI = new SlimefunItemStack (
        "QS_YUAN_SHI_ZHI_ZAO_JI",
        T.QS_YUAN_SHI_ZHI_ZAO_JI,
        Y.colorPseudorandomString ("圆石制造机") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("   "),
        Y.colorPseudorandomString("以后再也不用制造刷石机了"),
        MachineLore.energyBuffer(512),
        MachineLore.energyPerSecond(36));

    public static final SlimefunItemStack QS_DI_YU_YAN_ZHI_ZAO_JI = new SlimefunItemStack (
        "QS_DI_YU_YAN_ZHI_ZAO_JI",
        T.QS_DI_YU_YAN_ZHI_ZAO_JI,
        Y.colorPseudorandomString ("地狱岩制造机") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("   "),
        Y.colorPseudorandomString("以后再也不用去挖地狱岩了"),
        MachineLore.energyBuffer(512),
        MachineLore.energyPerSecond(36));

    public static final SlimefunItemStack QS_SHA_LI_ZHI_ZAO_JI = new SlimefunItemStack (
        "QS_SHA_LI_ZHI_ZAO_JI",
        T.QS_SHA_LI_ZHI_ZAO_JI,
        Y.colorPseudorandomString ("沙砾制造机") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString(" 每秒生产一个沙砾相当耗电"),
        Y.colorPseudorandomString("或许你需要超大的能源才行"),
        MachineLore.energyBuffer(20000),
        MachineLore.energyPerSecond(5000));

    public static final SlimefunItemStack QS_HUANG_JIN_ZHUAN_HUAN_QI = new SlimefunItemStack (
        "QS_HUANG_JIN_ZHUAN_HUAN_QI",
        T.QS_HUANG_JIN_ZHUAN_HUAN_QI,
        Y.colorPseudorandomString ("黄金转换器") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("   "),
        Y.colorPseudorandomString("可以将粘液金锭转换为普通金锭"),
        MachineLore.energyBuffer(256),
        MachineLore.energyPerSecond(9));

    public static final SlimefunItemStack QS_FEN_SUI_JI = new SlimefunItemStack (
        "QS_FEN_SUI_JI",
        T.QS_FEN_SUI_JI,
        Y.colorPseudorandomString ("粉碎机") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("   "),
        Y.colorPseudorandomString("可以将一些方块变成沙子沙砾等....."),
        MachineLore.speed(1),
        MachineLore.energyBuffer(256),
        MachineLore.energyPerSecond(9));

    public static final SlimefunItemStack QS_MU_CAI_ZHI_ZAO_JI = new SlimefunItemStack (
        "QS_MU_CAI_ZHI_ZAO_JI",
        T.QS_MU_CAI_ZHI_ZAO_JI,
        Y.colorPseudorandomString ("木材制造机") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("这可比机器人方便多了"),
        MachineLore.energyBuffer(5120),
        MachineLore.energyPerSecond(2500));

    public static final SlimefunItemStack QS_QI_HUA_JI = new SlimefunItemStack (
        "QS_QI_HUA_JI",
        T.QS_QI_HUA_JI,
        Y.colorPseudorandomString ("气化机") + " " + Y.colorPseudorandomString(" "),
        Y.colorPseudorandomString("可以转化一些材料"),
        MachineLore.energyBuffer(256),
        MachineLore.energyPerSecond(16));
    public static final SlimefunItemStack QS_NA_MI_TAN_WEI_SU1 = QS_NA_MI_TAN_WEI_SU;


    public static void setup(TsingshanTechnology qs) {


        new ChaoJiZhiLianLu_V0 ( C.QS_JQ,  ChaoJiZhiLianLu_V0.QS_CHAO_JI_ZHI_LIAN_LU_V0, RecipeType.ENHANCED_CRAFTING_TABLE,
            ChaoJiZhiLianLu_V0.RECIPE_QS_CHAO_JI_ZHI_LIAN_LU_V0).setMachineIdentifier( ChaoJiZhiLianLu_V0.QS_CHAO_JI_ZHI_LIAN_LU_V0.getItemId())
            .setMachineRecipes( ChaoJiZhiLianLu_V0.getAllRecipe()).
            setTimeProcess(5).
            setProcessingSpeed(1).
            setCapacity(300)
            .setEnergyConsumption(128).register(qs);

        new ChaoJiZhiLianLu_V1 ( C.QS_JQ,  ChaoJiZhiLianLu_V1.QS_CHAO_JI_ZHI_LIAN_LU_V1, RecipeType.ENHANCED_CRAFTING_TABLE,
            ChaoJiZhiLianLu_V1.RECIPE_QS_CHAO_JI_ZHI_LIAN_LU_V1).setMachineIdentifier( ChaoJiZhiLianLu_V1.QS_CHAO_JI_ZHI_LIAN_LU_V1.getItemId())
            .setMachineRecipes( ChaoJiZhiLianLu_V1.getAllRecipe()).
            setTimeProcess(5).
            setProcessingSpeed(1).
            setCapacity(10000)
            .setEnergyConsumption(3456).register(qs);

        new ChaoJiZhiLianLu_V2 ( C.QS_JQ,  ChaoJiZhiLianLu_V2.QS_CHAO_JI_ZHI_LIAN_LU_V2, RecipeType.ENHANCED_CRAFTING_TABLE,
            ChaoJiZhiLianLu_V2.RECIPE_QS_CHAO_JI_ZHI_LIAN_LU_V2).setMachineIdentifier( ChaoJiZhiLianLu_V2.QS_CHAO_JI_ZHI_LIAN_LU_V2.getItemId())
            .setMachineRecipes( ChaoJiZhiLianLu_V2.getAllRecipe()).
            setTimeProcess(5).
            setProcessingSpeed(1).
            setCapacity(20000)
            .setEnergyConsumption(7200).register(qs);

        new ChaoJiZhiLianLu_V3 ( C.QS_JQ,  ChaoJiZhiLianLu_V3.QS_CHAO_JI_ZHI_LIAN_LU_V3, RecipeType.ENHANCED_CRAFTING_TABLE,
            ChaoJiZhiLianLu_V3.RECIPE_QS_CHAO_JI_ZHI_LIAN_LU_V3).setMachineIdentifier( ChaoJiZhiLianLu_V3.QS_CHAO_JI_ZHI_LIAN_LU_V3.getItemId())
            .setMachineRecipes( ChaoJiZhiLianLu_V3.getAllRecipe()).
            setTimeProcess(5).
            setProcessingSpeed(1).
            setCapacity(100000)
            .setEnergyConsumption(36000).register(qs);
        new QianYingHe ( C.QS_JQ, QS_QIAN_YING_HE_BAO_FA_QI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_JIN_SHU_PAO_MO, QS_JIN_SHU_PAO_MO, QS_JIN_SHU_PAO_MO,
            QS_JIN_SHU_PAO_MO, QS_NA_MI_DIAN, QS_JIN_SHU_PAO_MO,
            QS_JIN_SHU_PAO_MO, QS_JIN_SHU_PAO_MO, QS_JIN_SHU_PAO_MO
        } ).register ( qs );
        new KeKongHeJuBianZhaungZhi_I ( C.QS_JQ, QS_KE_KONG_HR_JU_BIAN_ZHUANG_ZHI_I, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_WU_JIE_YUAN_SU_JIE_JING, QS_SHI_MO_XI_QI_NING_JIAO, QS_WU_JIE_YUAN_SU_JIE_JING,
            QS_WU_JIE_YUAN_SU_JIE_JING, QS_LIE_ZHI_DE_JU_BIAN_HE_XIN, QS_WU_JIE_YUAN_SU_JIE_JING,
            QS_WU_JIE_YUAN_SU_JIE_JING, QS_SHI_MO_XI_QI_NING_JIAO, QS_WU_JIE_YUAN_SU_JIE_JING
        } ).register ( qs );
        new KeKongHeJuBianZhaungZhi_II ( C.QS_JQ, QS_KE_KONG_HR_JU_BIAN_ZHUANG_ZHI_II, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            QS_SHI_MO_XI_QI_NING_JIAO, QS_WU_JIE_YUAN_SU_JIE_JING, QS_SHI_MO_XI_QI_NING_JIAO,
            QS_SHI_MO_XI_QI_NING_JIAO, QS_KE_KONG_HR_JU_BIAN_ZHUANG_ZHI_I, QS_SHI_MO_XI_QI_NING_JIAO,
            QS_SHI_MO_XI_QI_NING_JIAO, QS_WU_JIE_YUAN_SU_JIE_JING, QS_SHI_MO_XI_QI_NING_JIAO
        }).register ( qs );

        new YuanShiBaoFaQiMoBan ( C.QS_JQ, QS_YUAN_SHI_BAO_FA_QI_I, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            QS_YUAN_SHI_ZHI_ZAO_JI, new ItemStack ( Material.NETHERITE_INGOT ), QS_YUAN_SHI_ZHI_ZAO_JI,
            new ItemStack ( Material.WATER_BUCKET ), QS_YUAN_SHI_ZHI_ZAO_JI, new ItemStack ( Material.LAVA_BUCKET ),
            QS_YUAN_SHI_ZHI_ZAO_JI, QS_SAN_YUAN_CUI_HUA_QI, QS_YUAN_SHI_ZHI_ZAO_JI
        }).material( Material.COBBLESTONE).speed(1).energyPerTick(520).register(qs);

        new YuanShiBaoFaQiMoBan ( C.QS_JQ, QS_YUAN_SHI_BAO_FA_QI_II, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            QS_SAN_YUAN_CUI_HUA_QI, QS_NA_MI_TAN_WEI_SU1, QS_SAN_YUAN_CUI_HUA_QI,
            new ItemStack ( Material.WATER_BUCKET ), QS_DAIDAI_DE_HONG_SHI_KUAI, new ItemStack ( Material.LAVA_BUCKET ),
            QS_SAN_YUAN_CUI_HUA_QI, QS_YUAN_SHI_BAO_FA_QI_I, QS_SAN_YUAN_CUI_HUA_QI
        }).material( Material.COBBLESTONE).speed(4).energyPerTick(3500).register(qs);

        new YuanShiBaoFaQiMoBan ( C.QS_JQ, QS_YUAN_SHI_BAO_FA_QI_III, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            QS_YUAN_SHI_BAO_FA_QI_II, QS_NA_MI_DIAN, QS_YUAN_SHI_BAO_FA_QI_II,
            QS_YUAN_SHI_BAO_FA_QI_II, QS_WU_JIE_YUAN_SU_JIE_JING, QS_YUAN_SHI_BAO_FA_QI_II,
            QS_YUAN_SHI_BAO_FA_QI_II, QS_SHI_MO_XI_QI_NING_JIAO,QS_YUAN_SHI_BAO_FA_QI_II
        }).material( Material.COBBLESTONE).speed(64).energyPerTick(25000).register(qs);


        new ZengQiangXingGongZuoTai ( C.QS_JQ, QS_ZENG_QIANG_XING_GONG_ZUO_TAI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            new ItemStack ( Material.CRAFTING_TABLE ), SlimefunItems.ADVANCED_CIRCUIT_BOARD, new ItemStack ( Material.CRAFTING_TABLE ),
            SlimefunItems.CRAFTING_MOTOR, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.CRAFTING_MOTOR,
            new ItemStack ( Material.CRAFTING_TABLE ), SlimefunItems.ELECTRIC_MOTOR, new ItemStack ( Material.CRAFTING_TABLE )
        }).register ( qs );

        new MoFaGongZuoTai ( C.QS_JQ, QS_MO_FA_GONG_ZUO_TAI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            new ItemStack ( Material.BOOKSHELF ), SlimefunItems.ADVANCED_CIRCUIT_BOARD, new ItemStack ( Material.BOOKSHELF ),
            SlimefunItems.CRAFTING_MOTOR, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.CRAFTING_MOTOR,
            new ItemStack ( Material.BOOKSHELF ), SlimefunItems.ELECTRIC_MOTOR, new ItemStack ( Material.BOOKSHELF)
        }).register ( qs );

        new KuiJiaDuanZaoTai ( C.QS_JQ, QS_KUI_JIA_DUAN_ZAO_TAI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            new ItemStack ( Material.ANVIL ), SlimefunItems.ADVANCED_CIRCUIT_BOARD, new ItemStack ( Material.ANVIL ),
            SlimefunItems.CRAFTING_MOTOR, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.CRAFTING_MOTOR,
            new ItemStack ( Material.ANVIL ), SlimefunItems.ELECTRIC_MOTOR, new ItemStack ( Material.ANVIL)
        }).register ( qs );

        new YuanGuJiTanGongZuoTai ( C.QS_JQ, QS_YUAN_GU_JI_TAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
           SlimefunItems.ANCIENT_ALTAR, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.ANCIENT_ALTAR,
            SlimefunItems.CRAFTING_MOTOR, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.CRAFTING_MOTOR,
            SlimefunItems.ANCIENT_ALTAR, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ANCIENT_ALTAR
        }).register ( qs );

        new YuanShiZhiZaoJi  ( C.QS_JQ, QS_YUAN_SHI_ZHI_ZAO_JI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.PROGRAMMABLE_ANDROID_MINER, new ItemStack ( Material.NETHERITE_PICKAXE ), SlimefunItems.PROGRAMMABLE_ANDROID_MINER,
            new ItemStack ( Material.WATER_BUCKET ), SlimefunItems.PROGRAMMABLE_ANDROID_MINER, new ItemStack ( Material.LAVA_BUCKET ),
            SlimefunItems.PROGRAMMABLE_ANDROID_MINER, new ItemStack ( Material.NETHERITE_PICKAXE ), SlimefunItems.PROGRAMMABLE_ANDROID_MINER
        }).register ( qs );

        new DiYuYaniZhiZaoJi ( C.QS_JQ, QS_DI_YU_YAN_ZHI_ZAO_JI , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.PROGRAMMABLE_ANDROID_FARMER, new ItemStack ( Material.NETHERITE_PICKAXE ), SlimefunItems.PROGRAMMABLE_ANDROID_FARMER,
            new ItemStack ( Material.WATER_BUCKET ), SlimefunItems.PROGRAMMABLE_ANDROID_MINER, new ItemStack ( Material.LAVA_BUCKET ),
            SlimefunItems.PROGRAMMABLE_ANDROID_FARMER, new ItemStack ( Material.NETHERITE_PICKAXE ), SlimefunItems.PROGRAMMABLE_ANDROID_FARMER
        }).register ( qs );

        new ShaLiZhiZaoJi ( C.QS_JQ, QS_SHA_LI_ZHI_ZAO_JI , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ELECTRIC_ORE_GRINDER_2,
            QS_YUAN_SHI_ZHI_ZAO_JI, SlimefunItems.PROGRAMMABLE_ANDROID_MINER, QS_YUAN_SHI_ZHI_ZAO_JI,
            SlimefunItems.ELECTRIC_ORE_GRINDER_2, SlimefunItems.LARGE_CAPACITOR, SlimefunItems.ELECTRIC_ORE_GRINDER_2
        }).register ( qs );

        new HuangJinZhuanHuanQi ( C.QS_JQ, QS_HUANG_JIN_ZHUAN_HUAN_QI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            null, SlimefunItems.SILVER_INGOT, null,
            SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.GILDED_IRON, SlimefunItems.ELECTRIC_MOTOR,
            new  ItemStack ( Material.GOLDEN_PICKAXE ), SlimefunItems.MEDIUM_CAPACITOR,  new  ItemStack ( Material.GOLDEN_PICKAXE )
        }).register ( qs );

        new FenSuiJi ( C.QS_JQ, QS_FEN_SUI_JI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.FERROSILICON, SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.FERROSILICON,
            SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.STEEL_PLATE, SlimefunItems.ELECTRIC_MOTOR,
            new  ItemStack ( Material.IRON_PICKAXE ), SlimefunItems.MEDIUM_CAPACITOR,  new  ItemStack ( Material.IRON_PICKAXE )
        }).register ( qs );

        new MuCaiZhiZaoJi ( C.QS_JQ, QS_MU_CAI_ZHI_ZAO_JI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            SlimefunItems.PROGRAMMABLE_ANDROID_WOODCUTTER,SlimefunItems.MAGNESIUM_INGOT, SlimefunItems.PROGRAMMABLE_ANDROID_WOODCUTTER,
            new ItemStack ( Material.NETHERITE_AXE ), SlimefunItems.PROGRAMMABLE_ANDROID_MINER,new ItemStack ( Material.NETHERITE_AXE ),
            SlimefunItems.PROGRAMMABLE_ANDROID_WOODCUTTER, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.PROGRAMMABLE_ANDROID_WOODCUTTER
        }).register ( qs );

        new QiHuaJi ( C.QS_JQ, QS_QI_HUA_JI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
            new ItemStack ( Material.MAGMA_BLOCK ), SlimefunItems.HEATING_COIL, new ItemStack ( Material.MAGMA_BLOCK ),
            SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.FLUID_PUMP, SlimefunItems.ELECTRIC_MOTOR,
            new ItemStack ( Material.MAGMA_BLOCK ), SlimefunItems.MEDIUM_CAPACITOR, new ItemStack ( Material.MAGMA_BLOCK )
        }).register ( qs );











    }
}
