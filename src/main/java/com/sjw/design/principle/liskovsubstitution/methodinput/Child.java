package com.sjw.design.principle.liskovsubstitution.methodinput;

import java.util.Map;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 12:50
 * @Description:
 **/
public class Child extends Base {
//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap入参方法被执行");
//    }

    //由于子类的入参Map比父类的HashMap大，因此子类的这个重载方法，永远也不会执行
    //如果Base类的入参改为Map,这里改为HashMap，那么该方法就会被执行，这样就违背了里氏替换原则
    //(所有引用父类的地方必须能透明地使用其子类的对象，子类对象能够替换父类对象，而程序逻辑不变)
    public void method(Map map) {
        System.out.println("子类Map入参方法被执行");
    }
}
