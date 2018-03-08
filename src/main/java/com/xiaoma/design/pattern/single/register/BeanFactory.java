package com.xiaoma.design.pattern.single.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {

    //线程安全
    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    private BeanFactory(){}

    public static Object getBean(String name) {
        if(ioc.containsKey(name)) {
            return ioc.get(name);
        } else {
            Object obj = null;
            try {
                obj = Class.forName(name).newInstance();
                return ioc.put(name, obj);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
