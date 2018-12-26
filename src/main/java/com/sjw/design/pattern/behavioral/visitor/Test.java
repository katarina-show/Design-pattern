package com.sjw.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 6:23
 * @Description: 访问者模式
 **/
public class Test {

    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("详解面向对象");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("如何在高并发的分布式集群中，找到一条完美的解决方案");
        codingCourse.setPrice(66666);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {
            course.accept(new Visitor());
        }
    }
}
