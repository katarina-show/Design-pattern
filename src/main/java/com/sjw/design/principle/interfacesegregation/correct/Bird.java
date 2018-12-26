package com.sjw.design.principle.interfacesegregation.correct;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 19:47
 * @Description:
 **/
public class Bird implements IEatAnimalAction,IFlyAnimalAction{

    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void fly() {
        System.out.println("飞");
    }

}
