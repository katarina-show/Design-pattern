package com.sjw.design.principle.singleresponsibility.inf;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 19:21
 * @Description: 单一职责原则--接口的单一职责
 **/
public class CourseImpl implements ICourseManager,ICourseContent {
    @Override
    public void studyCourse() {
        System.out.println("学习课程");
    }

    @Override
    public void refundCourse() {

    }

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }
}
