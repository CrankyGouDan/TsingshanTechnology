package io.gitee.crankygoudan.tsingshantechnology.machines.jiqi.qingshanjiqi;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.gitee.crankygoudan.tsingshantechnology.machines.jiqiMoBan.XiPiaMoBan;
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

import static io.gitee.crankygoudan.tsingshantechnology.zhuceleibiao.cailiaozhuce.QingShanXinPia.*;


public class XiPiaJiHuoQi_V1 extends XiPiaMoBan implements RecipeDisplayItem {

    public XiPiaJiHuoQi_V1(ItemGroup category, SlimefunItemStack item, RecipeType type, ItemStack[] recipe) {
        super(category, item, type, recipe);
    }

    public void registerDefaultRecipes() {
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_13, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.WITHER_PROOF_OBSIDIAN,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_10, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.COPPER_WIRE,16 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_11, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,32 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_6, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems. REINFORCED_CLOTH,4 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_15, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.WITHER_PROOF_GLASS,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_18, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.RAG,4 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_19, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BANDAGE,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_20, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.SPLINT,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_43, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.KELP_COOKIE,4 )});


        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_1, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ADVANCED_CIRCUIT_BOARD,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_2, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BATTERY,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_3, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.STEEL_THRUSTER,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_4, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.POWER_CRYSTAL,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_5, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.SOLAR_PANEL,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_7, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ELECTRO_MAGNET,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_8, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ELECTRIC_MOTOR,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_9, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.HEATING_COIL,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_12, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.COOLING_UNIT,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_14, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ANDROID_MEMORY_CORE,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_16, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.PORTABLE_CRAFTER,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_17, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.PORTABLE_DUSTBIN,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_21, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.VITAMINS,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_22, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MEDICINE,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_23, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BACKPACK_SMALL,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_24, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BACKPACK_MEDIUM,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_25, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BACKPACK_LARGE,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_26, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.WOVEN_BACKPACK,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_27, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GILDED_BACKPACK,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_28, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.RADIANT_BACKPACK,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_29, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.COOLER,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_30, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.TAPE_MEASURE,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_31, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GOLD_PAN,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_32, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.NETHER_GOLD_PAN,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_33, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GRAPPLING_HOOK,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_34, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.CARBON_CHUNK,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_35, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.FORTUNE_COOKIE,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_36, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.DIET_COOKIE,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_37, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BEEF_JERKY,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_38, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.PORK_JERKY,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_39, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.CHICKEN_JERKY,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_40, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MUTTON_JERKY,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_41, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.RABBIT_JERKY,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_42, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.FISH_JERKY,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_44, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MAGIC_SUGAR,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_45, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MONSTER_JERKY,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_46, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_2,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_47, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_3,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_48, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_2,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_49, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_3,2 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_50, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MAGICAL_BOOK_COVER,2 )});
        //registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW1_, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.,2 )});
























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
        return new CustomItemStack( PlayerHead.getItemStack( PlayerSkin.fromHashCode( "a2ac9cbc5befca3a8007a6d0b54b626459d0d510203ea1563a09883a525a747c")), Y.COLOR_INITIATIVE + "芯片大师制造中");
    }
    @Nonnull
    @Override
    public String getMachineIdentifier() {
        return "QS_XI_PIA_JI_HUO_QI_V1";
    }
    @Override
    public String getInventoryTitle() {
        return Y.colorPseudorandomString ("普通芯片激活器");
    }
    @Override
    public int getCapacity() {
        return 10000;
    }

    @Override
    public int getEnergyConsumption() {
        return 4555;
    }

    @Override
    public int getSpeed() {
        return 1;
    }
        }
