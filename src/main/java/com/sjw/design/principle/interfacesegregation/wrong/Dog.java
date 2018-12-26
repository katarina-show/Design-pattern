package com.sjw.design.principle.interfacesegregation.wrong;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 19:38
 * @Description:
 **/
public class Dog implements IAnimalAction {

    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void fly() {
        //方法只能是空的实现，因为狗不能飞
    }

    @Override
    public void swim() {
        System.out.println("游");
    }
}
