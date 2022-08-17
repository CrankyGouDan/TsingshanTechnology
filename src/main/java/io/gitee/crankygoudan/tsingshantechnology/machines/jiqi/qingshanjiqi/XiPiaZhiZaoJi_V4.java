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

import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanCaiLiao.QS_GANG_JIN_HE_XIN;
import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanCaiLiao.QS_QIANG_HUA_BAN;
import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanXinPia.*;

@Async
public class XiPiaZhiZaoJi_V4 extends MediumContainerMachine {

  public static final SlimefunItemStack QS_XIPIAZHIZAOJI_V4 = new SlimefunItemStack("QS_XIPIAZHIZAOJI_V4", Material.CARTOGRAPHY_TABLE, Y.colorPseudorandomString("芯片制造机")+ " " + Y.colorPseudorandomString(" "),
          Y.colorPseudorandomString(" "),
      Y.colorPseudorandomString("拥有究极的技术制造高阶芯片"),
          MachineLore.speed(64),
          MachineLore.energyBuffer(90000),
          MachineLore.energyPerSecond(40000));
  public static final ItemStack[] RECIPE_QS_XIPIAZHIZAOJI_V4= new ItemStack[]{
      XiPiaZhiZaoJi_V3.QS_XIPIAZHIZAOJI_V3, QS_GANG_JIN_HE_XIN, XiPiaZhiZaoJi_V3.QS_XIPIAZHIZAOJI_V3,
      QS_QIANG_HUA_BAN, XiPiaZhiZaoJi_V3.QS_XIPIAZHIZAOJI_V3, QS_QIANG_HUA_BAN,
      XiPiaZhiZaoJi_V3.QS_XIPIAZHIZAOJI_V3, QS_GANG_JIN_HE_XIN, XiPiaZhiZaoJi_V3.QS_XIPIAZHIZAOJI_V3
  };
    public static final AbstractItemRecipe RECIPE_CW4_1 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.LAPIS_BLOCK,64 ), new ItemStack ( Material.LAPIS_BLOCK,64 ), new ItemStack ( Material.LAPIS_BLOCK,64 ), new ItemStack ( Material.REDSTONE_BLOCK,64 ), new SlimefunItemStack ( SlimefunItems.BASIC_CIRCUIT_BOARD,64 ), new ItemStack ( Material.REDSTONE_BLOCK,64 ), new ItemStack ( Material.LAPIS_BLOCK,64 ), new ItemStack ( Material.LAPIS_BLOCK,64 ), new ItemStack ( Material.LAPIS_BLOCK,64 ),}, new SlimefunItemStack(QS_CW4_1,1));
    public static final AbstractItemRecipe RECIPE_CW4_2 = new AbstractItemRecipe( new ItemStack[]{null, new ItemStack ( Material.REDSTONE,64 ), null, new SlimefunItemStack ( SlimefunItems.ZINC_INGOT,64 ), new SlimefunItemStack ( SlimefunItems.SULFATE,64 ), new SlimefunItemStack ( SlimefunItems.COPPER_INGOT,64 ), new SlimefunItemStack ( SlimefunItems.ZINC_INGOT,64 ), new SlimefunItemStack ( SlimefunItems.SULFATE,64 ), new SlimefunItemStack ( SlimefunItems.COPPER_INGOT,64 )}, new SlimefunItemStack(QS_CW4_2,1));
    public static final AbstractItemRecipe RECIPE_CW4_3 = new AbstractItemRecipe( new ItemStack[]{null,  new ItemStack ( Material.REDSTONE,64 ), null, new SlimefunItemStack ( SlimefunItems.ALUMINUM_BRONZE_INGOT,64 ), new SlimefunItemStack ( SlimefunItems.ALUMINUM_BRONZE_INGOT,64 ), new SlimefunItemStack ( SlimefunItems.ALUMINUM_BRONZE_INGOT,64 ), new SlimefunItemStack ( SlimefunItems.STEEL_PLATE,64 ), new ItemStack ( Material.FIRE_CHARGE,64 ), new SlimefunItemStack ( SlimefunItems.STEEL_PLATE,64 )}, new SlimefunItemStack(QS_CW4_3,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_4 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.REDSTONE,64 ), new SlimefunItemStack ( SlimefunItems.SYNTHETIC_SAPPHIRE,64 ), new ItemStack ( Material.REDSTONE,64 ), new SlimefunItemStack ( SlimefunItems.SYNTHETIC_SAPPHIRE,64 ), new SlimefunItemStack ( SlimefunItems.SYNTHETIC_DIAMOND,64 ), new SlimefunItemStack ( SlimefunItems.SYNTHETIC_SAPPHIRE,64 ), new ItemStack ( Material.REDSTONE,64 ), new SlimefunItemStack ( SlimefunItems.SYNTHETIC_SAPPHIRE,64 ), new ItemStack ( Material.REDSTONE,64 )}, new SlimefunItemStack(QS_CW4_4,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_5 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.GLASS,64 ),  new ItemStack ( Material.GLASS,64 ),  new ItemStack ( Material.GLASS,64 ), new SlimefunItemStack ( SlimefunItems.SILICON,64 ),  new SlimefunItemStack ( SlimefunItems.SILICON,64 ),  new SlimefunItemStack ( SlimefunItems.SILICON,64 ), new SlimefunItemStack ( SlimefunItems.FERROSILICON,64 ), new SlimefunItemStack ( SlimefunItems.FERROSILICON,64 ), new SlimefunItemStack ( SlimefunItems.FERROSILICON,64 )}, new SlimefunItemStack(QS_CW4_5,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_6 = new AbstractItemRecipe( new ItemStack[]{null,new SlimefunItemStack(SlimefunItems.CLOTH,64), null, new SlimefunItemStack(SlimefunItems.CLOTH,64), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,64), new SlimefunItemStack(SlimefunItems.CLOTH,64), null, new SlimefunItemStack(SlimefunItems.CLOTH,64), null},new SlimefunItemStack(QS_CW4_6,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_7 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.NICKEL_INGOT,64), new SlimefunItemStack(SlimefunItems.MAGNET,64), new SlimefunItemStack(SlimefunItems.COBALT_INGOT,64), null, new SlimefunItemStack(SlimefunItems.BATTERY,64), null, null, null, null}, new SlimefunItemStack(QS_CW4_7,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_8 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.COPPER_WIRE,64), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,64), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,64), null, new SlimefunItemStack(SlimefunItems.ELECTRO_MAGNET,64), null, new SlimefunItemStack(SlimefunItems.COPPER_WIRE,64), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,64), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,64)}, new SlimefunItemStack(QS_CW4_8,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_9 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.COPPER_WIRE,64), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,64), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,64), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,64), new SlimefunItemStack(SlimefunItems.ELECTRIC_MOTOR,64), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,64), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,64), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,64), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,64)}, new SlimefunItemStack(QS_CW4_9,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_10 = new AbstractItemRecipe( new ItemStack[]{null, null, null, new SlimefunItemStack(SlimefunItems.COPPER_INGOT,64), new SlimefunItemStack(SlimefunItems.COPPER_INGOT,64), new SlimefunItemStack(SlimefunItems.COPPER_INGOT,64), null, null, null}, new SlimefunItemStack(QS_CW4_10,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_11 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.GLASS,64 ), new ItemStack ( Material.GLASS,64 ), new ItemStack ( Material.GLASS,64 ), new ItemStack ( Material.GLASS,64 ),  new SlimefunItemStack(SlimefunItems.REINFORCED_PLATE,64), new ItemStack ( Material.GLASS,64 ), new ItemStack ( Material.GLASS,64 ), new ItemStack ( Material.GLASS,64 ), new ItemStack ( Material.GLASS,64 )}, new SlimefunItemStack(QS_CW4_11,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_12 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.ICE,64 ), new ItemStack ( Material.ICE,64 ), new ItemStack ( Material.ICE,64 ), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,64), new SlimefunItemStack(SlimefunItems.ELECTRIC_MOTOR,64), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,64), new ItemStack ( Material.ICE,64 ), new ItemStack ( Material.ICE,64 ), new ItemStack ( Material.ICE,64 ),}, new SlimefunItemStack(QS_CW4_12,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_13 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.LEAD_INGOT,64), new ItemStack ( Material.OBSIDIAN,64 ), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,64), new ItemStack ( Material.OBSIDIAN,64 ), new SlimefunItemStack(SlimefunItems.HARDENED_GLASS,64), new ItemStack ( Material.OBSIDIAN,64 ), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,64), new ItemStack ( Material.OBSIDIAN,64 ), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,64)}, new SlimefunItemStack(QS_CW4_13,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_14 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.BRASS_INGOT,64), new ItemStack ( Material.ORANGE_STAINED_GLASS,64 ), new SlimefunItemStack(SlimefunItems.BRASS_INGOT,64), new SlimefunItemStack(SlimefunItems.POWER_CRYSTAL,64), new SlimefunItemStack(SlimefunItems.TIN_DUST,64), new SlimefunItemStack(SlimefunItems.POWER_CRYSTAL,64), new SlimefunItemStack(SlimefunItems.BRASS_INGOT,64), new ItemStack ( Material.ORANGE_STAINED_GLASS,64 ), new SlimefunItemStack(SlimefunItems.BRASS_INGOT,64)}, new SlimefunItemStack(QS_CW4_14,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_15 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.LEAD_INGOT,64), new SlimefunItemStack(SlimefunItems.WITHER_PROOF_OBSIDIAN,64), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,64), new SlimefunItemStack(SlimefunItems.WITHER_PROOF_OBSIDIAN,64), new SlimefunItemStack(SlimefunItems.HARDENED_GLASS,64), new SlimefunItemStack(SlimefunItems.WITHER_PROOF_OBSIDIAN,64), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,64), new SlimefunItemStack(SlimefunItems.WITHER_PROOF_OBSIDIAN,64), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,64)}, new SlimefunItemStack(QS_CW4_15,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_16 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.BOOK,64 ), new ItemStack ( Material.CRAFTING_TABLE,64 ), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW4_16,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_17 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.IRON_INGOT,64), new ItemStack ( Material.IRON_INGOT,64), new ItemStack ( Material.IRON_INGOT,64), new ItemStack ( Material.IRON_INGOT,64), null, new ItemStack ( Material.IRON_INGOT,64), new ItemStack ( Material.IRON_INGOT,64), new ItemStack ( Material.IRON_INGOT,64), new ItemStack ( Material.IRON_INGOT,64),}, new SlimefunItemStack(QS_CW4_17,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_18 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.CLOTH,64), new SlimefunItemStack(SlimefunItems.CLOTH,64), new SlimefunItemStack(SlimefunItems.CLOTH,64), new ItemStack ( Material.STRING,64), null, new ItemStack ( Material.STRING,64), new SlimefunItemStack(SlimefunItems.CLOTH,64), new SlimefunItemStack(SlimefunItems.CLOTH,64), new SlimefunItemStack(SlimefunItems.CLOTH,64),}, new SlimefunItemStack(QS_CW4_18,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_19 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.RAG,64), new ItemStack ( Material.STRING,64), new SlimefunItemStack(SlimefunItems.RAG,64), null, null, null, null, null, null}, new SlimefunItemStack(QS_CW4_19,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_20 = new AbstractItemRecipe( new ItemStack[]{null, new ItemStack ( Material.IRON_INGOT,64), null, new ItemStack ( Material.STICK,64), new ItemStack ( Material.STICK,64), new ItemStack ( Material.STICK,64), null, new ItemStack ( Material.IRON_INGOT,64), null}, new SlimefunItemStack(QS_CW4_20,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_21 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.TIN_CAN,64), new ItemStack ( Material.APPLE,64), new ItemStack ( Material.RED_MUSHROOM,64), new ItemStack ( Material.SUGAR,64), null, null, null, null, null}, new SlimefunItemStack(QS_CW4_21,1 ));

    public static final AbstractItemRecipe RECIPE_CW4_22 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.VITAMINS,64), new ItemStack ( Material.GLASS_BOTTLE,64), new SlimefunItemStack(SlimefunItems.HEAVY_CREAM,64), null, null, null, null, null, null}, new SlimefunItemStack(QS_CW4_22,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_23 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.LEATHER,64), null, new ItemStack ( Material.LEATHER,64), new SlimefunItemStack(SlimefunItems.GOLD_6K,64), new ItemStack ( Material.CHEST,64), new SlimefunItemStack(SlimefunItems.GOLD_6K,64), new ItemStack ( Material.LEATHER,64), new ItemStack ( Material.LEATHER,64), new ItemStack ( Material.LEATHER,64)}, new SlimefunItemStack(QS_CW4_23,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_24 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.LEATHER,64), null, new ItemStack ( Material.LEATHER,64), new SlimefunItemStack(SlimefunItems.GOLD_10K,64), new SlimefunItemStack(SlimefunItems.BACKPACK_SMALL,64), new SlimefunItemStack(SlimefunItems.GOLD_10K,64), new ItemStack ( Material.LEATHER,64), new ItemStack ( Material.LEATHER,64), new ItemStack ( Material.LEATHER,64)}, new SlimefunItemStack(QS_CW4_24,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_25 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.LEATHER,64), null, new ItemStack ( Material.LEATHER,64), new SlimefunItemStack(SlimefunItems.GOLD_14K,64), new SlimefunItemStack(SlimefunItems.BACKPACK_MEDIUM,64), new SlimefunItemStack(SlimefunItems.GOLD_14K,64), new ItemStack ( Material.LEATHER,64), new ItemStack ( Material.LEATHER,64), new ItemStack ( Material.LEATHER,64)}, new SlimefunItemStack(QS_CW4_25,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_26 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.CLOTH,64), null,new SlimefunItemStack(SlimefunItems.CLOTH,64), new SlimefunItemStack(SlimefunItems.GOLD_16K,64), new SlimefunItemStack(SlimefunItems.BACKPACK_LARGE,64), new SlimefunItemStack(SlimefunItems.GOLD_16K,64), new SlimefunItemStack(SlimefunItems.CLOTH,64), new SlimefunItemStack(SlimefunItems.CLOTH,64), new SlimefunItemStack(SlimefunItems.CLOTH,64)}, new SlimefunItemStack(QS_CW4_26,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_27 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_22K,64), null, new SlimefunItemStack(SlimefunItems.GOLD_22K,64), new ItemStack ( Material.LEATHER,64), new SlimefunItemStack(SlimefunItems.WOVEN_BACKPACK,64), new ItemStack ( Material.LEATHER,64), new SlimefunItemStack(SlimefunItems.GOLD_22K,64), null, new SlimefunItemStack(SlimefunItems.GOLD_22K,64)}, new SlimefunItemStack(QS_CW4_27,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_28 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_24K,64), null, new SlimefunItemStack(SlimefunItems.GOLD_24K,64), new ItemStack ( Material.LEATHER,64), new SlimefunItemStack(SlimefunItems.GILDED_BACKPACK,64), new ItemStack ( Material.LEATHER,64), new SlimefunItemStack(SlimefunItems.GOLD_24K,64), null, new SlimefunItemStack(SlimefunItems.GOLD_24K,64)}, new SlimefunItemStack(QS_CW4_28,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_29 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.CLOTH,64), new SlimefunItemStack(SlimefunItems.CLOTH,64), new SlimefunItemStack(SlimefunItems.CLOTH,64), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,64), new SlimefunItemStack(SlimefunItems.COOLING_UNIT,64), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,64), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,64), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,64), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,64),}, new SlimefunItemStack(QS_CW4_29,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_30 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SILICON,64), new ItemStack ( Material.YELLOW_DYE,64), new SlimefunItemStack(SlimefunItems.SILICON,64), new ItemStack ( Material.YELLOW_DYE,64), new ItemStack ( Material.STRING,64), new ItemStack ( Material.YELLOW_DYE,64), new SlimefunItemStack(SlimefunItems.GILDED_IRON,64), new ItemStack ( Material.YELLOW_DYE,64), new SlimefunItemStack(SlimefunItems.SILICON,64)}, new SlimefunItemStack(QS_CW4_30,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_31= new AbstractItemRecipe( new ItemStack[]{null, null, null, new ItemStack ( Material.STONE,64), new ItemStack ( Material.BOWL,64), new ItemStack ( Material.STONE,64), new ItemStack ( Material.STONE,64), new ItemStack ( Material.STONE,64), new ItemStack ( Material.STONE,64)}, new SlimefunItemStack(QS_CW4_31,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_32 = new AbstractItemRecipe( new ItemStack[]{null, null, null, new ItemStack ( Material.NETHER_BRICK,64), new SlimefunItemStack(SlimefunItems.GOLD_PAN,64), new ItemStack ( Material.NETHER_BRICK,64), new ItemStack ( Material.NETHER_BRICK,64), new ItemStack ( Material.NETHER_BRICK,64), new ItemStack ( Material.NETHER_BRICK,64)}, new SlimefunItemStack(QS_CW4_32,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_33 = new AbstractItemRecipe( new ItemStack[]{null, null, new SlimefunItemStack(SlimefunItems.HOOK,64), null, new SlimefunItemStack(SlimefunItems.CHAIN,64), null, new SlimefunItemStack(SlimefunItems.CHAIN,64), null, null}, new SlimefunItemStack(QS_CW4_33,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_34 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,64), new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,64),  new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,64), new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,64), new ItemStack ( Material.FLINT,64),  new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,64), new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,64), new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,64),  new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,64)}, new SlimefunItemStack(QS_CW4_34,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_35 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.COOKIE,64), new ItemStack ( Material.PAPER,64), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW4_35,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_36 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.COOKIE,64), new SlimefunItemStack(SlimefunItems.ELYTRA_SCALE,64), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW4_36,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_37 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,64), new ItemStack ( Material.COOKED_BEEF,64), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW4_37,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_38 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,64), new ItemStack ( Material.COOKED_PORKCHOP,64), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW4_38,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_39 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,64), new ItemStack ( Material.COOKED_CHICKEN,64), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW4_39,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_40 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,64), new ItemStack ( Material.COOKED_MUTTON,64), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW4_40,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_41 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,64), new ItemStack ( Material.COOKED_RABBIT,64), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW4_41,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_42 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,64), new ItemStack ( Material.COOKED_COD,64), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW4_42,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_43 = new AbstractItemRecipe( new ItemStack[]{null,  new ItemStack ( Material.DRIED_KELP,64), null, new ItemStack ( Material.DRIED_KELP,64), new ItemStack ( Material.SUGAR,64), new ItemStack ( Material.DRIED_KELP,64), null, new ItemStack ( Material.DRIED_KELP,64), null}, new SlimefunItemStack(QS_CW4_43,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_44 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.SUGAR,64), new ItemStack ( Material.REDSTONE,64), new ItemStack ( Material.GLOWSTONE_DUST,64), null, null, null, null, null, null}, new SlimefunItemStack(QS_CW4_44,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_45 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,64), new ItemStack ( Material.ROTTEN_FLESH,64), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW4_45,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_46 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1,64), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1,64), null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1,64), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1,64), null, null, null, null}, new SlimefunItemStack(QS_CW4_46,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_47 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,64), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,64), null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,64), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,64), null, null, null, null}, new SlimefunItemStack(QS_CW4_47,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_48 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1,64), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1,64), null, new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1,64), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1,64), null, null, null, null}, new SlimefunItemStack(QS_CW4_48,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_49 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2,64), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2,64), null, new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2,64), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2,64), null, null, null, null}, new SlimefunItemStack(QS_CW4_49,1 ));
    public static final AbstractItemRecipe RECIPE_CW4_50 = new AbstractItemRecipe( new ItemStack[]{null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,64), null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,64), new ItemStack ( Material.BOOK,64), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,64), null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,64), null}, new SlimefunItemStack(QS_CW4_50,1 ));


































    //public static final AbstractItemRecipe RECIPE_RUNE_AIR = new AbstractItemRecipe(
    //  new ItemStack[]{new ItemStack(Material.FEATHER), new ItemStack(SlimefunItems.MAGIC_LUMP_1),
     //     new ItemStack(Material.FEATHER), new ItemStack(Material.GHAST_TEAR), new ItemStack(SlimefunItems.BLANK_RUNE),
       //   new ItemStack(Material.GHAST_TEAR), new ItemStack(Material.FEATHER),
         // new ItemStack(SlimefunItems.MAGIC_LUMP_1), new ItemStack(Material.FEATHER)},
      // new SlimefunItemStack(SlimefunItems.AIR_RUNE, 4));


  public XiPiaZhiZaoJi_V4(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
      list.add(RECIPE_CW4_1);
      list.add(RECIPE_CW4_2);
      list.add(RECIPE_CW4_3);
      list.add(RECIPE_CW4_4);
      list.add(RECIPE_CW4_5);
      list.add(RECIPE_CW4_6);
      list.add(RECIPE_CW4_7);
      list.add(RECIPE_CW4_8);
      list.add(RECIPE_CW4_9);
      list.add(RECIPE_CW4_10);
      list.add(RECIPE_CW4_11);
      list.add(RECIPE_CW4_12);
      list.add(RECIPE_CW4_13);
      list.add(RECIPE_CW4_14);
      list.add(RECIPE_CW4_15);
      list.add(RECIPE_CW4_16);
      list.add(RECIPE_CW4_17);
      list.add(RECIPE_CW4_18);
      list.add(RECIPE_CW4_19);
      list.add(RECIPE_CW4_20);
      list.add(RECIPE_CW4_21);
      list.add(RECIPE_CW4_22);
      list.add(RECIPE_CW4_23);
      list.add(RECIPE_CW4_24);
      list.add(RECIPE_CW4_25);
      list.add(RECIPE_CW4_26);
      list.add(RECIPE_CW4_27);
      list.add(RECIPE_CW4_28);
      list.add(RECIPE_CW4_29);
      list.add(RECIPE_CW4_30);
      list.add(RECIPE_CW4_31);
      list.add(RECIPE_CW4_32);
      list.add(RECIPE_CW4_33);
      list.add(RECIPE_CW4_34);
      list.add(RECIPE_CW4_35);
      list.add(RECIPE_CW4_36);
      list.add(RECIPE_CW4_37);
      list.add(RECIPE_CW4_38);
      list.add(RECIPE_CW4_39);
      list.add(RECIPE_CW4_40);
      list.add(RECIPE_CW4_41);
      list.add(RECIPE_CW4_42);
      list.add(RECIPE_CW4_43);
      list.add(RECIPE_CW4_44);
      list.add(RECIPE_CW4_45);
      list.add(RECIPE_CW4_46);
      list.add(RECIPE_CW4_47);
      list.add(RECIPE_CW4_48);
      list.add(RECIPE_CW4_49);
      list.add(RECIPE_CW4_50);
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
