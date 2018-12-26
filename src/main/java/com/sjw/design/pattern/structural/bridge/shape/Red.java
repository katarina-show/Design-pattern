package com.sjw.design.pattern.structural.bridge.shape;

/**
 * @Author: Irelia
 * @Date: 2018/12/12 20:47
 * @Description:
 **/
public class Red implements Color {

    @Override
    public void paint() {
        System.out.println("涂上了红色");
    }
}
