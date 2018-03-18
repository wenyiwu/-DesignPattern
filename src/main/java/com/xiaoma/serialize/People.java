package com.xiaoma.serialize;

import java.io.Serializable;

public class People implements Serializable{


    //private static final long serialVersionUID = -1945036227480710390L;

    private String name;

    private int age;

    public static int height = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
