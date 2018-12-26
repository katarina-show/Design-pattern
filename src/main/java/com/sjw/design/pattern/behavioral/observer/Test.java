package com.sjw.design.pattern.behavioral.observer;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 3:30
 * @Description: 观察者模式
 **/
public class Test {

    public static void main(String[] args) {
        Course course = new Course("Java设计模式");
        Teacher teacher1 = new Teacher("李刚");
        Teacher teacher2 = new Teacher("李爹");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        //业务逻辑代码
        Question question = new Question();
        question.setUserName("简自豪");
        question.setContent("main函数怎么写");

        course.produceQuestion(course,question);
    }
}
