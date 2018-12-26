package com.sjw.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 3:20
 * @Description: 老师负责回答课程的问题
 * 老师就是观察者 需要实现接口 Observer
 **/
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    //第一个参数即被观察的对象
    //第二个参数即通过这个方法传递的参数
    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的" + course.getCourseName() +
                "课程收到1个" + question.getUserName() +
                "提交的问题：" + question.getContent());
    }
}
