package com.sjw.design.pattern.structural.proxy.staticproxy;

import com.sjw.design.pattern.structural.proxy.Order;

/**
 * @Author: Irelia
 * @Date: 2018/12/13 14:19
 * @Description:
 **/
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
