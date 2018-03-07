package com.xiaoma.design.pattern.factory.abstractfactory;

public class PingAnInsuranceFactory implements InsuranceFactory {
    public Insurance getInsurance(String name) {
        return new PingAnInsurance();
    }
}
