package com.sjw.design.principle.liskovsubstitution.methodoutput;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 12:50
 * @Description: 当子类的方法实现父类的方法时（重写/重载或实现抽象方法），方法的后置条件（方法的返回值）要比父类更严格或相等
 **/
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.method());

    }
}
