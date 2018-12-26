package com.sjw.design.pattern.behavioral.command;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 8:20
 * @Description:
 **/
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println(this.name + "视频开放");
    }

    public void close(){
        System.out.println(this.name + "视频关闭");
    }
}
