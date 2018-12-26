package com.sjw.design.pattern.creational.factorymethod;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 18:21
 * @Description:
 **/
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
