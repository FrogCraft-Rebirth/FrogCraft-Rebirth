package frogcraftrewrite.api.recipes;

import java.util.ArrayList;
import java.util.Collection;

import net.minecraft.item.ItemStack;

public class CombustionFurnaceRecipeManager implements IRecipeManager<CombustionFurnaceRecipe>{

	@Override
	public boolean equal(CombustionFurnaceRecipe recipe1, CombustionFurnaceRecipe recipe2) {
		return (recipe1.getInput() == recipe2.getInput());
	}

	@Override
	public boolean add(CombustionFurnaceRecipe recipe) {
		return recipes.add(recipe);
	}

	@Override
	public boolean remove(CombustionFurnaceRecipe recipe) {
		return recipes.remove(recipe);
	}
	
	@Override
	public Collection<CombustionFurnaceRecipe> getRecipes() {
		return recipes;
	}
	
	@SuppressWarnings("hiding")
	@Override
	public <ItemStack> CombustionFurnaceRecipe getRecipe(@SuppressWarnings("unchecked") ItemStack... input) {
		return null;
	}
	
	private static ArrayList<CombustionFurnaceRecipe> recipes = new ArrayList<CombustionFurnaceRecipe>();

}
