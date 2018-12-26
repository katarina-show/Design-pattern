package com.sjw.design.principle.compositionaggregation.wrong;


/**
 * @Author: Irelia
 * @Date: 2018/11/19 14:56
 * @Description:
 **/
public class ProductDao extends DBConnection{

    //增加产品
    public void addProduct(){
        String conn = super.getConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}
