package com.xiaoma.design.pattern.strategy.payport;

import com.xiaoma.design.pattern.strategy.pay.PayState;

public class AliPay implements Payment {
    public PayState pay(String uid, double amount) {

        System.out.println("欢迎使用支付宝");
        System.out.println("查询账户余额，开始支付");

        return new PayState(200, amount, "支付成功");
    }
}
