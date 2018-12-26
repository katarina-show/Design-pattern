package com.sjw.design.pattern.behavioral.chainofresponsbility;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 5:50
 * @Description:
 **/
public class ArticleApproer extends Approver{

    @Override
    public void deploy(Course course) {
        if(StringUtils.isNotEmpty(course.getArticle())){
            System.out.println(course.getName() + "包含笔记，批准");
            if(approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName() + "不包含笔记，不批准");
            return;
        }
    }
}
