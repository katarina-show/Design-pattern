package com.sjw.design.pattern.structural.facade;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 14:43
 * @Description: 子系统3：物流系统，进行发货
 **/
public class ShippingService {

    public String shipGift(PointsGift pointsGift){
        //物流系统的对接逻辑，返回物流订单号
        System.out.println(pointsGift.getName()+"进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
