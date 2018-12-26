package com.sjw.design.pattern.creational.singleton;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 01:52
 * @Description: ThreadLocal “单例”
 **/
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal
             = new ThreadLocal<ThreadLocalInstance>(){
        //重写初始化方法
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };
    private ThreadLocalInstance(){

    }

    public static ThreadLocalInstance getInstance(){
        return threadLocalInstanceThreadLocal.get();
    }

}
