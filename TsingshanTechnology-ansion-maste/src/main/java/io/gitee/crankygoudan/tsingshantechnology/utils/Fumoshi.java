package io.gitee.crankygoudan.tsingshantechnology.utils;

import io.gitee.crankygoudan.tsingshantechnology.Categories;
import io.gitee.crankygoudan.tsingshantechnology.TextUtil;
import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.gzt.Qingshan_fmx;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

import java.util.Objects;


public class Fumoshi {
    
    //锋利
    public static final SlimefunItemStack QS_FMS_FL_V1 = new SlimefunItemStack ( "QS_FMS_FL_V1", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("锋利LV1") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("增加对所有目标的伤害"));
    public static final SlimefunItemStack QS_FMS_FL_V2 = new SlimefunItemStack ( "QS_FMS_FL_V2", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("锋利LV2") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("增加对所有目标的伤害"));
    public static final SlimefunItemStack QS_FMS_FL_V3 = new SlimefunItemStack ( "QS_FMS_FL_V3", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("锋利LV3") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("增加对所有目标的伤害"));
    public static final SlimefunItemStack QS_FMS_FL_V4 = new SlimefunItemStack ( "QS_FMS_FL_V4", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("锋利LV4") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("增加对所有目标的伤害"));
    public static final SlimefunItemStack QS_FMS_FL_V5 = new SlimefunItemStack ( "QS_FMS_FL_V5", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("锋利LV5") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("增加对所有目标的伤害"));
    //亡灵
    public static final SlimefunItemStack QS_FMS_WL_V1 = new SlimefunItemStack ( "QS_FMS_WL_V1", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("亡灵杀手LV1") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("增加对不死目标的伤害"));
    public static final SlimefunItemStack QS_FMS_WL_V2 = new SlimefunItemStack ( "QS_FMS_WL_V2", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("亡灵杀手LV2") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("增加对不死目标的伤害"));
    public static final SlimefunItemStack QS_FMS_WL_V3 = new SlimefunItemStack ( "QS_FMS_WL_V3", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("亡灵杀手LV3") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("增加对不死目标的伤害"));
    public static final SlimefunItemStack QS_FMS_WL_V4 = new SlimefunItemStack ( "QS_FMS_WL_V4", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("亡灵杀手LV4") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("增加对不死目标的伤害"));
    public static final SlimefunItemStack QS_FMS_WL_V5 = new SlimefunItemStack ( "QS_FMS_WL_V5", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("亡灵杀手LV5") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("增加对不死目标的伤害"));

    //节肢杀手
    public static final SlimefunItemStack QS_FMS_JZ_V1 = new SlimefunItemStack ( "QS_FMS_JZ_V1", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("节肢杀手LV1") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("增加对节肢动物目标的伤害"));
    public static final SlimefunItemStack QS_FMS_JZ_V2 = new SlimefunItemStack ( "QS_FMS_JZ_V2", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("节肢杀手LV2") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("增加对节肢动物目标的伤害"));
    public static final SlimefunItemStack QS_FMS_JZ_V3 = new SlimefunItemStack ( "QS_FMS_JZ_V3", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("节肢杀手LV3") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("增加对节肢动物目标的伤害"));
    public static final SlimefunItemStack QS_FMS_JZ_V4 = new SlimefunItemStack ( "QS_FMS_JZ_V4", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("节肢杀手LV4") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("增加对节肢动物目标的伤害"));
    public static final SlimefunItemStack QS_FMS_JZ_V5 = new SlimefunItemStack ( "QS_FMS_JZ_V5", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("节肢杀手LV5") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("增加对节肢动物目标的伤害"));

    //效率
    public static final SlimefunItemStack QS_FMS_XL_V1 = new SlimefunItemStack ( "QS_FMS_XL_V1", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("效率LV1") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("提高你挖掘/挖掘的速度"));
    public static final SlimefunItemStack QS_FMS_XL_V2 = new SlimefunItemStack ( "QS_FMS_XL_V2", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("效率LV2") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("提高你挖掘/挖掘的速度"));
    public static final SlimefunItemStack QS_FMS_XL_V3 = new SlimefunItemStack ( "QS_FMS_XL_V3", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("效率LV3") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("提高你挖掘/挖掘的速度"));
    public static final SlimefunItemStack QS_FMS_XL_V4 = new SlimefunItemStack ( "QS_FMS_XL_V4", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("效率LV4") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("提高你挖掘/挖掘的速度"));
    public static final SlimefunItemStack QS_FMS_XL_V5 = new SlimefunItemStack ( "QS_FMS_XL_V5", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("效率LV5") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("提高你挖掘/挖掘的速度"));

    //火焰附加
    public static final SlimefunItemStack QS_FMS_HYFJ_V1 = new SlimefunItemStack ( "QS_FMS_HYFJ_V1", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("火焰附加LV1") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("攻击目标时，有几率将其点燃"));
    public static final SlimefunItemStack QS_FMS_HYFJ_V2 = new SlimefunItemStack ( "QS_FMS_HYFJ_V2", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("火焰附加LV2") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("攻击目标时，有几率将其点燃"));
    public static final SlimefunItemStack QS_FMS_HYFJ_V3 = new SlimefunItemStack ( "QS_FMS_HYFJ_V3", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("火焰附加LV3") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("攻击目标时，有几率将其点燃"));
    public static final SlimefunItemStack QS_FMS_HYFJ_V4 = new SlimefunItemStack ( "QS_FMS_HYFJ_V4", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("火焰附加LV4") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("攻击目标时，有几率将其点燃"));
    public static final SlimefunItemStack QS_FMS_HYFJ_V5 = new SlimefunItemStack ( "QS_FMS_HYFJ_V5", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("火焰附加LV5") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("攻击目标时，有几率将其点燃"));

    //力量
    public static final SlimefunItemStack QS_FMS_LL_V1 = new SlimefunItemStack ( "QS_FMS_LL_V1", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("力量LV1") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("从弓箭射箭时提供额外伤害"));
    public static final SlimefunItemStack QS_FMS_LL_V2 = new SlimefunItemStack ( "QS_FMS_LL_V2", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("力量LV2") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("从弓箭射箭时提供额外伤害"));
    public static final SlimefunItemStack QS_FMS_LL_V3 = new SlimefunItemStack ( "QS_FMS_LL_V3", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("力量LV3") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("从弓箭射箭时提供额外伤害"));
    public static final SlimefunItemStack QS_FMS_LL_V4 = new SlimefunItemStack ( "QS_FMS_LL_V4", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("力量LV4") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("从弓箭射箭时提供额外伤害"));
    public static final SlimefunItemStack QS_FMS_LL_V5 = new SlimefunItemStack ( "QS_FMS_LL_V5", Material.ENCHANTED_BOOK, TextUtil.colorPseudorandomString("力量LV5") + " " + TextUtil.colorPseudorandomString("附魔石"), TextUtil.colorPseudorandomString("从弓箭射箭时提供额外伤害"));



    public static void setup(TsingshanTechnology qs) {

     //锋利
     EnchantmentStorageMeta storageMeta = (EnchantmentStorageMeta) QS_FMS_FL_V1.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DAMAGE_ALL, 10, true);QS_FMS_FL_V1.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_FL_V2.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DAMAGE_ALL, 15, true);QS_FMS_FL_V2.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_FL_V3.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DAMAGE_ALL, 20, true);QS_FMS_FL_V3.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_FL_V4.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DAMAGE_ALL, 25, true);QS_FMS_FL_V4.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_FL_V5.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DAMAGE_ALL, 30, true);QS_FMS_FL_V5.setItemMeta(storageMeta);
     //杀手
        storageMeta = (EnchantmentStorageMeta) QS_FMS_WL_V1.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DAMAGE_UNDEAD, 10, true);QS_FMS_WL_V1.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_WL_V2.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DAMAGE_UNDEAD, 15, true);QS_FMS_WL_V2.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_WL_V3.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DAMAGE_UNDEAD, 20, true);QS_FMS_WL_V3.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_WL_V4.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DAMAGE_UNDEAD, 25, true);QS_FMS_WL_V4.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_WL_V5.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DAMAGE_UNDEAD, 30, true);QS_FMS_WL_V5.setItemMeta(storageMeta);

     //节肢杀手
        storageMeta = (EnchantmentStorageMeta) QS_FMS_JZ_V1.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 10, true);QS_FMS_JZ_V1.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_JZ_V2.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 15, true);QS_FMS_JZ_V2.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_JZ_V3.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 20, true);QS_FMS_JZ_V3.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_JZ_V4.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 25, true);QS_FMS_JZ_V4.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_JZ_V5.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DAMAGE_ARTHROPODS, 30, true);QS_FMS_JZ_V5.setItemMeta(storageMeta);

      //效率
        storageMeta = (EnchantmentStorageMeta) QS_FMS_XL_V1.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DIG_SPEED, 10, true);QS_FMS_XL_V1.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_XL_V2.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DIG_SPEED, 15, true);QS_FMS_XL_V2.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_XL_V3.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DIG_SPEED, 20, true);QS_FMS_XL_V3.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_XL_V4.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DIG_SPEED, 25, true);QS_FMS_XL_V4.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_XL_V5.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.DIG_SPEED, 30, true);QS_FMS_XL_V5.setItemMeta(storageMeta);

     //火焰附加
        storageMeta = (EnchantmentStorageMeta) QS_FMS_HYFJ_V1.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.FIRE_ASPECT, 10, true);QS_FMS_HYFJ_V1.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_HYFJ_V2.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.FIRE_ASPECT, 15, true);QS_FMS_HYFJ_V2.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_HYFJ_V3.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.FIRE_ASPECT, 20, true);QS_FMS_HYFJ_V3.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_HYFJ_V4.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.FIRE_ASPECT, 25, true);QS_FMS_HYFJ_V4.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_HYFJ_V5.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.FIRE_ASPECT, 30, true);QS_FMS_HYFJ_V5.setItemMeta(storageMeta);

     //力量
        storageMeta = (EnchantmentStorageMeta) QS_FMS_LL_V1.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.ARROW_DAMAGE, 10, true);QS_FMS_LL_V1.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_LL_V2.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.ARROW_DAMAGE, 15, true);QS_FMS_LL_V2.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_LL_V3.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.ARROW_DAMAGE, 20, true);QS_FMS_LL_V3.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_LL_V4.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.ARROW_DAMAGE, 25, true);QS_FMS_LL_V4.setItemMeta(storageMeta);
        storageMeta = (EnchantmentStorageMeta) QS_FMS_LL_V5.getItemMeta();Objects.requireNonNull(storageMeta).addStoredEnchant(Enchantment.ARROW_DAMAGE, 30, true);QS_FMS_LL_V5.setItemMeta(storageMeta);




        //锋利
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_FL_V1, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_FL_V2, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_FL_V3, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_FL_V4, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_FL_V5, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);

        //亡灵杀手
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_WL_V1, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_WL_V2, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_WL_V3, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_WL_V4, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_WL_V5, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);

        //节肢杀手
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_JZ_V1, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_JZ_V2, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_JZ_V3, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_JZ_V4, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_JZ_V5, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);

        //效率
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_XL_V1, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_XL_V2, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_XL_V3, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_XL_V4, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_XL_V5, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        //火焰附加
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_HYFJ_V1, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_HYFJ_V2, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_HYFJ_V3, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_HYFJ_V4, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_HYFJ_V5, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        //力量
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_LL_V1, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_LL_V2, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_LL_V3, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_LL_V4, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
        new UnplaceableBlock ( Categories.QS_ZBMS_FMS, QS_FMS_LL_V5, Qingshan_fmx.TYPE, new ItemStack[]{
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
                null, null, null, null, null, null,
        }).register(qs);
    }
}
