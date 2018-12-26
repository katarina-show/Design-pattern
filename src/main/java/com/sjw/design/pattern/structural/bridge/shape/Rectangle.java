package com.sjw.design.pattern.structural.bridge.shape;

/**
 * @Author: Irelia
 * @Date: 2018/12/12 20:50
 * @Description:
 **/
public class Rectangle extends Shape{

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    void paintColor() {
        System.out.println("一个长方形");
        color.paint();
    }
}
