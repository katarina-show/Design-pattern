package com.sjw.design.principle.liskovsubstitution.wrong;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 12:01
 * @Description: 违背里氏替换原则的案例
 **/
public class Test {

    //调整长和宽
    public static void resize(Rectangle rectangle){
        //业务逻辑：当宽小于等于长的时候，给宽+1
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+rectangle.getWidth() + " length:"+rectangle.getLength());
        }
        System.out.println("resize方法结束 width:"+rectangle.getWidth() + " length:"+rectangle.getLength());
    }

    //作为长方形可以正常输出
    /*public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }*/

    //程序停不下来，这里用正方形继承长方形就违反了里氏替换原则
    //再举个简单的例子，鸟是父类，可以飞，如果强行让鸵鸟继承鸟，很明显就是错误的
    public static void main(String[] args) {
        Square square = new Square();
        square.setLength(10);
        resize(square);
    }
}
