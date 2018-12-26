package com.sjw.design.principle.singleresponsibility.inf;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 19:14
 * @Description: 该接口可以拆分成2个接口 Content和Manager
 **/
public interface ICourse {

    //第一大职责--获得课程相关信息
    //课程名称
    String getCourseName();
    //课程视频
    byte[] getCourseVideo();

    //第二大职责--管理课程
    //学习课程时，需要获得课程名称和相关视频
    void studyCourse();
    //退款，如果退了款就没法获得课程名和视频了
    void refundCourse();

    //第二大职责的实现会修改到第一大职责里的逻辑
}
