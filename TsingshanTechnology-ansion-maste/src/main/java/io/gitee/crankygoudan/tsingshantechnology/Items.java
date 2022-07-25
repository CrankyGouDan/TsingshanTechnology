package io.gitee.crankygoudan.tsingshantechnology;

import io.gitee.crankygoudan.tsingshantechnology.gzt.Qingshan_gzt;
import io.gitee.crankygoudan.tsingshantechnology.items.wq.SoulCollector;
import io.gitee.crankygoudan.tsingshantechnology.jieko.Armor;
import io.gitee.crankygoudan.tsingshantechnology.resources.DragonScale;
import io.github.bakedlibs.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.CARGO_MANAGER;


public class Items {
    //机器

    //生物掉落
    public static final SlimefunItemStack QS_LONGJIAO = new SlimefunItemStack ( "QS_LONGJIAO ",
            Material.AMETHYST_SHARD, TextUtil.colorPseudorandomString("角"));

    //工具

    //青山工作台：装备
    public static final SlimefunItemStack QS_QSJ = new SlimefunItemStack( "QS_QSJ", Material.NETHERITE_SWORD,
            TextUtil.colorPseudorandomString("青山剑") + " " + TextUtil.colorPseudorandomString(" "),
            TextUtil.colorPseudorandomString("10倍经验加成"));
    public static final SlimefunItemStack QS_QPDP = new SlimefunItemStack( "QS_QPDP", Material.NETHERITE_SWORD,
            TextUtil.colorPseudorandomString("起泡刀片") + " " + TextUtil.colorPseudorandomString(" "),
            TextUtil.colorPseudorandomString("  "),
            LoreBuilder.radioactive(Radioactivity.VERY_DEADLY),
            LoreBuilder.HAZMAT_SUIT_REQUIRED);



    public static final SlimefunItemStack YMZG = new SlimefunItemStack( "QS_HELMET", Material.NETHERITE_HELMET,
            TextUtil.colorPseudorandomString("幽冥之冠") + " " + TextUtil.colorPseudorandomString(" "),
            TextUtil.colorPseudorandomString("吾主"),
            TextUtil.colorPseudorandomString("一统于天下..."),
            TextUtil.colorPseudorandomString("鬼可控否？"),
            TextUtil.colorPseudorandomString("答曰:否..."),
            TextUtil.colorPseudorandomString("满面疮痍"),
            TextUtil.colorPseudorandomString("未能止其步履"),
            TextUtil.colorPseudorandomString("囷囷而延"),
            TextUtil.colorPseudorandomString("夜视 I"),
            TextUtil.colorPseudorandomString("水下呼吸 I"));
    public static final SlimefunItemStack YMZK = new SlimefunItemStack ( "QS_CHEST", Material.NETHERITE_CHESTPLATE,
            TextUtil.colorPseudorandomString("幽冥之铠") + " " + TextUtil.colorPseudorandomString(" "),
            TextUtil.colorPseudorandomString("醉卧沙场君莫笑"),
            TextUtil.colorPseudorandomString("古来征战几人回"),
            TextUtil.colorPseudorandomString("力量 II"),
            TextUtil.colorPseudorandomString("抗性提升 II"),
            TextUtil.colorPseudorandomString("饱和 IV"));
    public static final SlimefunItemStack YMZHT = new SlimefunItemStack ( "QS_LEGGINGS", Material.NETHERITE_LEGGINGS,
            TextUtil.colorPseudorandomString("幽冥之裤") + " " + TextUtil.colorPseudorandomString(" "),
            TextUtil.colorPseudorandomString("鬼泣于黑暗"),
            TextUtil.colorPseudorandomString("魂出于於菟"),
            TextUtil.colorPseudorandomString("幸运 II"),
            TextUtil.colorPseudorandomString("生命恢复 II"),
            TextUtil.colorPseudorandomString( "急迫 III"));

    public static final SlimefunItemStack YMZX = new SlimefunItemStack ( "QS_BOOTS", Material.NETHERITE_BOOTS,
            TextUtil.colorPseudorandomString("幽冥之靴") + " " + TextUtil.colorPseudorandomString(" "),
            TextUtil.colorPseudorandomString("当天堂塌陷，地狱升起"),
            TextUtil.colorPseudorandomString("人间是否还会存在"),
            TextUtil.colorPseudorandomString("海豚的恩惠 III"),
            TextUtil.colorPseudorandomString("速度 I"),
            TextUtil.colorPseudorandomString("跳跃提升 III"),
            TextUtil.colorPseudorandomString("生命提升 I"));

    //青山工作台：装备附魔

    static {
        ItemMeta meta = QS_QPDP.getItemMeta ();
        meta.setUnbreakable ( true );
        QS_QPDP.setItemMeta ( meta );
        QS_QPDP.addUnsafeEnchantment(Enchantment.DAMAGE_ALL,15);
        QS_QPDP.addUnsafeEnchantment(Enchantment.FIRE_ASPECT,15);
        QS_QPDP.addUnsafeEnchantment(Enchantment.SWEEPING_EDGE,15);
        QS_QPDP.addUnsafeEnchantment(Enchantment.DURABILITY,15);
    }

    static {
        ItemMeta meta = YMZG.getItemMeta ();
        meta.setUnbreakable ( true );

        YMZG.setItemMeta ( meta );
        YMZG.addUnsafeEnchantment ( Enchantment.PROTECTION_ENVIRONMENTAL, 50 );
        YMZG.addUnsafeEnchantment ( Enchantment.THORNS, 30 );
        YMZG.addUnsafeEnchantment ( Enchantment.WATER_WORKER, 20 );

    }

    static {
        ItemMeta chestMeta = YMZK.getItemMeta ();
        chestMeta.setUnbreakable ( true );

        YMZK.setItemMeta ( chestMeta );
        YMZK.addUnsafeEnchantment ( Enchantment.PROTECTION_ENVIRONMENTAL, 50 );
        YMZK.addUnsafeEnchantment ( Enchantment.PROTECTION_EXPLOSIONS, 30 );
        YMZK.addUnsafeEnchantment ( Enchantment.THORNS, 20 );
    }

    static {
        ItemMeta legsMeta = YMZHT.getItemMeta ();
        legsMeta.setUnbreakable ( true );
        YMZHT.setItemMeta ( legsMeta );
        YMZHT.addUnsafeEnchantment ( Enchantment.PROTECTION_ENVIRONMENTAL, 50 );
        YMZHT.addUnsafeEnchantment ( Enchantment.PROTECTION_FIRE, 30 );
        YMZHT.addUnsafeEnchantment ( Enchantment.THORNS, 20 );
    }

    static {
        ItemMeta bootsMeta = YMZX.getItemMeta ();
        bootsMeta.setUnbreakable ( true );
        YMZX.setItemMeta ( bootsMeta );
        YMZX.addUnsafeEnchantment ( Enchantment.PROTECTION_ENVIRONMENTAL, 50 );
        YMZX.addUnsafeEnchantment ( Enchantment.PROTECTION_FALL, 30 );
        YMZX.addUnsafeEnchantment ( Enchantment.THORNS, 20 );
    }

    public static void setup(TsingshanTechnology qs) {

        new UnplaceableBlock (Categories.QS_ZBMS, QS_QPDP, Qingshan_gzt.TYPE, new ItemStack[]{
                null, null, null, null, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.BLISTERING_INGOT_3,
                null, null, null, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.PLUTONIUM, SlimefunItems.BLISTERING_INGOT_3,
                SlimefunItems.BLISTERING_INGOT_3, null, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.PLUTONIUM, SlimefunItems.BLISTERING_INGOT_3, null,
                SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.BOOSTED_URANIUM, SlimefunItems.PLUTONIUM, SlimefunItems.BLISTERING_INGOT_3, null, null,
                null, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.BOOSTED_URANIUM, null, null, null,
                SlimefunItems.BLISTERING_INGOT_3, null, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.BLISTERING_INGOT_3, null, null,
        }).register(qs);


        new SoulCollector (Categories.QS_ZBMS, QS_QSJ, Qingshan_gzt.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);

        //生物配方：
        new DragonScale ( Categories.QS_DLW, QS_LONGJIAO, RecipeType.MOB_DROP, new ItemStack[]{
                null, null, null,
                null, new CustomItemStack ( Material.ENDERMAN_SPAWN_EGG, "QS_DLW_J" ), null,
                null, null, null
        } ).register ( qs );

        //青山工作台配方：装备


        new Armor ( Categories.QS_ZBMS, YMZG, new PotionEffect[]{
                new PotionEffect ( PotionEffectType.NIGHT_VISION, 600, 0, false, false, false ),
                new PotionEffect ( PotionEffectType.CONDUIT_POWER, 600, 0, false, false, false ),
                new PotionEffect ( PotionEffectType.WATER_BREATHING, 600, 0, false, false, false ),
        }, new ItemStack[]{
                null, QS_LONGJIAO, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }, new Particle[]{Particle.HEART} ).register ( qs );

        new Armor ( Categories.QS_ZBMS, YMZK, new PotionEffect[]{
                new PotionEffect ( PotionEffectType.INCREASE_DAMAGE, 600, 1, false, false, false ),
                new PotionEffect ( PotionEffectType.DAMAGE_RESISTANCE, 600, 1, false, false, false ),
                new PotionEffect ( PotionEffectType.SATURATION, 600, 3, false, false, false ),
        }, new ItemStack[]{
                null, null, null, null, null, null,
                QS_LONGJIAO, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }, new Particle[]{Particle.HEART} ).register ( qs );

        new Armor ( Categories.QS_ZBMS, YMZHT, new PotionEffect[]{
                new PotionEffect ( PotionEffectType.FAST_DIGGING, 600, 2, false, false, false ),
                new PotionEffect ( PotionEffectType.REGENERATION, 600, 1, false, false, false ),
                new PotionEffect ( PotionEffectType.LUCK, 600, 1, false, false, false ),
        }, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                QS_LONGJIAO, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }, new Particle[]{Particle.HEART} ).register ( qs );
        new Armor ( Categories.QS_ZBMS,YMZX, new PotionEffect[]{
                new PotionEffect ( PotionEffectType.SPEED, 600, 0, false, false, false ),
                new PotionEffect ( PotionEffectType.JUMP, 600, 2, false, false, false ),
                new PotionEffect ( PotionEffectType.DOLPHINS_GRACE, 600, 2, false, false, false ),
                new PotionEffect ( PotionEffectType.HEALTH_BOOST, 600, 0, false, false, false ),
        }, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                QS_LONGJIAO, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }, new Particle[]{Particle.HEART} ).register ( qs );
    }

    @Nullable
    private static ItemStack getItem(@Nonnull String id) {
        SlimefunItem item = SlimefunItem.getById ( id );
        return item != null ? item.getItem () : null;
    }
}
