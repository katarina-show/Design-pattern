package com.sjw.design.pattern.structural.proxy;

/**
 * @Author: Irelia
 * @Date: 2018/12/13 13:55
 * @Description:
 **/
public interface IOrderService {
    //保存订单，返回生效行数
    int saveOrder(Order order);
}
