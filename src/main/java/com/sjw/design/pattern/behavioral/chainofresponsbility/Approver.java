package com.sjw.design.pattern.behavioral.chainofresponsbility;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 5:47
 * @Description: 批准者  很多地方也叫Handler
 **/
public abstract class Approver {

    //注意：这里是核心写法，类里面包含自己
    protected Approver approver;

    public void setNextApprover(Approver approver){
        this.approver = approver;
    }

    //发布课程
    public abstract void deploy(Course course);
}
