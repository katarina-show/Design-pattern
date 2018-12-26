package com.sjw.design.pattern.structural.adapter;

/**
 * @Author: Irelia
 * @Date: 2018/11/30 4:03
 * @Description: 220V交流电   被适配者
 **/
public class AC220 {

    public int outputAC220V(){
        int output = 220;
        System.out.println("输出交流电"+output+"V");
        return output;
    }
}
