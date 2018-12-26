package com.sjw.design.pattern.creational.simplefactory;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 16:55
 * @Description:  具体的产品
 **/
public class JavaVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制Java视频。。。");
    }
}
