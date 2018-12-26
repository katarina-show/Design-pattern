package com.sjw.design.pattern.structural.decorator.trywrite;

/**
 * @Author: Irelia
 * @Date: 2018/11/30 16:54
 * @Description:
 **/
public class ConcreteDecoratorB implements Decorator{

    private Component component;

    public ConcreteDecoratorB(Component component){
        this.component = component;
    }

    @Override
    public String operation() {
        return component.operation() + "加上 B级 致命节奏零件";
    }
}
