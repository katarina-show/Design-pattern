package com.sjw.design.pattern.behavioral.interpreter;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 2:36
 * @Description: 乘法解释器
 **/
public class MultiInterpreter implements Interpreter {

    private Interpreter firstExpression,secondExpression;

    //即乘数和被乘数
    public MultiInterpreter(Interpreter firstExpression,Interpreter secondExpression){
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() * this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}
