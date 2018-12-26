package com.sjw.design.pattern.structural.proxy;

/**
 * @Author: Irelia
 * @Date: 2018/12/13 13:56
 * @Description:
 **/
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        //这里存在DB交互，直接用输出代替
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
