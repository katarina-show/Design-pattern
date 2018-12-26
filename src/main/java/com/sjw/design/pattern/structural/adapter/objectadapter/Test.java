package com.sjw.design.pattern.structural.adapter.objectadapter;

/**
 * @Author: Irelia
 * @Date: 2018/11/30 4:01
 * @Description: 对象适配器
 * 和 类适配器 唯一的不同是 Adapter类
 * 强调的是 组合/复用 原则
 **/
public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();

    }
}
