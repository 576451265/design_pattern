package com.lh.design.pattern.creational.builder;

/**
 * @Description:
 * @author LuoH
 * @date 2020/01/16
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        //教练来创建这个课程 拿到需要的数据 注入一个courseBuilder
        Course course = coach.makeCourse("Java设计模式","ppt","视频","手记","问答");
        System.out.println(course);

    }
}
