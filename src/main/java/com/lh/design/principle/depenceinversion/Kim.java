package com.lh.design.principle.depenceinversion;

/**
 * @Description
 * @Author LuoH
 * @Date 2020-01-05 16:43
 */
public class Kim {
    /*
    //面向实现 经常改 实现比较差V1
    public void studyJavaCourse(){
        System.out.println("Kim 学java");
    }
    public void studyFECourse(){
        System.out.println("Kim 学FE");
    }
    public void studyPythonCourse(){
        System.out.println("Kim 学Python");
    }
    */

    private Course course;
    //V2
    public Kim(Course course) {
        this.course = course;
    }

    //public void studyCourse(Course course) {V2
    public void studyCourse() {
        course.studyCourse();
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
