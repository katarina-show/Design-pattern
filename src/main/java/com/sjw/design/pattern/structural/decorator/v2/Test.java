package com.sjw.design.pattern.structural.decorator.v2;

import java.io.*;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 23:43
 * @Description: 装饰者模式 通常包含 抽象的实体类、具体的实体类、抽象的装饰者、具体的装饰者
 *
 **/
public class Test {

    public static void main(String[] args) throws IOException {

        //一个具体的 煎饼
        ABattercake aBattercake = new Battercake();

        //把该对象进行装饰并返回
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc()+" 销售价格:"+aBattercake.cost());

        //IO流的装饰者模式
        InputStream fis = new FileInputStream("xxx");

        fis = new BufferedInputStream(fis);

        fis.read();
    }
}
