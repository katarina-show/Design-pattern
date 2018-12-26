package com.sjw.design.pattern.creational.singleton;

/**
 * @Author: Irelia
 * @Date: 2018/11/24 0:46
 * @Description:  单例模式--双检锁  懒汉模式的升级版
 * 特点：1.延迟加载 2.线程安全
 **/
public class LazyDoubleCheckSingleton {

    //volatile禁止指令重排序，所有线程看到共享内存的最新状态
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){

    }
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton == null){
            //情况1.当2个线程同时进入，判断都为null，也只有1个线程能进入下面的锁里，另外的线程会阻塞在这里
            //第1个线程释放锁之后，第2个线程恢复，在双检的第2个检查时也会直接返回
            //情况2：第1个先来的线程已经完成了实例化，此时第2个线程进入，判断不为空，直接返回
            //可以发现，双检锁和懒汉相比，双检锁不一定每次都要锁整个类
            //不过这里 有1个指令重排序的坑
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //上面这行new操作，会经历下面3个步骤123，不过指令重排序可能把2和3颠倒，使3先发生

                    //1.分配内存给这个对象
                    //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址（提前发生）
                    //2.初始化对象

                    //在单线程下，即使2和3颠倒，也不会改变程序执行结果，所以java程序允许这种不影响结果的重排序
                    //举例：线程1发生了重排序，发生了1和3后，线程2进入
                    //线程2认为lazyDoubleCheckSingleton并不为null，因为他有指向内存空间
                    //线程2直接return出去使用该对象，但其实该对象在线程1中还未初始化
                    //结果：线程2抛异常，但线程1可以正常使用

                    //解决方法：1.不允许重排序 --> 给lazyDoubleCheckSingleton对象加上volatile关键字
                    //         2.允许重排序 --> 但是不允许其他线程看到这个重排序 --静态内部类
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
