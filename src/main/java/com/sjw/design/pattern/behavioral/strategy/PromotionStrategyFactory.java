package com.sjw.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 1:56
 * @Description: 策略模式和工厂模式的结合
 **/
public class PromotionStrategyFactory {

    private static Map<String,PromotionStrategy> PROMPTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMPTION_STRATEGY_MAP.put(PromotionKey.LIJIAN,new LiJianPromotionStrategy());
        PROMPTION_STRATEGY_MAP.put(PromotionKey.MANJIAN,new ManJianPromotionStrategy());
        PROMPTION_STRATEGY_MAP.put(PromotionKey.FANXIAN,new FanXianPromotionStrategy());
    }


    //空策略
    private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();

    private PromotionStrategyFactory(){}


    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMPTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    private interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String MANJIAN = "MANJIAN";
        String FANXIAN = "FANXIAN";
    }
}
