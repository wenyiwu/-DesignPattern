package com.xiaoma.design.pattern.template;

public class Chef {
    private CookTemplate cookTemplate = new CookTemplate();

    public void makeFood() {
        cookTemplate.makeFood(new Chiken());
    }
}
