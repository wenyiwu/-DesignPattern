package com.xiaoma.design.pattern.adapter;

public class PassportServer implements  Passport{
    public ResultMsg login(String userName, String password) {
        System.out.println("登陆成功");
        return null;
    }

    public ResultMsg register(String userName, String password) {
        System.out.println("注册成功");

        return null;
    }
}
