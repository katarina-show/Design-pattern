package com.sjw.design.pattern.behavioral.chainofresponsbility;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 5:53
 * @Description:
 **/
public class VideoApprover extends Approver{

    @Override
    public void deploy(Course course) {
        if(StringUtils.isNotEmpty(course.getVideo())){
            System.out.println(course.getName() + "包含视频，批准");
            //这里一定要做空判断，防止空指针
            if(approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName() + "不包含视频，不批准");
            return;
        }
    }
}
