package com.sjw.design.pattern.structural.decorator.trywrite;

/**
 * @Author: Irelia
 * @Date: 2018/11/30 16:59
 * @Description:
 **/
public class Tes {

    public static void main(String[] args) {

        Component component = new ConcreteComponent();

        component =new ConcreteDecoratorA(component);

        component.operation();

        component = new ConcreteDecoratorB(component);

        System.out.println(component.operation());
    }
}
