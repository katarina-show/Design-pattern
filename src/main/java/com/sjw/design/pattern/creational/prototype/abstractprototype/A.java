package com.sjw.design.pattern.creational.prototype.abstractprototype;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 2:48
 * @Description: 抽象类A实现Cloneable接口重写clone方法
 **/
public abstract class A implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
