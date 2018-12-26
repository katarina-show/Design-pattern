package com.sjw.design.pattern.creational.singleton.threads;

import com.sjw.design.pattern.creational.singleton.StaticInnerClassSingleton;

/**
 * @Author: Irelia
 * @Date: 2018/11/24 1:48
 * @Description:
 **/
public class StaticInnerClassSingletonThreads implements Runnable {

    @Override
    public void run() {
        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" --> "+staticInnerClassSingleton);

    }
}
