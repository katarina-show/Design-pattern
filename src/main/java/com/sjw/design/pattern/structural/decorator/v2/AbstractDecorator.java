package com.sjw.design.pattern.structural.decorator.v2;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 23:32
 * @Description: 抽象装饰者 也继承 抽象实体
 * 此时 抽象装饰者和实体煎饼 都是 抽象实体的子类
 *
 * PS：抽象装饰者 未必一定是抽象类，如果没有需要重写的抽象方法，也可以是普通类
 * 视具体业务而定
 **/
public abstract class AbstractDecorator extends ABattercake {

    //这个抽象实体的声明和下面的构造器以及重写的方法，我们可以在这里声明，或者在每个具体的装饰器里进行声明
    //详情参考v3，但是更推荐v2的写法，可以节省一些代码量
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
