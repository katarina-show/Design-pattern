package com.sjw.design.pattern.structural.facade;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 14:46
 * @Description: 子系统1：积分兑换礼物时，验证资格
 **/
public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+" 积分资格通过,库存通过");
        return true;
    }
}
