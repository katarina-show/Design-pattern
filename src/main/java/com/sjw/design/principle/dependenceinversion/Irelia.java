package com.sjw.design.principle.dependenceinversion;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 17:35
 * @Description:
 **/
public class Irelia {

    //v1
    /*public void studyJavaCourse(){
        System.out.println("Irelia 正在学习java。。。");
    }

    public void studyFECourse(){
        System.out.println("Irelia 正在学习前端。。。");
    }

    public void studyPythonCourse(){
        System.out.println("Irelia 正在学习python。。。");
    }*/

    //v2
    /*public void studyNewCourse(ICourse iCourse){
        iCourse.studyCourse();
    }*/

    //v3
    /*private ICourse iCourse;

    public Irelia(ICourse iCourse){
        this.iCourse = iCourse;
    }

    public void studyNewCourse(){
        iCourse.studyCourse();
    }*/

    private ICourse iCourse;

    public void setICourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyNewcCourse(){
        iCourse.studyCourse();
    }
}
