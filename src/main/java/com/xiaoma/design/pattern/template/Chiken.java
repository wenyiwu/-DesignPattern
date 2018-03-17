package com.xiaoma.design.pattern.template;

public class Chiken extends Food {


    public Chiken() {
        super("Chiken", new String[]{"鸡","油"});
    }

    public void cookTheFood() {
        System.out.println(this.getFoodName() + " : " + this.getIngredients());
    }
}
