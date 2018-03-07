package com.xiaoma.design.pattern.factory.abstractfactory;

public class TaiPingYangInsuranceFactory implements InsuranceFactory {
    public Insurance getInsurance(String name) {
        return new TaiPingYangInsurance();
    }
}
