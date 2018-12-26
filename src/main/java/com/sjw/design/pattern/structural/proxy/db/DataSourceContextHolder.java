package com.sjw.design.pattern.structural.proxy.db;

/**
 * @Author: Irelia
 * @Date: 2018/12/13 13:54
 * @Description: ThreadLocal存放的是Bean的name
 **/
public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void setDBType(String dbType){
        CONTEXT_HOLDER.set(dbType);
    }

    //对于Object类型需要强转
    public static String getDBType(){
        return (String)CONTEXT_HOLDER.get();
    }

    public static void clearDBType(){
        CONTEXT_HOLDER.remove();
    }


}
