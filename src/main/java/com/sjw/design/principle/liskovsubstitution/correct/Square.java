package com.sjw.design.principle.liskovsubstitution.correct;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 11:55
 * @Description: 正方形
 **/
public class Square implements Quadrangle {
    //边长
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }
}
