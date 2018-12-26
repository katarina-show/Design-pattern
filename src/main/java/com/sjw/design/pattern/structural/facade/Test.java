package com.sjw.design.pattern.structural.facade;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 14:43
 * @Description: 外观模式 又称 门面模式
 * 场景：积分兑换实物礼品时，要先验证资格，然后扣减积分，最后通知物流发货
 **/
public class Test {

    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        //子系统、应用层 都只和外观类进行通信
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
