package io.gitee.crankygoudan.tsingshantechnology.machines.jiqi.qingshanjiqi;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.gitee.crankygoudan.tsingshantechnology.machines.jiqiMoBan.SuiKuangJiMoBan_V2;
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


public class XiPiaJiHuoQi_V4 extends SuiKuangJiMoBan_V2 implements RecipeDisplayItem {

    public XiPiaJiHuoQi_V4(ItemGroup category, SlimefunItemStack item, RecipeType type, ItemStack[] recipe) {
        super(category, item, type, recipe);
    }

    public void registerDefaultRecipes() {


        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_1, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ADVANCED_CIRCUIT_BOARD,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_2, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BATTERY,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_3, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.STEEL_THRUSTER,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_4, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.POWER_CRYSTAL,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_5, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.SOLAR_PANEL,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_7, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ELECTRO_MAGNET,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_8, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ELECTRIC_MOTOR,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_9, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.HEATING_COIL,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_12, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.COOLING_UNIT,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_14, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ANDROID_MEMORY_CORE,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_16, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.PORTABLE_CRAFTER,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_17, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.PORTABLE_DUSTBIN,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_21, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.VITAMINS,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_22, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MEDICINE,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_23, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BACKPACK_SMALL,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_24, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BACKPACK_MEDIUM,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_25, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BACKPACK_LARGE,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_26, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.WOVEN_BACKPACK,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_27, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GILDED_BACKPACK,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_28, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.RADIANT_BACKPACK,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_29, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.COOLER,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_30, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.TAPE_MEASURE,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_31, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GOLD_PAN,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_32, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.NETHER_GOLD_PAN,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_33, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.GRAPPLING_HOOK,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_34, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.CARBON_CHUNK,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_35, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.FORTUNE_COOKIE,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_36, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.DIET_COOKIE,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_37, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.BEEF_JERKY,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_38, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.PORK_JERKY,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_39, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.CHICKEN_JERKY,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_40, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MUTTON_JERKY,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_41, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.RABBIT_JERKY,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_42, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.FISH_JERKY,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_44, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MAGIC_SUGAR,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_45, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MONSTER_JERKY,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_46, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_2,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_47, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MAGIC_LUMP_3,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_48, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_2,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_49, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.ENDER_LUMP_3,64 )});
        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_50, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.MAGICAL_BOOK_COVER,64 )});
        //registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_, 1)}, new ItemStack[] {new SlimefunItemStack ( SlimefunItems.,2 )});


        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_13, 1)}, new ItemStack[]
            {new SlimefunItemStack ( SlimefunItems.WITHER_PROOF_OBSIDIAN,64 ),
                new SlimefunItemStack ( SlimefunItems.WITHER_PROOF_OBSIDIAN,64 ),
                new SlimefunItemStack ( SlimefunItems.WITHER_PROOF_OBSIDIAN,64 ),
                new SlimefunItemStack ( SlimefunItems.WITHER_PROOF_OBSIDIAN,64 )
            });

        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_10, 1)}, new ItemStack[]
            {new SlimefunItemStack ( SlimefunItems.COPPER_WIRE,64 ),
                new SlimefunItemStack ( SlimefunItems.COPPER_WIRE,64 ),
                new SlimefunItemStack ( SlimefunItems.COPPER_WIRE,64 ),
                new SlimefunItemStack ( SlimefunItems.COPPER_WIRE,64 ),
                new SlimefunItemStack ( SlimefunItems.COPPER_WIRE,64 ),
                new SlimefunItemStack ( SlimefunItems.COPPER_WIRE,64 ),
                new SlimefunItemStack ( SlimefunItems.COPPER_WIRE,64 ),
                new SlimefunItemStack ( SlimefunItems.COPPER_WIRE,64 )
            });

        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_11, 1)}, new ItemStack[]
            {new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 ),new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 ),
            new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 ),new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 ),
            new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 ), new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 ),
            new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 ), new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 ),
            new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 ),new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 ),
            new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 ),new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 ),
            new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 ), new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 ),
            new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 ), new SlimefunItemStack ( SlimefunItems.HARDENED_GLASS,64 )
            });

        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_6, 1)}, new ItemStack[]
            {new SlimefunItemStack ( SlimefunItems. REINFORCED_CLOTH,64 ),
                new SlimefunItemStack ( SlimefunItems. REINFORCED_CLOTH,64 )
            });



        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_15, 1)}, new ItemStack[]
            {new SlimefunItemStack ( SlimefunItems.WITHER_PROOF_GLASS,64 ),new SlimefunItemStack ( SlimefunItems.WITHER_PROOF_GLASS,64 ),
                new SlimefunItemStack ( SlimefunItems.WITHER_PROOF_GLASS,64 ),new SlimefunItemStack ( SlimefunItems.WITHER_PROOF_GLASS,64 )
            });

        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_18, 1)}, new ItemStack[]
            {new SlimefunItemStack ( SlimefunItems.RAG,64 ),
                new SlimefunItemStack ( SlimefunItems.RAG,64 )
        });

        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_19, 1)}, new ItemStack[]
            {new SlimefunItemStack ( SlimefunItems.BANDAGE,64 ),new SlimefunItemStack ( SlimefunItems.BANDAGE,64 ),
                new SlimefunItemStack ( SlimefunItems.BANDAGE,64 ),new SlimefunItemStack ( SlimefunItems.BANDAGE,64 )
            });

        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_20, 1)}, new ItemStack[]
            {new SlimefunItemStack ( SlimefunItems.SPLINT,64 ),new SlimefunItemStack ( SlimefunItems.SPLINT,64 ),
                new SlimefunItemStack ( SlimefunItems.SPLINT,64 ),new SlimefunItemStack ( SlimefunItems.SPLINT,64 )
            });

        registerRecipe(5, new ItemStack[] {new SlimefunItemStack (QS_CW4_43, 1)}, new ItemStack[]
            {new SlimefunItemStack ( SlimefunItems.KELP_COOKIE,64 ),
                new SlimefunItemStack ( SlimefunItems.KELP_COOKIE,64 )
        });






















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
        return "QS_XI_PIA_JI_HUO_QI_V4";
    }
    @Override
    public String getInventoryTitle() {
        return Y.colorPseudorandomString ("究极芯片激活器");
    }
    @Override
    public int getCapacity() {
        return 80000;
    }

    @Override
    public int getEnergyConsumption() {
        return 36000;
    }

    @Override
    public int getSpeed() {
        return 1;
    }
        }
