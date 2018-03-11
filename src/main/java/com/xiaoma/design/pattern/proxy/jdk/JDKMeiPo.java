package com.xiaoma.design.pattern.proxy.jdk;

import com.xiaoma.design.pattern.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeiPo implements InvocationHandler{

    private Person target;

    public Object getInstance(Person target) {

        this.target = target;

        Class<?> clazz = target.getClass();

        //用来生成一个新的对象（字节码重组实现）


        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是JDK媒婆：我给你找对象，现在已经拿到你的需求了");
        System.out.println("开始物色");

        method.invoke(this.target, args);
        System.out.println("找到了，开始和她约会吧");
        return null;
    }
}
