package com.sjw.design.pattern.behavioral.command;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 8:21
 * @Description:
 **/
public class OpenCourseVideoCommand implements Command{

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
