package com.xiaoma.design.pattern.factory.abstractfactory;

import com.xiaoma.design.pattern.factory.Car;

public abstract class AbstractFactory {
    public abstract Insurance buyInsurance();

    public abstract Car buyCar();
}
