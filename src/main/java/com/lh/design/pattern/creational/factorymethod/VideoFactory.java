package com.lh.design.pattern.creational.factorymethod;

/**
 * Created by lh
 */
public abstract class VideoFactory {

    //只约定规范、契约，并不指定产生哪一类的video
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
