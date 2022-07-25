package io.gitee.crankygoudan.tsingshantechnology.machines.generators;

import io.gitee.crankygoudan.tsingshantechnology.Categories;
import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class Generators {

    private static final int QS_FDJ_VIP_PZ = 500000;



    public static final SlimefunItemStack QS_FDJ_SVIP = new SlimefunItemStack(
            "QS_FDJ_SVIP",
            Material.LIGHT_BLUE_GLAZED_TERRACOTTA,
            "&bVIP专属发电机",
            "&7利用青山能量核心发电",
            "",
            MachineLore.energyBuffer(QS_FDJ_VIP_PZ * 20),
            MachineLore.energyPerSecond(QS_FDJ_VIP_PZ)
    );

    public static void setup(TsingshanTechnology qs) {

        new EnergyGenerator( Categories.QS_FDJ, QS_FDJ_SVIP, RecipeType.NULL, new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        }, QS_FDJ_VIP_PZ, GenerationType.QS_FDJ).register ( qs );


    }
}
