package com.sjw.design.principle.liskovsubstitution.wrong;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 11:55
 * @Description: 长方形
 **/
public class Rectangle{
    //长
    private long length;
    //宽
    private long width;

    public long getWidth() {
        return width;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
