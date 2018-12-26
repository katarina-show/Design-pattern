package com.sjw.design.pattern.structural.adapter;

import java.io.*;

/**
 * @Author: Irelia
 * @Date: 2018/11/30 3:49
 * @Description: 虽然适配器模式有 “类适配” 和 “对象适配”
 * 但依据 组合/复用原则  我们应优先采用 “对象适配”
 * 场景：手机充电是5V直流电  插座上是220V交流电
 * 手机充电器（适配器） 就是为了把220V AC 转换成 5V DC
 **/
public class Test {

    public static void main(String[] args) throws IOException {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();



        //字节流 转为 字符流
        //InputStreamReader reader = new InputStreamReader(new FileInputStream("xxx"));

       // reader.read();

        //字符流 转为 字节流
        Writer writer = new OutputStreamWriter(new FileOutputStream(""));

        writer.write("1");

        char [] chars = new char[4];
        chars[0] = '1';
        chars[1] = '2';
        chars[2] = '烎';
        chars[3] = '3';

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        int a = (byte)456;
        System.out.println(a);
    }
}
