package com.sjw.design.pattern.creational.abstractfactory;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 20:10
 * @Description:
 **/
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程文章");
    }
}
