package com.sjw.design.principle.interfacesegregation.wrong;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 19:42
 * @Description:
 **/
public class Bird implements IAnimalAction{

    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void fly() {
        System.out.println("飞");
    }

    @Override
    public void swim() {
        //方法是空的实现，鸟不能游泳
    }
}
