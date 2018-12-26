package com.sjw.design.innerclass.staticinnerclass;

/**
 * @Author: Irelia
 * @Date: 2018/11/24 22:04
 * @Description:
 **/
public class Test {

    public static void main(String[] args) {
        //外部类的无参构造不会被调用
        /*Outer.Inner inner = new Outer.Inner();
        inner.use();*/

        Outer outer = new Outer();
        System.out.println("end");
    }
}
