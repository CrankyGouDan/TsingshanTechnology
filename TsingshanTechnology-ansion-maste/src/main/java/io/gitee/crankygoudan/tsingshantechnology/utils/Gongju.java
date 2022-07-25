package io.gitee.crankygoudan.tsingshantechnology.utils;

import io.gitee.crankygoudan.tsingshantechnology.Categories;
import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.items.tool.Banshou;
import io.gitee.crankygoudan.tsingshantechnology.items.tool.Huoyunpeizhiqi;
import io.gitee.crankygoudan.tsingshantechnology.items.tool.Dianti;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Gongju {

    public static final SlimefunItemStack QS_GJ_DT = new SlimefunItemStack ( "QS_GJ_DT", Material.DARK_PRISMARINE,
            TextUtil.colorPseudorandomString("青山电梯") + " " + TextUtil.colorPseudorandomString("工具"),
            TextUtil.colorPseudorandomString("跳跃上升"),
            TextUtil.colorPseudorandomString("蹲下下降"));
    public static final SlimefunItemStack QS_GJ_BS = new SlimefunItemStack ( "QS_GJ_BS", Material.NETHERITE_AXE,
            TextUtil.colorPseudorandomString("青山扳手") + " " + TextUtil.colorPseudorandomString("工具 "),
            TextUtil.colorPseudorandomString("可用于拆除："),
            TextUtil.colorPseudorandomString("货运"),
            TextUtil.colorPseudorandomString("电容"),
            TextUtil.colorPseudorandomString("机器"));
    public static final SlimefunItemStack QS_GJ_HYPZQ = new SlimefunItemStack ( "QS_GJ_HYPZQ", Material.COMPASS,
            TextUtil.colorPseudorandomString("货运配置器") + " " + TextUtil.colorPseudorandomString("工具 "),
            TextUtil.colorPseudorandomString("可用于："),
            TextUtil.colorPseudorandomString("右键 - 复制节点配置"),
            TextUtil.colorPseudorandomString("左键 - 黏贴节点配置"),
            TextUtil.colorPseudorandomString("Shift+右键 - 清除节点配置"));

    //工具配方：---------------------------------------------------------------------------------------------------------
    public static void setup(TsingshanTechnology qs) {
        new Dianti ( Categories.QS_GJ, QS_GJ_DT, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );
        new Banshou ( Categories.QS_GJ, QS_GJ_BS, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        } ).register ( qs );

        new Huoyunpeizhiqi ( Categories.QS_GJ, QS_GJ_HYPZQ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.REINFORCED_PLATE, SlimefunItems.DAMASCUS_STEEL_INGOT,
                SlimefunItems.REINFORCED_PLATE, SlimefunItems.CARGO_MANAGER, SlimefunItems.REINFORCED_PLATE,
                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.REINFORCED_PLATE, SlimefunItems.DAMASCUS_STEEL_INGOT
        } ).register ( qs );





    }



}
