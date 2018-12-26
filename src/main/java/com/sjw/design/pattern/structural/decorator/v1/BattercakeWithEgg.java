package com.sjw.design.pattern.structural.decorator.v1;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 22:28
 * @Description: 加鸡蛋的煎饼
 **/
public class BattercakeWithEgg extends Battercake {

    @Override
    public String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    //加了鸡蛋多1块
    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
