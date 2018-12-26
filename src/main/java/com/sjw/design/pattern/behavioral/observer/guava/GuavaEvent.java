package com.sjw.design.pattern.behavioral.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 3:44
 * @Description: 使用Guava的@Subscribe注解
 **/
public class GuavaEvent {

    //需要注意被该注解修饰的方法有且仅有1个参数
    @Subscribe
    public void subscribe(String str){
        //业务逻辑
        System.out.println("执行subscribe方法，传入参数是" + str);
    }
}
