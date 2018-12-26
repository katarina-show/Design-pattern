package com.sjw.design.innerclass.memberinnerclass;

/**
 * @Author: Irelia
 * @Date: 2018/11/24 17:27
 * @Description:  成员内部类
 **/
public class Outer{

    public int a = 1;

    private String b = "b";

    private static int c = 2;

    private int d = 3;

    public Outer(){
        System.out.println("外部类构造器被调用");
    }

    //外部类访问成员内部类时,必须先创建对象
    public void useInner(){
        System.out.println("外部类拿内部类的值:"+ new Inner().innerNumber1);
        System.out.println("外部类拿内部类的private值:"+new Inner().innerNumber2);
    }

    private void show(){
        System.out.println("外部类普通方法被调用");
    }

    //外部类权限修饰符只能是默认或者public
    //而内部类可以是任意的:public、private、protected、默认,可以有不同的可见范围
    //成员内部类是依赖于外部类的
    class Inner{

        int innerNumber1;

        private int innerNumber2 = 2;

        private int d = 4;

        //成员内部类不能有静态变量和静态块
        //public static int innerNumber2;
        //static {}

        //可以有final+static和final
        final static int innerNumber3 = 3;
        final int innerNumber4 = 4;

        //final+static的对象无法声明
        //final static int innerNumber5 = new Integer(5);
        //final static Car car = new Car();

        //成员内部类可以随便使用外部类的变量,随便调用外部类的方法
        //即使变量或方法被private修饰
        //为什么?
        //成员内部类是依赖于外部类的,没有外部类对象就没有成员内部类对象
        //由于先有外部类,所以成员内部类自然可以访问到外部类的所有属性+方法
        public void useOuter(){
            System.out.println("public修饰的"+a);
            System.out.println("private修饰的"+b);
            System.out.println("static成员"+c);
            System.out.println("本类变量d的值"+d);
            System.out.println("外部类变量d的值"+Outer.this.d);
            show();
        }
    }

}
