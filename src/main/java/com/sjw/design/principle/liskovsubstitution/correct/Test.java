package com.sjw.design.principle.liskovsubstitution.correct;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 11:55
 * @Description: 采用更高层的接口约束 不采用继承，来实现程序的稳定
 **/
public class Test {
    //这里如果使用Quadrangle作为参数，就会报错，无法适应resize方法，因为没有setWidth方法，同理正方形也没有
    //这样参数就只能是Rectangle长方形，程序就不会出现死循环
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+rectangle.getWidth() + " length:"+rectangle.getLength());
        }
        System.out.println("resize方法结束 width:"+rectangle.getWidth() + " length:"+rectangle.getLength());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }
//    public static void main(String[] args) {
//        Square square = new Square();
//        square.setLength(10);
//        resize(square);
//    }


}
