package com.sjw.design.pattern.structural.bridge;

/**
 * @Author: Irelia
 * @Date: 2018/12/12 12:34
 * @Description: 银行抽象类
 * 必须是抽象类,该类总是持有
 **/
public abstract class Bank {

    //protected子类可见
    protected Account account;

    public Bank(Account account){
        this.account = account;
    }

    //声明和Account接口中完全一样的抽象方法
    //方法名最好一样，方便理解
    //Bank下的openAccount其实最后是委托给Account的openAccount来处理的
    abstract Account openAccount();

}
