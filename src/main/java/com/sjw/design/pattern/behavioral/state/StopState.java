package com.sjw.design.pattern.behavioral.state;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 7:03
 * @Description:
 **/
public class StopState extends CourseVideoState{

    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("Error 停止状态下不能快进");
    }

    @Override
    public void pause() {
        System.out.println("Error 停止状态下不能暂停");
    }

    @Override
    public void stop() {
        System.out.println("停止播放视频状态");
    }
}
