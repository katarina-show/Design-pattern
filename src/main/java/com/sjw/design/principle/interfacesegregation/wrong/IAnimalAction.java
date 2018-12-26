package com.sjw.design.principle.interfacesegregation.wrong;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 19:38
 * @Description: 动物行为的接口，声明过多，可以细化
 **/
public interface IAnimalAction {
    void eat();
    void fly();
    void swim();

}
