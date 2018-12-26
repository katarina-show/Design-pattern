package com.sjw.design.pattern.structural.facade;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 14:47
 * @Description: 子系统2：扣减积分
 **/
public class PointsPaymentService {

    //是否积分支付成功
    public boolean pay(PointsGift pointsGift){
        //各种扣减积分的逻辑，扣减积分
        System.out.println("支付"+pointsGift.getName()+" 积分成功");
        return true;
    }

}
