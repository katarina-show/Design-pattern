package com.sjw.design.pattern.behavioral.templatemethod;

/**
 * @Author: Irelia
 * @Date: 2018/12/25 20:09
 * @Description: 抽象父类
 **/
public abstract class ACourse {


    // 声明final防止子类重写
    // 制作课程的步骤 1.做ppt 2.做视频 3.写笔记（不是必需的） 1和2是必需的
    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if(needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作PPT");
    }

    final void makeVideo(){
        System.out.println("制作视频");
    }

    final void writeArticle(){
        System.out.println("编写笔记");
    }

    //由于写笔记不是必需的，所以提供一个钩子方法
    protected boolean needWriteArticle(){
        return false;
    }

    //包装课程，对于不同的课程，包装是不一样的
    abstract void packageCourse();





}
