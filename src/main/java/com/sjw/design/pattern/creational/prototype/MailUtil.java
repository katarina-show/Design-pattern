package com.sjw.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 2:35
 * @Description:
 **/
public class MailUtil {

    //发邮件
    public static void sendMail(Mail mail){
        String outputContent = "向{0}同学,邮件地址:{1},邮件内容:{2}发送邮件成功";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getEmailAddress(),mail.getContent()));
    }

    //存储原始邮件
    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储originMail记录,originMail:"+mail.getContent());
    }
}
