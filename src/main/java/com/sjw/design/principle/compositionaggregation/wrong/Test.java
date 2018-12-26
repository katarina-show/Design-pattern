package com.sjw.design.principle.compositionaggregation.wrong;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 14:56
 * @Description:
 **/
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.addProduct();
    }
}
