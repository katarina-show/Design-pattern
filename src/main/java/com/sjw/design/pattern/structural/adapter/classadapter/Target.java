package com.sjw.design.pattern.structural.adapter.classadapter;

/**
 * @Author: Irelia
 * @Date: 2018/11/30 3:49
 * @Description: 目标接口  即  原始接口
 * 1.直接的实现类 ConcreteTarget 可以理解为原始实现
 * 2.Adapter  客户期望转换的接口
 **/
public interface Target {
    void request();
}
