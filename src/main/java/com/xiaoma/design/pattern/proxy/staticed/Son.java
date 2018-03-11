package com.xiaoma.design.pattern.proxy.staticed;

import com.xiaoma.design.pattern.proxy.Person;

public class Son implements Person {

    public void findLove() {
        System.out.println("SON：找对象，肤白貌美大长腿");
    }

    public void buy() {
        System.out.println("SON：我要买iPhoneX");

    }

    public void job() {
        System.out.println("SON：我要找个好工作");
    }
}
