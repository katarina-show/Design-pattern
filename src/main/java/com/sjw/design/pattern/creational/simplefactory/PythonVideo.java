package com.sjw.design.pattern.creational.simplefactory;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 16:56
 * @Description: 具体的产品
 **/
public class PythonVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制Python视频。。。");
    }
}
