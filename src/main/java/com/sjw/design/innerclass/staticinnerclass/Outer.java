package com.sjw.design.innerclass.staticinnerclass;

/**
 * @Author: Irelia
 * @Date: 2018/11/24 22:00
 * @Description: 静态内部类
 **/
public class Outer {

    static {
        System.out.println("外部类static代码块");
    }

    private static int a = 1;

    private int b = 2;

    public Outer(){
        System.out.println("Outer构造器");
    }

    //静态内部类是不需要依赖于外部类的
    static class Inner{

        static {
            System.out.println("内部类static代码块");
        }


        public void use(){
            System.out.println("如果我不引用外部类,那么外部类就不会被初始化");
            //System.out.println("使用外部类的static变量"+a);
            //System.out.println("无法使用外部类的非static变量"+b);
        }
    }
}
