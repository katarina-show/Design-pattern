package com.sjw.design.pattern.structural.decorator.v2;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 23:31
 * @Description: 实体煎饼
 **/
public class Battercake extends ABattercake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
