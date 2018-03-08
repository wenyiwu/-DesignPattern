package com.xiaoma.design.pattern.single.lazy;


//懒汉模式1，存在线程安全问题
public class Lazy {
    private static Lazy lazy = null;

    private Lazy(){}

    public static Lazy getInstance() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }
}
