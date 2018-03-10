package com.xiaoma.design.pattern.clone;

import java.util.ArrayList;

public class Fake implements Cloneable{
    private String name;
    private ArrayList<String> strArr;

    public static void main(String[] args) {
        Cloner cloner = new Cloner();
        cloner.name = "laozhang";
        cloner.strArr = new ArrayList<String>();
        cloner.age = 11;
        try {
            Cloner fake = (Cloner) cloner.clone();
            fake.name = "laoyi";
            fake.age = 15;
            fake.strArr.add("hhh");
            System.out.println(fake.name + " : " + cloner.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
