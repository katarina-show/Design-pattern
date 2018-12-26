package com.sjw.design.pattern.creational.prototype;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 2:37
 * @Description: 原型模式
 **/
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail:"+mail);

        //模拟发送10条邮件
        //在循环中需产出大量对象
        for(int i = 0;i < 10;i++){
            //clone时不会调用构造器
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名"+i);
            mailTemp.setEmailAddress("姓名"+i+"@126.com");
            mailTemp.setContent("我的🐱和你的🐎都很想你");
            MailUtil.sendMail(mailTemp);

            System.out.println("克隆的mailTemp:"+mailTemp);
        }

        MailUtil.saveOriginMailRecord(mail);
    }
}
