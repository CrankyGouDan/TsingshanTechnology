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


public class XiPiaJiHuoQi_V2 extends XiPiaMoBan implements RecipeDisplayItem {

    public XiPiaJiHuoQi_V2(ItemGroup category, SlimefunItemStack item, RecipeType type, ItemStack[] recipe) {
        super(category, item, type, recipe);
    }

    public void registerDefaultRecipes() {


        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_1, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ADVANCED_CIRCUIT_BOARD,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_2, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BATTERY,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_3, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.STEEL_THRUSTER,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_4, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.POWER_CRYSTAL,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_5, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.SOLAR_PANEL,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_7, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ELECTRO_MAGNET,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_8, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ELECTRIC_MOTOR,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_9, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.HEATING_COIL,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_12, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.COOLING_UNIT,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_14, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ANDROID_MEMORY_CORE,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_16, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.PORTABLE_CRAFTER,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_17, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.PORTABLE_DUSTBIN,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_21, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.VITAMINS,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_22, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MEDICINE,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_23, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BACKPACK_SMALL,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_24, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BACKPACK_MEDIUM,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_25, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BACKPACK_LARGE,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_26, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.WOVEN_BACKPACK,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_27, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GILDED_BACKPACK,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_28, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.RADIANT_BACKPACK,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_29, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.COOLER,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_30, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.TAPE_MEASURE,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_31, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GOLD_PAN,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_32, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.NETHER_GOLD_PAN,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_33, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GRAPPLING_HOOK,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_34, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.CARBON_CHUNK,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_35, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.FORTUNE_COOKIE,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_36, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.DIET_COOKIE,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_37, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BEEF_JERKY,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_38, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.PORK_JERKY,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_39, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.CHICKEN_JERKY,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_40, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MUTTON_JERKY,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_41, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.RABBIT_JERKY,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_42, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.FISH_JERKY,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_44, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MAGIC_SUGAR,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_45, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MONSTER_JERKY,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_46, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_2,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_47, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_3,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_48, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_2,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_49, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_3,8 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_50, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MAGICAL_BOOK_COVER,8 )});
        //registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.,2 )});


        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_13, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.WITHER_PROOF_OBSIDIAN,32 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_10, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.COPPER_WIRE,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_11, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 ),new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_6, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems. REINFORCED_CLOTH,16 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_15, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.WITHER_PROOF_GLASS,32 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_18, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.RAG,16 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_19, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BANDAGE,32 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_20, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.SPLINT,32 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW2_43, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.KELP_COOKIE,16 )});






















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
        return "QS_XI_PIA_JI_HUO_QI_V2";
    }
    @Override
    public String getInventoryTitle() {
        return Y.colorPseudorandomString ("普通芯片激活器");
    }
    @Override
    public int getCapacity() {
        return 20000;
    }

    @Override
    public int getEnergyConsumption() {
        return 7999;
    }

    @Override
    public int getSpeed() {
        return 1;
    }
        }
