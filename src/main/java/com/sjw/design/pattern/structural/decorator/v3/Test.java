package com.sjw.design.pattern.structural.decorator.v3;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 23:43
 * @Description: 只是另一种写法，更推荐v2
 **/
public class Test {

    public static void main(String[] args) {

        ABattercake aBattercake = new Battercake();

        aBattercake = new EggDecorator(aBattercake);

        aBattercake = new EggDecorator(aBattercake);

        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc()+" 销售价格:"+aBattercake.cost());


        //注释掉继承后，可以运行如下代码
       /* EggDecorator e1 = new EggDecorator(aBattercake);
        System.out.println(e1.getDesc() + e1.cost());
        System.out.println("好像没办法再加一个鸡蛋了，不继承的话，一个对象只能装饰1次");*/
    }
}
