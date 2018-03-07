package com.xiaoma.design.pattern.factory.factorymethod;

import com.xiaoma.design.pattern.factory.Benz;
import com.xiaoma.design.pattern.factory.Car;

public class BenzFactory implements CarFactory {
    public Car createCar(String carName) {
        if (carName.equals("Benz")) {
            return new Benz();
        }
        return null;
    }
}
