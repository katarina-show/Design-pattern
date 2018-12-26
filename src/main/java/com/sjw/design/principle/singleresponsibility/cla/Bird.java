package com.sjw.design.principle.singleresponsibility.cla;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 18:57
 * @Description: 把Bird这个类的单一职责归为 飞行
 * 如果出现非飞行的行为，那么这个类就不是单一职责
 **/
public class Bird {

    //主要行动方式
    public void mainMoveMode(String birdName){
        if("鸵鸟".equals(birdName)){
            System.out.println(birdName + "用脚走");
        }else{
            System.out.println(birdName + "用翅膀飞");
        }

    }
}
