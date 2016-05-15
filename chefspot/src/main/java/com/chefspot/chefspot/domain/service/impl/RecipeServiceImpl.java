package com.chefspot.chefspot.domain.service.impl;


import com.chefspot.chefspot.domain.Recipe;
import com.chefspot.chefspot.domain.service.RecipeService;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lilyp on 24/04/2016.
 */
@Repository
public class RecipeServiceImpl implements RecipeService {

    private List<Recipe> listOfRecipes = new ArrayList<Recipe>();

    public RecipeServiceImpl(){
        Recipe homemade_chocolate = new Recipe ("R0001", "Homemade chocolate bars", "CHOCOLATE");
        //homemade_chocolate.setDescription("Take 220g (2 cups) of coca powder (make sure you take as finer powder you can find, look at the picture) and put them in a bowl. Take 160g (3/4 of a cup) of butter and put them in bowl containing the cocoa powder. Using a spoon grind bigger pieces of cocoa powder. I recommend chopping the butter in smaller pieces for easier processing. Put the contents of the bowl in a blender or a food processor and blend them into a fine paste (check the last picture), if you don't have an access to a blender or a food processor you can use a regular mixer for the job but I will warn you, it will be messy.");
        //homemade_chocolate.setIsProcessed(true);
        homemade_chocolate.setLikes(50);
        homemade_chocolate.setViews(90);

        Recipe baked_cannelloni = new Recipe ("R0002", "Baked cannelloni", "VEGETABLES");
        //homemade_chocolate.setDescription("Pour the vegetable oil into a plastic sandwich or freezer bag. Add the potato slices, and toss to coat.\n" +
               // "Coat a large dinner plate lightly with oil. Arrange potato slices in a single layer on the dish.\n" +
               // "Cook in the microwave for 3 to 5 minutes, or until lightly browned (if not browned, they will not become crisp). Times will vary depending on the power of your microwave. Remove chips from plate, and toss with salt (or other seasonings). Let cool. Repeat process with the remaining potato slices. You will not need to keep oiling the plate.");
        //homemade_chocolate.setIsProcessed(true);
        baked_cannelloni.setLikes(20);
        baked_cannelloni.setViews(75);

        Recipe spinach_lasagna = new Recipe ("R0003", "Spinach Lasagna", "VEGETABLES");
        //homemade_chocolate.setDescription("Pour the vegetable oil into a plastic sandwich or freezer bag. Add the potato slices, and toss to coat.\n" +
        // "Coat a large dinner plate lightly with oil. Arrange potato slices in a single layer on the dish.\n" +
        // "Cook in the microwave for 3 to 5 minutes, or until lightly browned (if not browned, they will not become crisp). Times will vary depending on the power of your microwave. Remove chips from plate, and toss with salt (or other seasonings). Let cool. Repeat process with the remaining potato slices. You will not need to keep oiling the plate.");
        //homemade_chocolate.setIsProcessed(true);
        spinach_lasagna.setLikes(70);
        spinach_lasagna.setViews(105);

       /*
        Recipe grilled_masala = new Recipe ("R0004", "Grilled masala fish", "FISH");
        //homemade_chocolate.setDescription("Pour the vegetable oil into a plastic sandwich or freezer bag. Add the potato slices, and toss to coat.\n" +
        // "Coat a large dinner plate lightly with oil. Arrange potato slices in a single layer on the dish.\n" +
        // "Cook in the microwave for 3 to 5 minutes, or until lightly browned (if not browned, they will not become crisp). Times will vary depending on the power of your microwave. Remove chips from plate, and toss with salt (or other seasonings). Let cool. Repeat process with the remaining potato slices. You will not need to keep oiling the plate.");
        //homemade_chocolate.setIsProcessed(true);
        grilled_masala.setLikes(40);
        grilled_masala.setViews(85); */

        listOfRecipes.add(homemade_chocolate);
        listOfRecipes.add(baked_cannelloni);
        listOfRecipes.add(spinach_lasagna);
        //listOfRecipes.add(grilled_masala);
    }

    public List<Recipe> getAllRecipes() {
        return listOfRecipes;
    }

    public Recipe getRecipeById(String recipeId) {
        Recipe recipeById = null;

        for(Recipe recipe : listOfRecipes) {
            if(recipe!=null && recipe.getRecipeId()!=null && recipe.getRecipeId().equals(recipeId)){
                recipeById = recipe;
                break;
            }
        }

        if(recipeById == null){
            throw new IllegalArgumentException("No recipes found with the recipe id: "+ recipeId);
        }

        return recipeById;
    }

    public void addRecipe(Recipe recipe) {
        listOfRecipes.add(recipe);
    }
}
