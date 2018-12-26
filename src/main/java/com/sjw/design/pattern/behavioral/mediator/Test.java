package com.sjw.design.pattern.behavioral.mediator;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 5:10
 * @Description: 中介者模式
 **/
public class Test {

    public static void main(String[] args) {
        User jerry = new User("杰瑞");
        User tom = new User("汤姆");

        jerry.sendMessage("汤姆你真的是只蠢猫");
        tom.sendMessage("哇，这样骂我，这谁顶得住啊");

    }
}
