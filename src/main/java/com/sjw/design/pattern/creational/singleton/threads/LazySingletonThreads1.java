package com.sjw.design.pattern.creational.singleton.threads;

import com.sjw.design.pattern.creational.singleton.LazySingleton;

/**
 * @Author: Irelia
 * @Date: 2018/11/23 22:57
 * @Description: 懒汉模式--多线程 线程不安全
 **/
public class LazySingletonThreads1 implements Runnable {

    @Override
    public void run() {
        //断点类型需改为Thread
        LazySingleton lazySingleton = LazySingleton.getInstance1();
        System.out.println(Thread.currentThread().getName()+" --> "+lazySingleton);
    }
}
