package com.sjw.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 5:10
 * @Description: 聊天室、学习群
 * 它就是中介者类
 **/
public class StudyGroup {

    public static void showMessage(User user,String message){
        System.out.println(new Date().toString() + "[" + user.getName() + "]" + message);
    }
}
