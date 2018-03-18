package com.xiaoma.design.pattern.adapter;

//现在这是老系统的接口，在这时，由于时代的发展，我们需要接许多第三方登陆系统。
//但是这个接口是不能改的。因为老系统都是基于这个接口来做的。如果改了这个接口，那么系统的所有登陆都将需要修改
//所以我们只能对这个接口做兼容
public interface Passport {
    ResultMsg login(String userName, String password);

    ResultMsg register(String userName, String password);
}
