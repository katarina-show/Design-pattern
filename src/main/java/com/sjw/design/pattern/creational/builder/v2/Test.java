package com.sjw.design.pattern.creational.builder.v2;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * @Author: Irelia
 * @Date: 2018/11/22 20:45
 * @Description:
 **/
public class Test {
    public static void main(String[] args) {
        //链式调用 在很多第三方API调用时经常出现这种写法(中间一堆buildXXX，最后.build()结束)
        Course course = new Course.CourseBuilder().
                buildCourseName("23种设计模式").buildCoursePPT("23种设计模式PPT").
                buildCourseVideo("23种设计模式视频").build();
        System.out.println(course);

        //比如Guava 的ImmutableSet,也是一种建造者模式
        //内部有静态内部类 Builder，Builder下有build方法
        Set<String> set = ImmutableSet.<String>builder().add("a").add("b").build();

        System.out.println(set);

    }
}
