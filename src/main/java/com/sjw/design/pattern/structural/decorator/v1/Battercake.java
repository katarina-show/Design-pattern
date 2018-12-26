package com.sjw.design.pattern.structural.decorator.v1;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 22:28
 * @Description: 煎饼类
 **/
public class Battercake {

    //获取描述
    protected String getDesc(){
        return "煎饼";
    }

    //价格
    protected int cost(){
        return 8;
    }

}
