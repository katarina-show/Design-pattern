package com.sjw.design.pattern.creational.builder;

/**
 * @Author: Irelia
 * @Date: 2018/11/22 20:33
 * @Description:  课程教练（不是建造者模式中必须的），用来拼装组合课程
 **/
public class Coach {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,String coursePPT,
                             String courseVideo,String courseArticle,
                             String courseQA){
        //建造者模式适用于流程固定，但顺序不固定的场景，比如下面5行的前后位置可以自由调整
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courseQA);
        return this.courseBuilder.makeCourse();
    }
}
