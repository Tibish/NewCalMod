package fr.tibish.newcalmod.datagen;

import fr.tibish.newcalmod.block.ModBlocks;
import fr.tibish.newcalmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreSmelting(consumer, List.of(ModItems.RAW_NICKEL.get()), RecipeCategory.MISC,
                ModItems.NICKEL.get(), 0.7f, 200, "nickel");

        oreBlasting(consumer, List.of(ModItems.RAW_NICKEL.get()), RecipeCategory.MISC,
                ModItems.NICKEL.get(), 0.7f, 100, "nickel");

        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.NICKEL.get(),
                RecipeCategory.MISC, ModBlocks.NICKEL_BLOCK.get());
    }
}
