package com.sjw.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @Author: Irelia
 * @Date: 2018/11/28 18:50
 * @Description: 单例模式--饿汉式
 * 特点：1.非延迟加载  2.线程安全
 * 由于“饿”，所以迫不及待就new出来
 **/
public class HungrySingleton implements Serializable,Cloneable {

    //方式1
    //private final static HungrySingleton hungrySingleton = new HungrySingleton();

    //方式2
    private final static HungrySingleton hungrySingleton;
    static{
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton(){
        //测试7：防止反射调用
       /* if(hungrySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }*/
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    /*这是用于序列化测试的方法，不属于饿汉模式内的
    在TestAll里面的测试6时，可以先后尝试 注释或不注释下面的方法
    会发现该方法会防止序列化对单例对象的破坏，可以跟踪readObject的源码
    在ObjectInputStreamClass类里，可以查找到一个hasReadResolveMethod方法
    该方法说明 一个类如果实现了Serializable且有名为 readResolve 的方法，会返回true
    该方法会被readObject方法反射调用，因此不会再通过反射生成新的对象*/

    /*private Object readResolve(){
        return hungrySingleton;
    }*/

    //Cloneable接口和如下clone方法是为了原型模式的实验，不属于饿汉单例内的代码
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
        //return getInstance();
    }
}
