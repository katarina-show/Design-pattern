package com.sjw.design.principle.openclose;

/**
 * @Author: Irelia
 * @Date: 2018/11/18 16:50
 * @Description: Java课程实现课程接口，假设有很多其他课程如PythonCourse等也实现了此接口
 **/
public class JavaCourse implements ICourse {
    private Integer Id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }


}
