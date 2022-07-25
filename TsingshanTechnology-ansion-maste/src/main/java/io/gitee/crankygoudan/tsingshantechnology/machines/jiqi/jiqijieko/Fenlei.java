package io.gitee.crankygoudan.tsingshantechnology.machines.jiqi.jiqijieko;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Fenlei {
    public static final List<ItemStack>  dusts_sl =new ArrayList<>(Arrays.asList(
            new ItemStack(Material.GRANITE ,2)

    ));

    public static final List<ItemStack>  dusts_lhs = new ArrayList<>(Arrays.asList(
            SlimefunItems.COPPER_DUST,
            SlimefunItems.GOLD_DUST,
            SlimefunItems.IRON_DUST,
            SlimefunItems.LEAD_DUST,
            SlimefunItems.ALUMINUM_DUST,
            SlimefunItems.ZINC_DUST,
            SlimefunItems.TIN_DUST,
            SlimefunItems.MAGNESIUM_DUST,
            SlimefunItems.SILVER_DUST
    ));

    public static final int MAX_STACK_SIZE = 64;

    private Fenlei() {
    }

}
