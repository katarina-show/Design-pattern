package com.sjw.design.principle.singleresponsibility.cla;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 18:59
 * @Description: 单一职责原则--类的单一职责 单纯的指class
 * PS：类的单一职责极容易造成类爆炸，请不要过分遵守
 *
 **/
public class Test {

    public static void main(String[] args) {
       /* Bird bird = new Bird();
        bird.mainMoveMode("大雁");
        bird.mainMoveMode("鸵鸟");*/
        //鸵鸟不用翅膀飞，因此我们去加判断，此时加了判断已经违背单一职责原则了
        //如果还有企鹅等等呢，还要加if

        //解决方式：新增FlyBird、WalkBird，在应用层里判断
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
