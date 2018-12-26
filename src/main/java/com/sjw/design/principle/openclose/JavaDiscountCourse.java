package com.sjw.design.principle.openclose;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 16:59
 * @Description:  新需求：java课程打8折，可以显示出原价和折后价
 * 开闭原则：
 * 我们对ICourse接口和JavaCourse实现类都没有做改动，对越基层的东西，越少修改，即对修改关闭
 * 建一个JavaDiscountCourse类继承JavaCourse类，重写getPrice（折后价）方法，同时为了显示原价，新增一个getOriginPrice方法
 * 如果其他课程也有折扣，则新建对应数量个discount类
 **/
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

   /* //v1 获得原价
    public Double getOriginPrice() {
        return super.getPrice();
    }*/


    //v1 这里子类重写了父类的非抽象方法，违背了里氏替换原则。所以我们再次进行改动
   /* @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }*/

   //v2  我们新增自己独有的方法，并且不修改父类的非抽象的getPrice方法
   public Double getDiscountPrice() {
       return this.getPrice() * 0.8;
   }
}
