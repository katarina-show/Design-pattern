package com.sjw.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 12:50
 * @Description:  作为父类
 **/
public class Base {
    public void method(HashMap map){
        System.out.println("父类被执行");
    }
}
