package com.sjw.design.pattern.structural.decorator.v2;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 23:34
 * @Description: 具体的装饰者 -- 鸡蛋
 **/
public class SausageDecorator extends AbstractDecorator{

    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
