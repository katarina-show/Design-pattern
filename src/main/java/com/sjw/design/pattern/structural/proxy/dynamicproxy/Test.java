package com.sjw.design.pattern.structural.proxy.dynamicproxy;


import com.sjw.design.pattern.structural.proxy.IOrderService;
import com.sjw.design.pattern.structural.proxy.Order;
import com.sjw.design.pattern.structural.proxy.OrderServiceImpl;
import sun.misc.Unsafe;

import java.util.List;

/**
 * @Author: Irelia
 * @Date: 2018/12/13 14:30
 * @Description:
 **/
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
//        order.setUserId(2);
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        //调用每个方法其实都是在调用invoke方法
        orderServiceDynamicProxy.saveOrder(order);




    }
}
