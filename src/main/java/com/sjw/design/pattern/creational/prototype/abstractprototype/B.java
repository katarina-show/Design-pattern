package com.sjw.design.pattern.creational.prototype.abstractprototype;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 2:48
 * @Description: 继承时，自然也拥有了克隆功能
 **/
public class B extends A {

    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        //会调用到父类clone方法
        b.clone();
    }
}
