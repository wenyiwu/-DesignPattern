package com.xiaoma.design.pattern.factory.factorymethod;

import com.xiaoma.design.pattern.factory.BMW;
import com.xiaoma.design.pattern.factory.Car;

public class BMWFactory implements CarFactory {
    public Car createCar(String carName) {
        if (carName.equals("BMW")) {
            return new BMW();
        }
        return null;
    }
}
