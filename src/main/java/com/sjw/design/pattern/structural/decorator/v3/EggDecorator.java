package com.sjw.design.pattern.structural.decorator.v3;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 23:33
 * @Description:
 **/
public class EggDecorator extends AbstractDecorator {

    private ABattercake aBattercake;

    public EggDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    public void doSomething() {
        System.out.println("寻找鸡蛋在哪儿中。。。");
    }


    public String getDesc() {
        return aBattercake.getDesc() +" 加一个鸡蛋";
    }


    public int cost() {
        return aBattercake.cost() + 1;
    }


    public void eggSay(){
        System.out.println("我是一个鸡蛋");
    }
}
