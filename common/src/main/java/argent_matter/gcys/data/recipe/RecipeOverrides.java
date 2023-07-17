package argent_matter.gcys.data.recipe;

import argent_matter.gcys.GregicalitySpace;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static argent_matter.gcys.common.data.GcysMaterials.*;
import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class RecipeOverrides {

    public static void init(Consumer<FinishedRecipe> provider) {
        GregicalitySpace.LOGGER.info("These overrides are done on purose to allow GcyS materials easier access");

        DISTILLATION_RECIPES.recipeBuilder("distill_coal_tar")
                .inputFluids(CoalTar.getFluid(1000))
                .outputItems(dustSmall, Coke)
                .outputFluids(Naphthalene.getFluid(300))
                .outputFluids(HydrogenSulfide.getFluid(300))
                .outputFluids(Creosote.getFluid(200))
                .outputFluids(Phenol.getFluid(100))
                .outputFluids(Durene.getFluid(100))
                .duration(80).EUt(VA[MV])
                .save(provider);
    }
}
