package com.lh.design.pattern.creational.builder.v2;

/**
 * @Description:
 * @author LuoH
 * @date 2020/01/16
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java设计模式").buildCoursePPT("ppt").buildCourseVideo("视频").build();
        System.out.println(course);
    }
}
