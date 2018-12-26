package com.sjw.design.principle.compositionaggregation.right;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 14:56
 * @Description:
 **/
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
