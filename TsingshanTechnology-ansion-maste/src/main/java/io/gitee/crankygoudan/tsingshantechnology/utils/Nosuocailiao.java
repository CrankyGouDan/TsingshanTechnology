package io.gitee.crankygoudan.tsingshantechnology.utils;

import io.gitee.crankygoudan.tsingshantechnology.Categories;
import io.gitee.crankygoudan.tsingshantechnology.TL;
import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.VanillaItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType.ENHANCED_CRAFTING_TABLE;

public class Nosuocailiao {

    //public static final SlimefunItemStack QS_NSCL_TONGDIN_V1= new SlimefunItemStack ( "QS_NSCL_TONGDIN_V1", Material.IRON_INGOT, TextUtil.colorPseudorandomString("1阶") + " " + TextUtil.colorPseudorandomString("铜锭"), TextUtil.colorPseudorandomString("9个铜锭压缩而来"));
    //public static final SlimefunItemStack QS_NSCL_TONGDIN_V2= new SlimefunItemStack ( "QS_NSCL_TONGDIN_V2", Material.IRON_INGOT, TextUtil.colorPseudorandomString("2阶") + " " + TextUtil.colorPseudorandomString("铜锭"), TextUtil.colorPseudorandomString("81个铜锭压缩而来"));
    //public static final SlimefunItemStack QS_NSCL_TONGDIN_V3= new SlimefunItemStack ( "QS_NSCL_TONGDIN_V3", Material.IRON_INGOT, TextUtil.colorPseudorandomString("3阶") + " " + TextUtil.colorPseudorandomString("铜锭"), TextUtil.colorPseudorandomString("729个铜锭压缩而来"));
    //public static final SlimefunItemStack QS_NSCL_TONGDIN_V4= new SlimefunItemStack ( "QS_NSCL_TONGDIN_V4", Material.IRON_INGOT, TextUtil.colorPseudorandomString("4阶") + " " + TextUtil.colorPseudorandomString("铜锭"), TextUtil.colorPseudorandomString("6561个铜锭压缩而来"));
    //public static final SlimefunItemStack QS_NSCL_TONGDIN_V5= new SlimefunItemStack ( "QS_NSCL_TONGDIN_V5", Material.IRON_INGOT, TextUtil.colorPseudorandomString("5阶") + " " + TextUtil.colorPseudorandomString("铜锭"), TextUtil.colorPseudorandomString("59049个铜锭压缩而来"));

    //public static final SlimefunItemStack QS_NSCL_XIDIN_V1= new SlimefunItemStack ( "QS_NSCL_XIDIN_V1", Material.IRON_INGOT, TextUtil.colorPseudorandomString("1阶") + " " + TextUtil.colorPseudorandomString("锡锭"), TextUtil.colorPseudorandomString("9个锡锭压缩而来"));
    //public static final SlimefunItemStack QS_NSCL_XIDIN_V2= new SlimefunItemStack ( "QS_NSCL_XIDIN_V2", Material.IRON_INGOT, TextUtil.colorPseudorandomString("2阶") + " " + TextUtil.colorPseudorandomString("锡锭"), TextUtil.colorPseudorandomString("81个锡锭压缩而来"));
    //public static final SlimefunItemStack QS_NSCL_XIDIN_V3= new SlimefunItemStack ( "QS_NSCL_XIDIN_V3", Material.IRON_INGOT, TextUtil.colorPseudorandomString("3阶") + " " + TextUtil.colorPseudorandomString("锡锭"), TextUtil.colorPseudorandomString("729个锡锭压缩而来"));
    //public static final SlimefunItemStack QS_NSCL_XIDIN_V4= new SlimefunItemStack ( "QS_NSCL_XIDIN_V4", Material.IRON_INGOT,TextUtil.colorPseudorandomString("4阶") + " " + TextUtil.colorPseudorandomString("锡锭"),TextUtil.colorPseudorandomString("6561个锡锭压缩而来"));
    //public static final SlimefunItemStack QS_NSCL_XIDIN_V5= new SlimefunItemStack ( "QS_NSCL_XIDIN_V5", Material.IRON_INGOT, TextUtil.colorPseudorandomString("5阶") + " " + TextUtil.colorPseudorandomString("锡锭"), TextUtil.colorPseudorandomString("59049个锡锭压缩而来"));





    public static void setup(TsingshanTechnology qs) {

        new VanillaItem (Categories.QS_NSCL, new ItemStack( Material.BEDROCK), "JIYAN", ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, null, null,
                null, new ItemStack(Material.GRAVEL), null,
                null, null, null
        }).register(qs);




    }

}
