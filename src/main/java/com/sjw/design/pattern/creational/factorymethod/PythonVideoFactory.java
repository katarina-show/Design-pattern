package com.sjw.design.pattern.creational.factorymethod;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 18:21
 * @Description:
 **/
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
