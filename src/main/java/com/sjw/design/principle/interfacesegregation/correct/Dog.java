package com.sjw.design.principle.interfacesegregation.correct;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 19:46
 * @Description:
 **/
public class Dog implements ISwimAnimalAction,IEatAnimalAction {

    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void swim() {
        System.out.println("游");
    }
}
