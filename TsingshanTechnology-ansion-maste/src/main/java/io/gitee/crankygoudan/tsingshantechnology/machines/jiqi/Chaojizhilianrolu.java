package io.gitee.crankygoudan.tsingshantechnology.machines.jiqi;

import com.github.relativobr.machine.MediumContainerMachine;
import com.github.relativobr.recipe.AbstractItemRecipe;

import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.springframework.scheduling.annotation.Async;

import java.util.ArrayList;
import java.util.List;

@Async
public class Chaojizhilianrolu extends MediumContainerMachine {

  public static final SlimefunItemStack QS_JQ_CJZLRL = new SlimefunItemStack("QS_JQ_CJZLRL", Material.SMOKER, TextUtil.colorPseudorandomString("超级治炼熔炉")+ " " + TextUtil.colorPseudorandomString("基础"),
          TextUtil.colorPseudorandomString("8倍速度合成"),
          TextUtil.colorPseudorandomString(" "),
          MachineLore.speed(1),
          MachineLore.energyBuffer(10000),
          MachineLore.energyPerSecond(3456));


  public static final ItemStack[] RECIPE_MAGIC_ALTAR_MACHINE = new ItemStack[]{
          null, null, null,
          null, null, null,
          null, null, null
  };

  public static final AbstractItemRecipe RECIPE_REINFORCED_ALLOY_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, new SlimefunItemStack(SlimefunItems.HARDENED_METAL_INGOT,8), new SlimefunItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT,8), new SlimefunItemStack(SlimefunItems.CORINTHIAN_BRONZE_INGOT,8), new SlimefunItemStack(SlimefunItems.SOLDER_INGOT,8), new SlimefunItemStack(SlimefunItems.GOLD_24K,8), new SlimefunItemStack(SlimefunItems.BILLON_INGOT,8)}, new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT,8));
  //强化合金锭
  public static final AbstractItemRecipe RECIPE_HARDENED_METAL_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, new SlimefunItemStack(SlimefunItems.ALUMINUM_BRONZE_INGOT,8), new SlimefunItemStack(SlimefunItems.DURALUMIN_INGOT,8), new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,8), new SlimefunItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT,8)}, new SlimefunItemStack(SlimefunItems.HARDENED_METAL_INGOT,8));
  //硬化金属
  public static final AbstractItemRecipe RECIPE_DAMASCUS_STEEL_INGOT  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null,null, new SlimefunItemStack(SlimefunItems.IRON_DUST,8), new SlimefunItemStack(SlimefunItems.CARBON,8), new SlimefunItemStack(SlimefunItems.STEEL_INGOT,8), new ItemStack (Material.IRON_INGOT,8  )}, new SlimefunItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT,8));
  //大马士革钢锭
  public static final AbstractItemRecipe RECIPE_STEEL_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.IRON_DUST,8), new SlimefunItemStack(SlimefunItems.CARBON,8), new ItemStack (Material.IRON_INGOT,8  )}, new SlimefunItemStack(SlimefunItems.STEEL_INGOT,8));
  //钢锭
  public static final AbstractItemRecipe RECIPE_BRONZE_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.TIN_DUST,8), new SlimefunItemStack(SlimefunItems.COPPER_INGOT,8), new SlimefunItemStack(SlimefunItems.COPPER_DUST,8  )}, new SlimefunItemStack(SlimefunItems.BRONZE_INGOT,8));
  //青铜锭
  public static final AbstractItemRecipe RECIPE_DURALUMIN_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,8), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,8), new SlimefunItemStack(SlimefunItems.COPPER_DUST,8  )}, new SlimefunItemStack(SlimefunItems.DURALUMIN_INGOT,8));
  //硬铝锭
  public static final AbstractItemRecipe RECIPE_BILLON_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.SILVER_INGOT,8), new SlimefunItemStack(SlimefunItems.SILVER_DUST,8), new SlimefunItemStack(SlimefunItems.COPPER_INGOT,8  )}, new SlimefunItemStack(SlimefunItems.BILLON_INGOT,8));
  //银铜合金锭
  public static final AbstractItemRecipe RECIPE_BRASS_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.ZINC_DUST,8), new SlimefunItemStack(SlimefunItems.COPPER_INGOT,8), new SlimefunItemStack(SlimefunItems.COPPER_DUST,8  )}, new SlimefunItemStack(SlimefunItems.BRASS_INGOT,8));
  //黄铜锭
  public static final AbstractItemRecipe RECIPE_ALUMINUM_BRASS_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,8), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,8), new SlimefunItemStack(SlimefunItems.BRASS_INGOT,8  )}, new SlimefunItemStack(SlimefunItems.ALUMINUM_BRASS_INGOT,8));
  //铝黄铜锭
  public static final AbstractItemRecipe RECIPE_ALUMINUM_BRONZE_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,8), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,8), new SlimefunItemStack(SlimefunItems.BRONZE_INGOT,8  )}, new SlimefunItemStack(SlimefunItems.ALUMINUM_BRONZE_INGOT,8));
  //铝青铜锭
  public static final AbstractItemRecipe RECIPE_CORINTHIAN_BRONZE_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_DUST,8), new SlimefunItemStack(SlimefunItems.SILVER_DUST,8), new SlimefunItemStack(SlimefunItems.COPPER_DUST,8), new SlimefunItemStack(SlimefunItems.BRONZE_INGOT,8  )}, new SlimefunItemStack(SlimefunItems.CORINTHIAN_BRONZE_INGOT,8));
  //科林斯青铜锭
  public static final AbstractItemRecipe RECIPE_SOLDER_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.TIN_DUST,8), new SlimefunItemStack(SlimefunItems.LEAD_DUST,8), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,8  )}, new SlimefunItemStack(SlimefunItems.SOLDER_INGOT,8));
  //焊锡锭
  public static final AbstractItemRecipe RECIPE_NICKEL_INGOT= new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.COPPER_DUST,8), new SlimefunItemStack(SlimefunItems.IRON_DUST,8), new ItemStack (Material.IRON_INGOT,8  )}, new SlimefunItemStack(SlimefunItems.NICKEL_INGOT,8));
  //镍锭
  public static final AbstractItemRecipe RECIPE_COBALT_INGOT  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.COPPER_DUST,8), new SlimefunItemStack(SlimefunItems.IRON_DUST,8), new SlimefunItemStack(SlimefunItems.NICKEL_INGOT,8  )}, new SlimefunItemStack(SlimefunItems.COBALT_INGOT,8));
  //钴锭
  public static final AbstractItemRecipe RECIPE_FERROSILICON  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.SILICON,8), new SlimefunItemStack(SlimefunItems.IRON_DUST,8), new ItemStack (Material.IRON_INGOT,8  )}, new SlimefunItemStack(SlimefunItems.FERROSILICON,8));
  //娃锭
  public static final AbstractItemRecipe RECIPE_GILDED_IRON  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_24K,8), new SlimefunItemStack(SlimefunItems.IRON_DUST,8)}, new SlimefunItemStack(SlimefunItems.GILDED_IRON,8));
  //镀金锭
  public static final AbstractItemRecipe RECIPE_GOLD_4K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_DUST,8),}, new SlimefunItemStack(SlimefunItems.GOLD_4K,8));
  //金锭（4K）
  public static final AbstractItemRecipe RECIPE_GOLD_6K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_4K,8), new SlimefunItemStack(SlimefunItems.GOLD_DUST,8)}, new SlimefunItemStack(SlimefunItems.GOLD_6K,8));
  //金锭（6K）
  public static final AbstractItemRecipe RECIPE_GOLD_8K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_6K,8), new SlimefunItemStack(SlimefunItems.GOLD_DUST,8)}, new SlimefunItemStack(SlimefunItems.GOLD_8K,8));
  //金锭（8K）
  public static final AbstractItemRecipe RECIPE_GOLD_10K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_8K,8), new SlimefunItemStack(SlimefunItems.GOLD_DUST,8)}, new SlimefunItemStack(SlimefunItems.GOLD_10K,8));
  //金锭（10K）
  public static final AbstractItemRecipe RECIPE_GOLD_12K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_10K,8), new SlimefunItemStack(SlimefunItems.GOLD_DUST,8)}, new SlimefunItemStack(SlimefunItems.GOLD_12K,8));
  //金锭（12K）
  public static final AbstractItemRecipe RECIPE_GOLD_14K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_12K,8), new SlimefunItemStack(SlimefunItems.GOLD_DUST,8)}, new SlimefunItemStack(SlimefunItems.GOLD_14K,8));
  //金锭（14K）
  public static final AbstractItemRecipe RECIPE_GOLD_16K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_14K,8), new SlimefunItemStack(SlimefunItems.GOLD_DUST,8)}, new SlimefunItemStack(SlimefunItems.GOLD_16K,8));
  //金锭（16K）
  public static final AbstractItemRecipe RECIPE_GOLD_18K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_16K,8), new SlimefunItemStack(SlimefunItems.GOLD_DUST,8)}, new SlimefunItemStack(SlimefunItems.GOLD_18K,8));
  //金锭（18K）
  public static final AbstractItemRecipe RECIPE_GOLD_20K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_18K,8), new SlimefunItemStack(SlimefunItems.GOLD_DUST,8)}, new SlimefunItemStack(SlimefunItems.GOLD_20K,8));
  //金锭（20K）
  public static final AbstractItemRecipe RECIPE_GOLD_22K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_20K,8), new SlimefunItemStack(SlimefunItems.GOLD_DUST,8)}, new SlimefunItemStack(SlimefunItems.GOLD_22K,8));
  //金锭（22K）
  public static final AbstractItemRecipe RECIPE_GOLD_24K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_22K,8), new SlimefunItemStack(SlimefunItems.GOLD_DUST,8)}, new SlimefunItemStack(SlimefunItems.GOLD_24K,8));
  //金锭（24K）
  public static final AbstractItemRecipe RECIPE_GREDSTONE_ALLOY  = new AbstractItemRecipe( new ItemStack[]{
          null, null, null, null, null,
          new ItemStack ( Material.REDSTONE,8),
          new ItemStack ( Material.REDSTONE_BLOCK,8),
          new SlimefunItemStack(SlimefunItems.HARDENED_METAL_INGOT,8),
          new SlimefunItemStack(SlimefunItems.FERROSILICON,8)},

          new SlimefunItemStack(SlimefunItems.REDSTONE_ALLOY,8));
  //红石合金锭

  public static final AbstractItemRecipe RECIPE_SYNTHETIC_SAPPHIRE  = new AbstractItemRecipe( new ItemStack[]{
          null, null, null, null,
          new ItemStack ( Material.LAPIS_LAZULI,8 ),
          new ItemStack ( Material.GLASS_PANE,8 ),
          new ItemStack ( Material.GLASS,8 ),
          new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,8),
          new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,8)},

          new SlimefunItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE,8));
  //人造蓝宝石

  public static final AbstractItemRecipe RECIPE_SYNTHETIC_EMERALD = new AbstractItemRecipe( new ItemStack[]{
          null, null, null, null,
          new SlimefunItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE,8 ),
          new ItemStack ( Material.GLASS_PANE,8 ),
          new ItemStack ( Material.GLASS,8 ),
          new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,8),
          new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,8)},

          new SlimefunItemStack(SlimefunItems.SYNTHETIC_EMERALD,8));
  //人造绿宝石
















  //public static final AbstractItemRecipe RECIPE_RUNE_AIR = new AbstractItemRecipe(
    //  new ItemStack[]{new ItemStack(Material.FEATHER), new ItemStack(SlimefunItems.MAGIC_LUMP_1),
     //     new ItemStack(Material.FEATHER), new ItemStack(Material.GHAST_TEAR), new ItemStack(SlimefunItems.BLANK_RUNE),
       //   new ItemStack(Material.GHAST_TEAR), new ItemStack(Material.FEATHER),
         // new ItemStack(SlimefunItems.MAGIC_LUMP_1), new ItemStack(Material.FEATHER)},
      // new SlimefunItemStack(SlimefunItems.AIR_RUNE, 4));


  public Chaojizhilianrolu(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_REINFORCED_ALLOY_INGOT);  //强化合金锭
    list.add(RECIPE_HARDENED_METAL_INGOT);  //硬化金属
    list.add(RECIPE_DAMASCUS_STEEL_INGOT);  //大马士革钢锭
    list.add(RECIPE_STEEL_INGOT);  //钢锭
    list.add(RECIPE_BRONZE_INGOT);  //青铜锭
    list.add(RECIPE_DURALUMIN_INGOT);  //硬铝锭
    list.add(RECIPE_BILLON_INGOT);  //银铜合金锭
    list.add(RECIPE_BRASS_INGOT); //黄铜锭
    list.add(RECIPE_ALUMINUM_BRASS_INGOT); //铝黄铜锭
    list.add(RECIPE_ALUMINUM_BRONZE_INGOT ); //铝青铜锭
    list.add(RECIPE_CORINTHIAN_BRONZE_INGOT ); //科林斯青铜锭
    list.add(RECIPE_SOLDER_INGOT ); //焊锡锭
    list.add(RECIPE_NICKEL_INGOT ); //镍锭
    list.add(RECIPE_COBALT_INGOT ); //钴锭
    list.add(RECIPE_FERROSILICON ); //娃锭
    list.add(RECIPE_GILDED_IRON ); //镀金锭
    list.add(RECIPE_GREDSTONE_ALLOY ); //红石合金锭
    list.add(RECIPE_SYNTHETIC_SAPPHIRE ); //人造蓝宝石
    list.add(RECIPE_SYNTHETIC_EMERALD );//人造绿宝石
    list.add(RECIPE_GOLD_4K); //金锭（4K）
    list.add(RECIPE_GOLD_6K); //金锭（6K）
    list.add(RECIPE_GOLD_8K); //金锭（8K）
    list.add(RECIPE_GOLD_10K); //金锭（10K）
    list.add(RECIPE_GOLD_12K); //金锭（12K）
    list.add(RECIPE_GOLD_14K); //金锭（14K）
    list.add(RECIPE_GOLD_16K); //金锭（16K）
    list.add(RECIPE_GOLD_18K); //金锭（18K）
    list.add(RECIPE_GOLD_20K); //金锭（20K）
    list.add(RECIPE_GOLD_22K); //金锭（22K）
    list.add(RECIPE_GOLD_24K); //金锭（24K）

    return list;
  }

}
