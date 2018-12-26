package com.sjw.design.principle.dependenceinversion;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 18:10
 * @Description:
 **/
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Irelia 正在学习java。。。");
    }
}
