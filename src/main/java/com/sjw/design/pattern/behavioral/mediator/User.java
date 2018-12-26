package com.sjw.design.pattern.behavioral.mediator;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 5:10
 * @Description:
 **/
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //用户发送消息，只需和中介者打交道
    public void sendMessage(String message){
        StudyGroup.showMessage(this,message);
    }
}
