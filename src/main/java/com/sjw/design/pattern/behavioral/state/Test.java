package com.sjw.design.pattern.behavioral.state;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 7:16
 * @Description: 状态模式
 **/
public class Test {

    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());

        System.out.println("当前状态" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.pause();

        System.out.println("当前状态" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.speed();

        System.out.println("当前状态" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.stop();

        System.out.println("当前状态" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.speed();
    }
}
