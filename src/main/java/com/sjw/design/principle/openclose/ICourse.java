package com.sjw.design.principle.openclose;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 16:48
 * @Description: 课程接口
 **/
public interface ICourse {

    Integer getId();

    String getName();

    Double getPrice();

    //错误示范：更改接口，新增获得折后价接口，那么所有实现ICourse接口的类都要重写该方法，但是并不是每个种类的课程都要打折
    //因此会导致 1.所有实现ICourse接口的类都要重写getDiscountPrice方法，有多少个类就要写多少个该方法
    //          2.该方法无存在的意义，因为他们无需打折
    //Double getDiscountPrice();
}
