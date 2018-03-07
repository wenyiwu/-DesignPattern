package com.xiaoma.design.pattern.factory.factorymethod;

import com.xiaoma.design.pattern.factory.Car;

public interface CarFactory {
    Car createCar(String carName);
}
