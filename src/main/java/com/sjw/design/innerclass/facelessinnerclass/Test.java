package com.sjw.design.innerclass.facelessinnerclass;

/**
 * @Author: Irelia
 * @Date: 2018/11/24 21:21
 * @Description: 匿名内部类
 **/
public class Test {


    public void test(Bird bird){
        System.out.println("这只鸟发出了"+bird.shout()+"的声音");
        System.out.println("它飞了"+bird.fly()+"米");
        bird.showName("鸽子");
    }

    public Bird getBird(final String name){
        return new Bird() {
            @Override
            public String shout() {
                return "呼呼";
            }

            @Override
            public int fly() {
                return 0;
            }

            @Override
            public void showName(String birdName) {
                System.out.println("我的名字是"+name);
            }
        };
    }

    public static void main(String[] args) {
        Test test = new Test();
        //匿名内部类,实际上是一个类实现了Bird接口,不过这个类没有名字,不用写出这个具体实现类
        //new就完事了,缺点也很明显,只能用一次
        //如果test多次调用,就会很不方便
        //实际中,常用于安装监听器以及线程
        final int fly = 1000;
        test.test(new Bird() {
            @Override
            public String shout() {
                return "叽叽叽";
            }

            @Override
            public int fly() {
                return fly;
            }

            @Override
            public void showName(String birdName) {
                System.out.println("我的名字是"+birdName);
            }
        });

       /* Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });*/
    }
}
