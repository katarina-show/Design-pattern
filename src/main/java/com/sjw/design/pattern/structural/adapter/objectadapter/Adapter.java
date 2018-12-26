package com.sjw.design.pattern.structural.adapter.objectadapter;

/**
 * @Author: Irelia
 * @Date: 2018/11/30 4:00
 * @Description: 对象适配
 **/
public class Adapter implements Target{

    //被适配的类Adaptee
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {

        adaptee.adapteeRequest();

    }
}
