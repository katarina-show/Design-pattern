package com.sjw.design.innerclass.localinnerclass;

/**
 * @Author: Irelia
 * @Date: 2018/11/24 21:07
 * @Description:
 **/
public class Test {

    public static void main(String[] args) {

        Outer outer = new Outer();
        int num = outer.use();
        System.out.println(num);
    }
}
