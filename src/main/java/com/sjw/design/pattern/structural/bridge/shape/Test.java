package com.sjw.design.pattern.structural.bridge.shape;

/**
 * @Author: Irelia
 * @Date: 2018/12/12 20:50
 * @Description: 典型桥接模式案例：给图形上色
 * 新增图形或者颜色，都无需改动已有的类，符合开闭原则
 * 针对接口编程 符合 依赖倒置原则
 * 每个类只有1个职责 符合 单一职责原则
 * 持有别的类的引用，而不是继承，符合 合成/复用原则
 * 不算Test共计8个类
 *
 * 同样的如果使用继承，在Circle下有RedCircle、BlueCircle、YellowCircle，Rectangle和Square也是同理，共计13个类
 *
 * 新增1个图形
 * 使用桥接：8+1=9个类
 * 使用继承：13+4=17个类
 * 新增1个颜色
 * 使用桥接：8+1=9个类
 * 使用继承：13+3=16个类
 * 同时新增1个图形和1个颜色
 * 使用桥接：8+2=10个类
 * 使用继承：13+3+4=20个类
 *
 * 桥接模式减少类个数，易于拓展
 **/
public class Test {

    public static void main(String[] args) {
        Shape circle = new Circle(new Red());
        circle.paintColor();

        Shape rectangle = new Rectangle(new Blue());
        rectangle.paintColor();

        Shape square = new Square(new Yellow());
        square.paintColor();
    }
}
