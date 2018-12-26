package com.sjw.design.pattern.behavioral.chainofresponsbility;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 5:55
 * @Description: 责任链模式
 **/
public class Test {

    public static void main(String[] args) {
        //两个审核员，分别审批article和video
        Approver articleApprover = new ArticleApproer();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java设计模式");

        //调整注释下面2行的代码
        course.setArticle("设置笔记");
        //course.setVideo("设置视频");


        //顺序交由客户端来控制，即本类
        //article审核通过了再审核video，如果没过直接pass就不审核video了
        //因此设置下一个审核员是video审核员
        articleApprover.setNextApprover(videoApprover);


        //article审核员开始审核了
        articleApprover.deploy(course);
    }
}
