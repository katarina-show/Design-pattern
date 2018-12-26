package com.sjw.design.innerclass.localinnerclass;

/**
 * @Author: Irelia
 * @Date: 2018/11/24 21:04
 * @Description: 局部内部类(方法内部类)
 **/
public class Outer {

    //局部内部类里的相关变量和方法,使用范围在该方法内
    //不能有public、protected、private以及static修饰符
    public int use(){
        int c = 3;
        class Inner{
            private int a =1;
            private void show(){
                System.out.println("局部内部类里的方法被调用"+c);
            }
        }
        Inner i  = new Inner();
        i.show();
        return i.a;
    }
}
