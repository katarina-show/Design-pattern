package com.sjw.design.pattern.creational.abstractfactory;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 20:10
 * @Description: Java视频和java文章属于一个 产品族，java文章、python文章属于 一个产品等级
 **/
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        //从Java产品族工厂里取出的必然都是java的产品
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
