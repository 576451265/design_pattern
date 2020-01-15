package com.lh.design.pattern.creational.abstractfactory;

/**
 * @Description:
 * @author LuoH
 * @date 2020/01/15
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
