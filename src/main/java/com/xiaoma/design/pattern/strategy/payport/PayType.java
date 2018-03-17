package com.xiaoma.design.pattern.strategy.payport;

public enum PayType {
    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WechatPay());

    private Payment payment;

    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }
}
