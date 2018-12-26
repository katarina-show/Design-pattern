package com.sjw.design.pattern.behavioral.interpreter;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 2:27
 * @Description: 解释器模式
 **/
public class Test {

    public static void main(String[] args) {
        //该算法的目的是 先100+11 再把结果和6相乘
        String inputStr = "6 100 11 + *";
        ExpressionParser expressionParser = new ExpressionParser();
        int result = expressionParser.parse(inputStr);
        System.out.println("解释器计算出的结果" + result);
    }
}
