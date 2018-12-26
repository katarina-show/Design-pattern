package com.sjw.design.pattern.behavioral.command;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 8:21
 * @Description:
 **/
public class CloseCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
