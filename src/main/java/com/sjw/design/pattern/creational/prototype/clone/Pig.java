package com.sjw.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 2:54
 * @Description: Pig 实体类
 **/
public class Pig implements Cloneable{

    private String name;

    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //拿到一个clone出的对象
        Pig pig = (Pig)super.clone();

        //深克隆
        //克隆一个新的Date对象给克隆出的pig
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}'+super.toString();
    }
}
