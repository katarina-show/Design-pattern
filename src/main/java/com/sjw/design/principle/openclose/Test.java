package com.sjw.design.principle.openclose;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 16:52
 * @Description: 开闭原则
 **/
public class Test {

    public static void main(String[] args) {
        //原始需求
//        ICourse javaCourse = new JavaCourse(1, "Java-开闭原则", 348d);
//        System.out.println("课程ID:" + javaCourse.getId() + " 课程名称:" + javaCourse.getName()
//                + " 课程原价:" + javaCourse.getPrice());

        //v1 新需求，java课程打折
        /*ICourse iCourse = new JavaDiscountCourse(1, "Java-开闭原则", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID:" + javaCourse.getId() + " 课程名称:" + javaCourse.getName()
                + " 课程原价:" + javaCourse.getOriginPrice() + " 课程折后价格:" + javaCourse.getPrice() + "元");*/

        //v2 里氏替换原则
        ICourse iCourse = new JavaDiscountCourse(2, "Java-里氏替换原则", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID:" + javaCourse.getId() + " 课程名称:" + javaCourse.getName()
                + " 课程原价:" + javaCourse.getPrice() + " 课程折后价格:" + javaCourse.getDiscountPrice() + "元");

    }
}
