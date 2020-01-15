package com.lh.design.pattern.creational.abstractfactory;

/**
 * @Description:
 * @author LuoH
 * @date 2020/01/15
 */
public class JavaCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
