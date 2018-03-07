package com.xiaoma.design.pattern.factory.SimpleFactory;

import com.xiaoma.design.pattern.factory.BMW;
import com.xiaoma.design.pattern.factory.Benz;
import com.xiaoma.design.pattern.factory.Car;

public class CarSimpleFactory {
    public Car getCar(String carName) {
        if (carName.equals("BMW")) {
            return new BMW();
        } else if (carName.equals("Benz")) {
            return new Benz();
        }
        return null;
    }
}
