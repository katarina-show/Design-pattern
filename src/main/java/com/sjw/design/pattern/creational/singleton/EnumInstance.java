package com.sjw.design.pattern.creational.singleton;

/**
 * @Author: Irelia
 * @Date: 2018/11/28 20:53
 * @Description: 单例模式--枚举类
 * 特点：1.非延迟加载  2.线程安全  3.可防止序列化攻击、反射攻击
 * 可以通过JAD反编译这个类查看，会发现INSTANCE是在静态代码块里初始化的
 * 并且INSTANCE是static final的，所以它没有延迟初始化，不过也保证了线程安全
 **/
public enum EnumInstance {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}

//这边是 对枚举 的 随便玩玩
//public enum EnumInstance {
//    INSTANCE{
//        @Override
//        protected void print() {
//            System.out.println("666");
//        }
//    },INSTANCE2{
//        @Override
//        protected void print() {
//            System.out.println(777);
//        }
//
//        //可以覆写本类的一些方法
//        public void show(){
//            System.out.println("no show");
//        }
//    };
//
//    //声明该方法使其可以被外部调用
//    protected abstract void print();
//
//    private Object data;
//
//    public Object getData() {
//        return data;
//    }
//
//    public void setData(Object data) {
//        this.data = data;
//    }
//
//    public static EnumInstance getInstance(){
//        return INSTANCE;
//    }
//
//    public void show(){
//        System.out.println("show yourself");
//    }
//}
