package com.sjw.design.pattern.behavioral.strategy;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 1:44
 * @Description: 返现策略
 **/
public class FanXianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额存放到用户的余额中");
    }
}
