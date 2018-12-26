package com.sjw.design.pattern.structural.bridge.shape;

/**
 * @Author: Irelia
 * @Date: 2018/12/12 20:50
 * @Description:
 **/
public class Square extends Shape{

    public Square(Color color) {
        super(color);
    }

    @Override
    void paintColor() {
        System.out.println("一个正方形");
        color.paint();
    }
}
