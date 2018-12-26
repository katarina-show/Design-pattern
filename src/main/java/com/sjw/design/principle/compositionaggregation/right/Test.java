package com.sjw.design.principle.compositionaggregation.right;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 14:56
 * @Description: 组合/复用原则
 **/
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
