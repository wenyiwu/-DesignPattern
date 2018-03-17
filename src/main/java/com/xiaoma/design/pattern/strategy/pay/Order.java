package com.xiaoma.design.pattern.strategy.pay;

import com.xiaoma.design.pattern.strategy.payport.Payment;

public class Order {
    private String uid;

    private String orderId;

    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public PayState pay(Payment payment) {
        return payment.pay(this.uid, this.amount);
    }
}
