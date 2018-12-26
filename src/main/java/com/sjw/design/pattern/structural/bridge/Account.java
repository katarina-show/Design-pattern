package com.sjw.design.pattern.structural.bridge;

/**
 * @Author: Irelia
 * @Date: 2018/12/12 12:55
 * @Description: 账号接口
 **/
public interface Account {
    //打开账号
    Account openAccount();
    //账号类型（农业还是工商，活期还是定期）
    void showAccountType();

}
