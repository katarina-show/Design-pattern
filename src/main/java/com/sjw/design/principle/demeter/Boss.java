package com.sjw.design.principle.demeter;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 22:57
 * @Description:
 * 朋友：成员变量、入参、返回值  陌生人：方法体内部的类
 **/
public class Boss {

    //v1
    /*public void commandCheckNumber(TeamLeader teamLeader){
        //方法体内的Course不是BOSS的朋友
        //逻辑上：BOSS给TeamLeader下指令，TeamLeader查完后把结果告诉BOSS即可
        //因此BOSS不需要关注Course这个类，故不符合迪米特法则
        //此外，如果Course和BOSS不在同一包下，这里就需要导入Course的包（import），可以通过这个来判断是否符合迪米特
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        teamLeader.checkNumberOfCourses(courseList);
    }*/

    //v2
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }

}
