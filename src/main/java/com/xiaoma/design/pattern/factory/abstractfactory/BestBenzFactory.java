package com.xiaoma.design.pattern.factory.abstractfactory;

import com.xiaoma.design.pattern.factory.Benz;
import com.xiaoma.design.pattern.factory.Car;

public class BestBenzFactory extends AbstractFactory {
    public Insurance buyInsurance() {
        return new PingAnInsurance();
    }

    public Car buyCar() {
        return new Benz();
    }
}
