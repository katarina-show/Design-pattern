package com.sjw.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 3:18
 * @Description: 被观察者--课程
 * 被观察者 继承jdk的Observable
 **/
public class Course extends Observable{

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course,Question question){
        System.out.println(question.getUserName() + "在" + course.getCourseName() + "提交了1个问题");
        //setChanged表示发生改变
        setChanged();
        //把问题通知观察者们，即老师
        notifyObservers(question);
    }

}
