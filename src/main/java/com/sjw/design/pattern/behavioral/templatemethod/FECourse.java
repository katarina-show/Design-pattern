package com.sjw.design.pattern.behavioral.templatemethod;

/**
 * @Author: Irelia
 * @Date: 2018/12/25 20:09
 * @Description: 前端课程，使用继承
 **/
public class FECourse extends ACourse {

    private boolean needWriteArticleFlag;

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    //这个课程可以写或是不写笔记
    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
