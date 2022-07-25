package io.gitee.crankygoudan.tsingshantechnology.machines.Moban;

import io.gitee.crankygoudan.tsingshantechnology.Categories;
import io.gitee.crankygoudan.tsingshantechnology.TsingshanTechnology;
import io.gitee.crankygoudan.tsingshantechnology.machines.jiqi.Chaojizhilianrolu;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class Ceishi {

    public static void setup(TsingshanTechnology qs) {

        new Chaojizhilianrolu ( Categories.QS_JQ, Chaojizhilianrolu.QS_JQ_CJZLRL, RecipeType.ENHANCED_CRAFTING_TABLE,
                Chaojizhilianrolu.RECIPE_MAGIC_ALTAR_MACHINE).setMachineIdentifier( Chaojizhilianrolu.QS_JQ_CJZLRL.getItemId())
                .setMachineRecipes( Chaojizhilianrolu.getAllRecipe()).
                setTimeProcess(5).
                setProcessingSpeed(1).
                setCapacity(10000)
                .setEnergyConsumption(3456).register(qs);







    }

}
