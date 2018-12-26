package com.sjw.design.pattern.structural.decorator.trywrite;

/**
 * @Author: Irelia
 * @Date: 2018/11/30 16:51
 * @Description:
 **/
public class ConcreteComponent implements Component {


    @Override
    public String operation() {
        return "产出一个普通零件";
    }
}
