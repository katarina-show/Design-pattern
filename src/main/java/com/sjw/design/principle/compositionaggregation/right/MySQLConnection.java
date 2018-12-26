package com.sjw.design.principle.compositionaggregation.right;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 14:56
 * @Description:
 **/
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
