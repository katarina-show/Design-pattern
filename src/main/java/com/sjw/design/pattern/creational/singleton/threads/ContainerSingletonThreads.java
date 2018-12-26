package com.sjw.design.pattern.creational.singleton.threads;

import com.sjw.design.pattern.creational.singleton.ContainerSingleton;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 1:38
 * @Description:
 **/
public class ContainerSingletonThreads implements Runnable{

    @Override
    public void run() {
        ContainerSingleton.putInstance("object",new Object());
        Object instance = ContainerSingleton.getInstance("object");
        System.out.println(Thread.currentThread().getName()+" --> "+instance);
    }
}
