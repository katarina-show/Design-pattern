package com.sjw.design.pattern.structural.adapter.classadapter;

/**
 * @Author: Irelia
 * @Date: 2018/11/30 3:49
 * @Description: 类适配器模式  强调的是继承
 **/
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();



    }
}
