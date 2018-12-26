package com.sjw.design.pattern.behavioral.strategy;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 2:02
 * @Description:
 **/
public class EmptyPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
