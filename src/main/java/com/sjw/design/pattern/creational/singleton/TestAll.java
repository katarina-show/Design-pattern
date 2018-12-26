package com.sjw.design.pattern.creational.singleton;

import com.sjw.design.pattern.creational.singleton.threads.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: Irelia
 * @Date: 2018/11/23 22:43
 * @Description: 通用测试类
 **/
public class TestAll {

    //用于启动2个线程
    public void start2Threads(Runnable r){
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        System.out.println("2 threads start!");
    }


    //测试1：懒汉模式 --> 普通测试
    @Test
    public void lazySingleton(){
        LazySingleton lazySingleton1 = LazySingleton.getInstance1();
        LazySingleton lazySingleton2 = LazySingleton.getInstance1();
        System.out.println("end");
        Assert.assertEquals(lazySingleton1,lazySingleton2);
    }

    //测试2：懒汉模式 --> 多线程测试 --> 线程不安全
    //直接运行会发现对象有时相同有时不同
    //可以手动 多线程debug 干预到问题出现的位置，来发现其线程的不安全
    @Test
    public void lazySingletonThreads1(){
        start2Threads(new LazySingletonThreads1());
        System.out.println("end");
    }

    //测试3：懒汉模式 --> 多线程测试 --> 线程安全
    //通过synchronized控制线程安全
    //可以 多线程debug 看结果
    @Test
    public void lazySingletonThreads2(){
        start2Threads(new LazySingletonThreads2());
        System.out.println("end");
    }

    //测试4：双检锁模式 --> 多线程测试 --> 线程安全
    //可以 多线程debug 看结果
    @Test
    public void doubleCheckSingletonThreads(){
        start2Threads(new LazyDoubleCheckSingletonThreads());
        System.out.println("end");
    }

    //测试5：静态内部类模式 --> 多线程测试 --> 线程安全
    @Test
    public void staticInnerClassSingletonThreads(){
        start2Threads(new StaticInnerClassSingletonThreads());
        System.out.println("end");
    }

    //测试6：序列化破坏单例对象（单例模式选择饿汉，其他模式也是异曲同工）
    //PS：实则底层还是反射破坏了对象，测试7手动证明
    @Test
    public void SerializableAttack() throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();
        //把这个对象序列化写进一个文件中，再取出来
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        //读取出来的对象，是通过反射产生的
        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println("end");
        System.out.println(instance);
        System.out.println(newInstance);

        Assert.assertEquals(instance,newInstance);
    }

    //测试7：反射对单例的破坏
    //通过在私有构造器内，写上判空方法直接抛出异常的方式，来防止反射调用（适用于饿汉、静态内部类）
    //懒汉和双检锁取决于，是先调用getInstance后反射还是先反射后调用getInstance顺序有关
    //也就是说，如果反射调用先发生，就会破坏单例，如果反射后发生，则会被手动抛出的异常捕获
    @Test
    public void invokeAttack() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //以下2种获取class方法任选其一，可以改成静态内部类
        Class objectClass = HungrySingleton.class;
        //Class<?> objectClass = Class.forName(HungrySingleton.class.getName());

        Constructor constructor = objectClass.getDeclaredConstructor();
        //突破private的权限控制
        constructor.setAccessible(true);
        //getInstance拿出的对象
        HungrySingleton instance = HungrySingleton.getInstance();
        //调用反射拿出的对象
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

        System.out.println("end");
        System.out.println(instance);
        System.out.println(newInstance);

        Assert.assertEquals(instance,newInstance);
    }

    //测试8：枚举防止序列化攻击
    @Test
    public void enumSerializableAttack() throws IOException, ClassNotFoundException {

        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        //ObjectInputStream对枚举的序列化实现，和普通类不同
        EnumInstance newInstance = (EnumInstance) ois.readObject();

        System.out.println("end");
        System.out.println(instance);
        System.out.println(newInstance);
        //比较其中的data
        System.out.println(instance.getData());
        System.out.println(newInstance.getData());

        Assert.assertEquals(instance,newInstance);
    }

    //测试9：枚举禁止反射调用
    @Test
    public void enumInvokeAttack() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = EnumInstance.class;

        //Enum类只有一个构造器
        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);

        //不允许反射 java.lang.IllegalArgumentException: Cannot reflectively create enum objects
        EnumInstance newInstance = (EnumInstance) constructor.newInstance("sjw",666);

        EnumInstance instance = EnumInstance.getInstance();

        System.out.println("end");
        System.out.println(instance);
        System.out.println(newInstance);

        Assert.assertEquals(instance,newInstance);
    }

    //测试10：容器单例模式 -->多线程测试 --> 线程不安全
    @Test
    public void containerThreads(){
        start2Threads(new ContainerSingletonThreads());
        System.out.println("end");
    }

    //测试11：ThreadLocal “单例”
    //加引号的意思是：对于同一个线程来说，可以保证其单例
    //一种以空间换时间的方式
    @Test
    public void ThreadLocalThreads(){
        //这里拿到的都是同一个对象，因为都是main线程下的
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());

        //由于是两个线程，所以对象自然不同
        //但对于某一线程来说，其后的取对象操作都是单例的
        start2Threads(new ThreadLocalThreads());
        System.out.println("end");
    }
}
