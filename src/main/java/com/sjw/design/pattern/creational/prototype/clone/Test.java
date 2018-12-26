package com.sjw.design.pattern.creational.prototype.clone;

import com.sjw.design.pattern.creational.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 2:56
 * @Description: Pig 实体类
 **/
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇",birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        //修改pig1对象，如果clone方法里直接super.clone就是一种浅克隆方式
        //那么pig2对象也会随之改变，这里就是坑所在：对于引用类型，注意是否要进行深克隆（建议克隆）

        //如果clone方法里做了深克隆处理，就是不同的对象
        pig1.getBirthday().setTime(666666666666L);

        System.out.println(pig1);
        System.out.println(pig2);

        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        //反射获得clone方法
        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        //protected的方法需要突破权限
        method.setAccessible(true);
        //反射调用clone方法
        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);

        //这会破坏单例模式。产生2个不同对象
        //解决方式1：不实现Cloneable接口  2.clone方法里直接return getInstance
        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);



    }
}
