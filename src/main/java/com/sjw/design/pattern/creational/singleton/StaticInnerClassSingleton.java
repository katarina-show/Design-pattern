package com.sjw.design.pattern.creational.singleton;

/**
 * @Author: Irelia
 * @Date: 2018/11/24 1:31
 * @Description: 单例模式--静态内部类 双检锁的升级版
 * 特点：1.延迟加载 2.线程安全
 **/
public class StaticInnerClassSingleton {

    //核心就是 对该类的初始化锁  看哪个线程先拿到
    private static class InnerClass{
        //静态内部类的  静态变量, 随内部类加载而加载,并且只加载1次
        private  static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    //静态内部类不会在其外部类被加载的同时被加载
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    //一个类(是泛指,接口也算)会立刻被初始化当发生以下几种情况之一
    //1.类的实例被创建:A a = new A()
    //2.类中的某个静态方法被调用
    //3.类中的某个静态成员被赋值
    //4.类中的某个静态成员被使用,且该成员不是常量(final)成员

    private StaticInnerClassSingleton(){
        //防止反射调用
        /*if(InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }*/
    }

    //总体理一下为什么线程安全、为什么说是允许重排序，却不允许别的线程看到（延迟加载和单例没什么好解释的吧）
    //首先 静态内部类不依赖于外部类而存活，就是说外部类初始化时静态内部类不会被初始化，反之亦然
    //多个线程调用getInstance方法，由于是 类.静态方法，所以第一个线程将会使StaticInnerClassSingleton这个类初始化
    //假如第一个线程进getInstance时还没有执行InnerClass.staticInnerClassSingleton这行代码，第二个线程就进来了
    //那么第一个线程调用InnerClass.staticInnerClassSingleton时，导致InnerClass类得到初始化(类中静态成员被调用)
    //同时给自己的static属性staticInnerClassSingleton赋值 = new xxx();

    //JVM可以保证，如果多个线程同时去初始化一个类，那么只会有一个线程去执行这个类的类构造器<clinit>()
    //其他线程都需要阻塞等待，直到活动线程执行<clinit>()方法完毕。
    //<clinit>()方法简单说就是从上而下给static变量赋具体值（也会执行静态代码块）

    //因此，第二个线程将被阻塞，直到第一个线程把InnerClass彻底初始化完成
    //（就是把new赋上了具体值之后，注意这里就是允许重排序的地方）
    //（但是没啥用，第二个线程没法干预）
    //然后第二个线程被唤醒，由于类初始化只有1次，所以它可以拿到一个“完全正确”的对象
    //后续线程，拿到的自然也都是同一个new出来的对象，并且线程安全也得到了保证

}
