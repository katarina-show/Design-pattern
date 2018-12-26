package com.sjw.design.principle.liskovsubstitution.wrong;


/**
 * @Author: Irelia
 * @Date: 2018/11/19 11:55
 * @Description: 理论上说正方形是特殊的长方形，所以我们这里选择继承（错误示例）
 **/
public class Square extends Rectangle {
    //边长
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    //我们需要重写一下父类的方法，因为长宽都是正方形的边长
    //可以发现，这里已经违背了里氏替换原则，我们修改了父类已有的实现
    //违背该原则不代表程序一定会出问题，视具体业务逻辑而定
    @Override
    public long getWidth() {
        return getSideLength();
    }

    @Override
    public long getLength() {
        return getSideLength();
    }

    @Override
    public void setLength(long length) {
        setSideLength(length);
    }

    @Override
    public void setWidth(long width) {
        setSideLength(width);
    }
}
