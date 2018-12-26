package com.sjw.design.pattern.behavioral.visitor;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 6:23
 * @Description:
 **/
public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}
