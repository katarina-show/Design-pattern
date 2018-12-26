package com.sjw.design.pattern.behavioral.iterator;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 1:21
 * @Description:  课程管理类
 **/
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    //获得迭代器
    CourseIterator getCourseIterator();



}
