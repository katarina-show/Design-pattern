package com.sjw.design.pattern.behavioral.interpreter;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 2:44
 * @Description:
 **/
public class OperationUtil {

    public static boolean isOperator(String s){
        return s.equals("+") || s.equals("*");
    }

    //传参：第一个数字，第二个数字，运算符
    public static Interpreter getExpressionObject(Interpreter firstExpression, Interpreter secondExpression,String s){
        if(s.equals("+")){
            return new AddInterpreter(firstExpression,secondExpression);
        }else if(s.equals("*")){
            return new MultiInterpreter(firstExpression,secondExpression);
        }
        return null;
    }
}
