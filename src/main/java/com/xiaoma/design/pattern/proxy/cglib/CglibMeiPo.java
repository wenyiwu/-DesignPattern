package com.xiaoma.design.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibMeiPo implements MethodInterceptor{

    public Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(clazz);

        enhancer.setCallback(this);

        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是Cglib媒婆：我给你找对象，现在已经拿到你的需求了");
        System.out.println("开始物色");

        methodProxy.invokeSuper(o, objects);

        System.out.println("找到了，开始和她约会吧");
        return o;
    }
}
