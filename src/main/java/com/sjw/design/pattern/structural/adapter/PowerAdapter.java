package com.sjw.design.pattern.structural.adapter;

/**
 * @Author: Irelia
 * @Date: 2018/11/30 3:49
 * @Description: 电源适配器类   采用对象适配
 * 需实现目标接口
 **/
public class PowerAdapter implements DC5{
    //写法1
    private AC220 ac220 = new AC220();

    //写法2
    /*private AC220 ac220;

    public PowerAdapter(AC220 ac220){
        this.ac220 = ac220;
    }*/

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        //变压器...
        int adapterOutput = adapterInput/44;

        System.out.println("使用PowerAdapter输入AC:"+adapterInput+"V"+"输出DC:"+adapterOutput+"V");
        return adapterOutput;
    }
}
