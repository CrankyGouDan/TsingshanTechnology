package io.gitee.crankygoudan.tsingshantechnology.machines.jiqi.qingshanjiqi;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.gitee.crankygoudan.tsingshantechnology.machines.jiqiMoBan.SuiKuangJiMoBan;
import io.gitee.crankygoudan.tsingshantechnology.utils.Y;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;


public class ChaoJiFenSuiJi_V1 extends SuiKuangJiMoBan implements RecipeDisplayItem {

    public ChaoJiFenSuiJi_V1(ItemGroup category, SlimefunItemStack item, RecipeType type, ItemStack[] recipe) {
        super(category, item, type, recipe);
    }

    public void registerDefaultRecipes() {
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.BLAZE_ROD, 2)},
            new ItemStack[] {
                new ItemStack(Material.BLAZE_POWDER, 2),
                new ItemStack(Material.BLAZE_POWDER, 2),
                new ItemStack(Material.BLAZE_POWDER, 2),
                new ItemStack(Material.BLAZE_POWDER, 2),
            });//烈焰棒 》 烈焰粉
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.BONE, 2)},
            new ItemStack[] {
                new ItemStack(Material.BONE_MEAL, 2),
                new ItemStack(Material.BONE_MEAL, 2),
                new ItemStack(Material.BONE_MEAL, 2),
                new ItemStack(Material.BONE_MEAL, 2),
            });//骨头 》 骨粉
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.BONE_BLOCK, 2)},
            new ItemStack[] {
                new ItemStack(Material.BONE, 2),
                new ItemStack(Material.BONE, 2),
                new ItemStack(Material.BONE, 2),
                new ItemStack(Material.BONE, 2),
                new ItemStack(Material.BONE, 2),
                new ItemStack(Material.BONE, 2),
                new ItemStack(Material.BONE, 2),
                new ItemStack(Material.BONE, 2),
                new ItemStack(Material.BONE, 2),
            });//骨头块 》 骨粉
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.COBBLESTONE, 2)},
            new ItemStack[] {
                new ItemStack(Material.GRAVEL, 2),
            });//原石 》 沙砾
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.ANDESITE, 2)},
            new ItemStack[] {
                new ItemStack(Material.GRAVEL, 2),
            });//安山岩 》 沙砾
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.DIORITE, 2)},
            new ItemStack[] {
                new ItemStack(Material.GRAVEL, 2),
            });//闪长岩 》 沙砾
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.GRANITE, 2)},
            new ItemStack[] {
                new ItemStack(Material.GRAVEL, 2),
            });//花岗岩 》 沙砾
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.DIRT, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.STONE_CHUNK, 2),
            });//泥土 》 石块
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.SANDSTONE, 2)},
            new ItemStack[] {
                new ItemStack(Material.SAND, 2),
                new ItemStack(Material.SAND, 2),
                new ItemStack(Material.SAND, 2),
                new ItemStack(Material.SAND, 2),
            });//砂岩 》 沙子
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.RED_SANDSTONE, 2)},
            new ItemStack[] {
                new ItemStack(Material.RED_SAND, 2),
                new ItemStack(Material.RED_SAND, 2),
                new ItemStack(Material.RED_SAND, 2),
                new ItemStack(Material.RED_SAND, 2),
            });//红砂岩 》 红沙
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.PRISMARINE_BRICKS, 2)},
            new ItemStack[] {
                new ItemStack(Material.PRISMARINE, 2),
                new ItemStack(Material.PRISMARINE, 2),
            });//海晶石砖 》 海晶石
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.PRISMARINE, 2)},
            new ItemStack[] {
                new ItemStack(Material.PRISMARINE_SHARD, 2),
                new ItemStack(Material.PRISMARINE_SHARD, 2),
                new ItemStack(Material.PRISMARINE_SHARD, 2),
                new ItemStack(Material.PRISMARINE_SHARD, 2),
            });//海晶石 》 海晶碎片
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.NETHER_WART_BLOCK, 2)},
            new ItemStack[] {
                new ItemStack(Material.NETHER_WART, 2),
                new ItemStack(Material.NETHER_WART, 2),
                new ItemStack(Material.NETHER_WART, 2),
                new ItemStack(Material.NETHER_WART, 2),
                new ItemStack(Material.NETHER_WART, 2),
                new ItemStack(Material.NETHER_WART, 2),
                new ItemStack(Material.NETHER_WART, 2),
                new ItemStack(Material.NETHER_WART, 2),
                new ItemStack(Material.NETHER_WART, 2),
            });//疣块 》 下届疣
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.QUARTZ_BLOCK, 2)},
            new ItemStack[] {
                new ItemStack(Material.QUARTZ, 2),
                new ItemStack(Material.QUARTZ, 2),
                new ItemStack(Material.QUARTZ, 2),
                new ItemStack(Material.QUARTZ, 2),
            });//石英块 》 下届石英
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.AMETHYST_BLOCK, 2)},
            new ItemStack[] {
                new ItemStack(Material.AMETHYST_SHARD, 2),
                new ItemStack(Material.AMETHYST_SHARD, 2),
                new ItemStack(Material.AMETHYST_SHARD, 2),
                new ItemStack(Material.AMETHYST_SHARD, 2),
            });//紫水晶块 》 紫水晶碎片
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.NETHER_WART, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_1, 2),
                new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_1, 2),
            });//下届疣 》 魔法结晶
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_2, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_1, 2),
                new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_1, 2),
                new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_1, 2),
                new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_1, 2),
            });//魔法结晶2 》 魔法结晶1
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_3, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_2, 2),
                new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_2, 2),
                new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_2, 2),
                new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_2, 2),
            });//魔法结晶3 》 魔法结晶2
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.ENDER_EYE, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_1, 2),
                new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_1, 2),
            });//末影之眼 》 末影结晶
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_2, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_1, 2),
                new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_1, 2),
                new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_1, 2),
                new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_1, 2),
            });//末影之眼 》 末影结晶1
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_3, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_2, 2),
                new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_2, 2),
                new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_2, 2),
                new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_2, 2),
            });//末影之眼 》 末影结晶2
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.DIAMOND, 2)},
                new ItemStack[] {
                    new SlimefunItemStack ( SlimefunItems.CARBON, 2),
                    new SlimefunItemStack ( SlimefunItems.CARBON, 2),
                    new SlimefunItemStack ( SlimefunItems.CARBON, 2),
                    new SlimefunItemStack ( SlimefunItems.CARBON, 2),
                });//钻石 》 碳
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.WATER, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.WHEAT_FLOUR, 2),
            });//小麦 》 小麦粉
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GOLD_4K, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
            });//4K 》 金粉
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GOLD_6K, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
            });//6K 》 金粉
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GOLD_8K, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
            });//8K 》 金粉
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GOLD_10K, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
            });//10K 》 金粉
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GOLD_12K, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
            });//12K 》 金粉
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GOLD_14K, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
            });//14K 》 金粉
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GOLD_16K, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
            });//16K 》 金粉
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GOLD_18K, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
            });//18K 》 金粉
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GOLD_20K, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
            });//20K 》 金粉
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GOLD_22K, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
            });//22K 》 金粉
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GOLD_24K, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
            });//22K 》 金粉
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.GRAVEL, 2)},
            new ItemStack[] {
                new ItemStack(Material.SAND, 2),
            });//沙砾 》 沙子
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.MAGMA_BLOCK, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.SULFATE, 2),
            });//岩浆块 》 硫
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.CARBON, 2)},
            new ItemStack[] {
                new ItemStack(Material.COAL, 2),
                new ItemStack(Material.COAL, 2),
                new ItemStack(Material.COAL, 2),
                new ItemStack(Material.COAL, 2),
                new ItemStack(Material.COAL, 2),
                new ItemStack(Material.COAL, 2),
                new ItemStack(Material.COAL, 2),
            });//碳 》 煤炭
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.COMPRESSED_CARBON, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.CARBON,64),
                new SlimefunItemStack ( SlimefunItems.CARBON,64),
                new SlimefunItemStack ( SlimefunItems.CARBON,64),
                new SlimefunItemStack ( SlimefunItems.CARBON,64),
            });//压缩碳 》 碳
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.COAL_ORE, 2)},
            new ItemStack[] {
                new ItemStack(Material.COAL, 2),
                new ItemStack(Material.COAL, 2),
            });//煤炭原矿 》 煤炭
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.DEEPSLATE_COAL_ORE, 2)},
            new ItemStack[] {
                new ItemStack(Material.COAL, 2),
                new ItemStack(Material.COAL, 2),
            });//2煤炭原矿 》 煤炭
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.LAPIS_ORE, 2)},
            new ItemStack[] {
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
            });//青金石原矿 》 青金石
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.DEEPSLATE_LAPIS_ORE, 2)},
            new ItemStack[] {
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
                new ItemStack(Material.LAPIS_LAZULI, 2),
            });//2青金石原矿 》 青金石
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.REDSTONE_ORE, 2)},
            new ItemStack[] {
                new ItemStack(Material.REDSTONE, 2),
                new ItemStack(Material.REDSTONE, 2),
                new ItemStack(Material.REDSTONE, 2),
                new ItemStack(Material.REDSTONE, 2),
                new ItemStack(Material.REDSTONE, 2),
                new ItemStack(Material.REDSTONE, 2),
                new ItemStack(Material.REDSTONE, 2),
                new ItemStack(Material.REDSTONE, 2),
            });//红石原矿 》 红石
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.DEEPSLATE_REDSTONE_ORE, 2)},
            new ItemStack[] {
                new ItemStack(Material.REDSTONE, 2),
                new ItemStack(Material.REDSTONE, 2),
                new ItemStack(Material.REDSTONE, 2),
                new ItemStack(Material.REDSTONE, 2),
                new ItemStack(Material.REDSTONE, 2),
                new ItemStack(Material.REDSTONE, 2),
                new ItemStack(Material.REDSTONE, 2),
                new ItemStack(Material.REDSTONE, 2),
            });//2红石原矿 》 红石
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.DIAMOND_ORE, 2)},
            new ItemStack[] {
                new ItemStack(Material.DIAMOND, 2),
                new ItemStack(Material.DIAMOND, 2),
            });//钻石原矿 》 钻石
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.DEEPSLATE_DIAMOND_ORE, 2)},
            new ItemStack[] {
                new ItemStack(Material.DIAMOND, 2),
                new ItemStack(Material.DIAMOND, 2),
            });//2钻石原矿 》 钻石
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.EMERALD_ORE, 2)},
            new ItemStack[] {
                new ItemStack(Material.EMERALD, 2),
                new ItemStack(Material.EMERALD, 2),
            });//钻石原矿 》 钻石
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.DEEPSLATE_EMERALD_ORE, 2)},
            new ItemStack[] {
                new ItemStack(Material.EMERALD, 2),
                new ItemStack(Material.EMERALD, 2),
            });//2钻石原矿 》 钻石
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.NETHER_QUARTZ_ORE, 2)},
            new ItemStack[] {
                new ItemStack(Material.QUARTZ, 2),
                new ItemStack(Material.QUARTZ, 2),
            });//下届石英原矿 》 下届石英
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.NETHER_GOLD_ORE, 2)},
            new ItemStack[] {
                new ItemStack(Material.GOLD_NUGGET, 2),
                new ItemStack(Material.GOLD_NUGGET, 2),
                new ItemStack(Material.GOLD_NUGGET, 2),
                new ItemStack(Material.GOLD_NUGGET, 2),
                new ItemStack(Material.GOLD_NUGGET, 2),
                new ItemStack(Material.GOLD_NUGGET, 2),
                new ItemStack(Material.GOLD_NUGGET, 2),
            });//下届金矿石 》 金粒
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.GILDED_BLACKSTONE, 2)},
            new ItemStack[] {
                new ItemStack(Material.GOLD_NUGGET, 2),
                new ItemStack(Material.GOLD_NUGGET, 2),
                new ItemStack(Material.GOLD_NUGGET, 2),
                new ItemStack(Material.GOLD_NUGGET, 2),
                new ItemStack(Material.GOLD_NUGGET, 2),
                new ItemStack(Material.GOLD_NUGGET, 2),
                new ItemStack(Material.GOLD_NUGGET, 2),
            });//镶金黑石 》 金粒
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.RAW_IRON, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.IRON_DUST, 2),
            });//? 》 铁粉
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.RAW_COPPER, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.COPPER_DUST, 2),
            });//? 》 铜粉
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.RAW_GOLD, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
            });//? 》 金粉
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.DEEPSLATE_IRON_ORE, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.IRON_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.IRON_DUST, 2),
            });//? 》 铁粉
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.DEEPSLATE_GOLD_ORE, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
            });//? 》 金粉
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.DEEPSLATE_COPPER_ORE, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.COPPER_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.COPPER_DUST, 2),
            });//? 》 铜粉
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.COPPER_ORE, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.COPPER_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.COPPER_DUST, 2),
            });//? 》 铜粉
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.IRON_ORE, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.IRON_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.IRON_DUST, 2),
            });//? 》 铁粉
        registerRecipe(5, new ItemStack[] {new ItemStack(Material.GOLD_ORE, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
                new SlimefunItemStack ( SlimefunItems.GOLD_DUST, 2),
            });//? 》 金粉
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.SIFTED_ORE, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.CRUSHED_ORE,64),
            });//筛矿 》 已粉碎的矿石
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.CRUSHED_ORE, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.PULVERIZED_ORE,64),
            });//已粉碎的矿石 》 粉末状的矿石
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.PURE_ORE_CLUSTER, 2)},
            new ItemStack[] {
                new SlimefunItemStack ( SlimefunItems.TINY_URANIUM,64),
            });//粉末状的矿石 》 一块小铀



    }
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 8);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);

            for (ItemStack output : recipe.getOutput()) {
                displayRecipes.add(output);
                displayRecipes.add(new ItemStack(Material.IRON_BARS));
            }

            displayRecipes.add(new ItemStack(Material.IRON_BARS));
        }

        return displayRecipes;
    }
    @Override
    public ItemStack getProgressBar() {
        return new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.colorPseudorandomString ( "粉碎中"));
    }
    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "QS_CHAO_JI_FEN_SUI_JI_I";
    }
    @Override
    public String getInventoryTitle() {
        return Y.colorPseudorandomString ("超级粉碎机 I");
    }
    @Override
    public int getCapacity() {
        return 5000;
    }

    @Override
    public int getEnergyConsumption() {
        return 1728;
    }

    @Override
    public int getSpeed() {
        return 1;
    }
        }
