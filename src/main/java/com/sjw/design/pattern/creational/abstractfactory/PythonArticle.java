package com.sjw.design.pattern.creational.abstractfactory;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 20:10
 * @Description:
 **/
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Python课程文章");
    }
}
