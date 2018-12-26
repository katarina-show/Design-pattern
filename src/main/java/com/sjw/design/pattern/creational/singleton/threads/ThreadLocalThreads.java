package com.sjw.design.pattern.creational.singleton.threads;

import com.sjw.design.pattern.creational.singleton.ThreadLocalInstance;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 1:55
 * @Description:
 **/
public class ThreadLocalThreads implements Runnable{

    @Override
    public void run() {
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();

        System.out.println(Thread.currentThread().getName()+" --> "+instance);
    }
}
