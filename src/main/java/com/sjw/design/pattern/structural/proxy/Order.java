package com.sjw.design.pattern.structural.proxy;

/**
 * @Author: Irelia
 * @Date: 2018/12/13 13:54
 * @Description:
 **/
public class Order {

    //订单数据
    private Object orderInfo;
    //属于哪一个用户ID
    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
