package com.lh.design.pattern.creational.abstractfactory;

/**
 * @Description:
 * @author LuoH
 * @date 2020/01/15
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        video.produce();
        article.produce();
    }
}
