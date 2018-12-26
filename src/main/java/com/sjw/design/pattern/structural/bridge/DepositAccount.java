package com.sjw.design.pattern.structural.bridge;

/**
 * @Author: Irelia
 * @Date: 2018/12/12 12:56
 * @Description: 定期账号
 **/
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
