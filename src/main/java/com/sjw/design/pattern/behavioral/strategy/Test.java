package com.sjw.design.pattern.behavioral.strategy;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 1:48
 * @Description: 策略模式
 **/
public class Test {

    public static void main(String[] args) {
        //618采用立减策略
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        //双11采用返现策略
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());

        //新的策略只需实现策略接口，覆写方法，便可以使用
        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();

        System.out.println("----------------------------------");

        //和工厂模式结合使用
        //String promotionKey = "LIJIAN";
        //String promotionKey = "MANJIAN";
        //String promotionKey = "FANXIAN";
        String promotionKey = "没有促销？这谁顶得住啊";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}
