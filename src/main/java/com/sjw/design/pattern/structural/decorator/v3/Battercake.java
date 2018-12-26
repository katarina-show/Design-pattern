package com.sjw.design.pattern.structural.decorator.v3;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 23:31
 * @Description:
 **/
public class Battercake extends ABattercake {

    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 8;
    }
}
