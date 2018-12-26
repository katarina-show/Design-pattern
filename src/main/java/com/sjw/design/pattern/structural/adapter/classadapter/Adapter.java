package com.sjw.design.pattern.structural.adapter.classadapter;

/**
 * @Author: Irelia
 * @Date: 2018/11/30 3:49
 * @Description: 适配器  类
 * 通过继承 被适配类 的方式
 **/
public class Adapter extends Adaptee implements Target{

    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
