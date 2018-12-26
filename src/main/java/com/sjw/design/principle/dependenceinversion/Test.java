package com.sjw.design.principle.dependenceinversion;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 17:37
 * @Description: 依赖倒置原则
 **/
public class Test {

    //v1
    /*public static void main(String[] args) {
        Irelia irelia = new Irelia();
        irelia.studyJavaCourse();
        irelia.studyFECourse();

        //如果还要学习Python的课程，Irelia类是不是仍然要再增加学习python的方法？
        //这是一种面向实现的编程，目前Test是应用层（高类）依赖低类（Irelia），耦合很高
        //高层到低层：Controller-> Service -> Dao
    }*/

    //v2
    /*public static void main(String[] args) {
        //如何解决？新建ICourse接口，对应的所有课程实现该接口，如java,FE
        //Irelia新建方法，并用接口作为方法参数

        //Irelia和具体的课程就解耦了，但是目前和ICourse接口还是耦合的
        //以后的新课程我们只需实现接口，具体学习哪个交给应用层来决定
        Irelia irelia = new Irelia();
        irelia.studyNewCourse(new JavaCourse());
        irelia.studyNewCourse(new FECourse());
        irelia.studyNewCourse(new PythonCourse());
    }*/

    //v3,构造器注入
    /*public static void main(String[] args) {
        Irelia irelia = new Irelia(new JavaCourse());
        irelia.studyNewCourse();
    }*/

    public static void main(String[] args) {
        //如果irelia想学习别的课程，使用v3的话还要再new一个对象出来很不方便且占用堆空间
        Irelia irelia = new Irelia();
        irelia.setICourse(new JavaCourse());
        irelia.studyNewcCourse();
        irelia.setICourse(new PythonCourse());
        irelia.studyNewcCourse();
    }
}
