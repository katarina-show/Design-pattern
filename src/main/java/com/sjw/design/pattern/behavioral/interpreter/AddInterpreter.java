package com.sjw.design.pattern.behavioral.interpreter;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 2:32
 * @Description: 加法解释器
 **/
public class AddInterpreter implements Interpreter{

    private Interpreter firstExpression,secondExpression;

    //即加数和被加数
    public AddInterpreter(Interpreter firstExpression,Interpreter secondExpression){
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() + this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}
