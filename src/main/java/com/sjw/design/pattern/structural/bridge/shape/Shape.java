package com.sjw.design.pattern.structural.bridge.shape;

/**
 * @Author: Irelia
 * @Date: 2018/12/12 20:46
 * @Description:
 **/
public abstract class Shape {

    Color color;


    public Shape(Color color){
        this.color = color;
    }

    abstract void paintColor();
}
