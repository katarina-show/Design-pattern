package com.sjw.design.pattern.behavioral.visitor;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 6:24
 * @Description: 普通的访问者
 * 核心：根据不同的visitor对相同的数据，产生不同的操作行为
 **/
public class Visitor implements IVisitor{

    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程：" + freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程：" + codingCourse.getName() + "，价格：" + codingCourse.getPrice());
    }
}
