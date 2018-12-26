package com.sjw.design.pattern.creational.builder;

/**
 * @Author: Irelia
 * @Date: 2018/11/22 20:28
 * @Description: 课程的抽象建造者  接口也是OK的
 **/
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();

}
