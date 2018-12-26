package com.sjw.design.pattern.structural.decorator.v3;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 23:34
 * @Description:
 **/
public class SausageDecorator extends AbstractDecorator {

    private ABattercake aBattercake;

    public SausageDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    public void doSomething() {
        System.out.println("寻找香肠在哪儿中。。。");
    }


    public String getDesc() {
        return aBattercake.getDesc() +" 加一根香肠";
    }


    public int cost() {
        return aBattercake.cost() + 2;
    }
}
