package com.sjw.design.pattern.creational.simplefactory;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 16:59
 * @Description: 工厂类
 **/
public class VideoFactory {

    //v2
    public Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }//如果有新的，就需要不断加入else if的判断

        return null;
    }


    //v3
    //可以用反射来优化,这样的话这个工厂类和v2相比最大的好处就是不用修改本工厂类了
    public Video getVideoByCla(Class c){
       Video video = null;

        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
