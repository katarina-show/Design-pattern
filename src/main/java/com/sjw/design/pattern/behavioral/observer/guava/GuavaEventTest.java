package com.sjw.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 3:46
 * @Description: 使用Guava实现观察者模式 简单demo
 **/
public class GuavaEventTest {

    public static void main(String[] args) {
        //EventBus即Guava实现观察者模式的核心类
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        //通过register注册后，eventBus就有了 订阅者/观察者 guavaEvent
        eventBus.register(guavaEvent);
        eventBus.post("post的内容");
    }
}
