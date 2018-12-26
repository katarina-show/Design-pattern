package com.sjw.design.pattern.creational.factorymethod;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 18:21
 * @Description: 工厂方法模式
 **/
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        VideoFactory videoFactory2 = new JavaVideoFactory();
        VideoFactory videoFactory3 = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

    }

}
