package io.gitee.crankygoudan.tsingshantechnology.machines.jiqi.qingshanjiqi;

import java.util.ArrayList;
import java.util.List;

import com.github.relativobr.machine.MediumContainerMachine;
import com.github.relativobr.recipe.AbstractItemRecipe;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.springframework.scheduling.annotation.Async;

import io.gitee.crankygoudan.tsingshantechnology.utils.Y;
import io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanCaiLiao;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

@Async
public class ChaoJiZhiLianLu_V0 extends MediumContainerMachine {

  public static final SlimefunItemStack QS_CHAO_JI_ZHI_LIAN_LU_V0 = new SlimefunItemStack("QS_CHAO_JI_ZHI_LIAN_LU_V0", Material.CAULDRON, Y.colorPseudorandomString("超级冶炼炉")+ " " + Y.colorPseudorandomString(" "),
          Y.colorPseudorandomString(" "),
          MachineLore.speed(2),
          MachineLore.energyBuffer(300),
          MachineLore.energyPerSecond(128));

    //public static final ItemStack[] RECIPE_QS_CHAO_JI_ZHI_LIAN_LU_V0 = new ItemStack[]{
        //QingShanCaiLiao.QS_QIANG_HUA_BAN, SlimefunItems.POWER_CRYSTAL, QingShanCaiLiao.QS_QIANG_HUA_BAN,
       // SlimefunItems.HEATING_COIL,SlimefunItems.ELECTRIC_INGOT_FACTORY_3,SlimefunItems.HEATING_COIL,
     //   QingShanCaiLiao.QS_QIANG_HUA_DIN, SlimefunItems.ELECTRIC_MOTOR, QingShanCaiLiao.QS_QIANG_HUA_DIN
   // };
    public static final ItemStack[] RECIPE_QS_CHAO_JI_ZHI_LIAN_LU_V0 = new ItemStack[]{
        SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.POWER_CRYSTAL, SlimefunItems.DAMASCUS_STEEL_INGOT,
        SlimefunItems.HEATING_COIL,SlimefunItems.ELECTRIC_INGOT_FACTORY_3,SlimefunItems.HEATING_COIL,
        SlimefunItems.GILDED_IRON, SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.GILDED_IRON
    };
    public static final AbstractItemRecipe RECIPE_QIANG_HUA_DIN = new AbstractItemRecipe( new ItemStack[]{
        new SlimefunItemStack(SlimefunItems.PLUTONIUM,2), new SlimefunItemStack(SlimefunItems.REDSTONE_ALLOY,2),new SlimefunItemStack(SlimefunItems.URANIUM,2),
        new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT_3,2), new SlimefunItemStack(SlimefunItems.CARBONADO,2),new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT,2),
        new SlimefunItemStack(SlimefunItems.HARDENED_METAL_INGOT,2), new SlimefunItemStack(SlimefunItems.GOLD_22K,2),new SlimefunItemStack(SlimefunItems.NEPTUNIUM,2),
    },
        new SlimefunItemStack( QingShanCaiLiao.QS_QIANG_HUA_DIN,2));
    //强化锭
  public static final AbstractItemRecipe RECIPE_REINFORCED_ALLOY_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, new SlimefunItemStack(SlimefunItems.HARDENED_METAL_INGOT,2), new SlimefunItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT,2), new SlimefunItemStack(SlimefunItems.CORINTHIAN_BRONZE_INGOT,2), new SlimefunItemStack(SlimefunItems.SOLDER_INGOT,2), new SlimefunItemStack(SlimefunItems.GOLD_24K,2), new SlimefunItemStack(SlimefunItems.BILLON_INGOT,2)}, new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT,2));
  //强化合金锭
  public static final AbstractItemRecipe RECIPE_HARDENED_METAL_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, new SlimefunItemStack(SlimefunItems.ALUMINUM_BRONZE_INGOT,2), new SlimefunItemStack(SlimefunItems.DURALUMIN_INGOT,2), new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,2), new SlimefunItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT,2)}, new SlimefunItemStack(SlimefunItems.HARDENED_METAL_INGOT,2));
  //硬化金属
  public static final AbstractItemRecipe RECIPE_DAMASCUS_STEEL_INGOT  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null,null, new SlimefunItemStack(SlimefunItems.IRON_DUST,2), new SlimefunItemStack(SlimefunItems.CARBON,2), new SlimefunItemStack(SlimefunItems.STEEL_INGOT,2), new ItemStack (Material.IRON_INGOT,2  )}, new SlimefunItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT,2));
  //大马士革钢锭
  public static final AbstractItemRecipe RECIPE_STEEL_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.IRON_DUST,2), new SlimefunItemStack(SlimefunItems.CARBON,2), new ItemStack (Material.IRON_INGOT,2  )}, new SlimefunItemStack(SlimefunItems.STEEL_INGOT,2));
  //钢锭
  public static final AbstractItemRecipe RECIPE_BRONZE_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.TIN_DUST,2), new SlimefunItemStack(SlimefunItems.COPPER_INGOT,2), new SlimefunItemStack(SlimefunItems.COPPER_DUST,2  )}, new SlimefunItemStack(SlimefunItems.BRONZE_INGOT,2));
  //青铜锭
  public static final AbstractItemRecipe RECIPE_DURALUMIN_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,2), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,2), new SlimefunItemStack(SlimefunItems.COPPER_DUST,2  )}, new SlimefunItemStack(SlimefunItems.DURALUMIN_INGOT,2));
  //硬铝锭
  public static final AbstractItemRecipe RECIPE_BILLON_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null,
      new SlimefunItemStack(SlimefunItems.SILVER_INGOT,2),
      new SlimefunItemStack(SlimefunItems.SILVER_DUST,2),
      new SlimefunItemStack(SlimefunItems.COPPER_DUST,2  )},
      new SlimefunItemStack(SlimefunItems.BILLON_INGOT,2));
  //银铜合金锭
  public static final AbstractItemRecipe RECIPE_BRASS_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.ZINC_DUST,2), new SlimefunItemStack(SlimefunItems.COPPER_INGOT,2), new SlimefunItemStack(SlimefunItems.COPPER_DUST,2  )}, new SlimefunItemStack(SlimefunItems.BRASS_INGOT,2));
  //黄铜锭
  public static final AbstractItemRecipe RECIPE_ALUMINUM_BRASS_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,2), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,2), new SlimefunItemStack(SlimefunItems.BRASS_INGOT,2  )}, new SlimefunItemStack(SlimefunItems.ALUMINUM_BRASS_INGOT,2));
  //铝黄铜锭
  public static final AbstractItemRecipe RECIPE_ALUMINUM_BRONZE_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,2), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,2), new SlimefunItemStack(SlimefunItems.BRONZE_INGOT,2  )}, new SlimefunItemStack(SlimefunItems.ALUMINUM_BRONZE_INGOT,2));
  //铝青铜锭
  public static final AbstractItemRecipe RECIPE_CORINTHIAN_BRONZE_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_DUST,2), new SlimefunItemStack(SlimefunItems.SILVER_DUST,2), new SlimefunItemStack(SlimefunItems.COPPER_DUST,2), new SlimefunItemStack(SlimefunItems.BRONZE_INGOT,2  )}, new SlimefunItemStack(SlimefunItems.CORINTHIAN_BRONZE_INGOT,2));
  //科林斯青铜锭
  public static final AbstractItemRecipe RECIPE_SOLDER_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.TIN_DUST,2), new SlimefunItemStack(SlimefunItems.LEAD_DUST,2), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,2  )}, new SlimefunItemStack(SlimefunItems.SOLDER_INGOT,2));
  //焊锡锭
  public static final AbstractItemRecipe RECIPE_NICKEL_INGOT= new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.COPPER_DUST,2), new SlimefunItemStack(SlimefunItems.IRON_DUST,2), new ItemStack (Material.IRON_INGOT,2  )}, new SlimefunItemStack(SlimefunItems.NICKEL_INGOT,2));
  //镍锭
  public static final AbstractItemRecipe RECIPE_COBALT_INGOT  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.COPPER_DUST,2), new SlimefunItemStack(SlimefunItems.IRON_DUST,2), new SlimefunItemStack(SlimefunItems.NICKEL_INGOT,2  )}, new SlimefunItemStack(SlimefunItems.COBALT_INGOT,2));
  //钴锭
  public static final AbstractItemRecipe RECIPE_FERROSILICON  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.SILICON,2), new SlimefunItemStack(SlimefunItems.IRON_DUST,2), new ItemStack (Material.IRON_INGOT,2  )}, new SlimefunItemStack(SlimefunItems.FERROSILICON,2));
  //娃锭
  public static final AbstractItemRecipe RECIPE_GILDED_IRON  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_24K,2), new SlimefunItemStack(SlimefunItems.IRON_DUST,2)}, new SlimefunItemStack(SlimefunItems.GILDED_IRON,2));
  //镀金锭
  public static final AbstractItemRecipe RECIPE_GOLD_4K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_DUST,2),}, new SlimefunItemStack(SlimefunItems.GOLD_4K,2));
  //金锭（4K）
  public static final AbstractItemRecipe RECIPE_GOLD_6K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_4K,2), new SlimefunItemStack(SlimefunItems.GOLD_DUST,2)}, new SlimefunItemStack(SlimefunItems.GOLD_6K,2));
  //金锭（6K）
  public static final AbstractItemRecipe RECIPE_GOLD_8K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_6K,2), new SlimefunItemStack(SlimefunItems.GOLD_DUST,2)}, new SlimefunItemStack(SlimefunItems.GOLD_8K,2));
  //金锭（8K）
  public static final AbstractItemRecipe RECIPE_GOLD_10K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_8K,2), new SlimefunItemStack(SlimefunItems.GOLD_DUST,2)}, new SlimefunItemStack(SlimefunItems.GOLD_10K,2));
  //金锭（10K）
  public static final AbstractItemRecipe RECIPE_GOLD_12K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_10K,2), new SlimefunItemStack(SlimefunItems.GOLD_DUST,2)}, new SlimefunItemStack(SlimefunItems.GOLD_12K,2));
  //金锭（12K）
  public static final AbstractItemRecipe RECIPE_GOLD_14K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_12K,2), new SlimefunItemStack(SlimefunItems.GOLD_DUST,2)}, new SlimefunItemStack(SlimefunItems.GOLD_14K,2));
  //金锭（14K）
  public static final AbstractItemRecipe RECIPE_GOLD_16K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_14K,2), new SlimefunItemStack(SlimefunItems.GOLD_DUST,2)}, new SlimefunItemStack(SlimefunItems.GOLD_16K,2));
  //金锭（16K）
  public static final AbstractItemRecipe RECIPE_GOLD_18K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_16K,2), new SlimefunItemStack(SlimefunItems.GOLD_DUST,2)}, new SlimefunItemStack(SlimefunItems.GOLD_18K,2));
  //金锭（18K）
  public static final AbstractItemRecipe RECIPE_GOLD_20K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_18K,2), new SlimefunItemStack(SlimefunItems.GOLD_DUST,2)}, new SlimefunItemStack(SlimefunItems.GOLD_20K,2));
  //金锭（20K）
  public static final AbstractItemRecipe RECIPE_GOLD_22K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_20K,2), new SlimefunItemStack(SlimefunItems.GOLD_DUST,2)}, new SlimefunItemStack(SlimefunItems.GOLD_22K,2));
  //金锭（22K）
  public static final AbstractItemRecipe RECIPE_GOLD_24K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_22K,2), new SlimefunItemStack(SlimefunItems.GOLD_DUST,2)}, new SlimefunItemStack(SlimefunItems.GOLD_24K,2));
  //金锭（24K）
  public static final AbstractItemRecipe RECIPE_GREDSTONE_ALLOY  = new AbstractItemRecipe( new ItemStack[]{
          null, null, null, null, null,
          new ItemStack ( Material.REDSTONE,2),
          new ItemStack ( Material.REDSTONE_BLOCK,2),
          new SlimefunItemStack(SlimefunItems.HARDENED_METAL_INGOT,2),
          new SlimefunItemStack(SlimefunItems.FERROSILICON,2)},

          new SlimefunItemStack(SlimefunItems.REDSTONE_ALLOY,2));
  //红石合金锭

  public static final AbstractItemRecipe RECIPE_SYNTHETIC_SAPPHIRE  = new AbstractItemRecipe( new ItemStack[]{
          null, null, null, null,
          new ItemStack ( Material.LAPIS_LAZULI,2 ),
          new ItemStack ( Material.GLASS_PANE,2 ),
          new ItemStack ( Material.GLASS,2 ),
          new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,2),
          new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,2)},

          new SlimefunItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE,2));
  //人造蓝宝石

  public static final AbstractItemRecipe RECIPE_SYNTHETIC_EMERALD = new AbstractItemRecipe( new ItemStack[]{
          null, null, null, null, null,
          new SlimefunItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE,2 ),
          new ItemStack ( Material.GLASS_PANE,2 ),
          new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,2),
          new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,2)},

          new SlimefunItemStack(SlimefunItems.SYNTHETIC_EMERALD,2));
  //人造绿宝石
    public static final AbstractItemRecipe RECIPE_RAW_CARBONADO = new AbstractItemRecipe( new ItemStack[]{
        null, null, null, null, null ,null,
        new ItemStack ( Material.GLASS_PANE,2 ),
        new SlimefunItemStack(SlimefunItems.SYNTHETIC_DIAMOND,2),
        new SlimefunItemStack(SlimefunItems.CARBON_CHUNK,2)},

        new SlimefunItemStack(SlimefunItems.RAW_CARBONADO,2));
    //黑金刚原矿

    public static final AbstractItemRecipe RECIPE_MAGNET = new AbstractItemRecipe( new ItemStack[]{
        null, null, null, null, null,
        new SlimefunItemStack(SlimefunItems.NICKEL_INGOT,2),
        new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,2),
        new SlimefunItemStack(SlimefunItems.IRON_DUST,2),
        new SlimefunItemStack(SlimefunItems.COBALT_INGOT,2)},

        new SlimefunItemStack(SlimefunItems.MAGNET,2));
    //磁铁

    public static final AbstractItemRecipe RECIPE_SILICON = new AbstractItemRecipe( new ItemStack[]{
        null, null, null, null, null ,null,null,null,
        new ItemStack ( Material.QUARTZ_BLOCK,2)},

        new SlimefunItemStack(SlimefunItems.SILICON,2));
    //WA



  //public static final AbstractItemRecipe RECIPE_RUNE_AIR = new AbstractItemRecipe(
    //  new ItemStack[]{new ItemStack(Material.FEATHER), new ItemStack(SlimefunItems.MAGIC_LUMP_1),
     //     new ItemStack(Material.FEATHER), new ItemStack(Material.GHAST_TEAR), new ItemStack(SlimefunItems.BLANK_RUNE),
       //   new ItemStack(Material.GHAST_TEAR), new ItemStack(Material.FEATHER),
         // new ItemStack(SlimefunItems.MAGIC_LUMP_1), new ItemStack(Material.FEATHER)},
      // new SlimefunItemStack(SlimefunItems.AIR_RUNE, 4));


  public ChaoJiZhiLianLu_V0(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_QIANG_HUA_DIN);  //强化锭
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
      list.add(RECIPE_RAW_CARBONADO);//黑金刚原矿
      list.add(RECIPE_MAGNET);//磁铁
      list.add(RECIPE_SILICON);//WA
      return list;
  }

}
