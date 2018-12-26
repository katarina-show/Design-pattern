package com.sjw.design.pattern.structural.decorator.v1;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 22:30
 * @Description:
 **/
public class Test {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+" 销售价格:"+battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc()+" 销售价格:"+battercakeWithEgg.cost());


        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc()+" 销售价格:"+battercakeWithEggSausage.cost());

        //如果要加2个鸡蛋，因为没有With2Eggs这个类，所以没法出售
        //且组合方式可以无限多，如果不断加类必然类爆炸

    }
}
