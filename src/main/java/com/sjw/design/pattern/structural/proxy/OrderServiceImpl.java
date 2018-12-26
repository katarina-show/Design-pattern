package com.sjw.design.pattern.structural.proxy;

/**
 * @Author: Irelia
 * @Date: 2018/12/13 13:57
 * @Description:
 **/
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        //Spring会通过@Autowired自己注入，这里就直接new了
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }

}
