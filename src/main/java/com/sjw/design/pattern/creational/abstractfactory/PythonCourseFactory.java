package com.sjw.design.pattern.creational.abstractfactory;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 20:10
 * @Description: 具体的 Python 工厂实现类
 **/
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
