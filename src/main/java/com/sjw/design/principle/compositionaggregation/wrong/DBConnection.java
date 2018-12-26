package com.sjw.design.principle.compositionaggregation.wrong;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 14:56
 * @Description:
 **/
public class DBConnection {

    public String getConnection(){
        return "MySQL数据库连接";
    }

    //此时如果新增PGSQL连接，如果在这里多写一个方法，就违反了开闭原则
    /*public String getPGSQLConnection(){
        return "PGSQLL数据库连接";
    }*/
    //因此要把该类改成抽象类或者接口
}
