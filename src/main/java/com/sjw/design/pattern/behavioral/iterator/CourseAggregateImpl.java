package com.sjw.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 1:21
 * @Description:  课程管理的实现
 **/
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
