package com.sjw.design.pattern.structural.bridge;

/**
 * @Author: Irelia
 * @Date: 2018/12/12 13:05
 * @Description:
 **/
public class ABCBank extends Bank {

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
