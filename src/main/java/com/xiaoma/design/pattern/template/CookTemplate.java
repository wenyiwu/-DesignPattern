package com.xiaoma.design.pattern.template;

//做饭流程模板
public class CookTemplate {
    //public

    public void makeFood(Food food){
        //第一步：洗菜
        System.out.println("洗菜");
        //第二部：切菜
        System.out.println("切菜");
        //第三部：做饭
        food.cookTheFood();
    }
}
