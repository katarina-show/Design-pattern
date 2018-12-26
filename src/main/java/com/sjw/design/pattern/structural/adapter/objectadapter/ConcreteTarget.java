package com.sjw.design.pattern.structural.adapter.objectadapter;


/**
 * @Author: Irelia
 * @Date: 2018/11/30 3:59
 * @Description:
 **/
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
