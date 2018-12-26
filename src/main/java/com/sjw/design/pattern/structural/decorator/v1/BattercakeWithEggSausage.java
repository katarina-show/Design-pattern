package com.sjw.design.pattern.structural.decorator.v1;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 22:29
 * @Description: 加鸡蛋和香肠的煎饼
 **/
public class BattercakeWithEggSausage extends BattercakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc()+ " 加一根香肠";
    }

    //加1根香肠2元
    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
