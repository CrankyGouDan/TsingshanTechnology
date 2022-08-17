package io.gitee.crankygoudan.tsingshantechnology.machines.jiqi.qingshanjiqi;

import java.util.ArrayList;
import java.util.List;

import com.github.relativobr.machine.MediumContainerMachine;
import com.github.relativobr.recipe.AbstractItemRecipe;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.springframework.scheduling.annotation.Async;

import io.gitee.crankygoudan.tsingshantechnology.utils.Y;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanCaiLiao.*;
import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanXinPia.*;
import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.jiqizhuce.qingshanjiqizhuce.QingShanJiQi.*;

@Async
public class XiPiaZhiZaoJi_V1 extends MediumContainerMachine {

  public static final SlimefunItemStack QS_XIPIAZHIZAOJI_V1 = new SlimefunItemStack("QS_XIPIAZHIZAOJI_V1", Material.CARTOGRAPHY_TABLE, Y.colorPseudorandomString("芯片制造机")+ " " + Y.colorPseudorandomString(" "),
          Y.colorPseudorandomString(" "),
      Y.colorPseudorandomString("拥有普通的技术制造普通芯片"),
          MachineLore.speed(2),
          MachineLore.energyBuffer(15000),
          MachineLore.energyPerSecond(6500));
  public static final ItemStack[] RECIPE_QS_XIPIAZHIZAOJI_V1= new ItemStack[]{
      QS_ZENG_QIANG_XING_GONG_ZUO_TAI, QS_GAO_JIE_XIA_JIE, new SlimefunItemStack (SlimefunItems.ENHANCED_AUTO_CRAFTER,1),
      QS_QIANG_HUA_BAN, QS_GANG_JIN_HE_XIN, QS_QIANG_HUA_BAN,
      QS_MO_FA_GONG_ZUO_TAI, QS_GAO_JIE_XIA_JIE, QS_YUAN_GU_JI_TAN
  };
    public static final AbstractItemRecipe RECIPE_CW1_1 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.LAPIS_BLOCK,2 ), new ItemStack ( Material.LAPIS_BLOCK,2 ), new ItemStack ( Material.LAPIS_BLOCK,2 ), new ItemStack ( Material.REDSTONE_BLOCK,2 ), new SlimefunItemStack ( SlimefunItems.BASIC_CIRCUIT_BOARD,2 ), new ItemStack ( Material.REDSTONE_BLOCK,2 ), new ItemStack ( Material.LAPIS_BLOCK,2 ), new ItemStack ( Material.LAPIS_BLOCK,2 ), new ItemStack ( Material.LAPIS_BLOCK,2 ),}, new SlimefunItemStack(QS_CW1_1,1));
    public static final AbstractItemRecipe RECIPE_CW1_2 = new AbstractItemRecipe( new ItemStack[]{null, new ItemStack ( Material.REDSTONE,2 ), null, new SlimefunItemStack ( SlimefunItems.ZINC_INGOT,2 ), new SlimefunItemStack ( SlimefunItems.SULFATE,2 ), new SlimefunItemStack ( SlimefunItems.COPPER_INGOT,2 ), new SlimefunItemStack ( SlimefunItems.ZINC_INGOT,2 ), new SlimefunItemStack ( SlimefunItems.SULFATE,2 ), new SlimefunItemStack ( SlimefunItems.COPPER_INGOT,2 )}, new SlimefunItemStack(QS_CW1_2,1));
    public static final AbstractItemRecipe RECIPE_CW1_3 = new AbstractItemRecipe( new ItemStack[]{null,  new ItemStack ( Material.REDSTONE,2 ), null, new SlimefunItemStack ( SlimefunItems.ALUMINUM_BRONZE_INGOT,2 ), new SlimefunItemStack ( SlimefunItems.ALUMINUM_BRONZE_INGOT,2 ), new SlimefunItemStack ( SlimefunItems.ALUMINUM_BRONZE_INGOT,2 ), new SlimefunItemStack ( SlimefunItems.STEEL_PLATE,2 ), new ItemStack ( Material.FIRE_CHARGE,2 ), new SlimefunItemStack ( SlimefunItems.STEEL_PLATE,2 )}, new SlimefunItemStack(QS_CW1_3,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_4 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.REDSTONE,2 ), new SlimefunItemStack ( SlimefunItems.SYNTHETIC_SAPPHIRE,2 ), new ItemStack ( Material.REDSTONE,2 ), new SlimefunItemStack ( SlimefunItems.SYNTHETIC_SAPPHIRE,2 ), new SlimefunItemStack ( SlimefunItems.SYNTHETIC_DIAMOND,2 ), new SlimefunItemStack ( SlimefunItems.SYNTHETIC_SAPPHIRE,2 ), new ItemStack ( Material.REDSTONE,2 ), new SlimefunItemStack ( SlimefunItems.SYNTHETIC_SAPPHIRE,2 ), new ItemStack ( Material.REDSTONE,2 )}, new SlimefunItemStack(QS_CW1_4,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_5 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.GLASS,2 ),  new ItemStack ( Material.GLASS,2 ),  new ItemStack ( Material.GLASS,2 ), new SlimefunItemStack ( SlimefunItems.SILICON,2 ),  new SlimefunItemStack ( SlimefunItems.SILICON,2 ),  new SlimefunItemStack ( SlimefunItems.SILICON,2 ), new SlimefunItemStack ( SlimefunItems.FERROSILICON,2 ), new SlimefunItemStack ( SlimefunItems.FERROSILICON,2 ), new SlimefunItemStack ( SlimefunItems.FERROSILICON,2 )}, new SlimefunItemStack(QS_CW1_5,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_6 = new AbstractItemRecipe( new ItemStack[]{null,new SlimefunItemStack(SlimefunItems.CLOTH,2), null, new SlimefunItemStack(SlimefunItems.CLOTH,2), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,2), new SlimefunItemStack(SlimefunItems.CLOTH,2), null, new SlimefunItemStack(SlimefunItems.CLOTH,2), null},new SlimefunItemStack(QS_CW1_6,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_7 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.NICKEL_INGOT,2), new SlimefunItemStack(SlimefunItems.MAGNET,2), new SlimefunItemStack(SlimefunItems.COBALT_INGOT,2), null, new SlimefunItemStack(SlimefunItems.BATTERY,2), null, null, null, null}, new SlimefunItemStack(QS_CW1_7,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_8 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.COPPER_WIRE,2), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,2), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,2), null, new SlimefunItemStack(SlimefunItems.ELECTRO_MAGNET,2), null, new SlimefunItemStack(SlimefunItems.COPPER_WIRE,2), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,2), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,2)}, new SlimefunItemStack(QS_CW1_8,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_9 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.COPPER_WIRE,2), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,2), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,2), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,2), new SlimefunItemStack(SlimefunItems.ELECTRIC_MOTOR,2), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,2), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,2), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,2), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,2)}, new SlimefunItemStack(QS_CW1_9,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_10 = new AbstractItemRecipe( new ItemStack[]{null, null, null, new SlimefunItemStack(SlimefunItems.COPPER_INGOT,2), new SlimefunItemStack(SlimefunItems.COPPER_INGOT,2), new SlimefunItemStack(SlimefunItems.COPPER_INGOT,2), null, null, null}, new SlimefunItemStack(QS_CW1_10,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_11 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.GLASS,2 ), new ItemStack ( Material.GLASS,2 ), new ItemStack ( Material.GLASS,2 ), new ItemStack ( Material.GLASS,2 ),  new SlimefunItemStack(SlimefunItems.REINFORCED_PLATE,2), new ItemStack ( Material.GLASS,2 ), new ItemStack ( Material.GLASS,2 ), new ItemStack ( Material.GLASS,2 ), new ItemStack ( Material.GLASS,2 )}, new SlimefunItemStack(QS_CW1_11,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_12 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.ICE,2 ), new ItemStack ( Material.ICE,2 ), new ItemStack ( Material.ICE,2 ), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,2), new SlimefunItemStack(SlimefunItems.ELECTRIC_MOTOR,2), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,2), new ItemStack ( Material.ICE,2 ), new ItemStack ( Material.ICE,2 ), new ItemStack ( Material.ICE,2 ),}, new SlimefunItemStack(QS_CW1_12,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_13 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.LEAD_INGOT,2), new ItemStack ( Material.OBSIDIAN,2 ), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,2), new ItemStack ( Material.OBSIDIAN,2 ), new SlimefunItemStack(SlimefunItems.HARDENED_GLASS,2), new ItemStack ( Material.OBSIDIAN,2 ), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,2), new ItemStack ( Material.OBSIDIAN,2 ), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,2)}, new SlimefunItemStack(QS_CW1_13,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_14 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.BRASS_INGOT,2), new ItemStack ( Material.ORANGE_STAINED_GLASS,2 ), new SlimefunItemStack(SlimefunItems.BRASS_INGOT,2), new SlimefunItemStack(SlimefunItems.POWER_CRYSTAL,2), new SlimefunItemStack(SlimefunItems.TIN_DUST,2), new SlimefunItemStack(SlimefunItems.POWER_CRYSTAL,2), new SlimefunItemStack(SlimefunItems.BRASS_INGOT,2), new ItemStack ( Material.ORANGE_STAINED_GLASS,2 ), new SlimefunItemStack(SlimefunItems.BRASS_INGOT,2)}, new SlimefunItemStack(QS_CW1_14,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_15 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.LEAD_INGOT,2), new SlimefunItemStack(SlimefunItems.WITHER_PROOF_OBSIDIAN,2), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,2), new SlimefunItemStack(SlimefunItems.WITHER_PROOF_OBSIDIAN,2), new SlimefunItemStack(SlimefunItems.HARDENED_GLASS,2), new SlimefunItemStack(SlimefunItems.WITHER_PROOF_OBSIDIAN,2), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,2), new SlimefunItemStack(SlimefunItems.WITHER_PROOF_OBSIDIAN,2), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,2)}, new SlimefunItemStack(QS_CW1_15,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_16 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.BOOK,2 ), new ItemStack ( Material.CRAFTING_TABLE,2 ), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW1_16,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_17 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.IRON_INGOT,2), new ItemStack ( Material.IRON_INGOT,2), new ItemStack ( Material.IRON_INGOT,2), new ItemStack ( Material.IRON_INGOT,2), null, new ItemStack ( Material.IRON_INGOT,2), new ItemStack ( Material.IRON_INGOT,2), new ItemStack ( Material.IRON_INGOT,2), new ItemStack ( Material.IRON_INGOT,2),}, new SlimefunItemStack(QS_CW1_17,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_18 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.CLOTH,2), new SlimefunItemStack(SlimefunItems.CLOTH,2), new SlimefunItemStack(SlimefunItems.CLOTH,2), new ItemStack ( Material.STRING,2), null, new ItemStack ( Material.STRING,2), new SlimefunItemStack(SlimefunItems.CLOTH,2), new SlimefunItemStack(SlimefunItems.CLOTH,2), new SlimefunItemStack(SlimefunItems.CLOTH,2),}, new SlimefunItemStack(QS_CW1_18,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_19 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.RAG,2), new ItemStack ( Material.STRING,2), new SlimefunItemStack(SlimefunItems.RAG,2), null, null, null, null, null, null}, new SlimefunItemStack(QS_CW1_19,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_20 = new AbstractItemRecipe( new ItemStack[]{null, new ItemStack ( Material.IRON_INGOT,2), null, new ItemStack ( Material.STICK,2), new ItemStack ( Material.STICK,2), new ItemStack ( Material.STICK,2), null, new ItemStack ( Material.IRON_INGOT,2), null}, new SlimefunItemStack(QS_CW1_20,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_21 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.TIN_CAN,2), new ItemStack ( Material.APPLE,2), new ItemStack ( Material.RED_MUSHROOM,2), new ItemStack ( Material.SUGAR,2), null, null, null, null, null}, new SlimefunItemStack(QS_CW1_21,1 ));

    public static final AbstractItemRecipe RECIPE_CW1_22 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.VITAMINS,2), new ItemStack ( Material.GLASS_BOTTLE,2), new SlimefunItemStack(SlimefunItems.HEAVY_CREAM,2), null, null, null, null, null, null}, new SlimefunItemStack(QS_CW1_22,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_23 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.LEATHER,2), null, new ItemStack ( Material.LEATHER,2), new SlimefunItemStack(SlimefunItems.GOLD_6K,2), new ItemStack ( Material.CHEST,2), new SlimefunItemStack(SlimefunItems.GOLD_6K,2), new ItemStack ( Material.LEATHER,2), new ItemStack ( Material.LEATHER,2), new ItemStack ( Material.LEATHER,2)}, new SlimefunItemStack(QS_CW1_23,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_24 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.LEATHER,2), null, new ItemStack ( Material.LEATHER,2), new SlimefunItemStack(SlimefunItems.GOLD_10K,2), new SlimefunItemStack(SlimefunItems.BACKPACK_SMALL,2), new SlimefunItemStack(SlimefunItems.GOLD_10K,2), new ItemStack ( Material.LEATHER,2), new ItemStack ( Material.LEATHER,2), new ItemStack ( Material.LEATHER,2)}, new SlimefunItemStack(QS_CW1_24,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_25 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.LEATHER,2), null, new ItemStack ( Material.LEATHER,2), new SlimefunItemStack(SlimefunItems.GOLD_14K,2), new SlimefunItemStack(SlimefunItems.BACKPACK_MEDIUM,2), new SlimefunItemStack(SlimefunItems.GOLD_14K,2), new ItemStack ( Material.LEATHER,2), new ItemStack ( Material.LEATHER,2), new ItemStack ( Material.LEATHER,2)}, new SlimefunItemStack(QS_CW1_25,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_26 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.CLOTH,2), null,new SlimefunItemStack(SlimefunItems.CLOTH,2), new SlimefunItemStack(SlimefunItems.GOLD_16K,2), new SlimefunItemStack(SlimefunItems.BACKPACK_LARGE,2), new SlimefunItemStack(SlimefunItems.GOLD_16K,2), new SlimefunItemStack(SlimefunItems.CLOTH,2), new SlimefunItemStack(SlimefunItems.CLOTH,2), new SlimefunItemStack(SlimefunItems.CLOTH,2)}, new SlimefunItemStack(QS_CW1_26,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_27 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_22K,2), null, new SlimefunItemStack(SlimefunItems.GOLD_22K,2), new ItemStack ( Material.LEATHER,2), new SlimefunItemStack(SlimefunItems.WOVEN_BACKPACK,2), new ItemStack ( Material.LEATHER,2), new SlimefunItemStack(SlimefunItems.GOLD_22K,2), null, new SlimefunItemStack(SlimefunItems.GOLD_22K,2)}, new SlimefunItemStack(QS_CW1_27,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_28 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_24K,2), null, new SlimefunItemStack(SlimefunItems.GOLD_24K,2), new ItemStack ( Material.LEATHER,2), new SlimefunItemStack(SlimefunItems.GILDED_BACKPACK,2), new ItemStack ( Material.LEATHER,2), new SlimefunItemStack(SlimefunItems.GOLD_24K,2), null, new SlimefunItemStack(SlimefunItems.GOLD_24K,2)}, new SlimefunItemStack(QS_CW1_28,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_29 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.CLOTH,2), new SlimefunItemStack(SlimefunItems.CLOTH,2), new SlimefunItemStack(SlimefunItems.CLOTH,2), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,2), new SlimefunItemStack(SlimefunItems.COOLING_UNIT,2), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,2), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,2), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,2), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,2),}, new SlimefunItemStack(QS_CW1_29,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_30 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SILICON,2), new ItemStack ( Material.YELLOW_DYE,2), new SlimefunItemStack(SlimefunItems.SILICON,2), new ItemStack ( Material.YELLOW_DYE,2), new ItemStack ( Material.STRING,2), new ItemStack ( Material.YELLOW_DYE,2), new SlimefunItemStack(SlimefunItems.GILDED_IRON,2), new ItemStack ( Material.YELLOW_DYE,2), new SlimefunItemStack(SlimefunItems.SILICON,2)}, new SlimefunItemStack(QS_CW1_30,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_31= new AbstractItemRecipe( new ItemStack[]{null, null, null, new ItemStack ( Material.STONE,2), new ItemStack ( Material.BOWL,2), new ItemStack ( Material.STONE,2), new ItemStack ( Material.STONE,2), new ItemStack ( Material.STONE,2), new ItemStack ( Material.STONE,2)}, new SlimefunItemStack(QS_CW1_31,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_32 = new AbstractItemRecipe( new ItemStack[]{null, null, null, new ItemStack ( Material.NETHER_BRICK,2), new SlimefunItemStack(SlimefunItems.GOLD_PAN,2), new ItemStack ( Material.NETHER_BRICK,2), new ItemStack ( Material.NETHER_BRICK,2), new ItemStack ( Material.NETHER_BRICK,2), new ItemStack ( Material.NETHER_BRICK,2)}, new SlimefunItemStack(QS_CW1_32,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_33 = new AbstractItemRecipe( new ItemStack[]{null, null, new SlimefunItemStack(SlimefunItems.HOOK,2), null, new SlimefunItemStack(SlimefunItems.CHAIN,2), null, new SlimefunItemStack(SlimefunItems.CHAIN,2), null, null}, new SlimefunItemStack(QS_CW1_33,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_34 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,2), new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,2),  new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,2), new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,2), new ItemStack ( Material.FLINT,2),  new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,2), new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,2), new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,2),  new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,2)}, new SlimefunItemStack(QS_CW1_34,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_35 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.COOKIE,2), new ItemStack ( Material.PAPER,2), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW1_35,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_36 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.COOKIE,2), new SlimefunItemStack(SlimefunItems.ELYTRA_SCALE,2), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW1_36,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_37 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,2), new ItemStack ( Material.COOKED_BEEF,2), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW1_37,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_38 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,2), new ItemStack ( Material.COOKED_PORKCHOP,2), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW1_38,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_39 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,2), new ItemStack ( Material.COOKED_CHICKEN,2), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW1_39,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_40 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,2), new ItemStack ( Material.COOKED_MUTTON,2), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW1_40,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_41 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,2), new ItemStack ( Material.COOKED_RABBIT,2), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW1_41,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_42 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,2), new ItemStack ( Material.COOKED_COD,2), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW1_42,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_43 = new AbstractItemRecipe( new ItemStack[]{null,  new ItemStack ( Material.DRIED_KELP,2), null, new ItemStack ( Material.DRIED_KELP,2), new ItemStack ( Material.SUGAR,2), new ItemStack ( Material.DRIED_KELP,2), null, new ItemStack ( Material.DRIED_KELP,2), null}, new SlimefunItemStack(QS_CW1_43,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_44 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.SUGAR,2), new ItemStack ( Material.REDSTONE,2), new ItemStack ( Material.GLOWSTONE_DUST,2), null, null, null, null, null, null}, new SlimefunItemStack(QS_CW1_44,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_45 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,2), new ItemStack ( Material.ROTTEN_FLESH,2), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW1_45,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_46 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1,2), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1,2), null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1,2), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1,2), null, null, null, null}, new SlimefunItemStack(QS_CW1_46,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_47 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,2), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,2), null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,2), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,2), null, null, null, null}, new SlimefunItemStack(QS_CW1_47,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_48 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1,2), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1,2), null, new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1,2), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1,2), null, null, null, null}, new SlimefunItemStack(QS_CW1_48,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_49 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2,2), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2,2), null, new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2,2), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2,2), null, null, null, null}, new SlimefunItemStack(QS_CW1_49,1 ));
    public static final AbstractItemRecipe RECIPE_CW1_50 = new AbstractItemRecipe( new ItemStack[]{null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,2), null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,2), new ItemStack ( Material.BOOK,2), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,2), null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,2), null}, new SlimefunItemStack(QS_CW1_50,1 ));


































    //public static final AbstractItemRecipe RECIPE_RUNE_AIR = new AbstractItemRecipe(
    //  new ItemStack[]{new ItemStack(Material.FEATHER), new ItemStack(SlimefunItems.MAGIC_LUMP_1),
     //     new ItemStack(Material.FEATHER), new ItemStack(Material.GHAST_TEAR), new ItemStack(SlimefunItems.BLANK_RUNE),
       //   new ItemStack(Material.GHAST_TEAR), new ItemStack(Material.FEATHER),
         // new ItemStack(SlimefunItems.MAGIC_LUMP_1), new ItemStack(Material.FEATHER)},
      // new SlimefunItemStack(SlimefunItems.AIR_RUNE, 4));


  public XiPiaZhiZaoJi_V1(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
      list.add(RECIPE_CW1_1);
      list.add(RECIPE_CW1_2);
      list.add(RECIPE_CW1_3);
      list.add(RECIPE_CW1_4);
      list.add(RECIPE_CW1_5);
      list.add(RECIPE_CW1_6);
      list.add(RECIPE_CW1_7);
      list.add(RECIPE_CW1_8);
      list.add(RECIPE_CW1_9);
      list.add(RECIPE_CW1_10);
      list.add(RECIPE_CW1_11);
      list.add(RECIPE_CW1_12);
      list.add(RECIPE_CW1_13);
      list.add(RECIPE_CW1_14);
      list.add(RECIPE_CW1_15);
      list.add(RECIPE_CW1_16);
      list.add(RECIPE_CW1_17);
      list.add(RECIPE_CW1_18);
      list.add(RECIPE_CW1_19);
      list.add(RECIPE_CW1_20);
      list.add(RECIPE_CW1_21);
      list.add(RECIPE_CW1_22);
      list.add(RECIPE_CW1_23);
      list.add(RECIPE_CW1_24);
      list.add(RECIPE_CW1_25);
      list.add(RECIPE_CW1_26);
      list.add(RECIPE_CW1_27);
      list.add(RECIPE_CW1_28);
      list.add(RECIPE_CW1_29);
      list.add(RECIPE_CW1_30);
      list.add(RECIPE_CW1_31);
      list.add(RECIPE_CW1_32);
      list.add(RECIPE_CW1_33);
      list.add(RECIPE_CW1_34);
      list.add(RECIPE_CW1_35);
      list.add(RECIPE_CW1_36);
      list.add(RECIPE_CW1_37);
      list.add(RECIPE_CW1_38);
      list.add(RECIPE_CW1_39);
      list.add(RECIPE_CW1_40);
      list.add(RECIPE_CW1_41);
      list.add(RECIPE_CW1_42);
      list.add(RECIPE_CW1_43);
      list.add(RECIPE_CW1_44);
      list.add(RECIPE_CW1_45);
      list.add(RECIPE_CW1_46);
      list.add(RECIPE_CW1_47);
      list.add(RECIPE_CW1_48);
      list.add(RECIPE_CW1_49);
      list.add(RECIPE_CW1_50);
      //list.add(RECIPE_CW1_51);
      //list.add(RECIPE_CW1_52);
      //list.add(RECIPE_CW1_53);
      //list.add(RECIPE_CW1_54);
      //list.add(RECIPE_CW1_55);
      //list.add(RECIPE_CW1_56);
      //list.add(RECIPE_CW1_57);
      //list.add(RECIPE_CW1_58);
      //list.add(RECIPE_CW1_59);
      //list.add(RECIPE_CW1_60);
      //list.add(RECIPE_CW1_61);
      //list.add(RECIPE_CW1_62);
      //list.add(RECIPE_CW1_63);
      //list.add(RECIPE_CW1_64);
      //list.add(RECIPE_CW1_65);
      //list.add(RECIPE_CW1_66);
      //list.add(RECIPE_CW1_67);
      //list.add(RECIPE_CW1_68);
      //list.add(RECIPE_CW1_69);
      //list.add(RECIPE_CW1_70);
      //list.add(RECIPE_CW1_71);
      //list.add(RECIPE_CW1_72);
      //list.add(RECIPE_CW1_73);
      //list.add(RECIPE_CW1_74);
      //list.add(RECIPE_CW1_75);
      //list.add(RECIPE_CW1_76);
      //list.add(RECIPE_CW1_77);
      //list.add(RECIPE_CW1_78);
      //list.add(RECIPE_CW1_79);
      //list.add(RECIPE_CW1_80);
      //list.add(RECIPE_CW1_81);
      //list.add(RECIPE_CW1_82);
      //list.add(RECIPE_CW1_83);
      //list.add(RECIPE_CW1_84);
      //list.add(RECIPE_CW1_85);
      //list.add(RECIPE_CW1_86);
      //list.add(RECIPE_CW1_87);
      //list.add(RECIPE_CW1_88);
      //list.add(RECIPE_CW1_89);
      //list.add(RECIPE_CW1_90);
      //list.add(RECIPE_CW1_91);
      //list.add(RECIPE_CW1_92);
      //list.add(RECIPE_CW1_93);
      //list.add(RECIPE_CW1_94);
      //list.add(RECIPE_CW1_95);
      //list.add(RECIPE_CW1_96);
      //list.add(RECIPE_CW1_97);
      //list.add(RECIPE_CW1_98);
      //list.add(RECIPE_CW1_99);
      //list.add(RECIPE_CW1_100);
      //list.add(RECIPE_CW1_101);
      //list.add(RECIPE_CW1_102);
      //list.add(RECIPE_CW1_103);
      //list.add(RECIPE_CW1_104);
      //list.add(RECIPE_CW1_105);
      //list.add(RECIPE_CW1_106);
      //list.add(RECIPE_CW1_107);
      //list.add(RECIPE_CW1_108);
      //list.add(RECIPE_CW1_109);
      //list.add(RECIPE_CW1_110);
      //list.add(RECIPE_CW1_111);
      //list.add(RECIPE_CW1_112);
      //list.add(RECIPE_CW1_113);
      //list.add(RECIPE_CW1_114);
      //list.add(RECIPE_CW1_115);
      //list.add(RECIPE_CW1_116);
      //list.add(RECIPE_CW1_117);
      //list.add(RECIPE_CW1_118);
      //list.add(RECIPE_CW1_119);
      //list.add(RECIPE_CW1_120);
      //list.add(RECIPE_CW1_121);
      //list.add(RECIPE_CW1_122);
      //list.add(RECIPE_CW1_123);
      //list.add(RECIPE_CW1_124);
      //list.add(RECIPE_CW1_125);
      //list.add(RECIPE_CW1_126);
      //list.add(RECIPE_CW1_127);
      //list.add(RECIPE_CW1_128);
      //list.add(RECIPE_CW1_129);
      //list.add(RECIPE_CW1_130);
      //list.add(RECIPE_CW1_131);
      //list.add(RECIPE_CW1_132);
      //list.add(RECIPE_CW1_133);
      //list.add(RECIPE_CW1_134);
      //list.add(RECIPE_CW1_135);
      //list.add(RECIPE_CW1_136);
      //list.add(RECIPE_CW1_137);
      //list.add(RECIPE_CW1_138);
      //list.add(RECIPE_CW1_139);
      //list.add(RECIPE_CW1_140);
      //list.add(RECIPE_CW1_141);
      //list.add(RECIPE_CW1_142);
      //list.add(RECIPE_CW1_143);
      //list.add(RECIPE_CW1_144);
      //list.add(RECIPE_CW1_145);
      //list.add(RECIPE_CW1_146);
      //list.add(RECIPE_CW1_147);
      //list.add(RECIPE_CW1_148);
      //list.add(RECIPE_CW1_149);
      //list.add(RECIPE_CW1_150);
      //list.add(RECIPE_CW1_151);
      //list.add(RECIPE_CW1_152);
      //list.add(RECIPE_CW1_153);
      //list.add(RECIPE_CW1_154);
      //list.add(RECIPE_CW1_155);
      //list.add(RECIPE_CW1_156);
      //list.add(RECIPE_CW1_157);
      //list.add(RECIPE_CW1_158);
      //list.add(RECIPE_CW1_159);
      //list.add(RECIPE_CW1_160);
      //list.add(RECIPE_CW1_161);
      //list.add(RECIPE_CW1_162);
      //list.add(RECIPE_CW1_163);
      //list.add(RECIPE_CW1_164);
      //list.add(RECIPE_CW1_165);
      //list.add(RECIPE_CW1_166);
      //list.add(RECIPE_CW1_167);
      //list.add(RECIPE_CW1_168);
      //list.add(RECIPE_CW1_169);
      //list.add(RECIPE_CW1_170);
      //list.add(RECIPE_CW1_171);
      //list.add(RECIPE_CW1_172);
      //list.add(RECIPE_CW1_173);
      //list.add(RECIPE_CW1_174);
      //list.add(RECIPE_CW1_175);
      //list.add(RECIPE_CW1_176);
      //list.add(RECIPE_CW1_177);
      //list.add(RECIPE_CW1_178);
      //list.add(RECIPE_CW1_179);
      //list.add(RECIPE_CW1_180);
      //list.add(RECIPE_CW1_181);
      //list.add(RECIPE_CW1_182);
      //list.add(RECIPE_CW1_183);
      //list.add(RECIPE_CW1_184);
      //list.add(RECIPE_CW1_185);
      //list.add(RECIPE_CW1_186);
      //list.add(RECIPE_CW1_187);
      //list.add(RECIPE_CW1_188);
      //list.add(RECIPE_CW1_189);
      //list.add(RECIPE_CW1_190);
      //list.add(RECIPE_CW1_191);
      //list.add(RECIPE_CW1_192);
      //list.add(RECIPE_CW1_193);
      //list.add(RECIPE_CW1_194);
      //list.add(RECIPE_CW1_195);
      //list.add(RECIPE_CW1_196);
      //list.add(RECIPE_CW1_197);
      //list.add(RECIPE_CW1_198);
      //list.add(RECIPE_CW1_199);

      return list;
  }

}
