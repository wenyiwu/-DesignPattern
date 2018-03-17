package com.xiaoma.design.pattern.template;

import java.util.ArrayList;

public abstract class Food {
    private String foodName;
    private String[] ingredients;

    public Food(String foodName, String[] ingredients) {
        this.foodName = foodName;
        this.ingredients = ingredients;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public abstract void cookTheFood();
}
