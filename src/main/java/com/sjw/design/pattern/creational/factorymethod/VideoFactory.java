package com.sjw.design.pattern.creational.factorymethod;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 18:21
 * @Description: 变成抽象方法和抽象类，使用接口也是可以的
 * 使用抽象类的原因是实际开发中可能有些方法是已知的，就可以直接写其实现了，如果都是未知的，抽象类和接口就没什么区别了
 **/
public abstract class VideoFactory {

    public abstract Video getVideo();

//    public Video getVideo(Class c){
//        Video video = null;
//        try {
//            video = (Video) Class.forName(c.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return video;
//    }
//
//
//    public Video getVideo(String type){
//        if("java".equalsIgnoreCase(type)){
//            return new JavaVideo();
//        }else if("python".equalsIgnoreCase(type)){
//            return new PythonVideo();
//        }
//        return null;
//    }

}
