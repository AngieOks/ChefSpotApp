package com.chefspot.chefspot.domain.service;

import java.util.List;

import com.chefspot.chefspot.domain.Recipe;

/**
 * Created by lilyp on 24/04/2016.
 */
public interface RecipeService {

    List<Recipe> getAllRecipes();

    Recipe getRecipeById(String recipeID);

    void addRecipe(Recipe recipeToBeAdded);
}
