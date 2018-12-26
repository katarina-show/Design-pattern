package com.sjw.design.pattern.structural.bridge;

/**
 * @Author: Irelia
 * @Date: 2018/12/12 12:34
 * @Description: 桥接模式
 * 案例：中国农业银行英文简称ABC 中国工商银行英文简称ICBC（爱存不存）
 * 定期存款可以是3个月，半年，一年等，银行给予一定的利息，利息比活期存款高
 * 活期存款即随存随取，利息较低
 **/
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}
