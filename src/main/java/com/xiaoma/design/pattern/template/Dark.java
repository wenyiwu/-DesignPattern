package com.xiaoma.design.pattern.template;

public class Dark extends Food {

    public Dark(String foodName, String[] ingredients) {
        super("Dark", new String[]{"鸭子","水"});
    }

    public void cookTheFood() {
        System.out.println(this.getFoodName() + " : " + this.getIngredients());
    }
}
