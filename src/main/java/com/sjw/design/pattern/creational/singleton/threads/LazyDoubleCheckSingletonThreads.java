package com.sjw.design.pattern.creational.singleton.threads;

import com.sjw.design.pattern.creational.singleton.LazyDoubleCheckSingleton;

/**
 * @Author: Irelia
 * @Date: 2018/11/24 1:22
 * @Description:
 **/
public class LazyDoubleCheckSingletonThreads implements Runnable {

    @Override
    public void run() {
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" --> "+lazyDoubleCheckSingleton);

    }
}
