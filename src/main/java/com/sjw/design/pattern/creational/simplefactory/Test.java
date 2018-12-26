package com.sjw.design.pattern.creational.simplefactory;

/**
 * @Author: Irelia
 * @Date: 2018/11/19 16:57
 * @Description: Test就是应用层/客户端
 **/
public class Test {

    public static void main(String[] args) {
        //v1
        /*Video video = new JavaVideo();
        video.produce();*/

        //v2
       /* VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if(video == null){
            return;
        }
        video.produce();*/

       //v3
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideoByCla(JavaVideo.class);
    }
}
