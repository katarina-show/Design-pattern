package com.sjw.design.pattern.structural.decorator.trywrite;

/**
 * @Author: Irelia
 * @Date: 2018/11/30 16:52
 * @Description:
 **/
public class ConcreteDecoratorA implements Decorator{

    private Component component;

    public ConcreteDecoratorA(Component component){
        this.component = component;
    }

    @Override
    public String operation() {
        return component.operation() + "加上 A级 强攻零件";
    }
}
