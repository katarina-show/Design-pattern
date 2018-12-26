package com.sjw.design.pattern.creational.abstractfactory;


/**
 * @Author: Irelia
 * @Date: 2018/11/19 20:10
 * @Description:  最上层的抽象工厂
 * 该工厂要包含同一个产品族的所有产品  比如这里的视频和文章
 **/
public interface CourseFactory {
    Video getVideo();
    Article getArticle();

}
