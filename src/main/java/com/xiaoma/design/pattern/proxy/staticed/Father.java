package com.xiaoma.design.pattern.proxy.staticed;

import com.xiaoma.design.pattern.proxy.Person;

public class Father {

    private Person person;


    //没办法扩展，只能帮SON找对象
    public Father(Person person) {
        this.person = person;
    }
    //目标对象的引用给拿到
    public void findLove() {
        System.out.println("Father：我要帮PERSON根据要求物色对象");
        this.person.findLove();
    }
}
