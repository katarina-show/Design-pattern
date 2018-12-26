package com.sjw.design.pattern.behavioral.templatemethod;

/**
 * @Author: Irelia
 * @Date: 2018/12/25 20:09
 * @Description: 设计模式课程，使用继承。
 **/
public class DesignPatternCourse extends ACourse{

    @Override
    void packageCourse() {
        System.out.println("提供设计模式代码");
    }

    //这个课程必须要写笔记
    @Override
    protected boolean needWriteArticle() {
        return true;
    }

}
