package com.lh.design.pattern.creational.simplefactory;

/**
 * @Description 简单工厂模式
 * @Author LuoH
 * @Date 2020-01-12 10:23
 */
public class Test {
    public static void main(String[] args) {
        /*
        //每次都依赖不同的类，不好
        Video video = new JavaVideo();
        video.produce();
         */

        //普通方法
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video == null){
//            return;
//        }
//        video.produce();

        //反射扩展后的方法
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null){
            return;
        }
        video.produce();
    }
}
