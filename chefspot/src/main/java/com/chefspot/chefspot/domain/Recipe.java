package com.chefspot.chefspot.domain;

import org.springframework.web.multipart.MultipartFile;
import java.util.Date;


/**
 * Created by lilyp on 24/04/2016.
 */
public class Recipe {
    private String recipeId;
    private String name;
    private Date datePosted;
    private String mainIngredient;
    private String description;
    //private boolean isProcessed;
    private long likes;
    private long views;
    private MultipartFile recipeImage;

    public Recipe() { super();}

    public Recipe(String recipeId, String name, String mainIngredient){
        this.recipeId = recipeId;
        this.name = name;
        this.mainIngredient = mainIngredient;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //public boolean isProcessed() { return isProcessed; }

    //public void setIsProcessed(boolean isProcessed) {this.isProcessed = isProcessed;}

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes ) { this.likes = likes; }

    public long getViews() { return views;  }

    public void setViews(long views ) { this.views = views; }

    public Date getDatePosted() {return datePosted; }

    public void setDatePosted(Date datePosted) {this.datePosted = datePosted; }

    public MultipartFile getRecipeImage() {return recipeImage;}

    public void setRecipeImage(MultipartFile recipeImage) {this.recipeImage = recipeImage;}

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Recipe other = (Recipe) obj;
        if (recipeId == null) {
            if (other.recipeId != null)
                return false;
        } else if (!recipeId.equals(other.recipeId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((recipeId == null) ? 0 : recipeId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Recipe [recipeId=" + recipeId + ", name=" + name + "]";
    }
}

