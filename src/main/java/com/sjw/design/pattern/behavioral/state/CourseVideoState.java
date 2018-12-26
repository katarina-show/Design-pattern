package com.sjw.design.pattern.behavioral.state;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 7:00
 * @Description: 视频状态抽象类
 **/
public abstract class CourseVideoState {

    //视频上下文
    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    //播放
    public abstract void play();
    //快进
    public abstract void speed();
    //暂停
    public abstract void pause();
    //停止
    public abstract void stop();

}
