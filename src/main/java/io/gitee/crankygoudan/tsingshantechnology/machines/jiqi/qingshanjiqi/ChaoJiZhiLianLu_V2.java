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
public class ChaoJiZhiLianLu_V2 extends MediumContainerMachine {

  public static final SlimefunItemStack QS_CHAO_JI_ZHI_LIAN_LU_V2 = new SlimefunItemStack("QS_CHAO_JI_ZHI_LIAN_LU_V2", Material.SMOKER, Y.colorPseudorandomString("超级冶炼炉")+ " " + Y.colorPseudorandomString(" "),
          Y.colorPseudorandomString(" "),
          MachineLore.speed(32),
          MachineLore.energyBuffer(20000),
          MachineLore.energyPerSecond(7200));


  public static final ItemStack[] RECIPE_QS_CHAO_JI_ZHI_LIAN_LU_V2 = new ItemStack[]{
      ChaoJiZhiLianLu_V1.QS_CHAO_JI_ZHI_LIAN_LU_V1,  QingShanCaiLiao.QS_GANG_JIN_HE_XIN,  ChaoJiZhiLianLu_V1.QS_CHAO_JI_ZHI_LIAN_LU_V1,
      QingShanCaiLiao.QS_GANG_JIN_HE_XIN, ChaoJiZhiLianLu_V1.QS_CHAO_JI_ZHI_LIAN_LU_V1, QingShanCaiLiao.QS_GANG_JIN_HE_XIN,
      ChaoJiZhiLianLu_V1.QS_CHAO_JI_ZHI_LIAN_LU_V1, QingShanCaiLiao.QS_GANG_JIN_HE_XIN,  ChaoJiZhiLianLu_V1.QS_CHAO_JI_ZHI_LIAN_LU_V1
  };

  public static final AbstractItemRecipe RECIPE_REINFORCED_ALLOY_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, new SlimefunItemStack(SlimefunItems.HARDENED_METAL_INGOT,32), new SlimefunItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT,32), new SlimefunItemStack(SlimefunItems.CORINTHIAN_BRONZE_INGOT,32), new SlimefunItemStack(SlimefunItems.SOLDER_INGOT,32), new SlimefunItemStack(SlimefunItems.GOLD_24K,32), new SlimefunItemStack(SlimefunItems.BILLON_INGOT,32)}, new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT,32));
  //强化合金锭
  public static final AbstractItemRecipe RECIPE_HARDENED_METAL_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, new SlimefunItemStack(SlimefunItems.ALUMINUM_BRONZE_INGOT,32), new SlimefunItemStack(SlimefunItems.DURALUMIN_INGOT,32), new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON,32), new SlimefunItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT,32)}, new SlimefunItemStack(SlimefunItems.HARDENED_METAL_INGOT,32));
  //硬化金属
  public static final AbstractItemRecipe RECIPE_DAMASCUS_STEEL_INGOT  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null,null, new SlimefunItemStack(SlimefunItems.IRON_DUST,32), new SlimefunItemStack(SlimefunItems.CARBON,32), new SlimefunItemStack(SlimefunItems.STEEL_INGOT,32), new ItemStack (Material.IRON_INGOT,32  )}, new SlimefunItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT,32));
  //大马士革钢锭
  public static final AbstractItemRecipe RECIPE_STEEL_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.IRON_DUST,32), new SlimefunItemStack(SlimefunItems.CARBON,32), new ItemStack (Material.IRON_INGOT,32  )}, new SlimefunItemStack(SlimefunItems.STEEL_INGOT,32));
  //钢锭
  public static final AbstractItemRecipe RECIPE_BRONZE_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.TIN_DUST,32), new SlimefunItemStack(SlimefunItems.COPPER_INGOT,32), new SlimefunItemStack(SlimefunItems.COPPER_DUST,32  )}, new SlimefunItemStack(SlimefunItems.BRONZE_INGOT,32));
  //青铜锭
  public static final AbstractItemRecipe RECIPE_DURALUMIN_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,32), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,32), new SlimefunItemStack(SlimefunItems.COPPER_DUST,32  )}, new SlimefunItemStack(SlimefunItems.DURALUMIN_INGOT,32));
  //硬铝锭
  public static final AbstractItemRecipe RECIPE_BILLON_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null,
      new SlimefunItemStack(SlimefunItems.SILVER_INGOT,32),
      new SlimefunItemStack(SlimefunItems.SILVER_DUST,32),
      new SlimefunItemStack(SlimefunItems.COPPER_DUST,32  )},
      new SlimefunItemStack(SlimefunItems.BILLON_INGOT,32));
  //银铜合金锭
  public static final AbstractItemRecipe RECIPE_BRASS_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.ZINC_DUST,32), new SlimefunItemStack(SlimefunItems.COPPER_INGOT,32), new SlimefunItemStack(SlimefunItems.COPPER_DUST,32  )}, new SlimefunItemStack(SlimefunItems.BRASS_INGOT,32));
  //黄铜锭
  public static final AbstractItemRecipe RECIPE_ALUMINUM_BRASS_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,32), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,32), new SlimefunItemStack(SlimefunItems.BRASS_INGOT,32  )}, new SlimefunItemStack(SlimefunItems.ALUMINUM_BRASS_INGOT,32));
  //铝黄铜锭
  public static final AbstractItemRecipe RECIPE_ALUMINUM_BRONZE_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,32), new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,32), new SlimefunItemStack(SlimefunItems.BRONZE_INGOT,32  )}, new SlimefunItemStack(SlimefunItems.ALUMINUM_BRONZE_INGOT,32));
  //铝青铜锭
  public static final AbstractItemRecipe RECIPE_CORINTHIAN_BRONZE_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_DUST,32), new SlimefunItemStack(SlimefunItems.SILVER_DUST,32), new SlimefunItemStack(SlimefunItems.COPPER_DUST,32), new SlimefunItemStack(SlimefunItems.BRONZE_INGOT,32  )}, new SlimefunItemStack(SlimefunItems.CORINTHIAN_BRONZE_INGOT,32));
  //科林斯青铜锭
  public static final AbstractItemRecipe RECIPE_SOLDER_INGOT = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.TIN_DUST,32), new SlimefunItemStack(SlimefunItems.LEAD_DUST,32), new SlimefunItemStack(SlimefunItems.LEAD_INGOT,32  )}, new SlimefunItemStack(SlimefunItems.SOLDER_INGOT,32));
  //焊锡锭
  public static final AbstractItemRecipe RECIPE_NICKEL_INGOT= new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.COPPER_DUST,32), new SlimefunItemStack(SlimefunItems.IRON_DUST,32), new ItemStack (Material.IRON_INGOT,32  )}, new SlimefunItemStack(SlimefunItems.NICKEL_INGOT,32));
  //镍锭
  public static final AbstractItemRecipe RECIPE_COBALT_INGOT  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.COPPER_DUST,32), new SlimefunItemStack(SlimefunItems.IRON_DUST,32), new SlimefunItemStack(SlimefunItems.NICKEL_INGOT,32  )}, new SlimefunItemStack(SlimefunItems.COBALT_INGOT,32));
  //钴锭
  public static final AbstractItemRecipe RECIPE_FERROSILICON  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.SILICON,32), new SlimefunItemStack(SlimefunItems.IRON_DUST,32), new ItemStack (Material.IRON_INGOT,32  )}, new SlimefunItemStack(SlimefunItems.FERROSILICON,32));
  //娃锭
  public static final AbstractItemRecipe RECIPE_GILDED_IRON  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_24K,32), new SlimefunItemStack(SlimefunItems.IRON_DUST,32)}, new SlimefunItemStack(SlimefunItems.GILDED_IRON,32));
  //镀金锭
  public static final AbstractItemRecipe RECIPE_GOLD_4K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_DUST,32),}, new SlimefunItemStack(SlimefunItems.GOLD_4K,32));
  //金锭（4K）
  public static final AbstractItemRecipe RECIPE_GOLD_6K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_4K,32), new SlimefunItemStack(SlimefunItems.GOLD_DUST,32)}, new SlimefunItemStack(SlimefunItems.GOLD_6K,32));
  //金锭（6K）
  public static final AbstractItemRecipe RECIPE_GOLD_8K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_6K,32), new SlimefunItemStack(SlimefunItems.GOLD_DUST,32)}, new SlimefunItemStack(SlimefunItems.GOLD_8K,32));
  //金锭（8K）
  public static final AbstractItemRecipe RECIPE_GOLD_10K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_8K,32), new SlimefunItemStack(SlimefunItems.GOLD_DUST,32)}, new SlimefunItemStack(SlimefunItems.GOLD_10K,32));
  //金锭（10K）
  public static final AbstractItemRecipe RECIPE_GOLD_12K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_10K,32), new SlimefunItemStack(SlimefunItems.GOLD_DUST,32)}, new SlimefunItemStack(SlimefunItems.GOLD_12K,32));
  //金锭（12K）
  public static final AbstractItemRecipe RECIPE_GOLD_14K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_12K,32), new SlimefunItemStack(SlimefunItems.GOLD_DUST,32)}, new SlimefunItemStack(SlimefunItems.GOLD_14K,32));
  //金锭（14K）
  public static final AbstractItemRecipe RECIPE_GOLD_16K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_14K,32), new SlimefunItemStack(SlimefunItems.GOLD_DUST,32)}, new SlimefunItemStack(SlimefunItems.GOLD_16K,32));
  //金锭（16K）
  public static final AbstractItemRecipe RECIPE_GOLD_18K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_16K,32), new SlimefunItemStack(SlimefunItems.GOLD_DUST,32)}, new SlimefunItemStack(SlimefunItems.GOLD_18K,32));
  //金锭（18K）
  public static final AbstractItemRecipe RECIPE_GOLD_20K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_18K,32), new SlimefunItemStack(SlimefunItems.GOLD_DUST,32)}, new SlimefunItemStack(SlimefunItems.GOLD_20K,32));
  //金锭（20K）
  public static final AbstractItemRecipe RECIPE_GOLD_22K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_20K,32), new SlimefunItemStack(SlimefunItems.GOLD_DUST,32)}, new SlimefunItemStack(SlimefunItems.GOLD_22K,32));
  //金锭（22K）
  public static final AbstractItemRecipe RECIPE_GOLD_24K  = new AbstractItemRecipe( new ItemStack[]{null, null, null, null, null, null, null, new SlimefunItemStack(SlimefunItems.GOLD_22K,32), new SlimefunItemStack(SlimefunItems.GOLD_DUST,32)}, new SlimefunItemStack(SlimefunItems.GOLD_24K,32));
  //金锭（24K）
  public static final AbstractItemRecipe RECIPE_GREDSTONE_ALLOY  = new AbstractItemRecipe( new ItemStack[]{
          null, null, null, null, null,
          new ItemStack ( Material.REDSTONE,32),
          new ItemStack ( Material.REDSTONE_BLOCK,32),
          new SlimefunItemStack(SlimefunItems.HARDENED_METAL_INGOT,32),
          new SlimefunItemStack(SlimefunItems.FERROSILICON,32)},

          new SlimefunItemStack(SlimefunItems.REDSTONE_ALLOY,32));
  //红石合金锭

  public static final AbstractItemRecipe RECIPE_SYNTHETIC_SAPPHIRE  = new AbstractItemRecipe( new ItemStack[]{
          null, null, null, null,
          new ItemStack ( Material.LAPIS_LAZULI,32 ),
          new ItemStack ( Material.GLASS_PANE,32 ),
          new ItemStack ( Material.GLASS,32 ),
          new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,32),
          new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,32)},

          new SlimefunItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE,32));
  //人造蓝宝石

  public static final AbstractItemRecipe RECIPE_SYNTHETIC_EMERALD = new AbstractItemRecipe( new ItemStack[]{
          null, null, null, null, null,
          new SlimefunItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE,32 ),
          new ItemStack ( Material.GLASS_PANE,32 ),
          new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT,32),
          new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,32)},

          new SlimefunItemStack(SlimefunItems.SYNTHETIC_EMERALD,32));
  //人造绿宝石
    public static final AbstractItemRecipe RECIPE_RAW_CARBONADO = new AbstractItemRecipe( new ItemStack[]{
        null, null, null, null, null ,null,
        new ItemStack ( Material.GLASS_PANE,32 ),
        new SlimefunItemStack(SlimefunItems.SYNTHETIC_DIAMOND,32),
        new SlimefunItemStack(SlimefunItems.CARBON_CHUNK,32)},

        new SlimefunItemStack(SlimefunItems.RAW_CARBONADO,32));
    //黑金刚原矿

    public static final AbstractItemRecipe RECIPE_MAGNET = new AbstractItemRecipe( new ItemStack[]{
        null, null, null, null, null,
        new SlimefunItemStack(SlimefunItems.NICKEL_INGOT,32),
        new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST,32),
        new SlimefunItemStack(SlimefunItems.IRON_DUST,32),
        new SlimefunItemStack(SlimefunItems.COBALT_INGOT,32)},

        new SlimefunItemStack(SlimefunItems.MAGNET,32));
    //磁铁

    public static final AbstractItemRecipe RECIPE_SILICON = new AbstractItemRecipe( new ItemStack[]{
        null, null, null, null, null ,null,null,null,
        new ItemStack ( Material.QUARTZ_BLOCK,32)},

        new SlimefunItemStack(SlimefunItems.SILICON,32));
    //WA



  //public static final AbstractItemRecipe RECIPE_RUNE_AIR = new AbstractItemRecipe(
    //  new ItemStack[]{new ItemStack(Material.FEATHER), new ItemStack(SlimefunItems.MAGIC_LUMP_1),
     //     new ItemStack(Material.FEATHER), new ItemStack(Material.GHAST_TEAR), new ItemStack(SlimefunItems.BLANK_RUNE),
       //   new ItemStack(Material.GHAST_TEAR), new ItemStack(Material.FEATHER),
         // new ItemStack(SlimefunItems.MAGIC_LUMP_1), new ItemStack(Material.FEATHER)},
      // new SlimefunItemStack(SlimefunItems.AIR_RUNE, 4));


  public ChaoJiZhiLianLu_V2(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
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
      list.add(RECIPE_RAW_CARBONADO);//黑金刚原矿
      list.add(RECIPE_MAGNET);//磁铁
      list.add(RECIPE_SILICON);//WA
      return list;
  }

}
