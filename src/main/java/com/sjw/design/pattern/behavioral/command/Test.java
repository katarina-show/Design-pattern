package com.sjw.design.pattern.behavioral.command;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 8:26
 * @Description: 命令模式
 **/
public class Test {

    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("java设计模式");
        Command openCommand = new OpenCourseVideoCommand(courseVideo);
        Command closeCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCommand);
        staff.addCommand(closeCommand);

        staff.executeCommands();
    }
}
