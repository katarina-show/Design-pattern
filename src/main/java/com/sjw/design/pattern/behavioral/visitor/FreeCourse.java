package com.sjw.design.pattern.behavioral.visitor;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 6:23
 * @Description: 免费课程
 **/
public class FreeCourse extends Course{

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
