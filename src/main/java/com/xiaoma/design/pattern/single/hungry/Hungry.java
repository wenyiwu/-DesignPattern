package com.xiaoma.design.pattern.single.hungry;


//饿汉式单例
// 是在类加载的时候就立即初始化，并且创建单例对象
//  优点：没有加任何的锁，执行效率比较高
//  缺点：类加载的时候就初始化，不管用还是不用，都占着空间，浪费了内存

public class Hungry {
    private static final Hungry hungry = new Hungry();

    private Hungry(){}

    public static Hungry getInstance() {
        return hungry;
    }
}
