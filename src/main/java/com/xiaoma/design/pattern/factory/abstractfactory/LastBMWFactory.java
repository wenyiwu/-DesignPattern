package com.xiaoma.design.pattern.factory.abstractfactory;

import com.xiaoma.design.pattern.factory.BMW;
import com.xiaoma.design.pattern.factory.Car;

public class LastBMWFactory extends AbstractFactory {
    public Insurance buyInsurance() {
        return new TaiPingYangInsurance();
    }

    public Car buyCar() {
        return new BMW();
    }
}
