package com.sjw.design.pattern.behavioral.visitor;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 6:23
 * @Description: 实战课程
 **/
public class CodingCourse extends Course{

    //收费课程的价格,最明显的区别
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
