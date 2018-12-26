package com.sjw.design.principle.dependenceinversion;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 18:11
 * @Description:
 **/
public class FECourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Irelia 正在学习前端。。。");
    }
}
