package com.sjw.design.pattern.structural.decorator.v3;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 23:32
 * @Description: 要和具体实体一样，继承相同的抽象实体，为什么？可以注释掉 本类的继承，去main函数里就会发现问题所在
 * 继承的目的不是为了具体的行为（getDesc、cost），而只是为了单纯继承它的类型
 * 从而可以更好的多态，实现 “连环装饰” 的功能
 **/
public abstract class AbstractDecorator extends ABattercake{

    abstract void doSomething();

}
