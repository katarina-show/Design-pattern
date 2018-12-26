package com.sjw.design.innerclass.memberinnerclass;

/**
 * @Author: Irelia
 * @Date: 2018/11/24 17:26
 * @Description:
 **/
public class Test {

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.useInner();

        //创建成员内部类对象
        Outer.Inner inner = outer.new Inner();
        inner.useOuter();
    }

}
