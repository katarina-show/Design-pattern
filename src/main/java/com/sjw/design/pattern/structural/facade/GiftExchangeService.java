package com.sjw.design.pattern.structural.facade;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 14:43
 * @Description: 礼物兑换服务
 **/
public class GiftExchangeService {

    //由于没有框架，所以为了方便直接注入
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift){
        if(qualifyService.isAvailable(pointsGift)){
            //资格校验通过
            if(pointsPaymentService.pay(pointsGift)){
                //如果支付积分成功
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功,订单号是:"+shippingOrderNo);
            }
        }
    }

}
