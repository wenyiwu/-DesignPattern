package com.xiaoma.design.pattern.single.lazy;


//懒汉式 3
    //特点：在外部类被调用的时候内部类才会被加载
//内部类
//解决了内存浪费，也兼顾synchronized性能问题
public class LazyThree {

    private static boolean initialized = false;

    //默认使用LazyThree的时候，会先初始化内部类
    //如果没有使用的话，内部类不会被加载
    private LazyThree(){
        synchronized (LazyThree.class) {
            if(initialized == false) {
                initialized = true;
            } else {
                throw new RuntimeException("不能被初始化两次");
            }
        }
    }

    //每一个关键字都不是多余的
    //static为了使单例的空间共享
    //final保证这个方法不会被重写，重载
    public static final LazyThree getInstance(){
        //在返回结果之前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyThree LAZY = new LazyThree();
    }
}
