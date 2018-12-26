package com.sjw.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 12:50
 * @Description: 子类的方法重载父类的方法时，方法的前置条件（即方法的入参）要比父类方法的入参更宽松
 **/
public class Test {
    public static void main(String[] args) {
        Base child = new Child();
        HashMap hashMap = new HashMap();
        //不会调用到重载的方法，而是直接调用到父类的方法
        child.method(hashMap);
    }
}
