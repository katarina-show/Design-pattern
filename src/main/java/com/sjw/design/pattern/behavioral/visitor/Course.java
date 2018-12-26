package com.sjw.design.pattern.behavioral.visitor;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 6:23
 * @Description:
 **/
public abstract class Course {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //是否接受访问
    public abstract void accept(IVisitor visitor);
}
