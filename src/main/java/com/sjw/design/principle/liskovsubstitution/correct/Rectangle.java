package com.sjw.design.principle.liskovsubstitution.correct;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 11:55
 * @Description: 长方形
 **/
public class Rectangle implements Quadrangle {
    //长
    private long length;
    //宽
    private long width;

    @Override
    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
