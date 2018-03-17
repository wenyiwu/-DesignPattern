package com.xiaoma.design.pattern.strategy.payport;

import com.xiaoma.design.pattern.strategy.pay.PayState;

//支付渠道
public interface Payment {

    PayState pay(String uid, double amount);
}
