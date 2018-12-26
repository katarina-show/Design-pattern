package com.sjw.design.pattern.structural.proxy.staticproxy;

import com.sjw.design.pattern.structural.proxy.IOrderService;
import com.sjw.design.pattern.structural.proxy.Order;
import com.sjw.design.pattern.structural.proxy.OrderServiceImpl;
import com.sjw.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * @Author: Irelia
 * @Date: 2018/12/13 13:54
 * @Description: 静态代理
 * 假设Order有2个库 0和1
 * 我们使用userId对2取模，用余数作为dataSource声明的后缀
 **/
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    //最好使用同样的方法名，方便阅读
    public int saveOrder(Order order){
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    //方法前置增强，类似Spring注解@BrforeAdivce
    private void beforeMethod(Order order){
        System.out.println("静态代理 before code");

        //获取用户ID
        int userId = order.getUserId();
        //取模，只会得到0或者1
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db"+dbRouter+"】处理数据");

        //todo 设置dataSource;
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));

    }

    //方法后置增强，类似Spring注解@AfterAdivce
    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
