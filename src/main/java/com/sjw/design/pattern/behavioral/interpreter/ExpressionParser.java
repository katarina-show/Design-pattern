package com.sjw.design.pattern.behavioral.interpreter;

import java.util.Stack;

/**
 * @Author: Irelia
 * @Date: 2018/12/26 2:29
 * @Description:
 **/
public class ExpressionParser {

    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str){
        String[] strItemArray = str.split(" ");
        for (String s : strItemArray) {
            //不是操作符即是数字
            if(!OperationUtil.isOperator(s)){
                Interpreter numberExpression = new NumberInterpreter(s);
                stack.push(numberExpression);
                System.out.println(String.format("入栈：%d",numberExpression.interpret()));
            }else{
                //是运算符
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈：%d和%d",firstExpression.interpret(),secondExpression.interpret()));
                Interpreter operator = OperationUtil.getExpressionObject(firstExpression,secondExpression,s);
                System.out.println(String.format("应用运算符: %s",operator));
                int result = operator.interpret();
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.println(String.format("阶段结果入栈：%d",resultExpression.interpret()));
            }
        }

        int result = stack.pop().interpret();
        return result;

    }
}
