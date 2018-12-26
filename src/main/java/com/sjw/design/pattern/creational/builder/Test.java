package com.sjw.design.pattern.creational.builder;

/**
 * @Author: Irelia
 * @Date: 2018/11/22 20:36
 * @Description: 建造者模式
 **/
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("23种设计模式",
                "23种设计模式PPT",
                "23种设计模式视频",
                "23种设计模式笔记",
                "23种设计模式问答");
        System.out.println(course);

    }
}
