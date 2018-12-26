package com.sjw.design.pattern.behavioral.state;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 7:03
 * @Description:
 **/
public class PlayState extends CourseVideoState{


    @Override
    public void play() {
        System.out.println("正常播放视频状态");
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
