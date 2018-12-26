package com.sjw.design.pattern.structural.proxy.dynamicproxy;


import com.sjw.design.pattern.structural.proxy.Order;
import com.sjw.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Irelia
 * @Date: 2018/12/13 14:29
 * @Description:  动态代理类
 **/
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    //构造器注入一个实现类
    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class cls = target.getClass();
        //第一个参数：类加载器的选择 这里直接使用默认的Application ClassLoader
        //第二个参数：接口的class类，需传入一个class的数组，cls.getInterfaces可以获得该类实现的所有接口
        //它的返回值刚好是一个数组
        //第三个参数：实现InvocationHandler的动态代理类，在这里就是本类
        //方法返回值是Object，实际是一个cls实例对象
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }




    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //拿出方法中的第一个参数，本案例是 order
        Object argObject = args[0];
        beforeMethod(argObject);
        //method.invoke才会调用用方法的具体实现
        Object object = method.invoke(target,args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object obj){
        int userId = 0;
        System.out.println("动态代理 before code");
        if(obj instanceof Order){
            Order order = (Order)obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db"+dbRouter+"】处理数据");

        //todo 设置dataSource;
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
    }

    private void afterMethod(){
        System.out.println("动态代理 after code");
    }
}
