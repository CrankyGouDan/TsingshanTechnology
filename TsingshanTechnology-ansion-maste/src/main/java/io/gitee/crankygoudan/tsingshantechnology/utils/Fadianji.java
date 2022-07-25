package io.gitee.crankygoudan.tsingshantechnology.utils;

import io.gitee.crankygoudan.tsingshantechnology.Categories;
import io.gitee.crankygoudan.tsingshantechnology.TL;
import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.machines.Fadianji.Fadianji_vip;
import io.gitee.crankygoudan.tsingshantechnology.machines.Fadianji.GreenGenerator;
import io.gitee.crankygoudan.tsingshantechnology.machines.Fadianji.Moyingzhenzhufadianji;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Fadianji {

    public static final SlimefunItemStack QS_FDJ_VIP = new SlimefunItemStack ( "QS_FDJ_VIP", TL.QS_FDJ_VIP, TextUtil.colorPseudorandomString("青山专属发电机") + " " + TextUtil.colorPseudorandomString("VIP 专属"),
            MachineLore.energyBuffer(6000000),
            MachineLore.energyPerSecond(60000));

    public static final SlimefunItemStack QS_FDJ_MYZZ = new SlimefunItemStack ( "QS_FDJ_MYZZ", TL.QS_FDJ_MYZZ,
            TextUtil.colorPseudorandomString("末影珍珠发电机") + " " + TextUtil.colorPseudorandomString(" "),
            TextUtil.colorPseudorandomString("使用末影珍珠发电 "));

    public static final SlimefunItemStack QS_FDJ_HBFDJ = new SlimefunItemStack ( "QS_FDJ_HBFDJ", Material.GRASS_BLOCK,
            TextUtil.colorPseudorandomString("环保发电机") + " " + TextUtil.colorPseudorandomString(" "),
            TextUtil.colorPseudorandomString("建立了一个积极从事环保的组织"),
            TextUtil.colorPseudorandomString("大众媒体往往把他描绘成环保领袖"));


    public static void setup(TsingshanTechnology qs) {

        new Fadianji_vip ( Categories.QS_FDJ, QS_FDJ_VIP, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new GreenGenerator ( Categories.QS_FDJ, QS_FDJ_HBFDJ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.BIRCH_LEAVES), new ItemStack(Material.OAK_LEAVES), new ItemStack(Material.SPRUCE_LEAVES),
                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.BIG_CAPACITOR, SlimefunItems.ELECTRIC_MOTOR,
                new ItemStack(Material.JUNGLE_LEAVES),  new ItemStack(Material.ACACIA_LEAVES),  new ItemStack(Material.DARK_OAK_LEAVES),
        } ).register ( qs );

        new Moyingzhenzhufadianji ( Categories.QS_FDJ, QS_FDJ_MYZZ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.ENDER_RUNE, SlimefunItems.STEEL_PLATE, SlimefunItems.ENDER_RUNE,
                SlimefunItems.STEEL_PLATE, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.STEEL_PLATE,
                SlimefunItems.ENDER_RUNE, SlimefunItems.STEEL_PLATE, SlimefunItems.ENDER_RUNE
        } ).register ( qs );








    }



}
