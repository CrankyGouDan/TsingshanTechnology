package io.gitee.crankygoudan.tsingshantechnology.utils;

import io.gitee.crankygoudan.tsingshantechnology.Categories;
import io.gitee.crankygoudan.tsingshantechnology.TL;
import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.machines.Gongzuotai.Kuijiaduanzaoxiang;
import io.gitee.crankygoudan.tsingshantechnology.machines.Gongzuotai.Mofagongzuoxiang;
import io.gitee.crankygoudan.tsingshantechnology.machines.Gongzuotai.Yuangujitanxiang;
import io.gitee.crankygoudan.tsingshantechnology.machines.Gongzuotai.Zengqiangxinggongzuoxiang;
import io.gitee.crankygoudan.tsingshantechnology.machines.jiqi.*;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.machines.ElectricSmeltery;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Jiqi {

    private static final int ADVANCED_SMELTERY_ENERGY = 555;
    private static final int ADVANCED_SMELTERY_SPEED = 64;

    public static final SlimefunItemStack QS_JQ_QZDZQXGZX = new SlimefunItemStack ( "QS_JQ_QZDZQXGZX", TL.QS_JQ_QZDZQXGZX,
            TextUtil.colorPseudorandomString("全自动增强型工作箱") + " " + TextUtil.colorPseudorandomString(" "),
            TextUtil.colorPseudorandomString("在增强型工作箱内自动制造粘液物品"));

    public static final SlimefunItemStack QS_JQ_QZDKJDZX = new SlimefunItemStack ("QS_JQ_ZDKJDZX", TL.QS_JQ_QZDKJDZX,
            TextUtil.colorPseudorandomString("全自盔甲锻造箱") + " " + TextUtil.colorPseudorandomString(" "),
            TextUtil.colorPseudorandomString("在锻造箱内自动制造盔甲物品"));
    public static final SlimefunItemStack QS_JQ_QZDMFGZX = new SlimefunItemStack ("QS_JQ_QZDMFGZX", TL.QS_JQ_QZDMFGZX,
            TextUtil.colorPseudorandomString("全自魔法工作箱") + " " + TextUtil.colorPseudorandomString(" "),
            TextUtil.colorPseudorandomString("在魔法工作箱内自动制造魔法物品"));

    public static final SlimefunItemStack QS_JQ_QZDYGJT = new SlimefunItemStack ("QS_JQ_QZDYGJT", TL.QS_JQ_QZDYGJT,
            TextUtil.colorPseudorandomString("全自动远古祭坛") + " " + TextUtil.colorPseudorandomString(" "),
            TextUtil.colorPseudorandomString("在祭坛内自动制造祭坛物品"));
    public static final SlimefunItemStack QS_JQ_HNTJB = new SlimefunItemStack("QS_JQ_HNTJB", TL.QS_JQ_HNTJB, TextUtil.colorPseudorandomString("混凝土搅拌机")+ " " + TextUtil.colorPseudorandomString("基础"),
            TextUtil.colorPseudorandomString("强制式双卧轴混凝土搅拌机双拌式混凝土摊成型机"),
            TextUtil.colorPseudorandomString(" "),
            MachineLore.speed(8),
            MachineLore.energyBuffer(256),
            MachineLore.energyPerSecond(64));
    public static final SlimefunItemStack QS_JQ_YHJ = new SlimefunItemStack("QS_JQ_YHJ", TL.QS_JQ_YHJ, TextUtil.colorPseudorandomString("液化机")+ " " + TextUtil.colorPseudorandomString("基础"),
            TextUtil.colorPseudorandomString("使热转变为能 "),
            TextUtil.colorPseudorandomString(" "),
            MachineLore.energyBuffer(512),
            MachineLore.energyPerSecond(128));

    public static final SlimefunItemStack QS_JQ_SXJ = new SlimefunItemStack("QS_JQ_SXJ", TL.QS_JQ_SXJ, TextUtil.colorPseudorandomString("筛选机")+ " " + TextUtil.colorPseudorandomString("基础"),
            TextUtil.colorPseudorandomString("找出各参数的最佳组合方案 。"),
            TextUtil.colorPseudorandomString("为筛选机构的优化设计提供可靠的依据"),
            TextUtil.colorPseudorandomString(" "),
            MachineLore.energyBuffer(256),
            MachineLore.energyPerSecond(64));

    public static final SlimefunItemStack QS_JQ_HJZHQ = new SlimefunItemStack("QS_JQ_HJZHQ", TL.QS_JQ_HJZHQ, TextUtil.colorPseudorandomString("黄金转换器")+ " " + TextUtil.colorPseudorandomString("基础"),
            TextUtil.colorPseudorandomString("大众拒绝旧型转换器方案置评"),
            TextUtil.colorPseudorandomString("我们已与当局讨论了几种思路 在上一周以及接下来的一周 "),
            TextUtil.colorPseudorandomString("我们将与当局讨论下一步措施 希望能更接近于与他们达成一项协议 "),
            TextUtil.colorPseudorandomString("   "),
            MachineLore.energyBuffer(512),
            MachineLore.energyPerSecond(99));

    public static final SlimefunItemStack QS_JQ_XKLZPJ = new SlimefunItemStack("QS_JQ_XKLZPJ", Material.DIAMOND_BLOCK, TextUtil.colorPseudorandomString("雪傀儡装配机")+ " " + TextUtil.colorPseudorandomString("基础"),
            TextUtil.colorPseudorandomString(" "),
            TextUtil.colorPseudorandomString("冷却时间: 30 秒 "),
            TextUtil.colorPseudorandomString("4096 J 可储存"),
            TextUtil.colorPseudorandomString("4096 J/个雪傀儡"));

    public static final SlimefunItemStack QS_JQ_JJXKFZZJ = new SlimefunItemStack("QS_JQ_JJXKFZZJ", Material.CRACKED_STONE_BRICKS, TextUtil.colorPseudorandomString("经济型矿粉制造机")+ " " + TextUtil.colorPseudorandomString("基础"),
            TextUtil.colorPseudorandomString(" "),
            TextUtil.colorPseudorandomString("一个经济型多合一机器,"),
            TextUtil.colorPseudorandomString("可以直接使用圆石或者其他变种来获取矿粉"),
            TextUtil.colorPseudorandomString("为懒狗制作的机器..."), " ",
            LoreBuilder.machine( MachineTier.GOOD, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerBuffer( Jingjixingkuangfenji.CAPACITY),
            LoreBuilder.powerPerSecond( Jingjixingkuangfenji.ENERGY_CONSUMPTION));
    public static final SlimefunItemStack QS_JQ_GJZLL_V1 = new SlimefunItemStack("QS_JQ_GJZLL_V1", Material.FURNACE, TextUtil.colorPseudorandomString("高级治炼炉")+ " " + TextUtil.colorPseudorandomString("基础"),
            TextUtil.colorPseudorandomString("不一样的治炼熔炉"),
            TextUtil.colorPseudorandomString(" "),
            MachineLore.speed(ADVANCED_SMELTERY_SPEED),
            MachineLore.energyPerSecond(ADVANCED_SMELTERY_ENERGY));




    //public static final SlimefunItemStack QS_JQ_TJJ_V1= new SlimefunItemStack("QS_JQ_TJJ_V1", Material.BROWN_TERRACOTTA, TextUtil.colorPseudorandomString("电动淘金机")+ " " + TextUtil.colorPseudorandomString("基础"), TextUtil.colorPseudorandomString("  "), MachineLore.speed(2), MachineLore.energyBuffer ( 264 ), MachineLore.energyPerSecond(44));


        public static void setup(TsingshanTechnology qs) {
            new Zengqiangxinggongzuoxiang ( Categories.QS_JQ, QS_JQ_QZDZQXGZX, RecipeType.NULL, new ItemStack[]{
                    null, null, null,
                    null, null, null,
                    null, null, null
            } ).register ( qs );

            new Kuijiaduanzaoxiang ( Categories.QS_JQ, QS_JQ_QZDKJDZX, RecipeType.NULL, new ItemStack[]{
                    null, null, null,
                    null, null, null,
                    null, null, null
            } ).register ( qs );

            new Mofagongzuoxiang ( Categories.QS_JQ, QS_JQ_QZDMFGZX, RecipeType.NULL, new ItemStack[]{
                    null, null, null,
                    null, null, null,
                    null, null, null
            } ).register ( qs );

            new Yuangujitanxiang ( Categories.QS_JQ,QS_JQ_QZDYGJT, RecipeType.NULL, new ItemStack[]{
                    null, null, null,
                    null, null, null,
                    null, null, null
            } ).register ( qs );

        new Hunnitujiaobanji ( Categories.QS_JQ, QS_JQ_HNTJB, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );

        new Yehuaji ( Categories.QS_JQ, QS_JQ_YHJ, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );

        new Shaixuanji ( Categories.QS_JQ, QS_JQ_SXJ, RecipeType.NULL, new ItemStack[]{
                 null, null, null,
                 null, null, null,
                 null, null, null
        } ).register ( qs );

        new Huangjinzhuanhuanqi ( Categories.QS_JQ, QS_JQ_HJZHQ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                 null, null, null,
                 null, null, null,
                 null, null, null
        } ).register ( qs );

        new SnowmanAssembler ( Categories.QS_JQ, QS_JQ_XKLZPJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.BLISTERING_INGOT_3,
                new ItemStack(Material.SNOW_BLOCK), SlimefunItems.ANDROID_MEMORY_CORE, new ItemStack(Material.SNOW_BLOCK),
                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.REINFORCED_PLATE, SlimefunItems.ENERGIZED_CAPACITOR
            } ).register ( qs );

            new Jingjixingkuangfenji ( Categories.QS_JQ, QS_JQ_JJXKFZZJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                    new ItemStack(Material.GRINDSTONE), new ItemStack(Material.INFESTED_CHISELED_STONE_BRICKS), new ItemStack(Material.GRINDSTONE),
                    SlimefunItems.GOLD_PAN, new ItemStack(Material.DIAMOND), SlimefunItems.GOLD_PAN,
                    SlimefunItems.MAGNET, new ItemStack(Material.WATER_BUCKET), SlimefunItems.MAGNET
            } ).register ( qs );

            new ElectricSmeltery (Categories.QS_JQ, QS_JQ_GJZLL_V1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                    SlimefunItems.ELECTRIC_SMELTERY_2, SlimefunItems.ELECTRIC_SMELTERY_2, SlimefunItems.ELECTRIC_SMELTERY_2,
                    SlimefunItems.ELECTRIC_SMELTERY_2, SlimefunItems.ELECTRIC_SMELTERY_2, SlimefunItems.ELECTRIC_SMELTERY_2,
                    null, null, null
            }).setCapacity(ADVANCED_SMELTERY_ENERGY).setProcessingSpeed(ADVANCED_SMELTERY_SPEED).setEnergyConsumption(ADVANCED_SMELTERY_ENERGY).register(qs);







            //new ElectricDustRecycler ( Categories.QS_JQ, QS_JQ_TJJ_V1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{SlimefunItems.GOLD_PAN, SlimefunItems.MEDIUM_CAPACITOR, SlimefunItems.GOLD_PAN, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ELECTRIC_GOLD_PAN_3, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.HARDENED_METAL_INGOT} ).register ( qs );



    }
}
