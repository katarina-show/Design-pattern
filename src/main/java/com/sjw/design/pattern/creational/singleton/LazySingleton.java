package com.sjw.design.pattern.creational.singleton;

/**
 * @Author: Irelia
 * @Date: 2018/11/23 22:37
 * @Description:  单例模式--懒汉式
 * 特点：1.延迟加载 2.线程不安全
 **/
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    //私有化构造器，是所有单例模式都必须做的事
    private LazySingleton(){
        //防止反射调用的代码，对于懒汉和双检锁来说，反射攻击是无法100%阻止的
        if(lazySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    //getInstance1和getInstance2 注意方法区别，2上加了锁
    public static LazySingleton getInstance1(){
        //假设2个线程，线程1到了A位置但还未new出对象时，线程2正在进行if的判断，刚好也为null也到了A位置
        //此时就创建出了2个对象，因此线程不安全
        if(lazySingleton == null){
            //A位置
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    //静态方法上加锁，相当于锁了这个类，和synchronized (LazySingleton.class){...}效果一样
    //这是线程安全的，不过比较影响性能，加大系统开销
    public synchronized static LazySingleton getInstance2(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
