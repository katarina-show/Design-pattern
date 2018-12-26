package com.sjw.design.principle.compositionaggregation.right;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 14:56
 * @Description:
 **/
public class ProductDao{
    //这里就是一种组合关系
    private DBConnection dbConnection;

    //DBConnection是一个抽象类，我们只能传入其子类，所以这里也是符合里氏替换原则的
    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}
