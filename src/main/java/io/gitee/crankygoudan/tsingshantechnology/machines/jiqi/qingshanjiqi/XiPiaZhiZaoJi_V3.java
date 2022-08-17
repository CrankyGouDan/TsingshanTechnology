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
public class XiPiaZhiZaoJi_V3 extends MediumContainerMachine {

  public static final SlimefunItemStack QS_XIPIAZHIZAOJI_V3 = new SlimefunItemStack("QS_XIPIAZHIZAOJI_V3", Material.CARTOGRAPHY_TABLE, Y.colorPseudorandomString("芯片制造机")+ " " + Y.colorPseudorandomString(" "),
          Y.colorPseudorandomString(" "),
      Y.colorPseudorandomString("拥有神级的技术制造高阶芯片"),
          MachineLore.speed(32),
          MachineLore.energyBuffer(70000),
          MachineLore.energyPerSecond(26000));
  public static final ItemStack[] RECIPE_QS_XIPIAZHIZAOJI_V3= new ItemStack[]{
      XiPiaZhiZaoJi_V2.QS_XIPIAZHIZAOJI_V2, QS_GANG_JIN_HE_XIN, XiPiaZhiZaoJi_V2.QS_XIPIAZHIZAOJI_V2,
      QS_QIANG_HUA_BAN, XiPiaZhiZaoJi_V2.QS_XIPIAZHIZAOJI_V2, QS_QIANG_HUA_BAN,
      XiPiaZhiZaoJi_V2.QS_XIPIAZHIZAOJI_V2, QS_GANG_JIN_HE_XIN, XiPiaZhiZaoJi_V2.QS_XIPIAZHIZAOJI_V2
  };
    public static final AbstractItemRecipe RECIPE_CW3_1 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.LAPIS_BLOCK,32 ), new ItemStack ( Material.LAPIS_BLOCK,32 ), new ItemStack ( Material.LAPIS_BLOCK,32 ), new ItemStack ( Material.REDSTONE_BLOCK,32 ), new SlimefunItemStack ( SlimefunItems.BASIC_CIRCUIT_BOARD,32 ), new ItemStack ( Material.REDSTONE_BLOCK,32 ), new ItemStack ( Material.LAPIS_BLOCK,32 ), new ItemStack ( Material.LAPIS_BLOCK,32 ), new ItemStack ( Material.LAPIS_BLOCK,32 ),}, new SlimefunItemStack(QS_CW3_1,1));
    public static final AbstractItemRecipe RECIPE_CW3_2 = new AbstractItemRecipe( new ItemStack[]{null, new ItemStack ( Material.REDSTONE,32 ), null, new SlimefunItemStack ( SlimefunItems.ZINC_INGOT,32 ), new SlimefunItemStack ( SlimefunItems.SULFATE,32 ), new SlimefunItemStack ( SlimefunItems.COPPER_INGOT,32 ), new SlimefunItemStack ( SlimefunItems.ZINC_INGOT,32 ), new SlimefunItemStack ( SlimefunItems.SULFATE,32 ), new SlimefunItemStack ( SlimefunItems.COPPER_INGOT,32 )}, new SlimefunItemStack(QS_CW3_2,1));
    public static final AbstractItemRecipe RECIPE_CW3_3 = new AbstractItemRecipe( new ItemStack[]{null,  new ItemStack ( Material.REDSTONE,32 ), null, new SlimefunItemStack ( SlimefunItems.ALUMINUM_BRONZE_INGOT,32 ), new SlimefunItemStack ( SlimefunItems.ALUMINUM_BRONZE_INGOT,32 ), new SlimefunItemStack ( SlimefunItems.ALUMINUM_BRONZE_INGOT,32 ), new SlimefunItemStack ( SlimefunItems.STEEL_PLATE,32 ), new ItemStack ( Material.FIRE_CHARGE,32 ), new SlimefunItemStack ( SlimefunItems.STEEL_PLATE,32 )}, new SlimefunItemStack(QS_CW3_3,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_4 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.REDSTONE,32 ), new SlimefunItemStack ( SlimefunItems.SYNTHETIC_SAPPHIRE,32 ), new ItemStack ( Material.REDSTONE,32 ), new SlimefunItemStack ( SlimefunItems.SYNTHETIC_SAPPHIRE,32 ), new SlimefunItemStack ( SlimefunItems.SYNTHETIC_DIAMOND,32 ), new SlimefunItemStack ( SlimefunItems.SYNTHETIC_SAPPHIRE,32 ), new ItemStack ( Material.REDSTONE,32 ), new SlimefunItemStack ( SlimefunItems.SYNTHETIC_SAPPHIRE,32 ), new ItemStack ( Material.REDSTONE,32 )}, new SlimefunItemStack(QS_CW3_4,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_5 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.GLASS,32 ),  new ItemStack ( Material.GLASS,32 ),  new ItemStack ( Material.GLASS,32 ), new SlimefunItemStack ( SlimefunItems.SILICON,32 ),  new SlimefunItemStack ( SlimefunItems.SILICON,32 ),  new SlimefunItemStack ( SlimefunItems.SILICON,32 ), new SlimefunItemStack ( SlimefunItems.FERROSILICON,32 ), new SlimefunItemStack ( SlimefunItems.FERROSILICON,32 ), new SlimefunItemStack ( SlimefunItems.FERROSILICON,32 )}, new SlimefunItemStack(QS_CW3_5,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_6 = new AbstractItemRecipe( new ItemStack[]{null,new SlimefunItemStack(SlimefunItems.CLOTH,32), null, new SlimefunItemStack(SlimefunItems.CLOTH,32), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,32), new SlimefunItemStack(SlimefunItems.CLOTH,32), null, new SlimefunItemStack(SlimefunItems.CLOTH,32), null},new SlimefunItemStack(QS_CW3_6,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_7 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.NICKEL_INGOT,32), new SlimefunItemStack(SlimefunItems.MAGNET,32), new SlimefunItemStack(SlimefunItems.COBALT_INGOT,32), null, new SlimefunItemStack(SlimefunItems.BATTERY,32), null, null, null, null}, new SlimefunItemStack(QS_CW3_7,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_8 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.COPPER_WIRE,32), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,32), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,32), null, new SlimefunItemStack(SlimefunItems.ELECTRO_MAGNET,32), null, new SlimefunItemStack(SlimefunItems.COPPER_WIRE,32), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,32), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,32)}, new SlimefunItemStack(QS_CW3_8,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_9 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.COPPER_WIRE,32), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,32), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,32), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,32), new SlimefunItemStack(SlimefunItems.ELECTRIC_MOTOR,32), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,32), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,32), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,32), new SlimefunItemStack(SlimefunItems.COPPER_WIRE,32)}, new SlimefunItemStack(QS_CW3_9,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_10 = new AbstractItemRecipe( new ItemStack[]{null, null, null, new SlimefunItemStack(SlimefunItems.COPPER_INGOT,32), new SlimefunItemStack(SlimefunItems.COPPER_INGOT,32), new SlimefunItemStack(SlimefunItems.COPPER_INGOT,32), null, null, null}, new SlimefunItemStack(QS_CW3_10,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_11 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.GLASS,32 ), new ItemStack ( Material.GLASS,32 ), new ItemStack ( Material.GLASS,32 ), new ItemStack ( Material.GLASS,32 ),  new SlimefunItemStack(SlimefunItems.REINFORCED_PLATE,32), new ItemStack ( Material.GLASS,32 ), new ItemStack ( Material.GLASS,32 ), new ItemStack ( Material.GLASS,32 ), new ItemStack ( Material.GLASS,32 )}, new SlimefunItemStack(QS_CW3_11,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_12 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.ICE,32 ), new ItemStack ( Material.ICE,32 ), new ItemStack ( Material.ICE,32 ), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,32), new SlimefunItemStack(SlimefunItems.ELECTRIC_MOTOR,32), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,32), new ItemStack ( Material.ICE,32 ), new ItemStack ( Material.ICE,32 ), new ItemStack ( Material.ICE,32 ),}, new SlimefunItemStack(QS_CW3_12,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_13 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.LEAD_INGOT,32), new ItemStack ( Material.OBSIDIAN,32 ), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,32), new ItemStack ( Material.OBSIDIAN,32 ), new SlimefunItemStack(SlimefunItems.HARDENED_GLASS,32), new ItemStack ( Material.OBSIDIAN,32 ), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,32), new ItemStack ( Material.OBSIDIAN,32 ), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,32)}, new SlimefunItemStack(QS_CW3_13,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_14 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.BRASS_INGOT,32), new ItemStack ( Material.ORANGE_STAINED_GLASS,32 ), new SlimefunItemStack(SlimefunItems.BRASS_INGOT,32), new SlimefunItemStack(SlimefunItems.POWER_CRYSTAL,32), new SlimefunItemStack(SlimefunItems.TIN_DUST,32), new SlimefunItemStack(SlimefunItems.POWER_CRYSTAL,32), new SlimefunItemStack(SlimefunItems.BRASS_INGOT,32), new ItemStack ( Material.ORANGE_STAINED_GLASS,32 ), new SlimefunItemStack(SlimefunItems.BRASS_INGOT,32)}, new SlimefunItemStack(QS_CW3_14,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_15 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.LEAD_INGOT,32), new SlimefunItemStack(SlimefunItems.WITHER_PROOF_OBSIDIAN,32), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,32), new SlimefunItemStack(SlimefunItems.WITHER_PROOF_OBSIDIAN,32), new SlimefunItemStack(SlimefunItems.HARDENED_GLASS,32), new SlimefunItemStack(SlimefunItems.WITHER_PROOF_OBSIDIAN,32), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,32), new SlimefunItemStack(SlimefunItems.WITHER_PROOF_OBSIDIAN,32), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,32)}, new SlimefunItemStack(QS_CW3_15,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_16 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.BOOK,32 ), new ItemStack ( Material.CRAFTING_TABLE,32 ), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW3_16,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_17 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.IRON_INGOT,32), new ItemStack ( Material.IRON_INGOT,32), new ItemStack ( Material.IRON_INGOT,32), new ItemStack ( Material.IRON_INGOT,32), null, new ItemStack ( Material.IRON_INGOT,32), new ItemStack ( Material.IRON_INGOT,32), new ItemStack ( Material.IRON_INGOT,32), new ItemStack ( Material.IRON_INGOT,32),}, new SlimefunItemStack(QS_CW3_17,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_18 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.CLOTH,32), new SlimefunItemStack(SlimefunItems.CLOTH,32), new SlimefunItemStack(SlimefunItems.CLOTH,32), new ItemStack ( Material.STRING,32), null, new ItemStack ( Material.STRING,32), new SlimefunItemStack(SlimefunItems.CLOTH,32), new SlimefunItemStack(SlimefunItems.CLOTH,32), new SlimefunItemStack(SlimefunItems.CLOTH,32),}, new SlimefunItemStack(QS_CW3_18,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_19 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.RAG,32), new ItemStack ( Material.STRING,32), new SlimefunItemStack(SlimefunItems.RAG,32), null, null, null, null, null, null}, new SlimefunItemStack(QS_CW3_19,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_20 = new AbstractItemRecipe( new ItemStack[]{null, new ItemStack ( Material.IRON_INGOT,32), null, new ItemStack ( Material.STICK,32), new ItemStack ( Material.STICK,32), new ItemStack ( Material.STICK,32), null, new ItemStack ( Material.IRON_INGOT,32), null}, new SlimefunItemStack(QS_CW3_20,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_21 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.TIN_CAN,32), new ItemStack ( Material.APPLE,32), new ItemStack ( Material.RED_MUSHROOM,32), new ItemStack ( Material.SUGAR,32), null, null, null, null, null}, new SlimefunItemStack(QS_CW3_21,1 ));

    public static final AbstractItemRecipe RECIPE_CW3_22 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.VITAMINS,32), new ItemStack ( Material.GLASS_BOTTLE,32), new SlimefunItemStack(SlimefunItems.HEAVY_CREAM,32), null, null, null, null, null, null}, new SlimefunItemStack(QS_CW3_22,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_23 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.LEATHER,32), null, new ItemStack ( Material.LEATHER,32), new SlimefunItemStack(SlimefunItems.GOLD_6K,32), new ItemStack ( Material.CHEST,32), new SlimefunItemStack(SlimefunItems.GOLD_6K,32), new ItemStack ( Material.LEATHER,32), new ItemStack ( Material.LEATHER,32), new ItemStack ( Material.LEATHER,32)}, new SlimefunItemStack(QS_CW3_23,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_24 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.LEATHER,32), null, new ItemStack ( Material.LEATHER,32), new SlimefunItemStack(SlimefunItems.GOLD_10K,32), new SlimefunItemStack(SlimefunItems.BACKPACK_SMALL,32), new SlimefunItemStack(SlimefunItems.GOLD_10K,32), new ItemStack ( Material.LEATHER,32), new ItemStack ( Material.LEATHER,32), new ItemStack ( Material.LEATHER,32)}, new SlimefunItemStack(QS_CW3_24,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_25 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.LEATHER,32), null, new ItemStack ( Material.LEATHER,32), new SlimefunItemStack(SlimefunItems.GOLD_14K,32), new SlimefunItemStack(SlimefunItems.BACKPACK_MEDIUM,32), new SlimefunItemStack(SlimefunItems.GOLD_14K,32), new ItemStack ( Material.LEATHER,32), new ItemStack ( Material.LEATHER,32), new ItemStack ( Material.LEATHER,32)}, new SlimefunItemStack(QS_CW3_25,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_26 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.CLOTH,32), null,new SlimefunItemStack(SlimefunItems.CLOTH,32), new SlimefunItemStack(SlimefunItems.GOLD_16K,32), new SlimefunItemStack(SlimefunItems.BACKPACK_LARGE,32), new SlimefunItemStack(SlimefunItems.GOLD_16K,32), new SlimefunItemStack(SlimefunItems.CLOTH,32), new SlimefunItemStack(SlimefunItems.CLOTH,32), new SlimefunItemStack(SlimefunItems.CLOTH,32)}, new SlimefunItemStack(QS_CW3_26,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_27 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_22K,32), null, new SlimefunItemStack(SlimefunItems.GOLD_22K,32), new ItemStack ( Material.LEATHER,32), new SlimefunItemStack(SlimefunItems.WOVEN_BACKPACK,32), new ItemStack ( Material.LEATHER,32), new SlimefunItemStack(SlimefunItems.GOLD_22K,32), null, new SlimefunItemStack(SlimefunItems.GOLD_22K,32)}, new SlimefunItemStack(QS_CW3_27,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_28 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.GOLD_24K,32), null, new SlimefunItemStack(SlimefunItems.GOLD_24K,32), new ItemStack ( Material.LEATHER,32), new SlimefunItemStack(SlimefunItems.GILDED_BACKPACK,32), new ItemStack ( Material.LEATHER,32), new SlimefunItemStack(SlimefunItems.GOLD_24K,32), null, new SlimefunItemStack(SlimefunItems.GOLD_24K,32)}, new SlimefunItemStack(QS_CW3_28,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_29 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.CLOTH,32), new SlimefunItemStack(SlimefunItems.CLOTH,32), new SlimefunItemStack(SlimefunItems.CLOTH,32), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,32), new SlimefunItemStack(SlimefunItems.COOLING_UNIT,32), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,32), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,32), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,32), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,32),}, new SlimefunItemStack(QS_CW3_29,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_30 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SILICON,32), new ItemStack ( Material.YELLOW_DYE,32), new SlimefunItemStack(SlimefunItems.SILICON,32), new ItemStack ( Material.YELLOW_DYE,32), new ItemStack ( Material.STRING,32), new ItemStack ( Material.YELLOW_DYE,32), new SlimefunItemStack(SlimefunItems.GILDED_IRON,32), new ItemStack ( Material.YELLOW_DYE,32), new SlimefunItemStack(SlimefunItems.SILICON,32)}, new SlimefunItemStack(QS_CW3_30,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_31= new AbstractItemRecipe( new ItemStack[]{null, null, null, new ItemStack ( Material.STONE,32), new ItemStack ( Material.BOWL,32), new ItemStack ( Material.STONE,32), new ItemStack ( Material.STONE,32), new ItemStack ( Material.STONE,32), new ItemStack ( Material.STONE,32)}, new SlimefunItemStack(QS_CW3_31,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_32 = new AbstractItemRecipe( new ItemStack[]{null, null, null, new ItemStack ( Material.NETHER_BRICK,32), new SlimefunItemStack(SlimefunItems.GOLD_PAN,32), new ItemStack ( Material.NETHER_BRICK,32), new ItemStack ( Material.NETHER_BRICK,32), new ItemStack ( Material.NETHER_BRICK,32), new ItemStack ( Material.NETHER_BRICK,32)}, new SlimefunItemStack(QS_CW3_32,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_33 = new AbstractItemRecipe( new ItemStack[]{null, null, new SlimefunItemStack(SlimefunItems.HOOK,32), null, new SlimefunItemStack(SlimefunItems.CHAIN,32), null, new SlimefunItemStack(SlimefunItems.CHAIN,32), null, null}, new SlimefunItemStack(QS_CW3_33,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_34 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,32), new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,32),  new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,32), new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,32), new ItemStack ( Material.FLINT,32),  new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,32), new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,32), new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,32),  new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,32)}, new SlimefunItemStack(QS_CW3_34,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_35 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.COOKIE,32), new ItemStack ( Material.PAPER,32), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW3_35,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_36 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.COOKIE,32), new SlimefunItemStack(SlimefunItems.ELYTRA_SCALE,32), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW3_36,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_37 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,32), new ItemStack ( Material.COOKED_BEEF,32), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW3_37,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_38 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,32), new ItemStack ( Material.COOKED_PORKCHOP,32), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW3_38,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_39 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,32), new ItemStack ( Material.COOKED_CHICKEN,32), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW3_39,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_40 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,32), new ItemStack ( Material.COOKED_MUTTON,32), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW3_40,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_41 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,32), new ItemStack ( Material.COOKED_RABBIT,32), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW3_41,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_42 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,32), new ItemStack ( Material.COOKED_COD,32), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW3_42,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_43 = new AbstractItemRecipe( new ItemStack[]{null,  new ItemStack ( Material.DRIED_KELP,32), null, new ItemStack ( Material.DRIED_KELP,32), new ItemStack ( Material.SUGAR,32), new ItemStack ( Material.DRIED_KELP,32), null, new ItemStack ( Material.DRIED_KELP,32), null}, new SlimefunItemStack(QS_CW3_43,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_44 = new AbstractItemRecipe( new ItemStack[]{new ItemStack ( Material.SUGAR,32), new ItemStack ( Material.REDSTONE,32), new ItemStack ( Material.GLOWSTONE_DUST,32), null, null, null, null, null, null}, new SlimefunItemStack(QS_CW3_44,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_45 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.SALT,32), new ItemStack ( Material.ROTTEN_FLESH,32), null, null, null, null, null, null, null}, new SlimefunItemStack(QS_CW3_45,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_46 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1,32), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1,32), null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1,32), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_1,32), null, null, null, null}, new SlimefunItemStack(QS_CW3_46,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_47 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,32), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,32), null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,32), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,32), null, null, null, null}, new SlimefunItemStack(QS_CW3_47,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_48 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1,32), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1,32), null, new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1,32), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_1,32), null, null, null, null}, new SlimefunItemStack(QS_CW3_48,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_49 = new AbstractItemRecipe( new ItemStack[]{new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2,32), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2,32), null, new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2,32), new SlimefunItemStack(SlimefunItems.ENDER_LUMP_2,32), null, null, null, null}, new SlimefunItemStack(QS_CW3_49,1 ));
    public static final AbstractItemRecipe RECIPE_CW3_50 = new AbstractItemRecipe( new ItemStack[]{null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,32), null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,32), new ItemStack ( Material.BOOK,32), new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,32), null, new SlimefunItemStack(SlimefunItems.MAGIC_LUMP_2,32), null}, new SlimefunItemStack(QS_CW3_50,1 ));


































    //public static final AbstractItemRecipe RECIPE_RUNE_AIR = new AbstractItemRecipe(
    //  new ItemStack[]{new ItemStack(Material.FEATHER), new ItemStack(SlimefunItems.MAGIC_LUMP_1),
     //     new ItemStack(Material.FEATHER), new ItemStack(Material.GHAST_TEAR), new ItemStack(SlimefunItems.BLANK_RUNE),
       //   new ItemStack(Material.GHAST_TEAR), new ItemStack(Material.FEATHER),
         // new ItemStack(SlimefunItems.MAGIC_LUMP_1), new ItemStack(Material.FEATHER)},
      // new SlimefunItemStack(SlimefunItems.AIR_RUNE, 4));


  public XiPiaZhiZaoJi_V3(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
      list.add(RECIPE_CW3_1);
      list.add(RECIPE_CW3_2);
      list.add(RECIPE_CW3_3);
      list.add(RECIPE_CW3_4);
      list.add(RECIPE_CW3_5);
      list.add(RECIPE_CW3_6);
      list.add(RECIPE_CW3_7);
      list.add(RECIPE_CW3_8);
      list.add(RECIPE_CW3_9);
      list.add(RECIPE_CW3_10);
      list.add(RECIPE_CW3_11);
      list.add(RECIPE_CW3_12);
      list.add(RECIPE_CW3_13);
      list.add(RECIPE_CW3_14);
      list.add(RECIPE_CW3_15);
      list.add(RECIPE_CW3_16);
      list.add(RECIPE_CW3_17);
      list.add(RECIPE_CW3_18);
      list.add(RECIPE_CW3_19);
      list.add(RECIPE_CW3_20);
      list.add(RECIPE_CW3_21);
      list.add(RECIPE_CW3_22);
      list.add(RECIPE_CW3_23);
      list.add(RECIPE_CW3_24);
      list.add(RECIPE_CW3_25);
      list.add(RECIPE_CW3_26);
      list.add(RECIPE_CW3_27);
      list.add(RECIPE_CW3_28);
      list.add(RECIPE_CW3_29);
      list.add(RECIPE_CW3_30);
      list.add(RECIPE_CW3_31);
      list.add(RECIPE_CW3_32);
      list.add(RECIPE_CW3_33);
      list.add(RECIPE_CW3_34);
      list.add(RECIPE_CW3_35);
      list.add(RECIPE_CW3_36);
      list.add(RECIPE_CW3_37);
      list.add(RECIPE_CW3_38);
      list.add(RECIPE_CW3_39);
      list.add(RECIPE_CW3_40);
      list.add(RECIPE_CW3_41);
      list.add(RECIPE_CW3_42);
      list.add(RECIPE_CW3_43);
      list.add(RECIPE_CW3_44);
      list.add(RECIPE_CW3_45);
      list.add(RECIPE_CW3_46);
      list.add(RECIPE_CW3_47);
      list.add(RECIPE_CW3_48);
      list.add(RECIPE_CW3_49);
      list.add(RECIPE_CW3_50);
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
