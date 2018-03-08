package com.xiaoma.design.pattern.single.lazy;

//懒汉模式2，解决了线程安全问题，但是效率很慢
public class LazyTwo {

    private static LazyTwo lazy = null;

    private LazyTwo(){}

    public static synchronized LazyTwo getInstance() {
        if (lazy == null) {
            lazy = new LazyTwo();
        }
        return lazy;
    }
}
