package com.sjw.design.pattern.behavioral.interpreter;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 2:37
 * @Description: 一个转型的解释器
 **/
public class NumberInterpreter implements Interpreter{

    private int number;

    public NumberInterpreter(int number){
        this.number = number;
    }

    //传入String进行转换
    public NumberInterpreter(String number){
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
