package com.sjw.design.pattern.behavioral.iterator;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 1:21
 * @Description:
 **/
public interface CourseIterator {

    //获取下一个课程
    Course nextCourse();

    //判断是否是最后一个课程
    boolean isLastCourse();

}
