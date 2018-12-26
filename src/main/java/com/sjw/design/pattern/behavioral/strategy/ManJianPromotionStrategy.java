package com.sjw.design.pattern.behavioral.strategy;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 1:44
 * @Description: 满减促销策略
 **/
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }
}
