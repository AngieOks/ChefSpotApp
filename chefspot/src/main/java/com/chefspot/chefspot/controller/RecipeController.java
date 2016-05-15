package com.chefspot.chefspot.controller;

import com.chefspot.chefspot.domain.Recipe;
import com.chefspot.chefspot.domain.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;

/**
 * Created by lilyp on 23/04/2016.
 */
@Controller
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @RequestMapping
    public String list(Model model) {
        model.addAttribute("recipes", recipeService.getAllRecipes());
        return "recipes";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getAddNewRecipeForm(@ModelAttribute("newRecipe") Recipe newRecipe) {
        return "addRecipe";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processAddNewRecipeForm(@ModelAttribute("newRecipe") Recipe recipeToBeAdded, BindingResult result, HttpServletRequest request) {

        if(result.hasErrors()) {
            return "addRecipe";
        }

        //getting the recipe Image (from client's drive to local server drive)
        MultipartFile recipeImage = recipeToBeAdded.getRecipeImage();
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");

        if (recipeImage!=null && !recipeImage.isEmpty()) {
            try {
                recipeImage.transferTo(new File(rootDirectory+"resources\\images\\"+recipeToBeAdded.getRecipeId() + ".jpg"));
            } catch (Exception e) {
                throw new RuntimeException("Product Image saving failed", e);
            }
        }

        recipeService.addRecipe(recipeToBeAdded);
        return "redirect:/recipes";
    }

   @InitBinder
	public void initialiseBinder(WebDataBinder binder) {
		binder.setAllowedFields("recipeId","name","mainIngredient","description","isProcessed","likes","views", "recipeImage");
	}

	 /*@ExceptionHandler(RecipeNotFoundException.class)
	public ModelAndView handleError(HttpServletRequest req, RecipeNotFoundException exception) {
		 ModelAndView mav = new ModelAndView();
		 mav.addObject("invalidRecipeId", exception.getRecipeId());
		 mav.addObject("exception", exception);
		 mav.addObject("url", req.getRequestURL()+"?"+req.getQueryString());
		 mav.setViewName("RecipeNotFound");
		 return mav;
	}*/
}

