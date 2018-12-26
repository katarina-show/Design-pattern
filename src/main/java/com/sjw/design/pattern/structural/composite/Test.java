package com.sjw.design.pattern.structural.composite;

/**
 * @Author: Irelia
 * @Date: 2018/12/11 19:00
 * @Description:  案例：假设 操作系统课程--Linux课程和Windows课程只有1个，但java课程比较多，需要用一个目录存放
 **/
public class Test {

    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程",11);
        CatalogComponent windowsCourse = new Course("Windows课程",22);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);

        CatalogComponent course1 = new Course("Java一",666);
        CatalogComponent course2 = new Course("Java二",777);
        CatalogComponent designPattern = new Course("Java设计模式",888);

        javaCourseCatalog.add(course1);
        javaCourseCatalog.add(course2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent mainCourseCatalog = new CourseCatalog("课程主目录",1);
        //可以添加一个课程或者是一个目录
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCourseCatalog);

        mainCourseCatalog.print();

        //最终结果就是1个课程主目录，下面有Linux课程、Windows课程、java课程目录
        //java课程目录下有java一、java二、java设计模式

    }
}
