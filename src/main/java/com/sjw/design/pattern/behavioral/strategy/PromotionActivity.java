package com.sjw.design.pattern.behavioral.strategy;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 1:44
 * @Description:  促销活动，它可以决定使用哪一种促销策略
 **/
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }

}
