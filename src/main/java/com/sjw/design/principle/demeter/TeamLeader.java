package com.sjw.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 22:57
 * @Description:
 **/
public class TeamLeader {

    //v1
   /* public void checkNumberOfCourses(List<Course> courseList){
        System.out.println("在线课程的数量是："+courseList.size());
    }*/

    //v2
    public void checkNumberOfCourses(){
        List<Course> courseList = new ArrayList<Course>();
        for(int i = 0 ;i < 20;i++){
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是："+courseList.size());
    }

}
